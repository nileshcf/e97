package com.cloudframe.app.mcsort02;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcsort02.file.records.Sys002IpmParmMasterRecord;
import com.cloudframe.app.mcsort02.dto.AcceptInput;
import com.cloudframe.app.mcsort02.file.records.OutRecord;
import com.cloudframe.app.mcsort02.file.records.Sys004IpmParmMasterRecord;
import com.cloudframe.app.mcsort02.file.records.SortRec;
import com.cloudframe.app.mcsort02.dto.Work;
import com.cloudframe.app.mcsort02.file.records.Sys005IpmParmMasterRecord;


@Context
public class Mcsort02Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AcceptInput acceptInput;
    Sys002IpmParmMasterRecord sys002IpmParmMasterRecord;
    SortRec sortRec;
    OutRecord outRecord;
    Sys004IpmParmMasterRecord sys004IpmParmMasterRecord;
    Sys005IpmParmMasterRecord sys005IpmParmMasterRecord;
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


    public AcceptInput getAcceptInput() {
        if (acceptInput == null) {
            acceptInput = new AcceptInput();
        }

        return acceptInput;
    }

    public void setAcceptInput(AcceptInput acceptInput) {
        this.acceptInput = acceptInput;
    }
    public Sys002IpmParmMasterRecord getSys002IpmParmMasterRecord() {
        if (sys002IpmParmMasterRecord == null) {
            sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        }

        return sys002IpmParmMasterRecord;
    }

    public void setSys002IpmParmMasterRecord(Sys002IpmParmMasterRecord sys002IpmParmMasterRecord) {
        this.sys002IpmParmMasterRecord = sys002IpmParmMasterRecord;
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
    public OutRecord getOutRecord() {
        if (outRecord == null) {
            outRecord = new OutRecord();
        }

        return outRecord;
    }

    public void setOutRecord(OutRecord outRecord) {
        this.outRecord = outRecord;
    }
    public Sys004IpmParmMasterRecord getSys004IpmParmMasterRecord() {
        if (sys004IpmParmMasterRecord == null) {
            sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        }

        return sys004IpmParmMasterRecord;
    }

    public void setSys004IpmParmMasterRecord(Sys004IpmParmMasterRecord sys004IpmParmMasterRecord) {
        this.sys004IpmParmMasterRecord = sys004IpmParmMasterRecord;
    }
    public Sys005IpmParmMasterRecord getSys005IpmParmMasterRecord() {
        if (sys005IpmParmMasterRecord == null) {
            sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        }

        return sys005IpmParmMasterRecord;
    }

    public void setSys005IpmParmMasterRecord(Sys005IpmParmMasterRecord sys005IpmParmMasterRecord) {
        this.sys005IpmParmMasterRecord = sys005IpmParmMasterRecord;
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
        str += acceptInput.hashCode();
        str += sys002IpmParmMasterRecord.hashCode();
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += sys004IpmParmMasterRecord.hashCode();
        str += sys005IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Mcsort02Ctx clone() {
        Mcsort02Ctx cloneObj = new Mcsort02Ctx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        cloneObj.sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        cloneObj.sys002IpmParmMasterRecord.set(sys002IpmParmMasterRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        cloneObj.sys004IpmParmMasterRecord.set(sys004IpmParmMasterRecord.getClonedField());
        cloneObj.sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        cloneObj.sys005IpmParmMasterRecord.set(sys005IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineOutCtx implements Cloneable {
     AcceptInput acceptInput = Mcsort02Ctx.this.getAcceptInput();

	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */   
	 public AcceptInput getAcceptInput() {
   	return acceptInput;
   }


	/**
	 *	Test condition "SYS002" for isSys002()
	 *	@return  Returns true if isSys002() is "SYS002"
	 */
   public boolean isSys002() throws CFException {
      return acceptInput.isSys002();
   }

	/**
	*  set values "SYS002"
	*/
   	public void setSys002True()  throws CFException{  			
    	acceptInput.setSys002True();
   	}
	/**
	 *	Test condition "SYS004" for isSys004()
	 *	@return  Returns true if isSys004() is "SYS004"
	 */
   public boolean isSys004() throws CFException {
      return acceptInput.isSys004();
   }

	/**
	*  set values "SYS004"
	*/
   	public void setSys004True()  throws CFException{  			
    	acceptInput.setSys004True();
   	}
	/**
	 *	Test condition "SYS005" for isSys005()
	 *	@return  Returns true if isSys005() is "SYS005"
	 */
   public boolean isSys005() throws CFException {
      return acceptInput.isSys005();
   }

	/**
	*  set values "SYS005"
	*/
   	public void setSys005True()  throws CFException{  			
    	acceptInput.setSys005True();
   	}

        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInput.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class SortSys002InCtx implements Cloneable {
     Sys002IpmParmMasterRecord sys002IpmParmMasterRecord = Mcsort02Ctx.this.getSys002IpmParmMasterRecord();
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys002IpmParmMasterRecord
	 *	@return sys002IpmParmMasterRecord
	 */   
	 public Sys002IpmParmMasterRecord getSys002IpmParmMasterRecord() {
   	return sys002IpmParmMasterRecord;
   }


	/**
	 *	Returns the value of sortTableKeyData
	 *	@return sortTableKeyData
	 */
   public char[] getSortTableKeyData() throws CFException  {              
   		return sortRec.getSortRec1().getSortTableKeyData();
   }

  
	/**
	*  set variable sortTableKeyData
	*  @param value
	**/
   public void setSortTableKeyData(char[] value) throws CFException {
      sortRec.getSortRec1().setSortTableKeyData(value);
   } 

     /**
	 * 	Update SortTableKeyData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableKeyData(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec1().setSortTableKeyData(source, sourceIndex);
   	
   }
   
   public void setSortTableKeyData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec1().setSortTableKeyData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortTableKeyData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableKeyData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableKeyData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortTableKeyData with another Field
	 *	@param value
	 */
   public void setSortTableKeyData(Field source) {
      sortRec.getSortRec1().setSortTableKeyData(source);
   }  
   
     /**
	 * 	Update SortTableKeyData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableKeyData(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec1().setSortTableKeyData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortTableKeyData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableKeyData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableKeyData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


	/**
	 *	Returns the value of sortTableId
	 *	@return sortTableId
	 */
   public char[] getSortTableId() throws CFException  {              
   		return sortRec.getSortRec1().getSortTableId();
   }

  
	/**
	*  set variable sortTableId
	*  @param value
	**/
   public void setSortTableId(char[] value) throws CFException {
      sortRec.getSortRec1().setSortTableId(value);
   } 

     /**
	 * 	Update SortTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableId(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec1().setSortTableId(source, sourceIndex);
   	
   }
   
   public void setSortTableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec1().setSortTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortTableId with another Field
	 *	@param value
	 */
   public void setSortTableId(Field source) {
      sortRec.getSortRec1().setSortTableId(source);
   }  
   
     /**
	 * 	Update SortTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableId(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec1().setSortTableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortTableEffDate
	 *	@return sortTableEffDate
	 */
   public char[] getSortTableEffDate() throws CFException  {              
   		return sortRec.getSortRec1().getSortTableEffDate();
   }

  
	/**
	*  set variable sortTableEffDate
	*  @param value
	**/
   public void setSortTableEffDate(char[] value) throws CFException {
      sortRec.getSortRec1().setSortTableEffDate(value);
   } 

     /**
	 * 	Update SortTableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSortTableEffDate(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec1().setSortTableEffDate(source, sourceIndex);
   	
   }
   
   public void setSortTableEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec1().setSortTableEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SortTableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSortTableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SortTableEffDate with another Field
	 *	@param value
	 */
   public void setSortTableEffDate(Field source) {
      sortRec.getSortRec1().setSortTableEffDate(source);
   }  
   
     /**
	 * 	Update SortTableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSortTableEffDate(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec1().setSortTableEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SortTableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSortTableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec1().setSortTableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public SortSys002OutCtx getSortSys002OutCtx() {
            return new SortSys002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002IpmParmMasterRecord.hashCode();
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys002InCtx clone() {
        SortSys002InCtx cloneObj = new SortSys002InCtx();
        cloneObj.sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        cloneObj.sys002IpmParmMasterRecord.set(sys002IpmParmMasterRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys002InCtx getSortSys002InCtx() {
            return new SortSys002InCtx();
    }
     public class SortSys002OutCtx implements Cloneable {
     Sys002IpmParmMasterRecord sys002IpmParmMasterRecord = Mcsort02Ctx.this.getSys002IpmParmMasterRecord();
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys002Status
	 *	@return sys002Status
	 */
   public char[] getSys002Status() throws CFException  {              
   		return work.getSys002Status();
   }

  
	/**
	*  set variable sys002Status
	*  @param value
	**/
   public void setSys002Status(char[] value) throws CFException {
      work.setSys002Status(value);
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


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002IpmParmMasterRecord.hashCode();
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys002OutCtx clone() {
        SortSys002OutCtx cloneObj = new SortSys002OutCtx();
        cloneObj.sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        cloneObj.sys002IpmParmMasterRecord.set(sys002IpmParmMasterRecord.getClonedField());
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys002OutCtx getSortSys002OutCtx() {
            return new SortSys002OutCtx();
    }
     public class FormatSortRecInCtx implements Cloneable {
     Sys002IpmParmMasterRecord sys002IpmParmMasterRecord = Mcsort02Ctx.this.getSys002IpmParmMasterRecord();
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys002IpmParmMasterRecord
	 *	@return sys002IpmParmMasterRecord
	 */   
	 public Sys002IpmParmMasterRecord getSys002IpmParmMasterRecord() {
   	return sys002IpmParmMasterRecord;
   }


	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
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
        str += sys002IpmParmMasterRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRecInCtx clone() {
        FormatSortRecInCtx cloneObj = new FormatSortRecInCtx();
        cloneObj.sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        cloneObj.sys002IpmParmMasterRecord.set(sys002IpmParmMasterRecord.getClonedField());
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
     Sys002IpmParmMasterRecord sys002IpmParmMasterRecord = Mcsort02Ctx.this.getSys002IpmParmMasterRecord();
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys002IpmParmMasterRecord
	 *	@return sys002IpmParmMasterRecord
	 */   
	 public Sys002IpmParmMasterRecord getSys002IpmParmMasterRecord() {
   	return sys002IpmParmMasterRecord;
   }


	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
	}



	/**
	 *	Returns the value of sys002Status
	 *	@return sys002Status
	 */
   public char[] getSys002Status() throws CFException  {              
   		return work.getSys002Status();
   }

  
	/**
	*  set variable sys002Status
	*  @param value
	**/
   public void setSys002Status(char[] value) throws CFException {
      work.setSys002Status(value);
   } 

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002IpmParmMasterRecord.hashCode();
        str += sortRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRecOutCtx clone() {
        FormatSortRecOutCtx cloneObj = new FormatSortRecOutCtx();
        cloneObj.sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord();
        cloneObj.sys002IpmParmMasterRecord.set(sys002IpmParmMasterRecord.getClonedField());
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
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
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
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRecInCtx clone() {
        FormatOpRecInCtx cloneObj = new FormatOpRecInCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRecInCtx getFormatOpRecInCtx() {
            return new FormatOpRecInCtx();
    }
     public class FormatOpRecOutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

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
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRecOutCtx clone() {
        FormatOpRecOutCtx cloneObj = new FormatOpRecOutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRecOutCtx getFormatOpRecOutCtx() {
            return new FormatOpRecOutCtx();
    }
     public class SortSys004InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Sys004IpmParmMasterRecord sys004IpmParmMasterRecord = Mcsort02Ctx.this.getSys004IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sort4TableEffDate
	 *	@return sort4TableEffDate
	 */
   public char[] getSort4TableEffDate() throws CFException  {              
   		return sortRec.getSortRec4().getSort4TableEffDate();
   }

  
	/**
	*  set variable sort4TableEffDate
	*  @param value
	**/
   public void setSort4TableEffDate(char[] value) throws CFException {
      sortRec.getSortRec4().setSort4TableEffDate(value);
   } 

     /**
	 * 	Update Sort4TableEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4TableEffDate(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec4().setSort4TableEffDate(source, sourceIndex);
   	
   }
   
   public void setSort4TableEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec4().setSort4TableEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4TableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort4TableEffDate with another Field
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source) {
      sortRec.getSortRec4().setSort4TableEffDate(source);
   }  
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec4().setSort4TableEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort4TableEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4TableEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


	/**
	 *	Returns the value of sys004IpmParmMasterRecord
	 *	@return sys004IpmParmMasterRecord
	 */   
	 public Sys004IpmParmMasterRecord getSys004IpmParmMasterRecord() {
   	return sys004IpmParmMasterRecord;
   }


	/**
	 *	Returns the value of sort4TableId
	 *	@return sort4TableId
	 */
   public char[] getSort4TableId() throws CFException  {              
   		return sortRec.getSortRec4().getSort4TableId();
   }

  
	/**
	*  set variable sort4TableId
	*  @param value
	**/
   public void setSort4TableId(char[] value) throws CFException {
      sortRec.getSortRec4().setSort4TableId(value);
   } 

     /**
	 * 	Update Sort4TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4TableId(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec4().setSort4TableId(source, sourceIndex);
   	
   }
   
   public void setSort4TableId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec4().setSort4TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort4TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort4TableId with another Field
	 *	@param value
	 */
   public void setSort4TableId(Field source) {
      sortRec.getSortRec4().setSort4TableId(source);
   }  
   
     /**
	 * 	Update Sort4TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4TableId(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec4().setSort4TableId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort4TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sort4Key
	 *	@return sort4Key
	 */
   public char[] getSort4Key() throws CFException  {              
   		return sortRec.getSortRec4().getSort4Key();
   }

  
	/**
	*  set variable sort4Key
	*  @param value
	**/
   public void setSort4Key(char[] value) throws CFException {
      sortRec.getSortRec4().setSort4Key(value);
   } 

     /**
	 * 	Update Sort4Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSort4Key(char[] source, int sourceIndex) throws CFException {
      sortRec.getSortRec4().setSort4Key(source, sourceIndex);
   	
   }
   
   public void setSort4Key(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sortRec.getSortRec4().setSort4Key(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sort4Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSort4Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sort4Key with another Field
	 *	@param value
	 */
   public void setSort4Key(Field source) {
      sortRec.getSortRec4().setSort4Key(source);
   }  
   
     /**
	 * 	Update Sort4Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSort4Key(Field source, int sourceIndex,int sourceLen) {
      sortRec.getSortRec4().setSort4Key(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sort4Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSort4Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sortRec.getSortRec4().setSort4Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public SortSys004OutCtx getSortSys004OutCtx() {
            return new SortSys004OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += sys004IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys004InCtx clone() {
        SortSys004InCtx cloneObj = new SortSys004InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        cloneObj.sys004IpmParmMasterRecord.set(sys004IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys004InCtx getSortSys004InCtx() {
            return new SortSys004InCtx();
    }
     public class SortSys004OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Sys004IpmParmMasterRecord sys004IpmParmMasterRecord = Mcsort02Ctx.this.getSys004IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys004Status
	 *	@return sys004Status
	 */
   public char[] getSys004Status() throws CFException  {              
   		return work.getSys004Status();
   }

  
	/**
	*  set variable sys004Status
	*  @param value
	**/
   public void setSys004Status(char[] value) throws CFException {
      work.setSys004Status(value);
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


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += sys004IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys004OutCtx clone() {
        SortSys004OutCtx cloneObj = new SortSys004OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        cloneObj.sys004IpmParmMasterRecord.set(sys004IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys004OutCtx getSortSys004OutCtx() {
            return new SortSys004OutCtx();
    }
     public class FormatSortRec2001InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Sys004IpmParmMasterRecord sys004IpmParmMasterRecord = Mcsort02Ctx.this.getSys004IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
	}



	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sys004IpmParmMasterRecord
	 *	@return sys004IpmParmMasterRecord
	 */   
	 public Sys004IpmParmMasterRecord getSys004IpmParmMasterRecord() {
   	return sys004IpmParmMasterRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public FormatSortRec2001OutCtx getFormatSortRec2001OutCtx() {
            return new FormatSortRec2001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += sys004IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRec2001InCtx clone() {
        FormatSortRec2001InCtx cloneObj = new FormatSortRec2001InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        cloneObj.sys004IpmParmMasterRecord.set(sys004IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRec2001InCtx getFormatSortRec2001InCtx() {
            return new FormatSortRec2001InCtx();
    }
     public class FormatSortRec2001OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Sys004IpmParmMasterRecord sys004IpmParmMasterRecord = Mcsort02Ctx.this.getSys004IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys004Status
	 *	@return sys004Status
	 */
   public char[] getSys004Status() throws CFException  {              
   		return work.getSys004Status();
   }

  
	/**
	*  set variable sys004Status
	*  @param value
	**/
   public void setSys004Status(char[] value) throws CFException {
      work.setSys004Status(value);
   } 

	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
	}



	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
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
	 *	Returns the value of sys004IpmParmMasterRecord
	 *	@return sys004IpmParmMasterRecord
	 */   
	 public Sys004IpmParmMasterRecord getSys004IpmParmMasterRecord() {
   	return sys004IpmParmMasterRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += sys004IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRec2001OutCtx clone() {
        FormatSortRec2001OutCtx cloneObj = new FormatSortRec2001OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord();
        cloneObj.sys004IpmParmMasterRecord.set(sys004IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRec2001OutCtx getFormatSortRec2001OutCtx() {
            return new FormatSortRec2001OutCtx();
    }
     public class FormatOpRec2002InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public FormatOpRec2002OutCtx getFormatOpRec2002OutCtx() {
            return new FormatOpRec2002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRec2002InCtx clone() {
        FormatOpRec2002InCtx cloneObj = new FormatOpRec2002InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRec2002InCtx getFormatOpRec2002InCtx() {
            return new FormatOpRec2002InCtx();
    }
     public class FormatOpRec2002OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

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
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRec2002OutCtx clone() {
        FormatOpRec2002OutCtx cloneObj = new FormatOpRec2002OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRec2002OutCtx getFormatOpRec2002OutCtx() {
            return new FormatOpRec2002OutCtx();
    }
     public class SortSys005InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Sys005IpmParmMasterRecord sys005IpmParmMasterRecord = Mcsort02Ctx.this.getSys005IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

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
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
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
	 *	Returns the value of sys005IpmParmMasterRecord
	 *	@return sys005IpmParmMasterRecord
	 */   
	 public Sys005IpmParmMasterRecord getSys005IpmParmMasterRecord() {
   	return sys005IpmParmMasterRecord;
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


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public SortSys005OutCtx getSortSys005OutCtx() {
            return new SortSys005OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += sys005IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys005InCtx clone() {
        SortSys005InCtx cloneObj = new SortSys005InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        cloneObj.sys005IpmParmMasterRecord.set(sys005IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys005InCtx getSortSys005InCtx() {
            return new SortSys005InCtx();
    }
     public class SortSys005OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Sys005IpmParmMasterRecord sys005IpmParmMasterRecord = Mcsort02Ctx.this.getSys005IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sys005Status
	 *	@return sys005Status
	 */
   public char[] getSys005Status() throws CFException  {              
   		return work.getSys005Status();
   }

  
	/**
	*  set variable sys005Status
	*  @param value
	**/
   public void setSys005Status(char[] value) throws CFException {
      work.setSys005Status(value);
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


        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += sys005IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SortSys005OutCtx clone() {
        SortSys005OutCtx cloneObj = new SortSys005OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        cloneObj.sys005IpmParmMasterRecord.set(sys005IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SortSys005OutCtx getSortSys005OutCtx() {
            return new SortSys005OutCtx();
    }
     public class FormatSortRec3001InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Sys005IpmParmMasterRecord sys005IpmParmMasterRecord = Mcsort02Ctx.this.getSys005IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
	}



	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of sys005IpmParmMasterRecord
	 *	@return sys005IpmParmMasterRecord
	 */   
	 public Sys005IpmParmMasterRecord getSys005IpmParmMasterRecord() {
   	return sys005IpmParmMasterRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public FormatSortRec3001OutCtx getFormatSortRec3001OutCtx() {
            return new FormatSortRec3001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += sys005IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRec3001InCtx clone() {
        FormatSortRec3001InCtx cloneObj = new FormatSortRec3001InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        cloneObj.sys005IpmParmMasterRecord.set(sys005IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRec3001InCtx getFormatSortRec3001InCtx() {
            return new FormatSortRec3001InCtx();
    }
     public class FormatSortRec3001OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     Sys005IpmParmMasterRecord sys005IpmParmMasterRecord = Mcsort02Ctx.this.getSys005IpmParmMasterRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of ipmRdw410
	 *	@return ipmRdw410
	 */
	public long getIpmRdw410() throws CFException {        
   		return work.getIpmRdw410();
	}
	
	/**
	 * 	Update IpmRdw410 with the passed value
	 *	@param number
	 */
	public void setIpmRdw410(long number)  throws CFException{
		work.setIpmRdw410(number);
	}



	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
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
	 *	Returns the value of sys005Status
	 *	@return sys005Status
	 */
   public char[] getSys005Status() throws CFException  {              
   		return work.getSys005Status();
   }

  
	/**
	*  set variable sys005Status
	*  @param value
	**/
   public void setSys005Status(char[] value) throws CFException {
      work.setSys005Status(value);
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
	 *	Returns the value of sys005IpmParmMasterRecord
	 *	@return sys005IpmParmMasterRecord
	 */   
	 public Sys005IpmParmMasterRecord getSys005IpmParmMasterRecord() {
   	return sys005IpmParmMasterRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += sys005IpmParmMasterRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatSortRec3001OutCtx clone() {
        FormatSortRec3001OutCtx cloneObj = new FormatSortRec3001OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord();
        cloneObj.sys005IpmParmMasterRecord.set(sys005IpmParmMasterRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatSortRec3001OutCtx getFormatSortRec3001OutCtx() {
            return new FormatSortRec3001OutCtx();
    }
     public class FormatOpRec3002InCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

	/**
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
   }


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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }

        public FormatOpRec3002OutCtx getFormatOpRec3002OutCtx() {
            return new FormatOpRec3002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRec3002InCtx clone() {
        FormatOpRec3002InCtx cloneObj = new FormatOpRec3002InCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRec3002InCtx getFormatOpRec3002InCtx() {
            return new FormatOpRec3002InCtx();
    }
     public class FormatOpRec3002OutCtx implements Cloneable {
     SortRec sortRec = Mcsort02Ctx.this.getSortRec();
     OutRecord outRecord = Mcsort02Ctx.this.getOutRecord();
     Work work = Mcsort02Ctx.this.getWork();

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
	 *	Returns the value of sortRec
	 *	@return sortRec
	 */   
	 public SortRec getSortRec() {
   	return sortRec;
   }


	/**
	 *	Returns the value of outRecord
	 *	@return outRecord
	 */   
	 public OutRecord getOutRecord() {
   	return outRecord;
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




        public Mcsort02Ctx getMcsort02Ctx() {
            return Mcsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sortRec.hashCode();
        str += outRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FormatOpRec3002OutCtx clone() {
        FormatOpRec3002OutCtx cloneObj = new FormatOpRec3002OutCtx();
        cloneObj.sortRec = new SortRec();
        cloneObj.sortRec.set(sortRec.getClonedField());
        cloneObj.outRecord = new OutRecord();
        cloneObj.outRecord.set(outRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatOpRec3002OutCtx getFormatOpRec3002OutCtx() {
            return new FormatOpRec3002OutCtx();
    }
}
