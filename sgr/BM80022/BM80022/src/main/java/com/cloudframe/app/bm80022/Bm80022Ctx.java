package com.cloudframe.app.bm80022;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.bm80022.dto.Contadors;
import com.cloudframe.app.bm80022.dto.Ge1801Array;
import com.cloudframe.app.bm80022.dto.Work;
import java.sql.ResultSet;
import com.cloudframe.app.bm80022.dto.AbendLinea4;
import com.cloudframe.app.bm80022.dto.AbendLinea6;
import com.cloudframe.app.bm80022.dto.Sqlwarn;
import com.cloudframe.app.bm80022.dto.Sqlca;
import com.cloudframe.app.bm80022.file.records.Ge0018f;
import com.cloudframe.app.bm80022.dto.AbendLinea7;


@Context
public class Bm80022Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AbendLinea6 abendLinea6;
    Sqlca sqlca;
    AbendLinea7 abendLinea7;
    Ge0018f ge0018f;
    Ge1801Array ge1801Array;
    Contadors contadors;
    AbendLinea4 abendLinea4;
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


    ResultSet curGe18ResultSet;

    public ResultSet getCurGe18ResultSet() {
        return this.curGe18ResultSet;
    }

    public void setCurGe18ResultSet(ResultSet curGe18ResultSet) {
        this.curGe18ResultSet = curGe18ResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public AbendLinea6 getAbendLinea6() {
        if (abendLinea6 == null) {
            abendLinea6 = new AbendLinea6();
        }

        return abendLinea6;
    }

    public void setAbendLinea6(AbendLinea6 abendLinea6) {
        this.abendLinea6 = abendLinea6;
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
    public AbendLinea7 getAbendLinea7() {
        if (abendLinea7 == null) {
            abendLinea7 = new AbendLinea7();
        }

        return abendLinea7;
    }

    public void setAbendLinea7(AbendLinea7 abendLinea7) {
        this.abendLinea7 = abendLinea7;
    }
    public Ge0018f getGe0018f() {
        if (ge0018f == null) {
            ge0018f = new Ge0018f();
        }

        return ge0018f;
    }

    public void setGe0018f(Ge0018f ge0018f) {
        this.ge0018f = ge0018f;
    }
    public Ge1801Array getGe1801Array() {
        if (ge1801Array == null) {
            ge1801Array = new Ge1801Array();
        }

        return ge1801Array;
    }

    public void setGe1801Array(Ge1801Array ge1801Array) {
        this.ge1801Array = ge1801Array;
    }
    public Contadors getContadors() {
        if (contadors == null) {
            contadors = new Contadors();
        }

        return contadors;
    }

    public void setContadors(Contadors contadors) {
        this.contadors = contadors;
    }
    public AbendLinea4 getAbendLinea4() {
        if (abendLinea4 == null) {
            abendLinea4 = new AbendLinea4();
        }

        return abendLinea4;
    }

    public void setAbendLinea4(AbendLinea4 abendLinea4) {
        this.abendLinea4 = abendLinea4;
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
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += ge0018f.hashCode();
        str += ge1801Array.hashCode();
        str += contadors.hashCode();
        str += abendLinea4.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Bm80022Ctx clone() {
        Bm80022Ctx cloneObj = new Bm80022Ctx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.ge1801Array = new Ge1801Array();
        cloneObj.ge1801Array.set(ge1801Array.getClonedField());
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        cloneObj.abendLinea4 = new AbendLinea4();
        cloneObj.abendLinea4.set(abendLinea4.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class StartOfProgramInCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Test condition "S" for isSwFinCurGe18Si()
	 *	@return  Returns true if isSwFinCurGe18Si() is "S"
	 */
   public boolean isSwFinCurGe18Si() throws CFException {
      return work.isSwFinCurGe18Si();
   }

	/**
	*  set values "S"
	*/
   	public void setSwFinCurGe18SiTrue()  throws CFException{  			
    	work.setSwFinCurGe18SiTrue();
   	}

        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
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

    public StartOfProgramInCtx clone() {
        StartOfProgramInCtx cloneObj = new StartOfProgramInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public StartOfProgramInCtx getStartOfProgramInCtx() {
            return new StartOfProgramInCtx();
    }
     public class InicioOutCtx implements Cloneable {
     Contadors contadors = Bm80022Ctx.this.getContadors();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Test condition "N" for isSwFinCurGe18No()
	 *	@return  Returns true if isSwFinCurGe18No() is "N"
	 */
   public boolean isSwFinCurGe18No() throws CFException {
      return work.isSwFinCurGe18No();
   }

	/**
	*  set values "N"
	*/
   	public void setSwFinCurGe18NoTrue()  throws CFException{  			
    	work.setSwFinCurGe18NoTrue();
   	}
	/**
	 *	Test condition "N" for isSwNoFinCurRowset()
	 *	@return  Returns true if isSwNoFinCurRowset() is "N"
	 */
   public boolean isSwNoFinCurRowset() throws CFException {
      return work.isSwNoFinCurRowset();
   }

	/**
	*  set values "N"
	*/
   	public void setSwNoFinCurRowsetTrue()  throws CFException{  			
    	work.setSwNoFinCurRowsetTrue();
   	}
	/**
	 *	Test condition "S" for isSwFinCurGe18Si()
	 *	@return  Returns true if isSwFinCurGe18Si() is "S"
	 */
   public boolean isSwFinCurGe18Si() throws CFException {
      return work.isSwFinCurGe18Si();
   }

	/**
	*  set values "S"
	*/
   	public void setSwFinCurGe18SiTrue()  throws CFException{  			
    	work.setSwFinCurGe18SiTrue();
   	}
	/**
	 *	Returns the value of contadors
	 *	@return contadors
	 */   
	 public Contadors getContadors() {
   	return contadors;
   }



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += contadors.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InicioOutCtx clone() {
        InicioOutCtx cloneObj = new InicioOutCtx();
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InicioOutCtx getInicioOutCtx() {
            return new InicioOutCtx();
    }
     public class OpenFicherosInCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of ge0018f
	 *	@return ge0018f
	 */   
	 public Ge0018f getGe0018f() {
   	return ge0018f;
   }


	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of litAbrir
	 *	@return litAbrir
	 */
   public char[] getLitAbrir() throws CFException  {              
   		return work.getLitAbrir();
   }

  
	/**
	*  set variable litAbrir
	*  @param value
	**/
   public void setLitAbrir(char[] value) throws CFException {
      work.setLitAbrir(value);
   } 

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public OpenFicherosOutCtx getOpenFicherosOutCtx() {
            return new OpenFicherosOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenFicherosInCtx clone() {
        OpenFicherosInCtx cloneObj = new OpenFicherosInCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenFicherosInCtx getOpenFicherosInCtx() {
            return new OpenFicherosInCtx();
    }
     public class OpenFicherosOutCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of acceso
	 *	@return acceso
	 */
   public char[] getAcceso() throws CFException  {              
   		return work.getAcceso();
   }

  
	/**
	*  set variable acceso
	*  @param value
	**/
   public void setAcceso(char[] value) throws CFException {
      work.setAcceso(value);
   } 

	/**
	 *	Returns the value of fichero
	 *	@return fichero
	 */
   public char[] getFichero() throws CFException  {              
   		return work.getFichero();
   }

  
	/**
	*  set variable fichero
	*  @param value
	**/
   public void setFichero(char[] value) throws CFException {
      work.setFichero(value);
   } 

	/**
	 *	Returns the value of fileStatus
	 *	@return fileStatus
	 */
   public char[] getFileStatus() throws CFException  {              
   		return work.getFileStatus();
   }

  
	/**
	*  set variable fileStatus
	*  @param value
	**/
   public void setFileStatus(char[] value) throws CFException {
      work.setFileStatus(value);
   } 

	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of litAbrir
	 *	@return litAbrir
	 */
   public char[] getLitAbrir() throws CFException  {              
   		return work.getLitAbrir();
   }

  
	/**
	*  set variable litAbrir
	*  @param value
	**/
   public void setLitAbrir(char[] value) throws CFException {
      work.setLitAbrir(value);
   } 

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenFicherosOutCtx clone() {
        OpenFicherosOutCtx cloneObj = new OpenFicherosOutCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenFicherosOutCtx getOpenFicherosOutCtx() {
            return new OpenFicherosOutCtx();
    }
     public class OpenCurGe18InCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Work work = Bm80022Ctx.this.getWork();

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
	 *	Returns the value of wkErrorDb2
	 *	@return wkErrorDb2
	 */
   public char[] getWkErrorDb2() throws CFException  {              
   		return work.getWkErrorDb2();
   }

  
	/**
	*  set variable wkErrorDb2
	*  @param value
	**/
   public void setWkErrorDb2(char[] value) throws CFException {
      work.setWkErrorDb2(value);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public OpenCurGe18OutCtx getOpenCurGe18OutCtx() {
            return new OpenCurGe18OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenCurGe18InCtx clone() {
        OpenCurGe18InCtx cloneObj = new OpenCurGe18InCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenCurGe18InCtx getOpenCurGe18InCtx() {
            return new OpenCurGe18InCtx();
    }
     public class OpenCurGe18OutCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public int getSqlcode_Ws() throws CFException {        
   		return work.getSqlcode_Ws();
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param number
	 */
	public void setSqlcode_Ws(int number)  throws CFException{
		work.setSqlcode_Ws(number);
	}


	public void setSqlcode_Ws(long number)  throws CFException{
		work.setSqlcode_Ws((int)number);
	}


	/**
	 *	Returns the value of abendProg
	 *	@return abendProg
	 */
   public char[] getAbendProg() throws CFException  {              
   		return abendLinea7.getAbendProg();
   }

  
	/**
	*  set variable abendProg
	*  @param value
	**/
   public void setAbendProg(char[] value) throws CFException {
      abendLinea7.setAbendProg(value);
   } 

     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendProg(source, sourceIndex);
   	
   }
   
   public void setAbendProg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendProg with another Field
	 *	@param value
	 */
   public void setAbendProg(Field source) {
      abendLinea7.setAbendProg(source);
   }  
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendSenten
	 *	@return abendSenten
	 */
   public char[] getAbendSenten() throws CFException  {              
   		return abendLinea7.getAbendSenten();
   }

  
	/**
	*  set variable abendSenten
	*  @param value
	**/
   public void setAbendSenten(char[] value) throws CFException {
      abendLinea7.setAbendSenten(value);
   } 

     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendSenten(source, sourceIndex);
   	
   }
   
   public void setAbendSenten(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSenten with another Field
	 *	@param value
	 */
   public void setAbendSenten(Field source) {
      abendLinea7.setAbendSenten(source);
   }  
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wkErrorDb2
	 *	@return wkErrorDb2
	 */
   public char[] getWkErrorDb2() throws CFException  {              
   		return work.getWkErrorDb2();
   }

  
	/**
	*  set variable wkErrorDb2
	*  @param value
	**/
   public void setWkErrorDb2(char[] value) throws CFException {
      work.setWkErrorDb2(value);
   } 

	/**
	 *	Returns the value of abendParraf
	 *	@return abendParraf
	 */
   public char[] getAbendParraf() throws CFException  {              
   		return abendLinea7.getAbendParraf();
   }

  
	/**
	*  set variable abendParraf
	*  @param value
	**/
   public void setAbendParraf(char[] value) throws CFException {
      abendLinea7.setAbendParraf(value);
   } 

     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendParraf(source, sourceIndex);
   	
   }
   
   public void setAbendParraf(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParraf with another Field
	 *	@param value
	 */
   public void setAbendParraf(Field source) {
      abendLinea7.setAbendParraf(source);
   }  
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition 0 for isDb2StatusOk()
	 *	@return  Returns true if isDb2StatusOk() is 0
	 */
   public boolean isDb2StatusOk() throws CFException {
      return work.isDb2StatusOk();
   }

	/**
	*  set values 0
	*/
   	public void setDb2StatusOkTrue()  throws CFException{  			
    	work.setDb2StatusOkTrue();
   	}
	/**
	 *	Returns the value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public long getAbendSqlcode() throws CFException {
   		return abendLinea6.getAbendSqlcode();
	}

    /**
	 *	Returns the String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeActualString() {
		return abendLinea6.getAbendSqlcodeActualString();
	}

	/**
	 *	Returns String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeString() throws CFException {
	     return String.valueOf(abendLinea6.getAbendSqlcodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendSqlcodeIsNumeric()  throws CFException{
	    return abendLinea6.abendSqlcodeIsNumeric();
	}

	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param number
	 */
	public void setAbendSqlcode(long number)  throws CFException{
		abendLinea6.setAbendSqlcode(number);
	}
	

	
	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcode(char[] value)  throws CFException {
		abendLinea6.setAbendSqlcode(value);
	}
	
	/**
	 * 	Update AbendSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcodeString(char[] value)  throws CFException{
		abendLinea6.setAbendSqlcode(value);
	}	

	/**
	 *	Returns the value of abendTabla
	 *	@return abendTabla
	 */
   public char[] getAbendTabla() throws CFException  {              
   		return abendLinea6.getAbendTabla();
   }

  
	/**
	*  set variable abendTabla
	*  @param value
	**/
   public void setAbendTabla(char[] value) throws CFException {
      abendLinea6.setAbendTabla(value);
   } 

     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex) throws CFException {
      abendLinea6.setAbendTabla(source, sourceIndex);
   	
   }
   
   public void setAbendTabla(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendTabla with another Field
	 *	@param value
	 */
   public void setAbendTabla(Field source) {
      abendLinea6.setAbendTabla(source);
   }  
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenCurGe18OutCtx clone() {
        OpenCurGe18OutCtx cloneObj = new OpenCurGe18OutCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenCurGe18OutCtx getOpenCurGe18OutCtx() {
            return new OpenCurGe18OutCtx();
    }
     public class LeerCursorMrowInCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Ge1801Array ge1801Array = Bm80022Ctx.this.getGe1801Array();
     AbendLinea4 abendLinea4 = Bm80022Ctx.this.getAbendLinea4();
     Work work = Bm80022Ctx.this.getWork();

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
	 *	Returns the value of ge1801AResambito
	 *	@return ge1801AResambito
	 */
   public char[] getGe1801AResambito(int index) throws CFException  {              
   		return ge1801Array.getGe1801AResambito(index);
   }

  
	/**
	*  set variable ge1801AResambito
	*  @param value
	**/
   public void setGe1801AResambito(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AResambito((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumpesprie
	 *	@return ge1801ANumpesprie
	 */
	public int getGe1801ANumpesprie(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpesprie((index));
	}
	
	/**
	 * 	Update Ge1801ANumpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpesprie(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),number);
	}


	public void setGe1801ANumpesprie(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ACodentid
	 *	@return ge1801ACodentid
	 */
   public char[] getGe1801ACodentid(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodentid(index);
   }

  
	/**
	*  set variable ge1801ACodentid
	*  @param value
	**/
   public void setGe1801ACodentid(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodentid((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACodnodo
	 *	@return ge1801ACodnodo
	 */
   public char[] getGe1801ACodnodo(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodnodo(index);
   }

  
	/**
	*  set variable ge1801ACodnodo
	*  @param value
	**/
   public void setGe1801ACodnodo(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodnodo((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumgescap
	 *	@return ge1801ANumgescap
	 */
	public int getGe1801ANumgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),number);
	}


	public void setGe1801ANumgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpresamb
	 *	@return ge1801ANumpresamb
	 */
	public int getGe1801ANumpresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),number);
	}


	public void setGe1801ANumpresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),(int)number);
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
	 *	Returns the value of ge1801AIdepsig
	 *	@return ge1801AIdepsig
	 */
   public char[] getGe1801AIdepsig(int index) throws CFException  {              
   		return ge1801Array.getGe1801AIdepsig(index);
   }

  
	/**
	*  set variable ge1801AIdepsig
	*  @param value
	**/
   public void setGe1801AIdepsig(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AIdepsig((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumpersona
	 *	@return ge1801ANumpersona
	 */
	public int getGe1801ANumpersona(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpersona((index));
	}
	
	/**
	 * 	Update Ge1801ANumpersona with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpersona(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),number);
	}


	public void setGe1801ANumpersona(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),(int)number);
	}


public short getGe1801AOfigestora(int index) throws CFException {  
        return ge1801Array.getGe1801AOfigestora((index));
}
	/**
	 * 	Update Ge1801AOfigestora with the passed value
	 *	@param number
	 */
	public void setGe1801AOfigestora(int index,short number)  throws CFException{
		ge1801Array.setGe1801AOfigestora((index),number);
	}

	public void setGe1801AOfigestora(int index,int number)  throws CFException{
	   ge1801Array.setGe1801AOfigestora((index),number);
	}
	public void setGe1801AOfigestora(int index,long number)  throws CFException {
	    ge1801Array.setGe1801AOfigestora((index),number);
	}
	


public int getGe1801ANumcartera(int index) throws CFException {  
        return ge1801Array.getGe1801ANumcartera((index));
}
	/**
	 * 	Update Ge1801ANumcartera with the passed value
	 *	@param number
	 */
	public void setGe1801ANumcartera(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumcartera((index),number);
	}


	public void setGe1801ANumcartera(int index,long number)  throws CFException{
	    ge1801Array.setGe1801ANumcartera((index),number);
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
	 *	Returns the value of ge1801ACodcartera
	 *	@return ge1801ACodcartera
	 */
   public char[] getGe1801ACodcartera(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcartera(index);
   }

  
	/**
	*  set variable ge1801ACodcartera
	*  @param value
	**/
   public void setGe1801ACodcartera(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcartera((index),value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of ge1801AFechabaja
	 *	@return ge1801AFechabaja
	 */
   public char[] getGe1801AFechabaja(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechabaja(index);
   }

  
	/**
	*  set variable ge1801AFechabaja
	*  @param value
	**/
   public void setGe1801AFechabaja(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechabaja((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACengescapt
	 *	@return ge1801ACengescapt
	 */
   public char[] getGe1801ACengescapt(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACengescapt(index);
   }

  
	/**
	*  set variable ge1801ACengescapt
	*  @param value
	**/
   public void setGe1801ACengescapt(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACengescapt((index),value);
   } 

	/**
	 *	Returns the value of ge1801AFechaalta
	 *	@return ge1801AFechaalta
	 */
   public char[] getGe1801AFechaalta(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechaalta(index);
   }

  
	/**
	*  set variable ge1801AFechaalta
	*  @param value
	**/
   public void setGe1801AFechaalta(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechaalta((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumresamb
	 *	@return ge1801ANumresamb
	 */
	public int getGe1801ANumresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),number);
	}


	public void setGe1801ANumresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpgescap
	 *	@return ge1801ANumpgescap
	 */
	public int getGe1801ANumpgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),number);
	}


	public void setGe1801ANumpgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),(int)number);
	}


public long getGe1801ACodcontrat(int index) throws CFException {  
        return ge1801Array.getGe1801ACodcontrat((index));
}
	/**
	 * 	Update Ge1801ACodcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801ACodcontrat(int index,long number)  throws CFException{
		ge1801Array.setGe1801ACodcontrat((index),number);
	}



	/**
	 *	Returns the value of litPrograma
	 *	@return litPrograma
	 */
   public char[] getLitPrograma() throws CFException  {              
   		return work.getLitPrograma();
   }

  
	/**
	*  set variable litPrograma
	*  @param value
	**/
   public void setLitPrograma(char[] value) throws CFException {
      work.setLitPrograma(value);
   } 

	/**
	 *	Returns the value of ge1801ACodcarrie
	 *	@return ge1801ACodcarrie
	 */
   public char[] getGe1801ACodcarrie(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcarrie(index);
   }

  
	/**
	*  set variable ge1801ACodcarrie
	*  @param value
	**/
   public void setGe1801ACodcarrie(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcarrie((index),value);
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
	 *	Returns the value of ge1801ATipproduct
	 *	@return ge1801ATipproduct
	 */
   public char[] getGe1801ATipproduct(int index) throws CFException  {              
   		return ge1801Array.getGe1801ATipproduct(index);
   }

  
	/**
	*  set variable ge1801ATipproduct
	*  @param value
	**/
   public void setGe1801ATipproduct(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ATipproduct((index),value);
   } 

	/**
	 *	Returns the value of ge1801Array
	 *	@return ge1801Array
	 */   
	 public Ge1801Array getGe1801Array() {
   	return ge1801Array;
   }


	/**
	 *	Returns the value of ge1801AFecciecurso
	 *	@return ge1801AFecciecurso
	 */
   public char[] getGe1801AFecciecurso(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFecciecurso(index);
   }

  
	/**
	*  set variable ge1801AFecciecurso
	*  @param value
	**/
   public void setGe1801AFecciecurso(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFecciecurso((index),value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public LeerCursorMrowOutCtx getLeerCursorMrowOutCtx() {
            return new LeerCursorMrowOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += ge1801Array.hashCode();
        str += abendLinea4.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LeerCursorMrowInCtx clone() {
        LeerCursorMrowInCtx cloneObj = new LeerCursorMrowInCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.ge1801Array = new Ge1801Array();
        cloneObj.ge1801Array.set(ge1801Array.getClonedField());
        cloneObj.abendLinea4 = new AbendLinea4();
        cloneObj.abendLinea4.set(abendLinea4.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LeerCursorMrowInCtx getLeerCursorMrowInCtx() {
            return new LeerCursorMrowInCtx();
    }
     public class LeerCursorMrowOutCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Ge1801Array ge1801Array = Bm80022Ctx.this.getGe1801Array();
     AbendLinea4 abendLinea4 = Bm80022Ctx.this.getAbendLinea4();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of posRow
	 *	@return posRow
	 */
	public int getPosRow() throws CFException {        
   		return work.getPosRow();
	}
	
	/**
	 * 	Update PosRow with the passed value
	 *	@param number
	 */
	public void setPosRow(int number)  throws CFException{
		work.setPosRow(number);
	}


	public void setPosRow(long number)  throws CFException{
		work.setPosRow((int)number);
	}


	/**
	 *	Returns the value of abendSenten
	 *	@return abendSenten
	 */
   public char[] getAbendSenten() throws CFException  {              
   		return abendLinea7.getAbendSenten();
   }

  
	/**
	*  set variable abendSenten
	*  @param value
	**/
   public void setAbendSenten(char[] value) throws CFException {
      abendLinea7.setAbendSenten(value);
   } 

     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendSenten(source, sourceIndex);
   	
   }
   
   public void setAbendSenten(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSenten with another Field
	 *	@param value
	 */
   public void setAbendSenten(Field source) {
      abendLinea7.setAbendSenten(source);
   }  
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of regsRecupRowset
	 *	@return regsRecupRowset
	 */
	public int getRegsRecupRowset() throws CFException {        
   		return work.getRegsRecupRowset();
	}
	
	/**
	 * 	Update RegsRecupRowset with the passed value
	 *	@param number
	 */
	public void setRegsRecupRowset(int number)  throws CFException{
		work.setRegsRecupRowset(number);
	}


	public void setRegsRecupRowset(long number)  throws CFException{
		work.setRegsRecupRowset((int)number);
	}


	/**
	 *	Test condition "S" for isSwSiFinCurRowset()
	 *	@return  Returns true if isSwSiFinCurRowset() is "S"
	 */
   public boolean isSwSiFinCurRowset() throws CFException {
      return work.isSwSiFinCurRowset();
   }

	/**
	*  set values "S"
	*/
   	public void setSwSiFinCurRowsetTrue()  throws CFException{  			
    	work.setSwSiFinCurRowsetTrue();
   	}
	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dsnnrows
	 *	@return dsnnrows
	 */
	public int getDsnnrows() throws CFException {        
   		return work.getDsnnrows();
	}
	
	/**
	 * 	Update Dsnnrows with the passed value
	 *	@param number
	 */
	public void setDsnnrows(int number)  throws CFException{
		work.setDsnnrows(number);
	}


	public void setDsnnrows(long number)  throws CFException{
		work.setDsnnrows((int)number);
	}


	/**
	 *	Returns the value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public long getAbendSqlcode() throws CFException {
   		return abendLinea6.getAbendSqlcode();
	}

    /**
	 *	Returns the String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeActualString() {
		return abendLinea6.getAbendSqlcodeActualString();
	}

	/**
	 *	Returns String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeString() throws CFException {
	     return String.valueOf(abendLinea6.getAbendSqlcodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendSqlcodeIsNumeric()  throws CFException{
	    return abendLinea6.abendSqlcodeIsNumeric();
	}

	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param number
	 */
	public void setAbendSqlcode(long number)  throws CFException{
		abendLinea6.setAbendSqlcode(number);
	}
	

	
	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcode(char[] value)  throws CFException {
		abendLinea6.setAbendSqlcode(value);
	}
	
	/**
	 * 	Update AbendSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcodeString(char[] value)  throws CFException{
		abendLinea6.setAbendSqlcode(value);
	}	

	/**
	 *	Test condition "S" for isSwFinCurGe18Si()
	 *	@return  Returns true if isSwFinCurGe18Si() is "S"
	 */
   public boolean isSwFinCurGe18Si() throws CFException {
      return work.isSwFinCurGe18Si();
   }

	/**
	*  set values "S"
	*/
   	public void setSwFinCurGe18SiTrue()  throws CFException{  			
    	work.setSwFinCurGe18SiTrue();
   	}
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public int getSqlcode_Ws() throws CFException {        
   		return work.getSqlcode_Ws();
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param number
	 */
	public void setSqlcode_Ws(int number)  throws CFException{
		work.setSqlcode_Ws(number);
	}


	public void setSqlcode_Ws(long number)  throws CFException{
		work.setSqlcode_Ws((int)number);
	}


	/**
	 *	Returns the value of abendProg
	 *	@return abendProg
	 */
   public char[] getAbendProg() throws CFException  {              
   		return abendLinea7.getAbendProg();
   }

  
	/**
	*  set variable abendProg
	*  @param value
	**/
   public void setAbendProg(char[] value) throws CFException {
      abendLinea7.setAbendProg(value);
   } 

     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendProg(source, sourceIndex);
   	
   }
   
   public void setAbendProg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendProg with another Field
	 *	@param value
	 */
   public void setAbendProg(Field source) {
      abendLinea7.setAbendProg(source);
   }  
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of abendMensaje
	 *	@return abendMensaje
	 */
   public char[] getAbendMensaje() throws CFException  {              
   		return abendLinea4.getAbendMensaje();
   }

  
	/**
	*  set variable abendMensaje
	*  @param value
	**/
   public void setAbendMensaje(char[] value) throws CFException {
      abendLinea4.setAbendMensaje(value);
   } 

     /**
	 * 	Update AbendMensaje 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendMensaje(char[] source, int sourceIndex) throws CFException {
      abendLinea4.setAbendMensaje(source, sourceIndex);
   	
   }
   
   public void setAbendMensaje(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea4.setAbendMensaje(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendMensaje 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendMensaje(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea4.setAbendMensaje(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendMensaje with another Field
	 *	@param value
	 */
   public void setAbendMensaje(Field source) {
      abendLinea4.setAbendMensaje(source);
   }  
   
     /**
	 * 	Update AbendMensaje 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendMensaje(Field source, int sourceIndex,int sourceLen) {
      abendLinea4.setAbendMensaje(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendMensaje 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendMensaje(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea4.setAbendMensaje(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of litPrograma
	 *	@return litPrograma
	 */
   public char[] getLitPrograma() throws CFException  {              
   		return work.getLitPrograma();
   }

  
	/**
	*  set variable litPrograma
	*  @param value
	**/
   public void setLitPrograma(char[] value) throws CFException {
      work.setLitPrograma(value);
   } 

	/**
	 *	Returns the value of abendParraf
	 *	@return abendParraf
	 */
   public char[] getAbendParraf() throws CFException  {              
   		return abendLinea7.getAbendParraf();
   }

  
	/**
	*  set variable abendParraf
	*  @param value
	**/
   public void setAbendParraf(char[] value) throws CFException {
      abendLinea7.setAbendParraf(value);
   } 

     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendParraf(source, sourceIndex);
   	
   }
   
   public void setAbendParraf(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParraf with another Field
	 *	@param value
	 */
   public void setAbendParraf(Field source) {
      abendLinea7.setAbendParraf(source);
   }  
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Array
	 *	@return ge1801Array
	 */   
	 public Ge1801Array getGe1801Array() {
   	return ge1801Array;
   }


	/**
	 *	Returns the value of abendTabla
	 *	@return abendTabla
	 */
   public char[] getAbendTabla() throws CFException  {              
   		return abendLinea6.getAbendTabla();
   }

  
	/**
	*  set variable abendTabla
	*  @param value
	**/
   public void setAbendTabla(char[] value) throws CFException {
      abendLinea6.setAbendTabla(value);
   } 

     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex) throws CFException {
      abendLinea6.setAbendTabla(source, sourceIndex);
   	
   }
   
   public void setAbendTabla(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendTabla with another Field
	 *	@param value
	 */
   public void setAbendTabla(Field source) {
      abendLinea6.setAbendTabla(source);
   }  
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += ge1801Array.hashCode();
        str += abendLinea4.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LeerCursorMrowOutCtx clone() {
        LeerCursorMrowOutCtx cloneObj = new LeerCursorMrowOutCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.ge1801Array = new Ge1801Array();
        cloneObj.ge1801Array.set(ge1801Array.getClonedField());
        cloneObj.abendLinea4 = new AbendLinea4();
        cloneObj.abendLinea4.set(abendLinea4.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LeerCursorMrowOutCtx getLeerCursorMrowOutCtx() {
            return new LeerCursorMrowOutCtx();
    }
     public class RecuperarFilaInCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of posRow
	 *	@return posRow
	 */
	public int getPosRow() throws CFException {        
   		return work.getPosRow();
	}
	
	/**
	 * 	Update PosRow with the passed value
	 *	@param number
	 */
	public void setPosRow(int number)  throws CFException{
		work.setPosRow(number);
	}


	public void setPosRow(long number)  throws CFException{
		work.setPosRow((int)number);
	}


	/**
	 *	Returns the value of regsRecupRowset
	 *	@return regsRecupRowset
	 */
	public int getRegsRecupRowset() throws CFException {        
   		return work.getRegsRecupRowset();
	}
	
	/**
	 * 	Update RegsRecupRowset with the passed value
	 *	@param number
	 */
	public void setRegsRecupRowset(int number)  throws CFException{
		work.setRegsRecupRowset(number);
	}


	public void setRegsRecupRowset(long number)  throws CFException{
		work.setRegsRecupRowset((int)number);
	}


	/**
	 *	Test condition "N" for isSwNoFinCurRowset()
	 *	@return  Returns true if isSwNoFinCurRowset() is "N"
	 */
   public boolean isSwNoFinCurRowset() throws CFException {
      return work.isSwNoFinCurRowset();
   }

	/**
	*  set values "N"
	*/
   	public void setSwNoFinCurRowsetTrue()  throws CFException{  			
    	work.setSwNoFinCurRowsetTrue();
   	}

        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public RecuperarFilaOutCtx getRecuperarFilaOutCtx() {
            return new RecuperarFilaOutCtx();
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

    public RecuperarFilaInCtx clone() {
        RecuperarFilaInCtx cloneObj = new RecuperarFilaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RecuperarFilaInCtx getRecuperarFilaInCtx() {
            return new RecuperarFilaInCtx();
    }
     public class RecuperarFilaOutCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of posRow
	 *	@return posRow
	 */
	public int getPosRow() throws CFException {        
   		return work.getPosRow();
	}
	
	/**
	 * 	Update PosRow with the passed value
	 *	@param number
	 */
	public void setPosRow(int number)  throws CFException{
		work.setPosRow(number);
	}


	public void setPosRow(long number)  throws CFException{
		work.setPosRow((int)number);
	}


	/**
	 *	Test condition "S" for isSwFinCurGe18Si()
	 *	@return  Returns true if isSwFinCurGe18Si() is "S"
	 */
   public boolean isSwFinCurGe18Si() throws CFException {
      return work.isSwFinCurGe18Si();
   }

	/**
	*  set values "S"
	*/
   	public void setSwFinCurGe18SiTrue()  throws CFException{  			
    	work.setSwFinCurGe18SiTrue();
   	}

        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
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

    public RecuperarFilaOutCtx clone() {
        RecuperarFilaOutCtx cloneObj = new RecuperarFilaOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public RecuperarFilaOutCtx getRecuperarFilaOutCtx() {
            return new RecuperarFilaOutCtx();
    }
     public class TratarFilaInCtx implements Cloneable {
     Contadors contadors = Bm80022Ctx.this.getContadors();

	/**
	 *	Returns the value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public long getLlegitsGe1801() throws CFException {
   		return contadors.getLlegitsGe1801();
	}


	/**
	 *	Returns String value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public char[]  getLlegitsGe1801String() throws CFException {
	     return String.valueOf(contadors.getLlegitsGe1801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llegitsGe1801IsNumeric()  throws CFException{
	    return contadors.llegitsGe1801IsNumeric();
	}

	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param number
	 */
	public void setLlegitsGe1801(long number)  throws CFException{
		contadors.setLlegitsGe1801(number);
	}
	

	
	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801(char[] value)  throws CFException {
		contadors.setLlegitsGe1801(value);
	}
	
	/**
	 * 	Update LlegitsGe1801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801String(char[] value)  throws CFException{
		contadors.setLlegitsGe1801(value);
	}	


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public TratarFilaOutCtx getTratarFilaOutCtx() {
            return new TratarFilaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += contadors.hashCode();
       return str.hashCode();
    }

    public TratarFilaInCtx clone() {
        TratarFilaInCtx cloneObj = new TratarFilaInCtx();
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        return cloneObj;
    }

    }

    public TratarFilaInCtx getTratarFilaInCtx() {
            return new TratarFilaInCtx();
    }
     public class TratarFilaOutCtx implements Cloneable {
     Contadors contadors = Bm80022Ctx.this.getContadors();

	/**
	 *	Returns the value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public long getLlegitsGe1801() throws CFException {
   		return contadors.getLlegitsGe1801();
	}


	/**
	 *	Returns String value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public char[]  getLlegitsGe1801String() throws CFException {
	     return String.valueOf(contadors.getLlegitsGe1801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llegitsGe1801IsNumeric()  throws CFException{
	    return contadors.llegitsGe1801IsNumeric();
	}

	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param number
	 */
	public void setLlegitsGe1801(long number)  throws CFException{
		contadors.setLlegitsGe1801(number);
	}
	

	
	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801(char[] value)  throws CFException {
		contadors.setLlegitsGe1801(value);
	}
	
	/**
	 * 	Update LlegitsGe1801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801String(char[] value)  throws CFException{
		contadors.setLlegitsGe1801(value);
	}	


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += contadors.hashCode();
       return str.hashCode();
    }

    public TratarFilaOutCtx clone() {
        TratarFilaOutCtx cloneObj = new TratarFilaOutCtx();
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        return cloneObj;
    }

    }

    public TratarFilaOutCtx getTratarFilaOutCtx() {
            return new TratarFilaOutCtx();
    }
     public class MoverRowsetInCtx implements Cloneable {
     Ge1801Array ge1801Array = Bm80022Ctx.this.getGe1801Array();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of posRow
	 *	@return posRow
	 */
	public int getPosRow() throws CFException {        
   		return work.getPosRow();
	}
	
	/**
	 * 	Update PosRow with the passed value
	 *	@param number
	 */
	public void setPosRow(int number)  throws CFException{
		work.setPosRow(number);
	}


	public void setPosRow(long number)  throws CFException{
		work.setPosRow((int)number);
	}


	/**
	 *	Returns the value of ge1801AResambito
	 *	@return ge1801AResambito
	 */
   public char[] getGe1801AResambito(int index) throws CFException  {              
   		return ge1801Array.getGe1801AResambito(index);
   }

  
	/**
	*  set variable ge1801AResambito
	*  @param value
	**/
   public void setGe1801AResambito(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AResambito((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumpesprie
	 *	@return ge1801ANumpesprie
	 */
	public int getGe1801ANumpesprie(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpesprie((index));
	}
	
	/**
	 * 	Update Ge1801ANumpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpesprie(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),number);
	}


	public void setGe1801ANumpesprie(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ACodcartera
	 *	@return ge1801ACodcartera
	 */
   public char[] getGe1801ACodcartera(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcartera(index);
   }

  
	/**
	*  set variable ge1801ACodcartera
	*  @param value
	**/
   public void setGe1801ACodcartera(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcartera((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACodentid
	 *	@return ge1801ACodentid
	 */
   public char[] getGe1801ACodentid(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodentid(index);
   }

  
	/**
	*  set variable ge1801ACodentid
	*  @param value
	**/
   public void setGe1801ACodentid(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodentid((index),value);
   } 

	/**
	 *	Returns the value of ge1801AFechabaja
	 *	@return ge1801AFechabaja
	 */
   public char[] getGe1801AFechabaja(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechabaja(index);
   }

  
	/**
	*  set variable ge1801AFechabaja
	*  @param value
	**/
   public void setGe1801AFechabaja(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechabaja((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACodnodo
	 *	@return ge1801ACodnodo
	 */
   public char[] getGe1801ACodnodo(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodnodo(index);
   }

  
	/**
	*  set variable ge1801ACodnodo
	*  @param value
	**/
   public void setGe1801ACodnodo(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodnodo((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACengescapt
	 *	@return ge1801ACengescapt
	 */
   public char[] getGe1801ACengescapt(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACengescapt(index);
   }

  
	/**
	*  set variable ge1801ACengescapt
	*  @param value
	**/
   public void setGe1801ACengescapt(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACengescapt((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumgescap
	 *	@return ge1801ANumgescap
	 */
	public int getGe1801ANumgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),number);
	}


	public void setGe1801ANumgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801AFechaalta
	 *	@return ge1801AFechaalta
	 */
   public char[] getGe1801AFechaalta(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechaalta(index);
   }

  
	/**
	*  set variable ge1801AFechaalta
	*  @param value
	**/
   public void setGe1801AFechaalta(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechaalta((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumresamb
	 *	@return ge1801ANumresamb
	 */
	public int getGe1801ANumresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),number);
	}


	public void setGe1801ANumresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpgescap
	 *	@return ge1801ANumpgescap
	 */
	public int getGe1801ANumpgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),number);
	}


	public void setGe1801ANumpgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),(int)number);
	}


public long getGe1801ACodcontrat(int index) throws CFException {  
        return ge1801Array.getGe1801ACodcontrat((index));
}
	/**
	 * 	Update Ge1801ACodcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801ACodcontrat(int index,long number)  throws CFException{
		ge1801Array.setGe1801ACodcontrat((index),number);
	}



	/**
	 *	Returns the value of ge1801ANumpresamb
	 *	@return ge1801ANumpresamb
	 */
	public int getGe1801ANumpresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),number);
	}


	public void setGe1801ANumpresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ACodcarrie
	 *	@return ge1801ACodcarrie
	 */
   public char[] getGe1801ACodcarrie(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcarrie(index);
   }

  
	/**
	*  set variable ge1801ACodcarrie
	*  @param value
	**/
   public void setGe1801ACodcarrie(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcarrie((index),value);
   } 

	/**
	 *	Returns the value of ge1801ATipproduct
	 *	@return ge1801ATipproduct
	 */
   public char[] getGe1801ATipproduct(int index) throws CFException  {              
   		return ge1801Array.getGe1801ATipproduct(index);
   }

  
	/**
	*  set variable ge1801ATipproduct
	*  @param value
	**/
   public void setGe1801ATipproduct(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ATipproduct((index),value);
   } 

	/**
	 *	Returns the value of ge1801AIdepsig
	 *	@return ge1801AIdepsig
	 */
   public char[] getGe1801AIdepsig(int index) throws CFException  {              
   		return ge1801Array.getGe1801AIdepsig(index);
   }

  
	/**
	*  set variable ge1801AIdepsig
	*  @param value
	**/
   public void setGe1801AIdepsig(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AIdepsig((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumpersona
	 *	@return ge1801ANumpersona
	 */
	public int getGe1801ANumpersona(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpersona((index));
	}
	
	/**
	 * 	Update Ge1801ANumpersona with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpersona(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),number);
	}


	public void setGe1801ANumpersona(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801AFecciecurso
	 *	@return ge1801AFecciecurso
	 */
   public char[] getGe1801AFecciecurso(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFecciecurso(index);
   }

  
	/**
	*  set variable ge1801AFecciecurso
	*  @param value
	**/
   public void setGe1801AFecciecurso(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFecciecurso((index),value);
   } 

public short getGe1801AOfigestora(int index) throws CFException {  
        return ge1801Array.getGe1801AOfigestora((index));
}
	/**
	 * 	Update Ge1801AOfigestora with the passed value
	 *	@param number
	 */
	public void setGe1801AOfigestora(int index,short number)  throws CFException{
		ge1801Array.setGe1801AOfigestora((index),number);
	}

	public void setGe1801AOfigestora(int index,int number)  throws CFException{
	   ge1801Array.setGe1801AOfigestora((index),number);
	}
	public void setGe1801AOfigestora(int index,long number)  throws CFException {
	    ge1801Array.setGe1801AOfigestora((index),number);
	}
	


public int getGe1801ANumcartera(int index) throws CFException {  
        return ge1801Array.getGe1801ANumcartera((index));
}
	/**
	 * 	Update Ge1801ANumcartera with the passed value
	 *	@param number
	 */
	public void setGe1801ANumcartera(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumcartera((index),number);
	}


	public void setGe1801ANumcartera(int index,long number)  throws CFException{
	    ge1801Array.setGe1801ANumcartera((index),number);
	}
	


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public MoverRowsetOutCtx getMoverRowsetOutCtx() {
            return new MoverRowsetOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge1801Array.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoverRowsetInCtx clone() {
        MoverRowsetInCtx cloneObj = new MoverRowsetInCtx();
        cloneObj.ge1801Array = new Ge1801Array();
        cloneObj.ge1801Array.set(ge1801Array.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoverRowsetInCtx getMoverRowsetInCtx() {
            return new MoverRowsetInCtx();
    }
     public class MoverRowsetOutCtx implements Cloneable {
     Ge1801Array ge1801Array = Bm80022Ctx.this.getGe1801Array();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of ge1801Fechabaja
	 *	@return ge1801Fechabaja
	 */
   public char[] getGe1801Fechabaja() throws CFException  {              
   		return work.getGe1801Fechabaja();
   }

  
	/**
	*  set variable ge1801Fechabaja
	*  @param value
	**/
   public void setGe1801Fechabaja(char[] value) throws CFException {
      work.setGe1801Fechabaja(value);
   } 

	/**
	 *	Returns the value of ge1801Codentid
	 *	@return ge1801Codentid
	 */
   public char[] getGe1801Codentid() throws CFException  {              
   		return work.getGe1801Codentid();
   }

  
	/**
	*  set variable ge1801Codentid
	*  @param value
	**/
   public void setGe1801Codentid(char[] value) throws CFException {
      work.setGe1801Codentid(value);
   } 

	/**
	 *	Returns the value of ge1801AResambito
	 *	@return ge1801AResambito
	 */
   public char[] getGe1801AResambito(int index) throws CFException  {              
   		return ge1801Array.getGe1801AResambito(index);
   }

  
	/**
	*  set variable ge1801AResambito
	*  @param value
	**/
   public void setGe1801AResambito(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AResambito((index),value);
   } 

	/**
	 *	Returns the value of ge1801Numpgescap
	 *	@return ge1801Numpgescap
	 */
	public int getGe1801Numpgescap() throws CFException {        
   		return work.getGe1801Numpgescap();
	}
	
	/**
	 * 	Update Ge1801Numpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numpgescap(int number)  throws CFException{
		work.setGe1801Numpgescap(number);
	}


	public void setGe1801Numpgescap(long number)  throws CFException{
		work.setGe1801Numpgescap((int)number);
	}


public int getGe1801Numcartera() throws CFException {  
        return work.getGe1801Numcartera();
}
	/**
	 * 	Update Ge1801Numcartera with the passed value
	 *	@param number
	 */
	public void setGe1801Numcartera(int number)  throws CFException{
		work.setGe1801Numcartera(number);
	}


	public void setGe1801Numcartera(long number)  throws CFException{
	    work.setGe1801Numcartera(number);
	}
	

public short getGe1801Ofigestora() throws CFException {  
        return work.getGe1801Ofigestora();
}
	/**
	 * 	Update Ge1801Ofigestora with the passed value
	 *	@param number
	 */
	public void setGe1801Ofigestora(short number)  throws CFException{
		work.setGe1801Ofigestora(number);
	}

	public void setGe1801Ofigestora(int number)  throws CFException{
	   work.setGe1801Ofigestora(number);
	}
	public void setGe1801Ofigestora(long number)  throws CFException {
	    work.setGe1801Ofigestora(number);
	}
	


	/**
	 *	Returns the value of ge1801Numpresamb
	 *	@return ge1801Numpresamb
	 */
	public int getGe1801Numpresamb() throws CFException {        
   		return work.getGe1801Numpresamb();
	}
	
	/**
	 * 	Update Ge1801Numpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numpresamb(int number)  throws CFException{
		work.setGe1801Numpresamb(number);
	}


	public void setGe1801Numpresamb(long number)  throws CFException{
		work.setGe1801Numpresamb((int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpesprie
	 *	@return ge1801ANumpesprie
	 */
	public int getGe1801ANumpesprie(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpesprie((index));
	}
	
	/**
	 * 	Update Ge1801ANumpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpesprie(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),number);
	}


	public void setGe1801ANumpesprie(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpesprie((index),(int)number);
	}


public long getGe1801Codcontrat() throws CFException {  
        return work.getGe1801Codcontrat();
}
	/**
	 * 	Update Ge1801Codcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801Codcontrat(long number)  throws CFException{
		work.setGe1801Codcontrat(number);
	}



	/**
	 *	Returns the value of ge1801ACodentid
	 *	@return ge1801ACodentid
	 */
   public char[] getGe1801ACodentid(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodentid(index);
   }

  
	/**
	*  set variable ge1801ACodentid
	*  @param value
	**/
   public void setGe1801ACodentid(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodentid((index),value);
   } 

	/**
	 *	Returns the value of ge1801ACodnodo
	 *	@return ge1801ACodnodo
	 */
   public char[] getGe1801ACodnodo(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodnodo(index);
   }

  
	/**
	*  set variable ge1801ACodnodo
	*  @param value
	**/
   public void setGe1801ACodnodo(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodnodo((index),value);
   } 

	/**
	 *	Returns the value of ge1801ANumgescap
	 *	@return ge1801ANumgescap
	 */
	public int getGe1801ANumgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),number);
	}


	public void setGe1801ANumgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumgescap((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801Resambito
	 *	@return ge1801Resambito
	 */
   public char[] getGe1801Resambito() throws CFException  {              
   		return work.getGe1801Resambito();
   }

  
	/**
	*  set variable ge1801Resambito
	*  @param value
	**/
   public void setGe1801Resambito(char[] value) throws CFException {
      work.setGe1801Resambito(value);
   } 

	/**
	 *	Returns the value of ge1801ANumpresamb
	 *	@return ge1801ANumpresamb
	 */
	public int getGe1801ANumpresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),number);
	}


	public void setGe1801ANumpresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpresamb((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801Numpersona
	 *	@return ge1801Numpersona
	 */
	public int getGe1801Numpersona() throws CFException {        
   		return work.getGe1801Numpersona();
	}
	
	/**
	 * 	Update Ge1801Numpersona with the passed value
	 *	@param number
	 */
	public void setGe1801Numpersona(int number)  throws CFException{
		work.setGe1801Numpersona(number);
	}


	public void setGe1801Numpersona(long number)  throws CFException{
		work.setGe1801Numpersona((int)number);
	}


	/**
	 *	Returns the value of ge1801Codcarrie
	 *	@return ge1801Codcarrie
	 */
   public char[] getGe1801Codcarrie() throws CFException  {              
   		return work.getGe1801Codcarrie();
   }

  
	/**
	*  set variable ge1801Codcarrie
	*  @param value
	**/
   public void setGe1801Codcarrie(char[] value) throws CFException {
      work.setGe1801Codcarrie(value);
   } 

	/**
	 *	Returns the value of ge1801Cengescapt
	 *	@return ge1801Cengescapt
	 */
   public char[] getGe1801Cengescapt() throws CFException  {              
   		return work.getGe1801Cengescapt();
   }

  
	/**
	*  set variable ge1801Cengescapt
	*  @param value
	**/
   public void setGe1801Cengescapt(char[] value) throws CFException {
      work.setGe1801Cengescapt(value);
   } 

	/**
	 *	Returns the value of ge1801AIdepsig
	 *	@return ge1801AIdepsig
	 */
   public char[] getGe1801AIdepsig(int index) throws CFException  {              
   		return ge1801Array.getGe1801AIdepsig(index);
   }

  
	/**
	*  set variable ge1801AIdepsig
	*  @param value
	**/
   public void setGe1801AIdepsig(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AIdepsig((index),value);
   } 

	/**
	 *	Returns the value of ge1801Fechaalta
	 *	@return ge1801Fechaalta
	 */
   public char[] getGe1801Fechaalta() throws CFException  {              
   		return work.getGe1801Fechaalta();
   }

  
	/**
	*  set variable ge1801Fechaalta
	*  @param value
	**/
   public void setGe1801Fechaalta(char[] value) throws CFException {
      work.setGe1801Fechaalta(value);
   } 

	/**
	 *	Returns the value of ge1801Numpesprie
	 *	@return ge1801Numpesprie
	 */
	public int getGe1801Numpesprie() throws CFException {        
   		return work.getGe1801Numpesprie();
	}
	
	/**
	 * 	Update Ge1801Numpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801Numpesprie(int number)  throws CFException{
		work.setGe1801Numpesprie(number);
	}


	public void setGe1801Numpesprie(long number)  throws CFException{
		work.setGe1801Numpesprie((int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpersona
	 *	@return ge1801ANumpersona
	 */
	public int getGe1801ANumpersona(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpersona((index));
	}
	
	/**
	 * 	Update Ge1801ANumpersona with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpersona(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),number);
	}


	public void setGe1801ANumpersona(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpersona((index),(int)number);
	}


public short getGe1801AOfigestora(int index) throws CFException {  
        return ge1801Array.getGe1801AOfigestora((index));
}
	/**
	 * 	Update Ge1801AOfigestora with the passed value
	 *	@param number
	 */
	public void setGe1801AOfigestora(int index,short number)  throws CFException{
		ge1801Array.setGe1801AOfigestora((index),number);
	}

	public void setGe1801AOfigestora(int index,int number)  throws CFException{
	   ge1801Array.setGe1801AOfigestora((index),number);
	}
	public void setGe1801AOfigestora(int index,long number)  throws CFException {
	    ge1801Array.setGe1801AOfigestora((index),number);
	}
	


public int getGe1801ANumcartera(int index) throws CFException {  
        return ge1801Array.getGe1801ANumcartera((index));
}
	/**
	 * 	Update Ge1801ANumcartera with the passed value
	 *	@param number
	 */
	public void setGe1801ANumcartera(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumcartera((index),number);
	}


	public void setGe1801ANumcartera(int index,long number)  throws CFException{
	    ge1801Array.setGe1801ANumcartera((index),number);
	}
	

	/**
	 *	Returns the value of ge1801Codcartera
	 *	@return ge1801Codcartera
	 */
   public char[] getGe1801Codcartera() throws CFException  {              
   		return work.getGe1801Codcartera();
   }

  
	/**
	*  set variable ge1801Codcartera
	*  @param value
	**/
   public void setGe1801Codcartera(char[] value) throws CFException {
      work.setGe1801Codcartera(value);
   } 

	/**
	 *	Returns the value of ge1801ACodcartera
	 *	@return ge1801ACodcartera
	 */
   public char[] getGe1801ACodcartera(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcartera(index);
   }

  
	/**
	*  set variable ge1801ACodcartera
	*  @param value
	**/
   public void setGe1801ACodcartera(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcartera((index),value);
   } 

	/**
	 *	Returns the value of ge1801AFechabaja
	 *	@return ge1801AFechabaja
	 */
   public char[] getGe1801AFechabaja(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechabaja(index);
   }

  
	/**
	*  set variable ge1801AFechabaja
	*  @param value
	**/
   public void setGe1801AFechabaja(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechabaja((index),value);
   } 

	/**
	 *	Returns the value of ge1801Idepsig
	 *	@return ge1801Idepsig
	 */
   public char[] getGe1801Idepsig() throws CFException  {              
   		return work.getGe1801Idepsig();
   }

  
	/**
	*  set variable ge1801Idepsig
	*  @param value
	**/
   public void setGe1801Idepsig(char[] value) throws CFException {
      work.setGe1801Idepsig(value);
   } 

	/**
	 *	Returns the value of ge1801ACengescapt
	 *	@return ge1801ACengescapt
	 */
   public char[] getGe1801ACengescapt(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACengescapt(index);
   }

  
	/**
	*  set variable ge1801ACengescapt
	*  @param value
	**/
   public void setGe1801ACengescapt(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACengescapt((index),value);
   } 

	/**
	 *	Returns the value of ge1801AFechaalta
	 *	@return ge1801AFechaalta
	 */
   public char[] getGe1801AFechaalta(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFechaalta(index);
   }

  
	/**
	*  set variable ge1801AFechaalta
	*  @param value
	**/
   public void setGe1801AFechaalta(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFechaalta((index),value);
   } 

	/**
	 *	Returns the value of ge1801Tipproduct
	 *	@return ge1801Tipproduct
	 */
   public char[] getGe1801Tipproduct() throws CFException  {              
   		return work.getGe1801Tipproduct();
   }

  
	/**
	*  set variable ge1801Tipproduct
	*  @param value
	**/
   public void setGe1801Tipproduct(char[] value) throws CFException {
      work.setGe1801Tipproduct(value);
   } 

	/**
	 *	Returns the value of ge1801Fecciecurso
	 *	@return ge1801Fecciecurso
	 */
   public char[] getGe1801Fecciecurso() throws CFException  {              
   		return work.getGe1801Fecciecurso();
   }

  
	/**
	*  set variable ge1801Fecciecurso
	*  @param value
	**/
   public void setGe1801Fecciecurso(char[] value) throws CFException {
      work.setGe1801Fecciecurso(value);
   } 

	/**
	 *	Returns the value of ge1801ANumresamb
	 *	@return ge1801ANumresamb
	 */
	public int getGe1801ANumresamb(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumresamb((index));
	}
	
	/**
	 * 	Update Ge1801ANumresamb with the passed value
	 *	@param number
	 */
	public void setGe1801ANumresamb(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),number);
	}


	public void setGe1801ANumresamb(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumresamb((index),(int)number);
	}


	/**
	 *	Returns the value of ge1801ANumpgescap
	 *	@return ge1801ANumpgescap
	 */
	public int getGe1801ANumpgescap(int index) throws CFException {        
   		return ge1801Array.getGe1801ANumpgescap((index));
	}
	
	/**
	 * 	Update Ge1801ANumpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801ANumpgescap(int index,int number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),number);
	}


	public void setGe1801ANumpgescap(int index,long number)  throws CFException{
		ge1801Array.setGe1801ANumpgescap((index),(int)number);
	}


public long getGe1801ACodcontrat(int index) throws CFException {  
        return ge1801Array.getGe1801ACodcontrat((index));
}
	/**
	 * 	Update Ge1801ACodcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801ACodcontrat(int index,long number)  throws CFException{
		ge1801Array.setGe1801ACodcontrat((index),number);
	}



	/**
	 *	Returns the value of ge1801Numgescap
	 *	@return ge1801Numgescap
	 */
	public int getGe1801Numgescap() throws CFException {        
   		return work.getGe1801Numgescap();
	}
	
	/**
	 * 	Update Ge1801Numgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numgescap(int number)  throws CFException{
		work.setGe1801Numgescap(number);
	}


	public void setGe1801Numgescap(long number)  throws CFException{
		work.setGe1801Numgescap((int)number);
	}


	/**
	 *	Returns the value of ge1801ACodcarrie
	 *	@return ge1801ACodcarrie
	 */
   public char[] getGe1801ACodcarrie(int index) throws CFException  {              
   		return ge1801Array.getGe1801ACodcarrie(index);
   }

  
	/**
	*  set variable ge1801ACodcarrie
	*  @param value
	**/
   public void setGe1801ACodcarrie(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ACodcarrie((index),value);
   } 

	/**
	 *	Returns the value of ge1801ATipproduct
	 *	@return ge1801ATipproduct
	 */
   public char[] getGe1801ATipproduct(int index) throws CFException  {              
   		return ge1801Array.getGe1801ATipproduct(index);
   }

  
	/**
	*  set variable ge1801ATipproduct
	*  @param value
	**/
   public void setGe1801ATipproduct(int index,char[] value) throws CFException {
      ge1801Array.setGe1801ATipproduct((index),value);
   } 

	/**
	 *	Returns the value of ge1801Codnodo
	 *	@return ge1801Codnodo
	 */
   public char[] getGe1801Codnodo() throws CFException  {              
   		return work.getGe1801Codnodo();
   }

  
	/**
	*  set variable ge1801Codnodo
	*  @param value
	**/
   public void setGe1801Codnodo(char[] value) throws CFException {
      work.setGe1801Codnodo(value);
   } 

	/**
	 *	Returns the value of ge1801AFecciecurso
	 *	@return ge1801AFecciecurso
	 */
   public char[] getGe1801AFecciecurso(int index) throws CFException  {              
   		return ge1801Array.getGe1801AFecciecurso(index);
   }

  
	/**
	*  set variable ge1801AFecciecurso
	*  @param value
	**/
   public void setGe1801AFecciecurso(int index,char[] value) throws CFException {
      ge1801Array.setGe1801AFecciecurso((index),value);
   } 

	/**
	 *	Returns the value of ge1801Numresamb
	 *	@return ge1801Numresamb
	 */
	public int getGe1801Numresamb() throws CFException {        
   		return work.getGe1801Numresamb();
	}
	
	/**
	 * 	Update Ge1801Numresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numresamb(int number)  throws CFException{
		work.setGe1801Numresamb(number);
	}


	public void setGe1801Numresamb(long number)  throws CFException{
		work.setGe1801Numresamb((int)number);
	}



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge1801Array.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MoverRowsetOutCtx clone() {
        MoverRowsetOutCtx cloneObj = new MoverRowsetOutCtx();
        cloneObj.ge1801Array = new Ge1801Array();
        cloneObj.ge1801Array.set(ge1801Array.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MoverRowsetOutCtx getMoverRowsetOutCtx() {
            return new MoverRowsetOutCtx();
    }
     public class CloseCurGe18InCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Work work = Bm80022Ctx.this.getWork();

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
	 *	Returns the value of wkErrorDb2
	 *	@return wkErrorDb2
	 */
   public char[] getWkErrorDb2() throws CFException  {              
   		return work.getWkErrorDb2();
   }

  
	/**
	*  set variable wkErrorDb2
	*  @param value
	**/
   public void setWkErrorDb2(char[] value) throws CFException {
      work.setWkErrorDb2(value);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public CloseCurGe18OutCtx getCloseCurGe18OutCtx() {
            return new CloseCurGe18OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseCurGe18InCtx clone() {
        CloseCurGe18InCtx cloneObj = new CloseCurGe18InCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseCurGe18InCtx getCloseCurGe18InCtx() {
            return new CloseCurGe18InCtx();
    }
     public class CloseCurGe18OutCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     Sqlca sqlca = Bm80022Ctx.this.getSqlca();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public int getSqlcode_Ws() throws CFException {        
   		return work.getSqlcode_Ws();
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param number
	 */
	public void setSqlcode_Ws(int number)  throws CFException{
		work.setSqlcode_Ws(number);
	}


	public void setSqlcode_Ws(long number)  throws CFException{
		work.setSqlcode_Ws((int)number);
	}


	/**
	 *	Returns the value of abendProg
	 *	@return abendProg
	 */
   public char[] getAbendProg() throws CFException  {              
   		return abendLinea7.getAbendProg();
   }

  
	/**
	*  set variable abendProg
	*  @param value
	**/
   public void setAbendProg(char[] value) throws CFException {
      abendLinea7.setAbendProg(value);
   } 

     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendProg(source, sourceIndex);
   	
   }
   
   public void setAbendProg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendProg with another Field
	 *	@param value
	 */
   public void setAbendProg(Field source) {
      abendLinea7.setAbendProg(source);
   }  
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendProg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendSenten
	 *	@return abendSenten
	 */
   public char[] getAbendSenten() throws CFException  {              
   		return abendLinea7.getAbendSenten();
   }

  
	/**
	*  set variable abendSenten
	*  @param value
	**/
   public void setAbendSenten(char[] value) throws CFException {
      abendLinea7.setAbendSenten(value);
   } 

     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendSenten(source, sourceIndex);
   	
   }
   
   public void setAbendSenten(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSenten with another Field
	 *	@param value
	 */
   public void setAbendSenten(Field source) {
      abendLinea7.setAbendSenten(source);
   }  
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendSenten(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wkErrorDb2
	 *	@return wkErrorDb2
	 */
   public char[] getWkErrorDb2() throws CFException  {              
   		return work.getWkErrorDb2();
   }

  
	/**
	*  set variable wkErrorDb2
	*  @param value
	**/
   public void setWkErrorDb2(char[] value) throws CFException {
      work.setWkErrorDb2(value);
   } 

	/**
	 *	Returns the value of abendParraf
	 *	@return abendParraf
	 */
   public char[] getAbendParraf() throws CFException  {              
   		return abendLinea7.getAbendParraf();
   }

  
	/**
	*  set variable abendParraf
	*  @param value
	**/
   public void setAbendParraf(char[] value) throws CFException {
      abendLinea7.setAbendParraf(value);
   } 

     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex) throws CFException {
      abendLinea7.setAbendParraf(source, sourceIndex);
   	
   }
   
   public void setAbendParraf(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParraf with another Field
	 *	@param value
	 */
   public void setAbendParraf(Field source) {
      abendLinea7.setAbendParraf(source);
   }  
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea7.setAbendParraf(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition 0 for isDb2StatusOk()
	 *	@return  Returns true if isDb2StatusOk() is 0
	 */
   public boolean isDb2StatusOk() throws CFException {
      return work.isDb2StatusOk();
   }

	/**
	*  set values 0
	*/
   	public void setDb2StatusOkTrue()  throws CFException{  			
    	work.setDb2StatusOkTrue();
   	}
	/**
	 *	Returns the value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public long getAbendSqlcode() throws CFException {
   		return abendLinea6.getAbendSqlcode();
	}

    /**
	 *	Returns the String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeActualString() {
		return abendLinea6.getAbendSqlcodeActualString();
	}

	/**
	 *	Returns String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeString() throws CFException {
	     return String.valueOf(abendLinea6.getAbendSqlcodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendSqlcodeIsNumeric()  throws CFException{
	    return abendLinea6.abendSqlcodeIsNumeric();
	}

	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param number
	 */
	public void setAbendSqlcode(long number)  throws CFException{
		abendLinea6.setAbendSqlcode(number);
	}
	

	
	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcode(char[] value)  throws CFException {
		abendLinea6.setAbendSqlcode(value);
	}
	
	/**
	 * 	Update AbendSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcodeString(char[] value)  throws CFException{
		abendLinea6.setAbendSqlcode(value);
	}	

	/**
	 *	Returns the value of abendTabla
	 *	@return abendTabla
	 */
   public char[] getAbendTabla() throws CFException  {              
   		return abendLinea6.getAbendTabla();
   }

  
	/**
	*  set variable abendTabla
	*  @param value
	**/
   public void setAbendTabla(char[] value) throws CFException {
      abendLinea6.setAbendTabla(value);
   } 

     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex) throws CFException {
      abendLinea6.setAbendTabla(source, sourceIndex);
   	
   }
   
   public void setAbendTabla(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendTabla with another Field
	 *	@param value
	 */
   public void setAbendTabla(Field source) {
      abendLinea6.setAbendTabla(source);
   }  
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendLinea6.setAbendTabla(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += sqlca.hashCode();
        str += abendLinea7.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseCurGe18OutCtx clone() {
        CloseCurGe18OutCtx cloneObj = new CloseCurGe18OutCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseCurGe18OutCtx getCloseCurGe18OutCtx() {
            return new CloseCurGe18OutCtx();
    }
     public class ProcesoOutCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Test condition "N" for isSwNoInfoSalida()
	 *	@return  Returns true if isSwNoInfoSalida() is "N"
	 */
   public boolean isSwNoInfoSalida() throws CFException {
      return work.isSwNoInfoSalida();
   }

	/**
	*  set values "N"
	*/
   	public void setSwNoInfoSalidaTrue()  throws CFException{  			
    	work.setSwNoInfoSalidaTrue();
   	}

        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
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

    public ProcesoOutCtx clone() {
        ProcesoOutCtx cloneObj = new ProcesoOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcesoOutCtx getProcesoOutCtx() {
            return new ProcesoOutCtx();
    }
     public class InformarSalidaInCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of ge1801Fechabaja
	 *	@return ge1801Fechabaja
	 */
   public char[] getGe1801Fechabaja() throws CFException  {              
   		return work.getGe1801Fechabaja();
   }

  
	/**
	*  set variable ge1801Fechabaja
	*  @param value
	**/
   public void setGe1801Fechabaja(char[] value) throws CFException {
      work.setGe1801Fechabaja(value);
   } 

	/**
	 *	Returns the value of ge1801Codentid
	 *	@return ge1801Codentid
	 */
   public char[] getGe1801Codentid() throws CFException  {              
   		return work.getGe1801Codentid();
   }

  
	/**
	*  set variable ge1801Codentid
	*  @param value
	**/
   public void setGe1801Codentid(char[] value) throws CFException {
      work.setGe1801Codentid(value);
   } 

	/**
	 *	Returns the value of ge1801Numpgescap
	 *	@return ge1801Numpgescap
	 */
	public int getGe1801Numpgescap() throws CFException {        
   		return work.getGe1801Numpgescap();
	}
	
	/**
	 * 	Update Ge1801Numpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numpgescap(int number)  throws CFException{
		work.setGe1801Numpgescap(number);
	}


	public void setGe1801Numpgescap(long number)  throws CFException{
		work.setGe1801Numpgescap((int)number);
	}


public int getGe1801Numcartera() throws CFException {  
        return work.getGe1801Numcartera();
}
	/**
	 * 	Update Ge1801Numcartera with the passed value
	 *	@param number
	 */
	public void setGe1801Numcartera(int number)  throws CFException{
		work.setGe1801Numcartera(number);
	}


	public void setGe1801Numcartera(long number)  throws CFException{
	    work.setGe1801Numcartera(number);
	}
	

public short getGe1801Ofigestora() throws CFException {  
        return work.getGe1801Ofigestora();
}
	/**
	 * 	Update Ge1801Ofigestora with the passed value
	 *	@param number
	 */
	public void setGe1801Ofigestora(short number)  throws CFException{
		work.setGe1801Ofigestora(number);
	}

	public void setGe1801Ofigestora(int number)  throws CFException{
	   work.setGe1801Ofigestora(number);
	}
	public void setGe1801Ofigestora(long number)  throws CFException {
	    work.setGe1801Ofigestora(number);
	}
	


	/**
	 *	Returns the value of ge1801Numpresamb
	 *	@return ge1801Numpresamb
	 */
	public int getGe1801Numpresamb() throws CFException {        
   		return work.getGe1801Numpresamb();
	}
	
	/**
	 * 	Update Ge1801Numpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numpresamb(int number)  throws CFException{
		work.setGe1801Numpresamb(number);
	}


	public void setGe1801Numpresamb(long number)  throws CFException{
		work.setGe1801Numpresamb((int)number);
	}


public long getGe1801Codcontrat() throws CFException {  
        return work.getGe1801Codcontrat();
}
	/**
	 * 	Update Ge1801Codcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801Codcontrat(long number)  throws CFException{
		work.setGe1801Codcontrat(number);
	}



	/**
	 *	Returns the value of ge1801Idepsig
	 *	@return ge1801Idepsig
	 */
   public char[] getGe1801Idepsig() throws CFException  {              
   		return work.getGe1801Idepsig();
   }

  
	/**
	*  set variable ge1801Idepsig
	*  @param value
	**/
   public void setGe1801Idepsig(char[] value) throws CFException {
      work.setGe1801Idepsig(value);
   } 

	/**
	 *	Returns the value of ge1801Tipproduct
	 *	@return ge1801Tipproduct
	 */
   public char[] getGe1801Tipproduct() throws CFException  {              
   		return work.getGe1801Tipproduct();
   }

  
	/**
	*  set variable ge1801Tipproduct
	*  @param value
	**/
   public void setGe1801Tipproduct(char[] value) throws CFException {
      work.setGe1801Tipproduct(value);
   } 

	/**
	 *	Returns the value of ge1801Fecciecurso
	 *	@return ge1801Fecciecurso
	 */
   public char[] getGe1801Fecciecurso() throws CFException  {              
   		return work.getGe1801Fecciecurso();
   }

  
	/**
	*  set variable ge1801Fecciecurso
	*  @param value
	**/
   public void setGe1801Fecciecurso(char[] value) throws CFException {
      work.setGe1801Fecciecurso(value);
   } 

	/**
	 *	Returns the value of ge1801Resambito
	 *	@return ge1801Resambito
	 */
   public char[] getGe1801Resambito() throws CFException  {              
   		return work.getGe1801Resambito();
   }

  
	/**
	*  set variable ge1801Resambito
	*  @param value
	**/
   public void setGe1801Resambito(char[] value) throws CFException {
      work.setGe1801Resambito(value);
   } 

	/**
	 *	Returns the value of ge1801Numgescap
	 *	@return ge1801Numgescap
	 */
	public int getGe1801Numgescap() throws CFException {        
   		return work.getGe1801Numgescap();
	}
	
	/**
	 * 	Update Ge1801Numgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numgescap(int number)  throws CFException{
		work.setGe1801Numgescap(number);
	}


	public void setGe1801Numgescap(long number)  throws CFException{
		work.setGe1801Numgescap((int)number);
	}


	/**
	 *	Returns the value of ge1801Numpersona
	 *	@return ge1801Numpersona
	 */
	public int getGe1801Numpersona() throws CFException {        
   		return work.getGe1801Numpersona();
	}
	
	/**
	 * 	Update Ge1801Numpersona with the passed value
	 *	@param number
	 */
	public void setGe1801Numpersona(int number)  throws CFException{
		work.setGe1801Numpersona(number);
	}


	public void setGe1801Numpersona(long number)  throws CFException{
		work.setGe1801Numpersona((int)number);
	}


	/**
	 *	Returns the value of ge1801Codcarrie
	 *	@return ge1801Codcarrie
	 */
   public char[] getGe1801Codcarrie() throws CFException  {              
   		return work.getGe1801Codcarrie();
   }

  
	/**
	*  set variable ge1801Codcarrie
	*  @param value
	**/
   public void setGe1801Codcarrie(char[] value) throws CFException {
      work.setGe1801Codcarrie(value);
   } 

	/**
	 *	Returns the value of ge1801Cengescapt
	 *	@return ge1801Cengescapt
	 */
   public char[] getGe1801Cengescapt() throws CFException  {              
   		return work.getGe1801Cengescapt();
   }

  
	/**
	*  set variable ge1801Cengescapt
	*  @param value
	**/
   public void setGe1801Cengescapt(char[] value) throws CFException {
      work.setGe1801Cengescapt(value);
   } 

	/**
	 *	Returns the value of ge1801Codnodo
	 *	@return ge1801Codnodo
	 */
   public char[] getGe1801Codnodo() throws CFException  {              
   		return work.getGe1801Codnodo();
   }

  
	/**
	*  set variable ge1801Codnodo
	*  @param value
	**/
   public void setGe1801Codnodo(char[] value) throws CFException {
      work.setGe1801Codnodo(value);
   } 

	/**
	 *	Returns the value of ge1801Fechaalta
	 *	@return ge1801Fechaalta
	 */
   public char[] getGe1801Fechaalta() throws CFException  {              
   		return work.getGe1801Fechaalta();
   }

  
	/**
	*  set variable ge1801Fechaalta
	*  @param value
	**/
   public void setGe1801Fechaalta(char[] value) throws CFException {
      work.setGe1801Fechaalta(value);
   } 

	/**
	 *	Returns the value of ge1801Numpesprie
	 *	@return ge1801Numpesprie
	 */
	public int getGe1801Numpesprie() throws CFException {        
   		return work.getGe1801Numpesprie();
	}
	
	/**
	 * 	Update Ge1801Numpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801Numpesprie(int number)  throws CFException{
		work.setGe1801Numpesprie(number);
	}


	public void setGe1801Numpesprie(long number)  throws CFException{
		work.setGe1801Numpesprie((int)number);
	}


	/**
	 *	Returns the value of ge1801Codcartera
	 *	@return ge1801Codcartera
	 */
   public char[] getGe1801Codcartera() throws CFException  {              
   		return work.getGe1801Codcartera();
   }

  
	/**
	*  set variable ge1801Codcartera
	*  @param value
	**/
   public void setGe1801Codcartera(char[] value) throws CFException {
      work.setGe1801Codcartera(value);
   } 

	/**
	 *	Returns the value of ge1801Numresamb
	 *	@return ge1801Numresamb
	 */
	public int getGe1801Numresamb() throws CFException {        
   		return work.getGe1801Numresamb();
	}
	
	/**
	 * 	Update Ge1801Numresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numresamb(int number)  throws CFException{
		work.setGe1801Numresamb(number);
	}


	public void setGe1801Numresamb(long number)  throws CFException{
		work.setGe1801Numresamb((int)number);
	}



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public InformarSalidaOutCtx getInformarSalidaOutCtx() {
            return new InformarSalidaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InformarSalidaInCtx clone() {
        InformarSalidaInCtx cloneObj = new InformarSalidaInCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InformarSalidaInCtx getInformarSalidaInCtx() {
            return new InformarSalidaInCtx();
    }
     public class InformarSalidaOutCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of ge1801Fechabaja
	 *	@return ge1801Fechabaja
	 */
   public char[] getGe1801Fechabaja() throws CFException  {              
   		return work.getGe1801Fechabaja();
   }

  
	/**
	*  set variable ge1801Fechabaja
	*  @param value
	**/
   public void setGe1801Fechabaja(char[] value) throws CFException {
      work.setGe1801Fechabaja(value);
   } 

	/**
	 *	Returns the value of ge0018fCodcartera
	 *	@return ge0018fCodcartera
	 */
   public char[] getGe0018fCodcartera() throws CFException  {              
   		return ge0018f.getGe0018fCodcartera();
   }

  
	/**
	*  set variable ge0018fCodcartera
	*  @param value
	**/
   public void setGe0018fCodcartera(char[] value) throws CFException {
      ge0018f.setGe0018fCodcartera(value);
   } 

     /**
	 * 	Update Ge0018fCodcartera 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodcartera(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fCodcartera(source, sourceIndex);
   	
   }
   
   public void setGe0018fCodcartera(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fCodcartera(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcartera(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodcartera(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fCodcartera with another Field
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source) {
      ge0018f.setGe0018fCodcartera(source);
   }  
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fCodcartera(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodcartera(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Codentid
	 *	@return ge1801Codentid
	 */
   public char[] getGe1801Codentid() throws CFException  {              
   		return work.getGe1801Codentid();
   }

  
	/**
	*  set variable ge1801Codentid
	*  @param value
	**/
   public void setGe1801Codentid(char[] value) throws CFException {
      work.setGe1801Codentid(value);
   } 

	/**
	 *	Returns the value of ge0018fFechaalta
	 *	@return ge0018fFechaalta
	 */
   public char[] getGe0018fFechaalta() throws CFException  {              
   		return ge0018f.getGe0018fFechaalta();
   }

  
	/**
	*  set variable ge0018fFechaalta
	*  @param value
	**/
   public void setGe0018fFechaalta(char[] value) throws CFException {
      ge0018f.setGe0018fFechaalta(value);
   } 

     /**
	 * 	Update Ge0018fFechaalta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFechaalta(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fFechaalta(source, sourceIndex);
   	
   }
   
   public void setGe0018fFechaalta(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fFechaalta(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechaalta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFechaalta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fFechaalta with another Field
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source) {
      ge0018f.setGe0018fFechaalta(source);
   }  
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fFechaalta(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFechaalta(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Numpgescap
	 *	@return ge1801Numpgescap
	 */
	public int getGe1801Numpgescap() throws CFException {        
   		return work.getGe1801Numpgescap();
	}
	
	/**
	 * 	Update Ge1801Numpgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numpgescap(int number)  throws CFException{
		work.setGe1801Numpgescap(number);
	}


	public void setGe1801Numpgescap(long number)  throws CFException{
		work.setGe1801Numpgescap((int)number);
	}


public int getGe1801Numcartera() throws CFException {  
        return work.getGe1801Numcartera();
}
	/**
	 * 	Update Ge1801Numcartera with the passed value
	 *	@param number
	 */
	public void setGe1801Numcartera(int number)  throws CFException{
		work.setGe1801Numcartera(number);
	}


	public void setGe1801Numcartera(long number)  throws CFException{
	    work.setGe1801Numcartera(number);
	}
	

public short getGe1801Ofigestora() throws CFException {  
        return work.getGe1801Ofigestora();
}
	/**
	 * 	Update Ge1801Ofigestora with the passed value
	 *	@param number
	 */
	public void setGe1801Ofigestora(short number)  throws CFException{
		work.setGe1801Ofigestora(number);
	}

	public void setGe1801Ofigestora(int number)  throws CFException{
	   work.setGe1801Ofigestora(number);
	}
	public void setGe1801Ofigestora(long number)  throws CFException {
	    work.setGe1801Ofigestora(number);
	}
	


	/**
	 *	Returns the value of ge1801Numpresamb
	 *	@return ge1801Numpresamb
	 */
	public int getGe1801Numpresamb() throws CFException {        
   		return work.getGe1801Numpresamb();
	}
	
	/**
	 * 	Update Ge1801Numpresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numpresamb(int number)  throws CFException{
		work.setGe1801Numpresamb(number);
	}


	public void setGe1801Numpresamb(long number)  throws CFException{
		work.setGe1801Numpresamb((int)number);
	}


	/**
	 *	Returns the value of ge0018fNumcartera
	 *	@return ge0018fNumcartera
	 */
	public long getGe0018fNumcartera() throws CFException {
   		return ge0018f.getGe0018fNumcartera();
	}


	/**
	 *	Returns String value of ge0018fNumcartera
	 *	@return ge0018fNumcartera
	 */
	public char[]  getGe0018fNumcarteraString() throws CFException {
	     return String.valueOf(ge0018f.getGe0018fNumcarteraString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ge0018fNumcarteraIsNumeric()  throws CFException{
	    return ge0018f.ge0018fNumcarteraIsNumeric();
	}

	/**
	 * 	Update Ge0018fNumcartera with the passed value
	 *	@param number
	 */
	public void setGe0018fNumcartera(long number)  throws CFException{
		ge0018f.setGe0018fNumcartera(number);
	}
	

	
	/**
	 * 	Update Ge0018fNumcartera with the passed value
	 *	@param value (String or char[])
	 */
	public void setGe0018fNumcartera(char[] value)  throws CFException {
		ge0018f.setGe0018fNumcartera(value);
	}
	
	/**
	 * 	Update Ge0018fNumcartera with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGe0018fNumcarteraString(char[] value)  throws CFException{
		ge0018f.setGe0018fNumcartera(value);
	}	

public long getGe1801Codcontrat() throws CFException {  
        return work.getGe1801Codcontrat();
}
	/**
	 * 	Update Ge1801Codcontrat with the passed value
	 *	@param number
	 */
	public void setGe1801Codcontrat(long number)  throws CFException{
		work.setGe1801Codcontrat(number);
	}



	/**
	 *	Returns the value of ge0018fNumgescap
	 *	@return ge0018fNumgescap
	 */
	public int getGe0018fNumgescap() throws CFException {        
   		return ge0018f.getGe0018fNumgescap();
	}
	
	/**
	 * 	Update Ge0018fNumgescap with the passed value
	 *	@param number
	 */
	public void setGe0018fNumgescap(int number)  throws CFException{
		ge0018f.setGe0018fNumgescap(number);
	}


	public void setGe0018fNumgescap(long number)  throws CFException{
		ge0018f.setGe0018fNumgescap((int)number);
	}


	/**
	 *	Returns the value of ge0018fIdepsig
	 *	@return ge0018fIdepsig
	 */
   public char[] getGe0018fIdepsig() throws CFException  {              
   		return ge0018f.getGe0018fIdepsig();
   }

  
	/**
	*  set variable ge0018fIdepsig
	*  @param value
	**/
   public void setGe0018fIdepsig(char[] value) throws CFException {
      ge0018f.setGe0018fIdepsig(value);
   } 

     /**
	 * 	Update Ge0018fIdepsig 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fIdepsig(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fIdepsig(source, sourceIndex);
   	
   }
   
   public void setGe0018fIdepsig(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fIdepsig(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fIdepsig(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fIdepsig(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fIdepsig with another Field
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source) {
      ge0018f.setGe0018fIdepsig(source);
   }  
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fIdepsig(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fIdepsig(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Resambito
	 *	@return ge1801Resambito
	 */
   public char[] getGe1801Resambito() throws CFException  {              
   		return work.getGe1801Resambito();
   }

  
	/**
	*  set variable ge1801Resambito
	*  @param value
	**/
   public void setGe1801Resambito(char[] value) throws CFException {
      work.setGe1801Resambito(value);
   } 

	/**
	 *	Returns the value of ge0018fCengescapt
	 *	@return ge0018fCengescapt
	 */
   public char[] getGe0018fCengescapt() throws CFException  {              
   		return ge0018f.getGe0018fCengescapt();
   }

  
	/**
	*  set variable ge0018fCengescapt
	*  @param value
	**/
   public void setGe0018fCengescapt(char[] value) throws CFException {
      ge0018f.setGe0018fCengescapt(value);
   } 

     /**
	 * 	Update Ge0018fCengescapt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCengescapt(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fCengescapt(source, sourceIndex);
   	
   }
   
   public void setGe0018fCengescapt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fCengescapt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCengescapt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCengescapt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fCengescapt with another Field
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source) {
      ge0018f.setGe0018fCengescapt(source);
   }  
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fCengescapt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCengescapt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Numpersona
	 *	@return ge1801Numpersona
	 */
	public int getGe1801Numpersona() throws CFException {        
   		return work.getGe1801Numpersona();
	}
	
	/**
	 * 	Update Ge1801Numpersona with the passed value
	 *	@param number
	 */
	public void setGe1801Numpersona(int number)  throws CFException{
		work.setGe1801Numpersona(number);
	}


	public void setGe1801Numpersona(long number)  throws CFException{
		work.setGe1801Numpersona((int)number);
	}


	/**
	 *	Returns the value of ge1801Codcarrie
	 *	@return ge1801Codcarrie
	 */
   public char[] getGe1801Codcarrie() throws CFException  {              
   		return work.getGe1801Codcarrie();
   }

  
	/**
	*  set variable ge1801Codcarrie
	*  @param value
	**/
   public void setGe1801Codcarrie(char[] value) throws CFException {
      work.setGe1801Codcarrie(value);
   } 

	/**
	 *	Returns the value of ge0018fFechabaja
	 *	@return ge0018fFechabaja
	 */
   public char[] getGe0018fFechabaja() throws CFException  {              
   		return ge0018f.getGe0018fFechabaja();
   }

  
	/**
	*  set variable ge0018fFechabaja
	*  @param value
	**/
   public void setGe0018fFechabaja(char[] value) throws CFException {
      ge0018f.setGe0018fFechabaja(value);
   } 

     /**
	 * 	Update Ge0018fFechabaja 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFechabaja(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fFechabaja(source, sourceIndex);
   	
   }
   
   public void setGe0018fFechabaja(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fFechabaja(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechabaja(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFechabaja(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fFechabaja with another Field
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source) {
      ge0018f.setGe0018fFechabaja(source);
   }  
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fFechabaja(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFechabaja(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge0018fCodcarrie
	 *	@return ge0018fCodcarrie
	 */
   public char[] getGe0018fCodcarrie() throws CFException  {              
   		return ge0018f.getGe0018fCodcarrie();
   }

  
	/**
	*  set variable ge0018fCodcarrie
	*  @param value
	**/
   public void setGe0018fCodcarrie(char[] value) throws CFException {
      ge0018f.setGe0018fCodcarrie(value);
   } 

     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodcarrie(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fCodcarrie(source, sourceIndex);
   	
   }
   
   public void setGe0018fCodcarrie(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fCodcarrie(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcarrie(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodcarrie(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fCodcarrie with another Field
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source) {
      ge0018f.setGe0018fCodcarrie(source);
   }  
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fCodcarrie(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodcarrie(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge0018fCodnodo
	 *	@return ge0018fCodnodo
	 */
   public char[] getGe0018fCodnodo() throws CFException  {              
   		return ge0018f.getGe0018fCodnodo();
   }

  
	/**
	*  set variable ge0018fCodnodo
	*  @param value
	**/
   public void setGe0018fCodnodo(char[] value) throws CFException {
      ge0018f.setGe0018fCodnodo(value);
   } 

     /**
	 * 	Update Ge0018fCodnodo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodnodo(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fCodnodo(source, sourceIndex);
   	
   }
   
   public void setGe0018fCodnodo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fCodnodo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodnodo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodnodo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fCodnodo with another Field
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source) {
      ge0018f.setGe0018fCodnodo(source);
   }  
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fCodnodo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodnodo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Cengescapt
	 *	@return ge1801Cengescapt
	 */
   public char[] getGe1801Cengescapt() throws CFException  {              
   		return work.getGe1801Cengescapt();
   }

  
	/**
	*  set variable ge1801Cengescapt
	*  @param value
	**/
   public void setGe1801Cengescapt(char[] value) throws CFException {
      work.setGe1801Cengescapt(value);
   } 

	/**
	 *	Returns the value of ge0018fTipproduct
	 *	@return ge0018fTipproduct
	 */
   public char[] getGe0018fTipproduct() throws CFException  {              
   		return ge0018f.getGe0018fTipproduct();
   }

  
	/**
	*  set variable ge0018fTipproduct
	*  @param value
	**/
   public void setGe0018fTipproduct(char[] value) throws CFException {
      ge0018f.setGe0018fTipproduct(value);
   } 

     /**
	 * 	Update Ge0018fTipproduct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fTipproduct(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fTipproduct(source, sourceIndex);
   	
   }
   
   public void setGe0018fTipproduct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fTipproduct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fTipproduct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fTipproduct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fTipproduct with another Field
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source) {
      ge0018f.setGe0018fTipproduct(source);
   }  
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fTipproduct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fTipproduct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Fechaalta
	 *	@return ge1801Fechaalta
	 */
   public char[] getGe1801Fechaalta() throws CFException  {              
   		return work.getGe1801Fechaalta();
   }

  
	/**
	*  set variable ge1801Fechaalta
	*  @param value
	**/
   public void setGe1801Fechaalta(char[] value) throws CFException {
      work.setGe1801Fechaalta(value);
   } 

	/**
	 *	Returns the value of ge1801Numpesprie
	 *	@return ge1801Numpesprie
	 */
	public int getGe1801Numpesprie() throws CFException {        
   		return work.getGe1801Numpesprie();
	}
	
	/**
	 * 	Update Ge1801Numpesprie with the passed value
	 *	@param number
	 */
	public void setGe1801Numpesprie(int number)  throws CFException{
		work.setGe1801Numpesprie(number);
	}


	public void setGe1801Numpesprie(long number)  throws CFException{
		work.setGe1801Numpesprie((int)number);
	}


	/**
	 *	Returns the value of ge1801Codcartera
	 *	@return ge1801Codcartera
	 */
   public char[] getGe1801Codcartera() throws CFException  {              
   		return work.getGe1801Codcartera();
   }

  
	/**
	*  set variable ge1801Codcartera
	*  @param value
	**/
   public void setGe1801Codcartera(char[] value) throws CFException {
      work.setGe1801Codcartera(value);
   } 

public int getGe0018fNumpgescap() throws CFException {  
        return ge0018f.getGe0018fNumpgescap();
}
	/**
	 * 	Update Ge0018fNumpgescap with the passed value
	 *	@param number
	 */
	public void setGe0018fNumpgescap(int number)  throws CFException{
		ge0018f.setGe0018fNumpgescap(number);
	}


	public void setGe0018fNumpgescap(long number)  throws CFException{
	    ge0018f.setGe0018fNumpgescap(number);
	}
	

public long getGe0018fCodcontrat() throws CFException {  
        return ge0018f.getGe0018fCodcontrat();
}
	/**
	 * 	Update Ge0018fCodcontrat with the passed value
	 *	@param number
	 */
	public void setGe0018fCodcontrat(long number)  throws CFException{
		ge0018f.setGe0018fCodcontrat(number);
	}



public int getGe0018fNumpesprie() throws CFException {  
        return ge0018f.getGe0018fNumpesprie();
}
	/**
	 * 	Update Ge0018fNumpesprie with the passed value
	 *	@param number
	 */
	public void setGe0018fNumpesprie(int number)  throws CFException{
		ge0018f.setGe0018fNumpesprie(number);
	}


	public void setGe0018fNumpesprie(long number)  throws CFException{
	    ge0018f.setGe0018fNumpesprie(number);
	}
	

	/**
	 *	Returns the value of ge0018fCodentid
	 *	@return ge0018fCodentid
	 */
   public char[] getGe0018fCodentid() throws CFException  {              
   		return ge0018f.getGe0018fCodentid();
   }

  
	/**
	*  set variable ge0018fCodentid
	*  @param value
	**/
   public void setGe0018fCodentid(char[] value) throws CFException {
      ge0018f.setGe0018fCodentid(value);
   } 

     /**
	 * 	Update Ge0018fCodentid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodentid(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fCodentid(source, sourceIndex);
   	
   }
   
   public void setGe0018fCodentid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fCodentid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodentid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodentid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fCodentid with another Field
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source) {
      ge0018f.setGe0018fCodentid(source);
   }  
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fCodentid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fCodentid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Idepsig
	 *	@return ge1801Idepsig
	 */
   public char[] getGe1801Idepsig() throws CFException  {              
   		return work.getGe1801Idepsig();
   }

  
	/**
	*  set variable ge1801Idepsig
	*  @param value
	**/
   public void setGe1801Idepsig(char[] value) throws CFException {
      work.setGe1801Idepsig(value);
   } 

	/**
	 *	Returns the value of ge1801Tipproduct
	 *	@return ge1801Tipproduct
	 */
   public char[] getGe1801Tipproduct() throws CFException  {              
   		return work.getGe1801Tipproduct();
   }

  
	/**
	*  set variable ge1801Tipproduct
	*  @param value
	**/
   public void setGe1801Tipproduct(char[] value) throws CFException {
      work.setGe1801Tipproduct(value);
   } 

	/**
	 *	Returns the value of ge1801Fecciecurso
	 *	@return ge1801Fecciecurso
	 */
   public char[] getGe1801Fecciecurso() throws CFException  {              
   		return work.getGe1801Fecciecurso();
   }

  
	/**
	*  set variable ge1801Fecciecurso
	*  @param value
	**/
   public void setGe1801Fecciecurso(char[] value) throws CFException {
      work.setGe1801Fecciecurso(value);
   } 

	/**
	 *	Returns the value of ge0018fOfigestora
	 *	@return ge0018fOfigestora
	 */
	public int getGe0018fOfigestora() throws CFException {
   		return ge0018f.getGe0018fOfigestora();
	}


	/**
	 *	Returns String value of ge0018fOfigestora
	 *	@return ge0018fOfigestora
	 */
	public char[]  getGe0018fOfigestoraString() throws CFException {
	     return String.valueOf(ge0018f.getGe0018fOfigestoraString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ge0018fOfigestoraIsNumeric()  throws CFException{
	    return ge0018f.ge0018fOfigestoraIsNumeric();
	}

	/**
	 * 	Update Ge0018fOfigestora with the passed value
	 *	@param number
	 */
	public void setGe0018fOfigestora(int number)  throws CFException{
		ge0018f.setGe0018fOfigestora(number);
	}
	

	public void setGe0018fOfigestora(long number)  throws CFException{
	    ge0018f.setGe0018fOfigestora(number);
	}
	
	
	/**
	 * 	Update Ge0018fOfigestora with the passed value
	 *	@param value (String or char[])
	 */
	public void setGe0018fOfigestora(char[] value)  throws CFException {
		ge0018f.setGe0018fOfigestora(value);
	}
	
	/**
	 * 	Update Ge0018fOfigestora with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGe0018fOfigestoraString(char[] value)  throws CFException{
		ge0018f.setGe0018fOfigestora(value);
	}	

	/**
	 *	Returns the value of ge0018fNumresamb
	 *	@return ge0018fNumresamb
	 */
	public int getGe0018fNumresamb() throws CFException {        
   		return ge0018f.getGe0018fNumresamb();
	}
	
	/**
	 * 	Update Ge0018fNumresamb with the passed value
	 *	@param number
	 */
	public void setGe0018fNumresamb(int number)  throws CFException{
		ge0018f.setGe0018fNumresamb(number);
	}


	public void setGe0018fNumresamb(long number)  throws CFException{
		ge0018f.setGe0018fNumresamb((int)number);
	}


public int getGe0018fNumpersona() throws CFException {  
        return ge0018f.getGe0018fNumpersona();
}
	/**
	 * 	Update Ge0018fNumpersona with the passed value
	 *	@param number
	 */
	public void setGe0018fNumpersona(int number)  throws CFException{
		ge0018f.setGe0018fNumpersona(number);
	}


	public void setGe0018fNumpersona(long number)  throws CFException{
	    ge0018f.setGe0018fNumpersona(number);
	}
	

	/**
	 *	Returns the value of ge1801Numgescap
	 *	@return ge1801Numgescap
	 */
	public int getGe1801Numgescap() throws CFException {        
   		return work.getGe1801Numgescap();
	}
	
	/**
	 * 	Update Ge1801Numgescap with the passed value
	 *	@param number
	 */
	public void setGe1801Numgescap(int number)  throws CFException{
		work.setGe1801Numgescap(number);
	}


	public void setGe1801Numgescap(long number)  throws CFException{
		work.setGe1801Numgescap((int)number);
	}


	/**
	 *	Returns the value of ge0018f
	 *	@return ge0018f
	 */   
	 public Ge0018f getGe0018f() {
   	return ge0018f;
   }


	/**
	 *	Returns the value of ge1801Codnodo
	 *	@return ge1801Codnodo
	 */
   public char[] getGe1801Codnodo() throws CFException  {              
   		return work.getGe1801Codnodo();
   }

  
	/**
	*  set variable ge1801Codnodo
	*  @param value
	**/
   public void setGe1801Codnodo(char[] value) throws CFException {
      work.setGe1801Codnodo(value);
   } 

public int getGe0018fNumpresamb() throws CFException {  
        return ge0018f.getGe0018fNumpresamb();
}
	/**
	 * 	Update Ge0018fNumpresamb with the passed value
	 *	@param number
	 */
	public void setGe0018fNumpresamb(int number)  throws CFException{
		ge0018f.setGe0018fNumpresamb(number);
	}


	public void setGe0018fNumpresamb(long number)  throws CFException{
	    ge0018f.setGe0018fNumpresamb(number);
	}
	

	/**
	 *	Returns the value of ge0018fFecciecurso
	 *	@return ge0018fFecciecurso
	 */
   public char[] getGe0018fFecciecurso() throws CFException  {              
   		return ge0018f.getGe0018fFecciecurso();
   }

  
	/**
	*  set variable ge0018fFecciecurso
	*  @param value
	**/
   public void setGe0018fFecciecurso(char[] value) throws CFException {
      ge0018f.setGe0018fFecciecurso(value);
   } 

     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFecciecurso(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fFecciecurso(source, sourceIndex);
   	
   }
   
   public void setGe0018fFecciecurso(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fFecciecurso(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFecciecurso(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFecciecurso(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fFecciecurso with another Field
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source) {
      ge0018f.setGe0018fFecciecurso(source);
   }  
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fFecciecurso(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fFecciecurso(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge0018fResambito
	 *	@return ge0018fResambito
	 */
   public char[] getGe0018fResambito() throws CFException  {              
   		return ge0018f.getGe0018fResambito();
   }

  
	/**
	*  set variable ge0018fResambito
	*  @param value
	**/
   public void setGe0018fResambito(char[] value) throws CFException {
      ge0018f.setGe0018fResambito(value);
   } 

     /**
	 * 	Update Ge0018fResambito 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fResambito(char[] source, int sourceIndex) throws CFException {
      ge0018f.setGe0018fResambito(source, sourceIndex);
   	
   }
   
   public void setGe0018fResambito(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ge0018f.setGe0018fResambito(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fResambito(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fResambito(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ge0018fResambito with another Field
	 *	@param value
	 */
   public void setGe0018fResambito(Field source) {
      ge0018f.setGe0018fResambito(source);
   }  
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fResambito(Field source, int sourceIndex,int sourceLen) {
      ge0018f.setGe0018fResambito(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fResambito(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ge0018f.setGe0018fResambito(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ge1801Numresamb
	 *	@return ge1801Numresamb
	 */
	public int getGe1801Numresamb() throws CFException {        
   		return work.getGe1801Numresamb();
	}
	
	/**
	 * 	Update Ge1801Numresamb with the passed value
	 *	@param number
	 */
	public void setGe1801Numresamb(int number)  throws CFException{
		work.setGe1801Numresamb(number);
	}


	public void setGe1801Numresamb(long number)  throws CFException{
		work.setGe1801Numresamb((int)number);
	}



        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InformarSalidaOutCtx clone() {
        InformarSalidaOutCtx cloneObj = new InformarSalidaOutCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InformarSalidaOutCtx getInformarSalidaOutCtx() {
            return new InformarSalidaOutCtx();
    }
     public class EscribirSalidaInCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Contadors contadors = Bm80022Ctx.this.getContadors();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of litWrite
	 *	@return litWrite
	 */
   public char[] getLitWrite() throws CFException  {              
   		return work.getLitWrite();
   }

  
	/**
	*  set variable litWrite
	*  @param value
	**/
   public void setLitWrite(char[] value) throws CFException {
      work.setLitWrite(value);
   } 

	/**
	 *	Returns the value of ge0018f
	 *	@return ge0018f
	 */   
	 public Ge0018f getGe0018f() {
   	return ge0018f;
   }


	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public long getGravatsGe0001w() throws CFException {
   		return contadors.getGravatsGe0001w();
	}


	/**
	 *	Returns String value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public char[]  getGravatsGe0001wString() throws CFException {
	     return String.valueOf(contadors.getGravatsGe0001wString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gravatsGe0001wIsNumeric()  throws CFException{
	    return contadors.gravatsGe0001wIsNumeric();
	}

	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param number
	 */
	public void setGravatsGe0001w(long number)  throws CFException{
		contadors.setGravatsGe0001w(number);
	}
	

	
	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001w(char[] value)  throws CFException {
		contadors.setGravatsGe0001w(value);
	}
	
	/**
	 * 	Update GravatsGe0001w with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001wString(char[] value)  throws CFException{
		contadors.setGravatsGe0001w(value);
	}	

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public EscribirSalidaOutCtx getEscribirSalidaOutCtx() {
            return new EscribirSalidaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += contadors.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EscribirSalidaInCtx clone() {
        EscribirSalidaInCtx cloneObj = new EscribirSalidaInCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EscribirSalidaInCtx getEscribirSalidaInCtx() {
            return new EscribirSalidaInCtx();
    }
     public class EscribirSalidaOutCtx implements Cloneable {
     Ge0018f ge0018f = Bm80022Ctx.this.getGe0018f();
     Contadors contadors = Bm80022Ctx.this.getContadors();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of litWrite
	 *	@return litWrite
	 */
   public char[] getLitWrite() throws CFException  {              
   		return work.getLitWrite();
   }

  
	/**
	*  set variable litWrite
	*  @param value
	**/
   public void setLitWrite(char[] value) throws CFException {
      work.setLitWrite(value);
   } 

	/**
	 *	Returns the value of acceso
	 *	@return acceso
	 */
   public char[] getAcceso() throws CFException  {              
   		return work.getAcceso();
   }

  
	/**
	*  set variable acceso
	*  @param value
	**/
   public void setAcceso(char[] value) throws CFException {
      work.setAcceso(value);
   } 

	/**
	 *	Returns the value of fichero
	 *	@return fichero
	 */
   public char[] getFichero() throws CFException  {              
   		return work.getFichero();
   }

  
	/**
	*  set variable fichero
	*  @param value
	**/
   public void setFichero(char[] value) throws CFException {
      work.setFichero(value);
   } 

	/**
	 *	Returns the value of fileStatus
	 *	@return fileStatus
	 */
   public char[] getFileStatus() throws CFException  {              
   		return work.getFileStatus();
   }

  
	/**
	*  set variable fileStatus
	*  @param value
	**/
   public void setFileStatus(char[] value) throws CFException {
      work.setFileStatus(value);
   } 

	/**
	 *	Returns the value of ge0018f
	 *	@return ge0018f
	 */   
	 public Ge0018f getGe0018f() {
   	return ge0018f;
   }


	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public long getGravatsGe0001w() throws CFException {
   		return contadors.getGravatsGe0001w();
	}


	/**
	 *	Returns String value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public char[]  getGravatsGe0001wString() throws CFException {
	     return String.valueOf(contadors.getGravatsGe0001wString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gravatsGe0001wIsNumeric()  throws CFException{
	    return contadors.gravatsGe0001wIsNumeric();
	}

	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param number
	 */
	public void setGravatsGe0001w(long number)  throws CFException{
		contadors.setGravatsGe0001w(number);
	}
	

	
	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001w(char[] value)  throws CFException {
		contadors.setGravatsGe0001w(value);
	}
	
	/**
	 * 	Update GravatsGe0001w with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001wString(char[] value)  throws CFException{
		contadors.setGravatsGe0001w(value);
	}	

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ge0018f.hashCode();
        str += contadors.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EscribirSalidaOutCtx clone() {
        EscribirSalidaOutCtx cloneObj = new EscribirSalidaOutCtx();
        cloneObj.ge0018f = new Ge0018f();
        cloneObj.ge0018f.set(ge0018f.getClonedField());
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EscribirSalidaOutCtx getEscribirSalidaOutCtx() {
            return new EscribirSalidaOutCtx();
    }
     public class CerrarFicherosInCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of litCerrar
	 *	@return litCerrar
	 */
   public char[] getLitCerrar() throws CFException  {              
   		return work.getLitCerrar();
   }

  
	/**
	*  set variable litCerrar
	*  @param value
	**/
   public void setLitCerrar(char[] value) throws CFException {
      work.setLitCerrar(value);
   } 

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public CerrarFicherosOutCtx getCerrarFicherosOutCtx() {
            return new CerrarFicherosOutCtx();
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

    public CerrarFicherosInCtx clone() {
        CerrarFicherosInCtx cloneObj = new CerrarFicherosInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CerrarFicherosInCtx getCerrarFicherosInCtx() {
            return new CerrarFicherosInCtx();
    }
     public class CerrarFicherosOutCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of acceso
	 *	@return acceso
	 */
   public char[] getAcceso() throws CFException  {              
   		return work.getAcceso();
   }

  
	/**
	*  set variable acceso
	*  @param value
	**/
   public void setAcceso(char[] value) throws CFException {
      work.setAcceso(value);
   } 

	/**
	 *	Returns the value of fichero
	 *	@return fichero
	 */
   public char[] getFichero() throws CFException  {              
   		return work.getFichero();
   }

  
	/**
	*  set variable fichero
	*  @param value
	**/
   public void setFichero(char[] value) throws CFException {
      work.setFichero(value);
   } 

	/**
	 *	Returns the value of fileStatus
	 *	@return fileStatus
	 */
   public char[] getFileStatus() throws CFException  {              
   		return work.getFileStatus();
   }

  
	/**
	*  set variable fileStatus
	*  @param value
	**/
   public void setFileStatus(char[] value) throws CFException {
      work.setFileStatus(value);
   } 

	/**
	 *	Returns the value of litGe0001w
	 *	@return litGe0001w
	 */
   public char[] getLitGe0001w() throws CFException  {              
   		return work.getLitGe0001w();
   }

  
	/**
	*  set variable litGe0001w
	*  @param value
	**/
   public void setLitGe0001w(char[] value) throws CFException {
      work.setLitGe0001w(value);
   } 

	/**
	 *	Returns the value of litCerrar
	 *	@return litCerrar
	 */
   public char[] getLitCerrar() throws CFException  {              
   		return work.getLitCerrar();
   }

  
	/**
	*  set variable litCerrar
	*  @param value
	**/
   public void setLitCerrar(char[] value) throws CFException {
      work.setLitCerrar(value);
   } 

	/**
	 *	Returns the value of fsGe0001w
	 *	@return fsGe0001w
	 */
   public char[] getFsGe0001w() throws CFException  {              
   		return work.getFsGe0001w();
   }

  
	/**
	*  set variable fsGe0001w
	*  @param value
	**/
   public void setFsGe0001w(char[] value) throws CFException {
      work.setFsGe0001w(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
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

    public CerrarFicherosOutCtx clone() {
        CerrarFicherosOutCtx cloneObj = new CerrarFicherosOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CerrarFicherosOutCtx getCerrarFicherosOutCtx() {
            return new CerrarFicherosOutCtx();
    }
     public class EstadisticasInCtx implements Cloneable {
     Contadors contadors = Bm80022Ctx.this.getContadors();

	/**
	 *	Returns the value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public long getLlegitsGe1801() throws CFException {
   		return contadors.getLlegitsGe1801();
	}


	/**
	 *	Returns String value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public char[]  getLlegitsGe1801String() throws CFException {
	     return String.valueOf(contadors.getLlegitsGe1801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean llegitsGe1801IsNumeric()  throws CFException{
	    return contadors.llegitsGe1801IsNumeric();
	}

	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param number
	 */
	public void setLlegitsGe1801(long number)  throws CFException{
		contadors.setLlegitsGe1801(number);
	}
	

	
	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801(char[] value)  throws CFException {
		contadors.setLlegitsGe1801(value);
	}
	
	/**
	 * 	Update LlegitsGe1801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801String(char[] value)  throws CFException{
		contadors.setLlegitsGe1801(value);
	}	

	/**
	 *	Returns the value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public long getGravatsGe0001w() throws CFException {
   		return contadors.getGravatsGe0001w();
	}


	/**
	 *	Returns String value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public char[]  getGravatsGe0001wString() throws CFException {
	     return String.valueOf(contadors.getGravatsGe0001wString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gravatsGe0001wIsNumeric()  throws CFException{
	    return contadors.gravatsGe0001wIsNumeric();
	}

	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param number
	 */
	public void setGravatsGe0001w(long number)  throws CFException{
		contadors.setGravatsGe0001w(number);
	}
	

	
	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001w(char[] value)  throws CFException {
		contadors.setGravatsGe0001w(value);
	}
	
	/**
	 * 	Update GravatsGe0001w with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001wString(char[] value)  throws CFException{
		contadors.setGravatsGe0001w(value);
	}	


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += contadors.hashCode();
       return str.hashCode();
    }

    public EstadisticasInCtx clone() {
        EstadisticasInCtx cloneObj = new EstadisticasInCtx();
        cloneObj.contadors = new Contadors();
        cloneObj.contadors.set(contadors.getClonedField());
        return cloneObj;
    }

    }

    public EstadisticasInCtx getEstadisticasInCtx() {
            return new EstadisticasInCtx();
    }
     public class TratarErrFicheroInCtx implements Cloneable {
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of acceso
	 *	@return acceso
	 */
   public char[] getAcceso() throws CFException  {              
   		return work.getAcceso();
   }

  
	/**
	*  set variable acceso
	*  @param value
	**/
   public void setAcceso(char[] value) throws CFException {
      work.setAcceso(value);
   } 

	/**
	 *	Returns the value of fichero
	 *	@return fichero
	 */
   public char[] getFichero() throws CFException  {              
   		return work.getFichero();
   }

  
	/**
	*  set variable fichero
	*  @param value
	**/
   public void setFichero(char[] value) throws CFException {
      work.setFichero(value);
   } 

	/**
	 *	Returns the value of fileStatus
	 *	@return fileStatus
	 */
   public char[] getFileStatus() throws CFException  {              
   		return work.getFileStatus();
   }

  
	/**
	*  set variable fileStatus
	*  @param value
	**/
   public void setFileStatus(char[] value) throws CFException {
      work.setFileStatus(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
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

    public TratarErrFicheroInCtx clone() {
        TratarErrFicheroInCtx cloneObj = new TratarErrFicheroInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TratarErrFicheroInCtx getTratarErrFicheroInCtx() {
            return new TratarErrFicheroInCtx();
    }
     public class AbortarOutCtx implements Cloneable {


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public AbortarOutCtx clone() {
        AbortarOutCtx cloneObj = new AbortarOutCtx();
        return cloneObj;
    }

    }

    public AbortarOutCtx getAbortarOutCtx() {
            return new AbortarOutCtx();
    }
     public class FinConErrorInCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     AbendLinea4 abendLinea4 = Bm80022Ctx.this.getAbendLinea4();
     Work work = Bm80022Ctx.this.getWork();

	/**
	 *	Returns the value of abendLinea5
	 *	@return abendLinea5
	 */
   public char[] getAbendLinea5() throws CFException  {              
   		return work.getAbendLinea5();
   }

  
	/**
	*  set variable abendLinea5
	*  @param value
	**/
   public void setAbendLinea5(char[] value) throws CFException {
      work.setAbendLinea5(value);
   } 

	/**
	 *	Returns the value of abendLinea10
	 *	@return abendLinea10
	 */
   public char[] getAbendLinea10() throws CFException  {              
   		return work.getAbendLinea10();
   }

  
	/**
	*  set variable abendLinea10
	*  @param value
	**/
   public void setAbendLinea10(char[] value) throws CFException {
      work.setAbendLinea10(value);
   } 

	/**
	 *	Returns the value of abendLinea6
	 *	@return abendLinea6
	 */   
	 public AbendLinea6 getAbendLinea6() {
   	return abendLinea6;
   }


	/**
	 *	Returns the value of abendLinea1
	 *	@return abendLinea1
	 */
   public char[] getAbendLinea1() throws CFException  {              
   		return work.getAbendLinea1();
   }

  
	/**
	*  set variable abendLinea1
	*  @param value
	**/
   public void setAbendLinea1(char[] value) throws CFException {
      work.setAbendLinea1(value);
   } 

	/**
	 *	Returns the value of abendLinea7
	 *	@return abendLinea7
	 */   
	 public AbendLinea7 getAbendLinea7() {
   	return abendLinea7;
   }


	/**
	 *	Returns the value of abendLinea8
	 *	@return abendLinea8
	 */
   public char[] getAbendLinea8() throws CFException  {              
   		return work.getAbendLinea8();
   }

  
	/**
	*  set variable abendLinea8
	*  @param value
	**/
   public void setAbendLinea8(char[] value) throws CFException {
      work.setAbendLinea8(value);
   } 

	/**
	 *	Returns the value of abendLinea2
	 *	@return abendLinea2
	 */
   public char[] getAbendLinea2() throws CFException  {              
   		return work.getAbendLinea2();
   }

  
	/**
	*  set variable abendLinea2
	*  @param value
	**/
   public void setAbendLinea2(char[] value) throws CFException {
      work.setAbendLinea2(value);
   } 

	/**
	 *	Returns the value of abendLinea3
	 *	@return abendLinea3
	 */
   public char[] getAbendLinea3() throws CFException  {              
   		return work.getAbendLinea3();
   }

  
	/**
	*  set variable abendLinea3
	*  @param value
	**/
   public void setAbendLinea3(char[] value) throws CFException {
      work.setAbendLinea3(value);
   } 

	/**
	 *	Returns the value of abendLinea4
	 *	@return abendLinea4
	 */   
	 public AbendLinea4 getAbendLinea4() {
   	return abendLinea4;
   }


	/**
	 *	Returns the value of abendLinea9
	 *	@return abendLinea9
	 */
   public char[] getAbendLinea9() throws CFException  {              
   		return work.getAbendLinea9();
   }

  
	/**
	*  set variable abendLinea9
	*  @param value
	**/
   public void setAbendLinea9(char[] value) throws CFException {
      work.setAbendLinea9(value);
   } 

	/**
	 *	Returns the value of abendLinea11
	 *	@return abendLinea11
	 */
   public char[] getAbendLinea11() throws CFException  {              
   		return work.getAbendLinea11();
   }

  
	/**
	*  set variable abendLinea11
	*  @param value
	**/
   public void setAbendLinea11(char[] value) throws CFException {
      work.setAbendLinea11(value);
   } 


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }

        public FinConErrorOutCtx getFinConErrorOutCtx() {
            return new FinConErrorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += abendLinea7.hashCode();
        str += abendLinea4.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FinConErrorInCtx clone() {
        FinConErrorInCtx cloneObj = new FinConErrorInCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.abendLinea4 = new AbendLinea4();
        cloneObj.abendLinea4.set(abendLinea4.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FinConErrorInCtx getFinConErrorInCtx() {
            return new FinConErrorInCtx();
    }
     public class FinConErrorOutCtx implements Cloneable {
     AbendLinea6 abendLinea6 = Bm80022Ctx.this.getAbendLinea6();
     AbendLinea7 abendLinea7 = Bm80022Ctx.this.getAbendLinea7();
     AbendLinea4 abendLinea4 = Bm80022Ctx.this.getAbendLinea4();
     Work work = Bm80022Ctx.this.getWork();


        public Bm80022Ctx getBm80022Ctx() {
            return Bm80022Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendLinea6.hashCode();
        str += abendLinea7.hashCode();
        str += abendLinea4.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FinConErrorOutCtx clone() {
        FinConErrorOutCtx cloneObj = new FinConErrorOutCtx();
        cloneObj.abendLinea6 = new AbendLinea6();
        cloneObj.abendLinea6.set(abendLinea6.getClonedField());
        cloneObj.abendLinea7 = new AbendLinea7();
        cloneObj.abendLinea7.set(abendLinea7.getClonedField());
        cloneObj.abendLinea4 = new AbendLinea4();
        cloneObj.abendLinea4.set(abendLinea4.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FinConErrorOutCtx getFinConErrorOutCtx() {
            return new FinConErrorOutCtx();
    }
}
