package com.cloudframe.app.dbissues;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.dbissues.dto.Cizf01o;
import com.cloudframe.app.dbissues.file.records.Fiz018oReg;
import com.cloudframe.app.dbissues.dto.Cizf01i;
import com.cloudframe.app.dbissues.dto.Work;
import com.cloudframe.app.dbissues.file.records.Fiz018iReg;


@Context
public class DbissuesCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Fiz018oReg fiz018oReg;
    Cizf01o cizf01o;
    Cizf01i cizf01i;
    Fiz018iReg fiz018iReg;
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


    public Fiz018oReg getFiz018oReg() {
        if (fiz018oReg == null) {
            fiz018oReg = new Fiz018oReg();
        }

        return fiz018oReg;
    }

    public void setFiz018oReg(Fiz018oReg fiz018oReg) {
        this.fiz018oReg = fiz018oReg;
    }
    public Cizf01o getCizf01o() {
        if (cizf01o == null) {
            cizf01o = new Cizf01o();
        }

        return cizf01o;
    }

    public void setCizf01o(Cizf01o cizf01o) {
        this.cizf01o = cizf01o;
    }
    public Cizf01i getCizf01i() {
        if (cizf01i == null) {
            cizf01i = new Cizf01i();
        }

        return cizf01i;
    }

    public void setCizf01i(Cizf01i cizf01i) {
        this.cizf01i = cizf01i;
    }
    public Fiz018iReg getFiz018iReg() {
        if (fiz018iReg == null) {
            fiz018iReg = new Fiz018iReg();
        }

        return fiz018iReg;
    }

    public void setFiz018iReg(Fiz018iReg fiz018iReg) {
        this.fiz018iReg = fiz018iReg;
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
        str += fiz018oReg.hashCode();
        str += cizf01o.hashCode();
        str += cizf01i.hashCode();
        str += fiz018iReg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DbissuesCtx clone() {
        DbissuesCtx cloneObj = new DbissuesCtx();
        cloneObj.fiz018oReg = new Fiz018oReg();
        cloneObj.fiz018oReg.set(fiz018oReg.getClonedField());
        cloneObj.cizf01o = new Cizf01o();
        cloneObj.cizf01o.set(cizf01o.getClonedField());
        cloneObj.cizf01i = new Cizf01i();
        cloneObj.cizf01i.set(cizf01i.getClonedField());
        cloneObj.fiz018iReg = new Fiz018iReg();
        cloneObj.fiz018iReg.set(fiz018iReg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class Process1000InCtx implements Cloneable {
     Fiz018oReg fiz018oReg = DbissuesCtx.this.getFiz018oReg();
     Cizf01o cizf01o = DbissuesCtx.this.getCizf01o();
     Cizf01i cizf01i = DbissuesCtx.this.getCizf01i();
     Fiz018iReg fiz018iReg = DbissuesCtx.this.getFiz018iReg();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of fiz018oReg
	 *	@return fiz018oReg
	 */   
	 public Fiz018oReg getFiz018oReg() {
   	return fiz018oReg;
   }


	/**
	 *	Returns the value of f01iIznuchar
	 *	@return f01iIznuchar
	 */
	public long getF01iIznuchar() throws CFException {
   		return cizf01i.getF01iParteFija().getF01iIznuchar();
	}


	/**
	 *	Returns String value of f01iIznuchar
	 *	@return f01iIznuchar
	 */
	public char[]  getF01iIznucharString() throws CFException {
	     return String.valueOf(cizf01i.getF01iParteFija().getF01iIznucharString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean f01iIznucharIsNumeric()  throws CFException{
	    return cizf01i.getF01iParteFija().f01iIznucharIsNumeric();
	}

	/**
	 * 	Update F01iIznuchar with the passed value
	 *	@param number
	 */
	public void setF01iIznuchar(long number)  throws CFException{
		cizf01i.getF01iParteFija().setF01iIznuchar(number);
	}
	

	
	/**
	 * 	Update F01iIznuchar with the passed value
	 *	@param value (String or char[])
	 */
	public void setF01iIznuchar(char[] value)  throws CFException {
		cizf01i.getF01iParteFija().setF01iIznuchar(value);
	}
	
	/**
	 * 	Update F01iIznuchar with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setF01iIznucharString(char[] value)  throws CFException{
		cizf01i.getF01iParteFija().setF01iIznuchar(value);
	}	

	/**
	 *	Returns the value of cizf01i
	 *	@return cizf01i
	 */   
	 public Cizf01i getCizf01i() {
   	return cizf01i;
   }


	/**
	 *	Returns the value of fiz018iReg
	 *	@return fiz018iReg
	 */   
	 public Fiz018iReg getFiz018iReg() {
   	return fiz018iReg;
   }



        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }

        public Process1000OutCtx getProcess1000OutCtx() {
            return new Process1000OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fiz018oReg.hashCode();
        str += cizf01o.hashCode();
        str += cizf01i.hashCode();
        str += fiz018iReg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process1000InCtx clone() {
        Process1000InCtx cloneObj = new Process1000InCtx();
        cloneObj.fiz018oReg = new Fiz018oReg();
        cloneObj.fiz018oReg.set(fiz018oReg.getClonedField());
        cloneObj.cizf01o = new Cizf01o();
        cloneObj.cizf01o.set(cizf01o.getClonedField());
        cloneObj.cizf01i = new Cizf01i();
        cloneObj.cizf01i.set(cizf01i.getClonedField());
        cloneObj.fiz018iReg = new Fiz018iReg();
        cloneObj.fiz018iReg.set(fiz018iReg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1000InCtx getProcess1000InCtx() {
            return new Process1000InCtx();
    }
     public class Process1000OutCtx implements Cloneable {
     Fiz018oReg fiz018oReg = DbissuesCtx.this.getFiz018oReg();
     Cizf01o cizf01o = DbissuesCtx.this.getCizf01o();
     Cizf01i cizf01i = DbissuesCtx.this.getCizf01i();
     Fiz018iReg fiz018iReg = DbissuesCtx.this.getFiz018iReg();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of fsFiz018o
	 *	@return fsFiz018o
	 */
   public char[] getFsFiz018o() throws CFException  {              
   		return work.getFsFiz018o();
   }

  
	/**
	*  set variable fsFiz018o
	*  @param value
	**/
   public void setFsFiz018o(char[] value) throws CFException {
      work.setFsFiz018o(value);
   } 

	/**
	 *	Returns the value of fsFiz018i
	 *	@return fsFiz018i
	 */
   public char[] getFsFiz018i() throws CFException  {              
   		return work.getFsFiz018i();
   }

  
	/**
	*  set variable fsFiz018i
	*  @param value
	**/
   public void setFsFiz018i(char[] value) throws CFException {
      work.setFsFiz018i(value);
   } 

	/**
	 *	Returns the value of cizf01o
	 *	@return cizf01o
	 */   
	 public Cizf01o getCizf01o() {
   	return cizf01o;
   }


	/**
	 *	Returns the value of cizf01i
	 *	@return cizf01i
	 */   
	 public Cizf01i getCizf01i() {
   	return cizf01i;
   }



        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fiz018oReg.hashCode();
        str += cizf01o.hashCode();
        str += cizf01i.hashCode();
        str += fiz018iReg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process1000OutCtx clone() {
        Process1000OutCtx cloneObj = new Process1000OutCtx();
        cloneObj.fiz018oReg = new Fiz018oReg();
        cloneObj.fiz018oReg.set(fiz018oReg.getClonedField());
        cloneObj.cizf01o = new Cizf01o();
        cloneObj.cizf01o.set(cizf01o.getClonedField());
        cloneObj.cizf01i = new Cizf01i();
        cloneObj.cizf01i.set(cizf01i.getClonedField());
        cloneObj.fiz018iReg = new Fiz018iReg();
        cloneObj.fiz018iReg.set(fiz018iReg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1000OutCtx getProcess1000OutCtx() {
            return new Process1000OutCtx();
    }
     public class ReadFiz018iInCtx implements Cloneable {
     Cizf01i cizf01i = DbissuesCtx.this.getCizf01i();
     Fiz018iReg fiz018iReg = DbissuesCtx.this.getFiz018iReg();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of cizf01i
	 *	@return cizf01i
	 */   
	 public Cizf01i getCizf01i() {
   	return cizf01i;
   }


	/**
	 *	Returns the value of lngreg018i
	 *	@return lngreg018i
	 */
	public long getLngreg018i() throws CFException {
   		return fiz018iReg.getLngreg018i();
	}


	/**
	 *	Returns String value of lngreg018i
	 *	@return lngreg018i
	 */
	public char[]  getLngreg018iString() throws CFException {
	     return String.valueOf(fiz018iReg.getLngreg018iString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lngreg018iIsNumeric()  throws CFException{
	    return fiz018iReg.lngreg018iIsNumeric();
	}

	/**
	 * 	Update Lngreg018i with the passed value
	 *	@param number
	 */
	public void setLngreg018i(long number)  throws CFException{
		fiz018iReg.setLngreg018i(number);
	}
	

	
	/**
	 * 	Update Lngreg018i with the passed value
	 *	@param value (String or char[])
	 */
	public void setLngreg018i(char[] value)  throws CFException {
		fiz018iReg.setLngreg018i(value);
	}
	
	/**
	 * 	Update Lngreg018i with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLngreg018iString(char[] value)  throws CFException{
		fiz018iReg.setLngreg018i(value);
	}	


        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }

        public ReadFiz018iOutCtx getReadFiz018iOutCtx() {
            return new ReadFiz018iOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += cizf01i.hashCode();
        str += fiz018iReg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadFiz018iInCtx clone() {
        ReadFiz018iInCtx cloneObj = new ReadFiz018iInCtx();
        cloneObj.cizf01i = new Cizf01i();
        cloneObj.cizf01i.set(cizf01i.getClonedField());
        cloneObj.fiz018iReg = new Fiz018iReg();
        cloneObj.fiz018iReg.set(fiz018iReg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadFiz018iInCtx getReadFiz018iInCtx() {
            return new ReadFiz018iInCtx();
    }
     public class ReadFiz018iOutCtx implements Cloneable {
     Cizf01i cizf01i = DbissuesCtx.this.getCizf01i();
     Fiz018iReg fiz018iReg = DbissuesCtx.this.getFiz018iReg();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of fsFiz018i
	 *	@return fsFiz018i
	 */
   public char[] getFsFiz018i() throws CFException  {              
   		return work.getFsFiz018i();
   }

  
	/**
	*  set variable fsFiz018i
	*  @param value
	**/
   public void setFsFiz018i(char[] value) throws CFException {
      work.setFsFiz018i(value);
   } 

	/**
	 *	Returns the value of fiz018iReg
	 *	@return fiz018iReg
	 */   
	 public Fiz018iReg getFiz018iReg() {
   	return fiz018iReg;
   }



        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += cizf01i.hashCode();
        str += fiz018iReg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReadFiz018iOutCtx clone() {
        ReadFiz018iOutCtx cloneObj = new ReadFiz018iOutCtx();
        cloneObj.cizf01i = new Cizf01i();
        cloneObj.cizf01i.set(cizf01i.getClonedField());
        cloneObj.fiz018iReg = new Fiz018iReg();
        cloneObj.fiz018iReg.set(fiz018iReg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReadFiz018iOutCtx getReadFiz018iOutCtx() {
            return new ReadFiz018iOutCtx();
    }
     public class WriteFiz018oInCtx implements Cloneable {
     Fiz018oReg fiz018oReg = DbissuesCtx.this.getFiz018oReg();
     Cizf01o cizf01o = DbissuesCtx.this.getCizf01o();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of fiz018oReg
	 *	@return fiz018oReg
	 */   
	 public Fiz018oReg getFiz018oReg() {
   	return fiz018oReg;
   }


	/**
	 *	Returns the value of fsFiz018i
	 *	@return fsFiz018i
	 */
   public char[] getFsFiz018i() throws CFException  {              
   		return work.getFsFiz018i();
   }

  
	/**
	*  set variable fsFiz018i
	*  @param value
	**/
   public void setFsFiz018i(char[] value) throws CFException {
      work.setFsFiz018i(value);
   } 

	/**
	 *	Returns the value of cizf01o
	 *	@return cizf01o
	 */   
	 public Cizf01o getCizf01o() {
   	return cizf01o;
   }


	/**
	 *	Returns the value of lngreg018o
	 *	@return lngreg018o
	 */
	public long getLngreg018o() throws CFException {
   		return fiz018oReg.getLngreg018o();
	}


	/**
	 *	Returns String value of lngreg018o
	 *	@return lngreg018o
	 */
	public char[]  getLngreg018oString() throws CFException {
	     return String.valueOf(fiz018oReg.getLngreg018oString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lngreg018oIsNumeric()  throws CFException{
	    return fiz018oReg.lngreg018oIsNumeric();
	}

	/**
	 * 	Update Lngreg018o with the passed value
	 *	@param number
	 */
	public void setLngreg018o(long number)  throws CFException{
		fiz018oReg.setLngreg018o(number);
	}
	

	
	/**
	 * 	Update Lngreg018o with the passed value
	 *	@param value (String or char[])
	 */
	public void setLngreg018o(char[] value)  throws CFException {
		fiz018oReg.setLngreg018o(value);
	}
	
	/**
	 * 	Update Lngreg018o with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLngreg018oString(char[] value)  throws CFException{
		fiz018oReg.setLngreg018o(value);
	}	


        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }

        public WriteFiz018oOutCtx getWriteFiz018oOutCtx() {
            return new WriteFiz018oOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fiz018oReg.hashCode();
        str += cizf01o.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteFiz018oInCtx clone() {
        WriteFiz018oInCtx cloneObj = new WriteFiz018oInCtx();
        cloneObj.fiz018oReg = new Fiz018oReg();
        cloneObj.fiz018oReg.set(fiz018oReg.getClonedField());
        cloneObj.cizf01o = new Cizf01o();
        cloneObj.cizf01o.set(cizf01o.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteFiz018oInCtx getWriteFiz018oInCtx() {
            return new WriteFiz018oInCtx();
    }
     public class WriteFiz018oOutCtx implements Cloneable {
     Fiz018oReg fiz018oReg = DbissuesCtx.this.getFiz018oReg();
     Cizf01o cizf01o = DbissuesCtx.this.getCizf01o();
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of fiz018oReg
	 *	@return fiz018oReg
	 */   
	 public Fiz018oReg getFiz018oReg() {
   	return fiz018oReg;
   }


	/**
	 *	Returns the value of fsFiz018o
	 *	@return fsFiz018o
	 */
   public char[] getFsFiz018o() throws CFException  {              
   		return work.getFsFiz018o();
   }

  
	/**
	*  set variable fsFiz018o
	*  @param value
	**/
   public void setFsFiz018o(char[] value) throws CFException {
      work.setFsFiz018o(value);
   } 


        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fiz018oReg.hashCode();
        str += cizf01o.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteFiz018oOutCtx clone() {
        WriteFiz018oOutCtx cloneObj = new WriteFiz018oOutCtx();
        cloneObj.fiz018oReg = new Fiz018oReg();
        cloneObj.fiz018oReg.set(fiz018oReg.getClonedField());
        cloneObj.cizf01o = new Cizf01o();
        cloneObj.cizf01o.set(cizf01o.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteFiz018oOutCtx getWriteFiz018oOutCtx() {
            return new WriteFiz018oOutCtx();
    }
     public class CompareOutCtx implements Cloneable {
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public int getHeightBloqtotal() throws CFException {
   		return work.getHeightBloqtotal();
	}

    /**
	 *	Returns the String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalActualString() {
		return work.getHeightBloqtotalActualString();
	}

	/**
	 *	Returns String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalString() throws CFException {
	     return String.valueOf(work.getHeightBloqtotalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean heightBloqtotalIsNumeric()  throws CFException{
	    return work.heightBloqtotalIsNumeric();
	}

	/**
	 * 	Update HeightBloqtotal with the passed value
	 *	@param number
	 */
	public void setHeightBloqtotal(int number)  throws CFException{
		work.setHeightBloqtotal(number);
	}
	

	public void setHeightBloqtotal(long number)  throws CFException{
	    work.setHeightBloqtotal(number);
	}
	
	
	/**
	 * 	Update HeightBloqtotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotal(char[] value)  throws CFException {
		work.setHeightBloqtotal(value);
	}
	
	/**
	 * 	Update HeightBloqtotal with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotalString(char[] value)  throws CFException{
		work.setHeightBloqtotal(value);
	}	

	/**
	 *	Returns the value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public BigDecimal getBodyHeightAux() throws CFException {
   		return work.getBodyHeightAux();
	}

    /**
	 *	Returns the String value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public char[]  getBodyHeightAuxActualString()  throws CFException{
	    return work.getBodyHeightAuxActualString();
	}

	 /**
     *	Returns String value of bodyHeightAux
     *	@return bodyHeightAux
     */
    public char[]  getBodyHeightAuxString() throws CFException {
         return work.getBodyHeightAuxString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bodyHeightAuxIsNumeric() {
        return work.bodyHeightAuxIsNumeric();
    }
	/**
	 * 	Update BodyHeightAux with the passed number
	 *	@param number
	 */
	public void setBodyHeightAux(BigDecimal number)  throws CFException{
		work.setBodyHeightAux(number);
   }

	/**
	 * 	Update BodyHeightAux with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBodyHeightAux(char[] value)  throws CFException{
		work.setBodyHeightAux(value);
	}   

	/**
	 *	Returns the value of bodyHeight
	 *	@return bodyHeight
	 */
	public BigDecimal getBodyHeight() throws CFException {
   		return work.getBodyHeight();
	}

    /**
	 *	Returns the String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightActualString()  throws CFException{
	    return work.getBodyHeightActualString();
	}

	 /**
     *	Returns String value of bodyHeight
     *	@return bodyHeight
     */
    public char[]  getBodyHeightString() throws CFException {
         return work.getBodyHeightString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bodyHeightIsNumeric() {
        return work.bodyHeightIsNumeric();
    }
	/**
	 * 	Update BodyHeight with the passed number
	 *	@param number
	 */
	public void setBodyHeight(BigDecimal number)  throws CFException{
		work.setBodyHeight(number);
   }

	/**
	 * 	Update BodyHeight with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBodyHeight(char[] value)  throws CFException{
		work.setBodyHeight(value);
	}   


        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
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

    public CompareOutCtx clone() {
        CompareOutCtx cloneObj = new CompareOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CompareOutCtx getCompareOutCtx() {
            return new CompareOutCtx();
    }
     public class HandleIfInCtx implements Cloneable {
     Work work = DbissuesCtx.this.getWork();

	/**
	 *	Returns the value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public int getHeightBloqtotal() throws CFException {
   		return work.getHeightBloqtotal();
	}

    /**
	 *	Returns the String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalActualString() {
		return work.getHeightBloqtotalActualString();
	}

	/**
	 *	Returns String value of heightBloqtotal
	 *	@return heightBloqtotal
	 */
	public char[]  getHeightBloqtotalString() throws CFException {
	     return String.valueOf(work.getHeightBloqtotalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean heightBloqtotalIsNumeric()  throws CFException{
	    return work.heightBloqtotalIsNumeric();
	}

	/**
	 * 	Update HeightBloqtotal with the passed value
	 *	@param number
	 */
	public void setHeightBloqtotal(int number)  throws CFException{
		work.setHeightBloqtotal(number);
	}
	

	public void setHeightBloqtotal(long number)  throws CFException{
	    work.setHeightBloqtotal(number);
	}
	
	
	/**
	 * 	Update HeightBloqtotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotal(char[] value)  throws CFException {
		work.setHeightBloqtotal(value);
	}
	
	/**
	 * 	Update HeightBloqtotal with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHeightBloqtotalString(char[] value)  throws CFException{
		work.setHeightBloqtotal(value);
	}	

	/**
	 *	Returns the value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public BigDecimal getBodyHeightAux() throws CFException {
   		return work.getBodyHeightAux();
	}

    /**
	 *	Returns the String value of bodyHeightAux
	 *	@return bodyHeightAux
	 */
	public char[]  getBodyHeightAuxActualString()  throws CFException{
	    return work.getBodyHeightAuxActualString();
	}

	 /**
     *	Returns String value of bodyHeightAux
     *	@return bodyHeightAux
     */
    public char[]  getBodyHeightAuxString() throws CFException {
         return work.getBodyHeightAuxString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bodyHeightAuxIsNumeric() {
        return work.bodyHeightAuxIsNumeric();
    }
	/**
	 * 	Update BodyHeightAux with the passed number
	 *	@param number
	 */
	public void setBodyHeightAux(BigDecimal number)  throws CFException{
		work.setBodyHeightAux(number);
   }

	/**
	 * 	Update BodyHeightAux with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBodyHeightAux(char[] value)  throws CFException{
		work.setBodyHeightAux(value);
	}   

	/**
	 *	Returns the value of bodyHeight
	 *	@return bodyHeight
	 */
	public BigDecimal getBodyHeight() throws CFException {
   		return work.getBodyHeight();
	}

    /**
	 *	Returns the String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightActualString()  throws CFException{
	    return work.getBodyHeightActualString();
	}

	 /**
     *	Returns String value of bodyHeight
     *	@return bodyHeight
     */
    public char[]  getBodyHeightString() throws CFException {
         return work.getBodyHeightString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bodyHeightIsNumeric() {
        return work.bodyHeightIsNumeric();
    }
	/**
	 * 	Update BodyHeight with the passed number
	 *	@param number
	 */
	public void setBodyHeight(BigDecimal number)  throws CFException{
		work.setBodyHeight(number);
   }

	/**
	 * 	Update BodyHeight with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBodyHeight(char[] value)  throws CFException{
		work.setBodyHeight(value);
	}   


        public DbissuesCtx getDbissuesCtx() {
            return DbissuesCtx.this;
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

    public HandleIfInCtx clone() {
        HandleIfInCtx cloneObj = new HandleIfInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public HandleIfInCtx getHandleIfInCtx() {
            return new HandleIfInCtx();
    }
}
