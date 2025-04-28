package com.cloudframe.app.gp004760;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.gp004760.dto.CabTccArray800;
import com.cloudframe.app.gp004760.dto.ThisProgramNameGroup300;
import com.cloudframe.app.gp004760.dto.Sqlwarn;
import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
import com.cloudframe.app.gp004760.dto.Tgpaitb;
import com.cloudframe.app.gp004760.dto.Work;
import com.cloudframe.app.gp004760.dto.Sqlca;
import com.cloudframe.app.gp004760.dto.Gp004760CabTccExtract;
import java.sql.ResultSet;
import com.cloudframe.app.gp004760.file.records.Sys202NspkCabTccExtRec;
import com.cloudframe.app.gp004760.dto.Db2ErrModuleMsg600;
import com.cloudframe.app.gp004760.file.records.Sys201CabTccExtRec;
import com.cloudframe.app.gp004760.dto.NspkExtractRec800;


@Context
public class Gp004760Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Db85102dWorkFields db85102dWorkFields;
    ThisProgramNameGroup300 thisProgramNameGroup300;
    Tgpaitb tgpaitb;
    Work work;
    Sqlca sqlca;
    CabTccArray800 cabTccArray800;
    Db2ErrModuleMsg600 db2ErrModuleMsg600;
    NspkExtractRec800 nspkExtractRec800;
    Sys201CabTccExtRec sys201CabTccExtRec;
    Sys202NspkCabTccExtRec sys202NspkCabTccExtRec;
    Gp004760CabTccExtract gp004760CabTccExtract;


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


    ResultSet cabtccextCsrResultSet;

    public ResultSet getCabtccextCsrResultSet() {
        return this.cabtccextCsrResultSet;
    }

    public void setCabtccextCsrResultSet(ResultSet cabtccextCsrResultSet) {
        this.cabtccextCsrResultSet = cabtccextCsrResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public Db85102dWorkFields getDb85102dWorkFields() {
        if (db85102dWorkFields == null) {
            db85102dWorkFields = globalCtx.getGlobalDto(Db85102dWorkFields.class);
        }

        return db85102dWorkFields;
    }

    public ThisProgramNameGroup300 getThisProgramNameGroup300() {
        if (thisProgramNameGroup300 == null) {
            thisProgramNameGroup300 = new ThisProgramNameGroup300();
        }

        return thisProgramNameGroup300;
    }

    public void setThisProgramNameGroup300(ThisProgramNameGroup300 thisProgramNameGroup300) {
        this.thisProgramNameGroup300 = thisProgramNameGroup300;
    }
    public Tgpaitb getTgpaitb() {
        if (tgpaitb == null) {
            tgpaitb = new Tgpaitb();
        }

        return tgpaitb;
    }

    public void setTgpaitb(Tgpaitb tgpaitb) {
        this.tgpaitb = tgpaitb;
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
    public CabTccArray800 getCabTccArray800() {
        if (cabTccArray800 == null) {
            cabTccArray800 = new CabTccArray800();
        }

        return cabTccArray800;
    }

    public void setCabTccArray800(CabTccArray800 cabTccArray800) {
        this.cabTccArray800 = cabTccArray800;
    }
    public Db2ErrModuleMsg600 getDb2ErrModuleMsg600() {
        if (db2ErrModuleMsg600 == null) {
            db2ErrModuleMsg600 = new Db2ErrModuleMsg600();
        }

        return db2ErrModuleMsg600;
    }

    public void setDb2ErrModuleMsg600(Db2ErrModuleMsg600 db2ErrModuleMsg600) {
        this.db2ErrModuleMsg600 = db2ErrModuleMsg600;
    }
    public NspkExtractRec800 getNspkExtractRec800() {
        if (nspkExtractRec800 == null) {
            nspkExtractRec800 = new NspkExtractRec800();
        }

        return nspkExtractRec800;
    }

    public void setNspkExtractRec800(NspkExtractRec800 nspkExtractRec800) {
        this.nspkExtractRec800 = nspkExtractRec800;
    }
    public Sys201CabTccExtRec getSys201CabTccExtRec() {
        if (sys201CabTccExtRec == null) {
            sys201CabTccExtRec = new Sys201CabTccExtRec();
        }

        return sys201CabTccExtRec;
    }

    public void setSys201CabTccExtRec(Sys201CabTccExtRec sys201CabTccExtRec) {
        this.sys201CabTccExtRec = sys201CabTccExtRec;
    }
    public Sys202NspkCabTccExtRec getSys202NspkCabTccExtRec() {
        if (sys202NspkCabTccExtRec == null) {
            sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        }

        return sys202NspkCabTccExtRec;
    }

    public void setSys202NspkCabTccExtRec(Sys202NspkCabTccExtRec sys202NspkCabTccExtRec) {
        this.sys202NspkCabTccExtRec = sys202NspkCabTccExtRec;
    }
    public Gp004760CabTccExtract getGp004760CabTccExtract() {
        if (gp004760CabTccExtract == null) {
            gp004760CabTccExtract = new Gp004760CabTccExtract();
        }

        return gp004760CabTccExtract;
    }

    public void setGp004760CabTccExtract(Gp004760CabTccExtract gp004760CabTccExtract) {
        this.gp004760CabTccExtract = gp004760CabTccExtract;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db85102dWorkFields.hashCode();
        str += thisProgramNameGroup300.hashCode();
        str += tgpaitb.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += cabTccArray800.hashCode();
        str += db2ErrModuleMsg600.hashCode();
        str += nspkExtractRec800.hashCode();
        str += sys201CabTccExtRec.hashCode();
        str += sys202NspkCabTccExtRec.hashCode();
        str += gp004760CabTccExtract.hashCode();
       return str.hashCode();
    }

    public Gp004760Ctx clone() {
        Gp004760Ctx cloneObj = new Gp004760Ctx();
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        cloneObj.thisProgramNameGroup300 = new ThisProgramNameGroup300();
        cloneObj.thisProgramNameGroup300.set(thisProgramNameGroup300.getClonedField());
        cloneObj.tgpaitb = new Tgpaitb();
        cloneObj.tgpaitb.set(tgpaitb.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        cloneObj.db2ErrModuleMsg600 = new Db2ErrModuleMsg600();
        cloneObj.db2ErrModuleMsg600.set(db2ErrModuleMsg600.getClonedField());
        cloneObj.nspkExtractRec800 = new NspkExtractRec800();
        cloneObj.nspkExtractRec800.set(nspkExtractRec800.getClonedField());
        cloneObj.sys201CabTccExtRec = new Sys201CabTccExtRec();
        cloneObj.sys201CabTccExtRec.set(sys201CabTccExtRec.getClonedField());
        cloneObj.sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        cloneObj.sys202NspkCabTccExtRec.set(sys202NspkCabTccExtRec.getClonedField());
        cloneObj.gp004760CabTccExtract = new Gp004760CabTccExtract();
        cloneObj.gp004760CabTccExtract.set(gp004760CabTccExtract.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializationOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     CabTccArray800 cabTccArray800 = Gp004760Ctx.this.getCabTccArray800();

	/**
	 *	Returns the value of outfileCnt
	 *	@return outfileCnt
	 */
	public long getOutfileCnt() throws CFException {
   		return work.getOutfileCnt();
	}


	/**
	 *	Returns String value of outfileCnt
	 *	@return outfileCnt
	 */
	public char[]  getOutfileCntString() throws CFException {
	     return String.valueOf(work.getOutfileCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outfileCntIsNumeric()  throws CFException{
	    return work.outfileCntIsNumeric();
	}

	/**
	 * 	Update OutfileCnt with the passed value
	 *	@param number
	 */
	public void setOutfileCnt(long number)  throws CFException{
		work.setOutfileCnt(number);
	}
	

	
	/**
	 * 	Update OutfileCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutfileCnt(char[] value)  throws CFException {
		work.setOutfileCnt(value);
	}
	
	/**
	 * 	Update OutfileCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutfileCntString(char[] value)  throws CFException{
		work.setOutfileCnt(value);
	}	

	/**
	 *	Returns the value of cabTccArray800
	 *	@return cabTccArray800
	 */   
	 public CabTccArray800 getCabTccArray800() {
   	return cabTccArray800;
   }


	/**
	 *	Returns the value of ocrCnt
	 *	@return ocrCnt
	 */
	public int getOcrCnt() throws CFException {
   		return work.getOcrCnt();
	}


	/**
	 *	Returns String value of ocrCnt
	 *	@return ocrCnt
	 */
	public char[]  getOcrCntString() throws CFException {
	     return String.valueOf(work.getOcrCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ocrCntIsNumeric()  throws CFException{
	    return work.ocrCntIsNumeric();
	}

	/**
	 * 	Update OcrCnt with the passed value
	 *	@param number
	 */
	public void setOcrCnt(int number)  throws CFException{
		work.setOcrCnt(number);
	}
	

	public void setOcrCnt(long number)  throws CFException{
	    work.setOcrCnt(number);
	}
	
	
	/**
	 * 	Update OcrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOcrCnt(char[] value)  throws CFException {
		work.setOcrCnt(value);
	}
	
	/**
	 * 	Update OcrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOcrCntString(char[] value)  throws CFException{
		work.setOcrCnt(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += cabTccArray800.hashCode();
       return str.hashCode();
    }

    public InitializationOutCtx clone() {
        InitializationOutCtx cloneObj = new InitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        return cloneObj;
    }

    }

    public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
    }
     public class OpenSys201FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys201CabTccExtRec sys201CabTccExtRec = Gp004760Ctx.this.getSys201CabTccExtRec();

	/**
	 *	Returns the value of sys201CabTccExtRec
	 *	@return sys201CabTccExtRec
	 */   
	 public Sys201CabTccExtRec getSys201CabTccExtRec() {
   	return sys201CabTccExtRec;
   }



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public OpenSys201FileOutCtx getOpenSys201FileOutCtx() {
            return new OpenSys201FileOutCtx();
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
        str += sys201CabTccExtRec.hashCode();
       return str.hashCode();
    }

    public OpenSys201FileInCtx clone() {
        OpenSys201FileInCtx cloneObj = new OpenSys201FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201CabTccExtRec = new Sys201CabTccExtRec();
        cloneObj.sys201CabTccExtRec.set(sys201CabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys201FileInCtx getOpenSys201FileInCtx() {
            return new OpenSys201FileInCtx();
    }
     public class OpenSys201FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys201CabTccExtRec sys201CabTccExtRec = Gp004760Ctx.this.getSys201CabTccExtRec();

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 

	/**
	 *	Test condition "3001" for isFileOpenAbendCode88300()
	 *	@return  Returns true if isFileOpenAbendCode88300() is "3001"
	 */
   public boolean isFileOpenAbendCode88300() throws CFException {
      return work.isFileOpenAbendCode88300();
   }

	/**
	*  set values "3001"
	*/
   	public void setFileOpenAbendCode88300True()  throws CFException{  			
    	work.setFileOpenAbendCode88300True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException  {              
   		return work.getSys202FileStatus200();
   }

  
	/**
	*  set variable sys202FileStatus200
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) throws CFException {
      work.setSys202FileStatus200(value);
   } 

	/**
	 *	Test condition "ERROR OPENING SYS201 CAB EXTRACT FILE" for isAbendOpenSys20188600()
	 *	@return  Returns true if isAbendOpenSys20188600() is "ERROR OPENING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendOpenSys20188600() throws CFException {
      return work.isAbendOpenSys20188600();
   }

	/**
	*  set values "ERROR OPENING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendOpenSys20188600True()  throws CFException{  			
    	work.setAbendOpenSys20188600True();
   	}
	/**
	 *	Test condition "1100-OPEN-SYS201-FILE" for isOpenSys201Para88300()
	 *	@return  Returns true if isOpenSys201Para88300() is "1100-OPEN-SYS201-FILE"
	 */
   public boolean isOpenSys201Para88300() throws CFException {
      return work.isOpenSys201Para88300();
   }

	/**
	*  set values "1100-OPEN-SYS201-FILE"
	*/
   	public void setOpenSys201Para88300True()  throws CFException{  			
    	work.setOpenSys201Para88300True();
   	}
	/**
	 *	Test condition "00" for isSys201Success88200()
	 *	@return  Returns true if isSys201Success88200() is "00"
	 */
   public boolean isSys201Success88200() throws CFException {
      return work.isSys201Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201Success88200True()  throws CFException{  			
    	work.setSys201Success88200True();
   	}

        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += sys201CabTccExtRec.hashCode();
       return str.hashCode();
    }

    public OpenSys201FileOutCtx clone() {
        OpenSys201FileOutCtx cloneObj = new OpenSys201FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201CabTccExtRec = new Sys201CabTccExtRec();
        cloneObj.sys201CabTccExtRec.set(sys201CabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys201FileOutCtx getOpenSys201FileOutCtx() {
            return new OpenSys201FileOutCtx();
    }
     public class OpenSys202FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys202NspkCabTccExtRec sys202NspkCabTccExtRec = Gp004760Ctx.this.getSys202NspkCabTccExtRec();

	/**
	 *	Returns the value of sys202NspkCabTccExtRec
	 *	@return sys202NspkCabTccExtRec
	 */   
	 public Sys202NspkCabTccExtRec getSys202NspkCabTccExtRec() {
   	return sys202NspkCabTccExtRec;
   }



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public OpenSys202FileOutCtx getOpenSys202FileOutCtx() {
            return new OpenSys202FileOutCtx();
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
        str += sys202NspkCabTccExtRec.hashCode();
       return str.hashCode();
    }

    public OpenSys202FileInCtx clone() {
        OpenSys202FileInCtx cloneObj = new OpenSys202FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        cloneObj.sys202NspkCabTccExtRec.set(sys202NspkCabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys202FileInCtx getOpenSys202FileInCtx() {
            return new OpenSys202FileInCtx();
    }
     public class OpenSys202FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys202NspkCabTccExtRec sys202NspkCabTccExtRec = Gp004760Ctx.this.getSys202NspkCabTccExtRec();

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 

	/**
	 *	Test condition "3001" for isFileOpenAbendCode88300()
	 *	@return  Returns true if isFileOpenAbendCode88300() is "3001"
	 */
   public boolean isFileOpenAbendCode88300() throws CFException {
      return work.isFileOpenAbendCode88300();
   }

	/**
	*  set values "3001"
	*/
   	public void setFileOpenAbendCode88300True()  throws CFException{  			
    	work.setFileOpenAbendCode88300True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Test condition "00" for isSys202Success88200()
	 *	@return  Returns true if isSys202Success88200() is "00"
	 */
   public boolean isSys202Success88200() throws CFException {
      return work.isSys202Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys202Success88200True()  throws CFException{  			
    	work.setSys202Success88200True();
   	}
	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException  {              
   		return work.getSys202FileStatus200();
   }

  
	/**
	*  set variable sys202FileStatus200
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) throws CFException {
      work.setSys202FileStatus200(value);
   } 

	/**
	 *	Test condition "ERROR OPENING SYS202 NSPK EXTRCT FILE" for isAbendOpenSys20288600()
	 *	@return  Returns true if isAbendOpenSys20288600() is "ERROR OPENING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendOpenSys20288600() throws CFException {
      return work.isAbendOpenSys20288600();
   }

	/**
	*  set values "ERROR OPENING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendOpenSys20288600True()  throws CFException{  			
    	work.setAbendOpenSys20288600True();
   	}
	/**
	 *	Test condition "1101-OPEN-SYS202-FILE" for isOpenSys202Para88300()
	 *	@return  Returns true if isOpenSys202Para88300() is "1101-OPEN-SYS202-FILE"
	 */
   public boolean isOpenSys202Para88300() throws CFException {
      return work.isOpenSys202Para88300();
   }

	/**
	*  set values "1101-OPEN-SYS202-FILE"
	*/
   	public void setOpenSys202Para88300True()  throws CFException{  			
    	work.setOpenSys202Para88300True();
   	}

        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += sys202NspkCabTccExtRec.hashCode();
       return str.hashCode();
    }

    public OpenSys202FileOutCtx clone() {
        OpenSys202FileOutCtx cloneObj = new OpenSys202FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        cloneObj.sys202NspkCabTccExtRec.set(sys202NspkCabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys202FileOutCtx getOpenSys202FileOutCtx() {
            return new OpenSys202FileOutCtx();
    }
     public class ProcessCabtccextInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isEndCabtccextCsr100()
	 *	@return  Returns true if isEndCabtccextCsr100() is "Y"
	 */
   public boolean isEndCabtccextCsr100() throws CFException {
      return work.isEndCabtccextCsr100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndCabtccextCsr100True()  throws CFException{  			
    	work.setEndCabtccextCsr100True();
   	}

        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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

    public ProcessCabtccextInCtx clone() {
        ProcessCabtccextInCtx cloneObj = new ProcessCabtccextInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessCabtccextInCtx getProcessCabtccextInCtx() {
            return new ProcessCabtccextInCtx();
    }
     public class CabtccextCsrOpenInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


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



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CabtccextCsrOpenOutCtx getCabtccextCsrOpenOutCtx() {
            return new CabtccextCsrOpenOutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrOpenInCtx clone() {
        CabtccextCsrOpenInCtx cloneObj = new CabtccextCsrOpenInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrOpenInCtx getCabtccextCsrOpenInCtx() {
            return new CabtccextCsrOpenInCtx();
    }
     public class CabtccextCsrOpenOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();

	/**
	 *	Returns the value of wsCurrTable800
	 *	@return wsCurrTable800
	 */
   public char[] getWsCurrTable800() throws CFException  {              
   		return work.getWsCurrTable800();
   }

  
	/**
	*  set variable wsCurrTable800
	*  @param value
	**/
   public void setWsCurrTable800(char[] value) throws CFException {
      work.setWsCurrTable800(value);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of wsSqlFunction800
	 *	@return wsSqlFunction800
	 */
   public char[] getWsSqlFunction800() throws CFException  {              
   		return work.getWsSqlFunction800();
   }

  
	/**
	*  set variable wsSqlFunction800
	*  @param value
	**/
   public void setWsSqlFunction800(char[] value) throws CFException {
      work.setWsSqlFunction800(value);
   } 

	/**
	 *	Returns the value of wsCurrParagraph800
	 *	@return wsCurrParagraph800
	 */
   public char[] getWsCurrParagraph800() throws CFException  {              
   		return work.getWsCurrParagraph800();
   }

  
	/**
	*  set variable wsCurrParagraph800
	*  @param value
	**/
   public void setWsCurrParagraph800(char[] value) throws CFException {
      work.setWsCurrParagraph800(value);
   } 

	/**
	 *	Test condition "N" for isStartCabtccextCsr100()
	 *	@return  Returns true if isStartCabtccextCsr100() is "N"
	 */
   public boolean isStartCabtccextCsr100() throws CFException {
      return work.isStartCabtccextCsr100();
   }

	/**
	*  set values "N"
	*/
   	public void setStartCabtccextCsr100True()  throws CFException{  			
    	work.setStartCabtccextCsr100True();
   	}
	/**
	 *	Returns the value of wsSqlcodeDisp800
	 *	@return wsSqlcodeDisp800
	 */
   public char[] getWsSqlcodeDisp800() throws CFException  {              
   		return work.getWsSqlcodeDisp800();
   }

  
	/**
	*  set variable wsSqlcodeDisp800
	*  @param value
	**/
   public void setWsSqlcodeDisp800(char[] value) throws CFException {
      work.setWsSqlcodeDisp800(value);
   } 

     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex) throws CFException {
      work.setWsSqlcodeDisp800(source, sourceIndex);
   	
   }
   
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WsSqlcodeDisp800 with another Field
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source) {
      work.setWsSqlcodeDisp800(source);
   }  
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrOpenOutCtx clone() {
        CabtccextCsrOpenOutCtx cloneObj = new CabtccextCsrOpenOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrOpenOutCtx getCabtccextCsrOpenOutCtx() {
            return new CabtccextCsrOpenOutCtx();
    }
     public class CabtccextCsrFetchInCtx implements Cloneable {
     Tgpaitb tgpaitb = Gp004760Ctx.this.getTgpaitb();
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();
     CabTccArray800 cabTccArray800 = Gp004760Ctx.this.getCabTccArray800();
     NspkExtractRec800 nspkExtractRec800 = Gp004760Ctx.this.getNspkExtractRec800();

public int getTgpaitbCabCd() throws CFException {  
        return tgpaitb.getTgpaitbCabCd();
}
	/**
	 * 	Update TgpaitbCabCd with the passed value
	 *	@param number
	 */
	public void setTgpaitbCabCd(int number)  throws CFException{
		tgpaitb.setTgpaitbCabCd(number);
	}


	public void setTgpaitbCabCd(long number)  throws CFException{
	    tgpaitb.setTgpaitbCabCd(number);
	}
	

	/**
	 *	Returns the value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public short getPlusOneHundred300() throws CFException {
   		return work.getPlusOneHundred300();
	}

    /**
	 *	Returns the String value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public char[]  getPlusOneHundred300ActualString() {
		return work.getPlusOneHundred300ActualString();
	}

	/**
	 *	Returns String value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public char[]  getPlusOneHundred300String() throws CFException {
	     return String.valueOf(work.getPlusOneHundred300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plusOneHundred300IsNumeric()  throws CFException{
	    return work.plusOneHundred300IsNumeric();
	}

	/**
	 * 	Update PlusOneHundred300 with the passed value
	 *	@param number
	 */
	public void setPlusOneHundred300(short number)  throws CFException{
		work.setPlusOneHundred300(number);
	}
	
	public void setPlusOneHundred300(int number)  throws CFException{
	    work.setPlusOneHundred300(number);
	}
	public void setPlusOneHundred300(long number)  throws CFException{
	    work.setPlusOneHundred300(number);
	}
	

	
	/**
	 * 	Update PlusOneHundred300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlusOneHundred300(char[] value)  throws CFException {
		work.setPlusOneHundred300(value);
	}
	
	/**
	 * 	Update PlusOneHundred300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlusOneHundred300String(char[] value)  throws CFException{
		work.setPlusOneHundred300(value);
	}	

	/**
	 *	Returns the value of tgpaitbAuthTxnCatCd
	 *	@return tgpaitbAuthTxnCatCd
	 */
   public char[] getTgpaitbAuthTxnCatCd() throws CFException  {              
   		return tgpaitb.getTgpaitbAuthTxnCatCd();
   }

  
	/**
	*  set variable tgpaitbAuthTxnCatCd
	*  @param value
	**/
   public void setTgpaitbAuthTxnCatCd(char[] value) throws CFException {
      tgpaitb.setTgpaitbAuthTxnCatCd(value);
   } 

     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex) throws CFException {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex);
   	
   }
   
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TgpaitbAuthTxnCatCd with another Field
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source);
   }  
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public long getIdx800() throws CFException {
   		return work.getIdx800();
	}


	/**
	 *	Returns String value of idx800
	 *	@return idx800
	 */
	public char[]  getIdx800String() throws CFException {
	     return String.valueOf(work.getIdx800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idx800IsNumeric()  throws CFException{
	    return work.idx800IsNumeric();
	}

	/**
	 * 	Update Idx800 with the passed value
	 *	@param number
	 */
	public void setIdx800(long number)  throws CFException{
		work.setIdx800(number);
	}
	

	
	/**
	 * 	Update Idx800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx800(char[] value)  throws CFException {
		work.setIdx800(value);
	}
	
	/**
	 * 	Update Idx800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdx800String(char[] value)  throws CFException{
		work.setIdx800(value);
	}	

	/**
	 *	Returns the value of tgpaitb
	 *	@return tgpaitb
	 */   
	 public Tgpaitb getTgpaitb() {
   	return tgpaitb;
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


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



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CabtccextCsrFetchOutCtx getCabtccextCsrFetchOutCtx() {
            return new CabtccextCsrFetchOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgpaitb.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += cabTccArray800.hashCode();
        str += nspkExtractRec800.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrFetchInCtx clone() {
        CabtccextCsrFetchInCtx cloneObj = new CabtccextCsrFetchInCtx();
        cloneObj.tgpaitb = new Tgpaitb();
        cloneObj.tgpaitb.set(tgpaitb.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        cloneObj.nspkExtractRec800 = new NspkExtractRec800();
        cloneObj.nspkExtractRec800.set(nspkExtractRec800.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrFetchInCtx getCabtccextCsrFetchInCtx() {
            return new CabtccextCsrFetchInCtx();
    }
     public class CabtccextCsrFetchOutCtx implements Cloneable {
     Tgpaitb tgpaitb = Gp004760Ctx.this.getTgpaitb();
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();
     CabTccArray800 cabTccArray800 = Gp004760Ctx.this.getCabTccArray800();
     NspkExtractRec800 nspkExtractRec800 = Gp004760Ctx.this.getNspkExtractRec800();

	/**
	 *	Returns the value of tgpaitbAuthTxnCatCd
	 *	@return tgpaitbAuthTxnCatCd
	 */
   public char[] getTgpaitbAuthTxnCatCd() throws CFException  {              
   		return tgpaitb.getTgpaitbAuthTxnCatCd();
   }

  
	/**
	*  set variable tgpaitbAuthTxnCatCd
	*  @param value
	**/
   public void setTgpaitbAuthTxnCatCd(char[] value) throws CFException {
      tgpaitb.setTgpaitbAuthTxnCatCd(value);
   } 

     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex) throws CFException {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex);
   	
   }
   
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TgpaitbAuthTxnCatCd with another Field
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source);
   }  
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TgpaitbAuthTxnCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgpaitbAuthTxnCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tgpaitb.setTgpaitbAuthTxnCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public long getIdx800() throws CFException {
   		return work.getIdx800();
	}


	/**
	 *	Returns String value of idx800
	 *	@return idx800
	 */
	public char[]  getIdx800String() throws CFException {
	     return String.valueOf(work.getIdx800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idx800IsNumeric()  throws CFException{
	    return work.idx800IsNumeric();
	}

	/**
	 * 	Update Idx800 with the passed value
	 *	@param number
	 */
	public void setIdx800(long number)  throws CFException{
		work.setIdx800(number);
	}
	

	
	/**
	 * 	Update Idx800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx800(char[] value)  throws CFException {
		work.setIdx800(value);
	}
	
	/**
	 * 	Update Idx800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdx800String(char[] value)  throws CFException{
		work.setIdx800(value);
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
	 *	Returns the value of wsCurrParagraph800
	 *	@return wsCurrParagraph800
	 */
   public char[] getWsCurrParagraph800() throws CFException  {              
   		return work.getWsCurrParagraph800();
   }

  
	/**
	*  set variable wsCurrParagraph800
	*  @param value
	**/
   public void setWsCurrParagraph800(char[] value) throws CFException {
      work.setWsCurrParagraph800(value);
   } 

	/**
	 *	Test condition "Y" for isEndCabtccextCsr100()
	 *	@return  Returns true if isEndCabtccextCsr100() is "Y"
	 */
   public boolean isEndCabtccextCsr100() throws CFException {
      return work.isEndCabtccextCsr100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndCabtccextCsr100True()  throws CFException{  			
    	work.setEndCabtccextCsr100True();
   	}
	/**
	 *	Returns the value of wsSqlcodeDisp800
	 *	@return wsSqlcodeDisp800
	 */
   public char[] getWsSqlcodeDisp800() throws CFException  {              
   		return work.getWsSqlcodeDisp800();
   }

  
	/**
	*  set variable wsSqlcodeDisp800
	*  @param value
	**/
   public void setWsSqlcodeDisp800(char[] value) throws CFException {
      work.setWsSqlcodeDisp800(value);
   } 

     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex) throws CFException {
      work.setWsSqlcodeDisp800(source, sourceIndex);
   	
   }
   
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WsSqlcodeDisp800 with another Field
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source) {
      work.setWsSqlcodeDisp800(source);
   }  
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getTgpaitbCabCd() throws CFException {  
        return tgpaitb.getTgpaitbCabCd();
}
	/**
	 * 	Update TgpaitbCabCd with the passed value
	 *	@param number
	 */
	public void setTgpaitbCabCd(int number)  throws CFException{
		tgpaitb.setTgpaitbCabCd(number);
	}


	public void setTgpaitbCabCd(long number)  throws CFException{
	    tgpaitb.setTgpaitbCabCd(number);
	}
	

	/**
	 *	Returns the value of wsCurrTable800
	 *	@return wsCurrTable800
	 */
   public char[] getWsCurrTable800() throws CFException  {              
   		return work.getWsCurrTable800();
   }

  
	/**
	*  set variable wsCurrTable800
	*  @param value
	**/
   public void setWsCurrTable800(char[] value) throws CFException {
      work.setWsCurrTable800(value);
   } 

	/**
	 *	Returns the value of nspkCabCd800
	 *	@return nspkCabCd800
	 */
	public int getNspkCabCd800() throws CFException {
   		return nspkExtractRec800.getNspkCabCd800();
	}


	/**
	 *	Returns String value of nspkCabCd800
	 *	@return nspkCabCd800
	 */
	public char[]  getNspkCabCd800String() throws CFException {
	     return String.valueOf(nspkExtractRec800.getNspkCabCd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nspkCabCd800IsNumeric()  throws CFException{
	    return nspkExtractRec800.nspkCabCd800IsNumeric();
	}

	/**
	 * 	Update NspkCabCd800 with the passed value
	 *	@param number
	 */
	public void setNspkCabCd800(int number)  throws CFException{
		nspkExtractRec800.setNspkCabCd800(number);
	}
	

	public void setNspkCabCd800(long number)  throws CFException{
	    nspkExtractRec800.setNspkCabCd800(number);
	}
	
	
	/**
	 * 	Update NspkCabCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNspkCabCd800(char[] value)  throws CFException {
		nspkExtractRec800.setNspkCabCd800(value);
	}
	
	/**
	 * 	Update NspkCabCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNspkCabCd800String(char[] value)  throws CFException{
		nspkExtractRec800.setNspkCabCd800(value);
	}	

	/**
	 *	Returns the value of tgpaitb
	 *	@return tgpaitb
	 */   
	 public Tgpaitb getTgpaitb() {
   	return tgpaitb;
   }


	/**
	 *	Returns the value of nspkTcc800
	 *	@return nspkTcc800
	 */
   public char[] getNspkTcc800() throws CFException  {              
   		return nspkExtractRec800.getNspkTcc800();
   }

  
	/**
	*  set variable nspkTcc800
	*  @param value
	**/
   public void setNspkTcc800(char[] value) throws CFException {
      nspkExtractRec800.setNspkTcc800(value);
   } 

     /**
	 * 	Update NspkTcc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNspkTcc800(char[] source, int sourceIndex) throws CFException {
      nspkExtractRec800.setNspkTcc800(source, sourceIndex);
   	
   }
   
   public void setNspkTcc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      nspkExtractRec800.setNspkTcc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NspkTcc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNspkTcc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      nspkExtractRec800.setNspkTcc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NspkTcc800 with another Field
	 *	@param value
	 */
   public void setNspkTcc800(Field source) {
      nspkExtractRec800.setNspkTcc800(source);
   }  
   
     /**
	 * 	Update NspkTcc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNspkTcc800(Field source, int sourceIndex,int sourceLen) {
      nspkExtractRec800.setNspkTcc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NspkTcc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNspkTcc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      nspkExtractRec800.setNspkTcc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of authTxnCatCd800
	 *	@return authTxnCatCd800
	 */
   public char[] getAuthTxnCatCd800(int index) throws CFException  {              
   		return cabTccArray800.getAuthTxnCatCd800(index);
   }

  
	/**
	*  set variable authTxnCatCd800
	*  @param value
	**/
   public void setAuthTxnCatCd800(int index,char[] value) throws CFException {
      cabTccArray800.setAuthTxnCatCd800((index),value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of wsSqlFunction800
	 *	@return wsSqlFunction800
	 */
   public char[] getWsSqlFunction800() throws CFException  {              
   		return work.getWsSqlFunction800();
   }

  
	/**
	*  set variable wsSqlFunction800
	*  @param value
	**/
   public void setWsSqlFunction800(char[] value) throws CFException {
      work.setWsSqlFunction800(value);
   } 


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgpaitb.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += cabTccArray800.hashCode();
        str += nspkExtractRec800.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrFetchOutCtx clone() {
        CabtccextCsrFetchOutCtx cloneObj = new CabtccextCsrFetchOutCtx();
        cloneObj.tgpaitb = new Tgpaitb();
        cloneObj.tgpaitb.set(tgpaitb.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        cloneObj.nspkExtractRec800 = new NspkExtractRec800();
        cloneObj.nspkExtractRec800.set(nspkExtractRec800.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrFetchOutCtx getCabtccextCsrFetchOutCtx() {
            return new CabtccextCsrFetchOutCtx();
    }
     public class CabextOutfileProcessInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     CabTccArray800 cabTccArray800 = Gp004760Ctx.this.getCabTccArray800();
     Gp004760CabTccExtract gp004760CabTccExtract = Gp004760Ctx.this.getGp004760CabTccExtract();

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public long getIdx800() throws CFException {
   		return work.getIdx800();
	}


	/**
	 *	Returns String value of idx800
	 *	@return idx800
	 */
	public char[]  getIdx800String() throws CFException {
	     return String.valueOf(work.getIdx800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idx800IsNumeric()  throws CFException{
	    return work.idx800IsNumeric();
	}

	/**
	 * 	Update Idx800 with the passed value
	 *	@param number
	 */
	public void setIdx800(long number)  throws CFException{
		work.setIdx800(number);
	}
	

	
	/**
	 * 	Update Idx800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx800(char[] value)  throws CFException {
		work.setIdx800(value);
	}
	
	/**
	 * 	Update Idx800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdx800String(char[] value)  throws CFException{
		work.setIdx800(value);
	}	

	/**
	 *	Returns the value of authTxnCatCd800
	 *	@return authTxnCatCd800
	 */
   public char[] getAuthTxnCatCd800(int index) throws CFException  {              
   		return cabTccArray800.getAuthTxnCatCd800(index);
   }

  
	/**
	*  set variable authTxnCatCd800
	*  @param value
	**/
   public void setAuthTxnCatCd800(int index,char[] value) throws CFException {
      cabTccArray800.setAuthTxnCatCd800((index),value);
   } 

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public long getSub800() throws CFException {
   		return work.getSub800();
	}


	/**
	 *	Returns String value of sub800
	 *	@return sub800
	 */
	public char[]  getSub800String() throws CFException {
	     return String.valueOf(work.getSub800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub800IsNumeric()  throws CFException{
	    return work.sub800IsNumeric();
	}

	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(long number)  throws CFException{
		work.setSub800(number);
	}
	

	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub800(char[] value)  throws CFException {
		work.setSub800(value);
	}
	
	/**
	 * 	Update Sub800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub800String(char[] value)  throws CFException{
		work.setSub800(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CabextOutfileProcessOutCtx getCabextOutfileProcessOutCtx() {
            return new CabextOutfileProcessOutCtx();
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
        str += cabTccArray800.hashCode();
        str += gp004760CabTccExtract.hashCode();
       return str.hashCode();
    }

    public CabextOutfileProcessInCtx clone() {
        CabextOutfileProcessInCtx cloneObj = new CabextOutfileProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        cloneObj.gp004760CabTccExtract = new Gp004760CabTccExtract();
        cloneObj.gp004760CabTccExtract.set(gp004760CabTccExtract.getClonedField());
        return cloneObj;
    }

    }

    public CabextOutfileProcessInCtx getCabextOutfileProcessInCtx() {
            return new CabextOutfileProcessInCtx();
    }
     public class CabextOutfileProcessOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     CabTccArray800 cabTccArray800 = Gp004760Ctx.this.getCabTccArray800();
     Gp004760CabTccExtract gp004760CabTccExtract = Gp004760Ctx.this.getGp004760CabTccExtract();

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public long getIdx800() throws CFException {
   		return work.getIdx800();
	}


	/**
	 *	Returns String value of idx800
	 *	@return idx800
	 */
	public char[]  getIdx800String() throws CFException {
	     return String.valueOf(work.getIdx800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idx800IsNumeric()  throws CFException{
	    return work.idx800IsNumeric();
	}

	/**
	 * 	Update Idx800 with the passed value
	 *	@param number
	 */
	public void setIdx800(long number)  throws CFException{
		work.setIdx800(number);
	}
	

	
	/**
	 * 	Update Idx800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx800(char[] value)  throws CFException {
		work.setIdx800(value);
	}
	
	/**
	 * 	Update Idx800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdx800String(char[] value)  throws CFException{
		work.setIdx800(value);
	}	

	/**
	 *	Returns the value of authTxnCatCd800
	 *	@return authTxnCatCd800
	 */
   public char[] getAuthTxnCatCd800(int index) throws CFException  {              
   		return cabTccArray800.getAuthTxnCatCd800(index);
   }

  
	/**
	*  set variable authTxnCatCd800
	*  @param value
	**/
   public void setAuthTxnCatCd800(int index,char[] value) throws CFException {
      cabTccArray800.setAuthTxnCatCd800((index),value);
   } 

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public long getSub800() throws CFException {
   		return work.getSub800();
	}


	/**
	 *	Returns String value of sub800
	 *	@return sub800
	 */
	public char[]  getSub800String() throws CFException {
	     return String.valueOf(work.getSub800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub800IsNumeric()  throws CFException{
	    return work.sub800IsNumeric();
	}

	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(long number)  throws CFException{
		work.setSub800(number);
	}
	

	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub800(char[] value)  throws CFException {
		work.setSub800(value);
	}
	
	/**
	 * 	Update Sub800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub800String(char[] value)  throws CFException{
		work.setSub800(value);
	}	

	/**
	 *	Returns the value of gp004760AuthTxnCatCd
	 *	@return gp004760AuthTxnCatCd
	 */
   public char[] getGp004760AuthTxnCatCd(int index) throws CFException  {              
   		return gp004760CabTccExtract.getGp004760CabTccArray().getGp004760AuthTxnCatCd(index);
   }

  
	/**
	*  set variable gp004760AuthTxnCatCd
	*  @param value
	**/
   public void setGp004760AuthTxnCatCd(int index,char[] value) throws CFException {
      gp004760CabTccExtract.getGp004760CabTccArray().setGp004760AuthTxnCatCd((index),value);
   } 

	/**
	 *	Returns the value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public int getGp004760RecordId() throws CFException {
   		return gp004760CabTccExtract.getGp004760RecordId();
	}


	/**
	 *	Returns String value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public char[]  getGp004760RecordIdString() throws CFException {
	     return String.valueOf(gp004760CabTccExtract.getGp004760RecordIdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gp004760RecordIdIsNumeric()  throws CFException{
	    return gp004760CabTccExtract.gp004760RecordIdIsNumeric();
	}

	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param number
	 */
	public void setGp004760RecordId(int number)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(number);
	}
	

	public void setGp004760RecordId(long number)  throws CFException{
	    gp004760CabTccExtract.setGp004760RecordId(number);
	}
	
	
	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordId(char[] value)  throws CFException {
		gp004760CabTccExtract.setGp004760RecordId(value);
	}
	
	/**
	 * 	Update Gp004760RecordId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordIdString(char[] value)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += cabTccArray800.hashCode();
        str += gp004760CabTccExtract.hashCode();
       return str.hashCode();
    }

    public CabextOutfileProcessOutCtx clone() {
        CabextOutfileProcessOutCtx cloneObj = new CabextOutfileProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.cabTccArray800 = new CabTccArray800();
        cloneObj.cabTccArray800.set(cabTccArray800.getClonedField());
        cloneObj.gp004760CabTccExtract = new Gp004760CabTccExtract();
        cloneObj.gp004760CabTccExtract.set(gp004760CabTccExtract.getClonedField());
        return cloneObj;
    }

    }

    public CabextOutfileProcessOutCtx getCabextOutfileProcessOutCtx() {
            return new CabextOutfileProcessOutCtx();
    }
     public class WriteSys201FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys201CabTccExtRec sys201CabTccExtRec = Gp004760Ctx.this.getSys201CabTccExtRec();
     Gp004760CabTccExtract gp004760CabTccExtract = Gp004760Ctx.this.getGp004760CabTccExtract();

	/**
	 *	Returns the value of sys201CabTccExtRec
	 *	@return sys201CabTccExtRec
	 */   
	 public Sys201CabTccExtRec getSys201CabTccExtRec() {
   	return sys201CabTccExtRec;
   }


	/**
	 *	Returns the value of gp004760CabTccExtract
	 *	@return gp004760CabTccExtract
	 */   
	 public Gp004760CabTccExtract getGp004760CabTccExtract() {
   	return gp004760CabTccExtract;
   }


	/**
	 *	Returns the value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public int getGp004760RecordId() throws CFException {
   		return gp004760CabTccExtract.getGp004760RecordId();
	}


	/**
	 *	Returns String value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public char[]  getGp004760RecordIdString() throws CFException {
	     return String.valueOf(gp004760CabTccExtract.getGp004760RecordIdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gp004760RecordIdIsNumeric()  throws CFException{
	    return gp004760CabTccExtract.gp004760RecordIdIsNumeric();
	}

	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param number
	 */
	public void setGp004760RecordId(int number)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(number);
	}
	

	public void setGp004760RecordId(long number)  throws CFException{
	    gp004760CabTccExtract.setGp004760RecordId(number);
	}
	
	
	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordId(char[] value)  throws CFException {
		gp004760CabTccExtract.setGp004760RecordId(value);
	}
	
	/**
	 * 	Update Gp004760RecordId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordIdString(char[] value)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public WriteSys201FileOutCtx getWriteSys201FileOutCtx() {
            return new WriteSys201FileOutCtx();
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
        str += sys201CabTccExtRec.hashCode();
        str += gp004760CabTccExtract.hashCode();
       return str.hashCode();
    }

    public WriteSys201FileInCtx clone() {
        WriteSys201FileInCtx cloneObj = new WriteSys201FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201CabTccExtRec = new Sys201CabTccExtRec();
        cloneObj.sys201CabTccExtRec.set(sys201CabTccExtRec.getClonedField());
        cloneObj.gp004760CabTccExtract = new Gp004760CabTccExtract();
        cloneObj.gp004760CabTccExtract.set(gp004760CabTccExtract.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201FileInCtx getWriteSys201FileInCtx() {
            return new WriteSys201FileInCtx();
    }
     public class WriteSys201FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sys201CabTccExtRec sys201CabTccExtRec = Gp004760Ctx.this.getSys201CabTccExtRec();
     Gp004760CabTccExtract gp004760CabTccExtract = Gp004760Ctx.this.getGp004760CabTccExtract();

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 

	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public long getSub800() throws CFException {
   		return work.getSub800();
	}


	/**
	 *	Returns String value of sub800
	 *	@return sub800
	 */
	public char[]  getSub800String() throws CFException {
	     return String.valueOf(work.getSub800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub800IsNumeric()  throws CFException{
	    return work.sub800IsNumeric();
	}

	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(long number)  throws CFException{
		work.setSub800(number);
	}
	

	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub800(char[] value)  throws CFException {
		work.setSub800(value);
	}
	
	/**
	 * 	Update Sub800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub800String(char[] value)  throws CFException{
		work.setSub800(value);
	}	

	/**
	 *	Test condition "ERROR WRITING SYS201 CAB EXTRACT FILE" for isAbendWriteSys20188600()
	 *	@return  Returns true if isAbendWriteSys20188600() is "ERROR WRITING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendWriteSys20188600() throws CFException {
      return work.isAbendWriteSys20188600();
   }

	/**
	*  set values "ERROR WRITING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendWriteSys20188600True()  throws CFException{  			
    	work.setAbendWriteSys20188600True();
   	}
	/**
	 *	Test condition "2900-WRITE-SYS201-FILE" for isWriteSys201Para88300()
	 *	@return  Returns true if isWriteSys201Para88300() is "2900-WRITE-SYS201-FILE"
	 */
   public boolean isWriteSys201Para88300() throws CFException {
      return work.isWriteSys201Para88300();
   }

	/**
	*  set values "2900-WRITE-SYS201-FILE"
	*/
   	public void setWriteSys201Para88300True()  throws CFException{  			
    	work.setWriteSys201Para88300True();
   	}
	/**
	 *	Returns the value of sys201CabTccExtRec
	 *	@return sys201CabTccExtRec
	 */   
	 public Sys201CabTccExtRec getSys201CabTccExtRec() {
   	return sys201CabTccExtRec;
   }


	/**
	 *	Test condition "00" for isSys201Success88200()
	 *	@return  Returns true if isSys201Success88200() is "00"
	 */
   public boolean isSys201Success88200() throws CFException {
      return work.isSys201Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201Success88200True()  throws CFException{  			
    	work.setSys201Success88200True();
   	}
	/**
	 *	Test condition "3003" for isFileWriteAbendCode88300()
	 *	@return  Returns true if isFileWriteAbendCode88300() is "3003"
	 */
   public boolean isFileWriteAbendCode88300() throws CFException {
      return work.isFileWriteAbendCode88300();
   }

	/**
	*  set values "3003"
	*/
   	public void setFileWriteAbendCode88300True()  throws CFException{  			
    	work.setFileWriteAbendCode88300True();
   	}
	/**
	 *	Returns the value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public int getGp004760RecordId() throws CFException {
   		return gp004760CabTccExtract.getGp004760RecordId();
	}


	/**
	 *	Returns String value of gp004760RecordId
	 *	@return gp004760RecordId
	 */
	public char[]  getGp004760RecordIdString() throws CFException {
	     return String.valueOf(gp004760CabTccExtract.getGp004760RecordIdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gp004760RecordIdIsNumeric()  throws CFException{
	    return gp004760CabTccExtract.gp004760RecordIdIsNumeric();
	}

	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param number
	 */
	public void setGp004760RecordId(int number)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(number);
	}
	

	public void setGp004760RecordId(long number)  throws CFException{
	    gp004760CabTccExtract.setGp004760RecordId(number);
	}
	
	
	/**
	 * 	Update Gp004760RecordId with the passed value
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordId(char[] value)  throws CFException {
		gp004760CabTccExtract.setGp004760RecordId(value);
	}
	
	/**
	 * 	Update Gp004760RecordId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGp004760RecordIdString(char[] value)  throws CFException{
		gp004760CabTccExtract.setGp004760RecordId(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += sys201CabTccExtRec.hashCode();
        str += gp004760CabTccExtract.hashCode();
       return str.hashCode();
    }

    public WriteSys201FileOutCtx clone() {
        WriteSys201FileOutCtx cloneObj = new WriteSys201FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201CabTccExtRec = new Sys201CabTccExtRec();
        cloneObj.sys201CabTccExtRec.set(sys201CabTccExtRec.getClonedField());
        cloneObj.gp004760CabTccExtract = new Gp004760CabTccExtract();
        cloneObj.gp004760CabTccExtract.set(gp004760CabTccExtract.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201FileOutCtx getWriteSys201FileOutCtx() {
            return new WriteSys201FileOutCtx();
    }
     public class WriteSys202FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     NspkExtractRec800 nspkExtractRec800 = Gp004760Ctx.this.getNspkExtractRec800();
     Sys202NspkCabTccExtRec sys202NspkCabTccExtRec = Gp004760Ctx.this.getSys202NspkCabTccExtRec();

	/**
	 *	Returns the value of nspkExtractRec800
	 *	@return nspkExtractRec800
	 */   
	 public NspkExtractRec800 getNspkExtractRec800() {
   	return nspkExtractRec800;
   }


	/**
	 *	Returns the value of sys202NspkCabTccExtRec
	 *	@return sys202NspkCabTccExtRec
	 */   
	 public Sys202NspkCabTccExtRec getSys202NspkCabTccExtRec() {
   	return sys202NspkCabTccExtRec;
   }



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public WriteSys202FileOutCtx getWriteSys202FileOutCtx() {
            return new WriteSys202FileOutCtx();
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
        str += nspkExtractRec800.hashCode();
        str += sys202NspkCabTccExtRec.hashCode();
       return str.hashCode();
    }

    public WriteSys202FileInCtx clone() {
        WriteSys202FileInCtx cloneObj = new WriteSys202FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.nspkExtractRec800 = new NspkExtractRec800();
        cloneObj.nspkExtractRec800.set(nspkExtractRec800.getClonedField());
        cloneObj.sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        cloneObj.sys202NspkCabTccExtRec.set(sys202NspkCabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys202FileInCtx getWriteSys202FileInCtx() {
            return new WriteSys202FileInCtx();
    }
     public class WriteSys202FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     NspkExtractRec800 nspkExtractRec800 = Gp004760Ctx.this.getNspkExtractRec800();
     Sys202NspkCabTccExtRec sys202NspkCabTccExtRec = Gp004760Ctx.this.getSys202NspkCabTccExtRec();

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 

	/**
	 *	Test condition "ERROR WRITING SYS202 NSPK EXTRCT FILE" for isAbendWriteSys20288600()
	 *	@return  Returns true if isAbendWriteSys20288600() is "ERROR WRITING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendWriteSys20288600() throws CFException {
      return work.isAbendWriteSys20288600();
   }

	/**
	*  set values "ERROR WRITING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendWriteSys20288600True()  throws CFException{  			
    	work.setAbendWriteSys20288600True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Test condition "00" for isSys202Success88200()
	 *	@return  Returns true if isSys202Success88200() is "00"
	 */
   public boolean isSys202Success88200() throws CFException {
      return work.isSys202Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys202Success88200True()  throws CFException{  			
    	work.setSys202Success88200True();
   	}
	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException  {              
   		return work.getSys202FileStatus200();
   }

  
	/**
	*  set variable sys202FileStatus200
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) throws CFException {
      work.setSys202FileStatus200(value);
   } 

	/**
	 *	Test condition "2901-WRITE-SYS202-FILE" for isWriteSys202Para88300()
	 *	@return  Returns true if isWriteSys202Para88300() is "2901-WRITE-SYS202-FILE"
	 */
   public boolean isWriteSys202Para88300() throws CFException {
      return work.isWriteSys202Para88300();
   }

	/**
	*  set values "2901-WRITE-SYS202-FILE"
	*/
   	public void setWriteSys202Para88300True()  throws CFException{  			
    	work.setWriteSys202Para88300True();
   	}
	/**
	 *	Returns the value of sys202NspkCabTccExtRec
	 *	@return sys202NspkCabTccExtRec
	 */   
	 public Sys202NspkCabTccExtRec getSys202NspkCabTccExtRec() {
   	return sys202NspkCabTccExtRec;
   }


	/**
	 *	Test condition "3003" for isFileWriteAbendCode88300()
	 *	@return  Returns true if isFileWriteAbendCode88300() is "3003"
	 */
   public boolean isFileWriteAbendCode88300() throws CFException {
      return work.isFileWriteAbendCode88300();
   }

	/**
	*  set values "3003"
	*/
   	public void setFileWriteAbendCode88300True()  throws CFException{  			
    	work.setFileWriteAbendCode88300True();
   	}

        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += nspkExtractRec800.hashCode();
        str += sys202NspkCabTccExtRec.hashCode();
       return str.hashCode();
    }

    public WriteSys202FileOutCtx clone() {
        WriteSys202FileOutCtx cloneObj = new WriteSys202FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.nspkExtractRec800 = new NspkExtractRec800();
        cloneObj.nspkExtractRec800.set(nspkExtractRec800.getClonedField());
        cloneObj.sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec();
        cloneObj.sys202NspkCabTccExtRec.set(sys202NspkCabTccExtRec.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys202FileOutCtx getWriteSys202FileOutCtx() {
            return new WriteSys202FileOutCtx();
    }
     public class CabtccextCsrCloseInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


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



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CabtccextCsrCloseOutCtx getCabtccextCsrCloseOutCtx() {
            return new CabtccextCsrCloseOutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrCloseInCtx clone() {
        CabtccextCsrCloseInCtx cloneObj = new CabtccextCsrCloseInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrCloseInCtx getCabtccextCsrCloseInCtx() {
            return new CabtccextCsrCloseInCtx();
    }
     public class CabtccextCsrCloseOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();

	/**
	 *	Returns the value of wsCurrTable800
	 *	@return wsCurrTable800
	 */
   public char[] getWsCurrTable800() throws CFException  {              
   		return work.getWsCurrTable800();
   }

  
	/**
	*  set variable wsCurrTable800
	*  @param value
	**/
   public void setWsCurrTable800(char[] value) throws CFException {
      work.setWsCurrTable800(value);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of wsSqlFunction800
	 *	@return wsSqlFunction800
	 */
   public char[] getWsSqlFunction800() throws CFException  {              
   		return work.getWsSqlFunction800();
   }

  
	/**
	*  set variable wsSqlFunction800
	*  @param value
	**/
   public void setWsSqlFunction800(char[] value) throws CFException {
      work.setWsSqlFunction800(value);
   } 

	/**
	 *	Returns the value of wsCurrParagraph800
	 *	@return wsCurrParagraph800
	 */
   public char[] getWsCurrParagraph800() throws CFException  {              
   		return work.getWsCurrParagraph800();
   }

  
	/**
	*  set variable wsCurrParagraph800
	*  @param value
	**/
   public void setWsCurrParagraph800(char[] value) throws CFException {
      work.setWsCurrParagraph800(value);
   } 

	/**
	 *	Returns the value of wsSqlcodeDisp800
	 *	@return wsSqlcodeDisp800
	 */
   public char[] getWsSqlcodeDisp800() throws CFException  {              
   		return work.getWsSqlcodeDisp800();
   }

  
	/**
	*  set variable wsSqlcodeDisp800
	*  @param value
	**/
   public void setWsSqlcodeDisp800(char[] value) throws CFException {
      work.setWsSqlcodeDisp800(value);
   } 

     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex) throws CFException {
      work.setWsSqlcodeDisp800(source, sourceIndex);
   	
   }
   
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WsSqlcodeDisp800 with another Field
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source) {
      work.setWsSqlcodeDisp800(source);
   }  
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CabtccextCsrCloseOutCtx clone() {
        CabtccextCsrCloseOutCtx cloneObj = new CabtccextCsrCloseOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CabtccextCsrCloseOutCtx getCabtccextCsrCloseOutCtx() {
            return new CabtccextCsrCloseOutCtx();
    }
     public class CloseSys201FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys201Success88200()
	 *	@return  Returns true if isSys201Success88200() is "00"
	 */
   public boolean isSys201Success88200() throws CFException {
      return work.isSys201Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201Success88200True()  throws CFException{  			
    	work.setSys201Success88200True();
   	}

        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CloseSys201FileOutCtx getCloseSys201FileOutCtx() {
            return new CloseSys201FileOutCtx();
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

    public CloseSys201FileInCtx clone() {
        CloseSys201FileInCtx cloneObj = new CloseSys201FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys201FileInCtx getCloseSys201FileInCtx() {
            return new CloseSys201FileInCtx();
    }
     public class CloseSys201FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Test condition "3004" for isFileCloseAbendCode88300()
	 *	@return  Returns true if isFileCloseAbendCode88300() is "3004"
	 */
   public boolean isFileCloseAbendCode88300() throws CFException {
      return work.isFileCloseAbendCode88300();
   }

	/**
	*  set values "3004"
	*/
   	public void setFileCloseAbendCode88300True()  throws CFException{  			
    	work.setFileCloseAbendCode88300True();
   	}
	/**
	 *	Test condition "ERROR CLOSING SYS201 CAB EXTRACT FILE" for isAbendCloseSys20188600()
	 *	@return  Returns true if isAbendCloseSys20188600() is "ERROR CLOSING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendCloseSys20188600() throws CFException {
      return work.isAbendCloseSys20188600();
   }

	/**
	*  set values "ERROR CLOSING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendCloseSys20188600True()  throws CFException{  			
    	work.setAbendCloseSys20188600True();
   	}
	/**
	 *	Test condition "2950-CLOSE-SYS201-FILE" for isCloseSys201Para88300()
	 *	@return  Returns true if isCloseSys201Para88300() is "2950-CLOSE-SYS201-FILE"
	 */
   public boolean isCloseSys201Para88300() throws CFException {
      return work.isCloseSys201Para88300();
   }

	/**
	*  set values "2950-CLOSE-SYS201-FILE"
	*/
   	public void setCloseSys201Para88300True()  throws CFException{  			
    	work.setCloseSys201Para88300True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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

    public CloseSys201FileOutCtx clone() {
        CloseSys201FileOutCtx cloneObj = new CloseSys201FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys201FileOutCtx getCloseSys201FileOutCtx() {
            return new CloseSys201FileOutCtx();
    }
     public class CloseSys202FileInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Test condition "00" for isSys202Success88200()
	 *	@return  Returns true if isSys202Success88200() is "00"
	 */
   public boolean isSys202Success88200() throws CFException {
      return work.isSys202Success88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys202Success88200True()  throws CFException{  			
    	work.setSys202Success88200True();
   	}
	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException  {              
   		return work.getSys202FileStatus200();
   }

  
	/**
	*  set variable sys202FileStatus200
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) throws CFException {
      work.setSys202FileStatus200(value);
   } 


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public CloseSys202FileOutCtx getCloseSys202FileOutCtx() {
            return new CloseSys202FileOutCtx();
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

    public CloseSys202FileInCtx clone() {
        CloseSys202FileInCtx cloneObj = new CloseSys202FileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys202FileInCtx getCloseSys202FileInCtx() {
            return new CloseSys202FileInCtx();
    }
     public class CloseSys202FileOutCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Test condition "3004" for isFileCloseAbendCode88300()
	 *	@return  Returns true if isFileCloseAbendCode88300() is "3004"
	 */
   public boolean isFileCloseAbendCode88300() throws CFException {
      return work.isFileCloseAbendCode88300();
   }

	/**
	*  set values "3004"
	*/
   	public void setFileCloseAbendCode88300True()  throws CFException{  			
    	work.setFileCloseAbendCode88300True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Test condition "2951-CLOSE-SYS202-FILE" for isCloseSys202Para88300()
	 *	@return  Returns true if isCloseSys202Para88300() is "2951-CLOSE-SYS202-FILE"
	 */
   public boolean isCloseSys202Para88300() throws CFException {
      return work.isCloseSys202Para88300();
   }

	/**
	*  set values "2951-CLOSE-SYS202-FILE"
	*/
   	public void setCloseSys202Para88300True()  throws CFException{  			
    	work.setCloseSys202Para88300True();
   	}
	/**
	 *	Test condition "ERROR CLOSING SYS202 NSPK EXTRCT FILE" for isAbendCloseSys20288600()
	 *	@return  Returns true if isAbendCloseSys20288600() is "ERROR CLOSING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendCloseSys20288600() throws CFException {
      return work.isAbendCloseSys20288600();
   }

	/**
	*  set values "ERROR CLOSING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendCloseSys20288600True()  throws CFException{  			
    	work.setAbendCloseSys20288600True();
   	}
	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException  {              
   		return work.getSys202FileStatus200();
   }

  
	/**
	*  set variable sys202FileStatus200
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) throws CFException {
      work.setSys202FileStatus200(value);
   } 


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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

    public CloseSys202FileOutCtx clone() {
        CloseSys202FileOutCtx cloneObj = new CloseSys202FileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys202FileOutCtx getCloseSys202FileOutCtx() {
            return new CloseSys202FileOutCtx();
    }
     public class Db2ErrorHandlingInCtx implements Cloneable {
     ThisProgramNameGroup300 thisProgramNameGroup300 = Gp004760Ctx.this.getThisProgramNameGroup300();
     Work work = Gp004760Ctx.this.getWork();
     Db2ErrModuleMsg600 db2ErrModuleMsg600 = Gp004760Ctx.this.getDb2ErrModuleMsg600();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();

	/**
	 *	Returns the value of wsCurrTable800
	 *	@return wsCurrTable800
	 */
   public char[] getWsCurrTable800() throws CFException  {              
   		return work.getWsCurrTable800();
   }

  
	/**
	*  set variable wsCurrTable800
	*  @param value
	**/
   public void setWsCurrTable800(char[] value) throws CFException {
      work.setWsCurrTable800(value);
   } 

	/**
	 *	Returns the value of thisProgramNameGroup300
	 *	@return thisProgramNameGroup300
	 */   
	 public ThisProgramNameGroup300 getThisProgramNameGroup300() {
   	return thisProgramNameGroup300;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of db2ErrModuleMsg600
	 *	@return db2ErrModuleMsg600
	 */   
	 public Db2ErrModuleMsg600 getDb2ErrModuleMsg600() {
   	return db2ErrModuleMsg600;
   }


	/**
	 *	Returns the value of wsSqlFunction800
	 *	@return wsSqlFunction800
	 */
   public char[] getWsSqlFunction800() throws CFException  {              
   		return work.getWsSqlFunction800();
   }

  
	/**
	*  set variable wsSqlFunction800
	*  @param value
	**/
   public void setWsSqlFunction800(char[] value) throws CFException {
      work.setWsSqlFunction800(value);
   } 

	/**
	 *	Returns the value of wsCurrParagraph800
	 *	@return wsCurrParagraph800
	 */
   public char[] getWsCurrParagraph800() throws CFException  {              
   		return work.getWsCurrParagraph800();
   }

  
	/**
	*  set variable wsCurrParagraph800
	*  @param value
	**/
   public void setWsCurrParagraph800(char[] value) throws CFException {
      work.setWsCurrParagraph800(value);
   } 

	/**
	 *	Returns the value of db2ErrModule300
	 *	@return db2ErrModule300
	 */
   public char[] getDb2ErrModule300() throws CFException  {              
   		return work.getDb2ErrModule300();
   }

  
	/**
	*  set variable db2ErrModule300
	*  @param value
	**/
   public void setDb2ErrModule300(char[] value) throws CFException {
      work.setDb2ErrModule300(value);
   } 

	/**
	 *	Returns the value of wsSqlcodeDisp800
	 *	@return wsSqlcodeDisp800
	 */
   public char[] getWsSqlcodeDisp800() throws CFException  {              
   		return work.getWsSqlcodeDisp800();
   }

  
	/**
	*  set variable wsSqlcodeDisp800
	*  @param value
	**/
   public void setWsSqlcodeDisp800(char[] value) throws CFException {
      work.setWsSqlcodeDisp800(value);
   } 

     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex) throws CFException {
      work.setWsSqlcodeDisp800(source, sourceIndex);
   	
   }
   
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WsSqlcodeDisp800 with another Field
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source) {
      work.setWsSqlcodeDisp800(source);
   }  
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWsSqlcodeDisp800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }

        public Db2ErrorHandlingOutCtx getDb2ErrorHandlingOutCtx() {
            return new Db2ErrorHandlingOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += thisProgramNameGroup300.hashCode();
        str += work.hashCode();
        str += db2ErrModuleMsg600.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Db2ErrorHandlingInCtx clone() {
        Db2ErrorHandlingInCtx cloneObj = new Db2ErrorHandlingInCtx();
        cloneObj.thisProgramNameGroup300 = new ThisProgramNameGroup300();
        cloneObj.thisProgramNameGroup300.set(thisProgramNameGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.db2ErrModuleMsg600 = new Db2ErrModuleMsg600();
        cloneObj.db2ErrModuleMsg600.set(db2ErrModuleMsg600.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public Db2ErrorHandlingInCtx getDb2ErrorHandlingInCtx() {
            return new Db2ErrorHandlingInCtx();
    }
     public class Db2ErrorHandlingOutCtx implements Cloneable {
     ThisProgramNameGroup300 thisProgramNameGroup300 = Gp004760Ctx.this.getThisProgramNameGroup300();
     Work work = Gp004760Ctx.this.getWork();
     Sqlca sqlca = Gp004760Ctx.this.getSqlca();
     Db2ErrModuleMsg600 db2ErrModuleMsg600 = Gp004760Ctx.this.getDb2ErrModuleMsg600();

	/**
	 *	Returns the value of thisProgramNameGroup300
	 *	@return thisProgramNameGroup300
	 */   
	 public ThisProgramNameGroup300 getThisProgramNameGroup300() {
   	return thisProgramNameGroup300;
   }


	/**
	 *	Returns the value of db2ErrRtnCode600
	 *	@return db2ErrRtnCode600
	 */
   public char[] getDb2ErrRtnCode600() throws CFException  {              
   		return db2ErrModuleMsg600.getDb2ErrRtnCode600();
   }

  
	/**
	*  set variable db2ErrRtnCode600
	*  @param value
	**/
   public void setDb2ErrRtnCode600(char[] value) throws CFException {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(value);
   } 

     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex) throws CFException {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source, sourceIndex);
   	
   }
   
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db2ErrRtnCode600 with another Field
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source) {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source);
   }  
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source, int sourceIndex,int sourceLen) {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db2ErrRtnCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2ErrRtnCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db2ErrModuleMsg600.setDb2ErrRtnCode600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += thisProgramNameGroup300.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += db2ErrModuleMsg600.hashCode();
       return str.hashCode();
    }

    public Db2ErrorHandlingOutCtx clone() {
        Db2ErrorHandlingOutCtx cloneObj = new Db2ErrorHandlingOutCtx();
        cloneObj.thisProgramNameGroup300 = new ThisProgramNameGroup300();
        cloneObj.thisProgramNameGroup300.set(thisProgramNameGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.db2ErrModuleMsg600 = new Db2ErrModuleMsg600();
        cloneObj.db2ErrModuleMsg600.set(db2ErrModuleMsg600.getClonedField());
        return cloneObj;
    }

    }

    public Db2ErrorHandlingOutCtx getDb2ErrorHandlingOutCtx() {
            return new Db2ErrorHandlingOutCtx();
    }
     public class AbendParaInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 

	/**
	 *	Test condition "3001" for isFileOpenAbendCode88300()
	 *	@return  Returns true if isFileOpenAbendCode88300() is "3001"
	 */
   public boolean isFileOpenAbendCode88300() throws CFException {
      return work.isFileOpenAbendCode88300();
   }

	/**
	*  set values "3001"
	*/
   	public void setFileOpenAbendCode88300True()  throws CFException{  			
    	work.setFileOpenAbendCode88300True();
   	}
	/**
	 *	Test condition "3004" for isFileCloseAbendCode88300()
	 *	@return  Returns true if isFileCloseAbendCode88300() is "3004"
	 */
   public boolean isFileCloseAbendCode88300() throws CFException {
      return work.isFileCloseAbendCode88300();
   }

	/**
	*  set values "3004"
	*/
   	public void setFileCloseAbendCode88300True()  throws CFException{  			
    	work.setFileCloseAbendCode88300True();
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
   		return work.getStatusCode600();
	}


	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() throws CFException {
	     return String.valueOf(work.getStatusCode600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric()  throws CFException{
	    return work.statusCode600IsNumeric();
	}

	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param number
	 */
	public void setStatusCode600(int number)  throws CFException{
		work.setStatusCode600(number);
	}
	

	public void setStatusCode600(long number)  throws CFException{
	    work.setStatusCode600(number);
	}
	
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value)  throws CFException {
		work.setStatusCode600(value);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value)  throws CFException{
		work.setStatusCode600(value);
	}	

	/**
	 *	Returns the value of statusCode300
	 *	@return statusCode300
	 */
   public char[] getStatusCode300() throws CFException  {              
   		return work.getStatusCode300();
   }

  
	/**
	*  set variable statusCode300
	*  @param value
	**/
   public void setStatusCode300(char[] value) throws CFException {
      work.setStatusCode300(value);
   } 

	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException  {              
   		return work.getAbendPara300();
   }

  
	/**
	*  set variable abendPara300
	*  @param value
	**/
   public void setAbendPara300(char[] value) throws CFException {
      work.setAbendPara300(value);
   } 

	/**
	 *	Test condition "3003" for isFileWriteAbendCode88300()
	 *	@return  Returns true if isFileWriteAbendCode88300() is "3003"
	 */
   public boolean isFileWriteAbendCode88300() throws CFException {
      return work.isFileWriteAbendCode88300();
   }

	/**
	*  set values "3003"
	*/
   	public void setFileWriteAbendCode88300True()  throws CFException{  			
    	work.setFileWriteAbendCode88300True();
   	}
	/**
	 *	Returns the value of displayAbendMsgTxt600
	 *	@return displayAbendMsgTxt600
	 */
   public char[] getDisplayAbendMsgTxt600() throws CFException  {              
   		return work.getDisplayAbendMsgTxt600();
   }

  
	/**
	*  set variable displayAbendMsgTxt600
	*  @param value
	**/
   public void setDisplayAbendMsgTxt600(char[] value) throws CFException {
      work.setDisplayAbendMsgTxt600(value);
   } 


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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

    public AbendParaInCtx clone() {
        AbendParaInCtx cloneObj = new AbendParaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendParaInCtx getAbendParaInCtx() {
            return new AbendParaInCtx();
    }
     public class TerminationInCtx implements Cloneable {
     Work work = Gp004760Ctx.this.getWork();

	/**
	 *	Returns the value of outfileCnt
	 *	@return outfileCnt
	 */
	public long getOutfileCnt() throws CFException {
   		return work.getOutfileCnt();
	}


	/**
	 *	Returns String value of outfileCnt
	 *	@return outfileCnt
	 */
	public char[]  getOutfileCntString() throws CFException {
	     return String.valueOf(work.getOutfileCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outfileCntIsNumeric()  throws CFException{
	    return work.outfileCntIsNumeric();
	}

	/**
	 * 	Update OutfileCnt with the passed value
	 *	@param number
	 */
	public void setOutfileCnt(long number)  throws CFException{
		work.setOutfileCnt(number);
	}
	

	
	/**
	 * 	Update OutfileCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutfileCnt(char[] value)  throws CFException {
		work.setOutfileCnt(value);
	}
	
	/**
	 * 	Update OutfileCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutfileCntString(char[] value)  throws CFException{
		work.setOutfileCnt(value);
	}	

	/**
	 *	Returns the value of outputCntMsg600
	 *	@return outputCntMsg600
	 */
   public char[] getOutputCntMsg600() throws CFException  {              
   		return work.getOutputCntMsg600();
   }

  
	/**
	*  set variable outputCntMsg600
	*  @param value
	**/
   public void setOutputCntMsg600(char[] value) throws CFException {
      work.setOutputCntMsg600(value);
   } 


        public Gp004760Ctx getGp004760Ctx() {
            return Gp004760Ctx.this;
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

    public TerminationInCtx clone() {
        TerminationInCtx cloneObj = new TerminationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminationInCtx getTerminationInCtx() {
            return new TerminationInCtx();
    }
}
