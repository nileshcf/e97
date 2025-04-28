package com.cloudframe.app.bankint1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.bankint1.dto.AcafscedAreaComunicacion;
import com.cloudframe.app.bankint1.dto.Work;
import com.cloudframe.app.bankint1.dto.AcafscedControl;


@Context
public class Bankint1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AcafscedAreaComunicacion acafscedAreaComunicacion;
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


    public AcafscedAreaComunicacion getAcafscedAreaComunicacion() {
        if (acafscedAreaComunicacion == null) {
            acafscedAreaComunicacion = new AcafscedAreaComunicacion();
        }

        return acafscedAreaComunicacion;
    }

    public void setAcafscedAreaComunicacion(AcafscedAreaComunicacion acafscedAreaComunicacion) {
        this.acafscedAreaComunicacion = acafscedAreaComunicacion;
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
        str += acafscedAreaComunicacion.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Bankint1Ctx clone() {
        Bankint1Ctx cloneObj = new Bankint1Ctx();
        cloneObj.acafscedAreaComunicacion = new AcafscedAreaComunicacion();
        cloneObj.acafscedAreaComunicacion.set(acafscedAreaComunicacion.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainOutCtx implements Cloneable {
     AcafscedAreaComunicacion acafscedAreaComunicacion = Bankint1Ctx.this.getAcafscedAreaComunicacion();

	/**
	 *	Returns the value of acafscedControl
	 *	@return acafscedControl
	 */   
	 public AcafscedControl getAcafscedControl() {
   	return acafscedAreaComunicacion.getAcafscedSalida().getAcafscedControl();
   }

   /**
	* 	Update AcafscedControl with the passed value
	*	@param value
	*/
   public void setAcafscedControl(char[] value) throws CFException {
      acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(value);
   }   

     /**
	 * 	Update AcafscedControl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAcafscedControl(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AcafscedControl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedControl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AcafscedControl with another Field
	 *	@param value
	 */
   public void setAcafscedControl(Field source) {
   	acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(source);
   }  
   
     /**
	 * 	Update AcafscedControl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAcafscedControl(Field source, int sourceIndex,int sourceLen) {
   	acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AcafscedControl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcafscedControl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acafscedAreaComunicacion.getAcafscedSalida().setAcafscedControl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of acafscedAreaComunicacion
	 *	@return acafscedAreaComunicacion
	 */   
	 public AcafscedAreaComunicacion getAcafscedAreaComunicacion() {
   	return acafscedAreaComunicacion;
   }



        public Bankint1Ctx getBankint1Ctx() {
            return Bankint1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acafscedAreaComunicacion.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.acafscedAreaComunicacion = new AcafscedAreaComunicacion();
        cloneObj.acafscedAreaComunicacion.set(acafscedAreaComunicacion.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
}
