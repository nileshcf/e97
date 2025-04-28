package com.cloudframe.app.init4;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.init4.dto.Work;
import com.cloudframe.app.init4.dto.DataTable;


@Context
public class Init4Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DataTable dataTable;
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


    public DataTable getDataTable() {
        if (dataTable == null) {
            dataTable = new DataTable();
        }

        return dataTable;
    }

    public void setDataTable(DataTable dataTable) {
        this.dataTable = dataTable;
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
        str += dataTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Init4Ctx clone() {
        Init4Ctx cloneObj = new Init4Ctx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     DataTable dataTable = Init4Ctx.this.getDataTable();
     Work work = Init4Ctx.this.getWork();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	


        public Init4Ctx getInit4Ctx() {
            return Init4Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     DataTable dataTable = Init4Ctx.this.getDataTable();
     Work work = Init4Ctx.this.getWork();

	/**
	 *	Returns the value of dataTable
	 *	@return dataTable
	 */   
	 public DataTable getDataTable() {
   	return dataTable;
   }


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of smallint
	 *	@return smallint
	 */
	public int getSmallint(int index) throws CFException {        
   		return dataTable.getDataTableArray1(index).getSmallint();
	}
	
	/**
	 * 	Update Smallint with the passed value
	 *	@param number
	 */
	public void setSmallint(int index,int number)  throws CFException{
		dataTable.getDataTableArray1(index).setSmallint(number);
	}


	public void setSmallint(int index,long number)  throws CFException{
		dataTable.getDataTableArray1(index).setSmallint((int)number);
	}


	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public int getDispNum(int index) throws CFException {
   		return dataTable.getDataTableArray1(index).getDispNum();
	}


	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString(int index) throws CFException {
	     return String.valueOf(dataTable.getDataTableArray1(index).getDispNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric(int index)  throws CFException{
	    return dataTable.getDataTableArray1(index - 1).dispNumIsNumeric();
	}

	/**
	 * 	Update DispNum with the passed value
	 *	@param number
	 */
	public void setDispNum(int index,int number)  throws CFException{
		dataTable.getDataTableArray1(index).setDispNum(number);
	}
	

	public void setDispNum(int index,long number)  throws CFException{
	    dataTable.getDataTableArray1(index).setDispNum(number);
	}
	
	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(int index,char[] value)  throws CFException {
		dataTable.getDataTableArray1(index).setDispNum(value);
	}
	
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(int index,char[] value)  throws CFException{
		dataTable.getDataTableArray1(index).setDispNum(value);
	}	

	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs(int index) throws CFException  {              
   		return dataTable.getDataTableArray1(index).getCharWs();
   }

  
	/**
	*  set variable charWs
	*  @param value
	**/
   public void setCharWs(int index,char[] value) throws CFException {
      dataTable.getDataTableArray1(index).setCharWs(value);
   } 

     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharWs(int index,char[] source, int sourceIndex) throws CFException {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex);
   	
   }
   
   public void setCharWs(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CharWs with another Field
	 *	@param value
	 */
   public void setCharWs(int index,Field source) {
      dataTable.getDataTableArray1(index).setCharWs(source);
   }  
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharWs(int index,Field source, int sourceIndex,int sourceLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Init4Ctx getInit4Ctx() {
            return Init4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class PrintInCtx implements Cloneable {
     DataTable dataTable = Init4Ctx.this.getDataTable();
     Work work = Init4Ctx.this.getWork();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of smallint
	 *	@return smallint
	 */
	public int getSmallint(int index) throws CFException {        
   		return dataTable.getDataTableArray1(index).getSmallint();
	}
	
	/**
	 * 	Update Smallint with the passed value
	 *	@param number
	 */
	public void setSmallint(int index,int number)  throws CFException{
		dataTable.getDataTableArray1(index).setSmallint(number);
	}


	public void setSmallint(int index,long number)  throws CFException{
		dataTable.getDataTableArray1(index).setSmallint((int)number);
	}


	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public int getDispNum(int index) throws CFException {
   		return dataTable.getDataTableArray1(index).getDispNum();
	}


	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString(int index) throws CFException {
	     return String.valueOf(dataTable.getDataTableArray1(index).getDispNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric(int index)  throws CFException{
	    return dataTable.getDataTableArray1(index - 1).dispNumIsNumeric();
	}

	/**
	 * 	Update DispNum with the passed value
	 *	@param number
	 */
	public void setDispNum(int index,int number)  throws CFException{
		dataTable.getDataTableArray1(index).setDispNum(number);
	}
	

	public void setDispNum(int index,long number)  throws CFException{
	    dataTable.getDataTableArray1(index).setDispNum(number);
	}
	
	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(int index,char[] value)  throws CFException {
		dataTable.getDataTableArray1(index).setDispNum(value);
	}
	
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(int index,char[] value)  throws CFException{
		dataTable.getDataTableArray1(index).setDispNum(value);
	}	

	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs(int index) throws CFException  {              
   		return dataTable.getDataTableArray1(index).getCharWs();
   }

  
	/**
	*  set variable charWs
	*  @param value
	**/
   public void setCharWs(int index,char[] value) throws CFException {
      dataTable.getDataTableArray1(index).setCharWs(value);
   } 

     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharWs(int index,char[] source, int sourceIndex) throws CFException {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex);
   	
   }
   
   public void setCharWs(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CharWs with another Field
	 *	@param value
	 */
   public void setCharWs(int index,Field source) {
      dataTable.getDataTableArray1(index).setCharWs(source);
   }  
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharWs(int index,Field source, int sourceIndex,int sourceLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataTable.getDataTableArray1(index).setCharWs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Init4Ctx getInit4Ctx() {
            return Init4Ctx.this;
        }

        public PrintOutCtx getPrintOutCtx() {
            return new PrintOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrintInCtx clone() {
        PrintInCtx cloneObj = new PrintInCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintInCtx getPrintInCtx() {
            return new PrintInCtx();
    }
     public class PrintOutCtx implements Cloneable {
     DataTable dataTable = Init4Ctx.this.getDataTable();
     Work work = Init4Ctx.this.getWork();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

	public void setI(long number)  throws CFException{
	    work.setI(number);
	}
	
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	


        public Init4Ctx getInit4Ctx() {
            return Init4Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrintOutCtx clone() {
        PrintOutCtx cloneObj = new PrintOutCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintOutCtx getPrintOutCtx() {
            return new PrintOutCtx();
    }
}
