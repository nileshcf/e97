package com.cloudframe.app.vsammon4;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.vsammon4.file.records.VsvksdsRecordS;
import com.cloudframe.app.vsammon4.dto.ReadallData;
import com.cloudframe.app.vsammon4.dto.Sysid;
import com.cloudframe.app.vsammon4.file.records.VsvksdsRecordIo;
import com.cloudframe.app.vsammon4.dto.AcceptInputGroup;
import com.cloudframe.app.vsammon4.dto.Input;
import com.cloudframe.app.vsammon4.file.records.Reprec;
import com.cloudframe.app.vsammon4.dto.Work;
import com.cloudframe.app.vsammon4.file.records.VsvksdsRecordO;


@Context
public class Vsammon4Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sysid sysid;
    Reprec reprec;
    VsvksdsRecordS vsvksdsRecordS;
    VsvksdsRecordO vsvksdsRecordO;
    VsvksdsRecordIo vsvksdsRecordIo;
    AcceptInputGroup acceptInputGroup;
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

    boolean doNotSkipCloseo = true;

    public boolean getDoNotSkipCloseo() {
        return this.doNotSkipCloseo;
    }

    public void setDoNotSkipCloseo(boolean doNotSkipCloseo) {
            this.doNotSkipCloseo = doNotSkipCloseo;
        }
    boolean doNotSkipOpenio = true;

    public boolean getDoNotSkipOpenio() {
        return this.doNotSkipOpenio;
    }

    public void setDoNotSkipOpenio(boolean doNotSkipOpenio) {
            this.doNotSkipOpenio = doNotSkipOpenio;
        }
    boolean doNotSkipOpenextend = true;

    public boolean getDoNotSkipOpenextend() {
        return this.doNotSkipOpenextend;
    }

    public void setDoNotSkipOpenextend(boolean doNotSkipOpenextend) {
            this.doNotSkipOpenextend = doNotSkipOpenextend;
        }
    boolean doNotSkipCloseio = true;

    public boolean getDoNotSkipCloseio() {
        return this.doNotSkipCloseio;
    }

    public void setDoNotSkipCloseio(boolean doNotSkipCloseio) {
            this.doNotSkipCloseio = doNotSkipCloseio;
        }
    boolean doNotSkipOpeni = true;

    public boolean getDoNotSkipOpeni() {
        return this.doNotSkipOpeni;
    }

    public void setDoNotSkipOpeni(boolean doNotSkipOpeni) {
            this.doNotSkipOpeni = doNotSkipOpeni;
        }
    boolean doNotSkipClosei = true;

    public boolean getDoNotSkipClosei() {
        return this.doNotSkipClosei;
    }

    public void setDoNotSkipClosei(boolean doNotSkipClosei) {
            this.doNotSkipClosei = doNotSkipClosei;
        }
    boolean doNotSkipInsall = true;

    public boolean getDoNotSkipInsall() {
        return this.doNotSkipInsall;
    }

    public void setDoNotSkipInsall(boolean doNotSkipInsall) {
            this.doNotSkipInsall = doNotSkipInsall;
        }
    boolean doNotSkipInsert = true;

    public boolean getDoNotSkipInsert() {
        return this.doNotSkipInsert;
    }

    public void setDoNotSkipInsert(boolean doNotSkipInsert) {
            this.doNotSkipInsert = doNotSkipInsert;
        }
    boolean doNotSkipDelete = true;

    public boolean getDoNotSkipDelete() {
        return this.doNotSkipDelete;
    }

    public void setDoNotSkipDelete(boolean doNotSkipDelete) {
            this.doNotSkipDelete = doNotSkipDelete;
        }
    boolean doNotSkipDlstrd = true;

    public boolean getDoNotSkipDlstrd() {
        return this.doNotSkipDlstrd;
    }

    public void setDoNotSkipDlstrd(boolean doNotSkipDlstrd) {
            this.doNotSkipDlstrd = doNotSkipDlstrd;
        }
    boolean doNotSkipRewrite = true;

    public boolean getDoNotSkipRewrite() {
        return this.doNotSkipRewrite;
    }

    public void setDoNotSkipRewrite(boolean doNotSkipRewrite) {
            this.doNotSkipRewrite = doNotSkipRewrite;
        }
    boolean doNotSkipKeyread = true;

    public boolean getDoNotSkipKeyread() {
        return this.doNotSkipKeyread;
    }

    public void setDoNotSkipKeyread(boolean doNotSkipKeyread) {
            this.doNotSkipKeyread = doNotSkipKeyread;
        }
    boolean doNotSkipReadall = true;

    public boolean getDoNotSkipReadall() {
        return this.doNotSkipReadall;
    }

    public void setDoNotSkipReadall(boolean doNotSkipReadall) {
            this.doNotSkipReadall = doNotSkipReadall;
        }
    boolean doNotSkipReadnxt = true;

    public boolean getDoNotSkipReadnxt() {
        return this.doNotSkipReadnxt;
    }

    public void setDoNotSkipReadnxt(boolean doNotSkipReadnxt) {
            this.doNotSkipReadnxt = doNotSkipReadnxt;
        }
    boolean doNotSkipDelall = true;

    public boolean getDoNotSkipDelall() {
        return this.doNotSkipDelall;
    }

    public void setDoNotSkipDelall(boolean doNotSkipDelall) {
            this.doNotSkipDelall = doNotSkipDelall;
        }
    boolean doNotSkipStart = true;

    public boolean getDoNotSkipStart() {
        return this.doNotSkipStart;
    }

    public void setDoNotSkipStart(boolean doNotSkipStart) {
            this.doNotSkipStart = doNotSkipStart;
        }

    public Sysid getSysid() {
        if (sysid == null) {
            sysid = new Sysid();
        }

        return sysid;
    }

    public void setSysid(Sysid sysid) {
        this.sysid = sysid;
    }
    public Reprec getReprec() {
        if (reprec == null) {
            reprec = new Reprec();
        }

        return reprec;
    }

    public void setReprec(Reprec reprec) {
        this.reprec = reprec;
    }
    public VsvksdsRecordS getVsvksdsRecordS() {
        if (vsvksdsRecordS == null) {
            vsvksdsRecordS = new VsvksdsRecordS();
        }

        return vsvksdsRecordS;
    }

    public void setVsvksdsRecordS(VsvksdsRecordS vsvksdsRecordS) {
        this.vsvksdsRecordS = vsvksdsRecordS;
    }
    public VsvksdsRecordO getVsvksdsRecordO() {
        if (vsvksdsRecordO == null) {
            vsvksdsRecordO = new VsvksdsRecordO();
        }

        return vsvksdsRecordO;
    }

    public void setVsvksdsRecordO(VsvksdsRecordO vsvksdsRecordO) {
        this.vsvksdsRecordO = vsvksdsRecordO;
    }
    public VsvksdsRecordIo getVsvksdsRecordIo() {
        if (vsvksdsRecordIo == null) {
            vsvksdsRecordIo = new VsvksdsRecordIo();
        }

        return vsvksdsRecordIo;
    }

    public void setVsvksdsRecordIo(VsvksdsRecordIo vsvksdsRecordIo) {
        this.vsvksdsRecordIo = vsvksdsRecordIo;
    }
    public AcceptInputGroup getAcceptInputGroup() {
        if (acceptInputGroup == null) {
            acceptInputGroup = new AcceptInputGroup();
        }

        return acceptInputGroup;
    }

    public void setAcceptInputGroup(AcceptInputGroup acceptInputGroup) {
        this.acceptInputGroup = acceptInputGroup;
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
        str += sysid.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += vsvksdsRecordO.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Vsammon4Ctx clone() {
        Vsammon4Ctx cloneObj = new Vsammon4Ctx();
        cloneObj.sysid = new Sysid();
        cloneObj.sysid.set(sysid.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.vsvksdsRecordO = new VsvksdsRecordO();
        cloneObj.vsvksdsRecordO.set(vsvksdsRecordO.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Test condition "DELETE " for isCDelete()
	 *	@return  Returns true if isCDelete() is "DELETE "
	 */
   public boolean isCDelete() throws CFException {
      return acceptInputGroup.getInput().isCDelete();
   }

	/**
	*  set values "DELETE "
	*/
   	public void setCDeleteTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCDeleteTrue();
   	}
	/**
	 *	Test condition "*      " for isCComment()
	 *	@return  Returns true if isCComment() is "*      "
	 */
   public boolean isCComment() throws CFException {
      return acceptInputGroup.getInput().isCComment();
   }

	/**
	*  set values "*      "
	*/
   	public void setCCommentTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCCommentTrue();
   	}
	/**
	 *	Test condition "INSERT " for isCInsert()
	 *	@return  Returns true if isCInsert() is "INSERT "
	 */
   public boolean isCInsert() throws CFException {
      return acceptInputGroup.getInput().isCInsert();
   }

	/**
	*  set values "INSERT "
	*/
   	public void setCInsertTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCInsertTrue();
   	}
	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Test condition "READNXT" for isCReadnxt()
	 *	@return  Returns true if isCReadnxt() is "READNXT"
	 */
   public boolean isCReadnxt() throws CFException {
      return acceptInputGroup.getInput().isCReadnxt();
   }

	/**
	*  set values "READNXT"
	*/
   	public void setCReadnxtTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCReadnxtTrue();
   	}
	/**
	 *	Test condition "*END*  " for isCTerminate()
	 *	@return  Returns true if isCTerminate() is "*END*  "
	 */
   public boolean isCTerminate() throws CFException {
      return acceptInputGroup.getInput().isCTerminate();
   }

	/**
	*  set values "*END*  "
	*/
   	public void setCTerminateTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCTerminateTrue();
   	}
	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */
   public char[] getAcceptInput() throws CFException  {              
   		return acceptInputGroup.getAcceptInput();
   }

  
	/**
	*  set variable acceptInput
	*  @param value
	**/
   public void setAcceptInput(char[] value) throws CFException {
      acceptInputGroup.setAcceptInput(value);
   } 

     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.setAcceptInput(source, sourceIndex);
   	
   }
   
   public void setAcceptInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AcceptInput with another Field
	 *	@param value
	 */
   public void setAcceptInput(Field source) {
      acceptInputGroup.setAcceptInput(source);
   }  
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "START  " for isCStart()
	 *	@return  Returns true if isCStart() is "START  "
	 */
   public boolean isCStart() throws CFException {
      return acceptInputGroup.getInput().isCStart();
   }

	/**
	*  set values "START  "
	*/
   	public void setCStartTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCStartTrue();
   	}
	/**
	 *	Test condition "KYREAD " for isCKeyread()
	 *	@return  Returns true if isCKeyread() is "KYREAD "
	 */
   public boolean isCKeyread() throws CFException {
      return acceptInputGroup.getInput().isCKeyread();
   }

	/**
	*  set values "KYREAD "
	*/
   	public void setCKeyreadTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCKeyreadTrue();
   	}
	/**
	 *	Test condition "CLOSEIO" for isCCloseio()
	 *	@return  Returns true if isCCloseio() is "CLOSEIO"
	 */
   public boolean isCCloseio() throws CFException {
      return acceptInputGroup.getInput().isCCloseio();
   }

	/**
	*  set values "CLOSEIO"
	*/
   	public void setCCloseioTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCCloseioTrue();
   	}
	/**
	 *	Test condition "CLOSEI " for isCClosei()
	 *	@return  Returns true if isCClosei() is "CLOSEI "
	 */
   public boolean isCClosei() throws CFException {
      return acceptInputGroup.getInput().isCClosei();
   }

	/**
	*  set values "CLOSEI "
	*/
   	public void setCCloseiTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCCloseiTrue();
   	}
	/**
	 *	Test condition "START* " for isCStartAlternate()
	 *	@return  Returns true if isCStartAlternate() is "START* "
	 */
   public boolean isCStartAlternate() throws CFException {
      return acceptInputGroup.getInput().isCStartAlternate();
   }

	/**
	*  set values "START* "
	*/
   	public void setCStartAlternateTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCStartAlternateTrue();
   	}
	/**
	 *	Test condition "CLOSEO " for isCCloseo()
	 *	@return  Returns true if isCCloseo() is "CLOSEO "
	 */
   public boolean isCCloseo() throws CFException {
      return acceptInputGroup.getInput().isCCloseo();
   }

	/**
	*  set values "CLOSEO "
	*/
   	public void setCCloseoTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCCloseoTrue();
   	}
	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition "INSALL " for isCInsall()
	 *	@return  Returns true if isCInsall() is "INSALL "
	 */
   public boolean isCInsall() throws CFException {
      return acceptInputGroup.getInput().isCInsall();
   }

	/**
	*  set values "INSALL "
	*/
   	public void setCInsallTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCInsallTrue();
   	}
	/**
	 *	Test condition "OPENXT " for isCOpenextend()
	 *	@return  Returns true if isCOpenextend() is "OPENXT "
	 */
   public boolean isCOpenextend() throws CFException {
      return acceptInputGroup.getInput().isCOpenextend();
   }

	/**
	*  set values "OPENXT "
	*/
   	public void setCOpenextendTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCOpenextendTrue();
   	}
	/**
	 *	Test condition "READALL" for isCReadall()
	 *	@return  Returns true if isCReadall() is "READALL"
	 */
   public boolean isCReadall() throws CFException {
      return acceptInputGroup.getInput().isCReadall();
   }

	/**
	*  set values "READALL"
	*/
   	public void setCReadallTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCReadallTrue();
   	}
	/**
	 *	Returns the value of input
	 *	@return input
	 */   
	 public Input getInput() {
   	return acceptInputGroup.getInput();
   }

   /**
	* 	Update Input with the passed value
	*	@param value
	*/
   public void setInput(char[] value) throws CFException {
      acceptInputGroup.setInput(value);
   }   

     /**
	 * 	Update Input 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Input 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Input with another Field
	 *	@param value
	 */
   public void setInput(Field source) {
   	acceptInputGroup.setInput(source);
   }  
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "OPENIO " for isCOpenio()
	 *	@return  Returns true if isCOpenio() is "OPENIO "
	 */
   public boolean isCOpenio() throws CFException {
      return acceptInputGroup.getInput().isCOpenio();
   }

	/**
	*  set values "OPENIO "
	*/
   	public void setCOpenioTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCOpenioTrue();
   	}
	/**
	 *	Test condition "OPENO  " for isCOpeno()
	 *	@return  Returns true if isCOpeno() is "OPENO  "
	 */
   public boolean isCOpeno() throws CFException {
      return acceptInputGroup.getInput().isCOpeno();
   }

	/**
	*  set values "OPENO  "
	*/
   	public void setCOpenoTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCOpenoTrue();
   	}
	/**
	 *	Test condition "OPENI  " for isCOpeni()
	 *	@return  Returns true if isCOpeni() is "OPENI  "
	 */
   public boolean isCOpeni() throws CFException {
      return acceptInputGroup.getInput().isCOpeni();
   }

	/**
	*  set values "OPENI  "
	*/
   	public void setCOpeniTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCOpeniTrue();
   	}
	/**
	 *	Test condition "CLOSEXT" for isCCloseextended()
	 *	@return  Returns true if isCCloseextended() is "CLOSEXT"
	 */
   public boolean isCCloseextended() throws CFException {
      return acceptInputGroup.getInput().isCCloseextended();
   }

	/**
	*  set values "CLOSEXT"
	*/
   	public void setCCloseextendedTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCCloseextendedTrue();
   	}
	/**
	 *	Test condition "DELALL " for isCDelall()
	 *	@return  Returns true if isCDelall() is "DELALL "
	 */
   public boolean isCDelall() throws CFException {
      return acceptInputGroup.getInput().isCDelall();
   }

	/**
	*  set values "DELALL "
	*/
   	public void setCDelallTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCDelallTrue();
   	}
	/**
	 *	Test condition "REWRIT " for isCRewrite()
	 *	@return  Returns true if isCRewrite() is "REWRIT "
	 */
   public boolean isCRewrite() throws CFException {
      return acceptInputGroup.getInput().isCRewrite();
   }

	/**
	*  set values "REWRIT "
	*/
   	public void setCRewriteTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCRewriteTrue();
   	}
	/**
	 *	Test condition "D_LSTRD" for isCDeleteLastRead()
	 *	@return  Returns true if isCDeleteLastRead() is "D_LSTRD"
	 */
   public boolean isCDeleteLastRead() throws CFException {
      return acceptInputGroup.getInput().isCDeleteLastRead();
   }

	/**
	*  set values "D_LSTRD"
	*/
   	public void setCDeleteLastReadTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCDeleteLastReadTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public OpenFilesOutCtx getOpenFilesOutCtx() {
            return new OpenFilesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class OpenFilesOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenFilesOutCtx clone() {
        OpenFilesOutCtx cloneObj = new OpenFilesOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesOutCtx getOpenFilesOutCtx() {
            return new OpenFilesOutCtx();
    }
     public class OpenoInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordO vsvksdsRecordO = Vsammon4Ctx.this.getVsvksdsRecordO();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vsvksdsRecordO
	 *	@return vsvksdsRecordO
	 */   
	 public VsvksdsRecordO getVsvksdsRecordO() {
   	return vsvksdsRecordO;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public OpenoOutCtx getOpenoOutCtx() {
            return new OpenoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordO.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenoInCtx clone() {
        OpenoInCtx cloneObj = new OpenoInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordO = new VsvksdsRecordO();
        cloneObj.vsvksdsRecordO.set(vsvksdsRecordO.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenoInCtx getOpenoInCtx() {
            return new OpenoInCtx();
    }
     public class OpenoOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordO vsvksdsRecordO = Vsammon4Ctx.this.getVsvksdsRecordO();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition 1 for isDynMode()
	 *	@return  Returns true if isDynMode() is 1
	 */
   public boolean isDynMode() throws CFException {
      return work.isDynMode();
   }

	/**
	*  set values 1
	*/
   	public void setDynModeTrue()  throws CFException{  			
    	work.setDynModeTrue();
   	}
	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public long getVskOPrimaryKey() throws CFException {
   		return vsvksdsRecordO.getVskOPrimaryKey();
	}


	/**
	 *	Returns String value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public char[]  getVskOPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordO.getVskOPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskOPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordO.vskOPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskOPrimaryKey(long number)  throws CFException{
		vsvksdsRecordO.setVskOPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordO.setVskOPrimaryKey(value);
	}
	
	/**
	 * 	Update VskOPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordO.setVskOPrimaryKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordO.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenoOutCtx clone() {
        OpenoOutCtx cloneObj = new OpenoOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordO = new VsvksdsRecordO();
        cloneObj.vsvksdsRecordO.set(vsvksdsRecordO.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenoOutCtx getOpenoOutCtx() {
            return new OpenoOutCtx();
    }
     public class CloseoInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public CloseoOutCtx getCloseoOutCtx() {
            return new CloseoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseoInCtx clone() {
        CloseoInCtx cloneObj = new CloseoInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseoInCtx getCloseoInCtx() {
            return new CloseoInCtx();
    }
     public class CloseoOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseoOutCtx clone() {
        CloseoOutCtx cloneObj = new CloseoOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseoOutCtx getCloseoOutCtx() {
            return new CloseoOutCtx();
    }
     public class OpenioInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Test condition "SEQUENTIAL" for isOpenSequential()
	 *	@return  Returns true if isOpenSequential() is "SEQUENTIAL"
	 */
   public boolean isOpenSequential() throws CFException {
      return acceptInputGroup.getInput().getOpenioData().isOpenSequential();
   }

	/**
	*  set values "SEQUENTIAL"
	*/
   	public void setOpenSequentialTrue()  throws CFException{  			
    	acceptInputGroup.getInput().getOpenioData().setOpenSequentialTrue();
   	}
	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public OpenioOutCtx getOpenioOutCtx() {
            return new OpenioOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenioInCtx clone() {
        OpenioInCtx cloneObj = new OpenioInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenioInCtx getOpenioInCtx() {
            return new OpenioInCtx();
    }
     public class OpenioOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition 1 for isDynMode()
	 *	@return  Returns true if isDynMode() is 1
	 */
   public boolean isDynMode() throws CFException {
      return work.isDynMode();
   }

	/**
	*  set values 1
	*/
   	public void setDynModeTrue()  throws CFException{  			
    	work.setDynModeTrue();
   	}
	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public OpenioOutCtx clone() {
        OpenioOutCtx cloneObj = new OpenioOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public OpenioOutCtx getOpenioOutCtx() {
            return new OpenioOutCtx();
    }
     public class OpenextendInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public OpenextendOutCtx getOpenextendOutCtx() {
            return new OpenextendOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenextendInCtx clone() {
        OpenextendInCtx cloneObj = new OpenextendInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenextendInCtx getOpenextendInCtx() {
            return new OpenextendInCtx();
    }
     public class OpenextendOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenextendOutCtx clone() {
        OpenextendOutCtx cloneObj = new OpenextendOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenextendOutCtx getOpenextendOutCtx() {
            return new OpenextendOutCtx();
    }
     public class CloseioInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public CloseioOutCtx getCloseioOutCtx() {
            return new CloseioOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseioInCtx clone() {
        CloseioInCtx cloneObj = new CloseioInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseioInCtx getCloseioInCtx() {
            return new CloseioInCtx();
    }
     public class CloseioOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseioOutCtx clone() {
        CloseioOutCtx cloneObj = new CloseioOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseioOutCtx getCloseioOutCtx() {
            return new CloseioOutCtx();
    }
     public class OpeniInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Test condition "DYNAMIC" for isOpenDynamic()
	 *	@return  Returns true if isOpenDynamic() is "DYNAMIC"
	 */
   public boolean isOpenDynamic() throws CFException {
      return acceptInputGroup.getInput().getOpenioData().isOpenDynamic();
   }

	/**
	*  set values "DYNAMIC"
	*/
   	public void setOpenDynamicTrue()  throws CFException{  			
    	acceptInputGroup.getInput().getOpenioData().setOpenDynamicTrue();
   	}
	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public OpeniOutCtx getOpeniOutCtx() {
            return new OpeniOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpeniInCtx clone() {
        OpeniInCtx cloneObj = new OpeniInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpeniInCtx getOpeniInCtx() {
            return new OpeniInCtx();
    }
     public class OpeniOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition 1 for isDynMode()
	 *	@return  Returns true if isDynMode() is 1
	 */
   public boolean isDynMode() throws CFException {
      return work.isDynMode();
   }

	/**
	*  set values 1
	*/
   	public void setDynModeTrue()  throws CFException{  			
    	work.setDynModeTrue();
   	}
	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public OpeniOutCtx clone() {
        OpeniOutCtx cloneObj = new OpeniOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public OpeniOutCtx getOpeniOutCtx() {
            return new OpeniOutCtx();
    }
     public class CloseiInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition 1 for isDynMode()
	 *	@return  Returns true if isDynMode() is 1
	 */
   public boolean isDynMode() throws CFException {
      return work.isDynMode();
   }

	/**
	*  set values 1
	*/
   	public void setDynModeTrue()  throws CFException{  			
    	work.setDynModeTrue();
   	}
	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public CloseiOutCtx getCloseiOutCtx() {
            return new CloseiOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseiInCtx clone() {
        CloseiInCtx cloneObj = new CloseiInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseiInCtx getCloseiInCtx() {
            return new CloseiInCtx();
    }
     public class CloseiOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseiOutCtx clone() {
        CloseiOutCtx cloneObj = new CloseiOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseiOutCtx getCloseiOutCtx() {
            return new CloseiOutCtx();
    }
     public class InsallInCtx implements Cloneable {
     Sysid sysid = Vsammon4Ctx.this.getSysid();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordO vsvksdsRecordO = Vsammon4Ctx.this.getVsvksdsRecordO();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of sysid
	 *	@return sysid
	 */   
	 public Sysid getSysid() {
   	return sysid;
   }


	/**
	 *	Returns the value of numstr
	 *	@return numstr
	 */
   public char[] getNumstr() throws CFException  {              
   		return work.getNumstr();
   }

  
	/**
	*  set variable numstr
	*  @param value
	**/
   public void setNumstr(char[] value) throws CFException {
      work.setNumstr(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordO
	 *	@return vsvksdsRecordO
	 */   
	 public VsvksdsRecordO getVsvksdsRecordO() {
   	return vsvksdsRecordO;
   }


	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public short getSub1() throws CFException {        
   		return work.getSub1();
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param number
	 */
	public void setSub1(short number)  throws CFException{
		work.setSub1(number);
	}

	public void setSub1(int number)  throws CFException{
		work.setSub1((short)number);
	}

	public void setSub1(long number)  throws CFException{
		work.setSub1((short)number);
	}



	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of vskOVarStruct
	 *	@return vskOVarStruct
	 */
   public char[] getVskOVarStruct() throws CFException  {              
   		return vsvksdsRecordO.getVskOVarStruct();
   }

  
	/**
	*  set variable vskOVarStruct
	*  @param value
	**/
   public void setVskOVarStruct(char[] value) throws CFException {
      vsvksdsRecordO.setVskOVarStruct(value);
   } 

     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskOVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskOVarStruct with another Field
	 *	@param value
	 */
   public void setVskOVarStruct(Field source) {
      vsvksdsRecordO.setVskOVarStruct(source);
   }  
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}




        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public InsallOutCtx getInsallOutCtx() {
            return new InsallOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sysid.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordO.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsallInCtx clone() {
        InsallInCtx cloneObj = new InsallInCtx();
        cloneObj.sysid = new Sysid();
        cloneObj.sysid.set(sysid.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordO = new VsvksdsRecordO();
        cloneObj.vsvksdsRecordO.set(vsvksdsRecordO.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsallInCtx getInsallInCtx() {
            return new InsallInCtx();
    }
     public class InsallOutCtx implements Cloneable {
     Sysid sysid = Vsammon4Ctx.this.getSysid();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordO vsvksdsRecordO = Vsammon4Ctx.this.getVsvksdsRecordO();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of reqSize
	 *	@return reqSize
	 */
	public long getReqSize() throws CFException {
   		return work.getReqSize();
	}


	/**
	 *	Returns String value of reqSize
	 *	@return reqSize
	 */
	public char[]  getReqSizeString() throws CFException {
	     return String.valueOf(work.getReqSizeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reqSizeIsNumeric()  throws CFException{
	    return work.reqSizeIsNumeric();
	}

	/**
	 * 	Update ReqSize with the passed value
	 *	@param number
	 */
	public void setReqSize(long number)  throws CFException{
		work.setReqSize(number);
	}
	

	
	/**
	 * 	Update ReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setReqSize(char[] value)  throws CFException {
		work.setReqSize(value);
	}
	
	/**
	 * 	Update ReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReqSizeString(char[] value)  throws CFException{
		work.setReqSize(value);
	}	

public int getVskOTaskNo() throws CFException {  
        return vsvksdsRecordO.getVskOTaskNo();
}
	/**
	 * 	Update VskOTaskNo with the passed value
	 *	@param number
	 */
	public void setVskOTaskNo(int number)  throws CFException{
		vsvksdsRecordO.setVskOTaskNo(number);
	}


	public void setVskOTaskNo(long number)  throws CFException{
	    vsvksdsRecordO.setVskOTaskNo(number);
	}
	

	/**
	 *	Returns the value of numstr
	 *	@return numstr
	 */
   public char[] getNumstr() throws CFException  {              
   		return work.getNumstr();
   }

  
	/**
	*  set variable numstr
	*  @param value
	**/
   public void setNumstr(char[] value) throws CFException {
      work.setNumstr(value);
   } 

	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public short getSub1() throws CFException {        
   		return work.getSub1();
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param number
	 */
	public void setSub1(short number)  throws CFException{
		work.setSub1(number);
	}

	public void setSub1(int number)  throws CFException{
		work.setSub1((short)number);
	}

	public void setSub1(long number)  throws CFException{
		work.setSub1((short)number);
	}



	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Returns the value of sysid
	 *	@return sysid
	 */   
	 public Sysid getSysid() {
   	return sysid;
   }


	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskOSysid
	 *	@return vskOSysid
	 */
   public char[] getVskOSysid() throws CFException  {              
   		return vsvksdsRecordO.getVskOSysid();
   }

  
	/**
	*  set variable vskOSysid
	*  @param value
	**/
   public void setVskOSysid(char[] value) throws CFException {
      vsvksdsRecordO.setVskOSysid(value);
   } 

     /**
	 * 	Update VskOSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskOSysid(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordO.setVskOSysid(source, sourceIndex);
   	
   }
   
   public void setVskOSysid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordO.setVskOSysid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskOSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskOSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskOSysid with another Field
	 *	@param value
	 */
   public void setVskOSysid(Field source) {
      vsvksdsRecordO.setVskOSysid(source);
   }  
   
     /**
	 * 	Update VskOSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskOSysid(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordO.setVskOSysid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskOSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskOSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of taskNo
	 *	@return taskNo
	 */
	public long getTaskNo() throws CFException {
   		return work.getTaskNo();
	}


	/**
	 *	Returns String value of taskNo
	 *	@return taskNo
	 */
	public char[]  getTaskNoString() throws CFException {
	     return String.valueOf(work.getTaskNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean taskNoIsNumeric()  throws CFException{
	    return work.taskNoIsNumeric();
	}

	/**
	 * 	Update TaskNo with the passed value
	 *	@param number
	 */
	public void setTaskNo(long number)  throws CFException{
		work.setTaskNo(number);
	}
	

	
	/**
	 * 	Update TaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setTaskNo(char[] value)  throws CFException {
		work.setTaskNo(value);
	}
	
	/**
	 * 	Update TaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTaskNoString(char[] value)  throws CFException{
		work.setTaskNo(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordO
	 *	@return vsvksdsRecordO
	 */   
	 public VsvksdsRecordO getVsvksdsRecordO() {
   	return vsvksdsRecordO;
   }


	/**
	 *	Returns the value of vskOReqSize
	 *	@return vskOReqSize
	 */
	public int getVskOReqSize() throws CFException {        
   		return vsvksdsRecordO.getVskOReqSize();
	}
	
	/**
	 * 	Update VskOReqSize with the passed value
	 *	@param number
	 */
	public void setVskOReqSize(int number)  throws CFException{
		vsvksdsRecordO.setVskOReqSize(number);
	}


	public void setVskOReqSize(long number)  throws CFException{
		vsvksdsRecordO.setVskOReqSize((int)number);
	}


	/**
	 *	Returns the value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public long getVskOPrimaryKey() throws CFException {
   		return vsvksdsRecordO.getVskOPrimaryKey();
	}


	/**
	 *	Returns String value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public char[]  getVskOPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordO.getVskOPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskOPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordO.vskOPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskOPrimaryKey(long number)  throws CFException{
		vsvksdsRecordO.setVskOPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskOPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordO.setVskOPrimaryKey(value);
	}
	
	/**
	 * 	Update VskOPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskOPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordO.setVskOPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskOVarStruct
	 *	@return vskOVarStruct
	 */
   public char[] getVskOVarStruct() throws CFException  {              
   		return vsvksdsRecordO.getVskOVarStruct();
   }

  
	/**
	*  set variable vskOVarStruct
	*  @param value
	**/
   public void setVskOVarStruct(char[] value) throws CFException {
      vsvksdsRecordO.setVskOVarStruct(value);
   } 

     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskOVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskOVarStruct with another Field
	 *	@param value
	 */
   public void setVskOVarStruct(Field source) {
      vsvksdsRecordO.setVskOVarStruct(source);
   }  
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskOVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskOVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordO.setVskOVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sysidNnn
	 *	@return sysidNnn
	 */
	public int getSysidNnn() throws CFException {
   		return sysid.getSysidNnn();
	}


	/**
	 *	Returns String value of sysidNnn
	 *	@return sysidNnn
	 */
	public char[]  getSysidNnnString() throws CFException {
	     return String.valueOf(sysid.getSysidNnnString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sysidNnnIsNumeric()  throws CFException{
	    return sysid.sysidNnnIsNumeric();
	}

	/**
	 * 	Update SysidNnn with the passed value
	 *	@param number
	 */
	public void setSysidNnn(int number)  throws CFException{
		sysid.setSysidNnn(number);
	}
	

	public void setSysidNnn(long number)  throws CFException{
	    sysid.setSysidNnn(number);
	}
	
	
	/**
	 * 	Update SysidNnn with the passed value
	 *	@param value (String or char[])
	 */
	public void setSysidNnn(char[] value)  throws CFException {
		sysid.setSysidNnn(value);
	}
	
	/**
	 * 	Update SysidNnn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSysidNnnString(char[] value)  throws CFException{
		sysid.setSysidNnn(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sysid.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordO.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsallOutCtx clone() {
        InsallOutCtx cloneObj = new InsallOutCtx();
        cloneObj.sysid = new Sysid();
        cloneObj.sysid.set(sysid.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordO = new VsvksdsRecordO();
        cloneObj.vsvksdsRecordO.set(vsvksdsRecordO.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsallOutCtx getInsallOutCtx() {
            return new InsallOutCtx();
    }
     public class InsertInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of iReqSize
	 *	@return iReqSize
	 */
	public long getIReqSize() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIReqSize();
	}


	/**
	 *	Returns String value of iReqSize
	 *	@return iReqSize
	 */
	public char[]  getIReqSizeString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIReqSizeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iReqSizeIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iReqSizeIsNumeric();
	}

	/**
	 * 	Update IReqSize with the passed value
	 *	@param number
	 */
	public void setIReqSize(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIReqSize(number);
	}
	

	
	/**
	 * 	Update IReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setIReqSize(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIReqSize(value);
	}
	
	/**
	 * 	Update IReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIReqSizeString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIReqSize(value);
	}	

	/**
	 *	Returns the value of iDataLen
	 *	@return iDataLen
	 */
	public int getIDataLen() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIDataLen();
	}


	/**
	 *	Returns String value of iDataLen
	 *	@return iDataLen
	 */
	public char[]  getIDataLenString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIDataLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iDataLenIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iDataLenIsNumeric();
	}

	/**
	 * 	Update IDataLen with the passed value
	 *	@param number
	 */
	public void setIDataLen(int number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIDataLen(number);
	}
	

	public void setIDataLen(long number)  throws CFException{
	    acceptInputGroup.getInput().getInsertData().setIDataLen(number);
	}
	
	
	/**
	 * 	Update IDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setIDataLen(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIDataLen(value);
	}
	
	/**
	 * 	Update IDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIDataLenString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIDataLen(value);
	}	

	/**
	 *	Returns the value of vskIoVarStruct
	 *	@return vskIoVarStruct
	 */
   public char[] getVskIoVarStruct() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoVarStruct();
   }

  
	/**
	*  set variable vskIoVarStruct
	*  @param value
	**/
   public void setVskIoVarStruct(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(value);
   } 

     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskIoVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoVarStruct with another Field
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source) {
      vsvksdsRecordIo.setVskIoVarStruct(source);
   }  
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskSVarStruct
	 *	@return vskSVarStruct
	 */
   public char[] getVskSVarStruct() throws CFException  {              
   		return vsvksdsRecordS.getVskSVarStruct();
   }

  
	/**
	*  set variable vskSVarStruct
	*  @param value
	**/
   public void setVskSVarStruct(char[] value) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(value);
   } 

     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskSVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSVarStruct with another Field
	 *	@param value
	 */
   public void setVskSVarStruct(Field source) {
      vsvksdsRecordS.setVskSVarStruct(source);
   }  
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of iTaskNo
	 *	@return iTaskNo
	 */
	public long getITaskNo() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getITaskNo();
	}


	/**
	 *	Returns String value of iTaskNo
	 *	@return iTaskNo
	 */
	public char[]  getITaskNoString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getITaskNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iTaskNoIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iTaskNoIsNumeric();
	}

	/**
	 * 	Update ITaskNo with the passed value
	 *	@param number
	 */
	public void setITaskNo(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setITaskNo(number);
	}
	

	
	/**
	 * 	Update ITaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setITaskNo(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setITaskNo(value);
	}
	
	/**
	 * 	Update ITaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setITaskNoString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setITaskNo(value);
	}	

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}
	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
	public long getIInsertKey() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIInsertKey();
	}


	/**
	 *	Returns String value of iInsertKey
	 *	@return iInsertKey
	 */
	public char[]  getIInsertKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIInsertKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iInsertKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iInsertKeyIsNumeric();
	}

	/**
	 * 	Update IInsertKey with the passed value
	 *	@param number
	 */
	public void setIInsertKey(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIInsertKey(number);
	}
	

	
	/**
	 * 	Update IInsertKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setIInsertKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
	}
	
	/**
	 * 	Update IInsertKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIInsertKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public InsertOutCtx getInsertOutCtx() {
            return new InsertOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public InsertInCtx clone() {
        InsertInCtx cloneObj = new InsertInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public InsertInCtx getInsertInCtx() {
            return new InsertInCtx();
    }
     public class InsertOutCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vskIoReqSize
	 *	@return vskIoReqSize
	 */
	public int getVskIoReqSize() throws CFException {        
   		return vsvksdsRecordIo.getVskIoReqSize();
	}
	
	/**
	 * 	Update VskIoReqSize with the passed value
	 *	@param number
	 */
	public void setVskIoReqSize(int number)  throws CFException{
		vsvksdsRecordIo.setVskIoReqSize(number);
	}


	public void setVskIoReqSize(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoReqSize((int)number);
	}


	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of iReqSize
	 *	@return iReqSize
	 */
	public long getIReqSize() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIReqSize();
	}


	/**
	 *	Returns String value of iReqSize
	 *	@return iReqSize
	 */
	public char[]  getIReqSizeString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIReqSizeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iReqSizeIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iReqSizeIsNumeric();
	}

	/**
	 * 	Update IReqSize with the passed value
	 *	@param number
	 */
	public void setIReqSize(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIReqSize(number);
	}
	

	
	/**
	 * 	Update IReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setIReqSize(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIReqSize(value);
	}
	
	/**
	 * 	Update IReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIReqSizeString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIReqSize(value);
	}	

	/**
	 *	Returns the value of iDataLen
	 *	@return iDataLen
	 */
	public int getIDataLen() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIDataLen();
	}


	/**
	 *	Returns String value of iDataLen
	 *	@return iDataLen
	 */
	public char[]  getIDataLenString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIDataLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iDataLenIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iDataLenIsNumeric();
	}

	/**
	 * 	Update IDataLen with the passed value
	 *	@param number
	 */
	public void setIDataLen(int number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIDataLen(number);
	}
	

	public void setIDataLen(long number)  throws CFException{
	    acceptInputGroup.getInput().getInsertData().setIDataLen(number);
	}
	
	
	/**
	 * 	Update IDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setIDataLen(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIDataLen(value);
	}
	
	/**
	 * 	Update IDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIDataLenString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIDataLen(value);
	}	

	/**
	 *	Returns the value of vskIoVarStruct
	 *	@return vskIoVarStruct
	 */
   public char[] getVskIoVarStruct() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoVarStruct();
   }

  
	/**
	*  set variable vskIoVarStruct
	*  @param value
	**/
   public void setVskIoVarStruct(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(value);
   } 

     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskIoVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoVarStruct with another Field
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source) {
      vsvksdsRecordIo.setVskIoVarStruct(source);
   }  
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskSVarStruct
	 *	@return vskSVarStruct
	 */
   public char[] getVskSVarStruct() throws CFException  {              
   		return vsvksdsRecordS.getVskSVarStruct();
   }

  
	/**
	*  set variable vskSVarStruct
	*  @param value
	**/
   public void setVskSVarStruct(char[] value) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(value);
   } 

     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskSVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSVarStruct with another Field
	 *	@param value
	 */
   public void setVskSVarStruct(Field source) {
      vsvksdsRecordS.setVskSVarStruct(source);
   }  
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskIoSysid
	 *	@return vskIoSysid
	 */
   public char[] getVskIoSysid() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoSysid();
   }

  
	/**
	*  set variable vskIoSysid
	*  @param value
	**/
   public void setVskIoSysid(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoSysid(value);
   } 

     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex);
   	
   }
   
   public void setVskIoSysid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoSysid with another Field
	 *	@param value
	 */
   public void setVskIoSysid(Field source) {
      vsvksdsRecordIo.setVskIoSysid(source);
   }  
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getVskSTaskNo() throws CFException {  
        return vsvksdsRecordS.getVskSTaskNo();
}
	/**
	 * 	Update VskSTaskNo with the passed value
	 *	@param number
	 */
	public void setVskSTaskNo(int number)  throws CFException{
		vsvksdsRecordS.setVskSTaskNo(number);
	}


	public void setVskSTaskNo(long number)  throws CFException{
	    vsvksdsRecordS.setVskSTaskNo(number);
	}
	

	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
	public long getIInsertKey() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getIInsertKey();
	}


	/**
	 *	Returns String value of iInsertKey
	 *	@return iInsertKey
	 */
	public char[]  getIInsertKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getIInsertKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iInsertKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iInsertKeyIsNumeric();
	}

	/**
	 * 	Update IInsertKey with the passed value
	 *	@param number
	 */
	public void setIInsertKey(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIInsertKey(number);
	}
	

	
	/**
	 * 	Update IInsertKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setIInsertKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
	}
	
	/**
	 * 	Update IInsertKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIInsertKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
	}	

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskSSysid
	 *	@return vskSSysid
	 */
   public char[] getVskSSysid() throws CFException  {              
   		return vsvksdsRecordS.getVskSSysid();
   }

  
	/**
	*  set variable vskSSysid
	*  @param value
	**/
   public void setVskSSysid(char[] value) throws CFException {
      vsvksdsRecordS.setVskSSysid(value);
   } 

     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex);
   	
   }
   
   public void setVskSSysid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSSysid with another Field
	 *	@param value
	 */
   public void setVskSSysid(Field source) {
      vsvksdsRecordS.setVskSSysid(source);
   }  
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iTaskNo
	 *	@return iTaskNo
	 */
	public long getITaskNo() throws CFException {
   		return acceptInputGroup.getInput().getInsertData().getITaskNo();
	}


	/**
	 *	Returns String value of iTaskNo
	 *	@return iTaskNo
	 */
	public char[]  getITaskNoString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getInsertData().getITaskNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iTaskNoIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getInsertData().iTaskNoIsNumeric();
	}

	/**
	 * 	Update ITaskNo with the passed value
	 *	@param number
	 */
	public void setITaskNo(long number)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setITaskNo(number);
	}
	

	
	/**
	 * 	Update ITaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setITaskNo(char[] value)  throws CFException {
		acceptInputGroup.getInput().getInsertData().setITaskNo(value);
	}
	
	/**
	 * 	Update ITaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setITaskNoString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getInsertData().setITaskNo(value);
	}	

public int getVskIoTaskNo() throws CFException {  
        return vsvksdsRecordIo.getVskIoTaskNo();
}
	/**
	 * 	Update VskIoTaskNo with the passed value
	 *	@param number
	 */
	public void setVskIoTaskNo(int number)  throws CFException{
		vsvksdsRecordIo.setVskIoTaskNo(number);
	}


	public void setVskIoTaskNo(long number)  throws CFException{
	    vsvksdsRecordIo.setVskIoTaskNo(number);
	}
	

	/**
	 *	Returns the value of vskSReqSize
	 *	@return vskSReqSize
	 */
	public int getVskSReqSize() throws CFException {        
   		return vsvksdsRecordS.getVskSReqSize();
	}
	
	/**
	 * 	Update VskSReqSize with the passed value
	 *	@param number
	 */
	public void setVskSReqSize(int number)  throws CFException{
		vsvksdsRecordS.setVskSReqSize(number);
	}


	public void setVskSReqSize(long number)  throws CFException{
		vsvksdsRecordS.setVskSReqSize((int)number);
	}



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public InsertOutCtx clone() {
        InsertOutCtx cloneObj = new InsertOutCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public InsertOutCtx getInsertOutCtx() {
            return new InsertOutCtx();
    }
     public class DeleteInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of dKey
	 *	@return dKey
	 */
	public long getDKey() throws CFException {
   		return acceptInputGroup.getInput().getDeleteData().getDKey();
	}


	/**
	 *	Returns String value of dKey
	 *	@return dKey
	 */
	public char[]  getDKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getDeleteData().getDKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getDeleteData().dKeyIsNumeric();
	}

	/**
	 * 	Update DKey with the passed value
	 *	@param number
	 */
	public void setDKey(long number)  throws CFException{
		acceptInputGroup.getInput().getDeleteData().setDKey(number);
	}
	

	
	/**
	 * 	Update DKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getDeleteData().setDKey(value);
	}
	
	/**
	 * 	Update DKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getDeleteData().setDKey(value);
	}	

	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public DeleteOutCtx getDeleteOutCtx() {
            return new DeleteOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public DeleteInCtx clone() {
        DeleteInCtx cloneObj = new DeleteInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public DeleteInCtx getDeleteInCtx() {
            return new DeleteInCtx();
    }
     public class DeleteOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of dKey
	 *	@return dKey
	 */
	public long getDKey() throws CFException {
   		return acceptInputGroup.getInput().getDeleteData().getDKey();
	}


	/**
	 *	Returns String value of dKey
	 *	@return dKey
	 */
	public char[]  getDKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getDeleteData().getDKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getDeleteData().dKeyIsNumeric();
	}

	/**
	 * 	Update DKey with the passed value
	 *	@param number
	 */
	public void setDKey(long number)  throws CFException{
		acceptInputGroup.getInput().getDeleteData().setDKey(number);
	}
	

	
	/**
	 * 	Update DKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setDKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getDeleteData().setDKey(value);
	}
	
	/**
	 * 	Update DKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getDeleteData().setDKey(value);
	}	

	/**
	 *	Returns the value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public long getPrimaryKeyDisp() throws CFException {
   		return work.getPrimaryKeyDisp();
	}


	/**
	 *	Returns String value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public char[]  getPrimaryKeyDispString() throws CFException {
	     return String.valueOf(work.getPrimaryKeyDispString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean primaryKeyDispIsNumeric()  throws CFException{
	    return work.primaryKeyDispIsNumeric();
	}

	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param number
	 */
	public void setPrimaryKeyDisp(long number)  throws CFException{
		work.setPrimaryKeyDisp(number);
	}
	

	
	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDisp(char[] value)  throws CFException {
		work.setPrimaryKeyDisp(value);
	}
	
	/**
	 * 	Update PrimaryKeyDisp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDispString(char[] value)  throws CFException{
		work.setPrimaryKeyDisp(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public DeleteOutCtx clone() {
        DeleteOutCtx cloneObj = new DeleteOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public DeleteOutCtx getDeleteOutCtx() {
            return new DeleteOutCtx();
    }
     public class DlstrdInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public DlstrdOutCtx getDlstrdOutCtx() {
            return new DlstrdOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DlstrdInCtx clone() {
        DlstrdInCtx cloneObj = new DlstrdInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DlstrdInCtx getDlstrdInCtx() {
            return new DlstrdInCtx();
    }
     public class DlstrdOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public long getPrimaryKeyDisp() throws CFException {
   		return work.getPrimaryKeyDisp();
	}


	/**
	 *	Returns String value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public char[]  getPrimaryKeyDispString() throws CFException {
	     return String.valueOf(work.getPrimaryKeyDispString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean primaryKeyDispIsNumeric()  throws CFException{
	    return work.primaryKeyDispIsNumeric();
	}

	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param number
	 */
	public void setPrimaryKeyDisp(long number)  throws CFException{
		work.setPrimaryKeyDisp(number);
	}
	

	
	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDisp(char[] value)  throws CFException {
		work.setPrimaryKeyDisp(value);
	}
	
	/**
	 * 	Update PrimaryKeyDisp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDispString(char[] value)  throws CFException{
		work.setPrimaryKeyDisp(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DlstrdOutCtx clone() {
        DlstrdOutCtx cloneObj = new DlstrdOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DlstrdOutCtx getDlstrdOutCtx() {
            return new DlstrdOutCtx();
    }
     public class RewriteInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of rwReqSize
	 *	@return rwReqSize
	 */
	public long getRwReqSize() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwReqSize();
	}


	/**
	 *	Returns String value of rwReqSize
	 *	@return rwReqSize
	 */
	public char[]  getRwReqSizeString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwReqSizeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwReqSizeIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwReqSizeIsNumeric();
	}

	/**
	 * 	Update RwReqSize with the passed value
	 *	@param number
	 */
	public void setRwReqSize(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(number);
	}
	

	
	/**
	 * 	Update RwReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwReqSize(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(value);
	}
	
	/**
	 * 	Update RwReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwReqSizeString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(value);
	}	

	/**
	 *	Returns the value of vskIoVarStruct
	 *	@return vskIoVarStruct
	 */
   public char[] getVskIoVarStruct() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoVarStruct();
   }

  
	/**
	*  set variable vskIoVarStruct
	*  @param value
	**/
   public void setVskIoVarStruct(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(value);
   } 

     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskIoVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoVarStruct with another Field
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source) {
      vsvksdsRecordIo.setVskIoVarStruct(source);
   }  
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskSVarStruct
	 *	@return vskSVarStruct
	 */
   public char[] getVskSVarStruct() throws CFException  {              
   		return vsvksdsRecordS.getVskSVarStruct();
   }

  
	/**
	*  set variable vskSVarStruct
	*  @param value
	**/
   public void setVskSVarStruct(char[] value) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(value);
   } 

     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskSVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSVarStruct with another Field
	 *	@param value
	 */
   public void setVskSVarStruct(Field source) {
      vsvksdsRecordS.setVskSVarStruct(source);
   }  
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of rwDataLen
	 *	@return rwDataLen
	 */
	public int getRwDataLen() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwDataLen();
	}


	/**
	 *	Returns String value of rwDataLen
	 *	@return rwDataLen
	 */
	public char[]  getRwDataLenString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwDataLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwDataLenIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwDataLenIsNumeric();
	}

	/**
	 * 	Update RwDataLen with the passed value
	 *	@param number
	 */
	public void setRwDataLen(int number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(number);
	}
	

	public void setRwDataLen(long number)  throws CFException{
	    acceptInputGroup.getInput().getRewriteData().setRwDataLen(number);
	}
	
	
	/**
	 * 	Update RwDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwDataLen(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(value);
	}
	
	/**
	 * 	Update RwDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwDataLenString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}
	/**
	 *	Returns the value of rwKey
	 *	@return rwKey
	 */
	public long getRwKey() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwKey();
	}


	/**
	 *	Returns String value of rwKey
	 *	@return rwKey
	 */
	public char[]  getRwKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwKeyIsNumeric();
	}

	/**
	 * 	Update RwKey with the passed value
	 *	@param number
	 */
	public void setRwKey(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwKey(number);
	}
	

	
	/**
	 * 	Update RwKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwKey(value);
	}
	
	/**
	 * 	Update RwKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwKey(value);
	}	

	/**
	 *	Returns the value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public long getRwTaskNo() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwTaskNo();
	}


	/**
	 *	Returns String value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public char[]  getRwTaskNoString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwTaskNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwTaskNoIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwTaskNoIsNumeric();
	}

	/**
	 * 	Update RwTaskNo with the passed value
	 *	@param number
	 */
	public void setRwTaskNo(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(number);
	}
	

	
	/**
	 * 	Update RwTaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwTaskNo(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(value);
	}
	
	/**
	 * 	Update RwTaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwTaskNoString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public RewriteOutCtx getRewriteOutCtx() {
            return new RewriteOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public RewriteInCtx clone() {
        RewriteInCtx cloneObj = new RewriteInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public RewriteInCtx getRewriteInCtx() {
            return new RewriteInCtx();
    }
     public class RewriteOutCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vskIoReqSize
	 *	@return vskIoReqSize
	 */
	public int getVskIoReqSize() throws CFException {        
   		return vsvksdsRecordIo.getVskIoReqSize();
	}
	
	/**
	 * 	Update VskIoReqSize with the passed value
	 *	@param number
	 */
	public void setVskIoReqSize(int number)  throws CFException{
		vsvksdsRecordIo.setVskIoReqSize(number);
	}


	public void setVskIoReqSize(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoReqSize((int)number);
	}


	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of vskIoVarStruct
	 *	@return vskIoVarStruct
	 */
   public char[] getVskIoVarStruct() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoVarStruct();
   }

  
	/**
	*  set variable vskIoVarStruct
	*  @param value
	**/
   public void setVskIoVarStruct(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(value);
   } 

     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskIoVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoVarStruct with another Field
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source) {
      vsvksdsRecordIo.setVskIoVarStruct(source);
   }  
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskSVarStruct
	 *	@return vskSVarStruct
	 */
   public char[] getVskSVarStruct() throws CFException  {              
   		return vsvksdsRecordS.getVskSVarStruct();
   }

  
	/**
	*  set variable vskSVarStruct
	*  @param value
	**/
   public void setVskSVarStruct(char[] value) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(value);
   } 

     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex);
   	
   }
   
   public void setVskSVarStruct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSVarStruct with another Field
	 *	@param value
	 */
   public void setVskSVarStruct(Field source) {
      vsvksdsRecordS.setVskSVarStruct(source);
   }  
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSVarStruct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSVarStruct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSVarStruct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskIoSysid
	 *	@return vskIoSysid
	 */
   public char[] getVskIoSysid() throws CFException  {              
   		return vsvksdsRecordIo.getVskIoSysid();
   }

  
	/**
	*  set variable vskIoSysid
	*  @param value
	**/
   public void setVskIoSysid(char[] value) throws CFException {
      vsvksdsRecordIo.setVskIoSysid(value);
   } 

     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex);
   	
   }
   
   public void setVskIoSysid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskIoSysid with another Field
	 *	@param value
	 */
   public void setVskIoSysid(Field source) {
      vsvksdsRecordIo.setVskIoSysid(source);
   }  
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskIoSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskIoSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordIo.setVskIoSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getVskSTaskNo() throws CFException {  
        return vsvksdsRecordS.getVskSTaskNo();
}
	/**
	 * 	Update VskSTaskNo with the passed value
	 *	@param number
	 */
	public void setVskSTaskNo(int number)  throws CFException{
		vsvksdsRecordS.setVskSTaskNo(number);
	}


	public void setVskSTaskNo(long number)  throws CFException{
	    vsvksdsRecordS.setVskSTaskNo(number);
	}
	

	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException  {              
   		return work.getCharstr();
   }

  
	/**
	*  set variable charstr
	*  @param value
	**/
   public void setCharstr(char[] value) throws CFException {
      work.setCharstr(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Returns the value of rwKey
	 *	@return rwKey
	 */
	public long getRwKey() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwKey();
	}


	/**
	 *	Returns String value of rwKey
	 *	@return rwKey
	 */
	public char[]  getRwKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwKeyIsNumeric();
	}

	/**
	 * 	Update RwKey with the passed value
	 *	@param number
	 */
	public void setRwKey(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwKey(number);
	}
	

	
	/**
	 * 	Update RwKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwKey(value);
	}
	
	/**
	 * 	Update RwKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwKey(value);
	}	

	/**
	 *	Returns the value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public long getRwTaskNo() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwTaskNo();
	}


	/**
	 *	Returns String value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public char[]  getRwTaskNoString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwTaskNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwTaskNoIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwTaskNoIsNumeric();
	}

	/**
	 * 	Update RwTaskNo with the passed value
	 *	@param number
	 */
	public void setRwTaskNo(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(number);
	}
	

	
	/**
	 * 	Update RwTaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwTaskNo(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(value);
	}
	
	/**
	 * 	Update RwTaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwTaskNoString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwTaskNo(value);
	}	

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of rwReqSize
	 *	@return rwReqSize
	 */
	public long getRwReqSize() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwReqSize();
	}


	/**
	 *	Returns String value of rwReqSize
	 *	@return rwReqSize
	 */
	public char[]  getRwReqSizeString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwReqSizeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwReqSizeIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwReqSizeIsNumeric();
	}

	/**
	 * 	Update RwReqSize with the passed value
	 *	@param number
	 */
	public void setRwReqSize(long number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(number);
	}
	

	
	/**
	 * 	Update RwReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwReqSize(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(value);
	}
	
	/**
	 * 	Update RwReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwReqSizeString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwReqSize(value);
	}	

	/**
	 *	Returns the value of rwDataLen
	 *	@return rwDataLen
	 */
	public int getRwDataLen() throws CFException {
   		return acceptInputGroup.getInput().getRewriteData().getRwDataLen();
	}


	/**
	 *	Returns String value of rwDataLen
	 *	@return rwDataLen
	 */
	public char[]  getRwDataLenString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getRewriteData().getRwDataLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwDataLenIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getRewriteData().rwDataLenIsNumeric();
	}

	/**
	 * 	Update RwDataLen with the passed value
	 *	@param number
	 */
	public void setRwDataLen(int number)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(number);
	}
	

	public void setRwDataLen(long number)  throws CFException{
	    acceptInputGroup.getInput().getRewriteData().setRwDataLen(number);
	}
	
	
	/**
	 * 	Update RwDataLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setRwDataLen(char[] value)  throws CFException {
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(value);
	}
	
	/**
	 * 	Update RwDataLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRwDataLenString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getRewriteData().setRwDataLen(value);
	}	

	/**
	 *	Returns the value of vskSSysid
	 *	@return vskSSysid
	 */
   public char[] getVskSSysid() throws CFException  {              
   		return vsvksdsRecordS.getVskSSysid();
   }

  
	/**
	*  set variable vskSSysid
	*  @param value
	**/
   public void setVskSSysid(char[] value) throws CFException {
      vsvksdsRecordS.setVskSSysid(value);
   } 

     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex) throws CFException {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex);
   	
   }
   
   public void setVskSSysid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VskSSysid with another Field
	 *	@param value
	 */
   public void setVskSSysid(Field source) {
      vsvksdsRecordS.setVskSSysid(source);
   }  
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VskSSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVskSSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vsvksdsRecordS.setVskSSysid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getVskIoTaskNo() throws CFException {  
        return vsvksdsRecordIo.getVskIoTaskNo();
}
	/**
	 * 	Update VskIoTaskNo with the passed value
	 *	@param number
	 */
	public void setVskIoTaskNo(int number)  throws CFException{
		vsvksdsRecordIo.setVskIoTaskNo(number);
	}


	public void setVskIoTaskNo(long number)  throws CFException{
	    vsvksdsRecordIo.setVskIoTaskNo(number);
	}
	

	/**
	 *	Returns the value of vskSReqSize
	 *	@return vskSReqSize
	 */
	public int getVskSReqSize() throws CFException {        
   		return vsvksdsRecordS.getVskSReqSize();
	}
	
	/**
	 * 	Update VskSReqSize with the passed value
	 *	@param number
	 */
	public void setVskSReqSize(int number)  throws CFException{
		vsvksdsRecordS.setVskSReqSize(number);
	}


	public void setVskSReqSize(long number)  throws CFException{
		vsvksdsRecordS.setVskSReqSize((int)number);
	}



        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public RewriteOutCtx clone() {
        RewriteOutCtx cloneObj = new RewriteOutCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public RewriteOutCtx getRewriteOutCtx() {
            return new RewriteOutCtx();
    }
     public class KeyreadInCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}
	/**
	 *	Returns the value of kKey
	 *	@return kKey
	 */
	public long getKKey() throws CFException {
   		return acceptInputGroup.getInput().getKeyreadData().getKKey();
	}


	/**
	 *	Returns String value of kKey
	 *	@return kKey
	 */
	public char[]  getKKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getKeyreadData().getKKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean kKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getKeyreadData().kKeyIsNumeric();
	}

	/**
	 * 	Update KKey with the passed value
	 *	@param number
	 */
	public void setKKey(long number)  throws CFException{
		acceptInputGroup.getInput().getKeyreadData().setKKey(number);
	}
	

	
	/**
	 * 	Update KKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setKKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getKeyreadData().setKKey(value);
	}
	
	/**
	 * 	Update KKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setKKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getKeyreadData().setKKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public KeyreadOutCtx getKeyreadOutCtx() {
            return new KeyreadOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public KeyreadInCtx clone() {
        KeyreadInCtx cloneObj = new KeyreadInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadInCtx getKeyreadInCtx() {
            return new KeyreadInCtx();
    }
     public class KeyreadOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Returns the value of kKey
	 *	@return kKey
	 */
	public long getKKey() throws CFException {
   		return acceptInputGroup.getInput().getKeyreadData().getKKey();
	}


	/**
	 *	Returns String value of kKey
	 *	@return kKey
	 */
	public char[]  getKKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getKeyreadData().getKKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean kKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getKeyreadData().kKeyIsNumeric();
	}

	/**
	 * 	Update KKey with the passed value
	 *	@param number
	 */
	public void setKKey(long number)  throws CFException{
		acceptInputGroup.getInput().getKeyreadData().setKKey(number);
	}
	

	
	/**
	 * 	Update KKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setKKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getKeyreadData().setKKey(value);
	}
	
	/**
	 * 	Update KKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setKKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getKeyreadData().setKKey(value);
	}	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public KeyreadOutCtx clone() {
        KeyreadOutCtx cloneObj = new KeyreadOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadOutCtx getKeyreadOutCtx() {
            return new KeyreadOutCtx();
    }
     public class ReadallInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of readallData
	 *	@return readallData
	 */   
	 public ReadallData getReadallData() {
   	return acceptInputGroup.getInput().getReadallData();
   }

   /**
	* 	Update ReadallData with the passed value
	*	@param value
	*/
   public void setReadallData(char[] value) throws CFException {
      acceptInputGroup.getInput().setReadallData(value);
   }   

     /**
	 * 	Update ReadallData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setReadallData(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	acceptInputGroup.getInput().setReadallData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReadallData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadallData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.getInput().setReadallData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReadallData with another Field
	 *	@param value
	 */
   public void setReadallData(Field source) {
   	acceptInputGroup.getInput().setReadallData(source);
   }  
   
     /**
	 * 	Update ReadallData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setReadallData(Field source, int sourceIndex,int sourceLen) {
   	acceptInputGroup.getInput().setReadallData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReadallData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadallData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.getInput().setReadallData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rKey
	 *	@return rKey
	 */
	public long getRKey() throws CFException {
   		return acceptInputGroup.getInput().getReadallData().getRKey();
	}


	/**
	 *	Returns String value of rKey
	 *	@return rKey
	 */
	public char[]  getRKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getReadallData().getRKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getReadallData().rKeyIsNumeric();
	}

	/**
	 * 	Update RKey with the passed value
	 *	@param number
	 */
	public void setRKey(long number)  throws CFException{
		acceptInputGroup.getInput().getReadallData().setRKey(number);
	}
	

	
	/**
	 * 	Update RKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getReadallData().setRKey(value);
	}
	
	/**
	 * 	Update RKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getReadallData().setRKey(value);
	}	

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}




        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public ReadallOutCtx getReadallOutCtx() {
            return new ReadallOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadallInCtx clone() {
        ReadallInCtx cloneObj = new ReadallInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadallInCtx getReadallInCtx() {
            return new ReadallInCtx();
    }
     public class ReadallOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Test condition "Y" for isEndOfVsvksds()
	 *	@return  Returns true if isEndOfVsvksds() is "Y"
	 */
   public boolean isEndOfVsvksds() throws CFException {
      return work.isEndOfVsvksds();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfVsvksdsTrue()  throws CFException{  			
    	work.setEndOfVsvksdsTrue();
   	}
	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of rKey
	 *	@return rKey
	 */
	public long getRKey() throws CFException {
   		return acceptInputGroup.getInput().getReadallData().getRKey();
	}


	/**
	 *	Returns String value of rKey
	 *	@return rKey
	 */
	public char[]  getRKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getReadallData().getRKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getReadallData().rKeyIsNumeric();
	}

	/**
	 * 	Update RKey with the passed value
	 *	@param number
	 */
	public void setRKey(long number)  throws CFException{
		acceptInputGroup.getInput().getReadallData().setRKey(number);
	}
	

	
	/**
	 * 	Update RKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getReadallData().setRKey(value);
	}
	
	/**
	 * 	Update RKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getReadallData().setRKey(value);
	}	

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}




        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordS.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public ReadallOutCtx clone() {
        ReadallOutCtx cloneObj = new ReadallOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReadallOutCtx getReadallOutCtx() {
            return new ReadallOutCtx();
    }
     public class ReadnxtInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public ReadnxtOutCtx getReadnxtOutCtx() {
            return new ReadnxtOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadnxtInCtx clone() {
        ReadnxtInCtx cloneObj = new ReadnxtInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadnxtInCtx getReadnxtInCtx() {
            return new ReadnxtInCtx();
    }
     public class ReadnxtOutCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vsamRecordDisp
	 *	@return vsamRecordDisp
	 */
   public char[] getVsamRecordDisp() throws CFException  {              
   		return work.getVsamRecordDisp();
   }

  
	/**
	*  set variable vsamRecordDisp
	*  @param value
	**/
   public void setVsamRecordDisp(char[] value) throws CFException {
      work.setVsamRecordDisp(value);
   } 

	/**
	 *	Returns the value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public long getPrimaryKeyDisp() throws CFException {
   		return work.getPrimaryKeyDisp();
	}


	/**
	 *	Returns String value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public char[]  getPrimaryKeyDispString() throws CFException {
	     return String.valueOf(work.getPrimaryKeyDispString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean primaryKeyDispIsNumeric()  throws CFException{
	    return work.primaryKeyDispIsNumeric();
	}

	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param number
	 */
	public void setPrimaryKeyDisp(long number)  throws CFException{
		work.setPrimaryKeyDisp(number);
	}
	

	
	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDisp(char[] value)  throws CFException {
		work.setPrimaryKeyDisp(value);
	}
	
	/**
	 * 	Update PrimaryKeyDisp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDispString(char[] value)  throws CFException{
		work.setPrimaryKeyDisp(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}




        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadnxtOutCtx clone() {
        ReadnxtOutCtx cloneObj = new ReadnxtOutCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadnxtOutCtx getReadnxtOutCtx() {
            return new ReadnxtOutCtx();
    }
     public class DelallOutCtx implements Cloneable {
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isEndOfVsvksds()
	 *	@return  Returns true if isEndOfVsvksds() is "Y"
	 */
   public boolean isEndOfVsvksds() throws CFException {
      return work.isEndOfVsvksds();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfVsvksdsTrue()  throws CFException{  			
    	work.setEndOfVsvksdsTrue();
   	}
	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}




        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DelallOutCtx clone() {
        DelallOutCtx cloneObj = new DelallOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DelallOutCtx getDelallOutCtx() {
            return new DelallOutCtx();
    }
     public class StartInCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();
     Work work = Vsammon4Ctx.this.getWork();

	/**
	 *	Test condition ">=" for isGe()
	 *	@return  Returns true if isGe() is ">="
	 */
   public boolean isGe() throws CFException {
      return acceptInputGroup.getInput().getStartData().isGe();
   }

	/**
	*  set values ">="
	*/
   	public void setGeTrue()  throws CFException{  			
    	acceptInputGroup.getInput().getStartData().setGeTrue();
   	}
	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of sOperation
	 *	@return sOperation
	 */
   public char[] getSOperation() throws CFException  {              
   		return acceptInputGroup.getInput().getStartData().getSOperation();
   }

  
	/**
	*  set variable sOperation
	*  @param value
	**/
   public void setSOperation(char[] value) throws CFException {
      acceptInputGroup.getInput().getStartData().setSOperation(value);
   } 

     /**
	 * 	Update SOperation 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSOperation(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getStartData().setSOperation(source, sourceIndex);
   	
   }
   
   public void setSOperation(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getStartData().setSOperation(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SOperation 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSOperation(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getStartData().setSOperation(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SOperation with another Field
	 *	@param value
	 */
   public void setSOperation(Field source) {
      acceptInputGroup.getInput().getStartData().setSOperation(source);
   }  
   
     /**
	 * 	Update SOperation 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSOperation(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getStartData().setSOperation(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SOperation 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSOperation(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getStartData().setSOperation(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "= " for isEq()
	 *	@return  Returns true if isEq() is "= "
	 */
   public boolean isEq() throws CFException {
      return acceptInputGroup.getInput().getStartData().isEq();
   }

	/**
	*  set values "= "
	*/
   	public void setEqTrue()  throws CFException{  			
    	acceptInputGroup.getInput().getStartData().setEqTrue();
   	}
	/**
	 *	Returns the value of sKey
	 *	@return sKey
	 */
	public long getSKey() throws CFException {
   		return acceptInputGroup.getInput().getStartData().getSKey();
	}


	/**
	 *	Returns String value of sKey
	 *	@return sKey
	 */
	public char[]  getSKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getStartData().getSKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getStartData().sKeyIsNumeric();
	}

	/**
	 * 	Update SKey with the passed value
	 *	@param number
	 */
	public void setSKey(long number)  throws CFException{
		acceptInputGroup.getInput().getStartData().setSKey(number);
	}
	

	
	/**
	 * 	Update SKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setSKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getStartData().setSKey(value);
	}
	
	/**
	 * 	Update SKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getStartData().setSKey(value);
	}	

	/**
	 *	Test condition "START  " for isCStart()
	 *	@return  Returns true if isCStart() is "START  "
	 */
   public boolean isCStart() throws CFException {
      return acceptInputGroup.getInput().isCStart();
   }

	/**
	*  set values "START  "
	*/
   	public void setCStartTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCStartTrue();
   	}
	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return work.isSeqMode();
   }

	/**
	*  set values 0
	*/
   	public void setSeqModeTrue()  throws CFException{  			
    	work.setSeqModeTrue();
   	}
	/**
	 *	Test condition "> " for isGt()
	 *	@return  Returns true if isGt() is "> "
	 */
   public boolean isGt() throws CFException {
      return acceptInputGroup.getInput().getStartData().isGt();
   }

	/**
	*  set values "> "
	*/
   	public void setGtTrue()  throws CFException{  			
    	acceptInputGroup.getInput().getStartData().setGtTrue();
   	}

        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }

        public StartOutCtx getStartOutCtx() {
            return new StartOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += acceptInputGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public StartInCtx clone() {
        StartInCtx cloneObj = new StartInCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public StartInCtx getStartInCtx() {
            return new StartInCtx();
    }
     public class StartOutCtx implements Cloneable {
     VsvksdsRecordS vsvksdsRecordS = Vsammon4Ctx.this.getVsvksdsRecordS();
     Reprec reprec = Vsammon4Ctx.this.getReprec();
     VsvksdsRecordIo vsvksdsRecordIo = Vsammon4Ctx.this.getVsvksdsRecordIo();
     Work work = Vsammon4Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon4Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException  {              
   		return work.getVsvksdsFileStatus();
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) throws CFException {
      work.setVsvksdsFileStatus(value);
   } 

	/**
	 *	Returns the value of vsvksdsRecordS
	 *	@return vsvksdsRecordS
	 */   
	 public VsvksdsRecordS getVsvksdsRecordS() {
   	return vsvksdsRecordS;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public long getVskSPrimaryKey() throws CFException {
   		return vsvksdsRecordS.getVskSPrimaryKey();
	}


	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordS.getVskSPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordS.vskSPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskSPrimaryKey(long number)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskSPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}
	
	/**
	 * 	Update VskSPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskSPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordS.setVskSPrimaryKey(value);
	}	

	/**
	 *	Returns the value of sKey
	 *	@return sKey
	 */
	public long getSKey() throws CFException {
   		return acceptInputGroup.getInput().getStartData().getSKey();
	}


	/**
	 *	Returns String value of sKey
	 *	@return sKey
	 */
	public char[]  getSKeyString() throws CFException {
	     return String.valueOf(acceptInputGroup.getInput().getStartData().getSKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sKeyIsNumeric()  throws CFException{
	    return acceptInputGroup.getInput().getStartData().sKeyIsNumeric();
	}

	/**
	 * 	Update SKey with the passed value
	 *	@param number
	 */
	public void setSKey(long number)  throws CFException{
		acceptInputGroup.getInput().getStartData().setSKey(number);
	}
	

	
	/**
	 * 	Update SKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setSKey(char[] value)  throws CFException {
		acceptInputGroup.getInput().getStartData().setSKey(value);
	}
	
	/**
	 * 	Update SKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSKeyString(char[] value)  throws CFException{
		acceptInputGroup.getInput().getStartData().setSKey(value);
	}	

	/**
	 *	Returns the value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public long getVskIoPrimaryKey() throws CFException {
   		return vsvksdsRecordIo.getVskIoPrimaryKey();
	}


	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() throws CFException {
	     return String.valueOf(vsvksdsRecordIo.getVskIoPrimaryKeyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric()  throws CFException{
	    return vsvksdsRecordIo.vskIoPrimaryKeyIsNumeric();
	}

	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param number
	 */
	public void setVskIoPrimaryKey(long number)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(number);
	}
	

	
	/**
	 * 	Update VskIoPrimaryKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKey(char[] value)  throws CFException {
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}
	
	/**
	 * 	Update VskIoPrimaryKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVskIoPrimaryKeyString(char[] value)  throws CFException{
		vsvksdsRecordIo.setVskIoPrimaryKey(value);
	}	

public int getVskSTaskNo() throws CFException {  
        return vsvksdsRecordS.getVskSTaskNo();
}
	/**
	 * 	Update VskSTaskNo with the passed value
	 *	@param number
	 */
	public void setVskSTaskNo(int number)  throws CFException{
		vsvksdsRecordS.setVskSTaskNo(number);
	}


	public void setVskSTaskNo(long number)  throws CFException{
	    vsvksdsRecordS.setVskSTaskNo(number);
	}
	

	/**
	 *	Returns the value of vsvksdsRecordIo
	 *	@return vsvksdsRecordIo
	 */   
	 public VsvksdsRecordIo getVsvksdsRecordIo() {
   	return vsvksdsRecordIo;
   }


	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {        
   		return work.getVskRecordSize();
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *	@param number
	 */
	public void setVskRecordSize(long number)  throws CFException{
		work.setVskRecordSize(number);
	}



	/**
	 *	Returns the value of startKeytype
	 *	@return startKeytype
	 */
   public char[] getStartKeytype() throws CFException  {              
   		return work.getStartKeytype();
   }

  
	/**
	*  set variable startKeytype
	*  @param value
	**/
   public void setStartKeytype(char[] value) throws CFException {
      work.setStartKeytype(value);
   } 

public int getVskIoTaskNo() throws CFException {  
        return vsvksdsRecordIo.getVskIoTaskNo();
}
	/**
	 * 	Update VskIoTaskNo with the passed value
	 *	@param number
	 */
	public void setVskIoTaskNo(int number)  throws CFException{
		vsvksdsRecordIo.setVskIoTaskNo(number);
	}


	public void setVskIoTaskNo(long number)  throws CFException{
	    vsvksdsRecordIo.setVskIoTaskNo(number);
	}
	


        public Vsammon4Ctx getVsammon4Ctx() {
            return Vsammon4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vsvksdsRecordS.hashCode();
        str += reprec.hashCode();
        str += vsvksdsRecordIo.hashCode();
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public StartOutCtx clone() {
        StartOutCtx cloneObj = new StartOutCtx();
        cloneObj.vsvksdsRecordS = new VsvksdsRecordS();
        cloneObj.vsvksdsRecordS.set(vsvksdsRecordS.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.vsvksdsRecordIo = new VsvksdsRecordIo();
        cloneObj.vsvksdsRecordIo.set(vsvksdsRecordIo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public StartOutCtx getStartOutCtx() {
            return new StartOutCtx();
    }
}
