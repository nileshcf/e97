package com.cloudframe.app.mcvsam2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcvsam2.dto.AbendMessage600;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.mcvsam2.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.IrdExtrFileRec800;
import com.cloudframe.app.global.sharedvar.HoldIrdTable500;
import com.cloudframe.app.mcvsam2.file.records.Sys001IrdExtrFileRec;
import com.cloudframe.app.mcvsam2.dto.Work;
import com.cloudframe.app.mcvsam2.file.records.Sys001KeyAll;
import com.cloudframe.app.global.sharedvar.Key800;


@Context
public class Mcvsam2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sys001IrdExtrFileRec sys001IrdExtrFileRec;
    HoldIrdTable500 holdIrdTable500;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    AbendMessage900 abendMessage900;
    Work work;
    IrdExtrFileRec800 irdExtrFileRec800;
    AbendMessage600 abendMessage600;

    int irdIdx500;

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


    public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
        if (sys001IrdExtrFileRec == null) {
            sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        }

        return sys001IrdExtrFileRec;
    }

    public void setSys001IrdExtrFileRec(Sys001IrdExtrFileRec sys001IrdExtrFileRec) {
        this.sys001IrdExtrFileRec = sys001IrdExtrFileRec;
    }
    public HoldIrdTable500 getHoldIrdTable500() {
        if (holdIrdTable500 == null) {
            holdIrdTable500 = globalCtx.getGlobalDto(HoldIrdTable500.class);
        }

        return holdIrdTable500;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
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
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
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

    public int getIrdIdx500() {
        return irdIdx500;
    }

    public void setIrdIdx500(int irdIdx500) {
        this.irdIdx500 = irdIdx500;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += holdIrdTable500.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public Mcvsam2Ctx clone() {
        Mcvsam2Ctx cloneObj = new Mcvsam2Ctx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class DoInitializationInCtx implements Cloneable {
     Work work = Mcvsam2Ctx.this.getWork();

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

        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
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
     Work work = Mcvsam2Ctx.this.getWork();

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

        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
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
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     Work work = Mcvsam2Ctx.this.getWork();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

	/**
	 *	Returns the value of sys001IrdExtrFileRec
	 *	@return sys001IrdExtrFileRec
	 */   
	 public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
   	return sys001IrdExtrFileRec;
   }


	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */   
	 public Sys001KeyAll getSys001KeyAll() {
   	return sys001IrdExtrFileRec.getSys001KeyAll();
   }

   /**
	* 	Update Sys001KeyAll with the passed value
	*	@param value
	*/
   public void setSys001KeyAll(char[] value) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(value);
   }   

     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length  
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


        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
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
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001InCtx clone() {
        OpenInputSys001InCtx cloneObj = new OpenInputSys001InCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001InCtx getOpenInputSys001InCtx() {
            return new OpenInputSys001InCtx();
    }
     public class OpenInputSys001OutCtx implements Cloneable {
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     Work work = Mcvsam2Ctx.this.getWork();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

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


        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += work.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001OutCtx clone() {
        OpenInputSys001OutCtx cloneObj = new OpenInputSys001OutCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
    }
     public class ProcessIrdExtrInCtx implements Cloneable {
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     HoldIrdTable500 holdIrdTable500 = Mcvsam2Ctx.this.getHoldIrdTable500();
     Work work = Mcvsam2Ctx.this.getWork();
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam2Ctx.this.getIrdExtrFileRec800();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

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
	 *	Returns the value of key800
	 *	@return key800
	 */   
	 public Key800 getKey800() {
   	return irdExtrFileRec800.getKey800();
   }

   /**
	* 	Update Key800 with the passed value
	*	@param value
	*/
   public void setKey800(char[] value) throws CFException {
      irdExtrFileRec800.setKey800(value);
   }   

     /**
	 * 	Update Key800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Key800 with another Field
	 *	@param value
	 */
   public void setKey800(Field source) {
   	irdExtrFileRec800.setKey800(source);
   }  
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevKey800
	 *	@return prevKey800
	 */
   public char[] getPrevKey800() throws CFException  {              
   		return work.getPrevKey800();
   }

  
	/**
	*  set variable prevKey800
	*  @param value
	**/
   public void setPrevKey800(char[] value) throws CFException {
      work.setPrevKey800(value);
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


        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }

        public ProcessIrdExtrOutCtx getProcessIrdExtrOutCtx() {
            return new ProcessIrdExtrOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += holdIrdTable500.hashCode();
        str += work.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrInCtx clone() {
        ProcessIrdExtrInCtx cloneObj = new ProcessIrdExtrInCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrInCtx getProcessIrdExtrInCtx() {
            return new ProcessIrdExtrInCtx();
    }
     public class ProcessIrdExtrOutCtx implements Cloneable {
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     HoldIrdTable500 holdIrdTable500 = Mcvsam2Ctx.this.getHoldIrdTable500();
     Work work = Mcvsam2Ctx.this.getWork();
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam2Ctx.this.getIrdExtrFileRec800();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

	/**
	 *	Returns the value of sys001IrdExtrFileRec
	 *	@return sys001IrdExtrFileRec
	 */   
	 public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
   	return sys001IrdExtrFileRec;
   }


	/**
	 *	Returns the value of sys001Key
	 *	@return sys001Key
	 */
   public char[] getSys001Key() throws CFException  {              
   		return sys001IrdExtrFileRec.getSys001KeyAll().getSys001Key();
   }

  
	/**
	*  set variable sys001Key
	*  @param value
	**/
   public void setSys001Key(char[] value) throws CFException {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(value);
   } 

     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex) throws CFException {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex);
   	
   }
   
   public void setSys001Key(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Key with another Field
	 *	@param value
	 */
   public void setSys001Key(Field source) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source);
   }  
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isEndOfDataN88100()
	 *	@return  Returns true if isEndOfDataN88100() is "N"
	 */
   public boolean isEndOfDataN88100() throws CFException {
      return work.isEndOfDataN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setEndOfDataN88100True()  throws CFException{  			
    	work.setEndOfDataN88100True();
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
	 *	Returns the value of key800
	 *	@return key800
	 */   
	 public Key800 getKey800() {
   	return irdExtrFileRec800.getKey800();
   }

   /**
	* 	Update Key800 with the passed value
	*	@param value
	*/
   public void setKey800(char[] value) throws CFException {
      irdExtrFileRec800.setKey800(value);
   }   

     /**
	 * 	Update Key800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Key800 with another Field
	 *	@param value
	 */
   public void setKey800(Field source) {
   	irdExtrFileRec800.setKey800(source);
   }  
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfDataY88100()
	 *	@return  Returns true if isEndOfDataY88100() is "Y"
	 */
   public boolean isEndOfDataY88100() throws CFException {
      return work.isEndOfDataY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfDataY88100True()  throws CFException{  			
    	work.setEndOfDataY88100True();
   	}
	/**
	 *	Test condition "ERROR STARTING SYS001-FILE" for isAbendStartSys00188600()
	 *	@return  Returns true if isAbendStartSys00188600() is "ERROR STARTING SYS001-FILE"
	 */
   public boolean isAbendStartSys00188600() throws CFException {
      return abendMessage600.isAbendStartSys00188600();
   }

	/**
	*  set values "ERROR STARTING SYS001-FILE"
	*/
   	public void setAbendStartSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendStartSys00188600True();
   	}
	/**
	 *	Returns the value of irdLdCnt500
	 *	@return irdLdCnt500
	 */
	public short getIrdLdCnt500() throws CFException {        
   		return holdIrdTable500.getIrdLdCnt500();
	}
	
	/**
	 * 	Update IrdLdCnt500 with the passed value
	 *	@param number
	 */
	public void setIrdLdCnt500(short number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500(number);
	}

	public void setIrdLdCnt500(int number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}

	public void setIrdLdCnt500(long number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}



	/**
	 *	Returns the value of prevKey800
	 *	@return prevKey800
	 */
   public char[] getPrevKey800() throws CFException  {              
   		return work.getPrevKey800();
   }

  
	/**
	*  set variable prevKey800
	*  @param value
	**/
   public void setPrevKey800(char[] value) throws CFException {
      work.setPrevKey800(value);
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


        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += holdIrdTable500.hashCode();
        str += work.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrOutCtx clone() {
        ProcessIrdExtrOutCtx cloneObj = new ProcessIrdExtrOutCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrOutCtx getProcessIrdExtrOutCtx() {
            return new ProcessIrdExtrOutCtx();
    }
     public class ReadSys001FileInCtx implements Cloneable {
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     HoldIrdTable500 holdIrdTable500 = Mcvsam2Ctx.this.getHoldIrdTable500();
     Work work = Mcvsam2Ctx.this.getWork();
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam2Ctx.this.getIrdExtrFileRec800();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();


public void setIrdIdx500(int irdIdx500) { 
    Mcvsam2Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam2Ctx.this.irdIdx500;
}
	/**
	 *	Returns the value of key800
	 *	@return key800
	 */   
	 public Key800 getKey800() {
   	return irdExtrFileRec800.getKey800();
   }

   /**
	* 	Update Key800 with the passed value
	*	@param value
	*/
   public void setKey800(char[] value) throws CFException {
      irdExtrFileRec800.setKey800(value);
   }   

     /**
	 * 	Update Key800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Key800 with another Field
	 *	@param value
	 */
   public void setKey800(Field source) {
   	irdExtrFileRec800.setKey800(source);
   }  
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	irdExtrFileRec800.setKey800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of irdLdCnt500
	 *	@return irdLdCnt500
	 */
	public short getIrdLdCnt500() throws CFException {        
   		return holdIrdTable500.getIrdLdCnt500();
	}
	
	/**
	 * 	Update IrdLdCnt500 with the passed value
	 *	@param number
	 */
	public void setIrdLdCnt500(short number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500(number);
	}

	public void setIrdLdCnt500(int number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}

	public void setIrdLdCnt500(long number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}




        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }

        public ReadSys001FileOutCtx getReadSys001FileOutCtx() {
            return new ReadSys001FileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += holdIrdTable500.hashCode();
        str += work.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileInCtx clone() {
        ReadSys001FileInCtx cloneObj = new ReadSys001FileInCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileInCtx getReadSys001FileInCtx() {
            return new ReadSys001FileInCtx();
    }
     public class ReadSys001FileOutCtx implements Cloneable {
     Sys001IrdExtrFileRec sys001IrdExtrFileRec = Mcvsam2Ctx.this.getSys001IrdExtrFileRec();
     HoldIrdTable500 holdIrdTable500 = Mcvsam2Ctx.this.getHoldIrdTable500();
     Work work = Mcvsam2Ctx.this.getWork();
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam2Ctx.this.getIrdExtrFileRec800();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

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
	 *	Returns the value of sys001Key
	 *	@return sys001Key
	 */
   public char[] getSys001Key() throws CFException  {              
   		return sys001IrdExtrFileRec.getSys001KeyAll().getSys001Key();
   }

  
	/**
	*  set variable sys001Key
	*  @param value
	**/
   public void setSys001Key(char[] value) throws CFException {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(value);
   } 

     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex) throws CFException {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex);
   	
   }
   
   public void setSys001Key(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Key with another Field
	 *	@param value
	 */
   public void setSys001Key(Field source) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source);
   }  
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.getSys001KeyAll().setSys001Key(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */   
	 public Sys001KeyAll getSys001KeyAll() {
   	return sys001IrdExtrFileRec.getSys001KeyAll();
   }

   /**
	* 	Update Sys001KeyAll with the passed value
	*	@param value
	*/
   public void setSys001KeyAll(char[] value) throws CFException {
      sys001IrdExtrFileRec.setSys001KeyAll(value);
   }   

     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001IrdExtrFileRec.setSys001KeyAll(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length  
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
	 *	Test condition "10" for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is "10"
	 */
   public boolean isSys001Eof88200() throws CFException {
      return work.isSys001Eof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001Eof88200True()  throws CFException{  			
    	work.setSys001Eof88200True();
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
	 *	Returns the value of sys001Ird
	 *	@return sys001Ird
	 */
   public char[] getSys001Ird() throws CFException  {              
   		return sys001IrdExtrFileRec.getSys001Ird();
   }

  
	/**
	*  set variable sys001Ird
	*  @param value
	**/
   public void setSys001Ird(char[] value) throws CFException {
      sys001IrdExtrFileRec.setSys001Ird(value);
   } 

     /**
	 * 	Update Sys001Ird 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Ird(char[] source, int sourceIndex) throws CFException {
      sys001IrdExtrFileRec.setSys001Ird(source, sourceIndex);
   	
   }
   
   public void setSys001Ird(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001IrdExtrFileRec.setSys001Ird(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Ird 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Ird(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001Ird(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Ird with another Field
	 *	@param value
	 */
   public void setSys001Ird(Field source) {
      sys001IrdExtrFileRec.setSys001Ird(source);
   }  
   
     /**
	 * 	Update Sys001Ird 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Ird(Field source, int sourceIndex,int sourceLen) {
      sys001IrdExtrFileRec.setSys001Ird(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Ird 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Ird(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001IrdExtrFileRec.setSys001Ird(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001IrdExtrFileRec
	 *	@return sys001IrdExtrFileRec
	 */   
	 public Sys001IrdExtrFileRec getSys001IrdExtrFileRec() {
   	return sys001IrdExtrFileRec;
   }


	/**
	 *	Test condition 3002 for isReadAbendCode88300()
	 *	@return  Returns true if isReadAbendCode88300() is 3002
	 */
   public boolean isReadAbendCode88300() throws CFException {
      return work.isReadAbendCode88300();
   }

	/**
	*  set values 3002
	*/
   	public void setReadAbendCode88300True()  throws CFException{  			
    	work.setReadAbendCode88300True();
   	}

public void setIrdIdx500(int irdIdx500) { 
    Mcvsam2Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam2Ctx.this.irdIdx500;
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
	 *	Returns the value of ird500
	 *	@return ird500
	 */
   public char[] getIrd500(int index) throws CFException  {              
   		return holdIrdTable500.getIrdTbl500(index).getIrd500();
   }

  
	/**
	*  set variable ird500
	*  @param value
	**/
   public void setIrd500(int index,char[] value) throws CFException {
      holdIrdTable500.getIrdTbl500(index).setIrd500(value);
   } 

     /**
	 * 	Update Ird500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIrd500(int index,char[] source, int sourceIndex) throws CFException {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source, sourceIndex);
   	
   }
   
   public void setIrd500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ird500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIrd500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ird500 with another Field
	 *	@param value
	 */
   public void setIrd500(int index,Field source) {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source);
   }  
   
     /**
	 * 	Update Ird500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIrd500(int index,Field source, int sourceIndex,int sourceLen) {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ird500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIrd500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdIrdTable500.getIrdTbl500(index).setIrd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfDataY88100()
	 *	@return  Returns true if isEndOfDataY88100() is "Y"
	 */
   public boolean isEndOfDataY88100() throws CFException {
      return work.isEndOfDataY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfDataY88100True()  throws CFException{  			
    	work.setEndOfDataY88100True();
   	}
	/**
	 *	Returns the value of irdLdCnt500
	 *	@return irdLdCnt500
	 */
	public short getIrdLdCnt500() throws CFException {        
   		return holdIrdTable500.getIrdLdCnt500();
	}
	
	/**
	 * 	Update IrdLdCnt500 with the passed value
	 *	@param number
	 */
	public void setIrdLdCnt500(short number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500(number);
	}

	public void setIrdLdCnt500(int number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}

	public void setIrdLdCnt500(long number)  throws CFException{
		holdIrdTable500.setIrdLdCnt500((short)number);
	}



	/**
	 *	Test condition "8000-READ-SYS001-FILE" for isAbendPara800088300()
	 *	@return  Returns true if isAbendPara800088300() is "8000-READ-SYS001-FILE"
	 */
   public boolean isAbendPara800088300() throws CFException {
      return work.isAbendPara800088300();
   }

	/**
	*  set values "8000-READ-SYS001-FILE"
	*/
   	public void setAbendPara800088300True()  throws CFException{  			
    	work.setAbendPara800088300True();
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


        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001IrdExtrFileRec.hashCode();
        str += holdIrdTable500.hashCode();
        str += work.hashCode();
        str += irdExtrFileRec800.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileOutCtx clone() {
        ReadSys001FileOutCtx cloneObj = new ReadSys001FileOutCtx();
        cloneObj.sys001IrdExtrFileRec = new Sys001IrdExtrFileRec();
        cloneObj.sys001IrdExtrFileRec.set(sys001IrdExtrFileRec.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileOutCtx getReadSys001FileOutCtx() {
            return new ReadSys001FileOutCtx();
    }
     public class AbendProgramInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Mcvsam2Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Mcvsam2Ctx.this.getAbendMessage900();
     Work work = Mcvsam2Ctx.this.getWork();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

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
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
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

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }



        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public AbendProgramInCtx clone() {
        AbendProgramInCtx cloneObj = new AbendProgramInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramInCtx getAbendProgramInCtx() {
            return new AbendProgramInCtx();
    }
     public class AbendProgramOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Mcvsam2Ctx.this.getIp60001EventLogWorkArea();
     AbendMessage900 abendMessage900 = Mcvsam2Ctx.this.getAbendMessage900();
     Work work = Mcvsam2Ctx.this.getWork();
     AbendMessage600 abendMessage600 = Mcvsam2Ctx.this.getAbendMessage600();

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



        public Mcvsam2Ctx getMcvsam2Ctx() {
            return Mcvsam2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendMessage600.hashCode();
       return str.hashCode();
    }

    public AbendProgramOutCtx clone() {
        AbendProgramOutCtx cloneObj = new AbendProgramOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramOutCtx getAbendProgramOutCtx() {
            return new AbendProgramOutCtx();
    }
}
