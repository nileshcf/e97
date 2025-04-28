package com.cloudframe.app.mc155;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mc155.dto.Work;
import com.cloudframe.app.mc155.file.records.Sys109UniqueFileIdRec;
import com.cloudframe.app.mc155.file.records.Sys109UniqueFileIdRecGroup;


@Context
public class Mc155Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup;
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


    public Sys109UniqueFileIdRecGroup getSys109UniqueFileIdRecGroup() {
        if (sys109UniqueFileIdRecGroup == null) {
            sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        }

        return sys109UniqueFileIdRecGroup;
    }

    public void setSys109UniqueFileIdRecGroup(Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup) {
        this.sys109UniqueFileIdRecGroup = sys109UniqueFileIdRecGroup;
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
        str += sys109UniqueFileIdRecGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Mc155Ctx clone() {
        Mc155Ctx cloneObj = new Mc155Ctx();
        cloneObj.sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        cloneObj.sys109UniqueFileIdRecGroup.set(sys109UniqueFileIdRecGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class OpenSys109InCtx implements Cloneable {
     Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup = Mc155Ctx.this.getSys109UniqueFileIdRecGroup();
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Returns the value of sys109FileIdKey
	 *	@return sys109FileIdKey
	 */
   public char[] getSys109FileIdKey() throws CFException  {              
   		return sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().getSys109FileIdKey();
   }

  
	/**
	*  set variable sys109FileIdKey
	*  @param value
	**/
   public void setSys109FileIdKey(char[] value) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(value);
   } 

     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex);
   	
   }
   
   public void setSys109FileIdKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys109FileIdKey with another Field
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source);
   }  
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys109UniqueFileIdRec
	 *	@return sys109UniqueFileIdRec
	 */   
	 public Sys109UniqueFileIdRec getSys109UniqueFileIdRec() {
   	return sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec();
   }

   /**
	* 	Update Sys109UniqueFileIdRec with the passed value
	*	@param value
	*/
   public void setSys109UniqueFileIdRec(char[] value) throws CFException {
      sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(value);
   }   

     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys109UniqueFileIdRec with another Field
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source);
   }  
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
        }

        public OpenSys109OutCtx getOpenSys109OutCtx() {
            return new OpenSys109OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys109UniqueFileIdRecGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenSys109InCtx clone() {
        OpenSys109InCtx cloneObj = new OpenSys109InCtx();
        cloneObj.sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        cloneObj.sys109UniqueFileIdRecGroup.set(sys109UniqueFileIdRecGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys109InCtx getOpenSys109InCtx() {
            return new OpenSys109InCtx();
    }
     public class OpenSys109OutCtx implements Cloneable {
     Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup = Mc155Ctx.this.getSys109UniqueFileIdRecGroup();
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Test condition "97" for isSys109Status9788200()
	 *	@return  Returns true if isSys109Status9788200() is "97"
	 */
   public boolean isSys109Status9788200() throws CFException {
      return work.isSys109Status9788200();
   }

	/**
	*  set values "97"
	*/
   	public void setSys109Status9788200True()  throws CFException{  			
    	work.setSys109Status9788200True();
   	}
	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException  {              
   		return work.getUniqueFileIdFileStatus200();
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) throws CFException {
      work.setUniqueFileIdFileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys109StatusGood88200()
	 *	@return  Returns true if isSys109StatusGood88200() is "00"
	 */
   public boolean isSys109StatusGood88200() throws CFException {
      return work.isSys109StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys109StatusGood88200True()  throws CFException{  			
    	work.setSys109StatusGood88200True();
   	}

        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys109UniqueFileIdRecGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OpenSys109OutCtx clone() {
        OpenSys109OutCtx cloneObj = new OpenSys109OutCtx();
        cloneObj.sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        cloneObj.sys109UniqueFileIdRecGroup.set(sys109UniqueFileIdRecGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OpenSys109OutCtx getOpenSys109OutCtx() {
            return new OpenSys109OutCtx();
    }
     public class LoadAlternateTableInCtx implements Cloneable {
     Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup = Mc155Ctx.this.getSys109UniqueFileIdRecGroup();
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException  {              
   		return work.getUniqueFileIdFileStatus200();
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) throws CFException {
      work.setUniqueFileIdFileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys109StatusGood88200()
	 *	@return  Returns true if isSys109StatusGood88200() is "00"
	 */
   public boolean isSys109StatusGood88200() throws CFException {
      return work.isSys109StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys109StatusGood88200True()  throws CFException{  			
    	work.setSys109StatusGood88200True();
   	}

        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
        }

        public LoadAlternateTableOutCtx getLoadAlternateTableOutCtx() {
            return new LoadAlternateTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys109UniqueFileIdRecGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadAlternateTableInCtx clone() {
        LoadAlternateTableInCtx cloneObj = new LoadAlternateTableInCtx();
        cloneObj.sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        cloneObj.sys109UniqueFileIdRecGroup.set(sys109UniqueFileIdRecGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadAlternateTableInCtx getLoadAlternateTableInCtx() {
            return new LoadAlternateTableInCtx();
    }
     public class LoadAlternateTableOutCtx implements Cloneable {
     Sys109UniqueFileIdRecGroup sys109UniqueFileIdRecGroup = Mc155Ctx.this.getSys109UniqueFileIdRecGroup();
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Returns the value of sys109FileIdKey
	 *	@return sys109FileIdKey
	 */
   public char[] getSys109FileIdKey() throws CFException  {              
   		return sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().getSys109FileIdKey();
   }

  
	/**
	*  set variable sys109FileIdKey
	*  @param value
	**/
   public void setSys109FileIdKey(char[] value) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(value);
   } 

     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex);
   	
   }
   
   public void setSys109FileIdKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys109FileIdKey with another Field
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source);
   }  
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec().setSys109FileIdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "23" for isSys109NoRecord88200()
	 *	@return  Returns true if isSys109NoRecord88200() is "23"
	 */
   public boolean isSys109NoRecord88200() throws CFException {
      return work.isSys109NoRecord88200();
   }

	/**
	*  set values "23"
	*/
   	public void setSys109NoRecord88200True()  throws CFException{  			
    	work.setSys109NoRecord88200True();
   	}
	/**
	 *	Test condition "10" for isSys109EndOfFile88200()
	 *	@return  Returns true if isSys109EndOfFile88200() is "10"
	 */
   public boolean isSys109EndOfFile88200() throws CFException {
      return work.isSys109EndOfFile88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys109EndOfFile88200True()  throws CFException{  			
    	work.setSys109EndOfFile88200True();
   	}
	/**
	 *	Returns the value of sys109ProcessSeqnoKey
	 *	@return sys109ProcessSeqnoKey
	 */
   public char[] getSys109ProcessSeqnoKey() throws CFException  {              
   		return sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().getSys109ProcessSeqnoKey();
   }

  
	/**
	*  set variable sys109ProcessSeqnoKey
	*  @param value
	**/
   public void setSys109ProcessSeqnoKey(char[] value) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(value);
   } 

     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex) throws CFException {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source, sourceIndex);
   	
   }
   
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys109ProcessSeqnoKey with another Field
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source);
   }  
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source, int sourceIndex,int sourceLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec1().setSys109ProcessSeqnoKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys109UniqueFileIdRec
	 *	@return sys109UniqueFileIdRec
	 */   
	 public Sys109UniqueFileIdRec getSys109UniqueFileIdRec() {
   	return sys109UniqueFileIdRecGroup.getSys109UniqueFileIdRec();
   }

   /**
	* 	Update Sys109UniqueFileIdRec with the passed value
	*	@param value
	*/
   public void setSys109UniqueFileIdRec(char[] value) throws CFException {
      sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(value);
   }   

     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys109UniqueFileIdRec with another Field
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source);
   }  
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys109UniqueFileIdRecGroup.setSys109UniqueFileIdRec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException  {              
   		return work.getUniqueFileIdFileStatus200();
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) throws CFException {
      work.setUniqueFileIdFileStatus200(value);
   } 


        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys109UniqueFileIdRecGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public LoadAlternateTableOutCtx clone() {
        LoadAlternateTableOutCtx cloneObj = new LoadAlternateTableOutCtx();
        cloneObj.sys109UniqueFileIdRecGroup = new Sys109UniqueFileIdRecGroup();
        cloneObj.sys109UniqueFileIdRecGroup.set(sys109UniqueFileIdRecGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public LoadAlternateTableOutCtx getLoadAlternateTableOutCtx() {
            return new LoadAlternateTableOutCtx();
    }
     public class CloseSys109InCtx implements Cloneable {
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException  {              
   		return work.getUniqueFileIdFileStatus200();
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) throws CFException {
      work.setUniqueFileIdFileStatus200(value);
   } 

	/**
	 *	Test condition "00" for isSys109StatusGood88200()
	 *	@return  Returns true if isSys109StatusGood88200() is "00"
	 */
   public boolean isSys109StatusGood88200() throws CFException {
      return work.isSys109StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys109StatusGood88200True()  throws CFException{  			
    	work.setSys109StatusGood88200True();
   	}

        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
        }

        public CloseSys109OutCtx getCloseSys109OutCtx() {
            return new CloseSys109OutCtx();
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

    public CloseSys109InCtx clone() {
        CloseSys109InCtx cloneObj = new CloseSys109InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys109InCtx getCloseSys109InCtx() {
            return new CloseSys109InCtx();
    }
     public class CloseSys109OutCtx implements Cloneable {
     Work work = Mc155Ctx.this.getWork();

	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException  {              
   		return work.getUniqueFileIdFileStatus200();
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) throws CFException {
      work.setUniqueFileIdFileStatus200(value);
   } 


        public Mc155Ctx getMc155Ctx() {
            return Mc155Ctx.this;
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

    public CloseSys109OutCtx clone() {
        CloseSys109OutCtx cloneObj = new CloseSys109OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys109OutCtx getCloseSys109OutCtx() {
            return new CloseSys109OutCtx();
    }
}
