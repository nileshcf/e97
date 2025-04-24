package com.cloudframe.app.varchar1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.varchar1.dto.Vchar1FirstName;
import com.cloudframe.app.varchar1.dto.Vchar1NickName;
import com.cloudframe.app.varchar1.dto.Work;
import com.cloudframe.app.varchar1.dto.Sqlwarn;
import com.cloudframe.app.varchar1.dto.Vchar1Table;
import com.cloudframe.app.varchar1.dto.Sqlca;


@Context
public class Varchar1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Vchar1Table vchar1Table;
    Sqlca sqlca;
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


    public Vchar1Table getVchar1Table() {
        if (vchar1Table == null) {
            vchar1Table = new Vchar1Table();
        }

        return vchar1Table;
    }

    public void setVchar1Table(Vchar1Table vchar1Table) {
        this.vchar1Table = vchar1Table;
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
        str += vchar1Table.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Varchar1Ctx clone() {
        Varchar1Ctx cloneObj = new Varchar1Ctx();
        cloneObj.vchar1Table = new Vchar1Table();
        cloneObj.vchar1Table.set(vchar1Table.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainInCtx implements Cloneable {
     Vchar1Table vchar1Table = Varchar1Ctx.this.getVchar1Table();
     Sqlca sqlca = Varchar1Ctx.this.getSqlca();

	/**
	 *	Returns the value of vchar1NickName
	 *	@return vchar1NickName
	 */   
	 public Vchar1NickName getVchar1NickName() {
   	return vchar1Table.getVchar1NickName();
   }

   /**
	* 	Update Vchar1NickName with the passed value
	*	@param value
	*/
   public void setVchar1NickName(char[] value) throws CFException {
      vchar1Table.setVchar1NickName(value);
   }   

     /**
	 * 	Update Vchar1NickName 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickName(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	vchar1Table.setVchar1NickName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1NickName 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	vchar1Table.setVchar1NickName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Vchar1NickName with another Field
	 *	@param value
	 */
   public void setVchar1NickName(Field source) {
   	vchar1Table.setVchar1NickName(source);
   }  
   
     /**
	 * 	Update Vchar1NickName 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickName(Field source, int sourceIndex,int sourceLen) {
   	vchar1Table.setVchar1NickName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1NickName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	vchar1Table.setVchar1NickName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vchar1Table
	 *	@return vchar1Table
	 */   
	 public Vchar1Table getVchar1Table() {
   	return vchar1Table;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of vchar1FirstName
	 *	@return vchar1FirstName
	 */   
	 public Vchar1FirstName getVchar1FirstName() {
   	return vchar1Table.getVchar1FirstName();
   }

   /**
	* 	Update Vchar1FirstName with the passed value
	*	@param value
	*/
   public void setVchar1FirstName(char[] value) throws CFException {
      vchar1Table.setVchar1FirstName(value);
   }   

     /**
	 * 	Update Vchar1FirstName 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstName(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	vchar1Table.setVchar1FirstName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	vchar1Table.setVchar1FirstName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Vchar1FirstName with another Field
	 *	@param value
	 */
   public void setVchar1FirstName(Field source) {
   	vchar1Table.setVchar1FirstName(source);
   }  
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstName(Field source, int sourceIndex,int sourceLen) {
   	vchar1Table.setVchar1FirstName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1FirstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	vchar1Table.setVchar1FirstName(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


	/**
	 *	Returns the value of vchar1Id
	 *	@return vchar1Id
	 */
	public short getVchar1Id() throws CFException {        
   		return vchar1Table.getVchar1Id();
	}
	
	/**
	 * 	Update Vchar1Id with the passed value
	 *	@param number
	 */
	public void setVchar1Id(short number)  throws CFException{
		vchar1Table.setVchar1Id(number);
	}

	public void setVchar1Id(int number)  throws CFException{
		vchar1Table.setVchar1Id((short)number);
	}

	public void setVchar1Id(long number)  throws CFException{
		vchar1Table.setVchar1Id((short)number);
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


        public Varchar1Ctx getVarchar1Ctx() {
            return Varchar1Ctx.this;
        }

        public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vchar1Table.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.vchar1Table = new Vchar1Table();
        cloneObj.vchar1Table.set(vchar1Table.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     Vchar1Table vchar1Table = Varchar1Ctx.this.getVchar1Table();
     Sqlca sqlca = Varchar1Ctx.this.getSqlca();

	/**
	 *	Returns the value of vchar1FirstNameLen
	 *	@return vchar1FirstNameLen
	 */
	public short getVchar1FirstNameLen() throws CFException {        
   		return vchar1Table.getVchar1FirstName().getVchar1FirstNameLen();
	}
	
	/**
	 * 	Update Vchar1FirstNameLen with the passed value
	 *	@param number
	 */
	public void setVchar1FirstNameLen(short number)  throws CFException{
		vchar1Table.getVchar1FirstName().setVchar1FirstNameLen(number);
	}

	public void setVchar1FirstNameLen(int number)  throws CFException{
		vchar1Table.getVchar1FirstName().setVchar1FirstNameLen((short)number);
	}

	public void setVchar1FirstNameLen(long number)  throws CFException{
		vchar1Table.getVchar1FirstName().setVchar1FirstNameLen((short)number);
	}



	/**
	 *	Returns the value of vchar1Table
	 *	@return vchar1Table
	 */   
	 public Vchar1Table getVchar1Table() {
   	return vchar1Table;
   }


	/**
	 *	Returns the value of vchar1LastName
	 *	@return vchar1LastName
	 */
   public char[] getVchar1LastName() throws CFException  {              
   		return vchar1Table.getVchar1LastName();
   }

  
	/**
	*  set variable vchar1LastName
	*  @param value
	**/
   public void setVchar1LastName(char[] value) throws CFException {
      vchar1Table.setVchar1LastName(value);
   } 

     /**
	 * 	Update Vchar1LastName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1LastName(char[] source, int sourceIndex) throws CFException {
      vchar1Table.setVchar1LastName(source, sourceIndex);
   	
   }
   
   public void setVchar1LastName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vchar1Table.setVchar1LastName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1LastName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1LastName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.setVchar1LastName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Vchar1LastName with another Field
	 *	@param value
	 */
   public void setVchar1LastName(Field source) {
      vchar1Table.setVchar1LastName(source);
   }  
   
     /**
	 * 	Update Vchar1LastName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1LastName(Field source, int sourceIndex,int sourceLen) {
      vchar1Table.setVchar1LastName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Vchar1LastName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1LastName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.setVchar1LastName(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of vchar1NickNameLen
	 *	@return vchar1NickNameLen
	 */
	public short getVchar1NickNameLen() throws CFException {        
   		return vchar1Table.getVchar1NickName().getVchar1NickNameLen();
	}
	
	/**
	 * 	Update Vchar1NickNameLen with the passed value
	 *	@param number
	 */
	public void setVchar1NickNameLen(short number)  throws CFException{
		vchar1Table.getVchar1NickName().setVchar1NickNameLen(number);
	}

	public void setVchar1NickNameLen(int number)  throws CFException{
		vchar1Table.getVchar1NickName().setVchar1NickNameLen((short)number);
	}

	public void setVchar1NickNameLen(long number)  throws CFException{
		vchar1Table.getVchar1NickName().setVchar1NickNameLen((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of vchar1FirstNameData
	 *	@return vchar1FirstNameData
	 */
   public char[] getVchar1FirstNameData() throws CFException  {              
   		return vchar1Table.getVchar1FirstName().getVchar1FirstNameData();
   }

  
	/**
	*  set variable vchar1FirstNameData
	*  @param value
	**/
   public void setVchar1FirstNameData(char[] value) throws CFException {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(value);
   } 

     /**
	 * 	Update Vchar1FirstNameData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1FirstNameData(char[] source, int sourceIndex) throws CFException {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source, sourceIndex);
   	
   }
   
   public void setVchar1FirstNameData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstNameData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Vchar1FirstNameData with another Field
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source) {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source);
   }  
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source, int sourceIndex,int sourceLen) {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Vchar1FirstNameData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1FirstNameData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.getVchar1FirstName().setVchar1FirstNameData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vchar1NickNameData
	 *	@return vchar1NickNameData
	 */
   public char[] getVchar1NickNameData() throws CFException  {              
   		return vchar1Table.getVchar1NickName().getVchar1NickNameData();
   }

  
	/**
	*  set variable vchar1NickNameData
	*  @param value
	**/
   public void setVchar1NickNameData(char[] value) throws CFException {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(value);
   } 

     /**
	 * 	Update Vchar1NickNameData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVchar1NickNameData(char[] source, int sourceIndex) throws CFException {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source, sourceIndex);
   	
   }
   
   public void setVchar1NickNameData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickNameData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Vchar1NickNameData with another Field
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source) {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source);
   }  
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source, int sourceIndex,int sourceLen) {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Vchar1NickNameData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVchar1NickNameData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vchar1Table.getVchar1NickName().setVchar1NickNameData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Varchar1Ctx getVarchar1Ctx() {
            return Varchar1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += vchar1Table.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.vchar1Table = new Vchar1Table();
        cloneObj.vchar1Table.set(vchar1Table.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class HandleSqlcodeInCtx implements Cloneable {
     Sqlca sqlca = Varchar1Ctx.this.getSqlca();

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



        public Varchar1Ctx getVarchar1Ctx() {
            return Varchar1Ctx.this;
        }

        public HandleSqlcodeOutCtx getHandleSqlcodeOutCtx() {
            return new HandleSqlcodeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public HandleSqlcodeInCtx clone() {
        HandleSqlcodeInCtx cloneObj = new HandleSqlcodeInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public HandleSqlcodeInCtx getHandleSqlcodeInCtx() {
            return new HandleSqlcodeInCtx();
    }
     public class HandleSqlcodeOutCtx implements Cloneable {
     Sqlca sqlca = Varchar1Ctx.this.getSqlca();

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



        public Varchar1Ctx getVarchar1Ctx() {
            return Varchar1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public HandleSqlcodeOutCtx clone() {
        HandleSqlcodeOutCtx cloneObj = new HandleSqlcodeOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public HandleSqlcodeOutCtx getHandleSqlcodeOutCtx() {
            return new HandleSqlcodeOutCtx();
    }
}
