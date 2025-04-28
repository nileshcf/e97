package com.cloudframe.app.sf328010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sf328010.dto.Work;
import com.cloudframe.app.sf328010.dto.Sf535ZlogServiceEntry;
import com.cloudframe.app.sf328010.dto.HeaderLine1701;
import com.cloudframe.app.sf328010.dto.HighServiceTime800;
import com.cloudframe.app.sf328010.dto.HeaderLine2702;
import com.cloudframe.app.sf328010.dto.LowServiceTime800;
import com.cloudframe.app.sf328010.dto.Sf528ExtractZLogRec;
import com.cloudframe.app.sf328010.dto.Message6008001;
import com.cloudframe.app.sf328010.dto.CurrentRunMsg600;
import com.cloudframe.app.sf328010.dto.Message6008002;
import com.cloudframe.app.sf328010.dto.DetailData705;
import com.cloudframe.app.sf328010.file.records.Group1;
import com.cloudframe.app.sf328010.dto.FuncWhenCompiled800;
import com.cloudframe.app.sf328010.dto.Sf535ZlogServiceTable;
import com.cloudframe.app.sf328010.dto.Sf535ZlogServicesGroup;
import com.cloudframe.app.sf328010.dto.CompileInfoMsg600;
import com.cloudframe.app.sf328010.file.records.Sys201ServiceRptRec;
import com.cloudframe.app.sf328010.dto.DetailData1705;
import com.cloudframe.app.sf328010.dto.DetailData2705;
import com.cloudframe.app.sf328010.dto.FuncCurrentDate800;


@Context
public class Sf328010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    CompileInfoMsg600 compileInfoMsg600;
    Message6008001 message6008001;
    HighServiceTime800 highServiceTime800;
    HeaderLine2702 headerLine2702;
    LowServiceTime800 lowServiceTime800;
    HeaderLine1701 headerLine1701;
    CurrentRunMsg600 currentRunMsg600;
    Message6008002 message6008002;
    DetailData1705 detailData1705;
    DetailData705 detailData705;
    Sys201ServiceRptRec sys201ServiceRptRec;
    Sf528ExtractZLogRec sf528ExtractZLogRec;
    FuncCurrentDate800 funcCurrentDate800;
    Sf535ZlogServicesGroup sf535ZlogServicesGroup;
    DetailData2705 detailData2705;
    Work work;
    FuncWhenCompiled800 funcWhenCompiled800;
    Group1 group1;

    int sf535X;

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


    public CompileInfoMsg600 getCompileInfoMsg600() {
        if (compileInfoMsg600 == null) {
            compileInfoMsg600 = new CompileInfoMsg600();
        }

        return compileInfoMsg600;
    }

    public void setCompileInfoMsg600(CompileInfoMsg600 compileInfoMsg600) {
        this.compileInfoMsg600 = compileInfoMsg600;
    }
    public Message6008001 getMessage6008001() {
        if (message6008001 == null) {
            message6008001 = new Message6008001();
        }

        return message6008001;
    }

    public void setMessage6008001(Message6008001 message6008001) {
        this.message6008001 = message6008001;
    }
    public HighServiceTime800 getHighServiceTime800() {
        if (highServiceTime800 == null) {
            highServiceTime800 = new HighServiceTime800();
        }

        return highServiceTime800;
    }

    public void setHighServiceTime800(HighServiceTime800 highServiceTime800) {
        this.highServiceTime800 = highServiceTime800;
    }
    public HeaderLine2702 getHeaderLine2702() {
        if (headerLine2702 == null) {
            headerLine2702 = new HeaderLine2702();
        }

        return headerLine2702;
    }

    public void setHeaderLine2702(HeaderLine2702 headerLine2702) {
        this.headerLine2702 = headerLine2702;
    }
    public LowServiceTime800 getLowServiceTime800() {
        if (lowServiceTime800 == null) {
            lowServiceTime800 = new LowServiceTime800();
        }

        return lowServiceTime800;
    }

    public void setLowServiceTime800(LowServiceTime800 lowServiceTime800) {
        this.lowServiceTime800 = lowServiceTime800;
    }
    public HeaderLine1701 getHeaderLine1701() {
        if (headerLine1701 == null) {
            headerLine1701 = new HeaderLine1701();
        }

        return headerLine1701;
    }

    public void setHeaderLine1701(HeaderLine1701 headerLine1701) {
        this.headerLine1701 = headerLine1701;
    }
    public CurrentRunMsg600 getCurrentRunMsg600() {
        if (currentRunMsg600 == null) {
            currentRunMsg600 = new CurrentRunMsg600();
        }

        return currentRunMsg600;
    }

    public void setCurrentRunMsg600(CurrentRunMsg600 currentRunMsg600) {
        this.currentRunMsg600 = currentRunMsg600;
    }
    public Message6008002 getMessage6008002() {
        if (message6008002 == null) {
            message6008002 = new Message6008002();
        }

        return message6008002;
    }

    public void setMessage6008002(Message6008002 message6008002) {
        this.message6008002 = message6008002;
    }
    public DetailData1705 getDetailData1705() {
        if (detailData1705 == null) {
            detailData1705 = new DetailData1705();
        }

        return detailData1705;
    }

    public void setDetailData1705(DetailData1705 detailData1705) {
        this.detailData1705 = detailData1705;
    }
    public DetailData705 getDetailData705() {
        if (detailData705 == null) {
            detailData705 = new DetailData705();
        }

        return detailData705;
    }

    public void setDetailData705(DetailData705 detailData705) {
        this.detailData705 = detailData705;
    }
    public Sys201ServiceRptRec getSys201ServiceRptRec() {
        if (sys201ServiceRptRec == null) {
            sys201ServiceRptRec = new Sys201ServiceRptRec();
        }

        return sys201ServiceRptRec;
    }

    public void setSys201ServiceRptRec(Sys201ServiceRptRec sys201ServiceRptRec) {
        this.sys201ServiceRptRec = sys201ServiceRptRec;
    }
    public Sf528ExtractZLogRec getSf528ExtractZLogRec() {
        if (sf528ExtractZLogRec == null) {
            sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        }

        return sf528ExtractZLogRec;
    }

    public void setSf528ExtractZLogRec(Sf528ExtractZLogRec sf528ExtractZLogRec) {
        this.sf528ExtractZLogRec = sf528ExtractZLogRec;
    }
    public FuncCurrentDate800 getFuncCurrentDate800() {
        if (funcCurrentDate800 == null) {
            funcCurrentDate800 = new FuncCurrentDate800();
        }

        return funcCurrentDate800;
    }

    public void setFuncCurrentDate800(FuncCurrentDate800 funcCurrentDate800) {
        this.funcCurrentDate800 = funcCurrentDate800;
    }
    public Sf535ZlogServicesGroup getSf535ZlogServicesGroup() {
        if (sf535ZlogServicesGroup == null) {
            sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        }

        return sf535ZlogServicesGroup;
    }

    public void setSf535ZlogServicesGroup(Sf535ZlogServicesGroup sf535ZlogServicesGroup) {
        this.sf535ZlogServicesGroup = sf535ZlogServicesGroup;
    }
    public DetailData2705 getDetailData2705() {
        if (detailData2705 == null) {
            detailData2705 = new DetailData2705();
        }

        return detailData2705;
    }

    public void setDetailData2705(DetailData2705 detailData2705) {
        this.detailData2705 = detailData2705;
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
    public FuncWhenCompiled800 getFuncWhenCompiled800() {
        if (funcWhenCompiled800 == null) {
            funcWhenCompiled800 = new FuncWhenCompiled800();
        }

        return funcWhenCompiled800;
    }

    public void setFuncWhenCompiled800(FuncWhenCompiled800 funcWhenCompiled800) {
        this.funcWhenCompiled800 = funcWhenCompiled800;
    }
    public Group1 getGroup1() {
        if (group1 == null) {
            group1 = new Group1();
        }

        return group1;
    }

    public void setGroup1(Group1 group1) {
        this.group1 = group1;
    }

    public int getSf535X() {
        return sf535X;
    }

    public void setSf535X(int sf535X) {
        this.sf535X = sf535X;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += compileInfoMsg600.hashCode();
        str += message6008001.hashCode();
        str += highServiceTime800.hashCode();
        str += headerLine2702.hashCode();
        str += lowServiceTime800.hashCode();
        str += headerLine1701.hashCode();
        str += currentRunMsg600.hashCode();
        str += message6008002.hashCode();
        str += detailData1705.hashCode();
        str += detailData705.hashCode();
        str += sys201ServiceRptRec.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += funcCurrentDate800.hashCode();
        str += sf535ZlogServicesGroup.hashCode();
        str += detailData2705.hashCode();
        str += work.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += group1.hashCode();
       return str.hashCode();
    }

    public Sf328010Ctx clone() {
        Sf328010Ctx cloneObj = new Sf328010Ctx();
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.headerLine1701 = new HeaderLine1701();
        cloneObj.headerLine1701.set(headerLine1701.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        cloneObj.detailData1705 = new DetailData1705();
        cloneObj.detailData1705.set(detailData1705.getClonedField());
        cloneObj.detailData705 = new DetailData705();
        cloneObj.detailData705.set(detailData705.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.detailData2705 = new DetailData2705();
        cloneObj.detailData2705.set(detailData2705.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isFirstRead88100()
	 *	@return  Returns true if isFirstRead88100() is "Y"
	 */
   public boolean isFirstRead88100() throws CFException {
      return work.isFirstRead88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setFirstRead88100True()  throws CFException{  			
    	work.setFirstRead88100True();
   	}
	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class InitializeProgramInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     Work work = Sf328010Ctx.this.getWork();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();

	/**
	 *	Returns the value of noInputData6000001
	 *	@return noInputData6000001
	 */
   public char[] getNoInputData6000001() throws CFException  {              
   		return work.getNoInputData6000001();
   }

  
	/**
	*  set variable noInputData6000001
	*  @param value
	**/
   public void setNoInputData6000001(char[] value) throws CFException {
      work.setNoInputData6000001(value);
   } 

	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public InitializeProgramOutCtx getInitializeProgramOutCtx() {
            return new InitializeProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += highServiceTime800.hashCode();
        str += work.hashCode();
        str += lowServiceTime800.hashCode();
       return str.hashCode();
    }

    public InitializeProgramInCtx clone() {
        InitializeProgramInCtx cloneObj = new InitializeProgramInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        return cloneObj;
    }

    }

    public InitializeProgramInCtx getInitializeProgramInCtx() {
            return new InitializeProgramInCtx();
    }
     public class InitializeProgramOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     Work work = Sf328010Ctx.this.getWork();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();

	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isNotFirstRead88100()
	 *	@return  Returns true if isNotFirstRead88100() is "N"
	 */
   public boolean isNotFirstRead88100() throws CFException {
      return work.isNotFirstRead88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNotFirstRead88100True()  throws CFException{  			
    	work.setNotFirstRead88100True();
   	}
	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += highServiceTime800.hashCode();
        str += work.hashCode();
        str += lowServiceTime800.hashCode();
       return str.hashCode();
    }

    public InitializeProgramOutCtx clone() {
        InitializeProgramOutCtx cloneObj = new InitializeProgramOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        return cloneObj;
    }

    }

    public InitializeProgramOutCtx getInitializeProgramOutCtx() {
            return new InitializeProgramOutCtx();
    }
     public class BuildBegJobMsgsInCtx implements Cloneable {
     CompileInfoMsg600 compileInfoMsg600 = Sf328010Ctx.this.getCompileInfoMsg600();
     FuncCurrentDate800 funcCurrentDate800 = Sf328010Ctx.this.getFuncCurrentDate800();
     Work work = Sf328010Ctx.this.getWork();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf328010Ctx.this.getFuncWhenCompiled800();
     CurrentRunMsg600 currentRunMsg600 = Sf328010Ctx.this.getCurrentRunMsg600();
     HeaderLine1701 headerLine1701 = Sf328010Ctx.this.getHeaderLine1701();

	/**
	 *	Returns the value of compileInfoMsg600
	 *	@return compileInfoMsg600
	 */   
	 public CompileInfoMsg600 getCompileInfoMsg600() {
   	return compileInfoMsg600;
   }


	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of execStartMsg600
	 *	@return execStartMsg600
	 */
   public char[] getExecStartMsg600() throws CFException  {              
   		return work.getExecStartMsg600();
   }

  
	/**
	*  set variable execStartMsg600
	*  @param value
	**/
   public void setExecStartMsg600(char[] value) throws CFException {
      work.setExecStartMsg600(value);
   } 

	/**
	 *	Returns the value of currentRunMsg600
	 *	@return currentRunMsg600
	 */   
	 public CurrentRunMsg600 getCurrentRunMsg600() {
   	return currentRunMsg600;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public BuildBegJobMsgsOutCtx getBuildBegJobMsgsOutCtx() {
            return new BuildBegJobMsgsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += compileInfoMsg600.hashCode();
        str += funcCurrentDate800.hashCode();
        str += work.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += currentRunMsg600.hashCode();
        str += headerLine1701.hashCode();
       return str.hashCode();
    }

    public BuildBegJobMsgsInCtx clone() {
        BuildBegJobMsgsInCtx cloneObj = new BuildBegJobMsgsInCtx();
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.headerLine1701 = new HeaderLine1701();
        cloneObj.headerLine1701.set(headerLine1701.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegJobMsgsInCtx getBuildBegJobMsgsInCtx() {
            return new BuildBegJobMsgsInCtx();
    }
     public class BuildBegJobMsgsOutCtx implements Cloneable {
     FuncCurrentDate800 funcCurrentDate800 = Sf328010Ctx.this.getFuncCurrentDate800();
     CompileInfoMsg600 compileInfoMsg600 = Sf328010Ctx.this.getCompileInfoMsg600();
     Work work = Sf328010Ctx.this.getWork();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf328010Ctx.this.getFuncWhenCompiled800();
     CurrentRunMsg600 currentRunMsg600 = Sf328010Ctx.this.getCurrentRunMsg600();
     HeaderLine1701 headerLine1701 = Sf328010Ctx.this.getHeaderLine1701();

	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeHh600();
   }

  
	/**
	*  set variable currTimeHh600
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(value);
   } 

     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh600 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source);
   }  
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateDd600();
   }

  
	/**
	*  set variable currDateDd600
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(value);
   } 

     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd600 with another Field
	 *	@param value
	 */
   public void setCurrDateDd600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source);
   }  
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runYear701
	 *	@return runYear701
	 */
   public char[] getRunYear701() throws CFException  {              
   		return headerLine1701.getRunYear701();
   }

  
	/**
	*  set variable runYear701
	*  @param value
	**/
   public void setRunYear701(char[] value) throws CFException {
      headerLine1701.setRunYear701(value);
   } 

     /**
	 * 	Update RunYear701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunYear701(char[] source, int sourceIndex) throws CFException {
      headerLine1701.setRunYear701(source, sourceIndex);
   	
   }
   
   public void setRunYear701(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerLine1701.setRunYear701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunYear701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunYear701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunYear701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunYear701 with another Field
	 *	@param value
	 */
   public void setRunYear701(Field source) {
      headerLine1701.setRunYear701(source);
   }  
   
     /**
	 * 	Update RunYear701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunYear701(Field source, int sourceIndex,int sourceLen) {
      headerLine1701.setRunYear701(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunYear701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunYear701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunYear701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mnthMmNum100
	 *	@return mnthMmNum100
	 */
   public char[] getMnthMmNum100() throws CFException  {              
   		return work.getMnthMmNum100();
   }

  
	/**
	*  set variable mnthMmNum100
	*  @param value
	**/
   public void setMnthMmNum100(char[] value) throws CFException {
      work.setMnthMmNum100(value);
   } 

	/**
	 *	Returns the value of runMonth701
	 *	@return runMonth701
	 */
   public char[] getRunMonth701() throws CFException  {              
   		return headerLine1701.getRunMonth701();
   }

  
	/**
	*  set variable runMonth701
	*  @param value
	**/
   public void setRunMonth701(char[] value) throws CFException {
      headerLine1701.setRunMonth701(value);
   } 

     /**
	 * 	Update RunMonth701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunMonth701(char[] source, int sourceIndex) throws CFException {
      headerLine1701.setRunMonth701(source, sourceIndex);
   	
   }
   
   public void setRunMonth701(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerLine1701.setRunMonth701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunMonth701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunMonth701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunMonth701 with another Field
	 *	@param value
	 */
   public void setRunMonth701(Field source) {
      headerLine1701.setRunMonth701(source);
   }  
   
     /**
	 * 	Update RunMonth701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunMonth701(Field source, int sourceIndex,int sourceLen) {
      headerLine1701.setRunMonth701(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunMonth701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunMonth701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runDate701
	 *	@return runDate701
	 */
   public char[] getRunDate701() throws CFException  {              
   		return headerLine1701.getRunDate701();
   }

  
	/**
	*  set variable runDate701
	*  @param value
	**/
   public void setRunDate701(char[] value) throws CFException {
      headerLine1701.setRunDate701(value);
   } 

     /**
	 * 	Update RunDate701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate701(char[] source, int sourceIndex) throws CFException {
      headerLine1701.setRunDate701(source, sourceIndex);
   	
   }
   
   public void setRunDate701(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerLine1701.setRunDate701(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunDate701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunDate701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunDate701 with another Field
	 *	@param value
	 */
   public void setRunDate701(Field source) {
      headerLine1701.setRunDate701(source);
   }  
   
     /**
	 * 	Update RunDate701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate701(Field source, int sourceIndex,int sourceLen) {
      headerLine1701.setRunDate701(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunDate701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine1701.setRunDate701(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeHh800
	 *	@return whenTimeHh800
	 */
   public char[] getWhenTimeHh800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeHh800();
   }

  
	/**
	*  set variable whenTimeHh800
	*  @param value
	**/
   public void setWhenTimeHh800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(value);
   } 

     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeHh800 with another Field
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source);
   }  
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeHh600
	 *	@return compTimeHh600
	 */
   public char[] getCompTimeHh600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeHh600();
   }

  
	/**
	*  set variable compTimeHh600
	*  @param value
	**/
   public void setCompTimeHh600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(value);
   } 

     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCompTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeHh600 with another Field
	 *	@param value
	 */
   public void setCompTimeHh600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source);
   }  
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateDd800
	 *	@return currDateDd800
	 */
   public char[] getCurrDateDd800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateDd800();
   }

  
	/**
	*  set variable currDateDd800
	*  @param value
	**/
   public void setCurrDateDd800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(value);
   } 

     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd800 with another Field
	 *	@param value
	 */
   public void setCurrDateDd800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source);
   }  
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateYyyy800
	 *	@return whenDateYyyy800
	 */
   public char[] getWhenDateYyyy800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateYyyy800();
   }

  
	/**
	*  set variable whenDateYyyy800
	*  @param value
	**/
   public void setWhenDateYyyy800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(value);
   } 

     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setWhenDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateYyyy800 with another Field
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source);
   }  
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateMm600();
   }

  
	/**
	*  set variable currDateMm600
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(value);
   } 

     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm600 with another Field
	 *	@param value
	 */
   public void setCurrDateMm600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source);
   }  
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateYyyy600
	 *	@return compDateYyyy600
	 */
   public char[] getCompDateYyyy600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateYyyy600();
   }

  
	/**
	*  set variable compDateYyyy600
	*  @param value
	**/
   public void setCompDateYyyy600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(value);
   } 

     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCompDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source);
   }  
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeSs800
	 *	@return whenTimeSs800
	 */
   public char[] getWhenTimeSs800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeSs800();
   }

  
	/**
	*  set variable whenTimeSs800
	*  @param value
	**/
   public void setWhenTimeSs800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(value);
   } 

     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeSs800 with another Field
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source);
   }  
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcWhenCompiled800
	 *	@return funcWhenCompiled800
	 */   
	 public FuncWhenCompiled800 getFuncWhenCompiled800() {
   	return funcWhenCompiled800;
   }


	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeSs600();
   }

  
	/**
	*  set variable currTimeSs600
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(value);
   } 

     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs600 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source);
   }  
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateYyyy800
	 *	@return currDateYyyy800
	 */
   public char[] getCurrDateYyyy800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateYyyy800();
   }

  
	/**
	*  set variable currDateYyyy800
	*  @param value
	**/
   public void setCurrDateYyyy800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(value);
   } 

     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy800 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeMm600();
   }

  
	/**
	*  set variable currTimeMm600
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(value);
   } 

     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm600 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source);
   }  
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateDd600
	 *	@return compDateDd600
	 */
   public char[] getCompDateDd600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateDd600();
   }

  
	/**
	*  set variable compDateDd600
	*  @param value
	**/
   public void setCompDateDd600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(value);
   } 

     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex);
   	
   }
   
   public void setCompDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateDd600 with another Field
	 *	@param value
	 */
   public void setCompDateDd600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source);
   }  
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeMm800
	 *	@return whenTimeMm800
	 */
   public char[] getWhenTimeMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeMm800();
   }

  
	/**
	*  set variable whenTimeMm800
	*  @param value
	**/
   public void setWhenTimeMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(value);
   } 

     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeMm800 with another Field
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source);
   }  
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeMm600
	 *	@return compTimeMm600
	 */
   public char[] getCompTimeMm600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeMm600();
   }

  
	/**
	*  set variable compTimeMm600
	*  @param value
	**/
   public void setCompTimeMm600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(value);
   } 

     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCompTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeMm600 with another Field
	 *	@param value
	 */
   public void setCompTimeMm600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source);
   }  
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateYyyy600();
   }

  
	/**
	*  set variable currDateYyyy600
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(value);
   } 

     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateMm800
	 *	@return whenDateMm800
	 */
   public char[] getWhenDateMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateMm800();
   }

  
	/**
	*  set variable whenDateMm800
	*  @param value
	**/
   public void setWhenDateMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(value);
   } 

     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex);
   	
   }
   
   public void setWhenDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateMm800 with another Field
	 *	@param value
	 */
   public void setWhenDateMm800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source);
   }  
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateDd800
	 *	@return whenDateDd800
	 */
   public char[] getWhenDateDd800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateDd800();
   }

  
	/**
	*  set variable whenDateDd800
	*  @param value
	**/
   public void setWhenDateDd800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(value);
   } 

     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex);
   	
   }
   
   public void setWhenDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateDd800 with another Field
	 *	@param value
	 */
   public void setWhenDateDd800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source);
   }  
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcCurrentDate800
	 *	@return funcCurrentDate800
	 */   
	 public FuncCurrentDate800 getFuncCurrentDate800() {
   	return funcCurrentDate800;
   }


	/**
	 *	Returns the value of compTimeSs600
	 *	@return compTimeSs600
	 */
   public char[] getCompTimeSs600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeSs600();
   }

  
	/**
	*  set variable compTimeSs600
	*  @param value
	**/
   public void setCompTimeSs600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(value);
   } 

     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCompTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeSs600 with another Field
	 *	@param value
	 */
   public void setCompTimeSs600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source);
   }  
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of compDateMm600
	 *	@return compDateMm600
	 */
   public char[] getCompDateMm600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateMm600();
   }

  
	/**
	*  set variable compDateMm600
	*  @param value
	**/
   public void setCompDateMm600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(value);
   } 

     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex);
   	
   }
   
   public void setCompDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateMm600 with another Field
	 *	@param value
	 */
   public void setCompDateMm600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source);
   }  
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateMm800
	 *	@return currDateMm800
	 */
   public char[] getCurrDateMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateMm800();
   }

  
	/**
	*  set variable currDateMm800
	*  @param value
	**/
   public void setCurrDateMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(value);
   } 

     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm800 with another Field
	 *	@param value
	 */
   public void setCurrDateMm800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source);
   }  
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += funcCurrentDate800.hashCode();
        str += compileInfoMsg600.hashCode();
        str += work.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += currentRunMsg600.hashCode();
        str += headerLine1701.hashCode();
       return str.hashCode();
    }

    public BuildBegJobMsgsOutCtx clone() {
        BuildBegJobMsgsOutCtx cloneObj = new BuildBegJobMsgsOutCtx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.headerLine1701 = new HeaderLine1701();
        cloneObj.headerLine1701.set(headerLine1701.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegJobMsgsOutCtx getBuildBegJobMsgsOutCtx() {
            return new BuildBegJobMsgsOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     Group1 group1 = Sf328010Ctx.this.getGroup1();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

	/**
	 *	Returns the value of group1
	 *	@return group1
	 */   
	 public Group1 getGroup1() {
   	return group1;
   }


	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += group1.hashCode();
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class SetupWorkAreaInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public SetupWorkAreaOutCtx getSetupWorkAreaOutCtx() {
            return new SetupWorkAreaOutCtx();
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
        str += headerLine2702.hashCode();
       return str.hashCode();
    }

    public SetupWorkAreaInCtx clone() {
        SetupWorkAreaInCtx cloneObj = new SetupWorkAreaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        return cloneObj;
    }

    }

    public SetupWorkAreaInCtx getSetupWorkAreaInCtx() {
            return new SetupWorkAreaInCtx();
    }
     public class SetupWorkAreaOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}



	/**
	 *	Test condition "Y" for isFirstRead88100()
	 *	@return  Returns true if isFirstRead88100() is "Y"
	 */
   public boolean isFirstRead88100() throws CFException {
      return work.isFirstRead88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setFirstRead88100True()  throws CFException{  			
    	work.setFirstRead88100True();
   	}
	/**
	 *	Returns the value of pageNum702
	 *	@return pageNum702
	 */
   public char[] getPageNum702() throws CFException  {              
   		return headerLine2702.getPageNum702();
   }

  
	/**
	*  set variable pageNum702
	*  @param value
	**/
   public void setPageNum702(char[] value) throws CFException {
      headerLine2702.setPageNum702(value);
   } 

     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex) throws CFException {
      headerLine2702.setPageNum702(source, sourceIndex);
   	
   }
   
   public void setPageNum702(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PageNum702 with another Field
	 *	@param value
	 */
   public void setPageNum702(Field source) {
      headerLine2702.setPageNum702(source);
   }  
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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
        str += headerLine2702.hashCode();
       return str.hashCode();
    }

    public SetupWorkAreaOutCtx clone() {
        SetupWorkAreaOutCtx cloneObj = new SetupWorkAreaOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        return cloneObj;
    }

    }

    public SetupWorkAreaOutCtx getSetupWorkAreaOutCtx() {
            return new SetupWorkAreaOutCtx();
    }
     public class BuildEmptyRptInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of emptyReport706
	 *	@return emptyReport706
	 */
   public char[] getEmptyReport706() throws CFException  {              
   		return work.getEmptyReport706();
   }

  
	/**
	*  set variable emptyReport706
	*  @param value
	**/
   public void setEmptyReport706(char[] value) throws CFException {
      work.setEmptyReport706(value);
   } 

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public BuildEmptyRptOutCtx getBuildEmptyRptOutCtx() {
            return new BuildEmptyRptOutCtx();
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
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public BuildEmptyRptInCtx clone() {
        BuildEmptyRptInCtx cloneObj = new BuildEmptyRptInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public BuildEmptyRptInCtx getBuildEmptyRptInCtx() {
            return new BuildEmptyRptInCtx();
    }
     public class BuildEmptyRptOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public BuildEmptyRptOutCtx clone() {
        BuildEmptyRptOutCtx cloneObj = new BuildEmptyRptOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public BuildEmptyRptOutCtx getBuildEmptyRptOutCtx() {
            return new BuildEmptyRptOutCtx();
    }
     public class ProcessZLogFileInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public ProcessZLogFileOutCtx getProcessZLogFileOutCtx() {
            return new ProcessZLogFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessZLogFileInCtx clone() {
        ProcessZLogFileInCtx cloneObj = new ProcessZLogFileInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessZLogFileInCtx getProcessZLogFileInCtx() {
            return new ProcessZLogFileInCtx();
    }
     public class ProcessZLogFileOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessZLogFileOutCtx clone() {
        ProcessZLogFileOutCtx cloneObj = new ProcessZLogFileOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessZLogFileOutCtx getProcessZLogFileOutCtx() {
            return new ProcessZLogFileOutCtx();
    }
     public class AccumulateDataInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getSumElapsedTime400() throws CFException {  
        return work.getSumElapsedTime400();
}
	/**
	 * 	Update SumElapsedTime400 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime400(long number)  throws CFException{
		work.setSumElapsedTime400(number);
	}



public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



	/**
	 *	Returns the value of sf528ServiceStatus
	 *	@return sf528ServiceStatus
	 */
   public char[] getSf528ServiceStatus() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceStatus();
   }

  
	/**
	*  set variable sf528ServiceStatus
	*  @param value
	**/
   public void setSf528ServiceStatus(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceStatus(value);
   } 

     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getHighElapseTime400() throws CFException {  
        return work.getHighElapseTime400();
}
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *	@param number
	 */
	public void setHighElapseTime400(int number)  throws CFException{
		work.setHighElapseTime400(number);
	}


	public void setHighElapseTime400(long number)  throws CFException{
	    work.setHighElapseTime400(number);
	}
	

public int getLowElapseTime400() throws CFException {  
        return work.getLowElapseTime400();
}
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *	@param number
	 */
	public void setLowElapseTime400(int number)  throws CFException{
		work.setLowElapseTime400(number);
	}


	public void setLowElapseTime400(long number)  throws CFException{
	    work.setLowElapseTime400(number);
	}
	

	/**
	 *	Returns the value of litC300
	 *	@return litC300
	 */
   public char[] getLitC300() throws CFException  {              
   		return work.getLitC300();
   }

  
	/**
	*  set variable litC300
	*  @param value
	**/
   public void setLitC300(char[] value) throws CFException {
      work.setLitC300(value);
   } 

public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public AccumulateDataOutCtx getAccumulateDataOutCtx() {
            return new AccumulateDataOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AccumulateDataInCtx clone() {
        AccumulateDataInCtx cloneObj = new AccumulateDataInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AccumulateDataInCtx getAccumulateDataInCtx() {
            return new AccumulateDataInCtx();
    }
     public class AccumulateDataOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

public long getSumElapsedTime400() throws CFException {  
        return work.getSumElapsedTime400();
}
	/**
	 * 	Update SumElapsedTime400 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime400(long number)  throws CFException{
		work.setSumElapsedTime400(number);
	}



public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



public int getHighElapseTime400() throws CFException {  
        return work.getHighElapseTime400();
}
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *	@param number
	 */
	public void setHighElapseTime400(int number)  throws CFException{
		work.setHighElapseTime400(number);
	}


	public void setHighElapseTime400(long number)  throws CFException{
	    work.setHighElapseTime400(number);
	}
	

public int getLowElapseTime400() throws CFException {  
        return work.getLowElapseTime400();
}
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *	@param number
	 */
	public void setLowElapseTime400(int number)  throws CFException{
		work.setLowElapseTime400(number);
	}


	public void setLowElapseTime400(long number)  throws CFException{
	    work.setLowElapseTime400(number);
	}
	

public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AccumulateDataOutCtx clone() {
        AccumulateDataOutCtx cloneObj = new AccumulateDataOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AccumulateDataOutCtx getAccumulateDataOutCtx() {
            return new AccumulateDataOutCtx();
    }
     public class CalculatePercentInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

public long getSumElapsedTime400() throws CFException {  
        return work.getSumElapsedTime400();
}
	/**
	 * 	Update SumElapsedTime400 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime400(long number)  throws CFException{
		work.setSumElapsedTime400(number);
	}



public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



	/**
	 *	Returns the value of num100300
	 *	@return num100300
	 */
	public short getNum100300() throws CFException {        
   		return work.getNum100300();
	}
	
	/**
	 * 	Update Num100300 with the passed value
	 *	@param number
	 */
	public void setNum100300(short number)  throws CFException{
		work.setNum100300(number);
	}

	public void setNum100300(int number)  throws CFException{
		work.setNum100300((short)number);
	}

	public void setNum100300(long number)  throws CFException{
		work.setNum100300((short)number);
	}



public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public CalculatePercentOutCtx getCalculatePercentOutCtx() {
            return new CalculatePercentOutCtx();
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

    public CalculatePercentInCtx clone() {
        CalculatePercentInCtx cloneObj = new CalculatePercentInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CalculatePercentInCtx getCalculatePercentInCtx() {
            return new CalculatePercentInCtx();
    }
     public class CalculatePercentOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

	public BigDecimal getSuccessPercent400() throws CFException{      
   		return work.getSuccessPercent400();
	}

    public char[] getSuccessPercent400String() throws CFException {
          return  work.getSuccessPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SuccessPercent400 with the passed number
	 *	@param number
	 */
	public void setSuccessPercent400(BigDecimal number)  throws CFException{
		work.setSuccessPercent400(number);
   }

	public BigDecimal getErrPercent400() throws CFException{      
   		return work.getErrPercent400();
	}

    public char[] getErrPercent400String() throws CFException {
          return  work.getErrPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ErrPercent400 with the passed number
	 *	@param number
	 */
	public void setErrPercent400(BigDecimal number)  throws CFException{
		work.setErrPercent400(number);
   }

	public BigDecimal getAvgElapsed400() throws CFException{      
   		return work.getAvgElapsed400();
	}

    public char[] getAvgElapsed400String() throws CFException {
          return  work.getAvgElapsed400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update AvgElapsed400 with the passed number
	 *	@param number
	 */
	public void setAvgElapsed400(BigDecimal number)  throws CFException{
		work.setAvgElapsed400(number);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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

    public CalculatePercentOutCtx clone() {
        CalculatePercentOutCtx cloneObj = new CalculatePercentOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CalculatePercentOutCtx getCalculatePercentOutCtx() {
            return new CalculatePercentOutCtx();
    }
     public class CalculateServiceDtTmInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();

	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public CalculateServiceDtTmOutCtx getCalculateServiceDtTmOutCtx() {
            return new CalculateServiceDtTmOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
       return str.hashCode();
    }

    public CalculateServiceDtTmInCtx clone() {
        CalculateServiceDtTmInCtx cloneObj = new CalculateServiceDtTmInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        return cloneObj;
    }

    }

    public CalculateServiceDtTmInCtx getCalculateServiceDtTmInCtx() {
            return new CalculateServiceDtTmInCtx();
    }
     public class CalculateServiceDtTmOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();

	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
       return str.hashCode();
    }

    public CalculateServiceDtTmOutCtx clone() {
        CalculateServiceDtTmOutCtx cloneObj = new CalculateServiceDtTmOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        return cloneObj;
    }

    }

    public CalculateServiceDtTmOutCtx getCalculateServiceDtTmOutCtx() {
            return new CalculateServiceDtTmOutCtx();
    }
     public class DisplayServiceDateInCtx implements Cloneable {
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     DetailData2705 detailData2705 = Sf328010Ctx.this.getDetailData2705();
     Work work = Sf328010Ctx.this.getWork();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

	/**
	 *	Returns the value of lserviceMins800
	 *	@return lserviceMins800
	 */
   public char[] getLserviceMins800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceMins800();
   }

  
	/**
	*  set variable lserviceMins800
	*  @param value
	**/
   public void setLserviceMins800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(value);
   } 

     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex);
   	
   }
   
   public void setLserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins800 with another Field
	 *	@param value
	 */
   public void setLserviceMins800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source);
   }  
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of lserviceMm800
	 *	@return lserviceMm800
	 */
   public char[] getLserviceMm800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceMm800();
   }

  
	/**
	*  set variable lserviceMm800
	*  @param value
	**/
   public void setLserviceMm800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(value);
   } 

     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex);
   	
   }
   
   public void setLserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMm800 with another Field
	 *	@param value
	 */
   public void setLserviceMm800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source);
   }  
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh800
	 *	@return lserviceHh800
	 */
   public char[] getLserviceHh800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceHh800();
   }

  
	/**
	*  set variable lserviceHh800
	*  @param value
	**/
   public void setLserviceHh800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(value);
   } 

     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex);
   	
   }
   
   public void setLserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh800 with another Field
	 *	@param value
	 */
   public void setLserviceHh800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source);
   }  
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMm800
	 *	@return hserviceMm800
	 */
   public char[] getHserviceMm800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceMm800();
   }

  
	/**
	*  set variable hserviceMm800
	*  @param value
	**/
   public void setHserviceMm800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(value);
   } 

     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex);
   	
   }
   
   public void setHserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMm800 with another Field
	 *	@param value
	 */
   public void setHserviceMm800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source);
   }  
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec800
	 *	@return hserviceSec800
	 */
   public char[] getHserviceSec800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceSec800();
   }

  
	/**
	*  set variable hserviceSec800
	*  @param value
	**/
   public void setHserviceSec800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(value);
   } 

     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex);
   	
   }
   
   public void setHserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec800 with another Field
	 *	@param value
	 */
   public void setHserviceSec800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source);
   }  
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceCc800
	 *	@return lserviceCc800
	 */
   public char[] getLserviceCc800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceCc800();
   }

  
	/**
	*  set variable lserviceCc800
	*  @param value
	**/
   public void setLserviceCc800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(value);
   } 

     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex);
   	
   }
   
   public void setLserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCc800 with another Field
	 *	@param value
	 */
   public void setLserviceCc800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source);
   }  
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of hserviceMins800
	 *	@return hserviceMins800
	 */
   public char[] getHserviceMins800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceMins800();
   }

  
	/**
	*  set variable hserviceMins800
	*  @param value
	**/
   public void setHserviceMins800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(value);
   } 

     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex);
   	
   }
   
   public void setHserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins800 with another Field
	 *	@param value
	 */
   public void setHserviceMins800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source);
   }  
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceYy800
	 *	@return lserviceYy800
	 */
   public char[] getLserviceYy800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceYy800();
   }

  
	/**
	*  set variable lserviceYy800
	*  @param value
	**/
   public void setLserviceYy800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(value);
   } 

     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex);
   	
   }
   
   public void setLserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYy800 with another Field
	 *	@param value
	 */
   public void setLserviceYy800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source);
   }  
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceYy800
	 *	@return hserviceYy800
	 */
   public char[] getHserviceYy800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceYy800();
   }

  
	/**
	*  set variable hserviceYy800
	*  @param value
	**/
   public void setHserviceYy800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(value);
   } 

     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex);
   	
   }
   
   public void setHserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYy800 with another Field
	 *	@param value
	 */
   public void setHserviceYy800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source);
   }  
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of detailData2705
	 *	@return detailData2705
	 */   
	 public DetailData2705 getDetailData2705() {
   	return detailData2705;
   }


public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of lserviceDd800
	 *	@return lserviceDd800
	 */
   public char[] getLserviceDd800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceDd800();
   }

  
	/**
	*  set variable lserviceDd800
	*  @param value
	**/
   public void setLserviceDd800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(value);
   } 

     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex);
   	
   }
   
   public void setLserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDd800 with another Field
	 *	@param value
	 */
   public void setLserviceDd800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source);
   }  
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceCc800
	 *	@return hserviceCc800
	 */
   public char[] getHserviceCc800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceCc800();
   }

  
	/**
	*  set variable hserviceCc800
	*  @param value
	**/
   public void setHserviceCc800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(value);
   } 

     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex);
   	
   }
   
   public void setHserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCc800 with another Field
	 *	@param value
	 */
   public void setHserviceCc800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source);
   }  
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceHh800
	 *	@return hserviceHh800
	 */
   public char[] getHserviceHh800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceHh800();
   }

  
	/**
	*  set variable hserviceHh800
	*  @param value
	**/
   public void setHserviceHh800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(value);
   } 

     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex);
   	
   }
   
   public void setHserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh800 with another Field
	 *	@param value
	 */
   public void setHserviceHh800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source);
   }  
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceSec800
	 *	@return lserviceSec800
	 */
   public char[] getLserviceSec800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceSec800();
   }

  
	/**
	*  set variable lserviceSec800
	*  @param value
	**/
   public void setLserviceSec800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(value);
   } 

     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex);
   	
   }
   
   public void setLserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec800 with another Field
	 *	@param value
	 */
   public void setLserviceSec800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source);
   }  
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceDd800
	 *	@return hserviceDd800
	 */
   public char[] getHserviceDd800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceDd800();
   }

  
	/**
	*  set variable hserviceDd800
	*  @param value
	**/
   public void setHserviceDd800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(value);
   } 

     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex);
   	
   }
   
   public void setHserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDd800 with another Field
	 *	@param value
	 */
   public void setHserviceDd800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source);
   }  
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public DisplayServiceDateOutCtx getDisplayServiceDateOutCtx() {
            return new DisplayServiceDateOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += highServiceTime800.hashCode();
        str += detailData2705.hashCode();
        str += work.hashCode();
        str += lowServiceTime800.hashCode();
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public DisplayServiceDateInCtx clone() {
        DisplayServiceDateInCtx cloneObj = new DisplayServiceDateInCtx();
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.detailData2705 = new DetailData2705();
        cloneObj.detailData2705.set(detailData2705.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayServiceDateInCtx getDisplayServiceDateInCtx() {
            return new DisplayServiceDateInCtx();
    }
     public class DisplayServiceDateOutCtx implements Cloneable {
     HighServiceTime800 highServiceTime800 = Sf328010Ctx.this.getHighServiceTime800();
     DetailData2705 detailData2705 = Sf328010Ctx.this.getDetailData2705();
     Work work = Sf328010Ctx.this.getWork();
     LowServiceTime800 lowServiceTime800 = Sf328010Ctx.this.getLowServiceTime800();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

	/**
	 *	Returns the value of lserviceMins800
	 *	@return lserviceMins800
	 */
   public char[] getLserviceMins800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceMins800();
   }

  
	/**
	*  set variable lserviceMins800
	*  @param value
	**/
   public void setLserviceMins800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(value);
   } 

     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex);
   	
   }
   
   public void setLserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins800 with another Field
	 *	@param value
	 */
   public void setLserviceMins800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source);
   }  
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec705
	 *	@return hserviceSec705
	 */
   public char[] getHserviceSec705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceSec705();
   }

  
	/**
	*  set variable hserviceSec705
	*  @param value
	**/
   public void setHserviceSec705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceSec705(value);
   } 

     /**
	 * 	Update HserviceSec705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceSec705(source, sourceIndex);
   	
   }
   
   public void setHserviceSec705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceSec705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceSec705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec705 with another Field
	 *	@param value
	 */
   public void setHserviceSec705(Field source) {
      detailData2705.getDetail170501().setHserviceSec705(source);
   }  
   
     /**
	 * 	Update HserviceSec705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceSec705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceSec705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceYear705
	 *	@return hserviceYear705
	 */
   public char[] getHserviceYear705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceYear705();
   }

  
	/**
	*  set variable hserviceYear705
	*  @param value
	**/
   public void setHserviceYear705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceYear705(value);
   } 

     /**
	 * 	Update HserviceYear705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYear705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceYear705(source, sourceIndex);
   	
   }
   
   public void setHserviceYear705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceYear705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYear705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceYear705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYear705 with another Field
	 *	@param value
	 */
   public void setHserviceYear705(Field source) {
      detailData2705.getDetail170501().setHserviceYear705(source);
   }  
   
     /**
	 * 	Update HserviceYear705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYear705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceYear705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYear705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceYear705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh705
	 *	@return lserviceHh705
	 */
   public char[] getLserviceHh705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceHh705();
   }

  
	/**
	*  set variable lserviceHh705
	*  @param value
	**/
   public void setLserviceHh705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceHh705(value);
   } 

     /**
	 * 	Update LserviceHh705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceHh705(source, sourceIndex);
   	
   }
   
   public void setLserviceHh705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceHh705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceHh705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh705 with another Field
	 *	@param value
	 */
   public void setLserviceHh705(Field source) {
      detailData2705.getDetail170501().setLserviceHh705(source);
   }  
   
     /**
	 * 	Update LserviceHh705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceHh705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceHh705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMm800
	 *	@return lserviceMm800
	 */
   public char[] getLserviceMm800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceMm800();
   }

  
	/**
	*  set variable lserviceMm800
	*  @param value
	**/
   public void setLserviceMm800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(value);
   } 

     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex);
   	
   }
   
   public void setLserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMm800 with another Field
	 *	@param value
	 */
   public void setLserviceMm800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source);
   }  
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMm800
	 *	@return hserviceMm800
	 */
   public char[] getHserviceMm800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceMm800();
   }

  
	/**
	*  set variable hserviceMm800
	*  @param value
	**/
   public void setHserviceMm800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(value);
   } 

     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex);
   	
   }
   
   public void setHserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMm800 with another Field
	 *	@param value
	 */
   public void setHserviceMm800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source);
   }  
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceSec705
	 *	@return lserviceSec705
	 */
   public char[] getLserviceSec705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceSec705();
   }

  
	/**
	*  set variable lserviceSec705
	*  @param value
	**/
   public void setLserviceSec705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceSec705(value);
   } 

     /**
	 * 	Update LserviceSec705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceSec705(source, sourceIndex);
   	
   }
   
   public void setLserviceSec705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceSec705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceSec705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec705 with another Field
	 *	@param value
	 */
   public void setLserviceSec705(Field source) {
      detailData2705.getDetail170501().setLserviceSec705(source);
   }  
   
     /**
	 * 	Update LserviceSec705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceSec705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceSec705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mnthMmNum100
	 *	@return mnthMmNum100
	 */
   public char[] getMnthMmNum100() throws CFException  {              
   		return work.getMnthMmNum100();
   }

  
	/**
	*  set variable mnthMmNum100
	*  @param value
	**/
   public void setMnthMmNum100(char[] value) throws CFException {
      work.setMnthMmNum100(value);
   } 

	/**
	 *	Returns the value of hserviceCentury705
	 *	@return hserviceCentury705
	 */
   public char[] getHserviceCentury705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceCentury705();
   }

  
	/**
	*  set variable hserviceCentury705
	*  @param value
	**/
   public void setHserviceCentury705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceCentury705(value);
   } 

     /**
	 * 	Update HserviceCentury705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCentury705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceCentury705(source, sourceIndex);
   	
   }
   
   public void setHserviceCentury705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceCentury705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCentury705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceCentury705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCentury705 with another Field
	 *	@param value
	 */
   public void setHserviceCentury705(Field source) {
      detailData2705.getDetail170501().setHserviceCentury705(source);
   }  
   
     /**
	 * 	Update HserviceCentury705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCentury705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceCentury705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCentury705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceCentury705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMonth705
	 *	@return lserviceMonth705
	 */
   public char[] getLserviceMonth705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceMonth705();
   }

  
	/**
	*  set variable lserviceMonth705
	*  @param value
	**/
   public void setLserviceMonth705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceMonth705(value);
   } 

     /**
	 * 	Update LserviceMonth705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMonth705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceMonth705(source, sourceIndex);
   	
   }
   
   public void setLserviceMonth705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceMonth705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMonth705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceMonth705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMonth705 with another Field
	 *	@param value
	 */
   public void setLserviceMonth705(Field source) {
      detailData2705.getDetail170501().setLserviceMonth705(source);
   }  
   
     /**
	 * 	Update LserviceMonth705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMonth705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceMonth705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMonth705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceMonth705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceYy800
	 *	@return hserviceYy800
	 */
   public char[] getHserviceYy800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceYy800();
   }

  
	/**
	*  set variable hserviceYy800
	*  @param value
	**/
   public void setHserviceYy800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(value);
   } 

     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex);
   	
   }
   
   public void setHserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYy800 with another Field
	 *	@param value
	 */
   public void setHserviceYy800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source);
   }  
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMonth705
	 *	@return hserviceMonth705
	 */
   public char[] getHserviceMonth705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceMonth705();
   }

  
	/**
	*  set variable hserviceMonth705
	*  @param value
	**/
   public void setHserviceMonth705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceMonth705(value);
   } 

     /**
	 * 	Update HserviceMonth705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMonth705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceMonth705(source, sourceIndex);
   	
   }
   
   public void setHserviceMonth705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceMonth705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMonth705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceMonth705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMonth705 with another Field
	 *	@param value
	 */
   public void setHserviceMonth705(Field source) {
      detailData2705.getDetail170501().setHserviceMonth705(source);
   }  
   
     /**
	 * 	Update HserviceMonth705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMonth705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceMonth705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMonth705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceMonth705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceCentury705
	 *	@return lserviceCentury705
	 */
   public char[] getLserviceCentury705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceCentury705();
   }

  
	/**
	*  set variable lserviceCentury705
	*  @param value
	**/
   public void setLserviceCentury705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceCentury705(value);
   } 

     /**
	 * 	Update LserviceCentury705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCentury705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceCentury705(source, sourceIndex);
   	
   }
   
   public void setLserviceCentury705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceCentury705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCentury705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceCentury705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCentury705 with another Field
	 *	@param value
	 */
   public void setLserviceCentury705(Field source) {
      detailData2705.getDetail170501().setLserviceCentury705(source);
   }  
   
     /**
	 * 	Update LserviceCentury705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCentury705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceCentury705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCentury705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceCentury705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceHh800
	 *	@return hserviceHh800
	 */
   public char[] getHserviceHh800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceHh800();
   }

  
	/**
	*  set variable hserviceHh800
	*  @param value
	**/
   public void setHserviceHh800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(value);
   } 

     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex);
   	
   }
   
   public void setHserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh800 with another Field
	 *	@param value
	 */
   public void setHserviceHh800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source);
   }  
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceDd800
	 *	@return hserviceDd800
	 */
   public char[] getHserviceDd800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceDd800();
   }

  
	/**
	*  set variable hserviceDd800
	*  @param value
	**/
   public void setHserviceDd800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(value);
   } 

     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex);
   	
   }
   
   public void setHserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDd800 with another Field
	 *	@param value
	 */
   public void setHserviceDd800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source);
   }  
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMins705
	 *	@return lserviceMins705
	 */
   public char[] getLserviceMins705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceMins705();
   }

  
	/**
	*  set variable lserviceMins705
	*  @param value
	**/
   public void setLserviceMins705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceMins705(value);
   } 

     /**
	 * 	Update LserviceMins705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceMins705(source, sourceIndex);
   	
   }
   
   public void setLserviceMins705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceMins705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceMins705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins705 with another Field
	 *	@param value
	 */
   public void setLserviceMins705(Field source) {
      detailData2705.getDetail170501().setLserviceMins705(source);
   }  
   
     /**
	 * 	Update LserviceMins705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceMins705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceMins705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceYear705
	 *	@return lserviceYear705
	 */
   public char[] getLserviceYear705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceYear705();
   }

  
	/**
	*  set variable lserviceYear705
	*  @param value
	**/
   public void setLserviceYear705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceYear705(value);
   } 

     /**
	 * 	Update LserviceYear705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYear705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceYear705(source, sourceIndex);
   	
   }
   
   public void setLserviceYear705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceYear705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYear705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceYear705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYear705 with another Field
	 *	@param value
	 */
   public void setLserviceYear705(Field source) {
      detailData2705.getDetail170501().setLserviceYear705(source);
   }  
   
     /**
	 * 	Update LserviceYear705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYear705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceYear705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYear705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceYear705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh800
	 *	@return lserviceHh800
	 */
   public char[] getLserviceHh800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceHh800();
   }

  
	/**
	*  set variable lserviceHh800
	*  @param value
	**/
   public void setLserviceHh800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(value);
   } 

     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex);
   	
   }
   
   public void setLserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh800 with another Field
	 *	@param value
	 */
   public void setLserviceHh800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source);
   }  
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMins705
	 *	@return hserviceMins705
	 */
   public char[] getHserviceMins705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceMins705();
   }

  
	/**
	*  set variable hserviceMins705
	*  @param value
	**/
   public void setHserviceMins705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceMins705(value);
   } 

     /**
	 * 	Update HserviceMins705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceMins705(source, sourceIndex);
   	
   }
   
   public void setHserviceMins705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceMins705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceMins705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins705 with another Field
	 *	@param value
	 */
   public void setHserviceMins705(Field source) {
      detailData2705.getDetail170501().setHserviceMins705(source);
   }  
   
     /**
	 * 	Update HserviceMins705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceMins705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceMins705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec800
	 *	@return hserviceSec800
	 */
   public char[] getHserviceSec800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceSec800();
   }

  
	/**
	*  set variable hserviceSec800
	*  @param value
	**/
   public void setHserviceSec800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(value);
   } 

     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex);
   	
   }
   
   public void setHserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec800 with another Field
	 *	@param value
	 */
   public void setHserviceSec800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source);
   }  
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceCc800
	 *	@return lserviceCc800
	 */
   public char[] getLserviceCc800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceCc800();
   }

  
	/**
	*  set variable lserviceCc800
	*  @param value
	**/
   public void setLserviceCc800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(value);
   } 

     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex);
   	
   }
   
   public void setLserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCc800 with another Field
	 *	@param value
	 */
   public void setLserviceCc800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source);
   }  
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceDate705
	 *	@return hserviceDate705
	 */
   public char[] getHserviceDate705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceDate705();
   }

  
	/**
	*  set variable hserviceDate705
	*  @param value
	**/
   public void setHserviceDate705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceDate705(value);
   } 

     /**
	 * 	Update HserviceDate705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceDate705(source, sourceIndex);
   	
   }
   
   public void setHserviceDate705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceDate705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDate705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceDate705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDate705 with another Field
	 *	@param value
	 */
   public void setHserviceDate705(Field source) {
      detailData2705.getDetail170501().setHserviceDate705(source);
   }  
   
     /**
	 * 	Update HserviceDate705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDate705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceDate705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDate705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceDate705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of hserviceMins800
	 *	@return hserviceMins800
	 */
   public char[] getHserviceMins800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceMins800();
   }

  
	/**
	*  set variable hserviceMins800
	*  @param value
	**/
   public void setHserviceMins800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(value);
   } 

     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex);
   	
   }
   
   public void setHserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins800 with another Field
	 *	@param value
	 */
   public void setHserviceMins800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source);
   }  
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceYy800
	 *	@return lserviceYy800
	 */
   public char[] getLserviceYy800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceYy800();
   }

  
	/**
	*  set variable lserviceYy800
	*  @param value
	**/
   public void setLserviceYy800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(value);
   } 

     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex);
   	
   }
   
   public void setLserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYy800 with another Field
	 *	@param value
	 */
   public void setLserviceYy800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source);
   }  
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceHh705
	 *	@return hserviceHh705
	 */
   public char[] getHserviceHh705() throws CFException  {              
   		return detailData2705.getDetail170501().getHserviceHh705();
   }

  
	/**
	*  set variable hserviceHh705
	*  @param value
	**/
   public void setHserviceHh705(char[] value) throws CFException {
      detailData2705.getDetail170501().setHserviceHh705(value);
   } 

     /**
	 * 	Update HserviceHh705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setHserviceHh705(source, sourceIndex);
   	
   }
   
   public void setHserviceHh705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setHserviceHh705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceHh705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh705 with another Field
	 *	@param value
	 */
   public void setHserviceHh705(Field source) {
      detailData2705.getDetail170501().setHserviceHh705(source);
   }  
   
     /**
	 * 	Update HserviceHh705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setHserviceHh705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setHserviceHh705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of lserviceDd800
	 *	@return lserviceDd800
	 */
   public char[] getLserviceDd800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceDd800();
   }

  
	/**
	*  set variable lserviceDd800
	*  @param value
	**/
   public void setLserviceDd800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(value);
   } 

     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex);
   	
   }
   
   public void setLserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDd800 with another Field
	 *	@param value
	 */
   public void setLserviceDd800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source);
   }  
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceCc800
	 *	@return hserviceCc800
	 */
   public char[] getHserviceCc800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceCc800();
   }

  
	/**
	*  set variable hserviceCc800
	*  @param value
	**/
   public void setHserviceCc800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(value);
   } 

     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex);
   	
   }
   
   public void setHserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCc800 with another Field
	 *	@param value
	 */
   public void setHserviceCc800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source);
   }  
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceDate705
	 *	@return lserviceDate705
	 */
   public char[] getLserviceDate705() throws CFException  {              
   		return detailData2705.getDetail170501().getLserviceDate705();
   }

  
	/**
	*  set variable lserviceDate705
	*  @param value
	**/
   public void setLserviceDate705(char[] value) throws CFException {
      detailData2705.getDetail170501().setLserviceDate705(value);
   } 

     /**
	 * 	Update LserviceDate705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate705(char[] source, int sourceIndex) throws CFException {
      detailData2705.getDetail170501().setLserviceDate705(source, sourceIndex);
   	
   }
   
   public void setLserviceDate705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData2705.getDetail170501().setLserviceDate705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDate705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceDate705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDate705 with another Field
	 *	@param value
	 */
   public void setLserviceDate705(Field source) {
      detailData2705.getDetail170501().setLserviceDate705(source);
   }  
   
     /**
	 * 	Update LserviceDate705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDate705(Field source, int sourceIndex,int sourceLen) {
      detailData2705.getDetail170501().setLserviceDate705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDate705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData2705.getDetail170501().setLserviceDate705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceSec800
	 *	@return lserviceSec800
	 */
   public char[] getLserviceSec800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceSec800();
   }

  
	/**
	*  set variable lserviceSec800
	*  @param value
	**/
   public void setLserviceSec800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(value);
   } 

     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex);
   	
   }
   
   public void setLserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec800 with another Field
	 *	@param value
	 */
   public void setLserviceSec800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source);
   }  
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += highServiceTime800.hashCode();
        str += detailData2705.hashCode();
        str += work.hashCode();
        str += lowServiceTime800.hashCode();
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public DisplayServiceDateOutCtx clone() {
        DisplayServiceDateOutCtx cloneObj = new DisplayServiceDateOutCtx();
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.detailData2705 = new DetailData2705();
        cloneObj.detailData2705.set(detailData2705.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayServiceDateOutCtx getDisplayServiceDateOutCtx() {
            return new DisplayServiceDateOutCtx();
    }
     public class ReadZLogFileInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();
     Group1 group1 = Sf328010Ctx.this.getGroup1();

	/**
	 *	Returns the value of sf528ExtractZLogRec
	 *	@return sf528ExtractZLogRec
	 */   
	 public Sf528ExtractZLogRec getSf528ExtractZLogRec() {
   	return sf528ExtractZLogRec;
   }


public long getZLogCnt400() throws CFException {  
        return work.getZLogCnt400();
}
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(long number)  throws CFException{
		work.setZLogCnt400(number);
	}



	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

	/**
	 *	Test condition "Y" for isFirstRead88100()
	 *	@return  Returns true if isFirstRead88100() is "Y"
	 */
   public boolean isFirstRead88100() throws CFException {
      return work.isFirstRead88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setFirstRead88100True()  throws CFException{  			
    	work.setFirstRead88100True();
   	}

        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public ReadZLogFileOutCtx getReadZLogFileOutCtx() {
            return new ReadZLogFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
        str += group1.hashCode();
       return str.hashCode();
    }

    public ReadZLogFileInCtx clone() {
        ReadZLogFileInCtx cloneObj = new ReadZLogFileInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        return cloneObj;
    }

    }

    public ReadZLogFileInCtx getReadZLogFileInCtx() {
            return new ReadZLogFileInCtx();
    }
     public class ReadZLogFileOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();
     Group1 group1 = Sf328010Ctx.this.getGroup1();

public long getZLogCnt400() throws CFException {  
        return work.getZLogCnt400();
}
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(long number)  throws CFException{
		work.setZLogCnt400(number);
	}



	/**
	 *	Returns the value of group1
	 *	@return group1
	 */   
	 public Group1 getGroup1() {
   	return group1;
   }


	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
        str += group1.hashCode();
       return str.hashCode();
    }

    public ReadZLogFileOutCtx clone() {
        ReadZLogFileOutCtx cloneObj = new ReadZLogFileOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        return cloneObj;
    }

    }

    public ReadZLogFileOutCtx getReadZLogFileOutCtx() {
            return new ReadZLogFileOutCtx();
    }
     public class GenerateReportInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();

public short getMaxLinesPerPage300() throws CFException {  
        return work.getMaxLinesPerPage300();
}
	/**
	 * 	Update MaxLinesPerPage300 with the passed value
	 *	@param number
	 */
	public void setMaxLinesPerPage300(short number)  throws CFException{
		work.setMaxLinesPerPage300(number);
	}

	public void setMaxLinesPerPage300(int number)  throws CFException{
	   work.setMaxLinesPerPage300(number);
	}
	public void setMaxLinesPerPage300(long number)  throws CFException {
	    work.setMaxLinesPerPage300(number);
	}
	


	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public GenerateReportOutCtx getGenerateReportOutCtx() {
            return new GenerateReportOutCtx();
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
        str += headerLine2702.hashCode();
       return str.hashCode();
    }

    public GenerateReportInCtx clone() {
        GenerateReportInCtx cloneObj = new GenerateReportInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        return cloneObj;
    }

    }

    public GenerateReportInCtx getGenerateReportInCtx() {
            return new GenerateReportInCtx();
    }
     public class GenerateReportOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}



	/**
	 *	Returns the value of pageNum702
	 *	@return pageNum702
	 */
   public char[] getPageNum702() throws CFException  {              
   		return headerLine2702.getPageNum702();
   }

  
	/**
	*  set variable pageNum702
	*  @param value
	**/
   public void setPageNum702(char[] value) throws CFException {
      headerLine2702.setPageNum702(value);
   } 

     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex) throws CFException {
      headerLine2702.setPageNum702(source, sourceIndex);
   	
   }
   
   public void setPageNum702(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PageNum702 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PageNum702 with another Field
	 *	@param value
	 */
   public void setPageNum702(Field source) {
      headerLine2702.setPageNum702(source);
   }  
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PageNum702 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageNum702(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerLine2702.setPageNum702(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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
        str += headerLine2702.hashCode();
       return str.hashCode();
    }

    public GenerateReportOutCtx clone() {
        GenerateReportOutCtx cloneObj = new GenerateReportOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        return cloneObj;
    }

    }

    public GenerateReportOutCtx getGenerateReportOutCtx() {
            return new GenerateReportOutCtx();
    }
     public class WriteReportHeaderInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();
     HeaderLine1701 headerLine1701 = Sf328010Ctx.this.getHeaderLine1701();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

	/**
	 *	Returns the value of num2300
	 *	@return num2300
	 */
	public int getNum2300() throws CFException {
   		return work.getNum2300();
	}


	/**
	 *	Returns String value of num2300
	 *	@return num2300
	 */
	public char[]  getNum2300String() throws CFException {
	     return String.valueOf(work.getNum2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num2300IsNumeric()  throws CFException{
	    return work.num2300IsNumeric();
	}

	/**
	 * 	Update Num2300 with the passed value
	 *	@param number
	 */
	public void setNum2300(int number)  throws CFException{
		work.setNum2300(number);
	}
	

	public void setNum2300(long number)  throws CFException{
	    work.setNum2300(number);
	}
	
	
	/**
	 * 	Update Num2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum2300(char[] value)  throws CFException {
		work.setNum2300(value);
	}
	
	/**
	 * 	Update Num2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum2300String(char[] value)  throws CFException{
		work.setNum2300(value);
	}	

	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of headerLine2702
	 *	@return headerLine2702
	 */   
	 public HeaderLine2702 getHeaderLine2702() {
   	return headerLine2702;
   }


	/**
	 *	Returns the value of headerLine4704
	 *	@return headerLine4704
	 */
   public char[] getHeaderLine4704() throws CFException  {              
   		return work.getHeaderLine4704();
   }

  
	/**
	*  set variable headerLine4704
	*  @param value
	**/
   public void setHeaderLine4704(char[] value) throws CFException {
      work.setHeaderLine4704(value);
   } 

	/**
	 *	Returns the value of headerLine1701
	 *	@return headerLine1701
	 */   
	 public HeaderLine1701 getHeaderLine1701() {
   	return headerLine1701;
   }


	/**
	 *	Returns the value of headerLine3703
	 *	@return headerLine3703
	 */
   public char[] getHeaderLine3703() throws CFException  {              
   		return work.getHeaderLine3703();
   }

  
	/**
	*  set variable headerLine3703
	*  @param value
	**/
   public void setHeaderLine3703(char[] value) throws CFException {
      work.setHeaderLine3703(value);
   } 

	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of plus7300
	 *	@return plus7300
	 */
	public int getPlus7300() throws CFException {
   		return work.getPlus7300();
	}


	/**
	 *	Returns String value of plus7300
	 *	@return plus7300
	 */
	public char[]  getPlus7300String() throws CFException {
	     return String.valueOf(work.getPlus7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus7300IsNumeric()  throws CFException{
	    return work.plus7300IsNumeric();
	}

	/**
	 * 	Update Plus7300 with the passed value
	 *	@param number
	 */
	public void setPlus7300(int number)  throws CFException{
		work.setPlus7300(number);
	}
	

	public void setPlus7300(long number)  throws CFException{
	    work.setPlus7300(number);
	}
	
	
	/**
	 * 	Update Plus7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus7300(char[] value)  throws CFException {
		work.setPlus7300(value);
	}
	
	/**
	 * 	Update Plus7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus7300String(char[] value)  throws CFException{
		work.setPlus7300(value);
	}	


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public WriteReportHeaderOutCtx getWriteReportHeaderOutCtx() {
            return new WriteReportHeaderOutCtx();
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
        str += headerLine2702.hashCode();
        str += headerLine1701.hashCode();
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public WriteReportHeaderInCtx clone() {
        WriteReportHeaderInCtx cloneObj = new WriteReportHeaderInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        cloneObj.headerLine1701 = new HeaderLine1701();
        cloneObj.headerLine1701.set(headerLine1701.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public WriteReportHeaderInCtx getWriteReportHeaderInCtx() {
            return new WriteReportHeaderInCtx();
    }
     public class WriteReportHeaderOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     HeaderLine2702 headerLine2702 = Sf328010Ctx.this.getHeaderLine2702();
     HeaderLine1701 headerLine1701 = Sf328010Ctx.this.getHeaderLine1701();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of plus7300
	 *	@return plus7300
	 */
	public int getPlus7300() throws CFException {
   		return work.getPlus7300();
	}


	/**
	 *	Returns String value of plus7300
	 *	@return plus7300
	 */
	public char[]  getPlus7300String() throws CFException {
	     return String.valueOf(work.getPlus7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus7300IsNumeric()  throws CFException{
	    return work.plus7300IsNumeric();
	}

	/**
	 * 	Update Plus7300 with the passed value
	 *	@param number
	 */
	public void setPlus7300(int number)  throws CFException{
		work.setPlus7300(number);
	}
	

	public void setPlus7300(long number)  throws CFException{
	    work.setPlus7300(number);
	}
	
	
	/**
	 * 	Update Plus7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus7300(char[] value)  throws CFException {
		work.setPlus7300(value);
	}
	
	/**
	 * 	Update Plus7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus7300String(char[] value)  throws CFException{
		work.setPlus7300(value);
	}	


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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
        str += headerLine2702.hashCode();
        str += headerLine1701.hashCode();
        str += sys201ServiceRptRec.hashCode();
       return str.hashCode();
    }

    public WriteReportHeaderOutCtx clone() {
        WriteReportHeaderOutCtx cloneObj = new WriteReportHeaderOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.headerLine2702 = new HeaderLine2702();
        cloneObj.headerLine2702.set(headerLine2702.getClonedField());
        cloneObj.headerLine1701 = new HeaderLine1701();
        cloneObj.headerLine1701.set(headerLine1701.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        return cloneObj;
    }

    }

    public WriteReportHeaderOutCtx getWriteReportHeaderOutCtx() {
            return new WriteReportHeaderOutCtx();
    }
     public class WriteDetailInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();
     DetailData705 detailData705 = Sf328010Ctx.this.getDetailData705();
     DetailData1705 detailData1705 = Sf328010Ctx.this.getDetailData1705();

	/**
	 *	Returns the value of totServiceCnt800
	 *	@return totServiceCnt800
	 */
   public char[] getTotServiceCnt800() throws CFException  {              
   		return work.getTotServiceCnt800();
   }

  
	/**
	*  set variable totServiceCnt800
	*  @param value
	**/
   public void setTotServiceCnt800(char[] value) throws CFException {
      work.setTotServiceCnt800(value);
   } 

     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex) throws CFException {
      work.setTotServiceCnt800(source, sourceIndex);
   	
   }
   
   public void setTotServiceCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotServiceCnt800 with another Field
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source) {
      work.setTotServiceCnt800(source);
   }  
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of detailData705
	 *	@return detailData705
	 */   
	 public DetailData705 getDetailData705() {
   	return detailData705;
   }


	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of detailData1705
	 *	@return detailData1705
	 */   
	 public DetailData1705 getDetailData1705() {
   	return detailData1705;
   }


	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 

	/**
	 *	Returns the value of highElapseTime800
	 *	@return highElapseTime800
	 */
   public char[] getHighElapseTime800() throws CFException  {              
   		return work.getHighElapseTime800();
   }

  
	/**
	*  set variable highElapseTime800
	*  @param value
	**/
   public void setHighElapseTime800(char[] value) throws CFException {
      work.setHighElapseTime800(value);
   } 

     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setHighElapseTime800(source, sourceIndex);
   	
   }
   
   public void setHighElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HighElapseTime800 with another Field
	 *	@param value
	 */
   public void setHighElapseTime800(Field source) {
      work.setHighElapseTime800(source);
   }  
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of successCnt800
	 *	@return successCnt800
	 */
   public char[] getSuccessCnt800() throws CFException  {              
   		return work.getSuccessCnt800();
   }

  
	/**
	*  set variable successCnt800
	*  @param value
	**/
   public void setSuccessCnt800(char[] value) throws CFException {
      work.setSuccessCnt800(value);
   } 

     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessCnt800(source, sourceIndex);
   	
   }
   
   public void setSuccessCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessCnt800 with another Field
	 *	@param value
	 */
   public void setSuccessCnt800(Field source) {
      work.setSuccessCnt800(source);
   }  
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of unsuccessPercent800
	 *	@return unsuccessPercent800
	 */
   public char[] getUnsuccessPercent800() throws CFException  {              
   		return work.getUnsuccessPercent800();
   }

  
	/**
	*  set variable unsuccessPercent800
	*  @param value
	**/
   public void setUnsuccessPercent800(char[] value) throws CFException {
      work.setUnsuccessPercent800(value);
   } 

     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setUnsuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setUnsuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UnsuccessPercent800 with another Field
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source) {
      work.setUnsuccessPercent800(source);
   }  
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of lowElapseTime800
	 *	@return lowElapseTime800
	 */
   public char[] getLowElapseTime800() throws CFException  {              
   		return work.getLowElapseTime800();
   }

  
	/**
	*  set variable lowElapseTime800
	*  @param value
	**/
   public void setLowElapseTime800(char[] value) throws CFException {
      work.setLowElapseTime800(value);
   } 

     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setLowElapseTime800(source, sourceIndex);
   	
   }
   
   public void setLowElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LowElapseTime800 with another Field
	 *	@param value
	 */
   public void setLowElapseTime800(Field source) {
      work.setLowElapseTime800(source);
   }  
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCnt800
	 *	@return errorCnt800
	 */
   public char[] getErrorCnt800() throws CFException  {              
   		return work.getErrorCnt800();
   }

  
	/**
	*  set variable errorCnt800
	*  @param value
	**/
   public void setErrorCnt800(char[] value) throws CFException {
      work.setErrorCnt800(value);
   } 

     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex) throws CFException {
      work.setErrorCnt800(source, sourceIndex);
   	
   }
   
   public void setErrorCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorCnt800 with another Field
	 *	@param value
	 */
   public void setErrorCnt800(Field source) {
      work.setErrorCnt800(source);
   }  
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotRecWritten400() throws CFException {  
        return work.getTotRecWritten400();
}
	/**
	 * 	Update TotRecWritten400 with the passed value
	 *	@param number
	 */
	public void setTotRecWritten400(long number)  throws CFException{
		work.setTotRecWritten400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public WriteDetailOutCtx getWriteDetailOutCtx() {
            return new WriteDetailOutCtx();
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
        str += sys201ServiceRptRec.hashCode();
        str += detailData705.hashCode();
        str += detailData1705.hashCode();
       return str.hashCode();
    }

    public WriteDetailInCtx clone() {
        WriteDetailInCtx cloneObj = new WriteDetailInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        cloneObj.detailData705 = new DetailData705();
        cloneObj.detailData705.set(detailData705.getClonedField());
        cloneObj.detailData1705 = new DetailData1705();
        cloneObj.detailData1705.set(detailData1705.getClonedField());
        return cloneObj;
    }

    }

    public WriteDetailInCtx getWriteDetailInCtx() {
            return new WriteDetailInCtx();
    }
     public class WriteDetailOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();
     Sys201ServiceRptRec sys201ServiceRptRec = Sf328010Ctx.this.getSys201ServiceRptRec();
     DetailData705 detailData705 = Sf328010Ctx.this.getDetailData705();
     DetailData1705 detailData1705 = Sf328010Ctx.this.getDetailData1705();

	/**
	 *	Returns the value of totServiceCnt800
	 *	@return totServiceCnt800
	 */
   public char[] getTotServiceCnt800() throws CFException  {              
   		return work.getTotServiceCnt800();
   }

  
	/**
	*  set variable totServiceCnt800
	*  @param value
	**/
   public void setTotServiceCnt800(char[] value) throws CFException {
      work.setTotServiceCnt800(value);
   } 

     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex) throws CFException {
      work.setTotServiceCnt800(source, sourceIndex);
   	
   }
   
   public void setTotServiceCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotServiceCnt800 with another Field
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source) {
      work.setTotServiceCnt800(source);
   }  
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serviceId705
	 *	@return serviceId705
	 */
   public char[] getServiceId705() throws CFException  {              
   		return detailData705.getDetail705().getServiceId705();
   }

  
	/**
	*  set variable serviceId705
	*  @param value
	**/
   public void setServiceId705(char[] value) throws CFException {
      detailData705.getDetail705().setServiceId705(value);
   } 

     /**
	 * 	Update ServiceId705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceId705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setServiceId705(source, sourceIndex);
   	
   }
   
   public void setServiceId705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setServiceId705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServiceId705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceId705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setServiceId705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServiceId705 with another Field
	 *	@param value
	 */
   public void setServiceId705(Field source) {
      detailData705.getDetail705().setServiceId705(source);
   }  
   
     /**
	 * 	Update ServiceId705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceId705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setServiceId705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServiceId705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceId705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setServiceId705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



public long getSumElapsedTime400() throws CFException {  
        return work.getSumElapsedTime400();
}
	/**
	 * 	Update SumElapsedTime400 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime400(long number)  throws CFException{
		work.setSumElapsedTime400(number);
	}



	/**
	 *	Returns the value of successCnt800
	 *	@return successCnt800
	 */
   public char[] getSuccessCnt800() throws CFException  {              
   		return work.getSuccessCnt800();
   }

  
	/**
	*  set variable successCnt800
	*  @param value
	**/
   public void setSuccessCnt800(char[] value) throws CFException {
      work.setSuccessCnt800(value);
   } 

     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessCnt800(source, sourceIndex);
   	
   }
   
   public void setSuccessCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessCnt800 with another Field
	 *	@param value
	 */
   public void setSuccessCnt800(Field source) {
      work.setSuccessCnt800(source);
   }  
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent705
	 *	@return successPercent705
	 */
   public char[] getSuccessPercent705() throws CFException  {              
   		return detailData705.getDetail705().getSuccessPercent705();
   }

  
	/**
	*  set variable successPercent705
	*  @param value
	**/
   public void setSuccessPercent705(char[] value) throws CFException {
      detailData705.getDetail705().setSuccessPercent705(value);
   } 

     /**
	 * 	Update SuccessPercent705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setSuccessPercent705(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setSuccessPercent705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setSuccessPercent705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent705 with another Field
	 *	@param value
	 */
   public void setSuccessPercent705(Field source) {
      detailData705.getDetail705().setSuccessPercent705(source);
   }  
   
     /**
	 * 	Update SuccessPercent705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setSuccessPercent705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setSuccessPercent705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errPercent705
	 *	@return errPercent705
	 */
   public char[] getErrPercent705() throws CFException  {              
   		return detailData705.getDetail705().getErrPercent705();
   }

  
	/**
	*  set variable errPercent705
	*  @param value
	**/
   public void setErrPercent705(char[] value) throws CFException {
      detailData705.getDetail705().setErrPercent705(value);
   } 

     /**
	 * 	Update ErrPercent705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrPercent705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setErrPercent705(source, sourceIndex);
   	
   }
   
   public void setErrPercent705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setErrPercent705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrPercent705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrPercent705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setErrPercent705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrPercent705 with another Field
	 *	@param value
	 */
   public void setErrPercent705(Field source) {
      detailData705.getDetail705().setErrPercent705(source);
   }  
   
     /**
	 * 	Update ErrPercent705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrPercent705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setErrPercent705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrPercent705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrPercent705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setErrPercent705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotRecWritten400() throws CFException {  
        return work.getTotRecWritten400();
}
	/**
	 * 	Update TotRecWritten400 with the passed value
	 *	@param number
	 */
	public void setTotRecWritten400(long number)  throws CFException{
		work.setTotRecWritten400(number);
	}



	/**
	 *	Returns the value of errCnt705
	 *	@return errCnt705
	 */
   public char[] getErrCnt705() throws CFException  {              
   		return detailData705.getDetail705().getErrCnt705();
   }

  
	/**
	*  set variable errCnt705
	*  @param value
	**/
   public void setErrCnt705(char[] value) throws CFException {
      detailData705.getDetail705().setErrCnt705(value);
   } 

     /**
	 * 	Update ErrCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrCnt705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setErrCnt705(source, sourceIndex);
   	
   }
   
   public void setErrCnt705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setErrCnt705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setErrCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrCnt705 with another Field
	 *	@param value
	 */
   public void setErrCnt705(Field source) {
      detailData705.getDetail705().setErrCnt705(source);
   }  
   
     /**
	 * 	Update ErrCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrCnt705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setErrCnt705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setErrCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowTime705
	 *	@return lowTime705
	 */
   public char[] getLowTime705() throws CFException  {              
   		return detailData705.getDetail705().getLowTime705();
   }

  
	/**
	*  set variable lowTime705
	*  @param value
	**/
   public void setLowTime705(char[] value) throws CFException {
      detailData705.getDetail705().setLowTime705(value);
   } 

     /**
	 * 	Update LowTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowTime705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setLowTime705(source, sourceIndex);
   	
   }
   
   public void setLowTime705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setLowTime705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LowTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setLowTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LowTime705 with another Field
	 *	@param value
	 */
   public void setLowTime705(Field source) {
      detailData705.getDetail705().setLowTime705(source);
   }  
   
     /**
	 * 	Update LowTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowTime705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setLowTime705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LowTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setLowTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successCnt705
	 *	@return successCnt705
	 */
   public char[] getSuccessCnt705() throws CFException  {              
   		return detailData705.getDetail705().getSuccessCnt705();
   }

  
	/**
	*  set variable successCnt705
	*  @param value
	**/
   public void setSuccessCnt705(char[] value) throws CFException {
      detailData705.getDetail705().setSuccessCnt705(value);
   } 

     /**
	 * 	Update SuccessCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setSuccessCnt705(source, sourceIndex);
   	
   }
   
   public void setSuccessCnt705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setSuccessCnt705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setSuccessCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessCnt705 with another Field
	 *	@param value
	 */
   public void setSuccessCnt705(Field source) {
      detailData705.getDetail705().setSuccessCnt705(source);
   }  
   
     /**
	 * 	Update SuccessCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setSuccessCnt705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setSuccessCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of highTime705
	 *	@return highTime705
	 */
   public char[] getHighTime705() throws CFException  {              
   		return detailData705.getDetail705().getHighTime705();
   }

  
	/**
	*  set variable highTime705
	*  @param value
	**/
   public void setHighTime705(char[] value) throws CFException {
      detailData705.getDetail705().setHighTime705(value);
   } 

     /**
	 * 	Update HighTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighTime705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setHighTime705(source, sourceIndex);
   	
   }
   
   public void setHighTime705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setHighTime705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HighTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setHighTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HighTime705 with another Field
	 *	@param value
	 */
   public void setHighTime705(Field source) {
      detailData705.getDetail705().setHighTime705(source);
   }  
   
     /**
	 * 	Update HighTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighTime705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setHighTime705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HighTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setHighTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



	/**
	 *	Returns the value of totalCnt705
	 *	@return totalCnt705
	 */
   public char[] getTotalCnt705() throws CFException  {              
   		return detailData705.getDetail705().getTotalCnt705();
   }

  
	/**
	*  set variable totalCnt705
	*  @param value
	**/
   public void setTotalCnt705(char[] value) throws CFException {
      detailData705.getDetail705().setTotalCnt705(value);
   } 

     /**
	 * 	Update TotalCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotalCnt705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setTotalCnt705(source, sourceIndex);
   	
   }
   
   public void setTotalCnt705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setTotalCnt705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotalCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotalCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setTotalCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotalCnt705 with another Field
	 *	@param value
	 */
   public void setTotalCnt705(Field source) {
      detailData705.getDetail705().setTotalCnt705(source);
   }  
   
     /**
	 * 	Update TotalCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotalCnt705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setTotalCnt705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotalCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotalCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setTotalCnt705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ServiceRptRec
	 *	@return sys201ServiceRptRec
	 */   
	 public Sys201ServiceRptRec getSys201ServiceRptRec() {
   	return sys201ServiceRptRec;
   }


	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 

public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}



	/**
	 *	Returns the value of highElapseTime800
	 *	@return highElapseTime800
	 */
   public char[] getHighElapseTime800() throws CFException  {              
   		return work.getHighElapseTime800();
   }

  
	/**
	*  set variable highElapseTime800
	*  @param value
	**/
   public void setHighElapseTime800(char[] value) throws CFException {
      work.setHighElapseTime800(value);
   } 

     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setHighElapseTime800(source, sourceIndex);
   	
   }
   
   public void setHighElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HighElapseTime800 with another Field
	 *	@param value
	 */
   public void setHighElapseTime800(Field source) {
      work.setHighElapseTime800(source);
   }  
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of unsuccessPercent800
	 *	@return unsuccessPercent800
	 */
   public char[] getUnsuccessPercent800() throws CFException  {              
   		return work.getUnsuccessPercent800();
   }

  
	/**
	*  set variable unsuccessPercent800
	*  @param value
	**/
   public void setUnsuccessPercent800(char[] value) throws CFException {
      work.setUnsuccessPercent800(value);
   } 

     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setUnsuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setUnsuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UnsuccessPercent800 with another Field
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source) {
      work.setUnsuccessPercent800(source);
   }  
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of avgTime705
	 *	@return avgTime705
	 */
   public char[] getAvgTime705() throws CFException  {              
   		return detailData705.getDetail705().getAvgTime705();
   }

  
	/**
	*  set variable avgTime705
	*  @param value
	**/
   public void setAvgTime705(char[] value) throws CFException {
      detailData705.getDetail705().setAvgTime705(value);
   } 

     /**
	 * 	Update AvgTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgTime705(char[] source, int sourceIndex) throws CFException {
      detailData705.getDetail705().setAvgTime705(source, sourceIndex);
   	
   }
   
   public void setAvgTime705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData705.getDetail705().setAvgTime705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setAvgTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgTime705 with another Field
	 *	@param value
	 */
   public void setAvgTime705(Field source) {
      detailData705.getDetail705().setAvgTime705(source);
   }  
   
     /**
	 * 	Update AvgTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgTime705(Field source, int sourceIndex,int sourceLen) {
      detailData705.getDetail705().setAvgTime705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData705.getDetail705().setAvgTime705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getRpt1LineCount400() throws CFException {  
        return work.getRpt1LineCount400();
}
	/**
	 * 	Update Rpt1LineCount400 with the passed value
	 *	@param number
	 */
	public void setRpt1LineCount400(long number)  throws CFException{
		work.setRpt1LineCount400(number);
	}



	/**
	 *	Returns the value of lowElapseTime800
	 *	@return lowElapseTime800
	 */
   public char[] getLowElapseTime800() throws CFException  {              
   		return work.getLowElapseTime800();
   }

  
	/**
	*  set variable lowElapseTime800
	*  @param value
	**/
   public void setLowElapseTime800(char[] value) throws CFException {
      work.setLowElapseTime800(value);
   } 

     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setLowElapseTime800(source, sourceIndex);
   	
   }
   
   public void setLowElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LowElapseTime800 with another Field
	 *	@param value
	 */
   public void setLowElapseTime800(Field source) {
      work.setLowElapseTime800(source);
   }  
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCnt800
	 *	@return errorCnt800
	 */
   public char[] getErrorCnt800() throws CFException  {              
   		return work.getErrorCnt800();
   }

  
	/**
	*  set variable errorCnt800
	*  @param value
	**/
   public void setErrorCnt800(char[] value) throws CFException {
      work.setErrorCnt800(value);
   } 

     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex) throws CFException {
      work.setErrorCnt800(source, sourceIndex);
   	
   }
   
   public void setErrorCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorCnt800 with another Field
	 *	@param value
	 */
   public void setErrorCnt800(Field source) {
      work.setErrorCnt800(source);
   }  
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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
        str += sys201ServiceRptRec.hashCode();
        str += detailData705.hashCode();
        str += detailData1705.hashCode();
       return str.hashCode();
    }

    public WriteDetailOutCtx clone() {
        WriteDetailOutCtx cloneObj = new WriteDetailOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ServiceRptRec = new Sys201ServiceRptRec();
        cloneObj.sys201ServiceRptRec.set(sys201ServiceRptRec.getClonedField());
        cloneObj.detailData705 = new DetailData705();
        cloneObj.detailData705.set(detailData705.getClonedField());
        cloneObj.detailData1705 = new DetailData1705();
        cloneObj.detailData1705.set(detailData1705.getClonedField());
        return cloneObj;
    }

    }

    public WriteDetailOutCtx getWriteDetailOutCtx() {
            return new WriteDetailOutCtx();
    }
     public class FormatDataInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



	public BigDecimal getSuccessPercent400() throws CFException{      
   		return work.getSuccessPercent400();
	}

    public char[] getSuccessPercent400String() throws CFException {
          return  work.getSuccessPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SuccessPercent400 with the passed number
	 *	@param number
	 */
	public void setSuccessPercent400(BigDecimal number)  throws CFException{
		work.setSuccessPercent400(number);
   }

	public BigDecimal getErrPercent400() throws CFException{      
   		return work.getErrPercent400();
	}

    public char[] getErrPercent400String() throws CFException {
          return  work.getErrPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ErrPercent400 with the passed number
	 *	@param number
	 */
	public void setErrPercent400(BigDecimal number)  throws CFException{
		work.setErrPercent400(number);
   }

public int getHighElapseTime400() throws CFException {  
        return work.getHighElapseTime400();
}
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *	@param number
	 */
	public void setHighElapseTime400(int number)  throws CFException{
		work.setHighElapseTime400(number);
	}


	public void setHighElapseTime400(long number)  throws CFException{
	    work.setHighElapseTime400(number);
	}
	

public int getLowElapseTime400() throws CFException {  
        return work.getLowElapseTime400();
}
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *	@param number
	 */
	public void setLowElapseTime400(int number)  throws CFException{
		work.setLowElapseTime400(number);
	}


	public void setLowElapseTime400(long number)  throws CFException{
	    work.setLowElapseTime400(number);
	}
	

	public BigDecimal getAvgElapsed400() throws CFException{      
   		return work.getAvgElapsed400();
	}

    public char[] getAvgElapsed400String() throws CFException {
          return  work.getAvgElapsed400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update AvgElapsed400 with the passed number
	 *	@param number
	 */
	public void setAvgElapsed400(BigDecimal number)  throws CFException{
		work.setAvgElapsed400(number);
   }

public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public FormatDataOutCtx getFormatDataOutCtx() {
            return new FormatDataOutCtx();
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

    public FormatDataInCtx clone() {
        FormatDataInCtx cloneObj = new FormatDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatDataInCtx getFormatDataInCtx() {
            return new FormatDataInCtx();
    }
     public class FormatDataOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of totServiceCnt800
	 *	@return totServiceCnt800
	 */
   public char[] getTotServiceCnt800() throws CFException  {              
   		return work.getTotServiceCnt800();
   }

  
	/**
	*  set variable totServiceCnt800
	*  @param value
	**/
   public void setTotServiceCnt800(char[] value) throws CFException {
      work.setTotServiceCnt800(value);
   } 

     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex) throws CFException {
      work.setTotServiceCnt800(source, sourceIndex);
   	
   }
   
   public void setTotServiceCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotServiceCnt800 with another Field
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source) {
      work.setTotServiceCnt800(source);
   }  
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotServiceCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotServiceCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTotServiceCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotServiceCnt400() throws CFException {  
        return work.getTotServiceCnt400();
}
	/**
	 * 	Update TotServiceCnt400 with the passed value
	 *	@param number
	 */
	public void setTotServiceCnt400(long number)  throws CFException{
		work.setTotServiceCnt400(number);
	}



	public BigDecimal getSuccessPercent400() throws CFException{      
   		return work.getSuccessPercent400();
	}

    public char[] getSuccessPercent400String() throws CFException {
          return  work.getSuccessPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SuccessPercent400 with the passed number
	 *	@param number
	 */
	public void setSuccessPercent400(BigDecimal number)  throws CFException{
		work.setSuccessPercent400(number);
   }

	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getErrPercent400() throws CFException{      
   		return work.getErrPercent400();
	}

    public char[] getErrPercent400String() throws CFException {
          return  work.getErrPercent400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ErrPercent400 with the passed number
	 *	@param number
	 */
	public void setErrPercent400(BigDecimal number)  throws CFException{
		work.setErrPercent400(number);
   }

public int getHighElapseTime400() throws CFException {  
        return work.getHighElapseTime400();
}
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *	@param number
	 */
	public void setHighElapseTime400(int number)  throws CFException{
		work.setHighElapseTime400(number);
	}


	public void setHighElapseTime400(long number)  throws CFException{
	    work.setHighElapseTime400(number);
	}
	

public int getLowElapseTime400() throws CFException {  
        return work.getLowElapseTime400();
}
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *	@param number
	 */
	public void setLowElapseTime400(int number)  throws CFException{
		work.setLowElapseTime400(number);
	}


	public void setLowElapseTime400(long number)  throws CFException{
	    work.setLowElapseTime400(number);
	}
	

public long getSuccessCnt400() throws CFException {  
        return work.getSuccessCnt400();
}
	/**
	 * 	Update SuccessCnt400 with the passed value
	 *	@param number
	 */
	public void setSuccessCnt400(long number)  throws CFException{
		work.setSuccessCnt400(number);
	}



public long getErrorCnt400() throws CFException {  
        return work.getErrorCnt400();
}
	/**
	 * 	Update ErrorCnt400 with the passed value
	 *	@param number
	 */
	public void setErrorCnt400(long number)  throws CFException{
		work.setErrorCnt400(number);
	}



	/**
	 *	Returns the value of highElapseTime800
	 *	@return highElapseTime800
	 */
   public char[] getHighElapseTime800() throws CFException  {              
   		return work.getHighElapseTime800();
   }

  
	/**
	*  set variable highElapseTime800
	*  @param value
	**/
   public void setHighElapseTime800(char[] value) throws CFException {
      work.setHighElapseTime800(value);
   } 

     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setHighElapseTime800(source, sourceIndex);
   	
   }
   
   public void setHighElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HighElapseTime800 with another Field
	 *	@param value
	 */
   public void setHighElapseTime800(Field source) {
      work.setHighElapseTime800(source);
   }  
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HighElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setHighElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successCnt800
	 *	@return successCnt800
	 */
   public char[] getSuccessCnt800() throws CFException  {              
   		return work.getSuccessCnt800();
   }

  
	/**
	*  set variable successCnt800
	*  @param value
	**/
   public void setSuccessCnt800(char[] value) throws CFException {
      work.setSuccessCnt800(value);
   } 

     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessCnt800(source, sourceIndex);
   	
   }
   
   public void setSuccessCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessCnt800 with another Field
	 *	@param value
	 */
   public void setSuccessCnt800(Field source) {
      work.setSuccessCnt800(source);
   }  
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of unsuccessPercent800
	 *	@return unsuccessPercent800
	 */
   public char[] getUnsuccessPercent800() throws CFException  {              
   		return work.getUnsuccessPercent800();
   }

  
	/**
	*  set variable unsuccessPercent800
	*  @param value
	**/
   public void setUnsuccessPercent800(char[] value) throws CFException {
      work.setUnsuccessPercent800(value);
   } 

     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setUnsuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setUnsuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UnsuccessPercent800 with another Field
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source) {
      work.setUnsuccessPercent800(source);
   }  
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UnsuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnsuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setUnsuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getAvgElapsed400() throws CFException{      
   		return work.getAvgElapsed400();
	}

    public char[] getAvgElapsed400String() throws CFException {
          return  work.getAvgElapsed400().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update AvgElapsed400 with the passed number
	 *	@param number
	 */
	public void setAvgElapsed400(BigDecimal number)  throws CFException{
		work.setAvgElapsed400(number);
   }

	/**
	 *	Returns the value of lowElapseTime800
	 *	@return lowElapseTime800
	 */
   public char[] getLowElapseTime800() throws CFException  {              
   		return work.getLowElapseTime800();
   }

  
	/**
	*  set variable lowElapseTime800
	*  @param value
	**/
   public void setLowElapseTime800(char[] value) throws CFException {
      work.setLowElapseTime800(value);
   } 

     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex) throws CFException {
      work.setLowElapseTime800(source, sourceIndex);
   	
   }
   
   public void setLowElapseTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LowElapseTime800 with another Field
	 *	@param value
	 */
   public void setLowElapseTime800(Field source) {
      work.setLowElapseTime800(source);
   }  
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LowElapseTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapseTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setLowElapseTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCnt800
	 *	@return errorCnt800
	 */
   public char[] getErrorCnt800() throws CFException  {              
   		return work.getErrorCnt800();
   }

  
	/**
	*  set variable errorCnt800
	*  @param value
	**/
   public void setErrorCnt800(char[] value) throws CFException {
      work.setErrorCnt800(value);
   } 

     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex) throws CFException {
      work.setErrorCnt800(source, sourceIndex);
   	
   }
   
   public void setErrorCnt800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorCnt800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorCnt800 with another Field
	 *	@param value
	 */
   public void setErrorCnt800(Field source) {
      work.setErrorCnt800(source);
   }  
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorCnt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCnt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorCnt800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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

    public FormatDataOutCtx clone() {
        FormatDataOutCtx cloneObj = new FormatDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FormatDataOutCtx getFormatDataOutCtx() {
            return new FormatDataOutCtx();
    }
     public class BuildServiceIdDescInCtx implements Cloneable {
     Sf535ZlogServicesGroup sf535ZlogServicesGroup = Sf328010Ctx.this.getSf535ZlogServicesGroup();
     Work work = Sf328010Ctx.this.getWork();
     DetailData1705 detailData1705 = Sf328010Ctx.this.getDetailData1705();

	/**
	 *	Returns the value of sf535ZlogServiceEntry
	 *	@return sf535ZlogServiceEntry
	 */   
	 public Sf535ZlogServiceEntry getSf535ZlogServiceEntry(int index) {
   	return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index);
   }

    public List<Sf535ZlogServiceEntry> getSf535ZlogServiceEntry() {
        return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry();
    }
   /**
	* 	Update Sf535ZlogServiceEntry with the passed value
	*	@param value
	*/
   public void setSf535ZlogServiceEntry(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().setSf535ZlogServiceEntry((index),value);
   }   


	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

	/**
	 *	Returns the value of sf535ZservDesc
	 *	@return sf535ZservDesc
	 */
   public char[] getSf535ZservDesc(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZservDesc();
   }

  
	/**
	*  set variable sf535ZservDesc
	*  @param value
	**/
   public void setSf535ZservDesc(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(value);
   } 

     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex);
   	
   }
   
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZservDesc with another Field
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source);
   }  
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf535ZlogService
	 *	@return sf535ZlogService
	 */
   public char[] getSf535ZlogService(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZlogService();
   }

  
	/**
	*  set variable sf535ZlogService
	*  @param value
	**/
   public void setSf535ZlogService(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(value);
   } 

     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogService(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex);
   	
   }
   
   public void setSf535ZlogService(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZlogService with another Field
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source);
   }  
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf535ZlogServiceTable
	 *	@return sf535ZlogServiceTable
	 */   
	 public Sf535ZlogServiceTable getSf535ZlogServiceTable() {
   	return sf535ZlogServicesGroup.getSf535ZlogServiceTable();
   }

   /**
	* 	Update Sf535ZlogServiceTable with the passed value
	*	@param value
	*/
   public void setSf535ZlogServiceTable(char[] value) throws CFException {
      sf535ZlogServicesGroup.setSf535ZlogServiceTable(value);
   }   

     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZlogServiceTable with another Field
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source);
   }  
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source, int sourceIndex,int sourceLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of litUnknwn300
	 *	@return litUnknwn300
	 */
   public char[] getLitUnknwn300() throws CFException  {              
   		return work.getLitUnknwn300();
   }

  
	/**
	*  set variable litUnknwn300
	*  @param value
	**/
   public void setLitUnknwn300(char[] value) throws CFException {
      work.setLitUnknwn300(value);
   } 


public void setSf535X(int sf535X) { 
    Sf328010Ctx.this.sf535X = sf535X;
}

public int getSf535X() { 
    return Sf328010Ctx.this.sf535X;
}
	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public BuildServiceIdDescOutCtx getBuildServiceIdDescOutCtx() {
            return new BuildServiceIdDescOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf535ZlogServicesGroup.hashCode();
        str += work.hashCode();
        str += detailData1705.hashCode();
       return str.hashCode();
    }

    public BuildServiceIdDescInCtx clone() {
        BuildServiceIdDescInCtx cloneObj = new BuildServiceIdDescInCtx();
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.detailData1705 = new DetailData1705();
        cloneObj.detailData1705.set(detailData1705.getClonedField());
        return cloneObj;
    }

    }

    public BuildServiceIdDescInCtx getBuildServiceIdDescInCtx() {
            return new BuildServiceIdDescInCtx();
    }
     public class BuildServiceIdDescOutCtx implements Cloneable {
     Sf535ZlogServicesGroup sf535ZlogServicesGroup = Sf328010Ctx.this.getSf535ZlogServicesGroup();
     Work work = Sf328010Ctx.this.getWork();
     DetailData1705 detailData1705 = Sf328010Ctx.this.getDetailData1705();

	/**
	 *	Returns the value of sf535ZservDesc
	 *	@return sf535ZservDesc
	 */
   public char[] getSf535ZservDesc(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZservDesc();
   }

  
	/**
	*  set variable sf535ZservDesc
	*  @param value
	**/
   public void setSf535ZservDesc(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(value);
   } 

     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex);
   	
   }
   
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZservDesc with another Field
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source);
   }  
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of litUnknwn300
	 *	@return litUnknwn300
	 */
   public char[] getLitUnknwn300() throws CFException  {              
   		return work.getLitUnknwn300();
   }

  
	/**
	*  set variable litUnknwn300
	*  @param value
	**/
   public void setLitUnknwn300(char[] value) throws CFException {
      work.setLitUnknwn300(value);
   } 


public void setSf535X(int sf535X) { 
    Sf328010Ctx.this.sf535X = sf535X;
}

public int getSf535X() { 
    return Sf328010Ctx.this.sf535X;
}
	/**
	 *	Returns the value of serviceName705
	 *	@return serviceName705
	 */
   public char[] getServiceName705() throws CFException  {              
   		return detailData1705.getDetail1705().getServiceName705();
   }

  
	/**
	*  set variable serviceName705
	*  @param value
	**/
   public void setServiceName705(char[] value) throws CFException {
      detailData1705.getDetail1705().setServiceName705(value);
   } 

     /**
	 * 	Update ServiceName705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceName705(char[] source, int sourceIndex) throws CFException {
      detailData1705.getDetail1705().setServiceName705(source, sourceIndex);
   	
   }
   
   public void setServiceName705(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData1705.getDetail1705().setServiceName705(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServiceName705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceName705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData1705.getDetail1705().setServiceName705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServiceName705 with another Field
	 *	@param value
	 */
   public void setServiceName705(Field source) {
      detailData1705.getDetail1705().setServiceName705(source);
   }  
   
     /**
	 * 	Update ServiceName705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceName705(Field source, int sourceIndex,int sourceLen) {
      detailData1705.getDetail1705().setServiceName705(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServiceName705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceName705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData1705.getDetail1705().setServiceName705(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf535ZlogServicesGroup.hashCode();
        str += work.hashCode();
        str += detailData1705.hashCode();
       return str.hashCode();
    }

    public BuildServiceIdDescOutCtx clone() {
        BuildServiceIdDescOutCtx cloneObj = new BuildServiceIdDescOutCtx();
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.detailData1705 = new DetailData1705();
        cloneObj.detailData1705.set(detailData1705.getClonedField());
        return cloneObj;
    }

    }

    public BuildServiceIdDescOutCtx getBuildServiceIdDescOutCtx() {
            return new BuildServiceIdDescOutCtx();
    }
     public class MoveDataHoldInCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}



        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public MoveDataHoldOutCtx getMoveDataHoldOutCtx() {
            return new MoveDataHoldOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveDataHoldInCtx clone() {
        MoveDataHoldInCtx cloneObj = new MoveDataHoldInCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveDataHoldInCtx getMoveDataHoldInCtx() {
            return new MoveDataHoldInCtx();
    }
     public class MoveDataHoldOutCtx implements Cloneable {
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf328010Ctx.this.getSf528ExtractZLogRec();
     Work work = Sf328010Ctx.this.getWork();

public int getHighElapseTime400() throws CFException {  
        return work.getHighElapseTime400();
}
	/**
	 * 	Update HighElapseTime400 with the passed value
	 *	@param number
	 */
	public void setHighElapseTime400(int number)  throws CFException{
		work.setHighElapseTime400(number);
	}


	public void setHighElapseTime400(long number)  throws CFException{
	    work.setHighElapseTime400(number);
	}
	

public int getLowElapseTime400() throws CFException {  
        return work.getLowElapseTime400();
}
	/**
	 * 	Update LowElapseTime400 with the passed value
	 *	@param number
	 */
	public void setLowElapseTime400(int number)  throws CFException{
		work.setLowElapseTime400(number);
	}


	public void setLowElapseTime400(long number)  throws CFException{
	    work.setLowElapseTime400(number);
	}
	

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


	/**
	 *	Returns the value of holdServiceId800
	 *	@return holdServiceId800
	 */
   public char[] getHoldServiceId800() throws CFException  {              
   		return work.getHoldServiceId800();
   }

  
	/**
	*  set variable holdServiceId800
	*  @param value
	**/
   public void setHoldServiceId800(char[] value) throws CFException {
      work.setHoldServiceId800(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf528ExtractZLogRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoveDataHoldOutCtx clone() {
        MoveDataHoldOutCtx cloneObj = new MoveDataHoldOutCtx();
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoveDataHoldOutCtx getMoveDataHoldOutCtx() {
            return new MoveDataHoldOutCtx();
    }
     public class BuildMonthInCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Test condition "09" for isMnthMmNumSep88100()
	 *	@return  Returns true if isMnthMmNumSep88100() is "09"
	 */
   public boolean isMnthMmNumSep88100() throws CFException {
      return work.isMnthMmNumSep88100();
   }

	/**
	*  set values "09"
	*/
   	public void setMnthMmNumSep88100True()  throws CFException{  			
    	work.setMnthMmNumSep88100True();
   	}
	/**
	 *	Returns the value of monthOct300
	 *	@return monthOct300
	 */
   public char[] getMonthOct300() throws CFException  {              
   		return work.getMonthOct300();
   }

  
	/**
	*  set variable monthOct300
	*  @param value
	**/
   public void setMonthOct300(char[] value) throws CFException {
      work.setMonthOct300(value);
   } 

	/**
	 *	Test condition "01" for isMnthMmNumJan88100()
	 *	@return  Returns true if isMnthMmNumJan88100() is "01"
	 */
   public boolean isMnthMmNumJan88100() throws CFException {
      return work.isMnthMmNumJan88100();
   }

	/**
	*  set values "01"
	*/
   	public void setMnthMmNumJan88100True()  throws CFException{  			
    	work.setMnthMmNumJan88100True();
   	}
	/**
	 *	Test condition "11" for isMnthMmNumNov88100()
	 *	@return  Returns true if isMnthMmNumNov88100() is "11"
	 */
   public boolean isMnthMmNumNov88100() throws CFException {
      return work.isMnthMmNumNov88100();
   }

	/**
	*  set values "11"
	*/
   	public void setMnthMmNumNov88100True()  throws CFException{  			
    	work.setMnthMmNumNov88100True();
   	}
	/**
	 *	Returns the value of monthMar300
	 *	@return monthMar300
	 */
   public char[] getMonthMar300() throws CFException  {              
   		return work.getMonthMar300();
   }

  
	/**
	*  set variable monthMar300
	*  @param value
	**/
   public void setMonthMar300(char[] value) throws CFException {
      work.setMonthMar300(value);
   } 

	/**
	 *	Test condition "03" for isMnthMmNumMar88100()
	 *	@return  Returns true if isMnthMmNumMar88100() is "03"
	 */
   public boolean isMnthMmNumMar88100() throws CFException {
      return work.isMnthMmNumMar88100();
   }

	/**
	*  set values "03"
	*/
   	public void setMnthMmNumMar88100True()  throws CFException{  			
    	work.setMnthMmNumMar88100True();
   	}
	/**
	 *	Test condition "10" for isMnthMmNumOct88100()
	 *	@return  Returns true if isMnthMmNumOct88100() is "10"
	 */
   public boolean isMnthMmNumOct88100() throws CFException {
      return work.isMnthMmNumOct88100();
   }

	/**
	*  set values "10"
	*/
   	public void setMnthMmNumOct88100True()  throws CFException{  			
    	work.setMnthMmNumOct88100True();
   	}
	/**
	 *	Returns the value of monthAug300
	 *	@return monthAug300
	 */
   public char[] getMonthAug300() throws CFException  {              
   		return work.getMonthAug300();
   }

  
	/**
	*  set variable monthAug300
	*  @param value
	**/
   public void setMonthAug300(char[] value) throws CFException {
      work.setMonthAug300(value);
   } 

	/**
	 *	Returns the value of monthJul300
	 *	@return monthJul300
	 */
   public char[] getMonthJul300() throws CFException  {              
   		return work.getMonthJul300();
   }

  
	/**
	*  set variable monthJul300
	*  @param value
	**/
   public void setMonthJul300(char[] value) throws CFException {
      work.setMonthJul300(value);
   } 

	/**
	 *	Returns the value of monthMay300
	 *	@return monthMay300
	 */
   public char[] getMonthMay300() throws CFException  {              
   		return work.getMonthMay300();
   }

  
	/**
	*  set variable monthMay300
	*  @param value
	**/
   public void setMonthMay300(char[] value) throws CFException {
      work.setMonthMay300(value);
   } 

	/**
	 *	Returns the value of monthJan300
	 *	@return monthJan300
	 */
   public char[] getMonthJan300() throws CFException  {              
   		return work.getMonthJan300();
   }

  
	/**
	*  set variable monthJan300
	*  @param value
	**/
   public void setMonthJan300(char[] value) throws CFException {
      work.setMonthJan300(value);
   } 

	/**
	 *	Returns the value of monthDec300
	 *	@return monthDec300
	 */
   public char[] getMonthDec300() throws CFException  {              
   		return work.getMonthDec300();
   }

  
	/**
	*  set variable monthDec300
	*  @param value
	**/
   public void setMonthDec300(char[] value) throws CFException {
      work.setMonthDec300(value);
   } 

	/**
	 *	Test condition "02" for isMnthMmNumFeb88100()
	 *	@return  Returns true if isMnthMmNumFeb88100() is "02"
	 */
   public boolean isMnthMmNumFeb88100() throws CFException {
      return work.isMnthMmNumFeb88100();
   }

	/**
	*  set values "02"
	*/
   	public void setMnthMmNumFeb88100True()  throws CFException{  			
    	work.setMnthMmNumFeb88100True();
   	}
	/**
	 *	Test condition "04" for isMnthMmNumApr88100()
	 *	@return  Returns true if isMnthMmNumApr88100() is "04"
	 */
   public boolean isMnthMmNumApr88100() throws CFException {
      return work.isMnthMmNumApr88100();
   }

	/**
	*  set values "04"
	*/
   	public void setMnthMmNumApr88100True()  throws CFException{  			
    	work.setMnthMmNumApr88100True();
   	}
	/**
	 *	Test condition "07" for isMnthMmNumJul88100()
	 *	@return  Returns true if isMnthMmNumJul88100() is "07"
	 */
   public boolean isMnthMmNumJul88100() throws CFException {
      return work.isMnthMmNumJul88100();
   }

	/**
	*  set values "07"
	*/
   	public void setMnthMmNumJul88100True()  throws CFException{  			
    	work.setMnthMmNumJul88100True();
   	}
	/**
	 *	Returns the value of monthJun300
	 *	@return monthJun300
	 */
   public char[] getMonthJun300() throws CFException  {              
   		return work.getMonthJun300();
   }

  
	/**
	*  set variable monthJun300
	*  @param value
	**/
   public void setMonthJun300(char[] value) throws CFException {
      work.setMonthJun300(value);
   } 

	/**
	 *	Returns the value of monthFeb300
	 *	@return monthFeb300
	 */
   public char[] getMonthFeb300() throws CFException  {              
   		return work.getMonthFeb300();
   }

  
	/**
	*  set variable monthFeb300
	*  @param value
	**/
   public void setMonthFeb300(char[] value) throws CFException {
      work.setMonthFeb300(value);
   } 

	/**
	 *	Returns the value of monthNov300
	 *	@return monthNov300
	 */
   public char[] getMonthNov300() throws CFException  {              
   		return work.getMonthNov300();
   }

  
	/**
	*  set variable monthNov300
	*  @param value
	**/
   public void setMonthNov300(char[] value) throws CFException {
      work.setMonthNov300(value);
   } 

	/**
	 *	Test condition "08" for isMnthMmNumAug88100()
	 *	@return  Returns true if isMnthMmNumAug88100() is "08"
	 */
   public boolean isMnthMmNumAug88100() throws CFException {
      return work.isMnthMmNumAug88100();
   }

	/**
	*  set values "08"
	*/
   	public void setMnthMmNumAug88100True()  throws CFException{  			
    	work.setMnthMmNumAug88100True();
   	}
	/**
	 *	Test condition "12" for isMnthMmNumDec88100()
	 *	@return  Returns true if isMnthMmNumDec88100() is "12"
	 */
   public boolean isMnthMmNumDec88100() throws CFException {
      return work.isMnthMmNumDec88100();
   }

	/**
	*  set values "12"
	*/
   	public void setMnthMmNumDec88100True()  throws CFException{  			
    	work.setMnthMmNumDec88100True();
   	}
	/**
	 *	Returns the value of monthApr300
	 *	@return monthApr300
	 */
   public char[] getMonthApr300() throws CFException  {              
   		return work.getMonthApr300();
   }

  
	/**
	*  set variable monthApr300
	*  @param value
	**/
   public void setMonthApr300(char[] value) throws CFException {
      work.setMonthApr300(value);
   } 

	/**
	 *	Test condition "06" for isMnthMmNumJun88100()
	 *	@return  Returns true if isMnthMmNumJun88100() is "06"
	 */
   public boolean isMnthMmNumJun88100() throws CFException {
      return work.isMnthMmNumJun88100();
   }

	/**
	*  set values "06"
	*/
   	public void setMnthMmNumJun88100True()  throws CFException{  			
    	work.setMnthMmNumJun88100True();
   	}
	/**
	 *	Test condition "05" for isMnthMmNumMay88100()
	 *	@return  Returns true if isMnthMmNumMay88100() is "05"
	 */
   public boolean isMnthMmNumMay88100() throws CFException {
      return work.isMnthMmNumMay88100();
   }

	/**
	*  set values "05"
	*/
   	public void setMnthMmNumMay88100True()  throws CFException{  			
    	work.setMnthMmNumMay88100True();
   	}
	/**
	 *	Returns the value of monthSep300
	 *	@return monthSep300
	 */
   public char[] getMonthSep300() throws CFException  {              
   		return work.getMonthSep300();
   }

  
	/**
	*  set variable monthSep300
	*  @param value
	**/
   public void setMonthSep300(char[] value) throws CFException {
      work.setMonthSep300(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public BuildMonthOutCtx getBuildMonthOutCtx() {
            return new BuildMonthOutCtx();
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

    public BuildMonthInCtx clone() {
        BuildMonthInCtx cloneObj = new BuildMonthInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildMonthInCtx getBuildMonthInCtx() {
            return new BuildMonthInCtx();
    }
     public class BuildMonthOutCtx implements Cloneable {
     Work work = Sf328010Ctx.this.getWork();

	/**
	 *	Returns the value of monthOct300
	 *	@return monthOct300
	 */
   public char[] getMonthOct300() throws CFException  {              
   		return work.getMonthOct300();
   }

  
	/**
	*  set variable monthOct300
	*  @param value
	**/
   public void setMonthOct300(char[] value) throws CFException {
      work.setMonthOct300(value);
   } 

	/**
	 *	Returns the value of monthMar300
	 *	@return monthMar300
	 */
   public char[] getMonthMar300() throws CFException  {              
   		return work.getMonthMar300();
   }

  
	/**
	*  set variable monthMar300
	*  @param value
	**/
   public void setMonthMar300(char[] value) throws CFException {
      work.setMonthMar300(value);
   } 

	/**
	 *	Returns the value of monthAug300
	 *	@return monthAug300
	 */
   public char[] getMonthAug300() throws CFException  {              
   		return work.getMonthAug300();
   }

  
	/**
	*  set variable monthAug300
	*  @param value
	**/
   public void setMonthAug300(char[] value) throws CFException {
      work.setMonthAug300(value);
   } 

	/**
	 *	Returns the value of monthJul300
	 *	@return monthJul300
	 */
   public char[] getMonthJul300() throws CFException  {              
   		return work.getMonthJul300();
   }

  
	/**
	*  set variable monthJul300
	*  @param value
	**/
   public void setMonthJul300(char[] value) throws CFException {
      work.setMonthJul300(value);
   } 

	/**
	 *	Returns the value of monthMay300
	 *	@return monthMay300
	 */
   public char[] getMonthMay300() throws CFException  {              
   		return work.getMonthMay300();
   }

  
	/**
	*  set variable monthMay300
	*  @param value
	**/
   public void setMonthMay300(char[] value) throws CFException {
      work.setMonthMay300(value);
   } 

	/**
	 *	Returns the value of monthJan300
	 *	@return monthJan300
	 */
   public char[] getMonthJan300() throws CFException  {              
   		return work.getMonthJan300();
   }

  
	/**
	*  set variable monthJan300
	*  @param value
	**/
   public void setMonthJan300(char[] value) throws CFException {
      work.setMonthJan300(value);
   } 

	/**
	 *	Returns the value of monthDec300
	 *	@return monthDec300
	 */
   public char[] getMonthDec300() throws CFException  {              
   		return work.getMonthDec300();
   }

  
	/**
	*  set variable monthDec300
	*  @param value
	**/
   public void setMonthDec300(char[] value) throws CFException {
      work.setMonthDec300(value);
   } 

	/**
	 *	Returns the value of monthJun300
	 *	@return monthJun300
	 */
   public char[] getMonthJun300() throws CFException  {              
   		return work.getMonthJun300();
   }

  
	/**
	*  set variable monthJun300
	*  @param value
	**/
   public void setMonthJun300(char[] value) throws CFException {
      work.setMonthJun300(value);
   } 

	/**
	 *	Returns the value of monthFeb300
	 *	@return monthFeb300
	 */
   public char[] getMonthFeb300() throws CFException  {              
   		return work.getMonthFeb300();
   }

  
	/**
	*  set variable monthFeb300
	*  @param value
	**/
   public void setMonthFeb300(char[] value) throws CFException {
      work.setMonthFeb300(value);
   } 

	/**
	 *	Returns the value of monthNov300
	 *	@return monthNov300
	 */
   public char[] getMonthNov300() throws CFException  {              
   		return work.getMonthNov300();
   }

  
	/**
	*  set variable monthNov300
	*  @param value
	**/
   public void setMonthNov300(char[] value) throws CFException {
      work.setMonthNov300(value);
   } 

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of monthApr300
	 *	@return monthApr300
	 */
   public char[] getMonthApr300() throws CFException  {              
   		return work.getMonthApr300();
   }

  
	/**
	*  set variable monthApr300
	*  @param value
	**/
   public void setMonthApr300(char[] value) throws CFException {
      work.setMonthApr300(value);
   } 

	/**
	 *	Returns the value of monthSep300
	 *	@return monthSep300
	 */
   public char[] getMonthSep300() throws CFException  {              
   		return work.getMonthSep300();
   }

  
	/**
	*  set variable monthSep300
	*  @param value
	**/
   public void setMonthSep300(char[] value) throws CFException {
      work.setMonthSep300(value);
   } 


        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
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

    public BuildMonthOutCtx clone() {
        BuildMonthOutCtx cloneObj = new BuildMonthOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildMonthOutCtx getBuildMonthOutCtx() {
            return new BuildMonthOutCtx();
    }
     public class TerminateProgramInCtx implements Cloneable {
     Message6008001 message6008001 = Sf328010Ctx.this.getMessage6008001();
     Work work = Sf328010Ctx.this.getWork();
     Message6008002 message6008002 = Sf328010Ctx.this.getMessage6008002();

public long getZLogCnt400() throws CFException {  
        return work.getZLogCnt400();
}
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(long number)  throws CFException{
		work.setZLogCnt400(number);
	}



	/**
	 *	Returns the value of message6008001
	 *	@return message6008001
	 */   
	 public Message6008001 getMessage6008001() {
   	return message6008001;
   }


	/**
	 *	Returns the value of message6008999
	 *	@return message6008999
	 */
   public char[] getMessage6008999() throws CFException  {              
   		return work.getMessage6008999();
   }

  
	/**
	*  set variable message6008999
	*  @param value
	**/
   public void setMessage6008999(char[] value) throws CFException {
      work.setMessage6008999(value);
   } 

	/**
	 *	Returns the value of eojMessage6009500
	 *	@return eojMessage6009500
	 */
   public char[] getEojMessage6009500() throws CFException  {              
   		return work.getEojMessage6009500();
   }

  
	/**
	*  set variable eojMessage6009500
	*  @param value
	**/
   public void setEojMessage6009500(char[] value) throws CFException {
      work.setEojMessage6009500(value);
   } 

	/**
	 *	Returns the value of message6008000
	 *	@return message6008000
	 */
   public char[] getMessage6008000() throws CFException  {              
   		return work.getMessage6008000();
   }

  
	/**
	*  set variable message6008000
	*  @param value
	**/
   public void setMessage6008000(char[] value) throws CFException {
      work.setMessage6008000(value);
   } 

	/**
	 *	Returns the value of message6008002
	 *	@return message6008002
	 */   
	 public Message6008002 getMessage6008002() {
   	return message6008002;
   }


public long getTotRecWritten400() throws CFException {  
        return work.getTotRecWritten400();
}
	/**
	 * 	Update TotRecWritten400 with the passed value
	 *	@param number
	 */
	public void setTotRecWritten400(long number)  throws CFException{
		work.setTotRecWritten400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }

        public TerminateProgramOutCtx getTerminateProgramOutCtx() {
            return new TerminateProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += message6008001.hashCode();
        str += work.hashCode();
        str += message6008002.hashCode();
       return str.hashCode();
    }

    public TerminateProgramInCtx clone() {
        TerminateProgramInCtx cloneObj = new TerminateProgramInCtx();
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramInCtx getTerminateProgramInCtx() {
            return new TerminateProgramInCtx();
    }
     public class TerminateProgramOutCtx implements Cloneable {
     Message6008001 message6008001 = Sf328010Ctx.this.getMessage6008001();
     Work work = Sf328010Ctx.this.getWork();
     Message6008002 message6008002 = Sf328010Ctx.this.getMessage6008002();

public long getZLogCnt400() throws CFException {  
        return work.getZLogCnt400();
}
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(long number)  throws CFException{
		work.setZLogCnt400(number);
	}



	/**
	 *	Returns the value of sys001Read6008001
	 *	@return sys001Read6008001
	 */
   public char[] getSys001Read6008001() throws CFException  {              
   		return message6008001.getSys001Read6008001();
   }

  
	/**
	*  set variable sys001Read6008001
	*  @param value
	**/
   public void setSys001Read6008001(char[] value) throws CFException {
      message6008001.setSys001Read6008001(value);
   } 

     /**
	 * 	Update Sys001Read6008001 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Read6008001(char[] source, int sourceIndex) throws CFException {
      message6008001.setSys001Read6008001(source, sourceIndex);
   	
   }
   
   public void setSys001Read6008001(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message6008001.setSys001Read6008001(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Read6008001 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Read6008001(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008001.setSys001Read6008001(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Read6008001 with another Field
	 *	@param value
	 */
   public void setSys001Read6008001(Field source) {
      message6008001.setSys001Read6008001(source);
   }  
   
     /**
	 * 	Update Sys001Read6008001 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Read6008001(Field source, int sourceIndex,int sourceLen) {
      message6008001.setSys001Read6008001(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Read6008001 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Read6008001(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008001.setSys001Read6008001(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201Written6008002
	 *	@return sys201Written6008002
	 */
   public char[] getSys201Written6008002() throws CFException  {              
   		return message6008002.getSys201Written6008002();
   }

  
	/**
	*  set variable sys201Written6008002
	*  @param value
	**/
   public void setSys201Written6008002(char[] value) throws CFException {
      message6008002.setSys201Written6008002(value);
   } 

     /**
	 * 	Update Sys201Written6008002 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Written6008002(char[] source, int sourceIndex) throws CFException {
      message6008002.setSys201Written6008002(source, sourceIndex);
   	
   }
   
   public void setSys201Written6008002(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message6008002.setSys201Written6008002(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201Written6008002 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Written6008002(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008002.setSys201Written6008002(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201Written6008002 with another Field
	 *	@param value
	 */
   public void setSys201Written6008002(Field source) {
      message6008002.setSys201Written6008002(source);
   }  
   
     /**
	 * 	Update Sys201Written6008002 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Written6008002(Field source, int sourceIndex,int sourceLen) {
      message6008002.setSys201Written6008002(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201Written6008002 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Written6008002(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008002.setSys201Written6008002(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotRecWritten400() throws CFException {  
        return work.getTotRecWritten400();
}
	/**
	 * 	Update TotRecWritten400 with the passed value
	 *	@param number
	 */
	public void setTotRecWritten400(long number)  throws CFException{
		work.setTotRecWritten400(number);
	}




        public Sf328010Ctx getSf328010Ctx() {
            return Sf328010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += message6008001.hashCode();
        str += work.hashCode();
        str += message6008002.hashCode();
       return str.hashCode();
    }

    public TerminateProgramOutCtx clone() {
        TerminateProgramOutCtx cloneObj = new TerminateProgramOutCtx();
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramOutCtx getTerminateProgramOutCtx() {
            return new TerminateProgramOutCtx();
    }
}
