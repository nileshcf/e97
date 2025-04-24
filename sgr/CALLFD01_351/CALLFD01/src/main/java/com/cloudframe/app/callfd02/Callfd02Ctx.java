package com.cloudframe.app.callfd02;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.callfd02.dto.InputRec;
import com.cloudframe.app.callfd02.dto.Work;
import com.cloudframe.app.callfd02.dto.ParmData;


@Context
public class Callfd02Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    ParmData parmData;
    InputRec inputRec;


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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public ParmData getParmData() {
        if (parmData == null) {
            parmData = new ParmData();
        }

        return parmData;
    }

    public void setParmData(ParmData parmData) {
        this.parmData = parmData;
    }
    public InputRec getInputRec() {
        if (inputRec == null) {
            inputRec = new InputRec();
        }

        return inputRec;
    }

    public void setInputRec(InputRec inputRec) {
        this.inputRec = inputRec;
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
        str += parmData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public Callfd02Ctx clone() {
        Callfd02Ctx cloneObj = new Callfd02Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     ParmData parmData = Callfd02Ctx.this.getParmData();
     InputRec inputRec = Callfd02Ctx.this.getInputRec();


        public Callfd02Ctx getCallfd02Ctx() {
            return Callfd02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parmData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     ParmData parmData = Callfd02Ctx.this.getParmData();
     InputRec inputRec = Callfd02Ctx.this.getInputRec();

	/**
	 *	Returns the value of parmMarker
	 *	@return parmMarker
	 */
   public char[] getParmMarker() throws CFException  {              
   		return parmData.getParmMarker();
   }

  
	/**
	*  set variable parmMarker
	*  @param value
	**/
   public void setParmMarker(char[] value) throws CFException {
      parmData.setParmMarker(value);
   } 

     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex) throws CFException {
      parmData.setParmMarker(source, sourceIndex);
   	
   }
   
   public void setParmMarker(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parmData.setParmMarker(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmMarker with another Field
	 *	@param value
	 */
   public void setParmMarker(Field source) {
      parmData.setParmMarker(source);
   }  
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Callfd02Ctx getCallfd02Ctx() {
            return Callfd02Ctx.this;
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
        str += parmData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     ParmData parmData = Callfd02Ctx.this.getParmData();
     InputRec inputRec = Callfd02Ctx.this.getInputRec();

	/**
	 *	Returns the value of parmMarker
	 *	@return parmMarker
	 */
   public char[] getParmMarker() throws CFException  {              
   		return parmData.getParmMarker();
   }

  
	/**
	*  set variable parmMarker
	*  @param value
	**/
   public void setParmMarker(char[] value) throws CFException {
      parmData.setParmMarker(value);
   } 

     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex) throws CFException {
      parmData.setParmMarker(source, sourceIndex);
   	
   }
   
   public void setParmMarker(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parmData.setParmMarker(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmMarker with another Field
	 *	@param value
	 */
   public void setParmMarker(Field source) {
      parmData.setParmMarker(source);
   }  
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputMarker
	 *	@return inputMarker
	 */
   public char[] getInputMarker() throws CFException  {              
   		return inputRec.getInputMarker();
   }

  
	/**
	*  set variable inputMarker
	*  @param value
	**/
   public void setInputMarker(char[] value) throws CFException {
      inputRec.setInputMarker(value);
   } 

     /**
	 * 	Update InputMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputMarker(char[] source, int sourceIndex) throws CFException {
      inputRec.setInputMarker(source, sourceIndex);
   	
   }
   
   public void setInputMarker(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputRec.setInputMarker(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputMarker with another Field
	 *	@param value
	 */
   public void setInputMarker(Field source) {
      inputRec.setInputMarker(source);
   }  
   
     /**
	 * 	Update InputMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputMarker(Field source, int sourceIndex,int sourceLen) {
      inputRec.setInputMarker(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.setInputMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ioType
	 *	@return ioType
	 */
   public char[] getIoType() throws CFException  {              
   		return inputRec.getInputKey().getIoType();
   }

  
	/**
	*  set variable ioType
	*  @param value
	**/
   public void setIoType(char[] value) throws CFException {
      inputRec.getInputKey().setIoType(value);
   } 

     /**
	 * 	Update IoType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIoType(char[] source, int sourceIndex) throws CFException {
      inputRec.getInputKey().setIoType(source, sourceIndex);
   	
   }
   
   public void setIoType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputRec.getInputKey().setIoType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IoType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.getInputKey().setIoType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IoType with another Field
	 *	@param value
	 */
   public void setIoType(Field source) {
      inputRec.getInputKey().setIoType(source);
   }  
   
     /**
	 * 	Update IoType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIoType(Field source, int sourceIndex,int sourceLen) {
      inputRec.getInputKey().setIoType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IoType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputRec.getInputKey().setIoType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Callfd02Ctx getCallfd02Ctx() {
            return Callfd02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parmData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
