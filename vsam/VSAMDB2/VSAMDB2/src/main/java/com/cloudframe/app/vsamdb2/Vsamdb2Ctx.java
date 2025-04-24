package com.cloudframe.app.vsamdb2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.vsamdb2.dto.Sqlca;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.vsamdb2.dto.Tbxmlwgt;
import com.cloudframe.app.vsamdb2.dto.Work;
import com.cloudframe.app.global.sharedvar.IrdExtrFileRec800;
import com.cloudframe.app.vsamdb2.dto.Sqlwarn;
import com.cloudframe.app.global.sharedvar.HoldIrdTable500;
import com.cloudframe.app.vsamdb2.dto.AbendMessage900;
import com.cloudframe.app.vsamdb2.file.records.Sys001IrdExtrFileRec;
import com.cloudframe.app.vsamdb2.dto.AbendMessage600;


@Context
public class Vsamdb2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    HoldIrdTable500 holdIrdTable500;
    IrdExtrFileRec800 irdExtrFileRec800;
    AbendMessage600 abendMessage600;
    AbendMessage900 abendMessage900;
    Tbxmlwgt tbxmlwgt;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Sys001IrdExtrFileRec sys001IrdExtrFileRec;
    Work work;
    Sqlca sqlca;


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


    public HoldIrdTable500 getHoldIrdTable500() {
        if (holdIrdTable500 == null) {
            holdIrdTable500 = globalCtx.getGlobalDto(HoldIrdTable500.class);
        }

        return holdIrdTable500;
    }

    public IrdExtrFileRec800 getIrdExtrFileRec800() {
        if (irdExtrFileRec800 == null) {
            irdExtrFileRec800 = globalCtx.getGlobalDto(IrdExtrFileRec800.class);
        }

        return irdExtrFileRec800;
    }

    public AbendMessage600 getAbendMessage600() {
        if (abendMessage600 == null) {
            abendMessage600 = new AbendMessage600();
        }

        return abendMessage600;
    }

    public void setAbendMessage600(AbendMessage600 abendMessage600) {
        this.abendMessage600 = abendMessage600;
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
    public Tbxmlwgt getTbxmlwgt() {
        if (tbxmlwgt == null) {
            tbxmlwgt = new Tbxmlwgt();
        }

        return tbxmlwgt;
    }

    public void setTbxmlwgt(Tbxmlwgt tbxmlwgt) {
        this.tbxmlwgt = tbxmlwgt;
    }
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
        if (sys001IrdExtrFileRec == null) {
            sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        }

        return sys001IrdExtrFileRec;
    }

    public void setSys001IrdExtrFileRec(Sys001IrdExtrFileRec sys001IrdExtrFileRec) {
        this.sys001IrdExtrFileRec = sys001IrdExtrFileRec;
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
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += holdIrdTable500.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
        str += abendMessage900.hashCode();
        str += tbxmlwgt.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Vsamdb2Ctx clone() {
        Vsamdb2Ctx cloneObj = new Vsamdb2Ctx();
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class DoInitializationInCtx implements Cloneable {
     Work work = Vsamdb2Ctx.this.getWork();

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

        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }

        public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
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

    public DoInitializationInCtx clone() {
        DoInitializationInCtx cloneObj = new DoInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationInCtx getDoInitializationInCtx() {
            return new DoInitializationInCtx();
    }
     public class DoInitializationOutCtx implements Cloneable {
     Work work = Vsamdb2Ctx.this.getWork();

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

        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
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

    public DoInitializationOutCtx clone() {
        DoInitializationOutCtx cloneObj = new DoInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
    }
     public class OpenInputSys001InCtx implements Cloneable {
     AbendMessage600 abendMessage600 = Vsamdb2Ctx.this.getAbendMessage600();
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Vsamdb2Ctx.this.getSys001IrdExtrFileRec();
     Work work = Vsamdb2Ctx.this.getWork();

	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */
   public char[] getSys001KeyAll() throws CFException  {              
   		return sys001IrdExtrFileRec.getSys001KeyAll();
   }

  
	/**
	*  set variable sys001KeyAll
	*  @param value
	**/
   public void setSys001KeyAll(char[] value) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(value);
   } 

     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex);
   	
   }
   
   public void setSys001KeyAll(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001KeyAll with another Field
	 *	@param value
	 */
   public void setSys001KeyAll(Field source) {
      sys001IrdExtrFileRec.setSys001KeyAll(source);
   }  
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001IrdExtrFileRec
	 *	@return sys001IrdExtrFileRec
	 */   
	 public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
   	return sys001IrdExtrFileRec;
   }



        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }

        public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001InCtx clone() {
        OpenInputSys001InCtx cloneObj = new OpenInputSys001InCtx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001InCtx getOpenInputSys001InCtx() {
            return new OpenInputSys001InCtx();
    }
     public class OpenInputSys001OutCtx implements Cloneable {
     AbendMessage600 abendMessage600 = Vsamdb2Ctx.this.getAbendMessage600();
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Vsamdb2Ctx.this.getSys001IrdExtrFileRec();
     Work work = Vsamdb2Ctx.this.getWork();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return work.isOpenAbendCode88300();
   }

	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True()  throws CFException{  			
    	work.setOpenAbendCode88300True();
   	}
	/**
	 *	Test condition "1200-OPEN-INPUT-SYS001" for isAbendPara120088300()
	 *	@return  Returns true if isAbendPara120088300() is "1200-OPEN-INPUT-SYS001"
	 */
   public boolean isAbendPara120088300() throws CFException {
      return work.isAbendPara120088300();
   }

	/**
	*  set values "1200-OPEN-INPUT-SYS001"
	*/
   	public void setAbendPara120088300True()  throws CFException{  			
    	work.setAbendPara120088300True();
   	}
	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return work.isSys001IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True()  throws CFException{  			
    	work.setSys001IoGood88200True();
   	}
	/**
	 *	Test condition "ERROR OPENING SYS001-FILE" for isAbendOpenSys00188600()
	 *	@return  Returns true if isAbendOpenSys00188600() is "ERROR OPENING SYS001-FILE"
	 */
   public boolean isAbendOpenSys00188600() throws CFException {
      return abendMessage600.isAbendOpenSys00188600();
   }

	/**
	*  set values "ERROR OPENING SYS001-FILE"
	*/
   	public void setAbendOpenSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendOpenSys00188600True();
   	}

        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001OutCtx clone() {
        OpenInputSys001OutCtx cloneObj = new OpenInputSys001OutCtx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
    }
     public class ProcessIrdExtrOutCtx implements Cloneable {
     AbendMessage600 abendMessage600 = Vsamdb2Ctx.this.getAbendMessage600();
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Vsamdb2Ctx.this.getSys001IrdExtrFileRec();
     Work work = Vsamdb2Ctx.this.getWork();

	/**
	 *	Test condition "2000-PROCESS-IRD-EXTR" for isAbendPara200088300()
	 *	@return  Returns true if isAbendPara200088300() is "2000-PROCESS-IRD-EXTR"
	 */
   public boolean isAbendPara200088300() throws CFException {
      return work.isAbendPara200088300();
   }

	/**
	*  set values "2000-PROCESS-IRD-EXTR"
	*/
   	public void setAbendPara200088300True()  throws CFException{  			
    	work.setAbendPara200088300True();
   	}
	/**
	 *	Test condition 3004 for isStrtAbendCode88300()
	 *	@return  Returns true if isStrtAbendCode88300() is 3004
	 */
   public boolean isStrtAbendCode88300() throws CFException {
      return work.isStrtAbendCode88300();
   }

	/**
	*  set values 3004
	*/
   	public void setStrtAbendCode88300True()  throws CFException{  			
    	work.setStrtAbendCode88300True();
   	}
	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return work.isOpenAbendCode88300();
   }

	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True()  throws CFException{  			
    	work.setOpenAbendCode88300True();
   	}
	/**
	 *	Test condition "ERROR READING SYS001-FILE" for isAbendReadSys00188600()
	 *	@return  Returns true if isAbendReadSys00188600() is "ERROR READING SYS001-FILE"
	 */
   public boolean isAbendReadSys00188600() throws CFException {
      return abendMessage600.isAbendReadSys00188600();
   }

	/**
	*  set values "ERROR READING SYS001-FILE"
	*/
   	public void setAbendReadSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendReadSys00188600True();
   	}
	/**
	 *	Test condition "1200-OPEN-INPUT-SYS001" for isAbendPara120088300()
	 *	@return  Returns true if isAbendPara120088300() is "1200-OPEN-INPUT-SYS001"
	 */
   public boolean isAbendPara120088300() throws CFException {
      return work.isAbendPara120088300();
   }

	/**
	*  set values "1200-OPEN-INPUT-SYS001"
	*/
   	public void setAbendPara120088300True()  throws CFException{  			
    	work.setAbendPara120088300True();
   	}
	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition "23" for isSys001NoRecs88200()
	 *	@return  Returns true if isSys001NoRecs88200() is "23"
	 */
   public boolean isSys001NoRecs88200() throws CFException {
      return work.isSys001NoRecs88200();
   }

	/**
	*  set values "23"
	*/
   	public void setSys001NoRecs88200True()  throws CFException{  			
    	work.setSys001NoRecs88200True();
   	}
	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return work.isSys001IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True()  throws CFException{  			
    	work.setSys001IoGood88200True();
   	}
	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */
   public char[] getSys001KeyAll() throws CFException  {              
   		return sys001IrdExtrFileRec.getSys001KeyAll();
   }

  
	/**
	*  set variable sys001KeyAll
	*  @param value
	**/
   public void setSys001KeyAll(char[] value) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(value);
   } 

     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex);
   	
   }
   
   public void setSys001KeyAll(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001KeyAll with another Field
	 *	@param value
	 */
   public void setSys001KeyAll(Field source) {
      sys001IrdExtrFileRec.setSys001KeyAll(source);
   }  
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001IrdExtrFileRec
	 *	@return sys001IrdExtrFileRec
	 */   
	 public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
   	return sys001IrdExtrFileRec;
   }


	/**
	 *	Test condition "ERROR CLOSING SYS001-FILE" for isAbendCloseSys00188600()
	 *	@return  Returns true if isAbendCloseSys00188600() is "ERROR CLOSING SYS001-FILE"
	 */
   public boolean isAbendCloseSys00188600() throws CFException {
      return abendMessage600.isAbendCloseSys00188600();
   }

	/**
	*  set values "ERROR CLOSING SYS001-FILE"
	*/
   	public void setAbendCloseSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendCloseSys00188600True();
   	}

        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrOutCtx clone() {
        ProcessIrdExtrOutCtx cloneObj = new ProcessIrdExtrOutCtx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrOutCtx getProcessIrdExtrOutCtx() {
            return new ProcessIrdExtrOutCtx();
    }
     public class SelectRedWidgetsInCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = Vsamdb2Ctx.this.getTbxmlwgt();
     Sqlca sqlca = Vsamdb2Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbxmlwgt.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbxmlwgt.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbxmlwgt.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbxmlwgt.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbxmlwgt.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbxmlwgt.setWidgetPrice(number);
   }

	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbxmlwgt.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbxmlwgt.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbxmlwgt.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }

        public SelectRedWidgetsOutCtx getSelectRedWidgetsOutCtx() {
            return new SelectRedWidgetsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectRedWidgetsInCtx clone() {
        SelectRedWidgetsInCtx cloneObj = new SelectRedWidgetsInCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectRedWidgetsInCtx getSelectRedWidgetsInCtx() {
            return new SelectRedWidgetsInCtx();
    }
     public class SelectRedWidgetsOutCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = Vsamdb2Ctx.this.getTbxmlwgt();
     Sqlca sqlca = Vsamdb2Ctx.this.getSqlca();

	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbxmlwgt.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbxmlwgt.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbxmlwgt.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectRedWidgetsOutCtx clone() {
        SelectRedWidgetsOutCtx cloneObj = new SelectRedWidgetsOutCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectRedWidgetsOutCtx getSelectRedWidgetsOutCtx() {
            return new SelectRedWidgetsOutCtx();
    }
     public class AbendProgramInCtx implements Cloneable {
     AbendMessage600 abendMessage600 = Vsamdb2Ctx.this.getAbendMessage600();
     AbendMessage900 abendMessage900 = Vsamdb2Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Vsamdb2Ctx.this.getIp60001EventLogWorkArea();
     Work work = Vsamdb2Ctx.this.getWork();

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return work.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      work.setAbendPara900(value);
   } 


        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }

        public AbendProgramOutCtx getAbendProgramOutCtx() {
            return new AbendProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendProgramInCtx clone() {
        AbendProgramInCtx cloneObj = new AbendProgramInCtx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramInCtx getAbendProgramInCtx() {
            return new AbendProgramInCtx();
    }
     public class AbendProgramOutCtx implements Cloneable {
     AbendMessage600 abendMessage600 = Vsamdb2Ctx.this.getAbendMessage600();
     AbendMessage900 abendMessage900 = Vsamdb2Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Vsamdb2Ctx.this.getIp60001EventLogWorkArea();
     Work work = Vsamdb2Ctx.this.getWork();

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
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of errorText900
	 *	@return errorText900
	 */
   public char[] getErrorText900() throws CFException  {              
   		return abendMessage900.getErrorText900();
   }

  
	/**
	*  set variable errorText900
	*  @param value
	**/
   public void setErrorText900(char[] value) throws CFException {
      abendMessage900.setErrorText900(value);
   } 

     /**
	 * 	Update ErrorText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setErrorText900(source, sourceIndex);
   	
   }
   
   public void setErrorText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setErrorText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setErrorText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorText900 with another Field
	 *	@param value
	 */
   public void setErrorText900(Field source) {
      abendMessage900.setErrorText900(source);
   }  
   
     /**
	 * 	Update ErrorText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setErrorText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setErrorText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Vsamdb2Ctx getVsamdb2Ctx() {
            return Vsamdb2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendProgramOutCtx clone() {
        AbendProgramOutCtx cloneObj = new AbendProgramOutCtx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramOutCtx getAbendProgramOutCtx() {
            return new AbendProgramOutCtx();
    }
}
