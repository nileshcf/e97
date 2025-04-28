package com.cloudframe.app.mcvsam1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcvsam1.dto.Work;
import com.cloudframe.app.global.sharedvar.IrdExtrFileRec800;
import com.cloudframe.app.global.sharedvar.HoldIrdTable500;


@Context
public class Mcvsam1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    IrdExtrFileRec800 irdExtrFileRec800;
    Work work;
    HoldIrdTable500 holdIrdTable500;

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


    public IrdExtrFileRec800 getIrdExtrFileRec800() {
        if (irdExtrFileRec800 == null) {
            irdExtrFileRec800 = globalCtx.getGlobalDto(IrdExtrFileRec800.class);
        }

        return irdExtrFileRec800;
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
    public HoldIrdTable500 getHoldIrdTable500() {
        if (holdIrdTable500 == null) {
            holdIrdTable500 = globalCtx.getGlobalDto(HoldIrdTable500.class);
        }

        return holdIrdTable500;
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
        str += irdExtrFileRec800.hashCode();
        str += work.hashCode();
        str += holdIrdTable500.hashCode();
       return str.hashCode();
    }

    public Mcvsam1Ctx clone() {
        Mcvsam1Ctx cloneObj = new Mcvsam1Ctx();
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessIrdExtrSplit0InCtx implements Cloneable {
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam1Ctx.this.getIrdExtrFileRec800();
     Work work = Mcvsam1Ctx.this.getWork();
     HoldIrdTable500 holdIrdTable500 = Mcvsam1Ctx.this.getHoldIrdTable500();

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
	 *	Returns the value of pgmName300
	 *	@return pgmName300
	 */
   public char[] getPgmName300() throws CFException  {              
   		return work.getPgmName300();
   }

  
	/**
	*  set variable pgmName300
	*  @param value
	**/
   public void setPgmName300(char[] value) throws CFException {
      work.setPgmName300(value);
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


public void setIrdIdx500(int irdIdx500) { 
    Mcvsam1Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam1Ctx.this.irdIdx500;
}

        public Mcvsam1Ctx getMcvsam1Ctx() {
            return Mcvsam1Ctx.this;
        }

        public ProcessIrdExtrSplit0OutCtx getProcessIrdExtrSplit0OutCtx() {
            return new ProcessIrdExtrSplit0OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += irdExtrFileRec800.hashCode();
        str += work.hashCode();
        str += holdIrdTable500.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrSplit0InCtx clone() {
        ProcessIrdExtrSplit0InCtx cloneObj = new ProcessIrdExtrSplit0InCtx();
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrSplit0InCtx getProcessIrdExtrSplit0InCtx() {
            return new ProcessIrdExtrSplit0InCtx();
    }
     public class ProcessIrdExtrSplit0OutCtx implements Cloneable {
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam1Ctx.this.getIrdExtrFileRec800();
     Work work = Mcvsam1Ctx.this.getWork();
     HoldIrdTable500 holdIrdTable500 = Mcvsam1Ctx.this.getHoldIrdTable500();

	/**
	 *	Returns the value of cpi800
	 *	@return cpi800
	 */
   public char[] getCpi800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getCpi800();
   }

  
	/**
	*  set variable cpi800
	*  @param value
	**/
   public void setCpi800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setCpi800(value);
   } 

     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex);
   	
   }
   
   public void setCpi800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Cpi800 with another Field
	 *	@param value
	 */
   public void setCpi800(Field source) {
      irdExtrFileRec800.getKey800().setCpi800(source);
   }  
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bsl800
	 *	@return bsl800
	 */
   public char[] getBsl800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getBsl800();
   }

  
	/**
	*  set variable bsl800
	*  @param value
	**/
   public void setBsl800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setBsl800(value);
   } 

     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex);
   	
   }
   
   public void setBsl800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsl800 with another Field
	 *	@param value
	 */
   public void setBsl800(Field source) {
      irdExtrFileRec800.getKey800().setBsl800(source);
   }  
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msgType800
	 *	@return msgType800
	 */
   public char[] getMsgType800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getMsgType800();
   }

  
	/**
	*  set variable msgType800
	*  @param value
	**/
   public void setMsgType800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setMsgType800(value);
   } 

     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex);
   	
   }
   
   public void setMsgType800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsgType800 with another Field
	 *	@param value
	 */
   public void setMsgType800(Field source) {
      irdExtrFileRec800.getKey800().setMsgType800(source);
   }  
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      irdExtrFileRec800.getKey800().setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prcsCd800
	 *	@return prcsCd800
	 */
   public char[] getPrcsCd800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getPrcsCd800();
   }

  
	/**
	*  set variable prcsCd800
	*  @param value
	**/
   public void setPrcsCd800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setPrcsCd800(value);
   } 

     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex);
   	
   }
   
   public void setPrcsCd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrcsCd800 with another Field
	 *	@param value
	 */
   public void setPrcsCd800(Field source) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source);
   }  
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIrdIdx500(int irdIdx500) { 
    Mcvsam1Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam1Ctx.this.irdIdx500;
}
	/**
	 *	Returns the value of bsid800
	 *	@return bsid800
	 */
   public char[] getBsid800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getBsid800();
   }

  
	/**
	*  set variable bsid800
	*  @param value
	**/
   public void setBsid800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setBsid800(value);
   } 

     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex);
   	
   }
   
   public void setBsid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsid800 with another Field
	 *	@param value
	 */
   public void setBsid800(Field source) {
      irdExtrFileRec800.getKey800().setBsid800(source);
   }  
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcCd800
	 *	@return funcCd800
	 */
   public char[] getFuncCd800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getFuncCd800();
   }

  
	/**
	*  set variable funcCd800
	*  @param value
	**/
   public void setFuncCd800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setFuncCd800(value);
   } 

     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex);
   	
   }
   
   public void setFuncCd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FuncCd800 with another Field
	 *	@param value
	 */
   public void setFuncCd800(Field source) {
      irdExtrFileRec800.getKey800().setFuncCd800(source);
   }  
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of de26800
	 *	@return de26800
	 */
	public long getDe26800() throws CFException {
   		return irdExtrFileRec800.getKey800().getDe26800();
	}


	/**
	 *	Returns String value of de26800
	 *	@return de26800
	 */
	public char[]  getDe26800String() throws CFException {
	     return String.valueOf(irdExtrFileRec800.getKey800().getDe26800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de26800IsNumeric()  throws CFException{
	    return irdExtrFileRec800.getKey800().de26800IsNumeric();
	}

	/**
	 * 	Update De26800 with the passed value
	 *	@param number
	 */
	public void setDe26800(long number)  throws CFException{
		irdExtrFileRec800.getKey800().setDe26800(number);
	}
	

	
	/**
	 * 	Update De26800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe26800(char[] value)  throws CFException {
		irdExtrFileRec800.getKey800().setDe26800(value);
	}
	
	/**
	 * 	Update De26800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe26800String(char[] value)  throws CFException{
		irdExtrFileRec800.getKey800().setDe26800(value);
	}	


        public Mcvsam1Ctx getMcvsam1Ctx() {
            return Mcvsam1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += irdExtrFileRec800.hashCode();
        str += work.hashCode();
        str += holdIrdTable500.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrSplit0OutCtx clone() {
        ProcessIrdExtrSplit0OutCtx cloneObj = new ProcessIrdExtrSplit0OutCtx();
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrSplit0OutCtx getProcessIrdExtrSplit0OutCtx() {
            return new ProcessIrdExtrSplit0OutCtx();
    }
     public class ProcessIrdExtrSplit1InCtx implements Cloneable {
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam1Ctx.this.getIrdExtrFileRec800();
     Work work = Mcvsam1Ctx.this.getWork();
     HoldIrdTable500 holdIrdTable500 = Mcvsam1Ctx.this.getHoldIrdTable500();

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
	 *	Returns the value of pgmName300
	 *	@return pgmName300
	 */
   public char[] getPgmName300() throws CFException  {              
   		return work.getPgmName300();
   }

  
	/**
	*  set variable pgmName300
	*  @param value
	**/
   public void setPgmName300(char[] value) throws CFException {
      work.setPgmName300(value);
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


public void setIrdIdx500(int irdIdx500) { 
    Mcvsam1Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam1Ctx.this.irdIdx500;
}

        public Mcvsam1Ctx getMcvsam1Ctx() {
            return Mcvsam1Ctx.this;
        }

        public ProcessIrdExtrSplit1OutCtx getProcessIrdExtrSplit1OutCtx() {
            return new ProcessIrdExtrSplit1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += irdExtrFileRec800.hashCode();
        str += work.hashCode();
        str += holdIrdTable500.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrSplit1InCtx clone() {
        ProcessIrdExtrSplit1InCtx cloneObj = new ProcessIrdExtrSplit1InCtx();
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrSplit1InCtx getProcessIrdExtrSplit1InCtx() {
            return new ProcessIrdExtrSplit1InCtx();
    }
     public class ProcessIrdExtrSplit1OutCtx implements Cloneable {
     IrdExtrFileRec800 irdExtrFileRec800 = Mcvsam1Ctx.this.getIrdExtrFileRec800();
     Work work = Mcvsam1Ctx.this.getWork();
     HoldIrdTable500 holdIrdTable500 = Mcvsam1Ctx.this.getHoldIrdTable500();

	/**
	 *	Returns the value of cpi800
	 *	@return cpi800
	 */
   public char[] getCpi800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getCpi800();
   }

  
	/**
	*  set variable cpi800
	*  @param value
	**/
   public void setCpi800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setCpi800(value);
   } 

     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex);
   	
   }
   
   public void setCpi800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Cpi800 with another Field
	 *	@param value
	 */
   public void setCpi800(Field source) {
      irdExtrFileRec800.getKey800().setCpi800(source);
   }  
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setCpi800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bsl800
	 *	@return bsl800
	 */
   public char[] getBsl800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getBsl800();
   }

  
	/**
	*  set variable bsl800
	*  @param value
	**/
   public void setBsl800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setBsl800(value);
   } 

     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex);
   	
   }
   
   public void setBsl800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsl800 with another Field
	 *	@param value
	 */
   public void setBsl800(Field source) {
      irdExtrFileRec800.getKey800().setBsl800(source);
   }  
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsl800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      irdExtrFileRec800.getKey800().setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msgType800
	 *	@return msgType800
	 */
   public char[] getMsgType800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getMsgType800();
   }

  
	/**
	*  set variable msgType800
	*  @param value
	**/
   public void setMsgType800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setMsgType800(value);
   } 

     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex);
   	
   }
   
   public void setMsgType800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsgType800 with another Field
	 *	@param value
	 */
   public void setMsgType800(Field source) {
      irdExtrFileRec800.getKey800().setMsgType800(source);
   }  
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setMsgType800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prcsCd800
	 *	@return prcsCd800
	 */
   public char[] getPrcsCd800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getPrcsCd800();
   }

  
	/**
	*  set variable prcsCd800
	*  @param value
	**/
   public void setPrcsCd800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setPrcsCd800(value);
   } 

     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex);
   	
   }
   
   public void setPrcsCd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrcsCd800 with another Field
	 *	@param value
	 */
   public void setPrcsCd800(Field source) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source);
   }  
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setPrcsCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIrdIdx500(int irdIdx500) { 
    Mcvsam1Ctx.this.irdIdx500 = irdIdx500;
}

public int getIrdIdx500() { 
    return Mcvsam1Ctx.this.irdIdx500;
}
	/**
	 *	Returns the value of bsid800
	 *	@return bsid800
	 */
   public char[] getBsid800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getBsid800();
   }

  
	/**
	*  set variable bsid800
	*  @param value
	**/
   public void setBsid800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setBsid800(value);
   } 

     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex);
   	
   }
   
   public void setBsid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bsid800 with another Field
	 *	@param value
	 */
   public void setBsid800(Field source) {
      irdExtrFileRec800.getKey800().setBsid800(source);
   }  
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setBsid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of de26800
	 *	@return de26800
	 */
	public long getDe26800() throws CFException {
   		return irdExtrFileRec800.getKey800().getDe26800();
	}


	/**
	 *	Returns String value of de26800
	 *	@return de26800
	 */
	public char[]  getDe26800String() throws CFException {
	     return String.valueOf(irdExtrFileRec800.getKey800().getDe26800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de26800IsNumeric()  throws CFException{
	    return irdExtrFileRec800.getKey800().de26800IsNumeric();
	}

	/**
	 * 	Update De26800 with the passed value
	 *	@param number
	 */
	public void setDe26800(long number)  throws CFException{
		irdExtrFileRec800.getKey800().setDe26800(number);
	}
	

	
	/**
	 * 	Update De26800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe26800(char[] value)  throws CFException {
		irdExtrFileRec800.getKey800().setDe26800(value);
	}
	
	/**
	 * 	Update De26800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe26800String(char[] value)  throws CFException{
		irdExtrFileRec800.getKey800().setDe26800(value);
	}	

	/**
	 *	Returns the value of funcCd800
	 *	@return funcCd800
	 */
   public char[] getFuncCd800() throws CFException  {              
   		return irdExtrFileRec800.getKey800().getFuncCd800();
   }

  
	/**
	*  set variable funcCd800
	*  @param value
	**/
   public void setFuncCd800(char[] value) throws CFException {
      irdExtrFileRec800.getKey800().setFuncCd800(value);
   } 

     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex) throws CFException {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex);
   	
   }
   
   public void setFuncCd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FuncCd800 with another Field
	 *	@param value
	 */
   public void setFuncCd800(Field source) {
      irdExtrFileRec800.getKey800().setFuncCd800(source);
   }  
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      irdExtrFileRec800.getKey800().setFuncCd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mcvsam1Ctx getMcvsam1Ctx() {
            return Mcvsam1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += irdExtrFileRec800.hashCode();
        str += work.hashCode();
        str += holdIrdTable500.hashCode();
       return str.hashCode();
    }

    public ProcessIrdExtrSplit1OutCtx clone() {
        ProcessIrdExtrSplit1OutCtx cloneObj = new ProcessIrdExtrSplit1OutCtx();
        cloneObj.irdExtrFileRec800 = new IrdExtrFileRec800();
        cloneObj.irdExtrFileRec800.set(irdExtrFileRec800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdIrdTable500 = new HoldIrdTable500();
        cloneObj.holdIrdTable500.set(holdIrdTable500.getClonedField());
        return cloneObj;
    }

    }

    public ProcessIrdExtrSplit1OutCtx getProcessIrdExtrSplit1OutCtx() {
            return new ProcessIrdExtrSplit1OutCtx();
    }
}
