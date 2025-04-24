package com.cloudframe.app.sf305120;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sf305120.dto.EsV3ServiceHeader275;
import com.cloudframe.app.sf305120.dto.RhSource810;
import com.cloudframe.app.sf305120.dto.ServiceInfo820;
import com.cloudframe.app.sf305120.dto.Sf539ServiceTable;
import com.cloudframe.app.sf305120.dto.EsHeaderData270;
import com.cloudframe.app.sf305120.dto.Message0002600;
import com.cloudframe.app.sf305120.dto.Sf539Sf305020ControlBlock;
import com.cloudframe.app.sf305120.dto.ProgramCounters400;
import com.cloudframe.app.sf305120.dto.Z9Int16Group800;
import com.cloudframe.app.sf305120.dto.ZlogRecord801;
import com.cloudframe.app.sf305120.dto.SrvreqHeader802;
import com.cloudframe.app.sf305120.dto.FuncWhenCompiled800;
import com.cloudframe.app.sf305120.dto.FuncCurrentDate800;
import com.cloudframe.app.sf305120.dto.ZlogPointers410;
import com.cloudframe.app.sf305120.dto.Work;
import com.cloudframe.app.sf305120.dto.Z9Int32Group800;
import com.cloudframe.app.sf305120.dto.RhDestination810;
import com.cloudframe.app.sf305120.dto.InHeaderData290;
import com.cloudframe.app.sf305120.dto.ReHeaderData286;
import com.cloudframe.app.sf305120.dto.X86Int16X800;
import com.cloudframe.app.sf305120.dto.RhErrorDestination810;
import com.cloudframe.app.sf305120.dto.ZlogSr1Area802;
import com.cloudframe.app.sf305120.dto.SiServiceStruct820;
import com.cloudframe.app.sf305120.dto.RhInt16Group810;
import com.cloudframe.app.sf305120.dto.ZlogRecordGroup900;
import com.cloudframe.app.sf305120.dto.X86Int32X800;
import com.cloudframe.app.sf305120.dto.UnknownHeader299;
import com.cloudframe.app.sf305120.dto.ClogRecord801;
import com.cloudframe.app.sf305120.dto.X86Int32Group800;
import com.cloudframe.app.sf305120.dto.PlHeaderData284;
import com.cloudframe.app.sf305120.dto.X86Int16Group800;
import com.cloudframe.app.sf305120.dto.AsciiTextWGroup300;
import com.cloudframe.app.sf305120.dto.EbcdicTextWGroup300;
import com.cloudframe.app.sf305120.dto.EsV1CorrelId270;
import com.cloudframe.app.sf305120.dto.SvHeaderData282;
import com.cloudframe.app.sf305120.dto.ClassCLogRecord260;
import com.cloudframe.app.sf305120.dto.HalfWordGroup800;


@Context
public class Sf305120Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    ReHeaderData286 reHeaderData286;
    ClogRecord801 clogRecord801;
    Sf539Sf305020ControlBlock sf539Sf305020ControlBlock;
    RhInt16Group810 rhInt16Group810;
    EsV3ServiceHeader275 esV3ServiceHeader275;
    FuncWhenCompiled800 funcWhenCompiled800;
    ClassCLogRecord260 classCLogRecord260;
    Z9Int32Group800 z9Int32Group800;
    ZlogPointers410 zlogPointers410;
    RhErrorDestination810 rhErrorDestination810;
    ZlogRecordGroup900 zlogRecordGroup900;
    X86Int16Group800 x86Int16Group800;
    X86Int32Group800 x86Int32Group800;
    InHeaderData290 inHeaderData290;
    UnknownHeader299 unknownHeader299;
    RhSource810 rhSource810;
    EbcdicTextWGroup300 ebcdicTextWGroup300;
    Work work;
    FuncCurrentDate800 funcCurrentDate800;
    PlHeaderData284 plHeaderData284;
    ZlogSr1Area802 zlogSr1Area802;
    Z9Int16Group800 z9Int16Group800;
    Message0002600 message0002600;
    EsHeaderData270 esHeaderData270;
    ZlogRecord801 zlogRecord801;
    SvHeaderData282 svHeaderData282;
    ProgramCounters400 programCounters400;
    ServiceInfo820 serviceInfo820;
    HalfWordGroup800 halfWordGroup800;
    RhDestination810 rhDestination810;
    AsciiTextWGroup300 asciiTextWGroup300;


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


    public ReHeaderData286 getReHeaderData286() {
        if (reHeaderData286 == null) {
            reHeaderData286 = new ReHeaderData286();
        }

        return reHeaderData286;
    }

    public void setReHeaderData286(ReHeaderData286 reHeaderData286) {
        this.reHeaderData286 = reHeaderData286;
    }
    public ClogRecord801 getClogRecord801() {
        if (clogRecord801 == null) {
            clogRecord801 = new ClogRecord801();
        }

        return clogRecord801;
    }

    public void setClogRecord801(ClogRecord801 clogRecord801) {
        this.clogRecord801 = clogRecord801;
    }
    public Sf539Sf305020ControlBlock getSf539Sf305020ControlBlock() {
        if (sf539Sf305020ControlBlock == null) {
            sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        }

        return sf539Sf305020ControlBlock;
    }

    public void setSf539Sf305020ControlBlock(Sf539Sf305020ControlBlock sf539Sf305020ControlBlock) {
        this.sf539Sf305020ControlBlock = sf539Sf305020ControlBlock;
    }
    public RhInt16Group810 getRhInt16Group810() {
        if (rhInt16Group810 == null) {
            rhInt16Group810 = new RhInt16Group810();
        }

        return rhInt16Group810;
    }

    public void setRhInt16Group810(RhInt16Group810 rhInt16Group810) {
        this.rhInt16Group810 = rhInt16Group810;
    }
    public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
        if (esV3ServiceHeader275 == null) {
            esV3ServiceHeader275 = new EsV3ServiceHeader275();
        }

        return esV3ServiceHeader275;
    }

    public void setEsV3ServiceHeader275(EsV3ServiceHeader275 esV3ServiceHeader275) {
        this.esV3ServiceHeader275 = esV3ServiceHeader275;
    }
    public FuncWhenCompiled800 getFuncWhenCompiled800() {
        if (funcWhenCompiled800 == null) {
            funcWhenCompiled800 = new FuncWhenCompiled800();
        }

        return funcWhenCompiled800;
    }

    public void setFuncWhenCompiled800(FuncWhenCompiled800 funcWhenCompiled800) {
        this.funcWhenCompiled800 = funcWhenCompiled800;
    }
    public ClassCLogRecord260 getClassCLogRecord260() {
        if (classCLogRecord260 == null) {
            classCLogRecord260 = new ClassCLogRecord260();
        }

        return classCLogRecord260;
    }

    public void setClassCLogRecord260(ClassCLogRecord260 classCLogRecord260) {
        this.classCLogRecord260 = classCLogRecord260;
    }
    public Z9Int32Group800 getZ9Int32Group800() {
        if (z9Int32Group800 == null) {
            z9Int32Group800 = new Z9Int32Group800();
        }

        return z9Int32Group800;
    }

    public void setZ9Int32Group800(Z9Int32Group800 z9Int32Group800) {
        this.z9Int32Group800 = z9Int32Group800;
    }
    public ZlogPointers410 getZlogPointers410() {
        if (zlogPointers410 == null) {
            zlogPointers410 = new ZlogPointers410();
        }

        return zlogPointers410;
    }

    public void setZlogPointers410(ZlogPointers410 zlogPointers410) {
        this.zlogPointers410 = zlogPointers410;
    }
    public RhErrorDestination810 getRhErrorDestination810() {
        if (rhErrorDestination810 == null) {
            rhErrorDestination810 = new RhErrorDestination810();
        }

        return rhErrorDestination810;
    }

    public void setRhErrorDestination810(RhErrorDestination810 rhErrorDestination810) {
        this.rhErrorDestination810 = rhErrorDestination810;
    }
    public ZlogRecordGroup900 getZlogRecordGroup900() {
        if (zlogRecordGroup900 == null) {
            zlogRecordGroup900 = new ZlogRecordGroup900();
        }

        return zlogRecordGroup900;
    }

    public void setZlogRecordGroup900(ZlogRecordGroup900 zlogRecordGroup900) {
        this.zlogRecordGroup900 = zlogRecordGroup900;
    }
    public X86Int16Group800 getX86Int16Group800() {
        if (x86Int16Group800 == null) {
            x86Int16Group800 = new X86Int16Group800();
        }

        return x86Int16Group800;
    }

    public void setX86Int16Group800(X86Int16Group800 x86Int16Group800) {
        this.x86Int16Group800 = x86Int16Group800;
    }
    public X86Int32Group800 getX86Int32Group800() {
        if (x86Int32Group800 == null) {
            x86Int32Group800 = new X86Int32Group800();
        }

        return x86Int32Group800;
    }

    public void setX86Int32Group800(X86Int32Group800 x86Int32Group800) {
        this.x86Int32Group800 = x86Int32Group800;
    }
    public InHeaderData290 getInHeaderData290() {
        if (inHeaderData290 == null) {
            inHeaderData290 = new InHeaderData290();
        }

        return inHeaderData290;
    }

    public void setInHeaderData290(InHeaderData290 inHeaderData290) {
        this.inHeaderData290 = inHeaderData290;
    }
    public UnknownHeader299 getUnknownHeader299() {
        if (unknownHeader299 == null) {
            unknownHeader299 = new UnknownHeader299();
        }

        return unknownHeader299;
    }

    public void setUnknownHeader299(UnknownHeader299 unknownHeader299) {
        this.unknownHeader299 = unknownHeader299;
    }
    public RhSource810 getRhSource810() {
        if (rhSource810 == null) {
            rhSource810 = new RhSource810();
        }

        return rhSource810;
    }

    public void setRhSource810(RhSource810 rhSource810) {
        this.rhSource810 = rhSource810;
    }
    public EbcdicTextWGroup300 getEbcdicTextWGroup300() {
        if (ebcdicTextWGroup300 == null) {
            ebcdicTextWGroup300 = new EbcdicTextWGroup300();
        }

        return ebcdicTextWGroup300;
    }

    public void setEbcdicTextWGroup300(EbcdicTextWGroup300 ebcdicTextWGroup300) {
        this.ebcdicTextWGroup300 = ebcdicTextWGroup300;
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
    public FuncCurrentDate800 getFuncCurrentDate800() {
        if (funcCurrentDate800 == null) {
            funcCurrentDate800 = new FuncCurrentDate800();
        }

        return funcCurrentDate800;
    }

    public void setFuncCurrentDate800(FuncCurrentDate800 funcCurrentDate800) {
        this.funcCurrentDate800 = funcCurrentDate800;
    }
    public PlHeaderData284 getPlHeaderData284() {
        if (plHeaderData284 == null) {
            plHeaderData284 = new PlHeaderData284();
        }

        return plHeaderData284;
    }

    public void setPlHeaderData284(PlHeaderData284 plHeaderData284) {
        this.plHeaderData284 = plHeaderData284;
    }
    public ZlogSr1Area802 getZlogSr1Area802() {
        if (zlogSr1Area802 == null) {
            zlogSr1Area802 = new ZlogSr1Area802();
        }

        return zlogSr1Area802;
    }

    public void setZlogSr1Area802(ZlogSr1Area802 zlogSr1Area802) {
        this.zlogSr1Area802 = zlogSr1Area802;
    }
    public Z9Int16Group800 getZ9Int16Group800() {
        if (z9Int16Group800 == null) {
            z9Int16Group800 = new Z9Int16Group800();
        }

        return z9Int16Group800;
    }

    public void setZ9Int16Group800(Z9Int16Group800 z9Int16Group800) {
        this.z9Int16Group800 = z9Int16Group800;
    }
    public Message0002600 getMessage0002600() {
        if (message0002600 == null) {
            message0002600 = new Message0002600();
        }

        return message0002600;
    }

    public void setMessage0002600(Message0002600 message0002600) {
        this.message0002600 = message0002600;
    }
    public EsHeaderData270 getEsHeaderData270() {
        if (esHeaderData270 == null) {
            esHeaderData270 = new EsHeaderData270();
        }

        return esHeaderData270;
    }

    public void setEsHeaderData270(EsHeaderData270 esHeaderData270) {
        this.esHeaderData270 = esHeaderData270;
    }
    public ZlogRecord801 getZlogRecord801() {
        if (zlogRecord801 == null) {
            zlogRecord801 = new ZlogRecord801();
        }

        return zlogRecord801;
    }

    public void setZlogRecord801(ZlogRecord801 zlogRecord801) {
        this.zlogRecord801 = zlogRecord801;
    }
    public SvHeaderData282 getSvHeaderData282() {
        if (svHeaderData282 == null) {
            svHeaderData282 = new SvHeaderData282();
        }

        return svHeaderData282;
    }

    public void setSvHeaderData282(SvHeaderData282 svHeaderData282) {
        this.svHeaderData282 = svHeaderData282;
    }
    public ProgramCounters400 getProgramCounters400() {
        if (programCounters400 == null) {
            programCounters400 = new ProgramCounters400();
        }

        return programCounters400;
    }

    public void setProgramCounters400(ProgramCounters400 programCounters400) {
        this.programCounters400 = programCounters400;
    }
    public ServiceInfo820 getServiceInfo820() {
        if (serviceInfo820 == null) {
            serviceInfo820 = new ServiceInfo820();
        }

        return serviceInfo820;
    }

    public void setServiceInfo820(ServiceInfo820 serviceInfo820) {
        this.serviceInfo820 = serviceInfo820;
    }
    public HalfWordGroup800 getHalfWordGroup800() {
        if (halfWordGroup800 == null) {
            halfWordGroup800 = new HalfWordGroup800();
        }

        return halfWordGroup800;
    }

    public void setHalfWordGroup800(HalfWordGroup800 halfWordGroup800) {
        this.halfWordGroup800 = halfWordGroup800;
    }
    public RhDestination810 getRhDestination810() {
        if (rhDestination810 == null) {
            rhDestination810 = new RhDestination810();
        }

        return rhDestination810;
    }

    public void setRhDestination810(RhDestination810 rhDestination810) {
        this.rhDestination810 = rhDestination810;
    }
    public AsciiTextWGroup300 getAsciiTextWGroup300() {
        if (asciiTextWGroup300 == null) {
            asciiTextWGroup300 = new AsciiTextWGroup300();
        }

        return asciiTextWGroup300;
    }

    public void setAsciiTextWGroup300(AsciiTextWGroup300 asciiTextWGroup300) {
        this.asciiTextWGroup300 = asciiTextWGroup300;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reHeaderData286.hashCode();
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += rhInt16Group810.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += classCLogRecord260.hashCode();
        str += z9Int32Group800.hashCode();
        str += zlogPointers410.hashCode();
        str += rhErrorDestination810.hashCode();
        str += zlogRecordGroup900.hashCode();
        str += x86Int16Group800.hashCode();
        str += x86Int32Group800.hashCode();
        str += inHeaderData290.hashCode();
        str += unknownHeader299.hashCode();
        str += rhSource810.hashCode();
        str += ebcdicTextWGroup300.hashCode();
        str += work.hashCode();
        str += funcCurrentDate800.hashCode();
        str += plHeaderData284.hashCode();
        str += zlogSr1Area802.hashCode();
        str += z9Int16Group800.hashCode();
        str += message0002600.hashCode();
        str += esHeaderData270.hashCode();
        str += zlogRecord801.hashCode();
        str += svHeaderData282.hashCode();
        str += programCounters400.hashCode();
        str += serviceInfo820.hashCode();
        str += halfWordGroup800.hashCode();
        str += rhDestination810.hashCode();
        str += asciiTextWGroup300.hashCode();
       return str.hashCode();
    }

    public Sf305120Ctx clone() {
        Sf305120Ctx cloneObj = new Sf305120Ctx();
        cloneObj.reHeaderData286 = new ReHeaderData286();
        cloneObj.reHeaderData286.set(reHeaderData286.getClonedField());
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.rhInt16Group810 = new RhInt16Group810();
        cloneObj.rhInt16Group810.set(rhInt16Group810.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.rhErrorDestination810 = new RhErrorDestination810();
        cloneObj.rhErrorDestination810.set(rhErrorDestination810.getClonedField());
        cloneObj.zlogRecordGroup900 = new ZlogRecordGroup900();
        cloneObj.zlogRecordGroup900.set(zlogRecordGroup900.getClonedField());
        cloneObj.x86Int16Group800 = new X86Int16Group800();
        cloneObj.x86Int16Group800.set(x86Int16Group800.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.inHeaderData290 = new InHeaderData290();
        cloneObj.inHeaderData290.set(inHeaderData290.getClonedField());
        cloneObj.unknownHeader299 = new UnknownHeader299();
        cloneObj.unknownHeader299.set(unknownHeader299.getClonedField());
        cloneObj.rhSource810 = new RhSource810();
        cloneObj.rhSource810.set(rhSource810.getClonedField());
        cloneObj.ebcdicTextWGroup300 = new EbcdicTextWGroup300();
        cloneObj.ebcdicTextWGroup300.set(ebcdicTextWGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.plHeaderData284 = new PlHeaderData284();
        cloneObj.plHeaderData284.set(plHeaderData284.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.message0002600 = new Message0002600();
        cloneObj.message0002600.set(message0002600.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        cloneObj.svHeaderData282 = new SvHeaderData282();
        cloneObj.svHeaderData282.set(svHeaderData282.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        cloneObj.rhDestination810 = new RhDestination810();
        cloneObj.rhDestination810.set(rhDestination810.getClonedField());
        cloneObj.asciiTextWGroup300 = new AsciiTextWGroup300();
        cloneObj.asciiTextWGroup300.set(asciiTextWGroup300.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of charC300
	 *	@return charC300
	 */
   public char[] getCharC300() throws CFException  {              
   		return work.getCharC300();
   }

  
	/**
	*  set variable charC300
	*  @param value
	**/
   public void setCharC300(char[] value) throws CFException {
      work.setCharC300(value);
   } 

	/**
	 *	Returns the value of mipZLogClass801
	 *	@return mipZLogClass801
	 */
   public char[] getMipZLogClass801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getMipZLogClassType801().getMipZLogClass801();
   }

  
	/**
	*  set variable mipZLogClass801
	*  @param value
	**/
   public void setMipZLogClass801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(value);
   } 

     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex);
   	
   }
   
   public void setMipZLogClass801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MipZLogClass801 with another Field
	 *	@param value
	 */
   public void setMipZLogClass801(Field source) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source);
   }  
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of charZ300
	 *	@return charZ300
	 */
   public char[] getCharZ300() throws CFException  {              
   		return work.getCharZ300();
   }

  
	/**
	*  set variable charZ300
	*  @param value
	**/
   public void setCharZ300(char[] value) throws CFException {
      work.setCharZ300(value);
   } 


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += sf539Sf305020ControlBlock.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitializeTheProgramInCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ZlogRecordGroup900 zlogRecordGroup900 = Sf305120Ctx.this.getZlogRecordGroup900();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of error16300
	 *	@return error16300
	 */
	public short getError16300() throws CFException {        
   		return work.getError16300();
	}
	
	/**
	 * 	Update Error16300 with the passed value
	 *	@param number
	 */
	public void setError16300(short number)  throws CFException{
		work.setError16300(number);
	}

	public void setError16300(int number)  throws CFException{
		work.setError16300((short)number);
	}

	public void setError16300(long number)  throws CFException{
		work.setError16300((short)number);
	}



	/**
	 *	Test condition "Y" for isThisIsTheFirstTime88100()
	 *	@return  Returns true if isThisIsTheFirstTime88100() is "Y"
	 */
   public boolean isThisIsTheFirstTime88100() throws CFException {
      return work.isThisIsTheFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setThisIsTheFirstTime88100True()  throws CFException{  			
    	work.setThisIsTheFirstTime88100True();
   	}
	/**
	 *	Returns the value of zlogRecordGroup900
	 *	@return zlogRecordGroup900
	 */   
	 public ZlogRecordGroup900 getZlogRecordGroup900() {
   	return zlogRecordGroup900;
   }


	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of programSf305120300
	 *	@return programSf305120300
	 */
   public char[] getProgramSf305120300() throws CFException  {              
   		return work.getProgramSf305120300();
   }

  
	/**
	*  set variable programSf305120300
	*  @param value
	**/
   public void setProgramSf305120300(char[] value) throws CFException {
      work.setProgramSf305120300(value);
   } 

	/**
	 *	Returns the value of binary40300
	 *	@return binary40300
	 */
	public short getBinary40300() throws CFException {        
   		return work.getBinary40300();
	}
	
	/**
	 * 	Update Binary40300 with the passed value
	 *	@param number
	 */
	public void setBinary40300(short number)  throws CFException{
		work.setBinary40300(number);
	}

	public void setBinary40300(int number)  throws CFException{
		work.setBinary40300((short)number);
	}

	public void setBinary40300(long number)  throws CFException{
		work.setBinary40300((short)number);
	}



	/**
	 *	Returns the value of zlogRecord801
	 *	@return zlogRecord801
	 */   
	 public ZlogRecord801 getZlogRecord801() {
   	return zlogRecord801;
   }


	/**
	 *	Returns the value of sf539ZlogRecordPtr
	 *	@return sf539ZlogRecordPtr
	 */
	public int getSf539ZlogRecordPtr() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordPtr();
	}
	
	/**
	 * 	Update Sf539ZlogRecordPtr with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordPtr(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordPtr(number);
	}


	public void setSf539ZlogRecordPtr(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordPtr((int)number);
	}


	/**
	 *	Returns the value of asciiSr300
	 *	@return asciiSr300
	 */
   public char[] getAsciiSr300() throws CFException  {              
   		return work.getAsciiSr300();
   }

  
	/**
	*  set variable asciiSr300
	*  @param value
	**/
   public void setAsciiSr300(char[] value) throws CFException {
      work.setAsciiSr300(value);
   } 


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public InitializeTheProgramOutCtx getInitializeTheProgramOutCtx() {
            return new InitializeTheProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += zlogRecordGroup900.hashCode();
        str += programCounters400.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public InitializeTheProgramInCtx clone() {
        InitializeTheProgramInCtx cloneObj = new InitializeTheProgramInCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogRecordGroup900 = new ZlogRecordGroup900();
        cloneObj.zlogRecordGroup900.set(zlogRecordGroup900.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public InitializeTheProgramInCtx getInitializeTheProgramInCtx() {
            return new InitializeTheProgramInCtx();
    }
     public class InitializeTheProgramOutCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ZlogRecordGroup900 zlogRecordGroup900 = Sf305120Ctx.this.getZlogRecordGroup900();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of error16300
	 *	@return error16300
	 */
	public short getError16300() throws CFException {        
   		return work.getError16300();
	}
	
	/**
	 * 	Update Error16300 with the passed value
	 *	@param number
	 */
	public void setError16300(short number)  throws CFException{
		work.setError16300(number);
	}

	public void setError16300(int number)  throws CFException{
		work.setError16300((short)number);
	}

	public void setError16300(long number)  throws CFException{
		work.setError16300((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsg2Offset
	 *	@return sf539IsoMsg2Offset
	 */
	public short getSf539IsoMsg2Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg2Offset();
	}
	
	/**
	 * 	Update Sf539IsoMsg2Offset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg2Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset(number);
	}

	public void setSf539IsoMsg2Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset((short)number);
	}

	public void setSf539IsoMsg2Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset((short)number);
	}



	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of sf539Trailer2Lnth
	 *	@return sf539Trailer2Lnth
	 */
	public short getSf539Trailer2Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer2Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth(number);
	}

	public void setSf539Trailer2Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}

	public void setSf539Trailer2Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}



	/**
	 *	Test condition "Y" for isZlogRel11188100()
	 *	@return  Returns true if isZlogRel11188100() is "Y"
	 */
   public boolean isZlogRel11188100() throws CFException {
      return work.isZlogRel11188100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZlogRel11188100True()  throws CFException{  			
    	work.setZlogRel11188100True();
   	}
	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {        
   		return programCounters400.getVardataLnth400();
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *	@param number
	 */
	public void setVardataLnth400(short number)  throws CFException{
		programCounters400.setVardataLnth400(number);
	}

	public void setVardataLnth400(int number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}

	public void setVardataLnth400(long number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}



	/**
	 *	Test condition "N" for isZlogRel10288100()
	 *	@return  Returns true if isZlogRel10288100() is "N"
	 */
   public boolean isZlogRel10288100() throws CFException {
      return work.isZlogRel10288100();
   }

	/**
	*  set values "N"
	*/
   	public void setZlogRel10288100True()  throws CFException{  			
    	work.setZlogRel10288100True();
   	}
	/**
	 *	Returns the value of sf539Trailer2Offset
	 *	@return sf539Trailer2Offset
	 */
	public short getSf539Trailer2Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Offset();
	}
	
	/**
	 * 	Update Sf539Trailer2Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset(number);
	}

	public void setSf539Trailer2Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}

	public void setSf539Trailer2Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}



	/**
	 *	Returns the value of zlogPointers410
	 *	@return zlogPointers410
	 */   
	 public ZlogPointers410 getZlogPointers410() {
   	return zlogPointers410;
   }


	/**
	 *	Returns the value of zlogRecord801
	 *	@return zlogRecord801
	 */   
	 public ZlogRecord801 getZlogRecord801() {
   	return zlogRecord801;
   }


	/**
	 *	Returns the value of sf539IsoMsg2Lnth
	 *	@return sf539IsoMsg2Lnth
	 */
	public short getSf539IsoMsg2Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg2Lnth();
	}
	
	/**
	 * 	Update Sf539IsoMsg2Lnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg2Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth(number);
	}

	public void setSf539IsoMsg2Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth((short)number);
	}

	public void setSf539IsoMsg2Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539SubprogamId
	 *	@return sf539SubprogamId
	 */
   public char[] getSf539SubprogamId() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539SubprogamId();
   }

  
	/**
	*  set variable sf539SubprogamId
	*  @param value
	**/
   public void setSf539SubprogamId(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539SubprogamId(value);
   } 

     /**
	 * 	Update Sf539SubprogamId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539SubprogamId(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source, sourceIndex);
   	
   }
   
   public void setSf539SubprogamId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539SubprogamId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539SubprogamId with another Field
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source) {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source);
   }  
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539SubprogamId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539SubprogamId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539SubprogamId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of sf539ServiceTable
	 *	@return sf539ServiceTable
	 */   
	 public Sf539ServiceTable getSf539ServiceTable(int index) {
   	return sf539Sf305020ControlBlock.getSf539ServiceTable(index);
   }

    public List<Sf539ServiceTable> getSf539ServiceTable() {
        return sf539Sf305020ControlBlock.getSf539ServiceTable();
    }
   /**
	* 	Update Sf539ServiceTable with the passed value
	*	@param value
	*/
   public void setSf539ServiceTable(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539ServiceTable((index),value);
   }   


	/**
	 *	Returns the value of programCounters400
	 *	@return programCounters400
	 */   
	 public ProgramCounters400 getProgramCounters400() {
   	return programCounters400;
   }


	/**
	 *	Returns the value of zlogSr2LengthX801
	 *	@return zlogSr2LengthX801
	 */
   public char[] getZlogSr2LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr2LengthX801();
   }

  
	/**
	*  set variable zlogSr2LengthX801
	*  @param value
	**/
   public void setZlogSr2LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr2LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr2LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of programSf305120300
	 *	@return programSf305120300
	 */
   public char[] getProgramSf305120300() throws CFException  {              
   		return work.getProgramSf305120300();
   }

  
	/**
	*  set variable programSf305120300
	*  @param value
	**/
   public void setProgramSf305120300(char[] value) throws CFException {
      work.setProgramSf305120300(value);
   } 

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of zlogRecord900
	 *	@return zlogRecord900
	 */
   public char[] getZlogRecord900() throws CFException  {              
   		return zlogRecordGroup900.getZlogRecord900();
   }

  
	/**
	*  set variable zlogRecord900
	*  @param value
	**/
   public void setZlogRecord900(char[] value) throws CFException {
      zlogRecordGroup900.setZlogRecord900(value);
   } 

     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex) throws CFException {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex);
   	
   }
   
   public void setZlogRecord900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogRecord900 with another Field
	 *	@param value
	 */
   public void setZlogRecord900(Field source) {
      zlogRecordGroup900.setZlogRecord900(source);
   }  
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isNoLongerFirstTime88100()
	 *	@return  Returns true if isNoLongerFirstTime88100() is "N"
	 */
   public boolean isNoLongerFirstTime88100() throws CFException {
      return work.isNoLongerFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setNoLongerFirstTime88100True()  throws CFException{  			
    	work.setNoLongerFirstTime88100True();
   	}
	/**
	 *	Returns the value of sf539FillerExpansion
	 *	@return sf539FillerExpansion
	 */
   public char[] getSf539FillerExpansion() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539FillerExpansion();
   }

  
	/**
	*  set variable sf539FillerExpansion
	*  @param value
	**/
   public void setSf539FillerExpansion(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(value);
   } 

     /**
	 * 	Update Sf539FillerExpansion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539FillerExpansion(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source, sourceIndex);
   	
   }
   
   public void setSf539FillerExpansion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539FillerExpansion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539FillerExpansion with another Field
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source) {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source);
   }  
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539FillerExpansion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539FillerExpansion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539FillerExpansion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += zlogRecordGroup900.hashCode();
        str += programCounters400.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public InitializeTheProgramOutCtx clone() {
        InitializeTheProgramOutCtx cloneObj = new InitializeTheProgramOutCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogRecordGroup900 = new ZlogRecordGroup900();
        cloneObj.zlogRecordGroup900.set(zlogRecordGroup900.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public InitializeTheProgramOutCtx getInitializeTheProgramOutCtx() {
            return new InitializeTheProgramOutCtx();
    }
     public class DisplayStartMessagesInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     FuncCurrentDate800 funcCurrentDate800 = Sf305120Ctx.this.getFuncCurrentDate800();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf305120Ctx.this.getFuncWhenCompiled800();
     Message0002600 message0002600 = Sf305120Ctx.this.getMessage0002600();

	/**
	 *	Returns the value of currTimeHh800
	 *	@return currTimeHh800
	 */
   public char[] getCurrTimeHh800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeHh800();
   }

  
	/**
	*  set variable currTimeHh800
	*  @param value
	**/
   public void setCurrTimeHh800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(value);
   } 

     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh800 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source);
   }  
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeMm800
	 *	@return currTimeMm800
	 */
   public char[] getCurrTimeMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeMm800();
   }

  
	/**
	*  set variable currTimeMm800
	*  @param value
	**/
   public void setCurrTimeMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(value);
   } 

     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm800 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source);
   }  
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of blankLine300
	 *	@return blankLine300
	 */
   public char[] getBlankLine300() throws CFException  {              
   		return work.getBlankLine300();
   }

  
	/**
	*  set variable blankLine300
	*  @param value
	**/
   public void setBlankLine300(char[] value) throws CFException {
      work.setBlankLine300(value);
   } 

	/**
	 *	Returns the value of currDateMm800
	 *	@return currDateMm800
	 */
   public char[] getCurrDateMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateMm800();
   }

  
	/**
	*  set variable currDateMm800
	*  @param value
	**/
   public void setCurrDateMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(value);
   } 

     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm800 with another Field
	 *	@param value
	 */
   public void setCurrDateMm800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source);
   }  
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf305120VersionMsg600
	 *	@return sf305120VersionMsg600
	 */
   public char[] getSf305120VersionMsg600() throws CFException  {              
   		return work.getSf305120VersionMsg600();
   }

  
	/**
	*  set variable sf305120VersionMsg600
	*  @param value
	**/
   public void setSf305120VersionMsg600(char[] value) throws CFException {
      work.setSf305120VersionMsg600(value);
   } 

	/**
	 *	Returns the value of message0001600
	 *	@return message0001600
	 */
   public char[] getMessage0001600() throws CFException  {              
   		return work.getMessage0001600();
   }

  
	/**
	*  set variable message0001600
	*  @param value
	**/
   public void setMessage0001600(char[] value) throws CFException {
      work.setMessage0001600(value);
   } 

	/**
	 *	Returns the value of currDateDd800
	 *	@return currDateDd800
	 */
   public char[] getCurrDateDd800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateDd800();
   }

  
	/**
	*  set variable currDateDd800
	*  @param value
	**/
   public void setCurrDateDd800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(value);
   } 

     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd800 with another Field
	 *	@param value
	 */
   public void setCurrDateDd800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source);
   }  
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of message0002600
	 *	@return message0002600
	 */   
	 public Message0002600 getMessage0002600() {
   	return message0002600;
   }


	/**
	 *	Returns the value of currDateYyyy800
	 *	@return currDateYyyy800
	 */
   public char[] getCurrDateYyyy800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateYyyy800();
   }

  
	/**
	*  set variable currDateYyyy800
	*  @param value
	**/
   public void setCurrDateYyyy800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(value);
   } 

     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy800 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeSs800
	 *	@return currTimeSs800
	 */
   public char[] getCurrTimeSs800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeSs800();
   }

  
	/**
	*  set variable currTimeSs800
	*  @param value
	**/
   public void setCurrTimeSs800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(value);
   } 

     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs800 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source);
   }  
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public DisplayStartMessagesOutCtx getDisplayStartMessagesOutCtx() {
            return new DisplayStartMessagesOutCtx();
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
        str += funcCurrentDate800.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += message0002600.hashCode();
       return str.hashCode();
    }

    public DisplayStartMessagesInCtx clone() {
        DisplayStartMessagesInCtx cloneObj = new DisplayStartMessagesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.message0002600 = new Message0002600();
        cloneObj.message0002600.set(message0002600.getClonedField());
        return cloneObj;
    }

    }

    public DisplayStartMessagesInCtx getDisplayStartMessagesInCtx() {
            return new DisplayStartMessagesInCtx();
    }
     public class DisplayStartMessagesOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     FuncCurrentDate800 funcCurrentDate800 = Sf305120Ctx.this.getFuncCurrentDate800();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf305120Ctx.this.getFuncWhenCompiled800();
     Message0002600 message0002600 = Sf305120Ctx.this.getMessage0002600();

	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException  {              
   		return work.getCurrTimeSs600();
   }

  
	/**
	*  set variable currTimeSs600
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) throws CFException {
      work.setCurrTimeSs600(value);
   } 

	/**
	 *	Returns the value of compDateMm600
	 *	@return compDateMm600
	 */
   public char[] getCompDateMm600() throws CFException  {              
   		return message0002600.getCompileDate600().getCompDateMm600();
   }

  
	/**
	*  set variable compDateMm600
	*  @param value
	**/
   public void setCompDateMm600(char[] value) throws CFException {
      message0002600.getCompileDate600().setCompDateMm600(value);
   } 

     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileDate600().setCompDateMm600(source, sourceIndex);
   	
   }
   
   public void setCompDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateMm600 with another Field
	 *	@param value
	 */
   public void setCompDateMm600(Field source) {
      message0002600.getCompileDate600().setCompDateMm600(source);
   }  
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeSs600
	 *	@return compTimeSs600
	 */
   public char[] getCompTimeSs600() throws CFException  {              
   		return message0002600.getCompileTime600().getCompTimeSs600();
   }

  
	/**
	*  set variable compTimeSs600
	*  @param value
	**/
   public void setCompTimeSs600(char[] value) throws CFException {
      message0002600.getCompileTime600().setCompTimeSs600(value);
   } 

     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileTime600().setCompTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCompTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeSs600 with another Field
	 *	@param value
	 */
   public void setCompTimeSs600(Field source) {
      message0002600.getCompileTime600().setCompTimeSs600(source);
   }  
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcWhenCompiled800
	 *	@return funcWhenCompiled800
	 */   
	 public FuncWhenCompiled800 getFuncWhenCompiled800() {
   	return funcWhenCompiled800;
   }


	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException  {              
   		return work.getCurrDateYyyy600();
   }

  
	/**
	*  set variable currDateYyyy600
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) throws CFException {
      work.setCurrDateYyyy600(value);
   } 

	/**
	 *	Returns the value of whenDateYyyy800
	 *	@return whenDateYyyy800
	 */
   public char[] getWhenDateYyyy800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateYyyy800();
   }

  
	/**
	*  set variable whenDateYyyy800
	*  @param value
	**/
   public void setWhenDateYyyy800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(value);
   } 

     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setWhenDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateYyyy800 with another Field
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source);
   }  
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException  {              
   		return work.getCurrDateMm600();
   }

  
	/**
	*  set variable currDateMm600
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) throws CFException {
      work.setCurrDateMm600(value);
   } 

	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException  {              
   		return work.getCurrDateDd600();
   }

  
	/**
	*  set variable currDateDd600
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) throws CFException {
      work.setCurrDateDd600(value);
   } 

	/**
	 *	Returns the value of currTimeSs800
	 *	@return currTimeSs800
	 */
   public char[] getCurrTimeSs800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeSs800();
   }

  
	/**
	*  set variable currTimeSs800
	*  @param value
	**/
   public void setCurrTimeSs800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(value);
   } 

     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs800 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source);
   }  
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeMm800
	 *	@return currTimeMm800
	 */
   public char[] getCurrTimeMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeMm800();
   }

  
	/**
	*  set variable currTimeMm800
	*  @param value
	**/
   public void setCurrTimeMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(value);
   } 

     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm800 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source);
   }  
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException  {              
   		return work.getCurrTimeMm600();
   }

  
	/**
	*  set variable currTimeMm600
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) throws CFException {
      work.setCurrTimeMm600(value);
   } 

	/**
	 *	Returns the value of currDateMm800
	 *	@return currDateMm800
	 */
   public char[] getCurrDateMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateMm800();
   }

  
	/**
	*  set variable currDateMm800
	*  @param value
	**/
   public void setCurrDateMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(value);
   } 

     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm800 with another Field
	 *	@param value
	 */
   public void setCurrDateMm800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source);
   }  
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcCurrentDate800
	 *	@return funcCurrentDate800
	 */   
	 public FuncCurrentDate800 getFuncCurrentDate800() {
   	return funcCurrentDate800;
   }


	/**
	 *	Returns the value of compDateYyyy600
	 *	@return compDateYyyy600
	 */
   public char[] getCompDateYyyy600() throws CFException  {              
   		return message0002600.getCompileDate600().getCompDateYyyy600();
   }

  
	/**
	*  set variable compDateYyyy600
	*  @param value
	**/
   public void setCompDateYyyy600(char[] value) throws CFException {
      message0002600.getCompileDate600().setCompDateYyyy600(value);
   } 

     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileDate600().setCompDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCompDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source) {
      message0002600.getCompileDate600().setCompDateYyyy600(source);
   }  
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeHh800
	 *	@return whenTimeHh800
	 */
   public char[] getWhenTimeHh800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeHh800();
   }

  
	/**
	*  set variable whenTimeHh800
	*  @param value
	**/
   public void setWhenTimeHh800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(value);
   } 

     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeHh800 with another Field
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source);
   }  
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeMm600
	 *	@return compTimeMm600
	 */
   public char[] getCompTimeMm600() throws CFException  {              
   		return message0002600.getCompileTime600().getCompTimeMm600();
   }

  
	/**
	*  set variable compTimeMm600
	*  @param value
	**/
   public void setCompTimeMm600(char[] value) throws CFException {
      message0002600.getCompileTime600().setCompTimeMm600(value);
   } 

     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileTime600().setCompTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCompTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeMm600 with another Field
	 *	@param value
	 */
   public void setCompTimeMm600(Field source) {
      message0002600.getCompileTime600().setCompTimeMm600(source);
   }  
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateDd600
	 *	@return compDateDd600
	 */
   public char[] getCompDateDd600() throws CFException  {              
   		return message0002600.getCompileDate600().getCompDateDd600();
   }

  
	/**
	*  set variable compDateDd600
	*  @param value
	**/
   public void setCompDateDd600(char[] value) throws CFException {
      message0002600.getCompileDate600().setCompDateDd600(value);
   } 

     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileDate600().setCompDateDd600(source, sourceIndex);
   	
   }
   
   public void setCompDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateDd600 with another Field
	 *	@param value
	 */
   public void setCompDateDd600(Field source) {
      message0002600.getCompileDate600().setCompDateDd600(source);
   }  
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateYyyy800
	 *	@return currDateYyyy800
	 */
   public char[] getCurrDateYyyy800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateYyyy800();
   }

  
	/**
	*  set variable currDateYyyy800
	*  @param value
	**/
   public void setCurrDateYyyy800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(value);
   } 

     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy800 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeHh600
	 *	@return compTimeHh600
	 */
   public char[] getCompTimeHh600() throws CFException  {              
   		return message0002600.getCompileTime600().getCompTimeHh600();
   }

  
	/**
	*  set variable compTimeHh600
	*  @param value
	**/
   public void setCompTimeHh600(char[] value) throws CFException {
      message0002600.getCompileTime600().setCompTimeHh600(value);
   } 

     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex) throws CFException {
      message0002600.getCompileTime600().setCompTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCompTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message0002600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeHh600 with another Field
	 *	@param value
	 */
   public void setCompTimeHh600(Field source) {
      message0002600.getCompileTime600().setCompTimeHh600(source);
   }  
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen) {
      message0002600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message0002600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeHh800
	 *	@return currTimeHh800
	 */
   public char[] getCurrTimeHh800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeHh800();
   }

  
	/**
	*  set variable currTimeHh800
	*  @param value
	**/
   public void setCurrTimeHh800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(value);
   } 

     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh800 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source);
   }  
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException  {              
   		return work.getCurrTimeHh600();
   }

  
	/**
	*  set variable currTimeHh600
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) throws CFException {
      work.setCurrTimeHh600(value);
   } 

	/**
	 *	Returns the value of whenTimeSs800
	 *	@return whenTimeSs800
	 */
   public char[] getWhenTimeSs800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeSs800();
   }

  
	/**
	*  set variable whenTimeSs800
	*  @param value
	**/
   public void setWhenTimeSs800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(value);
   } 

     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeSs800 with another Field
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source);
   }  
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateDd800
	 *	@return whenDateDd800
	 */
   public char[] getWhenDateDd800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateDd800();
   }

  
	/**
	*  set variable whenDateDd800
	*  @param value
	**/
   public void setWhenDateDd800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(value);
   } 

     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex);
   	
   }
   
   public void setWhenDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateDd800 with another Field
	 *	@param value
	 */
   public void setWhenDateDd800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source);
   }  
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeMm800
	 *	@return whenTimeMm800
	 */
   public char[] getWhenTimeMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeMm800();
   }

  
	/**
	*  set variable whenTimeMm800
	*  @param value
	**/
   public void setWhenTimeMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(value);
   } 

     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeMm800 with another Field
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source);
   }  
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateDd800
	 *	@return currDateDd800
	 */
   public char[] getCurrDateDd800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateDd800();
   }

  
	/**
	*  set variable currDateDd800
	*  @param value
	**/
   public void setCurrDateDd800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(value);
   } 

     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd800 with another Field
	 *	@param value
	 */
   public void setCurrDateDd800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source);
   }  
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateMm800
	 *	@return whenDateMm800
	 */
   public char[] getWhenDateMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateMm800();
   }

  
	/**
	*  set variable whenDateMm800
	*  @param value
	**/
   public void setWhenDateMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(value);
   } 

     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex);
   	
   }
   
   public void setWhenDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateMm800 with another Field
	 *	@param value
	 */
   public void setWhenDateMm800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source);
   }  
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += funcCurrentDate800.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += message0002600.hashCode();
       return str.hashCode();
    }

    public DisplayStartMessagesOutCtx clone() {
        DisplayStartMessagesOutCtx cloneObj = new DisplayStartMessagesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.message0002600 = new Message0002600();
        cloneObj.message0002600.set(message0002600.getClonedField());
        return cloneObj;
    }

    }

    public DisplayStartMessagesOutCtx getDisplayStartMessagesOutCtx() {
            return new DisplayStartMessagesOutCtx();
    }
     public class ProcessZlogRecordInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of holdSr2Ptr410
	 *	@return holdSr2Ptr410
	 */
	public short getHoldSr2Ptr410() throws CFException {        
   		return zlogPointers410.getHoldSr2Ptr410();
	}
	
	/**
	 * 	Update HoldSr2Ptr410 with the passed value
	 *	@param number
	 */
	public void setHoldSr2Ptr410(short number)  throws CFException{
		zlogPointers410.setHoldSr2Ptr410(number);
	}

	public void setHoldSr2Ptr410(int number)  throws CFException{
		zlogPointers410.setHoldSr2Ptr410((short)number);
	}

	public void setHoldSr2Ptr410(long number)  throws CFException{
		zlogPointers410.setHoldSr2Ptr410((short)number);
	}



	/**
	 *	Returns the value of isoMsg2Lnth410
	 *	@return isoMsg2Lnth410
	 */
	public short getIsoMsg2Lnth410() throws CFException {        
   		return zlogPointers410.getIsoMsg2Lnth410();
	}
	
	/**
	 * 	Update IsoMsg2Lnth410 with the passed value
	 *	@param number
	 */
	public void setIsoMsg2Lnth410(short number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410(number);
	}

	public void setIsoMsg2Lnth410(int number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410((short)number);
	}

	public void setIsoMsg2Lnth410(long number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410((short)number);
	}



	/**
	 *	Returns the value of mipZLogClass801
	 *	@return mipZLogClass801
	 */
   public char[] getMipZLogClass801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getMipZLogClassType801().getMipZLogClass801();
   }

  
	/**
	*  set variable mipZLogClass801
	*  @param value
	**/
   public void setMipZLogClass801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(value);
   } 

     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex);
   	
   }
   
   public void setMipZLogClass801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MipZLogClass801 with another Field
	 *	@param value
	 */
   public void setMipZLogClass801(Field source) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source);
   }  
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MipZLogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().getMipZLogClassType801().setMipZLogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srvreqHeader802
	 *	@return srvreqHeader802
	 */   
	 public SrvreqHeader802 getSrvreqHeader802() {
   	return zlogSr1Area802.getSrvreqHeader802();
   }

   /**
	* 	Update SrvreqHeader802 with the passed value
	*	@param value
	*/
   public void setSrvreqHeader802(char[] value) throws CFException {
      zlogSr1Area802.setSrvreqHeader802(value);
   }   

     /**
	 * 	Update SrvreqHeader802 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSrvreqHeader802(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	zlogSr1Area802.setSrvreqHeader802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrvreqHeader802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	zlogSr1Area802.setSrvreqHeader802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrvreqHeader802 with another Field
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source) {
   	zlogSr1Area802.setSrvreqHeader802(source);
   }  
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source, int sourceIndex,int sourceLen) {
   	zlogSr1Area802.setSrvreqHeader802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	zlogSr1Area802.setSrvreqHeader802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isoMsg2Ptr410
	 *	@return isoMsg2Ptr410
	 */
	public short getIsoMsg2Ptr410() throws CFException {        
   		return zlogPointers410.getIsoMsg2Ptr410();
	}
	
	/**
	 * 	Update IsoMsg2Ptr410 with the passed value
	 *	@param number
	 */
	public void setIsoMsg2Ptr410(short number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410(number);
	}

	public void setIsoMsg2Ptr410(int number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410((short)number);
	}

	public void setIsoMsg2Ptr410(long number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410((short)number);
	}



	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}



	/**
	 *	Returns the value of sf539Sr2Length
	 *	@return sf539Sr2Length
	 */
	public short getSf539Sr2Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr2Length();
	}
	
	/**
	 * 	Update Sf539Sr2Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr2Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length(number);
	}

	public void setSf539Sr2Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}

	public void setSf539Sr2Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}



	/**
	 *	Returns the value of charZ300
	 *	@return charZ300
	 */
   public char[] getCharZ300() throws CFException  {              
   		return work.getCharZ300();
   }

  
	/**
	*  set variable charZ300
	*  @param value
	**/
   public void setCharZ300(char[] value) throws CFException {
      work.setCharZ300(value);
   } 


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessZlogRecordOutCtx getProcessZlogRecordOutCtx() {
            return new ProcessZlogRecordOutCtx();
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
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ProcessZlogRecordInCtx clone() {
        ProcessZlogRecordInCtx cloneObj = new ProcessZlogRecordInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ProcessZlogRecordInCtx getProcessZlogRecordInCtx() {
            return new ProcessZlogRecordInCtx();
    }
     public class ProcessZlogRecordOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsg2Offset
	 *	@return sf539IsoMsg2Offset
	 */
	public short getSf539IsoMsg2Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg2Offset();
	}
	
	/**
	 * 	Update Sf539IsoMsg2Offset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg2Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset(number);
	}

	public void setSf539IsoMsg2Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset((short)number);
	}

	public void setSf539IsoMsg2Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Offset((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer2Lnth
	 *	@return sf539Trailer2Lnth
	 */
	public short getSf539Trailer2Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer2Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth(number);
	}

	public void setSf539Trailer2Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}

	public void setSf539Trailer2Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer2Offset
	 *	@return sf539Trailer2Offset
	 */
	public short getSf539Trailer2Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Offset();
	}
	
	/**
	 * 	Update Sf539Trailer2Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset(number);
	}

	public void setSf539Trailer2Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}

	public void setSf539Trailer2Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}



	/**
	 *	Returns the value of trailer2Lnth410
	 *	@return trailer2Lnth410
	 */
	public short getTrailer2Lnth410() throws CFException {        
   		return zlogPointers410.getTrailer2Lnth410();
	}
	
	/**
	 * 	Update Trailer2Lnth410 with the passed value
	 *	@param number
	 */
	public void setTrailer2Lnth410(short number)  throws CFException{
		zlogPointers410.setTrailer2Lnth410(number);
	}

	public void setTrailer2Lnth410(int number)  throws CFException{
		zlogPointers410.setTrailer2Lnth410((short)number);
	}

	public void setTrailer2Lnth410(long number)  throws CFException{
		zlogPointers410.setTrailer2Lnth410((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsg2Lnth
	 *	@return sf539IsoMsg2Lnth
	 */
	public short getSf539IsoMsg2Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg2Lnth();
	}
	
	/**
	 * 	Update Sf539IsoMsg2Lnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg2Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth(number);
	}

	public void setSf539IsoMsg2Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth((short)number);
	}

	public void setSf539IsoMsg2Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg2Lnth((short)number);
	}



	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of trailer2Ptr410
	 *	@return trailer2Ptr410
	 */
	public short getTrailer2Ptr410() throws CFException {        
   		return zlogPointers410.getTrailer2Ptr410();
	}
	
	/**
	 * 	Update Trailer2Ptr410 with the passed value
	 *	@param number
	 */
	public void setTrailer2Ptr410(short number)  throws CFException{
		zlogPointers410.setTrailer2Ptr410(number);
	}

	public void setTrailer2Ptr410(int number)  throws CFException{
		zlogPointers410.setTrailer2Ptr410((short)number);
	}

	public void setTrailer2Ptr410(long number)  throws CFException{
		zlogPointers410.setTrailer2Ptr410((short)number);
	}



	/**
	 *	Returns the value of trailer1Lnth410
	 *	@return trailer1Lnth410
	 */
	public short getTrailer1Lnth410() throws CFException {        
   		return zlogPointers410.getTrailer1Lnth410();
	}
	
	/**
	 * 	Update Trailer1Lnth410 with the passed value
	 *	@param number
	 */
	public void setTrailer1Lnth410(short number)  throws CFException{
		zlogPointers410.setTrailer1Lnth410(number);
	}

	public void setTrailer1Lnth410(int number)  throws CFException{
		zlogPointers410.setTrailer1Lnth410((short)number);
	}

	public void setTrailer1Lnth410(long number)  throws CFException{
		zlogPointers410.setTrailer1Lnth410((short)number);
	}



	/**
	 *	Returns the value of isoMsg2Lnth410
	 *	@return isoMsg2Lnth410
	 */
	public short getIsoMsg2Lnth410() throws CFException {        
   		return zlogPointers410.getIsoMsg2Lnth410();
	}
	
	/**
	 * 	Update IsoMsg2Lnth410 with the passed value
	 *	@param number
	 */
	public void setIsoMsg2Lnth410(short number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410(number);
	}

	public void setIsoMsg2Lnth410(int number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410((short)number);
	}

	public void setIsoMsg2Lnth410(long number)  throws CFException{
		zlogPointers410.setIsoMsg2Lnth410((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of isoMsg2Ptr410
	 *	@return isoMsg2Ptr410
	 */
	public short getIsoMsg2Ptr410() throws CFException {        
   		return zlogPointers410.getIsoMsg2Ptr410();
	}
	
	/**
	 * 	Update IsoMsg2Ptr410 with the passed value
	 *	@param number
	 */
	public void setIsoMsg2Ptr410(short number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410(number);
	}

	public void setIsoMsg2Ptr410(int number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410((short)number);
	}

	public void setIsoMsg2Ptr410(long number)  throws CFException{
		zlogPointers410.setIsoMsg2Ptr410((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of trailer1Ptr410
	 *	@return trailer1Ptr410
	 */
	public short getTrailer1Ptr410() throws CFException {        
   		return zlogPointers410.getTrailer1Ptr410();
	}
	
	/**
	 * 	Update Trailer1Ptr410 with the passed value
	 *	@param number
	 */
	public void setTrailer1Ptr410(short number)  throws CFException{
		zlogPointers410.setTrailer1Ptr410(number);
	}

	public void setTrailer1Ptr410(int number)  throws CFException{
		zlogPointers410.setTrailer1Ptr410((short)number);
	}

	public void setTrailer1Ptr410(long number)  throws CFException{
		zlogPointers410.setTrailer1Ptr410((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ProcessZlogRecordOutCtx clone() {
        ProcessZlogRecordOutCtx cloneObj = new ProcessZlogRecordOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ProcessZlogRecordOutCtx getProcessZlogRecordOutCtx() {
            return new ProcessZlogRecordOutCtx();
    }
     public class ExtractHeaderFieldsInCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     X86Int16Group800 x86Int16Group800 = Sf305120Ctx.this.getX86Int16Group800();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     X86Int32Group800 x86Int32Group800 = Sf305120Ctx.this.getX86Int32Group800();
     Z9Int32Group800 z9Int32Group800 = Sf305120Ctx.this.getZ9Int32Group800();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of error20300
	 *	@return error20300
	 */
	public short getError20300() throws CFException {        
   		return work.getError20300();
	}
	
	/**
	 * 	Update Error20300 with the passed value
	 *	@param number
	 */
	public void setError20300(short number)  throws CFException{
		work.setError20300(number);
	}

	public void setError20300(int number)  throws CFException{
		work.setError20300((short)number);
	}

	public void setError20300(long number)  throws CFException{
		work.setError20300((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {        
   		return programCounters400.getVardataLnth400();
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *	@param number
	 */
	public void setVardataLnth400(short number)  throws CFException{
		programCounters400.setVardataLnth400(number);
	}

	public void setVardataLnth400(int number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}

	public void setVardataLnth400(long number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}



	/**
	 *	Returns the value of mipZLogEtimeX801
	 *	@return mipZLogEtimeX801
	 */
   public char[] getMipZLogEtimeX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getMipZLogEtimeX801();
   }

  
	/**
	*  set variable mipZLogEtimeX801
	*  @param value
	**/
   public void setMipZLogEtimeX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(value);
   } 

     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex);
   	
   }
   
   public void setMipZLogEtimeX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MipZLogEtimeX801 with another Field
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source);
   }  
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr1LengthX801
	 *	@return zlogSr1LengthX801
	 */
   public char[] getZlogSr1LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr1LengthX801();
   }

  
	/**
	*  set variable zlogSr1LengthX801
	*  @param value
	**/
   public void setZlogSr1LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr1LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr1LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogRecord801
	 *	@return zlogRecord801
	 */   
	 public ZlogRecord801 getZlogRecord801() {
   	return zlogRecord801;
   }


	/**
	 *	Returns the value of sf539Sr2Length
	 *	@return sf539Sr2Length
	 */
	public short getSf539Sr2Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr2Length();
	}
	
	/**
	 * 	Update Sf539Sr2Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr2Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length(number);
	}

	public void setSf539Sr2Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}

	public void setSf539Sr2Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}



	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {        
   		return z9Int16Group800.getZ9Int16800();
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *	@param number
	 */
	public void setZ9Int16800(short number)  throws CFException{
		z9Int16Group800.setZ9Int16800(number);
	}

	public void setZ9Int16800(int number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}

	public void setZ9Int16800(long number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}



	/**
	 *	Returns the value of zlogSr2LengthX801
	 *	@return zlogSr2LengthX801
	 */
   public char[] getZlogSr2LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr2LengthX801();
   }

  
	/**
	*  set variable zlogSr2LengthX801
	*  @param value
	**/
   public void setZlogSr2LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr2LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr2LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of zlogVariableData801
	 *	@return zlogVariableData801
	 */
   public char[] getZlogVariableData801() throws CFException  {              
   		return zlogRecord801.getZlogVariableData801();
   }

  
	/**
	*  set variable zlogVariableData801
	*  @param value
	**/
   public void setZlogVariableData801(char[] value) throws CFException {
      zlogRecord801.setZlogVariableData801(value);
   } 

     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.setZlogVariableData801(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData801 with another Field
	 *	@param value
	 */
   public void setZlogVariableData801(Field source) {
      zlogRecord801.setZlogVariableData801(source);
   }  
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32800
	 *	@return z9Int32800
	 */
	public int getZ9Int32800() throws CFException {        
   		return z9Int32Group800.getZ9Int32800();
	}
	
	/**
	 * 	Update Z9Int32800 with the passed value
	 *	@param number
	 */
	public void setZ9Int32800(int number)  throws CFException{
		z9Int32Group800.setZ9Int32800(number);
	}


	public void setZ9Int32800(long number)  throws CFException{
		z9Int32Group800.setZ9Int32800((int)number);
	}


	/**
	 *	Returns the value of error22300
	 *	@return error22300
	 */
	public short getError22300() throws CFException {        
   		return work.getError22300();
	}
	
	/**
	 * 	Update Error22300 with the passed value
	 *	@param number
	 */
	public void setError22300(short number)  throws CFException{
		work.setError22300(number);
	}

	public void setError22300(int number)  throws CFException{
		work.setError22300((short)number);
	}

	public void setError22300(long number)  throws CFException{
		work.setError22300((short)number);
	}



	/**
	 *	Returns the value of error21300
	 *	@return error21300
	 */
	public short getError21300() throws CFException {        
   		return work.getError21300();
	}
	
	/**
	 * 	Update Error21300 with the passed value
	 *	@param number
	 */
	public void setError21300(short number)  throws CFException{
		work.setError21300(number);
	}

	public void setError21300(int number)  throws CFException{
		work.setError21300((short)number);
	}

	public void setError21300(long number)  throws CFException{
		work.setError21300((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ExtractHeaderFieldsOutCtx getExtractHeaderFieldsOutCtx() {
            return new ExtractHeaderFieldsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += x86Int16Group800.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += z9Int16Group800.hashCode();
        str += x86Int32Group800.hashCode();
        str += z9Int32Group800.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ExtractHeaderFieldsInCtx clone() {
        ExtractHeaderFieldsInCtx cloneObj = new ExtractHeaderFieldsInCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x86Int16Group800 = new X86Int16Group800();
        cloneObj.x86Int16Group800.set(x86Int16Group800.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ExtractHeaderFieldsInCtx getExtractHeaderFieldsInCtx() {
            return new ExtractHeaderFieldsInCtx();
    }
     public class ExtractHeaderFieldsOutCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     X86Int16Group800 x86Int16Group800 = Sf305120Ctx.this.getX86Int16Group800();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     X86Int32Group800 x86Int32Group800 = Sf305120Ctx.this.getX86Int32Group800();
     Z9Int32Group800 z9Int32Group800 = Sf305120Ctx.this.getZ9Int32Group800();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of x86Int32B1800
	 *	@return x86Int32B1800
	 */
   public char[] getX86Int32B1800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B1800();
   }

  
	/**
	*  set variable x86Int32B1800
	*  @param value
	**/
   public void setX86Int32B1800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(value);
   } 

     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B1800 with another Field
	 *	@param value
	 */
   public void setX86Int32B1800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source);
   }  
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ZlogElapsedTime
	 *	@return sf539ZlogElapsedTime
	 */
	public int getSf539ZlogElapsedTime() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogElapsedTime();
	}
	
	/**
	 * 	Update Sf539ZlogElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf539ZlogElapsedTime(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogElapsedTime(number);
	}


	public void setSf539ZlogElapsedTime(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogElapsedTime((int)number);
	}


	/**
	 *	Returns the value of zlogSr1LengthX801
	 *	@return zlogSr1LengthX801
	 */
   public char[] getZlogSr1LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr1LengthX801();
   }

  
	/**
	*  set variable zlogSr1LengthX801
	*  @param value
	**/
   public void setZlogSr1LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr1LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr1LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539Sr2Length
	 *	@return sf539Sr2Length
	 */
	public short getSf539Sr2Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr2Length();
	}
	
	/**
	 * 	Update Sf539Sr2Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr2Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length(number);
	}

	public void setSf539Sr2Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}

	public void setSf539Sr2Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of z9Int16B1800
	 *	@return z9Int16B1800
	 */
   public char[] getZ9Int16B1800() throws CFException  {              
   		return z9Int16Group800.getZ9Int16X800().getZ9Int16B1800();
   }

  
	/**
	*  set variable z9Int16B1800
	*  @param value
	**/
   public void setZ9Int16B1800(char[] value) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(value);
   } 

     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex);
   	
   }
   
   public void setZ9Int16B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int16B1800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source);
   }  
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceTable
	 *	@return sf539ServiceTable
	 */   
	 public Sf539ServiceTable getSf539ServiceTable(int index) {
   	return sf539Sf305020ControlBlock.getSf539ServiceTable(index);
   }

    public List<Sf539ServiceTable> getSf539ServiceTable() {
        return sf539Sf305020ControlBlock.getSf539ServiceTable();
    }
   /**
	* 	Update Sf539ServiceTable with the passed value
	*	@param value
	*/
   public void setSf539ServiceTable(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539ServiceTable((index),value);
   }   


	/**
	 *	Returns the value of x86Int16B1800
	 *	@return x86Int16B1800
	 */
   public char[] getX86Int16B1800() throws CFException  {              
   		return x86Int16Group800.getX86Int16X800().getX86Int16B1800();
   }

  
	/**
	*  set variable x86Int16B1800
	*  @param value
	**/
   public void setX86Int16B1800(char[] value) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(value);
   } 

     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex);
   	
   }
   
   public void setX86Int16B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16B1800 with another Field
	 *	@param value
	 */
   public void setX86Int16B1800(Field source) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source);
   }  
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr2LengthX801
	 *	@return zlogSr2LengthX801
	 */
   public char[] getZlogSr2LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr2LengthX801();
   }

  
	/**
	*  set variable zlogSr2LengthX801
	*  @param value
	**/
   public void setZlogSr2LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr2LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr2LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr2LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr2LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr2LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogVariableData801
	 *	@return zlogVariableData801
	 */
   public char[] getZlogVariableData801() throws CFException  {              
   		return zlogRecord801.getZlogVariableData801();
   }

  
	/**
	*  set variable zlogVariableData801
	*  @param value
	**/
   public void setZlogVariableData801(char[] value) throws CFException {
      zlogRecord801.setZlogVariableData801(value);
   } 

     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.setZlogVariableData801(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData801 with another Field
	 *	@param value
	 */
   public void setZlogVariableData801(Field source) {
      zlogRecord801.setZlogVariableData801(source);
   }  
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.setZlogVariableData801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int16B2800
	 *	@return z9Int16B2800
	 */
   public char[] getZ9Int16B2800() throws CFException  {              
   		return z9Int16Group800.getZ9Int16X800().getZ9Int16B2800();
   }

  
	/**
	*  set variable z9Int16B2800
	*  @param value
	**/
   public void setZ9Int16B2800(char[] value) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(value);
   } 

     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex);
   	
   }
   
   public void setZ9Int16B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int16B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source);
   }  
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of error22300
	 *	@return error22300
	 */
	public short getError22300() throws CFException {        
   		return work.getError22300();
	}
	
	/**
	 * 	Update Error22300 with the passed value
	 *	@param number
	 */
	public void setError22300(short number)  throws CFException{
		work.setError22300(number);
	}

	public void setError22300(int number)  throws CFException{
		work.setError22300((short)number);
	}

	public void setError22300(long number)  throws CFException{
		work.setError22300((short)number);
	}



	/**
	 *	Returns the value of z9Int32B1800
	 *	@return z9Int32B1800
	 */
   public char[] getZ9Int32B1800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B1800();
   }

  
	/**
	*  set variable z9Int32B1800
	*  @param value
	**/
   public void setZ9Int32B1800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(value);
   } 

     /**
	 * 	Update Z9Int32B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B1800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B1800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source);
   }  
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32B3800
	 *	@return z9Int32B3800
	 */
   public char[] getZ9Int32B3800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B3800();
   }

  
	/**
	*  set variable z9Int32B3800
	*  @param value
	**/
   public void setZ9Int32B3800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(value);
   } 

     /**
	 * 	Update Z9Int32B3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B3800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B3800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source);
   }  
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of error20300
	 *	@return error20300
	 */
	public short getError20300() throws CFException {        
   		return work.getError20300();
	}
	
	/**
	 * 	Update Error20300 with the passed value
	 *	@param number
	 */
	public void setError20300(short number)  throws CFException{
		work.setError20300(number);
	}

	public void setError20300(int number)  throws CFException{
		work.setError20300((short)number);
	}

	public void setError20300(long number)  throws CFException{
		work.setError20300((short)number);
	}



	/**
	 *	Returns the value of zlogSr2Area803
	 *	@return zlogSr2Area803
	 */
   public char[] getZlogSr2Area803() throws CFException  {              
   		return work.getZlogSr2Area803();
   }

  
	/**
	*  set variable zlogSr2Area803
	*  @param value
	**/
   public void setZlogSr2Area803(char[] value) throws CFException {
      work.setZlogSr2Area803(value);
   } 

	/**
	 *	Returns the value of x86Int32X800
	 *	@return x86Int32X800
	 */   
	 public X86Int32X800 getX86Int32X800() {
   	return x86Int32Group800.getX86Int32X800();
   }

   /**
	* 	Update X86Int32X800 with the passed value
	*	@param value
	*/
   public void setX86Int32X800(char[] value) throws CFException {
      x86Int32Group800.setX86Int32X800(value);
   }   

     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32X800 with another Field
	 *	@param value
	 */
   public void setX86Int32X800(Field source) {
   	x86Int32Group800.setX86Int32X800(source);
   }  
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of mipZLogEtimeX801
	 *	@return mipZLogEtimeX801
	 */
   public char[] getMipZLogEtimeX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getMipZLogEtimeX801();
   }

  
	/**
	*  set variable mipZLogEtimeX801
	*  @param value
	**/
   public void setMipZLogEtimeX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(value);
   } 

     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex);
   	
   }
   
   public void setMipZLogEtimeX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MipZLogEtimeX801 with another Field
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source);
   }  
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MipZLogEtimeX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMipZLogEtimeX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setMipZLogEtimeX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32B4800
	 *	@return z9Int32B4800
	 */
   public char[] getZ9Int32B4800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B4800();
   }

  
	/**
	*  set variable z9Int32B4800
	*  @param value
	**/
   public void setZ9Int32B4800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(value);
   } 

     /**
	 * 	Update Z9Int32B4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B4800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B4800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source);
   }  
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32B2800
	 *	@return z9Int32B2800
	 */
   public char[] getZ9Int32B2800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B2800();
   }

  
	/**
	*  set variable z9Int32B2800
	*  @param value
	**/
   public void setZ9Int32B2800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(value);
   } 

     /**
	 * 	Update Z9Int32B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B2800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source);
   }  
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32B4800
	 *	@return x86Int32B4800
	 */
   public char[] getX86Int32B4800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B4800();
   }

  
	/**
	*  set variable x86Int32B4800
	*  @param value
	**/
   public void setX86Int32B4800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(value);
   } 

     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B4800 with another Field
	 *	@param value
	 */
   public void setX86Int32B4800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source);
   }  
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {        
   		return z9Int16Group800.getZ9Int16800();
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *	@param number
	 */
	public void setZ9Int16800(short number)  throws CFException{
		z9Int16Group800.setZ9Int16800(number);
	}

	public void setZ9Int16800(int number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}

	public void setZ9Int16800(long number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}



	/**
	 *	Returns the value of x86Int16X800
	 *	@return x86Int16X800
	 */   
	 public X86Int16X800 getX86Int16X800() {
   	return x86Int16Group800.getX86Int16X800();
   }

   /**
	* 	Update X86Int16X800 with the passed value
	*	@param value
	*/
   public void setX86Int16X800(char[] value) throws CFException {
      x86Int16Group800.setX86Int16X800(value);
   }   

     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16X800 with another Field
	 *	@param value
	 */
   public void setX86Int16X800(Field source) {
   	x86Int16Group800.setX86Int16X800(source);
   }  
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32B3800
	 *	@return x86Int32B3800
	 */
   public char[] getX86Int32B3800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B3800();
   }

  
	/**
	*  set variable x86Int32B3800
	*  @param value
	**/
   public void setX86Int32B3800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(value);
   } 

     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B3800 with another Field
	 *	@param value
	 */
   public void setX86Int32B3800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source);
   }  
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32B2800
	 *	@return x86Int32B2800
	 */
   public char[] getX86Int32B2800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B2800();
   }

  
	/**
	*  set variable x86Int32B2800
	*  @param value
	**/
   public void setX86Int32B2800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(value);
   } 

     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B2800 with another Field
	 *	@param value
	 */
   public void setX86Int32B2800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source);
   }  
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32800
	 *	@return z9Int32800
	 */
	public int getZ9Int32800() throws CFException {        
   		return z9Int32Group800.getZ9Int32800();
	}
	
	/**
	 * 	Update Z9Int32800 with the passed value
	 *	@param number
	 */
	public void setZ9Int32800(int number)  throws CFException{
		z9Int32Group800.setZ9Int32800(number);
	}


	public void setZ9Int32800(long number)  throws CFException{
		z9Int32Group800.setZ9Int32800((int)number);
	}


	/**
	 *	Returns the value of x86Int16B2800
	 *	@return x86Int16B2800
	 */
   public char[] getX86Int16B2800() throws CFException  {              
   		return x86Int16Group800.getX86Int16X800().getX86Int16B2800();
   }

  
	/**
	*  set variable x86Int16B2800
	*  @param value
	**/
   public void setX86Int16B2800(char[] value) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(value);
   } 

     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex);
   	
   }
   
   public void setX86Int16B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16B2800 with another Field
	 *	@param value
	 */
   public void setX86Int16B2800(Field source) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source);
   }  
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of error21300
	 *	@return error21300
	 */
	public short getError21300() throws CFException {        
   		return work.getError21300();
	}
	
	/**
	 * 	Update Error21300 with the passed value
	 *	@param number
	 */
	public void setError21300(short number)  throws CFException{
		work.setError21300(number);
	}

	public void setError21300(int number)  throws CFException{
		work.setError21300((short)number);
	}

	public void setError21300(long number)  throws CFException{
		work.setError21300((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += x86Int16Group800.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += z9Int16Group800.hashCode();
        str += x86Int32Group800.hashCode();
        str += z9Int32Group800.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ExtractHeaderFieldsOutCtx clone() {
        ExtractHeaderFieldsOutCtx cloneObj = new ExtractHeaderFieldsOutCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x86Int16Group800 = new X86Int16Group800();
        cloneObj.x86Int16Group800.set(x86Int16Group800.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ExtractHeaderFieldsOutCtx getExtractHeaderFieldsOutCtx() {
            return new ExtractHeaderFieldsOutCtx();
    }
     public class ParseServreq1InCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     X86Int16Group800 x86Int16Group800 = Sf305120Ctx.this.getX86Int16Group800();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of rhTotalLnth810
	 *	@return rhTotalLnth810
	 */
	public short getRhTotalLnth810() throws CFException {        
   		return work.getRhTotalLnth810();
	}
	
	/**
	 * 	Update RhTotalLnth810 with the passed value
	 *	@param number
	 */
	public void setRhTotalLnth810(short number)  throws CFException{
		work.setRhTotalLnth810(number);
	}

	public void setRhTotalLnth810(int number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}

	public void setRhTotalLnth810(long number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {        
   		return programCounters400.getVardataLnth400();
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *	@param number
	 */
	public void setVardataLnth400(short number)  throws CFException{
		programCounters400.setVardataLnth400(number);
	}

	public void setVardataLnth400(int number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}

	public void setVardataLnth400(long number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}



	/**
	 *	Returns the value of zlogSr1LengthX801
	 *	@return zlogSr1LengthX801
	 */
   public char[] getZlogSr1LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr1LengthX801();
   }

  
	/**
	*  set variable zlogSr1LengthX801
	*  @param value
	**/
   public void setZlogSr1LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr1LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr1LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of error17300
	 *	@return error17300
	 */
	public short getError17300() throws CFException {        
   		return work.getError17300();
	}
	
	/**
	 * 	Update Error17300 with the passed value
	 *	@param number
	 */
	public void setError17300(short number)  throws CFException{
		work.setError17300(number);
	}

	public void setError17300(int number)  throws CFException{
		work.setError17300((short)number);
	}

	public void setError17300(long number)  throws CFException{
		work.setError17300((short)number);
	}



	/**
	 *	Returns the value of servInfoCount410
	 *	@return servInfoCount410
	 */
	public short getServInfoCount410() throws CFException {        
   		return zlogPointers410.getServInfoCount410();
	}
	
	/**
	 * 	Update ServInfoCount410 with the passed value
	 *	@param number
	 */
	public void setServInfoCount410(short number)  throws CFException{
		zlogPointers410.setServInfoCount410(number);
	}

	public void setServInfoCount410(int number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}

	public void setServInfoCount410(long number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}



	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {        
   		return z9Int16Group800.getZ9Int16800();
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *	@param number
	 */
	public void setZ9Int16800(short number)  throws CFException{
		z9Int16Group800.setZ9Int16800(number);
	}

	public void setZ9Int16800(int number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}

	public void setZ9Int16800(long number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}



	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ParseServreq1OutCtx getParseServreq1OutCtx() {
            return new ParseServreq1OutCtx();
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
        str += x86Int16Group800.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += serviceInfo820.hashCode();
        str += z9Int16Group800.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ParseServreq1InCtx clone() {
        ParseServreq1InCtx cloneObj = new ParseServreq1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x86Int16Group800 = new X86Int16Group800();
        cloneObj.x86Int16Group800.set(x86Int16Group800.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreq1InCtx getParseServreq1InCtx() {
            return new ParseServreq1InCtx();
    }
     public class ParseServreq1OutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     X86Int16Group800 x86Int16Group800 = Sf305120Ctx.this.getX86Int16Group800();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     ZlogRecord801 zlogRecord801 = Sf305120Ctx.this.getZlogRecord801();

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr1LengthX801
	 *	@return zlogSr1LengthX801
	 */
   public char[] getZlogSr1LengthX801() throws CFException  {              
   		return zlogRecord801.getFixedHeader801().getZlogSr1LengthX801();
   }

  
	/**
	*  set variable zlogSr1LengthX801
	*  @param value
	**/
   public void setZlogSr1LengthX801(char[] value) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(value);
   } 

     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex) throws CFException {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex);
   	
   }
   
   public void setZlogSr1LengthX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogSr1LengthX801 with another Field
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source);
   }  
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogSr1LengthX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogSr1LengthX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecord801.getFixedHeader801().setZlogSr1LengthX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srSub400
	 *	@return srSub400
	 */
	public short getSrSub400() throws CFException {        
   		return programCounters400.getSrSub400();
	}
	
	/**
	 * 	Update SrSub400 with the passed value
	 *	@param number
	 */
	public void setSrSub400(short number)  throws CFException{
		programCounters400.setSrSub400(number);
	}

	public void setSrSub400(int number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}

	public void setSrSub400(long number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}



	/**
	 *	Returns the value of z9Int16B1800
	 *	@return z9Int16B1800
	 */
   public char[] getZ9Int16B1800() throws CFException  {              
   		return z9Int16Group800.getZ9Int16X800().getZ9Int16B1800();
   }

  
	/**
	*  set variable z9Int16B1800
	*  @param value
	**/
   public void setZ9Int16B1800(char[] value) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(value);
   } 

     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex);
   	
   }
   
   public void setZ9Int16B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int16B1800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source);
   }  
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of error17300
	 *	@return error17300
	 */
	public short getError17300() throws CFException {        
   		return work.getError17300();
	}
	
	/**
	 * 	Update Error17300 with the passed value
	 *	@param number
	 */
	public void setError17300(short number)  throws CFException{
		work.setError17300(number);
	}

	public void setError17300(int number)  throws CFException{
		work.setError17300((short)number);
	}

	public void setError17300(long number)  throws CFException{
		work.setError17300((short)number);
	}



	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {        
   		return z9Int16Group800.getZ9Int16800();
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *	@param number
	 */
	public void setZ9Int16800(short number)  throws CFException{
		z9Int16Group800.setZ9Int16800(number);
	}

	public void setZ9Int16800(int number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}

	public void setZ9Int16800(long number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}



	/**
	 *	Returns the value of x86Int16X800
	 *	@return x86Int16X800
	 */   
	 public X86Int16X800 getX86Int16X800() {
   	return x86Int16Group800.getX86Int16X800();
   }

   /**
	* 	Update X86Int16X800 with the passed value
	*	@param value
	*/
   public void setX86Int16X800(char[] value) throws CFException {
      x86Int16Group800.setX86Int16X800(value);
   }   

     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16X800 with another Field
	 *	@param value
	 */
   public void setX86Int16X800(Field source) {
   	x86Int16Group800.setX86Int16X800(source);
   }  
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int16Group800.setX86Int16X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int16B1800
	 *	@return x86Int16B1800
	 */
   public char[] getX86Int16B1800() throws CFException  {              
   		return x86Int16Group800.getX86Int16X800().getX86Int16B1800();
   }

  
	/**
	*  set variable x86Int16B1800
	*  @param value
	**/
   public void setX86Int16B1800(char[] value) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(value);
   } 

     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex);
   	
   }
   
   public void setX86Int16B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16B1800 with another Field
	 *	@param value
	 */
   public void setX86Int16B1800(Field source) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source);
   }  
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int16B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of z9Int16B2800
	 *	@return z9Int16B2800
	 */
   public char[] getZ9Int16B2800() throws CFException  {              
   		return z9Int16Group800.getZ9Int16X800().getZ9Int16B2800();
   }

  
	/**
	*  set variable z9Int16B2800
	*  @param value
	**/
   public void setZ9Int16B2800(char[] value) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(value);
   } 

     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex);
   	
   }
   
   public void setZ9Int16B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int16B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source);
   }  
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sr1Length400
	 *	@return sr1Length400
	 */
	public short getSr1Length400() throws CFException {        
   		return programCounters400.getSr1Length400();
	}
	
	/**
	 * 	Update Sr1Length400 with the passed value
	 *	@param number
	 */
	public void setSr1Length400(short number)  throws CFException{
		programCounters400.setSr1Length400(number);
	}

	public void setSr1Length400(int number)  throws CFException{
		programCounters400.setSr1Length400((short)number);
	}

	public void setSr1Length400(long number)  throws CFException{
		programCounters400.setSr1Length400((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of x86Int16B2800
	 *	@return x86Int16B2800
	 */
   public char[] getX86Int16B2800() throws CFException  {              
   		return x86Int16Group800.getX86Int16X800().getX86Int16B2800();
   }

  
	/**
	*  set variable x86Int16B2800
	*  @param value
	**/
   public void setX86Int16B2800(char[] value) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(value);
   } 

     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex) throws CFException {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex);
   	
   }
   
   public void setX86Int16B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int16B2800 with another Field
	 *	@param value
	 */
   public void setX86Int16B2800(Field source) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source);
   }  
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int16Group800.getX86Int16X800().setX86Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += x86Int16Group800.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += serviceInfo820.hashCode();
        str += z9Int16Group800.hashCode();
        str += zlogPointers410.hashCode();
        str += zlogRecord801.hashCode();
       return str.hashCode();
    }

    public ParseServreq1OutCtx clone() {
        ParseServreq1OutCtx cloneObj = new ParseServreq1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x86Int16Group800 = new X86Int16Group800();
        cloneObj.x86Int16Group800.set(x86Int16Group800.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.zlogRecord801 = new ZlogRecord801();
        cloneObj.zlogRecord801.set(zlogRecord801.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreq1OutCtx getParseServreq1OutCtx() {
            return new ParseServreq1OutCtx();
    }
     public class ParseServreq2InCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of error18300
	 *	@return error18300
	 */
	public short getError18300() throws CFException {        
   		return work.getError18300();
	}
	
	/**
	 * 	Update Error18300 with the passed value
	 *	@param number
	 */
	public void setError18300(short number)  throws CFException{
		work.setError18300(number);
	}

	public void setError18300(int number)  throws CFException{
		work.setError18300((short)number);
	}

	public void setError18300(long number)  throws CFException{
		work.setError18300((short)number);
	}



	/**
	 *	Returns the value of zlogSr2Area803
	 *	@return zlogSr2Area803
	 */
   public char[] getZlogSr2Area803() throws CFException  {              
   		return work.getZlogSr2Area803();
   }

  
	/**
	*  set variable zlogSr2Area803
	*  @param value
	**/
   public void setZlogSr2Area803(char[] value) throws CFException {
      work.setZlogSr2Area803(value);
   } 

	/**
	 *	Returns the value of servInfoCount410
	 *	@return servInfoCount410
	 */
	public short getServInfoCount410() throws CFException {        
   		return zlogPointers410.getServInfoCount410();
	}
	
	/**
	 * 	Update ServInfoCount410 with the passed value
	 *	@param number
	 */
	public void setServInfoCount410(short number)  throws CFException{
		zlogPointers410.setServInfoCount410(number);
	}

	public void setServInfoCount410(int number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}

	public void setServInfoCount410(long number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}



	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of rhTotalLnth810
	 *	@return rhTotalLnth810
	 */
	public short getRhTotalLnth810() throws CFException {        
   		return work.getRhTotalLnth810();
	}
	
	/**
	 * 	Update RhTotalLnth810 with the passed value
	 *	@param number
	 */
	public void setRhTotalLnth810(short number)  throws CFException{
		work.setRhTotalLnth810(number);
	}

	public void setRhTotalLnth810(int number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}

	public void setRhTotalLnth810(long number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {        
   		return work.getBinary2300();
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *	@param number
	 */
	public void setBinary2300(short number)  throws CFException{
		work.setBinary2300(number);
	}

	public void setBinary2300(int number)  throws CFException{
		work.setBinary2300((short)number);
	}

	public void setBinary2300(long number)  throws CFException{
		work.setBinary2300((short)number);
	}



	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {        
   		return programCounters400.getVardataLnth400();
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *	@param number
	 */
	public void setVardataLnth400(short number)  throws CFException{
		programCounters400.setVardataLnth400(number);
	}

	public void setVardataLnth400(int number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}

	public void setVardataLnth400(long number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ParseServreq2OutCtx getParseServreq2OutCtx() {
            return new ParseServreq2OutCtx();
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
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += serviceInfo820.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServreq2InCtx clone() {
        ParseServreq2InCtx cloneObj = new ParseServreq2InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreq2InCtx getParseServreq2InCtx() {
            return new ParseServreq2InCtx();
    }
     public class ParseServreq2OutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of error18300
	 *	@return error18300
	 */
	public short getError18300() throws CFException {        
   		return work.getError18300();
	}
	
	/**
	 * 	Update Error18300 with the passed value
	 *	@param number
	 */
	public void setError18300(short number)  throws CFException{
		work.setError18300(number);
	}

	public void setError18300(int number)  throws CFException{
		work.setError18300((short)number);
	}

	public void setError18300(long number)  throws CFException{
		work.setError18300((short)number);
	}



	/**
	 *	Returns the value of zlogSr2Area803
	 *	@return zlogSr2Area803
	 */
   public char[] getZlogSr2Area803() throws CFException  {              
   		return work.getZlogSr2Area803();
   }

  
	/**
	*  set variable zlogSr2Area803
	*  @param value
	**/
   public void setZlogSr2Area803(char[] value) throws CFException {
      work.setZlogSr2Area803(value);
   } 

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {        
   		return work.getBinary2300();
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *	@param number
	 */
	public void setBinary2300(short number)  throws CFException{
		work.setBinary2300(number);
	}

	public void setBinary2300(int number)  throws CFException{
		work.setBinary2300((short)number);
	}

	public void setBinary2300(long number)  throws CFException{
		work.setBinary2300((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of srSub400
	 *	@return srSub400
	 */
	public short getSrSub400() throws CFException {        
   		return programCounters400.getSrSub400();
	}
	
	/**
	 * 	Update SrSub400 with the passed value
	 *	@param number
	 */
	public void setSrSub400(short number)  throws CFException{
		programCounters400.setSrSub400(number);
	}

	public void setSrSub400(int number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}

	public void setSrSub400(long number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += serviceInfo820.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServreq2OutCtx clone() {
        ParseServreq2OutCtx cloneObj = new ParseServreq2OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreq2OutCtx getParseServreq2OutCtx() {
            return new ParseServreq2OutCtx();
    }
     public class ProcessClogRecordInCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ZlogRecordGroup900 zlogRecordGroup900 = Sf305120Ctx.this.getZlogRecordGroup900();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     UnknownHeader299 unknownHeader299 = Sf305120Ctx.this.getUnknownHeader299();

	/**
	 *	Returns the value of clogRecord801
	 *	@return clogRecord801
	 */   
	 public ClogRecord801 getClogRecord801() {
   	return clogRecord801;
   }


	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of literalOe300
	 *	@return literalOe300
	 */
   public char[] getLiteralOe300() throws CFException  {              
   		return work.getLiteralOe300();
   }

  
	/**
	*  set variable literalOe300
	*  @param value
	**/
   public void setLiteralOe300(char[] value) throws CFException {
      work.setLiteralOe300(value);
   } 

	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of zlogRecordGroup900
	 *	@return zlogRecordGroup900
	 */   
	 public ZlogRecordGroup900 getZlogRecordGroup900() {
   	return zlogRecordGroup900;
   }


	/**
	 *	Returns the value of literalEs300
	 *	@return literalEs300
	 */
   public char[] getLiteralEs300() throws CFException  {              
   		return work.getLiteralEs300();
   }

  
	/**
	*  set variable literalEs300
	*  @param value
	**/
   public void setLiteralEs300(char[] value) throws CFException {
      work.setLiteralEs300(value);
   } 

	/**
	 *	Returns the value of zlogRecord900
	 *	@return zlogRecord900
	 */
   public char[] getZlogRecord900() throws CFException  {              
   		return zlogRecordGroup900.getZlogRecord900();
   }

  
	/**
	*  set variable zlogRecord900
	*  @param value
	**/
   public void setZlogRecord900(char[] value) throws CFException {
      zlogRecordGroup900.setZlogRecord900(value);
   } 

     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex) throws CFException {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex);
   	
   }
   
   public void setZlogRecord900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogRecord900 with another Field
	 *	@param value
	 */
   public void setZlogRecord900(Field source) {
      zlogRecordGroup900.setZlogRecord900(source);
   }  
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessClogRecordOutCtx getProcessClogRecordOutCtx() {
            return new ProcessClogRecordOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += zlogRecordGroup900.hashCode();
        str += programCounters400.hashCode();
        str += classCLogRecord260.hashCode();
        str += unknownHeader299.hashCode();
       return str.hashCode();
    }

    public ProcessClogRecordInCtx clone() {
        ProcessClogRecordInCtx cloneObj = new ProcessClogRecordInCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogRecordGroup900 = new ZlogRecordGroup900();
        cloneObj.zlogRecordGroup900.set(zlogRecordGroup900.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.unknownHeader299 = new UnknownHeader299();
        cloneObj.unknownHeader299.set(unknownHeader299.getClonedField());
        return cloneObj;
    }

    }

    public ProcessClogRecordInCtx getProcessClogRecordInCtx() {
            return new ProcessClogRecordInCtx();
    }
     public class ProcessClogRecordOutCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ZlogRecordGroup900 zlogRecordGroup900 = Sf305120Ctx.this.getZlogRecordGroup900();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     UnknownHeader299 unknownHeader299 = Sf305120Ctx.this.getUnknownHeader299();

	/**
	 *	Returns the value of clogRecord801
	 *	@return clogRecord801
	 */   
	 public ClogRecord801 getClogRecord801() {
   	return clogRecord801;
   }


	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {        
   		return work.getError4300();
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *	@param number
	 */
	public void setError4300(short number)  throws CFException{
		work.setError4300(number);
	}

	public void setError4300(int number)  throws CFException{
		work.setError4300((short)number);
	}

	public void setError4300(long number)  throws CFException{
		work.setError4300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of zlogRecord900
	 *	@return zlogRecord900
	 */
   public char[] getZlogRecord900() throws CFException  {              
   		return zlogRecordGroup900.getZlogRecord900();
   }

  
	/**
	*  set variable zlogRecord900
	*  @param value
	**/
   public void setZlogRecord900(char[] value) throws CFException {
      zlogRecordGroup900.setZlogRecord900(value);
   } 

     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex) throws CFException {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex);
   	
   }
   
   public void setZlogRecord900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogRecord900 with another Field
	 *	@param value
	 */
   public void setZlogRecord900(Field source) {
      zlogRecordGroup900.setZlogRecord900(source);
   }  
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogRecordGroup900.setZlogRecord900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of unknownHeader299
	 *	@return unknownHeader299
	 */   
	 public UnknownHeader299 getUnknownHeader299() {
   	return unknownHeader299;
   }


	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of uuHeaderId299
	 *	@return uuHeaderId299
	 */
   public char[] getUuHeaderId299() throws CFException  {              
   		return unknownHeader299.getUuHeaderId299();
   }

  
	/**
	*  set variable uuHeaderId299
	*  @param value
	**/
   public void setUuHeaderId299(char[] value) throws CFException {
      unknownHeader299.setUuHeaderId299(value);
   } 

     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex) throws CFException {
      unknownHeader299.setUuHeaderId299(source, sourceIndex);
   	
   }
   
   public void setUuHeaderId299(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UuHeaderId299 with another Field
	 *	@param value
	 */
   public void setUuHeaderId299(Field source) {
      unknownHeader299.setUuHeaderId299(source);
   }  
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += zlogRecordGroup900.hashCode();
        str += programCounters400.hashCode();
        str += classCLogRecord260.hashCode();
        str += unknownHeader299.hashCode();
       return str.hashCode();
    }

    public ProcessClogRecordOutCtx clone() {
        ProcessClogRecordOutCtx cloneObj = new ProcessClogRecordOutCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogRecordGroup900 = new ZlogRecordGroup900();
        cloneObj.zlogRecordGroup900.set(zlogRecordGroup900.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.unknownHeader299 = new UnknownHeader299();
        cloneObj.unknownHeader299.set(unknownHeader299.getClonedField());
        return cloneObj;
    }

    }

    public ProcessClogRecordOutCtx getProcessClogRecordOutCtx() {
            return new ProcessClogRecordOutCtx();
    }
     public class ProcessServiceFieldsInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }



        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessServiceFieldsOutCtx getProcessServiceFieldsOutCtx() {
            return new ProcessServiceFieldsOutCtx();
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
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessServiceFieldsInCtx clone() {
        ProcessServiceFieldsInCtx cloneObj = new ProcessServiceFieldsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessServiceFieldsInCtx getProcessServiceFieldsInCtx() {
            return new ProcessServiceFieldsInCtx();
    }
     public class ProcessServiceFieldsOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of loByte800
	 *	@return loByte800
	 */
   public char[] getLoByte800() throws CFException  {              
   		return halfWordGroup800.getHalfWordX2800().getLoByte800();
   }

  
	/**
	*  set variable loByte800
	*  @param value
	**/
   public void setLoByte800(char[] value) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(value);
   } 

     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex);
   	
   }
   
   public void setLoByte800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LoByte800 with another Field
	 *	@param value
	 */
   public void setLoByte800(Field source) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source);
   }  
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition new byte[] {(byte)0x01} for isEsVersion188270()
	 *	@return  Returns true if isEsVersion188270() is new byte[] {(byte)0x01}
	 */
   public boolean isEsVersion188270() throws CFException {
      return esHeaderData270.getEsVersion1270().isEsVersion188270();
   }

	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setEsVersion188270True()  throws CFException{  			
    	esHeaderData270.getEsVersion1270().setEsVersion188270True();
   	}
	/**
	 *	Returns the value of halfWord800
	 *	@return halfWord800
	 */
	public short getHalfWord800() throws CFException {        
   		return halfWordGroup800.getHalfWord800();
	}
	
	/**
	 * 	Update HalfWord800 with the passed value
	 *	@param number
	 */
	public void setHalfWord800(short number)  throws CFException{
		halfWordGroup800.setHalfWord800(number);
	}

	public void setHalfWord800(int number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}

	public void setHalfWord800(long number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}



	/**
	 *	Returns the value of esV1HdrLength270
	 *	@return esV1HdrLength270
	 */
   public char[] getEsV1HdrLength270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1HdrLength270();
   }

  
	/**
	*  set variable esV1HdrLength270
	*  @param value
	**/
   public void setEsV1HdrLength270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(value);
   } 

     /**
	 * 	Update EsV1HdrLength270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1HdrLength270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source, sourceIndex);
   	
   }
   
   public void setEsV1HdrLength270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1HdrLength270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1HdrLength270 with another Field
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source);
   }  
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1HdrLength270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public int getEsHdrLen400() throws CFException {
   		return programCounters400.getEsHdrLen400();
	}


	/**
	 *	Returns String value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public char[]  getEsHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getEsHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean esHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.esHdrLen400IsNumeric();
	}

	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param number
	 */
	public void setEsHdrLen400(int number)  throws CFException{
		programCounters400.setEsHdrLen400(number);
	}
	

	public void setEsHdrLen400(long number)  throws CFException{
	    programCounters400.setEsHdrLen400(number);
	}
	
	
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400(char[] value)  throws CFException {
		programCounters400.setEsHdrLen400(value);
	}
	
	/**
	 * 	Update EsHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400String(char[] value)  throws CFException{
		programCounters400.setEsHdrLen400(value);
	}	

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Test condition new byte[] {(byte)0x02} for isEsVersion288270()
	 *	@return  Returns true if isEsVersion288270() is new byte[] {(byte)0x02}
	 */
   public boolean isEsVersion288270() throws CFException {
      return esHeaderData270.getEsVersion1270().isEsVersion288270();
   }

	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setEsVersion288270True()  throws CFException{  			
    	esHeaderData270.getEsVersion1270().setEsVersion288270True();
   	}
	/**
	 *	Test condition new byte[] {(byte)0x03} for isEsVersion388270()
	 *	@return  Returns true if isEsVersion388270() is new byte[] {(byte)0x03}
	 */
   public boolean isEsVersion388270() throws CFException {
      return esHeaderData270.getEsVersion1270().isEsVersion388270();
   }

	/**
	*  set values new byte[] {(byte)0x03}
	*/
   	public void setEsVersion388270True()  throws CFException{  			
    	esHeaderData270.getEsVersion1270().setEsVersion388270True();
   	}

        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessServiceFieldsOutCtx clone() {
        ProcessServiceFieldsOutCtx cloneObj = new ProcessServiceFieldsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessServiceFieldsOutCtx getProcessServiceFieldsOutCtx() {
            return new ProcessServiceFieldsOutCtx();
    }
     public class ProcessEsVersion1InCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of esV1HdrLnth300
	 *	@return esV1HdrLnth300
	 */
	public short getEsV1HdrLnth300() throws CFException {        
   		return work.getEsV1HdrLnth300();
	}
	
	/**
	 * 	Update EsV1HdrLnth300 with the passed value
	 *	@param number
	 */
	public void setEsV1HdrLnth300(short number)  throws CFException{
		work.setEsV1HdrLnth300(number);
	}

	public void setEsV1HdrLnth300(int number)  throws CFException{
		work.setEsV1HdrLnth300((short)number);
	}

	public void setEsV1HdrLnth300(long number)  throws CFException{
		work.setEsV1HdrLnth300((short)number);
	}



	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of esV1SiHdrLnth270
	 *	@return esV1SiHdrLnth270
	 */
   public char[] getEsV1SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1SiHdrLnth270();
   }

  
	/**
	*  set variable esV1SiHdrLnth270
	*  @param value
	**/
   public void setEsV1SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public int getEsHdrLen400() throws CFException {
   		return programCounters400.getEsHdrLen400();
	}


	/**
	 *	Returns String value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public char[]  getEsHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getEsHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean esHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.esHdrLen400IsNumeric();
	}

	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param number
	 */
	public void setEsHdrLen400(int number)  throws CFException{
		programCounters400.setEsHdrLen400(number);
	}
	

	public void setEsHdrLen400(long number)  throws CFException{
	    programCounters400.setEsHdrLen400(number);
	}
	
	
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400(char[] value)  throws CFException {
		programCounters400.setEsHdrLen400(value);
	}
	
	/**
	 * 	Update EsHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400String(char[] value)  throws CFException{
		programCounters400.setEsHdrLen400(value);
	}	

	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV2Majic300
	 *	@return esV2Majic300
	 */
	public short getEsV2Majic300() throws CFException {        
   		return work.getEsV2Majic300();
	}
	
	/**
	 * 	Update EsV2Majic300 with the passed value
	 *	@param number
	 */
	public void setEsV2Majic300(short number)  throws CFException{
		work.setEsV2Majic300(number);
	}

	public void setEsV2Majic300(int number)  throws CFException{
		work.setEsV2Majic300((short)number);
	}

	public void setEsV2Majic300(long number)  throws CFException{
		work.setEsV2Majic300((short)number);
	}



	/**
	 *	Returns the value of esV1CorrelId270
	 *	@return esV1CorrelId270
	 */   
	 public EsV1CorrelId270 getEsV1CorrelId270() {
   	return esHeaderData270.getEsVersion1270().getEsV1CorrelId270();
   }

   /**
	* 	Update EsV1CorrelId270 with the passed value
	*	@param value
	*/
   public void setEsV1CorrelId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1CorrelId270(value);
   }   

     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source);
   }  
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessEsVersion1OutCtx getProcessEsVersion1OutCtx() {
            return new ProcessEsVersion1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion1InCtx clone() {
        ProcessEsVersion1InCtx cloneObj = new ProcessEsVersion1InCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion1InCtx getProcessEsVersion1InCtx() {
            return new ProcessEsVersion1InCtx();
    }
     public class ProcessEsVersion1OutCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of loByte800
	 *	@return loByte800
	 */
   public char[] getLoByte800() throws CFException  {              
   		return halfWordGroup800.getHalfWordX2800().getLoByte800();
   }

  
	/**
	*  set variable loByte800
	*  @param value
	**/
   public void setLoByte800(char[] value) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(value);
   } 

     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex);
   	
   }
   
   public void setLoByte800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LoByte800 with another Field
	 *	@param value
	 */
   public void setLoByte800(Field source) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source);
   }  
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of halfWord800
	 *	@return halfWord800
	 */
	public short getHalfWord800() throws CFException {        
   		return halfWordGroup800.getHalfWord800();
	}
	
	/**
	 * 	Update HalfWord800 with the passed value
	 *	@param number
	 */
	public void setHalfWord800(short number)  throws CFException{
		halfWordGroup800.setHalfWord800(number);
	}

	public void setHalfWord800(int number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}

	public void setHalfWord800(long number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of esV1SiHdrLnth270
	 *	@return esV1SiHdrLnth270
	 */
   public char[] getEsV1SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1SiHdrLnth270();
   }

  
	/**
	*  set variable esV1SiHdrLnth270
	*  @param value
	**/
   public void setEsV1SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV1SrvStatus270
	 *	@return esV1SrvStatus270
	 */
   public char[] getEsV1SrvStatus270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1SrvStatus270();
   }

  
	/**
	*  set variable esV1SrvStatus270
	*  @param value
	**/
   public void setEsV1SrvStatus270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(value);
   } 

     /**
	 * 	Update EsV1SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvStatus270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source, sourceIndex);
   	
   }
   
   public void setEsV1SrvStatus270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source);
   }  
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of isoOffset400
	 *	@return isoOffset400
	 */
	public int getIsoOffset400() throws CFException {        
   		return programCounters400.getIsoOffset400();
	}
	
	/**
	 * 	Update IsoOffset400 with the passed value
	 *	@param number
	 */
	public void setIsoOffset400(int number)  throws CFException{
		programCounters400.setIsoOffset400(number);
	}


	public void setIsoOffset400(long number)  throws CFException{
		programCounters400.setIsoOffset400((int)number);
	}


	/**
	 *	Returns the value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public int getSf539ServiceReqNo(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNo();
	}


	/**
	 *	Returns String value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public char[]  getSf539ServiceReqNoString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539ServiceReqNoIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539ServiceReqNoIsNumeric();
	}

	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param number
	 */
	public void setSf539ServiceReqNo(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	

	public void setSf539ServiceReqNo(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNo(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNoString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}	

	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceStatus();
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  @param value
	**/
   public void setSf539ServiceStatus(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(value);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public int getSiHdrLen400() throws CFException {
   		return programCounters400.getSiHdrLen400();
	}


	/**
	 *	Returns String value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public char[]  getSiHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getSiHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean siHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.siHdrLen400IsNumeric();
	}

	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param number
	 */
	public void setSiHdrLen400(int number)  throws CFException{
		programCounters400.setSiHdrLen400(number);
	}
	

	public void setSiHdrLen400(long number)  throws CFException{
	    programCounters400.setSiHdrLen400(number);
	}
	
	
	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400(char[] value)  throws CFException {
		programCounters400.setSiHdrLen400(value);
	}
	
	/**
	 * 	Update SiHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400String(char[] value)  throws CFException{
		programCounters400.setSiHdrLen400(value);
	}	

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceRc
	 *	@return sf539ServiceRc
	 */
   public char[] getSf539ServiceRc(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRc();
   }

  
	/**
	*  set variable sf539ServiceRc
	*  @param value
	**/
   public void setSf539ServiceRc(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(value);
   } 

     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRc with another Field
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV1StatusRc270
	 *	@return esV1StatusRc270
	 */
   public char[] getEsV1StatusRc270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1StatusRc270();
   }

  
	/**
	*  set variable esV1StatusRc270
	*  @param value
	**/
   public void setEsV1StatusRc270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(value);
   } 

     /**
	 * 	Update EsV1StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1StatusRc270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source, sourceIndex);
   	
   }
   
   public void setEsV1StatusRc270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source);
   }  
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV1CorrelId270
	 *	@return esV1CorrelId270
	 */   
	 public EsV1CorrelId270 getEsV1CorrelId270() {
   	return esHeaderData270.getEsVersion1270().getEsV1CorrelId270();
   }

   /**
	* 	Update EsV1CorrelId270 with the passed value
	*	@param value
	*/
   public void setEsV1CorrelId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1CorrelId270(value);
   }   

     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source);
   }  
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	esHeaderData270.getEsVersion1270().setEsV1CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of sf539ServiceData
	 *	@return sf539ServiceData
	 */
   public char[] getSf539ServiceData(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceData();
   }

  
	/**
	*  set variable sf539ServiceData
	*  @param value
	**/
   public void setSf539ServiceData(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(value);
   } 

     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceData(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceData with another Field
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source);
   }  
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV1SrvData270
	 *	@return esV1SrvData270
	 */
   public char[] getEsV1SrvData270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1SrvData270();
   }

  
	/**
	*  set variable esV1SrvData270
	*  @param value
	**/
   public void setEsV1SrvData270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(value);
   } 

     /**
	 * 	Update EsV1SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvData270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source, sourceIndex);
   	
   }
   
   public void setEsV1SrvData270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source) {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source);
   }  
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().setEsV1SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV1SrvId270
	 *	@return esV1SrvId270
	 */
   public char[] getEsV1SrvId270() throws CFException  {              
   		return esHeaderData270.getEsVersion1270().getEsV1CorrelId270().getEsV1SrvId270();
   }

  
	/**
	*  set variable esV1SrvId270
	*  @param value
	**/
   public void setEsV1SrvId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(value);
   } 

     /**
	 * 	Update EsV1SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvId270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source, sourceIndex);
   	
   }
   
   public void setEsV1SrvId270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV1SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source) {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source);
   }  
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion1270().getEsV1CorrelId270().setEsV1SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3SrvDataLnth275
	 *	@return esV3SrvDataLnth275
	 */
	public short getEsV3SrvDataLnth275() throws CFException {        
   		return esV3ServiceHeader275.getEsV3SrvDataLnth275();
	}
	
	/**
	 * 	Update EsV3SrvDataLnth275 with the passed value
	 *	@param number
	 */
	public void setEsV3SrvDataLnth275(short number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275(number);
	}

	public void setEsV3SrvDataLnth275(int number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}

	public void setEsV3SrvDataLnth275(long number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}



	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of sf539ServiceRefno
	 *	@return sf539ServiceRefno
	 */
   public char[] getSf539ServiceRefno(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRefno();
   }

  
	/**
	*  set variable sf539ServiceRefno
	*  @param value
	**/
   public void setSf539ServiceRefno(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(value);
   } 

     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRefno with another Field
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public int getSf539SrvDataLnth(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnth();
	}


	/**
	 *	Returns String value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public char[]  getSf539SrvDataLnthString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539SrvDataLnthIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539SrvDataLnthIsNumeric();
	}

	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param number
	 */
	public void setSf539SrvDataLnth(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	

	public void setSf539SrvDataLnth(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnth(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnthString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}	

	/**
	 *	Returns the value of esV1SrvDataLnth270
	 *	@return esV1SrvDataLnth270
	 */
	public short getEsV1SrvDataLnth270() throws CFException {        
   		return esHeaderData270.getEsVersion1270().getEsV1SrvDataLnth270();
	}
	
	/**
	 * 	Update EsV1SrvDataLnth270 with the passed value
	 *	@param number
	 */
	public void setEsV1SrvDataLnth270(short number)  throws CFException{
		esHeaderData270.getEsVersion1270().setEsV1SrvDataLnth270(number);
	}

	public void setEsV1SrvDataLnth270(int number)  throws CFException{
		esHeaderData270.getEsVersion1270().setEsV1SrvDataLnth270((short)number);
	}

	public void setEsV1SrvDataLnth270(long number)  throws CFException{
		esHeaderData270.getEsVersion1270().setEsV1SrvDataLnth270((short)number);
	}



	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion1OutCtx clone() {
        ProcessEsVersion1OutCtx cloneObj = new ProcessEsVersion1OutCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion1OutCtx getProcessEsVersion1OutCtx() {
            return new ProcessEsVersion1OutCtx();
    }
     public class ProcessEsVersion2InCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public int getEsHdrLen400() throws CFException {
   		return programCounters400.getEsHdrLen400();
	}


	/**
	 *	Returns String value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public char[]  getEsHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getEsHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean esHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.esHdrLen400IsNumeric();
	}

	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param number
	 */
	public void setEsHdrLen400(int number)  throws CFException{
		programCounters400.setEsHdrLen400(number);
	}
	

	public void setEsHdrLen400(long number)  throws CFException{
	    programCounters400.setEsHdrLen400(number);
	}
	
	
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400(char[] value)  throws CFException {
		programCounters400.setEsHdrLen400(value);
	}
	
	/**
	 * 	Update EsHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400String(char[] value)  throws CFException{
		programCounters400.setEsHdrLen400(value);
	}	

	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of esV2HdrLnth300
	 *	@return esV2HdrLnth300
	 */
	public short getEsV2HdrLnth300() throws CFException {        
   		return work.getEsV2HdrLnth300();
	}
	
	/**
	 * 	Update EsV2HdrLnth300 with the passed value
	 *	@param number
	 */
	public void setEsV2HdrLnth300(short number)  throws CFException{
		work.setEsV2HdrLnth300(number);
	}

	public void setEsV2HdrLnth300(int number)  throws CFException{
		work.setEsV2HdrLnth300((short)number);
	}

	public void setEsV2HdrLnth300(long number)  throws CFException{
		work.setEsV2HdrLnth300((short)number);
	}



	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV2SiHdrLnth270
	 *	@return esV2SiHdrLnth270
	 */
   public char[] getEsV2SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2SiHdrLnth270();
   }

  
	/**
	*  set variable esV2SiHdrLnth270
	*  @param value
	**/
   public void setEsV2SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV2Majic300
	 *	@return esV2Majic300
	 */
	public short getEsV2Majic300() throws CFException {        
   		return work.getEsV2Majic300();
	}
	
	/**
	 * 	Update EsV2Majic300 with the passed value
	 *	@param number
	 */
	public void setEsV2Majic300(short number)  throws CFException{
		work.setEsV2Majic300(number);
	}

	public void setEsV2Majic300(int number)  throws CFException{
		work.setEsV2Majic300((short)number);
	}

	public void setEsV2Majic300(long number)  throws CFException{
		work.setEsV2Majic300((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessEsVersion2OutCtx getProcessEsVersion2OutCtx() {
            return new ProcessEsVersion2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion2InCtx clone() {
        ProcessEsVersion2InCtx cloneObj = new ProcessEsVersion2InCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion2InCtx getProcessEsVersion2InCtx() {
            return new ProcessEsVersion2InCtx();
    }
     public class ProcessEsVersion2OutCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of loByte800
	 *	@return loByte800
	 */
   public char[] getLoByte800() throws CFException  {              
   		return halfWordGroup800.getHalfWordX2800().getLoByte800();
   }

  
	/**
	*  set variable loByte800
	*  @param value
	**/
   public void setLoByte800(char[] value) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(value);
   } 

     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex);
   	
   }
   
   public void setLoByte800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LoByte800 with another Field
	 *	@param value
	 */
   public void setLoByte800(Field source) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source);
   }  
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of halfWord800
	 *	@return halfWord800
	 */
	public short getHalfWord800() throws CFException {        
   		return halfWordGroup800.getHalfWord800();
	}
	
	/**
	 * 	Update HalfWord800 with the passed value
	 *	@param number
	 */
	public void setHalfWord800(short number)  throws CFException{
		halfWordGroup800.setHalfWord800(number);
	}

	public void setHalfWord800(int number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}

	public void setHalfWord800(long number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of esV2SrvData270
	 *	@return esV2SrvData270
	 */
   public char[] getEsV2SrvData270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2SrvData270();
   }

  
	/**
	*  set variable esV2SrvData270
	*  @param value
	**/
   public void setEsV2SrvData270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(value);
   } 

     /**
	 * 	Update EsV2SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvData270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source, sourceIndex);
   	
   }
   
   public void setEsV2SrvData270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source);
   }  
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of esV2SrvStatus270
	 *	@return esV2SrvStatus270
	 */
   public char[] getEsV2SrvStatus270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2SrvStatus270();
   }

  
	/**
	*  set variable esV2SrvStatus270
	*  @param value
	**/
   public void setEsV2SrvStatus270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(value);
   } 

     /**
	 * 	Update EsV2SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvStatus270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source, sourceIndex);
   	
   }
   
   public void setEsV2SrvStatus270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source);
   }  
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isoOffset400
	 *	@return isoOffset400
	 */
	public int getIsoOffset400() throws CFException {        
   		return programCounters400.getIsoOffset400();
	}
	
	/**
	 * 	Update IsoOffset400 with the passed value
	 *	@param number
	 */
	public void setIsoOffset400(int number)  throws CFException{
		programCounters400.setIsoOffset400(number);
	}


	public void setIsoOffset400(long number)  throws CFException{
		programCounters400.setIsoOffset400((int)number);
	}


	/**
	 *	Returns the value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public int getSf539ServiceReqNo(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNo();
	}


	/**
	 *	Returns String value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public char[]  getSf539ServiceReqNoString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539ServiceReqNoIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539ServiceReqNoIsNumeric();
	}

	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param number
	 */
	public void setSf539ServiceReqNo(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	

	public void setSf539ServiceReqNo(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNo(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNoString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}	

	/**
	 *	Returns the value of esV2SrvId270
	 *	@return esV2SrvId270
	 */
   public char[] getEsV2SrvId270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2SrvId270();
   }

  
	/**
	*  set variable esV2SrvId270
	*  @param value
	**/
   public void setEsV2SrvId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(value);
   } 

     /**
	 * 	Update EsV2SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvId270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source, sourceIndex);
   	
   }
   
   public void setEsV2SrvId270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source);
   }  
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceStatus();
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  @param value
	**/
   public void setSf539ServiceStatus(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(value);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public int getSiHdrLen400() throws CFException {
   		return programCounters400.getSiHdrLen400();
	}


	/**
	 *	Returns String value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public char[]  getSiHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getSiHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean siHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.siHdrLen400IsNumeric();
	}

	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param number
	 */
	public void setSiHdrLen400(int number)  throws CFException{
		programCounters400.setSiHdrLen400(number);
	}
	

	public void setSiHdrLen400(long number)  throws CFException{
	    programCounters400.setSiHdrLen400(number);
	}
	
	
	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400(char[] value)  throws CFException {
		programCounters400.setSiHdrLen400(value);
	}
	
	/**
	 * 	Update SiHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400String(char[] value)  throws CFException{
		programCounters400.setSiHdrLen400(value);
	}	

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceRc
	 *	@return sf539ServiceRc
	 */
   public char[] getSf539ServiceRc(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRc();
   }

  
	/**
	*  set variable sf539ServiceRc
	*  @param value
	**/
   public void setSf539ServiceRc(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(value);
   } 

     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRc with another Field
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV2CorrelId270
	 *	@return esV2CorrelId270
	 */
   public char[] getEsV2CorrelId270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2CorrelId270();
   }

  
	/**
	*  set variable esV2CorrelId270
	*  @param value
	**/
   public void setEsV2CorrelId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(value);
   } 

     /**
	 * 	Update EsV2CorrelId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2CorrelId270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source, sourceIndex);
   	
   }
   
   public void setEsV2CorrelId270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source);
   }  
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of sf539ServiceData
	 *	@return sf539ServiceData
	 */
   public char[] getSf539ServiceData(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceData();
   }

  
	/**
	*  set variable sf539ServiceData
	*  @param value
	**/
   public void setSf539ServiceData(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(value);
   } 

     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceData(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceData with another Field
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source);
   }  
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV2SrvDataLnth270
	 *	@return esV2SrvDataLnth270
	 */
	public short getEsV2SrvDataLnth270() throws CFException {        
   		return esHeaderData270.getEsVersion2270().getEsV2SrvDataLnth270();
	}
	
	/**
	 * 	Update EsV2SrvDataLnth270 with the passed value
	 *	@param number
	 */
	public void setEsV2SrvDataLnth270(short number)  throws CFException{
		esHeaderData270.getEsVersion2270().setEsV2SrvDataLnth270(number);
	}

	public void setEsV2SrvDataLnth270(int number)  throws CFException{
		esHeaderData270.getEsVersion2270().setEsV2SrvDataLnth270((short)number);
	}

	public void setEsV2SrvDataLnth270(long number)  throws CFException{
		esHeaderData270.getEsVersion2270().setEsV2SrvDataLnth270((short)number);
	}



	/**
	 *	Returns the value of esV2StatusRc270
	 *	@return esV2StatusRc270
	 */
   public char[] getEsV2StatusRc270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2StatusRc270();
   }

  
	/**
	*  set variable esV2StatusRc270
	*  @param value
	**/
   public void setEsV2StatusRc270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(value);
   } 

     /**
	 * 	Update EsV2StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2StatusRc270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source, sourceIndex);
   	
   }
   
   public void setEsV2StatusRc270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source);
   }  
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3SrvDataLnth275
	 *	@return esV3SrvDataLnth275
	 */
	public short getEsV3SrvDataLnth275() throws CFException {        
   		return esV3ServiceHeader275.getEsV3SrvDataLnth275();
	}
	
	/**
	 * 	Update EsV3SrvDataLnth275 with the passed value
	 *	@param number
	 */
	public void setEsV3SrvDataLnth275(short number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275(number);
	}

	public void setEsV3SrvDataLnth275(int number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}

	public void setEsV3SrvDataLnth275(long number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}



	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of sf539ServiceRefno
	 *	@return sf539ServiceRefno
	 */
   public char[] getSf539ServiceRefno(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRefno();
   }

  
	/**
	*  set variable sf539ServiceRefno
	*  @param value
	**/
   public void setSf539ServiceRefno(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(value);
   } 

     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRefno with another Field
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public int getSf539SrvDataLnth(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnth();
	}


	/**
	 *	Returns String value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public char[]  getSf539SrvDataLnthString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539SrvDataLnthIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539SrvDataLnthIsNumeric();
	}

	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param number
	 */
	public void setSf539SrvDataLnth(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	

	public void setSf539SrvDataLnth(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnth(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnthString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}	

	/**
	 *	Returns the value of esV2SiHdrLnth270
	 *	@return esV2SiHdrLnth270
	 */
   public char[] getEsV2SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion2270().getEsV2SiHdrLnth270();
   }

  
	/**
	*  set variable esV2SiHdrLnth270
	*  @param value
	**/
   public void setEsV2SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV2SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion2270().setEsV2SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion2OutCtx clone() {
        ProcessEsVersion2OutCtx cloneObj = new ProcessEsVersion2OutCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion2OutCtx getProcessEsVersion2OutCtx() {
            return new ProcessEsVersion2OutCtx();
    }
     public class ProcessEsVersion3InCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public int getEsHdrLen400() throws CFException {
   		return programCounters400.getEsHdrLen400();
	}


	/**
	 *	Returns String value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public char[]  getEsHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getEsHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean esHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.esHdrLen400IsNumeric();
	}

	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param number
	 */
	public void setEsHdrLen400(int number)  throws CFException{
		programCounters400.setEsHdrLen400(number);
	}
	

	public void setEsHdrLen400(long number)  throws CFException{
	    programCounters400.setEsHdrLen400(number);
	}
	
	
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400(char[] value)  throws CFException {
		programCounters400.setEsHdrLen400(value);
	}
	
	/**
	 * 	Update EsHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400String(char[] value)  throws CFException{
		programCounters400.setEsHdrLen400(value);
	}	

	/**
	 *	Returns the value of esV3SrvDataLnth275
	 *	@return esV3SrvDataLnth275
	 */
	public short getEsV3SrvDataLnth275() throws CFException {        
   		return esV3ServiceHeader275.getEsV3SrvDataLnth275();
	}
	
	/**
	 * 	Update EsV3SrvDataLnth275 with the passed value
	 *	@param number
	 */
	public void setEsV3SrvDataLnth275(short number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275(number);
	}

	public void setEsV3SrvDataLnth275(int number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}

	public void setEsV3SrvDataLnth275(long number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}



	/**
	 *	Returns the value of esV3Majic300
	 *	@return esV3Majic300
	 */
	public short getEsV3Majic300() throws CFException {        
   		return work.getEsV3Majic300();
	}
	
	/**
	 * 	Update EsV3Majic300 with the passed value
	 *	@param number
	 */
	public void setEsV3Majic300(short number)  throws CFException{
		work.setEsV3Majic300(number);
	}

	public void setEsV3Majic300(int number)  throws CFException{
		work.setEsV3Majic300((short)number);
	}

	public void setEsV3Majic300(long number)  throws CFException{
		work.setEsV3Majic300((short)number);
	}



	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3SiHdrLnth270
	 *	@return esV3SiHdrLnth270
	 */
   public char[] getEsV3SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3SiHdrLnth270();
   }

  
	/**
	*  set variable esV3SiHdrLnth270
	*  @param value
	**/
   public void setEsV3SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3HdrLnth300
	 *	@return esV3HdrLnth300
	 */
	public short getEsV3HdrLnth300() throws CFException {        
   		return work.getEsV3HdrLnth300();
	}
	
	/**
	 * 	Update EsV3HdrLnth300 with the passed value
	 *	@param number
	 */
	public void setEsV3HdrLnth300(short number)  throws CFException{
		work.setEsV3HdrLnth300(number);
	}

	public void setEsV3HdrLnth300(int number)  throws CFException{
		work.setEsV3HdrLnth300((short)number);
	}

	public void setEsV3HdrLnth300(long number)  throws CFException{
		work.setEsV3HdrLnth300((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessEsVersion3OutCtx getProcessEsVersion3OutCtx() {
            return new ProcessEsVersion3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion3InCtx clone() {
        ProcessEsVersion3InCtx cloneObj = new ProcessEsVersion3InCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion3InCtx getProcessEsVersion3InCtx() {
            return new ProcessEsVersion3InCtx();
    }
     public class ProcessEsVersion3OutCtx implements Cloneable {
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     EsV3ServiceHeader275 esV3ServiceHeader275 = Sf305120Ctx.this.getEsV3ServiceHeader275();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();
     HalfWordGroup800 halfWordGroup800 = Sf305120Ctx.this.getHalfWordGroup800();

	/**
	 *	Returns the value of loByte800
	 *	@return loByte800
	 */
   public char[] getLoByte800() throws CFException  {              
   		return halfWordGroup800.getHalfWordX2800().getLoByte800();
   }

  
	/**
	*  set variable loByte800
	*  @param value
	**/
   public void setLoByte800(char[] value) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(value);
   } 

     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex) throws CFException {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex);
   	
   }
   
   public void setLoByte800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LoByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LoByte800 with another Field
	 *	@param value
	 */
   public void setLoByte800(Field source) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source);
   }  
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LoByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLoByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      halfWordGroup800.getHalfWordX2800().setLoByte800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3SrvData270
	 *	@return esV3SrvData270
	 */
   public char[] getEsV3SrvData270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3SrvData270();
   }

  
	/**
	*  set variable esV3SrvData270
	*  @param value
	**/
   public void setEsV3SrvData270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(value);
   } 

     /**
	 * 	Update EsV3SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvData270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source, sourceIndex);
   	
   }
   
   public void setEsV3SrvData270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source);
   }  
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvData270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of halfWord800
	 *	@return halfWord800
	 */
	public short getHalfWord800() throws CFException {        
   		return halfWordGroup800.getHalfWord800();
	}
	
	/**
	 * 	Update HalfWord800 with the passed value
	 *	@param number
	 */
	public void setHalfWord800(short number)  throws CFException{
		halfWordGroup800.setHalfWord800(number);
	}

	public void setHalfWord800(int number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}

	public void setHalfWord800(long number)  throws CFException{
		halfWordGroup800.setHalfWord800((short)number);
	}



	/**
	 *	Returns the value of esV3ServiceHeader275
	 *	@return esV3ServiceHeader275
	 */   
	 public EsV3ServiceHeader275 getEsV3ServiceHeader275() {
   	return esV3ServiceHeader275;
   }


	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of isoOffset400
	 *	@return isoOffset400
	 */
	public int getIsoOffset400() throws CFException {        
   		return programCounters400.getIsoOffset400();
	}
	
	/**
	 * 	Update IsoOffset400 with the passed value
	 *	@param number
	 */
	public void setIsoOffset400(int number)  throws CFException{
		programCounters400.setIsoOffset400(number);
	}


	public void setIsoOffset400(long number)  throws CFException{
		programCounters400.setIsoOffset400((int)number);
	}


	/**
	 *	Returns the value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public int getSf539ServiceReqNo(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNo();
	}


	/**
	 *	Returns String value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public char[]  getSf539ServiceReqNoString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539ServiceReqNoIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539ServiceReqNoIsNumeric();
	}

	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param number
	 */
	public void setSf539ServiceReqNo(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	

	public void setSf539ServiceReqNo(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNo(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNoString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}	

	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceStatus();
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  @param value
	**/
   public void setSf539ServiceStatus(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(value);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public int getSiHdrLen400() throws CFException {
   		return programCounters400.getSiHdrLen400();
	}


	/**
	 *	Returns String value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public char[]  getSiHdrLen400String() throws CFException {
	     return String.valueOf(programCounters400.getSiHdrLen400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean siHdrLen400IsNumeric()  throws CFException{
	    return programCounters400.siHdrLen400IsNumeric();
	}

	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param number
	 */
	public void setSiHdrLen400(int number)  throws CFException{
		programCounters400.setSiHdrLen400(number);
	}
	

	public void setSiHdrLen400(long number)  throws CFException{
	    programCounters400.setSiHdrLen400(number);
	}
	
	
	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400(char[] value)  throws CFException {
		programCounters400.setSiHdrLen400(value);
	}
	
	/**
	 * 	Update SiHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400String(char[] value)  throws CFException{
		programCounters400.setSiHdrLen400(value);
	}	

	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceRc
	 *	@return sf539ServiceRc
	 */
   public char[] getSf539ServiceRc(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRc();
   }

  
	/**
	*  set variable sf539ServiceRc
	*  @param value
	**/
   public void setSf539ServiceRc(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(value);
   } 

     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRc with another Field
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3SrvId270
	 *	@return esV3SrvId270
	 */
   public char[] getEsV3SrvId270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3SrvId270();
   }

  
	/**
	*  set variable esV3SrvId270
	*  @param value
	**/
   public void setEsV3SrvId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(value);
   } 

     /**
	 * 	Update EsV3SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvId270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source, sourceIndex);
   	
   }
   
   public void setEsV3SrvId270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source);
   }  
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3CorrelId270
	 *	@return esV3CorrelId270
	 */
   public char[] getEsV3CorrelId270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3CorrelId270();
   }

  
	/**
	*  set variable esV3CorrelId270
	*  @param value
	**/
   public void setEsV3CorrelId270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(value);
   } 

     /**
	 * 	Update EsV3CorrelId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3CorrelId270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source, sourceIndex);
   	
   }
   
   public void setEsV3CorrelId270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source);
   }  
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3CorrelId270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of sf539ServiceData
	 *	@return sf539ServiceData
	 */
   public char[] getSf539ServiceData(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceData();
   }

  
	/**
	*  set variable sf539ServiceData
	*  @param value
	**/
   public void setSf539ServiceData(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(value);
   } 

     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceData(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceData with another Field
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source);
   }  
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logcMiplogRefNum260
	 *	@return logcMiplogRefNum260
	 */
   public char[] getLogcMiplogRefNum260() throws CFException  {              
   		return classCLogRecord260.getLogcMiplogRefNum260();
   }

  
	/**
	*  set variable logcMiplogRefNum260
	*  @param value
	**/
   public void setLogcMiplogRefNum260(char[] value) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(value);
   } 

     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex) throws CFException {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex);
   	
   }
   
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogcMiplogRefNum260 with another Field
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source) {
      classCLogRecord260.setLogcMiplogRefNum260(source);
   }  
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogcMiplogRefNum260 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogcMiplogRefNum260(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      classCLogRecord260.setLogcMiplogRefNum260(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3StatusRc270
	 *	@return esV3StatusRc270
	 */
   public char[] getEsV3StatusRc270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3StatusRc270();
   }

  
	/**
	*  set variable esV3StatusRc270
	*  @param value
	**/
   public void setEsV3StatusRc270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(value);
   } 

     /**
	 * 	Update EsV3StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3StatusRc270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source, sourceIndex);
   	
   }
   
   public void setEsV3StatusRc270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source);
   }  
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3StatusRc270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3SiHdrLnth270
	 *	@return esV3SiHdrLnth270
	 */
   public char[] getEsV3SiHdrLnth270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3SiHdrLnth270();
   }

  
	/**
	*  set variable esV3SiHdrLnth270
	*  @param value
	**/
   public void setEsV3SiHdrLnth270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(value);
   } 

     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex);
   	
   }
   
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source);
   }  
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SiHdrLnth270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of esV3SrvStatus270
	 *	@return esV3SrvStatus270
	 */
   public char[] getEsV3SrvStatus270() throws CFException  {              
   		return esHeaderData270.getEsVersion3270().getEsV3SrvStatus270();
   }

  
	/**
	*  set variable esV3SrvStatus270
	*  @param value
	**/
   public void setEsV3SrvStatus270(char[] value) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(value);
   } 

     /**
	 * 	Update EsV3SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvStatus270(char[] source, int sourceIndex) throws CFException {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source, sourceIndex);
   	
   }
   
   public void setEsV3SrvStatus270(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EsV3SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source) {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source);
   }  
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source, int sourceIndex,int sourceLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      esHeaderData270.getEsVersion3270().setEsV3SrvStatus270(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of esV3SrvDataLnth270
	 *	@return esV3SrvDataLnth270
	 */
	public short getEsV3SrvDataLnth270() throws CFException {        
   		return esHeaderData270.getEsVersion3270().getEsV3SrvDataLnth270();
	}
	
	/**
	 * 	Update EsV3SrvDataLnth270 with the passed value
	 *	@param number
	 */
	public void setEsV3SrvDataLnth270(short number)  throws CFException{
		esHeaderData270.getEsVersion3270().setEsV3SrvDataLnth270(number);
	}

	public void setEsV3SrvDataLnth270(int number)  throws CFException{
		esHeaderData270.getEsVersion3270().setEsV3SrvDataLnth270((short)number);
	}

	public void setEsV3SrvDataLnth270(long number)  throws CFException{
		esHeaderData270.getEsVersion3270().setEsV3SrvDataLnth270((short)number);
	}



	/**
	 *	Returns the value of esV3SrvDataLnth275
	 *	@return esV3SrvDataLnth275
	 */
	public short getEsV3SrvDataLnth275() throws CFException {        
   		return esV3ServiceHeader275.getEsV3SrvDataLnth275();
	}
	
	/**
	 * 	Update EsV3SrvDataLnth275 with the passed value
	 *	@param number
	 */
	public void setEsV3SrvDataLnth275(short number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275(number);
	}

	public void setEsV3SrvDataLnth275(int number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}

	public void setEsV3SrvDataLnth275(long number)  throws CFException{
		esV3ServiceHeader275.setEsV3SrvDataLnth275((short)number);
	}



	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
   		return work.getNumber01300();
	}


	/**
	 *	Returns String value of number01300
	 *	@return number01300
	 */
	public char[]  getNumber01300String() throws CFException {
	     return String.valueOf(work.getNumber01300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean number01300IsNumeric()  throws CFException{
	    return work.number01300IsNumeric();
	}

	/**
	 * 	Update Number01300 with the passed value
	 *	@param number
	 */
	public void setNumber01300(int number)  throws CFException{
		work.setNumber01300(number);
	}
	

	public void setNumber01300(long number)  throws CFException{
	    work.setNumber01300(number);
	}
	
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value)  throws CFException {
		work.setNumber01300(value);
	}
	
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value)  throws CFException{
		work.setNumber01300(value);
	}	

	/**
	 *	Returns the value of sf539ServiceRefno
	 *	@return sf539ServiceRefno
	 */
   public char[] getSf539ServiceRefno(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRefno();
   }

  
	/**
	*  set variable sf539ServiceRefno
	*  @param value
	**/
   public void setSf539ServiceRefno(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(value);
   } 

     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRefno with another Field
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public int getSf539SrvDataLnth(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnth();
	}


	/**
	 *	Returns String value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public char[]  getSf539SrvDataLnthString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539SrvDataLnthIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539SrvDataLnthIsNumeric();
	}

	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param number
	 */
	public void setSf539SrvDataLnth(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	

	public void setSf539SrvDataLnth(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnth(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnthString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}	

	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += esV3ServiceHeader275.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
        str += halfWordGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessEsVersion3OutCtx clone() {
        ProcessEsVersion3OutCtx cloneObj = new ProcessEsVersion3OutCtx();
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.esV3ServiceHeader275 = new EsV3ServiceHeader275();
        cloneObj.esV3ServiceHeader275.set(esV3ServiceHeader275.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        cloneObj.halfWordGroup800 = new HalfWordGroup800();
        cloneObj.halfWordGroup800.set(halfWordGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessEsVersion3OutCtx getProcessEsVersion3OutCtx() {
            return new ProcessEsVersion3OutCtx();
    }
     public class ProcessOeHeadersInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     PlHeaderData284 plHeaderData284 = Sf305120Ctx.this.getPlHeaderData284();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     SvHeaderData282 svHeaderData282 = Sf305120Ctx.this.getSvHeaderData282();

	/**
	 *	Returns the value of oeStructLnth300
	 *	@return oeStructLnth300
	 */
	public short getOeStructLnth300() throws CFException {        
   		return work.getOeStructLnth300();
	}
	
	/**
	 * 	Update OeStructLnth300 with the passed value
	 *	@param number
	 */
	public void setOeStructLnth300(short number)  throws CFException{
		work.setOeStructLnth300(number);
	}

	public void setOeStructLnth300(int number)  throws CFException{
		work.setOeStructLnth300((short)number);
	}

	public void setOeStructLnth300(long number)  throws CFException{
		work.setOeStructLnth300((short)number);
	}



	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of x9aOffset400
	 *	@return x9aOffset400
	 */
	public int getX9aOffset400() throws CFException {        
   		return programCounters400.getX9aOffset400();
	}
	
	/**
	 * 	Update X9aOffset400 with the passed value
	 *	@param number
	 */
	public void setX9aOffset400(int number)  throws CFException{
		programCounters400.setX9aOffset400(number);
	}


	public void setX9aOffset400(long number)  throws CFException{
		programCounters400.setX9aOffset400((int)number);
	}


	/**
	 *	Returns the value of plHeaderData284
	 *	@return plHeaderData284
	 */   
	 public PlHeaderData284 getPlHeaderData284() {
   	return plHeaderData284;
   }


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of svHeaderData282
	 *	@return svHeaderData282
	 */   
	 public SvHeaderData282 getSvHeaderData282() {
   	return svHeaderData282;
   }



        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ProcessOeHeadersOutCtx getProcessOeHeadersOutCtx() {
            return new ProcessOeHeadersOutCtx();
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
        str += programCounters400.hashCode();
        str += plHeaderData284.hashCode();
        str += classCLogRecord260.hashCode();
        str += svHeaderData282.hashCode();
       return str.hashCode();
    }

    public ProcessOeHeadersInCtx clone() {
        ProcessOeHeadersInCtx cloneObj = new ProcessOeHeadersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.plHeaderData284 = new PlHeaderData284();
        cloneObj.plHeaderData284.set(plHeaderData284.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.svHeaderData282 = new SvHeaderData282();
        cloneObj.svHeaderData282.set(svHeaderData282.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOeHeadersInCtx getProcessOeHeadersInCtx() {
            return new ProcessOeHeadersInCtx();
    }
     public class ProcessOeHeadersOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     PlHeaderData284 plHeaderData284 = Sf305120Ctx.this.getPlHeaderData284();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     SvHeaderData282 svHeaderData282 = Sf305120Ctx.this.getSvHeaderData282();

	/**
	 *	Returns the value of oeStructLnth300
	 *	@return oeStructLnth300
	 */
	public short getOeStructLnth300() throws CFException {        
   		return work.getOeStructLnth300();
	}
	
	/**
	 * 	Update OeStructLnth300 with the passed value
	 *	@param number
	 */
	public void setOeStructLnth300(short number)  throws CFException{
		work.setOeStructLnth300(number);
	}

	public void setOeStructLnth300(int number)  throws CFException{
		work.setOeStructLnth300((short)number);
	}

	public void setOeStructLnth300(long number)  throws CFException{
		work.setOeStructLnth300((short)number);
	}



	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {        
   		return work.getEsHdrOffset300();
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *	@param number
	 */
	public void setEsHdrOffset300(short number)  throws CFException{
		work.setEsHdrOffset300(number);
	}

	public void setEsHdrOffset300(int number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}

	public void setEsHdrOffset300(long number)  throws CFException{
		work.setEsHdrOffset300((short)number);
	}



	/**
	 *	Returns the value of plHeaderData284
	 *	@return plHeaderData284
	 */   
	 public PlHeaderData284 getPlHeaderData284() {
   	return plHeaderData284;
   }


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of oeHeaderData280
	 *	@return oeHeaderData280
	 */
   public char[] getOeHeaderData280() throws CFException  {              
   		return work.getOeHeaderData280();
   }

  
	/**
	*  set variable oeHeaderData280
	*  @param value
	**/
   public void setOeHeaderData280(char[] value) throws CFException {
      work.setOeHeaderData280(value);
   } 

	/**
	 *	Returns the value of svHeaderData282
	 *	@return svHeaderData282
	 */   
	 public SvHeaderData282 getSvHeaderData282() {
   	return svHeaderData282;
   }



        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += programCounters400.hashCode();
        str += plHeaderData284.hashCode();
        str += classCLogRecord260.hashCode();
        str += svHeaderData282.hashCode();
       return str.hashCode();
    }

    public ProcessOeHeadersOutCtx clone() {
        ProcessOeHeadersOutCtx cloneObj = new ProcessOeHeadersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.plHeaderData284 = new PlHeaderData284();
        cloneObj.plHeaderData284.set(plHeaderData284.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.svHeaderData282 = new SvHeaderData282();
        cloneObj.svHeaderData282.set(svHeaderData282.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOeHeadersOutCtx getProcessOeHeadersOutCtx() {
            return new ProcessOeHeadersOutCtx();
    }
     public class Analyze1HeaderInCtx implements Cloneable {
     ReHeaderData286 reHeaderData286 = Sf305120Ctx.this.getReHeaderData286();
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     PlHeaderData284 plHeaderData284 = Sf305120Ctx.this.getPlHeaderData284();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     InHeaderData290 inHeaderData290 = Sf305120Ctx.this.getInHeaderData290();
     UnknownHeader299 unknownHeader299 = Sf305120Ctx.this.getUnknownHeader299();
     SvHeaderData282 svHeaderData282 = Sf305120Ctx.this.getSvHeaderData282();

	/**
	 *	Returns the value of reHeaderData286
	 *	@return reHeaderData286
	 */   
	 public ReHeaderData286 getReHeaderData286() {
   	return reHeaderData286;
   }


	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of error42300
	 *	@return error42300
	 */
	public short getError42300() throws CFException {        
   		return work.getError42300();
	}
	
	/**
	 * 	Update Error42300 with the passed value
	 *	@param number
	 */
	public void setError42300(short number)  throws CFException{
		work.setError42300(number);
	}

	public void setError42300(int number)  throws CFException{
		work.setError42300((short)number);
	}

	public void setError42300(long number)  throws CFException{
		work.setError42300((short)number);
	}



	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of literalEd300
	 *	@return literalEd300
	 */
   public char[] getLiteralEd300() throws CFException  {              
   		return work.getLiteralEd300();
   }

  
	/**
	*  set variable literalEd300
	*  @param value
	**/
   public void setLiteralEd300(char[] value) throws CFException {
      work.setLiteralEd300(value);
   } 

	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of error99300
	 *	@return error99300
	 */
	public short getError99300() throws CFException {        
   		return work.getError99300();
	}
	
	/**
	 * 	Update Error99300 with the passed value
	 *	@param number
	 */
	public void setError99300(short number)  throws CFException{
		work.setError99300(number);
	}

	public void setError99300(int number)  throws CFException{
		work.setError99300((short)number);
	}

	public void setError99300(long number)  throws CFException{
		work.setError99300((short)number);
	}



	/**
	 *	Returns the value of literalIn300
	 *	@return literalIn300
	 */
   public char[] getLiteralIn300() throws CFException  {              
   		return work.getLiteralIn300();
   }

  
	/**
	*  set variable literalIn300
	*  @param value
	**/
   public void setLiteralIn300(char[] value) throws CFException {
      work.setLiteralIn300(value);
   } 

	/**
	 *	Returns the value of error45300
	 *	@return error45300
	 */
	public short getError45300() throws CFException {        
   		return work.getError45300();
	}
	
	/**
	 * 	Update Error45300 with the passed value
	 *	@param number
	 */
	public void setError45300(short number)  throws CFException{
		work.setError45300(number);
	}

	public void setError45300(int number)  throws CFException{
		work.setError45300((short)number);
	}

	public void setError45300(long number)  throws CFException{
		work.setError45300((short)number);
	}



	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of binary24300
	 *	@return binary24300
	 */
	public short getBinary24300() throws CFException {        
   		return work.getBinary24300();
	}
	
	/**
	 * 	Update Binary24300 with the passed value
	 *	@param number
	 */
	public void setBinary24300(short number)  throws CFException{
		work.setBinary24300(number);
	}

	public void setBinary24300(int number)  throws CFException{
		work.setBinary24300((short)number);
	}

	public void setBinary24300(long number)  throws CFException{
		work.setBinary24300((short)number);
	}



	/**
	 *	Returns the value of binary512300
	 *	@return binary512300
	 */
	public short getBinary512300() throws CFException {        
   		return work.getBinary512300();
	}
	
	/**
	 * 	Update Binary512300 with the passed value
	 *	@param number
	 */
	public void setBinary512300(short number)  throws CFException{
		work.setBinary512300(number);
	}

	public void setBinary512300(int number)  throws CFException{
		work.setBinary512300((short)number);
	}

	public void setBinary512300(long number)  throws CFException{
		work.setBinary512300((short)number);
	}



	/**
	 *	Returns the value of error43300
	 *	@return error43300
	 */
	public short getError43300() throws CFException {        
   		return work.getError43300();
	}
	
	/**
	 * 	Update Error43300 with the passed value
	 *	@param number
	 */
	public void setError43300(short number)  throws CFException{
		work.setError43300(number);
	}

	public void setError43300(int number)  throws CFException{
		work.setError43300((short)number);
	}

	public void setError43300(long number)  throws CFException{
		work.setError43300((short)number);
	}



	/**
	 *	Returns the value of literalRe300
	 *	@return literalRe300
	 */
   public char[] getLiteralRe300() throws CFException  {              
   		return work.getLiteralRe300();
   }

  
	/**
	*  set variable literalRe300
	*  @param value
	**/
   public void setLiteralRe300(char[] value) throws CFException {
      work.setLiteralRe300(value);
   } 

	/**
	 *	Returns the value of error44300
	 *	@return error44300
	 */
	public short getError44300() throws CFException {        
   		return work.getError44300();
	}
	
	/**
	 * 	Update Error44300 with the passed value
	 *	@param number
	 */
	public void setError44300(short number)  throws CFException{
		work.setError44300(number);
	}

	public void setError44300(int number)  throws CFException{
		work.setError44300((short)number);
	}

	public void setError44300(long number)  throws CFException{
		work.setError44300((short)number);
	}



	/**
	 *	Returns the value of inHeaderData290
	 *	@return inHeaderData290
	 */   
	 public InHeaderData290 getInHeaderData290() {
   	return inHeaderData290;
   }


	/**
	 *	Returns the value of unknownHeader299
	 *	@return unknownHeader299
	 */   
	 public UnknownHeader299 getUnknownHeader299() {
   	return unknownHeader299;
   }


	/**
	 *	Returns the value of error41300
	 *	@return error41300
	 */
	public short getError41300() throws CFException {        
   		return work.getError41300();
	}
	
	/**
	 * 	Update Error41300 with the passed value
	 *	@param number
	 */
	public void setError41300(short number)  throws CFException{
		work.setError41300(number);
	}

	public void setError41300(int number)  throws CFException{
		work.setError41300((short)number);
	}

	public void setError41300(long number)  throws CFException{
		work.setError41300((short)number);
	}



	/**
	 *	Returns the value of binary15300
	 *	@return binary15300
	 */
	public short getBinary15300() throws CFException {        
   		return work.getBinary15300();
	}
	
	/**
	 * 	Update Binary15300 with the passed value
	 *	@param number
	 */
	public void setBinary15300(short number)  throws CFException{
		work.setBinary15300(number);
	}

	public void setBinary15300(int number)  throws CFException{
		work.setBinary15300((short)number);
	}

	public void setBinary15300(long number)  throws CFException{
		work.setBinary15300((short)number);
	}



	/**
	 *	Returns the value of binary21300
	 *	@return binary21300
	 */
	public short getBinary21300() throws CFException {        
   		return work.getBinary21300();
	}
	
	/**
	 * 	Update Binary21300 with the passed value
	 *	@param number
	 */
	public void setBinary21300(short number)  throws CFException{
		work.setBinary21300(number);
	}

	public void setBinary21300(int number)  throws CFException{
		work.setBinary21300((short)number);
	}

	public void setBinary21300(long number)  throws CFException{
		work.setBinary21300((short)number);
	}



	/**
	 *	Returns the value of binary38300
	 *	@return binary38300
	 */
	public short getBinary38300() throws CFException {        
   		return work.getBinary38300();
	}
	
	/**
	 * 	Update Binary38300 with the passed value
	 *	@param number
	 */
	public void setBinary38300(short number)  throws CFException{
		work.setBinary38300(number);
	}

	public void setBinary38300(int number)  throws CFException{
		work.setBinary38300((short)number);
	}

	public void setBinary38300(long number)  throws CFException{
		work.setBinary38300((short)number);
	}



	/**
	 *	Returns the value of plHeaderData284
	 *	@return plHeaderData284
	 */   
	 public PlHeaderData284 getPlHeaderData284() {
   	return plHeaderData284;
   }


	/**
	 *	Returns the value of literalSv300
	 *	@return literalSv300
	 */
   public char[] getLiteralSv300() throws CFException  {              
   		return work.getLiteralSv300();
   }

  
	/**
	*  set variable literalSv300
	*  @param value
	**/
   public void setLiteralSv300(char[] value) throws CFException {
      work.setLiteralSv300(value);
   } 

	/**
	 *	Returns the value of literalRo300
	 *	@return literalRo300
	 */
   public char[] getLiteralRo300() throws CFException  {              
   		return work.getLiteralRo300();
   }

  
	/**
	*  set variable literalRo300
	*  @param value
	**/
   public void setLiteralRo300(char[] value) throws CFException {
      work.setLiteralRo300(value);
   } 

	/**
	 *	Returns the value of literalOe300
	 *	@return literalOe300
	 */
   public char[] getLiteralOe300() throws CFException  {              
   		return work.getLiteralOe300();
   }

  
	/**
	*  set variable literalOe300
	*  @param value
	**/
   public void setLiteralOe300(char[] value) throws CFException {
      work.setLiteralOe300(value);
   } 

	/**
	 *	Returns the value of svHeaderData282
	 *	@return svHeaderData282
	 */   
	 public SvHeaderData282 getSvHeaderData282() {
   	return svHeaderData282;
   }


	/**
	 *	Returns the value of error46300
	 *	@return error46300
	 */
	public short getError46300() throws CFException {        
   		return work.getError46300();
	}
	
	/**
	 * 	Update Error46300 with the passed value
	 *	@param number
	 */
	public void setError46300(short number)  throws CFException{
		work.setError46300(number);
	}

	public void setError46300(int number)  throws CFException{
		work.setError46300((short)number);
	}

	public void setError46300(long number)  throws CFException{
		work.setError46300((short)number);
	}



	/**
	 *	Returns the value of binary11300
	 *	@return binary11300
	 */
	public short getBinary11300() throws CFException {        
   		return work.getBinary11300();
	}
	
	/**
	 * 	Update Binary11300 with the passed value
	 *	@param number
	 */
	public void setBinary11300(short number)  throws CFException{
		work.setBinary11300(number);
	}

	public void setBinary11300(int number)  throws CFException{
		work.setBinary11300((short)number);
	}

	public void setBinary11300(long number)  throws CFException{
		work.setBinary11300((short)number);
	}



	/**
	 *	Returns the value of literalPl300
	 *	@return literalPl300
	 */
   public char[] getLiteralPl300() throws CFException  {              
   		return work.getLiteralPl300();
   }

  
	/**
	*  set variable literalPl300
	*  @param value
	**/
   public void setLiteralPl300(char[] value) throws CFException {
      work.setLiteralPl300(value);
   } 

	/**
	 *	Returns the value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public long getUuHdrLength299() throws CFException {
   		return unknownHeader299.getUuHdrLength299();
	}


	/**
	 *	Returns String value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public char[]  getUuHdrLength299String() throws CFException {
	     return String.valueOf(unknownHeader299.getUuHdrLength299String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uuHdrLength299IsNumeric()  throws CFException{
	    return unknownHeader299.uuHdrLength299IsNumeric();
	}

	/**
	 * 	Update UuHdrLength299 with the passed value
	 *	@param number
	 */
	public void setUuHdrLength299(long number)  throws CFException{
		unknownHeader299.setUuHdrLength299(number);
	}
	

	
	/**
	 * 	Update UuHdrLength299 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299(char[] value)  throws CFException {
		unknownHeader299.setUuHdrLength299(value);
	}
	
	/**
	 * 	Update UuHdrLength299 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299String(char[] value)  throws CFException{
		unknownHeader299.setUuHdrLength299(value);
	}	


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public Analyze1HeaderOutCtx getAnalyze1HeaderOutCtx() {
            return new Analyze1HeaderOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reHeaderData286.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += plHeaderData284.hashCode();
        str += classCLogRecord260.hashCode();
        str += inHeaderData290.hashCode();
        str += unknownHeader299.hashCode();
        str += svHeaderData282.hashCode();
       return str.hashCode();
    }

    public Analyze1HeaderInCtx clone() {
        Analyze1HeaderInCtx cloneObj = new Analyze1HeaderInCtx();
        cloneObj.reHeaderData286 = new ReHeaderData286();
        cloneObj.reHeaderData286.set(reHeaderData286.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.plHeaderData284 = new PlHeaderData284();
        cloneObj.plHeaderData284.set(plHeaderData284.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.inHeaderData290 = new InHeaderData290();
        cloneObj.inHeaderData290.set(inHeaderData290.getClonedField());
        cloneObj.unknownHeader299 = new UnknownHeader299();
        cloneObj.unknownHeader299.set(unknownHeader299.getClonedField());
        cloneObj.svHeaderData282 = new SvHeaderData282();
        cloneObj.svHeaderData282.set(svHeaderData282.getClonedField());
        return cloneObj;
    }

    }

    public Analyze1HeaderInCtx getAnalyze1HeaderInCtx() {
            return new Analyze1HeaderInCtx();
    }
     public class Analyze1HeaderOutCtx implements Cloneable {
     ReHeaderData286 reHeaderData286 = Sf305120Ctx.this.getReHeaderData286();
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     PlHeaderData284 plHeaderData284 = Sf305120Ctx.this.getPlHeaderData284();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     InHeaderData290 inHeaderData290 = Sf305120Ctx.this.getInHeaderData290();
     UnknownHeader299 unknownHeader299 = Sf305120Ctx.this.getUnknownHeader299();
     SvHeaderData282 svHeaderData282 = Sf305120Ctx.this.getSvHeaderData282();

	/**
	 *	Returns the value of reHeaderData286
	 *	@return reHeaderData286
	 */   
	 public ReHeaderData286 getReHeaderData286() {
   	return reHeaderData286;
   }


	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of error42300
	 *	@return error42300
	 */
	public short getError42300() throws CFException {        
   		return work.getError42300();
	}
	
	/**
	 * 	Update Error42300 with the passed value
	 *	@param number
	 */
	public void setError42300(short number)  throws CFException{
		work.setError42300(number);
	}

	public void setError42300(int number)  throws CFException{
		work.setError42300((short)number);
	}

	public void setError42300(long number)  throws CFException{
		work.setError42300((short)number);
	}



	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {        
   		return work.getCurrOffset420();
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *	@param number
	 */
	public void setCurrOffset420(short number)  throws CFException{
		work.setCurrOffset420(number);
	}

	public void setCurrOffset420(int number)  throws CFException{
		work.setCurrOffset420((short)number);
	}

	public void setCurrOffset420(long number)  throws CFException{
		work.setCurrOffset420((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of error99300
	 *	@return error99300
	 */
	public short getError99300() throws CFException {        
   		return work.getError99300();
	}
	
	/**
	 * 	Update Error99300 with the passed value
	 *	@param number
	 */
	public void setError99300(short number)  throws CFException{
		work.setError99300(number);
	}

	public void setError99300(int number)  throws CFException{
		work.setError99300((short)number);
	}

	public void setError99300(long number)  throws CFException{
		work.setError99300((short)number);
	}



	/**
	 *	Returns the value of error45300
	 *	@return error45300
	 */
	public short getError45300() throws CFException {        
   		return work.getError45300();
	}
	
	/**
	 * 	Update Error45300 with the passed value
	 *	@param number
	 */
	public void setError45300(short number)  throws CFException{
		work.setError45300(number);
	}

	public void setError45300(int number)  throws CFException{
		work.setError45300((short)number);
	}

	public void setError45300(long number)  throws CFException{
		work.setError45300((short)number);
	}



	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of binary24300
	 *	@return binary24300
	 */
	public short getBinary24300() throws CFException {        
   		return work.getBinary24300();
	}
	
	/**
	 * 	Update Binary24300 with the passed value
	 *	@param number
	 */
	public void setBinary24300(short number)  throws CFException{
		work.setBinary24300(number);
	}

	public void setBinary24300(int number)  throws CFException{
		work.setBinary24300((short)number);
	}

	public void setBinary24300(long number)  throws CFException{
		work.setBinary24300((short)number);
	}



	/**
	 *	Returns the value of binary512300
	 *	@return binary512300
	 */
	public short getBinary512300() throws CFException {        
   		return work.getBinary512300();
	}
	
	/**
	 * 	Update Binary512300 with the passed value
	 *	@param number
	 */
	public void setBinary512300(short number)  throws CFException{
		work.setBinary512300(number);
	}

	public void setBinary512300(int number)  throws CFException{
		work.setBinary512300((short)number);
	}

	public void setBinary512300(long number)  throws CFException{
		work.setBinary512300((short)number);
	}



	/**
	 *	Returns the value of error43300
	 *	@return error43300
	 */
	public short getError43300() throws CFException {        
   		return work.getError43300();
	}
	
	/**
	 * 	Update Error43300 with the passed value
	 *	@param number
	 */
	public void setError43300(short number)  throws CFException{
		work.setError43300(number);
	}

	public void setError43300(int number)  throws CFException{
		work.setError43300((short)number);
	}

	public void setError43300(long number)  throws CFException{
		work.setError43300((short)number);
	}



	/**
	 *	Returns the value of error44300
	 *	@return error44300
	 */
	public short getError44300() throws CFException {        
   		return work.getError44300();
	}
	
	/**
	 * 	Update Error44300 with the passed value
	 *	@param number
	 */
	public void setError44300(short number)  throws CFException{
		work.setError44300(number);
	}

	public void setError44300(int number)  throws CFException{
		work.setError44300((short)number);
	}

	public void setError44300(long number)  throws CFException{
		work.setError44300((short)number);
	}



	/**
	 *	Returns the value of inHeaderData290
	 *	@return inHeaderData290
	 */   
	 public InHeaderData290 getInHeaderData290() {
   	return inHeaderData290;
   }


	/**
	 *	Returns the value of unknownHeader299
	 *	@return unknownHeader299
	 */   
	 public UnknownHeader299 getUnknownHeader299() {
   	return unknownHeader299;
   }


	/**
	 *	Returns the value of error41300
	 *	@return error41300
	 */
	public short getError41300() throws CFException {        
   		return work.getError41300();
	}
	
	/**
	 * 	Update Error41300 with the passed value
	 *	@param number
	 */
	public void setError41300(short number)  throws CFException{
		work.setError41300(number);
	}

	public void setError41300(int number)  throws CFException{
		work.setError41300((short)number);
	}

	public void setError41300(long number)  throws CFException{
		work.setError41300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsg3Lnth
	 *	@return sf539IsoMsg3Lnth
	 */
	public short getSf539IsoMsg3Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg3Lnth();
	}
	
	/**
	 * 	Update Sf539IsoMsg3Lnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg3Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Lnth(number);
	}

	public void setSf539IsoMsg3Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Lnth((short)number);
	}

	public void setSf539IsoMsg3Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Lnth((short)number);
	}



	/**
	 *	Returns the value of oeHeaderData280
	 *	@return oeHeaderData280
	 */
   public char[] getOeHeaderData280() throws CFException  {              
   		return work.getOeHeaderData280();
   }

  
	/**
	*  set variable oeHeaderData280
	*  @param value
	**/
   public void setOeHeaderData280(char[] value) throws CFException {
      work.setOeHeaderData280(value);
   } 

	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of binary38300
	 *	@return binary38300
	 */
	public short getBinary38300() throws CFException {        
   		return work.getBinary38300();
	}
	
	/**
	 * 	Update Binary38300 with the passed value
	 *	@param number
	 */
	public void setBinary38300(short number)  throws CFException{
		work.setBinary38300(number);
	}

	public void setBinary38300(int number)  throws CFException{
		work.setBinary38300((short)number);
	}

	public void setBinary38300(long number)  throws CFException{
		work.setBinary38300((short)number);
	}



	/**
	 *	Returns the value of plHeaderData284
	 *	@return plHeaderData284
	 */   
	 public PlHeaderData284 getPlHeaderData284() {
   	return plHeaderData284;
   }


	/**
	 *	Returns the value of svHeaderData282
	 *	@return svHeaderData282
	 */   
	 public SvHeaderData282 getSvHeaderData282() {
   	return svHeaderData282;
   }


	/**
	 *	Returns the value of sf539IsoMsg3Offset
	 *	@return sf539IsoMsg3Offset
	 */
	public short getSf539IsoMsg3Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsg3Offset();
	}
	
	/**
	 * 	Update Sf539IsoMsg3Offset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsg3Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Offset(number);
	}

	public void setSf539IsoMsg3Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Offset((short)number);
	}

	public void setSf539IsoMsg3Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsg3Offset((short)number);
	}



	/**
	 *	Returns the value of workLength420
	 *	@return workLength420
	 */
	public short getWorkLength420() throws CFException {        
   		return work.getWorkLength420();
	}
	
	/**
	 * 	Update WorkLength420 with the passed value
	 *	@param number
	 */
	public void setWorkLength420(short number)  throws CFException{
		work.setWorkLength420(number);
	}

	public void setWorkLength420(int number)  throws CFException{
		work.setWorkLength420((short)number);
	}

	public void setWorkLength420(long number)  throws CFException{
		work.setWorkLength420((short)number);
	}



	/**
	 *	Returns the value of error46300
	 *	@return error46300
	 */
	public short getError46300() throws CFException {        
   		return work.getError46300();
	}
	
	/**
	 * 	Update Error46300 with the passed value
	 *	@param number
	 */
	public void setError46300(short number)  throws CFException{
		work.setError46300(number);
	}

	public void setError46300(int number)  throws CFException{
		work.setError46300((short)number);
	}

	public void setError46300(long number)  throws CFException{
		work.setError46300((short)number);
	}



	/**
	 *	Returns the value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public long getUuHdrLength299() throws CFException {
   		return unknownHeader299.getUuHdrLength299();
	}


	/**
	 *	Returns String value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public char[]  getUuHdrLength299String() throws CFException {
	     return String.valueOf(unknownHeader299.getUuHdrLength299String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uuHdrLength299IsNumeric()  throws CFException{
	    return unknownHeader299.uuHdrLength299IsNumeric();
	}

	/**
	 * 	Update UuHdrLength299 with the passed value
	 *	@param number
	 */
	public void setUuHdrLength299(long number)  throws CFException{
		unknownHeader299.setUuHdrLength299(number);
	}
	

	
	/**
	 * 	Update UuHdrLength299 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299(char[] value)  throws CFException {
		unknownHeader299.setUuHdrLength299(value);
	}
	
	/**
	 * 	Update UuHdrLength299 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299String(char[] value)  throws CFException{
		unknownHeader299.setUuHdrLength299(value);
	}	

	/**
	 *	Returns the value of uuHeaderId299
	 *	@return uuHeaderId299
	 */
   public char[] getUuHeaderId299() throws CFException  {              
   		return unknownHeader299.getUuHeaderId299();
   }

  
	/**
	*  set variable uuHeaderId299
	*  @param value
	**/
   public void setUuHeaderId299(char[] value) throws CFException {
      unknownHeader299.setUuHeaderId299(value);
   } 

     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex) throws CFException {
      unknownHeader299.setUuHeaderId299(source, sourceIndex);
   	
   }
   
   public void setUuHeaderId299(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UuHeaderId299 with another Field
	 *	@param value
	 */
   public void setUuHeaderId299(Field source) {
      unknownHeader299.setUuHeaderId299(source);
   }  
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      unknownHeader299.setUuHeaderId299(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of plPayloadLnth284
	 *	@return plPayloadLnth284
	 */
	public long getPlPayloadLnth284() throws CFException {
   		return plHeaderData284.getPlPayloadLnth284();
	}


	/**
	 *	Returns String value of plPayloadLnth284
	 *	@return plPayloadLnth284
	 */
	public char[]  getPlPayloadLnth284String() throws CFException {
	     return String.valueOf(plHeaderData284.getPlPayloadLnth284String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plPayloadLnth284IsNumeric()  throws CFException{
	    return plHeaderData284.plPayloadLnth284IsNumeric();
	}

	/**
	 * 	Update PlPayloadLnth284 with the passed value
	 *	@param number
	 */
	public void setPlPayloadLnth284(long number)  throws CFException{
		plHeaderData284.setPlPayloadLnth284(number);
	}
	

	
	/**
	 * 	Update PlPayloadLnth284 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlPayloadLnth284(char[] value)  throws CFException {
		plHeaderData284.setPlPayloadLnth284(value);
	}
	
	/**
	 * 	Update PlPayloadLnth284 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlPayloadLnth284String(char[] value)  throws CFException{
		plHeaderData284.setPlPayloadLnth284(value);
	}	


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reHeaderData286.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += plHeaderData284.hashCode();
        str += classCLogRecord260.hashCode();
        str += inHeaderData290.hashCode();
        str += unknownHeader299.hashCode();
        str += svHeaderData282.hashCode();
       return str.hashCode();
    }

    public Analyze1HeaderOutCtx clone() {
        Analyze1HeaderOutCtx cloneObj = new Analyze1HeaderOutCtx();
        cloneObj.reHeaderData286 = new ReHeaderData286();
        cloneObj.reHeaderData286.set(reHeaderData286.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.plHeaderData284 = new PlHeaderData284();
        cloneObj.plHeaderData284.set(plHeaderData284.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.inHeaderData290 = new InHeaderData290();
        cloneObj.inHeaderData290.set(inHeaderData290.getClonedField());
        cloneObj.unknownHeader299 = new UnknownHeader299();
        cloneObj.unknownHeader299.set(unknownHeader299.getClonedField());
        cloneObj.svHeaderData282 = new SvHeaderData282();
        cloneObj.svHeaderData282.set(svHeaderData282.getClonedField());
        return cloneObj;
    }

    }

    public Analyze1HeaderOutCtx getAnalyze1HeaderOutCtx() {
            return new Analyze1HeaderOutCtx();
    }
     public class ClearClogWorkareasInCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of clogSvcDataLnth801
	 *	@return clogSvcDataLnth801
	 */
	public short getClogSvcDataLnth801() throws CFException {        
   		return clogRecord801.getCFixedHeader801().getClogSvcDataLnth801();
	}
	
	/**
	 * 	Update ClogSvcDataLnth801 with the passed value
	 *	@param number
	 */
	public void setClogSvcDataLnth801(short number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801(number);
	}

	public void setClogSvcDataLnth801(int number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801((short)number);
	}

	public void setClogSvcDataLnth801(long number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {        
   		return work.getBinary1300();
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *	@param number
	 */
	public void setBinary1300(short number)  throws CFException{
		work.setBinary1300(number);
	}

	public void setBinary1300(int number)  throws CFException{
		work.setBinary1300((short)number);
	}

	public void setBinary1300(long number)  throws CFException{
		work.setBinary1300((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ClearClogWorkareasOutCtx getClearClogWorkareasOutCtx() {
            return new ClearClogWorkareasOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ClearClogWorkareasInCtx clone() {
        ClearClogWorkareasInCtx cloneObj = new ClearClogWorkareasInCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ClearClogWorkareasInCtx getClearClogWorkareasInCtx() {
            return new ClearClogWorkareasInCtx();
    }
     public class ClearClogWorkareasOutCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of sf539ZlogElapsedTime
	 *	@return sf539ZlogElapsedTime
	 */
	public int getSf539ZlogElapsedTime() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogElapsedTime();
	}
	
	/**
	 * 	Update Sf539ZlogElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf539ZlogElapsedTime(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogElapsedTime(number);
	}


	public void setSf539ZlogElapsedTime(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogElapsedTime((int)number);
	}


	/**
	 *	Returns the value of zlogSr2Area803
	 *	@return zlogSr2Area803
	 */
   public char[] getZlogSr2Area803() throws CFException  {              
   		return work.getZlogSr2Area803();
   }

  
	/**
	*  set variable zlogSr2Area803
	*  @param value
	**/
   public void setZlogSr2Area803(char[] value) throws CFException {
      work.setZlogSr2Area803(value);
   } 

	/**
	 *	Returns the value of payload1Ptr410
	 *	@return payload1Ptr410
	 */
	public short getPayload1Ptr410() throws CFException {        
   		return zlogPointers410.getPayload1Ptr410();
	}
	
	/**
	 * 	Update Payload1Ptr410 with the passed value
	 *	@param number
	 */
	public void setPayload1Ptr410(short number)  throws CFException{
		zlogPointers410.setPayload1Ptr410(number);
	}

	public void setPayload1Ptr410(int number)  throws CFException{
		zlogPointers410.setPayload1Ptr410((short)number);
	}

	public void setPayload1Ptr410(long number)  throws CFException{
		zlogPointers410.setPayload1Ptr410((short)number);
	}



	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of sf539Sr2Length
	 *	@return sf539Sr2Length
	 */
	public short getSf539Sr2Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr2Length();
	}
	
	/**
	 * 	Update Sf539Sr2Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr2Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length(number);
	}

	public void setSf539Sr2Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}

	public void setSf539Sr2Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr2Length((short)number);
	}



	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {        
   		return work.getBinary1300();
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *	@param number
	 */
	public void setBinary1300(short number)  throws CFException{
		work.setBinary1300(number);
	}

	public void setBinary1300(int number)  throws CFException{
		work.setBinary1300((short)number);
	}

	public void setBinary1300(long number)  throws CFException{
		work.setBinary1300((short)number);
	}



	/**
	 *	Returns the value of sf539IsoMsgLnth
	 *	@return sf539IsoMsgLnth
	 */
	public short getSf539IsoMsgLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgLnth();
	}
	
	/**
	 * 	Update Sf539IsoMsgLnth with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgLnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth(number);
	}

	public void setSf539IsoMsgLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}

	public void setSf539IsoMsgLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgLnth((short)number);
	}



	/**
	 *	Returns the value of clogSvcDataLnth801
	 *	@return clogSvcDataLnth801
	 */
	public short getClogSvcDataLnth801() throws CFException {        
   		return clogRecord801.getCFixedHeader801().getClogSvcDataLnth801();
	}
	
	/**
	 * 	Update ClogSvcDataLnth801 with the passed value
	 *	@param number
	 */
	public void setClogSvcDataLnth801(short number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801(number);
	}

	public void setClogSvcDataLnth801(int number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801((short)number);
	}

	public void setClogSvcDataLnth801(long number)  throws CFException{
		clogRecord801.getCFixedHeader801().setClogSvcDataLnth801((short)number);
	}



	/**
	 *	Returns the value of sf539ServiceTable
	 *	@return sf539ServiceTable
	 */   
	 public Sf539ServiceTable getSf539ServiceTable(int index) {
   	return sf539Sf305020ControlBlock.getSf539ServiceTable(index);
   }

    public List<Sf539ServiceTable> getSf539ServiceTable() {
        return sf539Sf305020ControlBlock.getSf539ServiceTable();
    }
   /**
	* 	Update Sf539ServiceTable with the passed value
	*	@param value
	*/
   public void setSf539ServiceTable(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539ServiceTable((index),value);
   }   


	/**
	 *	Returns the value of sf539IsoMsgOffset
	 *	@return sf539IsoMsgOffset
	 */
	public short getSf539IsoMsgOffset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539IsoMsgOffset();
	}
	
	/**
	 * 	Update Sf539IsoMsgOffset with the passed value
	 *	@param number
	 */
	public void setSf539IsoMsgOffset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset(number);
	}

	public void setSf539IsoMsgOffset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}

	public void setSf539IsoMsgOffset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539IsoMsgOffset((short)number);
	}



	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of sf539HeaderSpec
	 *	@return sf539HeaderSpec
	 */
   public char[] getSf539HeaderSpec() throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539HeaderSpec();
   }

  
	/**
	*  set variable sf539HeaderSpec
	*  @param value
	**/
   public void setSf539HeaderSpec(char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(value);
   } 

     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex);
   	
   }
   
   public void setSf539HeaderSpec(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539HeaderSpec with another Field
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source);
   }  
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539HeaderSpec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539HeaderSpec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.setSf539HeaderSpec(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539Sr1Length
	 *	@return sf539Sr1Length
	 */
	public short getSf539Sr1Length() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Sr1Length();
	}
	
	/**
	 * 	Update Sf539Sr1Length with the passed value
	 *	@param number
	 */
	public void setSf539Sr1Length(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length(number);
	}

	public void setSf539Sr1Length(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}

	public void setSf539Sr1Length(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Sr1Length((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ClearClogWorkareasOutCtx clone() {
        ClearClogWorkareasOutCtx cloneObj = new ClearClogWorkareasOutCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ClearClogWorkareasOutCtx getClearClogWorkareasOutCtx() {
            return new ClearClogWorkareasOutCtx();
    }
     public class ExpandRucHeaderInCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();

	/**
	 *	Returns the value of rucX9aDataLength260
	 *	@return rucX9aDataLength260
	 */
	public short getRucX9aDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucX9aDataLength260();
	}
	
	/**
	 * 	Update RucX9aDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucX9aDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260(number);
	}

	public void setRucX9aDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260((short)number);
	}

	public void setRucX9aDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260((short)number);
	}



	/**
	 *	Returns the value of clogRecord801
	 *	@return clogRecord801
	 */   
	 public ClogRecord801 getClogRecord801() {
   	return clogRecord801;
   }


	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of rucEitDataLength260
	 *	@return rucEitDataLength260
	 */
	public short getRucEitDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEitDataLength260();
	}
	
	/**
	 * 	Update RucEitDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEitDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260(number);
	}

	public void setRucEitDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260((short)number);
	}

	public void setRucEitDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260((short)number);
	}



	/**
	 *	Returns the value of binary39300
	 *	@return binary39300
	 */
	public short getBinary39300() throws CFException {        
   		return work.getBinary39300();
	}
	
	/**
	 * 	Update Binary39300 with the passed value
	 *	@param number
	 */
	public void setBinary39300(short number)  throws CFException{
		work.setBinary39300(number);
	}

	public void setBinary39300(int number)  throws CFException{
		work.setBinary39300((short)number);
	}

	public void setBinary39300(long number)  throws CFException{
		work.setBinary39300((short)number);
	}



	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }



        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ExpandRucHeaderOutCtx getExpandRucHeaderOutCtx() {
            return new ExpandRucHeaderOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
       return str.hashCode();
    }

    public ExpandRucHeaderInCtx clone() {
        ExpandRucHeaderInCtx cloneObj = new ExpandRucHeaderInCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        return cloneObj;
    }

    }

    public ExpandRucHeaderInCtx getExpandRucHeaderInCtx() {
            return new ExpandRucHeaderInCtx();
    }
     public class ExpandRucHeaderOutCtx implements Cloneable {
     ClogRecord801 clogRecord801 = Sf305120Ctx.this.getClogRecord801();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     Work work = Sf305120Ctx.this.getWork();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ClassCLogRecord260 classCLogRecord260 = Sf305120Ctx.this.getClassCLogRecord260();
     EsHeaderData270 esHeaderData270 = Sf305120Ctx.this.getEsHeaderData270();

	/**
	 *	Returns the value of clogRecord801
	 *	@return clogRecord801
	 */   
	 public ClogRecord801 getClogRecord801() {
   	return clogRecord801;
   }


	/**
	 *	Returns the value of sf539Trailer1Lnth
	 *	@return sf539Trailer1Lnth
	 */
	public short getSf539Trailer1Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer1Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth(number);
	}

	public void setSf539Trailer1Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}

	public void setSf539Trailer1Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Lnth((short)number);
	}



	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of sf539Trailer1Offset
	 *	@return sf539Trailer1Offset
	 */
	public short getSf539Trailer1Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer1Offset();
	}
	
	/**
	 * 	Update Sf539Trailer1Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer1Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset(number);
	}

	public void setSf539Trailer1Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}

	public void setSf539Trailer1Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer1Offset((short)number);
	}



	/**
	 *	Returns the value of x9aOffset400
	 *	@return x9aOffset400
	 */
	public int getX9aOffset400() throws CFException {        
   		return programCounters400.getX9aOffset400();
	}
	
	/**
	 * 	Update X9aOffset400 with the passed value
	 *	@param number
	 */
	public void setX9aOffset400(int number)  throws CFException{
		programCounters400.setX9aOffset400(number);
	}


	public void setX9aOffset400(long number)  throws CFException{
		programCounters400.setX9aOffset400((int)number);
	}


	/**
	 *	Returns the value of sf539Trailer2Lnth
	 *	@return sf539Trailer2Lnth
	 */
	public short getSf539Trailer2Lnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Lnth();
	}
	
	/**
	 * 	Update Sf539Trailer2Lnth with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Lnth(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth(number);
	}

	public void setSf539Trailer2Lnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}

	public void setSf539Trailer2Lnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Lnth((short)number);
	}



	/**
	 *	Returns the value of eitOffset400
	 *	@return eitOffset400
	 */
	public int getEitOffset400() throws CFException {        
   		return programCounters400.getEitOffset400();
	}
	
	/**
	 * 	Update EitOffset400 with the passed value
	 *	@param number
	 */
	public void setEitOffset400(int number)  throws CFException{
		programCounters400.setEitOffset400(number);
	}


	public void setEitOffset400(long number)  throws CFException{
		programCounters400.setEitOffset400((int)number);
	}


	/**
	 *	Returns the value of classCLogRecord260
	 *	@return classCLogRecord260
	 */   
	 public ClassCLogRecord260 getClassCLogRecord260() {
   	return classCLogRecord260;
   }


	/**
	 *	Returns the value of esHeaderData270
	 *	@return esHeaderData270
	 */   
	 public EsHeaderData270 getEsHeaderData270() {
   	return esHeaderData270;
   }


	/**
	 *	Returns the value of sf539Trailer2Offset
	 *	@return sf539Trailer2Offset
	 */
	public short getSf539Trailer2Offset() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539Trailer2Offset();
	}
	
	/**
	 * 	Update Sf539Trailer2Offset with the passed value
	 *	@param number
	 */
	public void setSf539Trailer2Offset(short number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset(number);
	}

	public void setSf539Trailer2Offset(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}

	public void setSf539Trailer2Offset(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539Trailer2Offset((short)number);
	}



	/**
	 *	Returns the value of rucX9aDataLength260
	 *	@return rucX9aDataLength260
	 */
	public short getRucX9aDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucX9aDataLength260();
	}
	
	/**
	 * 	Update RucX9aDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucX9aDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260(number);
	}

	public void setRucX9aDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260((short)number);
	}

	public void setRucX9aDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucX9aDataLength260((short)number);
	}



	/**
	 *	Returns the value of rucEsDataLength260
	 *	@return rucEsDataLength260
	 */
	public short getRucEsDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEsDataLength260();
	}
	
	/**
	 * 	Update RucEsDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEsDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260(number);
	}

	public void setRucEsDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}

	public void setRucEsDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEsDataLength260((short)number);
	}



	/**
	 *	Returns the value of rucEitDataLength260
	 *	@return rucEitDataLength260
	 */
	public short getRucEitDataLength260() throws CFException {        
   		return classCLogRecord260.getAdditionalRuc260Redefined().getRucEitDataLength260();
	}
	
	/**
	 * 	Update RucEitDataLength260 with the passed value
	 *	@param number
	 */
	public void setRucEitDataLength260(short number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260(number);
	}

	public void setRucEitDataLength260(int number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260((short)number);
	}

	public void setRucEitDataLength260(long number)  throws CFException{
		classCLogRecord260.getAdditionalRuc260Redefined().setRucEitDataLength260((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clogRecord801.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += work.hashCode();
        str += programCounters400.hashCode();
        str += classCLogRecord260.hashCode();
        str += esHeaderData270.hashCode();
       return str.hashCode();
    }

    public ExpandRucHeaderOutCtx clone() {
        ExpandRucHeaderOutCtx cloneObj = new ExpandRucHeaderOutCtx();
        cloneObj.clogRecord801 = new ClogRecord801();
        cloneObj.clogRecord801.set(clogRecord801.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.classCLogRecord260 = new ClassCLogRecord260();
        cloneObj.classCLogRecord260.set(classCLogRecord260.getClonedField());
        cloneObj.esHeaderData270 = new EsHeaderData270();
        cloneObj.esHeaderData270.set(esHeaderData270.getClonedField());
        return cloneObj;
    }

    }

    public ExpandRucHeaderOutCtx getExpandRucHeaderOutCtx() {
            return new ExpandRucHeaderOutCtx();
    }
     public class ParseServreqHeaderInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of servInfoCount410
	 *	@return servInfoCount410
	 */
	public short getServInfoCount410() throws CFException {        
   		return zlogPointers410.getServInfoCount410();
	}
	
	/**
	 * 	Update ServInfoCount410 with the passed value
	 *	@param number
	 */
	public void setServInfoCount410(short number)  throws CFException{
		zlogPointers410.setServInfoCount410(number);
	}

	public void setServInfoCount410(int number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}

	public void setServInfoCount410(long number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}



	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of srRequestCount802
	 *	@return srRequestCount802
	 */
   public char[] getSrRequestCount802() throws CFException  {              
   		return zlogSr1Area802.getSrvreqHeader802().getSrRequestCount802();
   }

  
	/**
	*  set variable srRequestCount802
	*  @param value
	**/
   public void setSrRequestCount802(char[] value) throws CFException {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(value);
   } 

     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex);
   	
   }
   
   public void setSrRequestCount802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrRequestCount802 with another Field
	 *	@param value
	 */
   public void setSrRequestCount802(Field source) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source);
   }  
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ParseServreqHeaderOutCtx getParseServreqHeaderOutCtx() {
            return new ParseServreqHeaderOutCtx();
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
        str += z9Int16Group800.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServreqHeaderInCtx clone() {
        ParseServreqHeaderInCtx cloneObj = new ParseServreqHeaderInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreqHeaderInCtx getParseServreqHeaderInCtx() {
            return new ParseServreqHeaderInCtx();
    }
     public class ParseServreqHeaderOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     Z9Int16Group800 z9Int16Group800 = Sf305120Ctx.this.getZ9Int16Group800();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of servInfoCount410
	 *	@return servInfoCount410
	 */
	public short getServInfoCount410() throws CFException {        
   		return zlogPointers410.getServInfoCount410();
	}
	
	/**
	 * 	Update ServInfoCount410 with the passed value
	 *	@param number
	 */
	public void setServInfoCount410(short number)  throws CFException{
		zlogPointers410.setServInfoCount410(number);
	}

	public void setServInfoCount410(int number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}

	public void setServInfoCount410(long number)  throws CFException{
		zlogPointers410.setServInfoCount410((short)number);
	}



	/**
	 *	Returns the value of z9Int16800
	 *	@return z9Int16800
	 */
	public short getZ9Int16800() throws CFException {        
   		return z9Int16Group800.getZ9Int16800();
	}
	
	/**
	 * 	Update Z9Int16800 with the passed value
	 *	@param number
	 */
	public void setZ9Int16800(short number)  throws CFException{
		z9Int16Group800.setZ9Int16800(number);
	}

	public void setZ9Int16800(int number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}

	public void setZ9Int16800(long number)  throws CFException{
		z9Int16Group800.setZ9Int16800((short)number);
	}



	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of srRequestCount802
	 *	@return srRequestCount802
	 */
   public char[] getSrRequestCount802() throws CFException  {              
   		return zlogSr1Area802.getSrvreqHeader802().getSrRequestCount802();
   }

  
	/**
	*  set variable srRequestCount802
	*  @param value
	**/
   public void setSrRequestCount802(char[] value) throws CFException {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(value);
   } 

     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex);
   	
   }
   
   public void setSrRequestCount802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrRequestCount802 with another Field
	 *	@param value
	 */
   public void setSrRequestCount802(Field source) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source);
   }  
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.getSrvreqHeader802().setSrRequestCount802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int16B2800
	 *	@return z9Int16B2800
	 */
   public char[] getZ9Int16B2800() throws CFException  {              
   		return z9Int16Group800.getZ9Int16X800().getZ9Int16B2800();
   }

  
	/**
	*  set variable z9Int16B2800
	*  @param value
	**/
   public void setZ9Int16B2800(char[] value) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(value);
   } 

     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex) throws CFException {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex);
   	
   }
   
   public void setZ9Int16B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int16B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source);
   }  
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int16B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int16B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int16Group800.getZ9Int16X800().setZ9Int16B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += z9Int16Group800.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServreqHeaderOutCtx clone() {
        ParseServreqHeaderOutCtx cloneObj = new ParseServreqHeaderOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.z9Int16Group800 = new Z9Int16Group800();
        cloneObj.z9Int16Group800.set(z9Int16Group800.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServreqHeaderOutCtx getParseServreqHeaderOutCtx() {
            return new ParseServreqHeaderOutCtx();
    }
     public class ParseRoutingHeaderInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     RhInt16Group810 rhInt16Group810 = Sf305120Ctx.this.getRhInt16Group810();
     RhSource810 rhSource810 = Sf305120Ctx.this.getRhSource810();
     RhDestination810 rhDestination810 = Sf305120Ctx.this.getRhDestination810();
     RhErrorDestination810 rhErrorDestination810 = Sf305120Ctx.this.getRhErrorDestination810();

	/**
	 *	Returns the value of binary21300
	 *	@return binary21300
	 */
	public short getBinary21300() throws CFException {        
   		return work.getBinary21300();
	}
	
	/**
	 * 	Update Binary21300 with the passed value
	 *	@param number
	 */
	public void setBinary21300(short number)  throws CFException{
		work.setBinary21300(number);
	}

	public void setBinary21300(int number)  throws CFException{
		work.setBinary21300((short)number);
	}

	public void setBinary21300(long number)  throws CFException{
		work.setBinary21300((short)number);
	}



	/**
	 *	Returns the value of rhTotalLnth810
	 *	@return rhTotalLnth810
	 */
	public short getRhTotalLnth810() throws CFException {        
   		return work.getRhTotalLnth810();
	}
	
	/**
	 * 	Update RhTotalLnth810 with the passed value
	 *	@param number
	 */
	public void setRhTotalLnth810(short number)  throws CFException{
		work.setRhTotalLnth810(number);
	}

	public void setRhTotalLnth810(int number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}

	public void setRhTotalLnth810(long number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}



	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {        
   		return work.getBinary2300();
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *	@param number
	 */
	public void setBinary2300(short number)  throws CFException{
		work.setBinary2300(number);
	}

	public void setBinary2300(int number)  throws CFException{
		work.setBinary2300((short)number);
	}

	public void setBinary2300(long number)  throws CFException{
		work.setBinary2300((short)number);
	}



	/**
	 *	Returns the value of rhErrorDestination810
	 *	@return rhErrorDestination810
	 */   
	 public RhErrorDestination810 getRhErrorDestination810() {
   	return rhErrorDestination810;
   }


	/**
	 *	Returns the value of rhLnth3810
	 *	@return rhLnth3810
	 */
	public short getRhLnth3810() throws CFException {        
   		return work.getRhLnth3810();
	}
	
	/**
	 * 	Update RhLnth3810 with the passed value
	 *	@param number
	 */
	public void setRhLnth3810(short number)  throws CFException{
		work.setRhLnth3810(number);
	}

	public void setRhLnth3810(int number)  throws CFException{
		work.setRhLnth3810((short)number);
	}

	public void setRhLnth3810(long number)  throws CFException{
		work.setRhLnth3810((short)number);
	}



	/**
	 *	Returns the value of binary3300
	 *	@return binary3300
	 */
	public short getBinary3300() throws CFException {        
   		return work.getBinary3300();
	}
	
	/**
	 * 	Update Binary3300 with the passed value
	 *	@param number
	 */
	public void setBinary3300(short number)  throws CFException{
		work.setBinary3300(number);
	}

	public void setBinary3300(int number)  throws CFException{
		work.setBinary3300((short)number);
	}

	public void setBinary3300(long number)  throws CFException{
		work.setBinary3300((short)number);
	}



	/**
	 *	Returns the value of rhLnth1810
	 *	@return rhLnth1810
	 */
	public short getRhLnth1810() throws CFException {        
   		return work.getRhLnth1810();
	}
	
	/**
	 * 	Update RhLnth1810 with the passed value
	 *	@param number
	 */
	public void setRhLnth1810(short number)  throws CFException{
		work.setRhLnth1810(number);
	}

	public void setRhLnth1810(int number)  throws CFException{
		work.setRhLnth1810((short)number);
	}

	public void setRhLnth1810(long number)  throws CFException{
		work.setRhLnth1810((short)number);
	}



	/**
	 *	Returns the value of rhSource810
	 *	@return rhSource810
	 */   
	 public RhSource810 getRhSource810() {
   	return rhSource810;
   }


	/**
	 *	Returns the value of binary4300
	 *	@return binary4300
	 */
	public short getBinary4300() throws CFException {        
   		return work.getBinary4300();
	}
	
	/**
	 * 	Update Binary4300 with the passed value
	 *	@param number
	 */
	public void setBinary4300(short number)  throws CFException{
		work.setBinary4300(number);
	}

	public void setBinary4300(int number)  throws CFException{
		work.setBinary4300((short)number);
	}

	public void setBinary4300(long number)  throws CFException{
		work.setBinary4300((short)number);
	}



	/**
	 *	Returns the value of rhDestination810
	 *	@return rhDestination810
	 */   
	 public RhDestination810 getRhDestination810() {
   	return rhDestination810;
   }


	/**
	 *	Returns the value of rhLnth2810
	 *	@return rhLnth2810
	 */
	public short getRhLnth2810() throws CFException {        
   		return work.getRhLnth2810();
	}
	
	/**
	 * 	Update RhLnth2810 with the passed value
	 *	@param number
	 */
	public void setRhLnth2810(short number)  throws CFException{
		work.setRhLnth2810(number);
	}

	public void setRhLnth2810(int number)  throws CFException{
		work.setRhLnth2810((short)number);
	}

	public void setRhLnth2810(long number)  throws CFException{
		work.setRhLnth2810((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ParseRoutingHeaderOutCtx getParseRoutingHeaderOutCtx() {
            return new ParseRoutingHeaderOutCtx();
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
        str += zlogSr1Area802.hashCode();
        str += rhInt16Group810.hashCode();
        str += rhSource810.hashCode();
        str += rhDestination810.hashCode();
        str += rhErrorDestination810.hashCode();
       return str.hashCode();
    }

    public ParseRoutingHeaderInCtx clone() {
        ParseRoutingHeaderInCtx cloneObj = new ParseRoutingHeaderInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.rhInt16Group810 = new RhInt16Group810();
        cloneObj.rhInt16Group810.set(rhInt16Group810.getClonedField());
        cloneObj.rhSource810 = new RhSource810();
        cloneObj.rhSource810.set(rhSource810.getClonedField());
        cloneObj.rhDestination810 = new RhDestination810();
        cloneObj.rhDestination810.set(rhDestination810.getClonedField());
        cloneObj.rhErrorDestination810 = new RhErrorDestination810();
        cloneObj.rhErrorDestination810.set(rhErrorDestination810.getClonedField());
        return cloneObj;
    }

    }

    public ParseRoutingHeaderInCtx getParseRoutingHeaderInCtx() {
            return new ParseRoutingHeaderInCtx();
    }
     public class ParseRoutingHeaderOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     RhInt16Group810 rhInt16Group810 = Sf305120Ctx.this.getRhInt16Group810();
     RhSource810 rhSource810 = Sf305120Ctx.this.getRhSource810();
     RhDestination810 rhDestination810 = Sf305120Ctx.this.getRhDestination810();
     RhErrorDestination810 rhErrorDestination810 = Sf305120Ctx.this.getRhErrorDestination810();

	/**
	 *	Returns the value of binary21300
	 *	@return binary21300
	 */
	public short getBinary21300() throws CFException {        
   		return work.getBinary21300();
	}
	
	/**
	 * 	Update Binary21300 with the passed value
	 *	@param number
	 */
	public void setBinary21300(short number)  throws CFException{
		work.setBinary21300(number);
	}

	public void setBinary21300(int number)  throws CFException{
		work.setBinary21300((short)number);
	}

	public void setBinary21300(long number)  throws CFException{
		work.setBinary21300((short)number);
	}



	/**
	 *	Returns the value of rhTotalLnth810
	 *	@return rhTotalLnth810
	 */
	public short getRhTotalLnth810() throws CFException {        
   		return work.getRhTotalLnth810();
	}
	
	/**
	 * 	Update RhTotalLnth810 with the passed value
	 *	@param number
	 */
	public void setRhTotalLnth810(short number)  throws CFException{
		work.setRhTotalLnth810(number);
	}

	public void setRhTotalLnth810(int number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}

	public void setRhTotalLnth810(long number)  throws CFException{
		work.setRhTotalLnth810((short)number);
	}



	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhSourceLnth810
	 *	@return rhSourceLnth810
	 */
   public char[] getRhSourceLnth810() throws CFException  {              
   		return rhSource810.getRhSourceLnth810();
   }

  
	/**
	*  set variable rhSourceLnth810
	*  @param value
	**/
   public void setRhSourceLnth810(char[] value) throws CFException {
      rhSource810.setRhSourceLnth810(value);
   } 

     /**
	 * 	Update RhSourceLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhSourceLnth810(char[] source, int sourceIndex) throws CFException {
      rhSource810.setRhSourceLnth810(source, sourceIndex);
   	
   }
   
   public void setRhSourceLnth810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhSource810.setRhSourceLnth810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhSource810.setRhSourceLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhSourceLnth810 with another Field
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source) {
      rhSource810.setRhSourceLnth810(source);
   }  
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source, int sourceIndex,int sourceLen) {
      rhSource810.setRhSourceLnth810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhSource810.setRhSourceLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhErrorDestination810
	 *	@return rhErrorDestination810
	 */   
	 public RhErrorDestination810 getRhErrorDestination810() {
   	return rhErrorDestination810;
   }


	/**
	 *	Returns the value of rhErrDestLnth810
	 *	@return rhErrDestLnth810
	 */
   public char[] getRhErrDestLnth810() throws CFException  {              
   		return rhErrorDestination810.getRhErrDestLnth810();
   }

  
	/**
	*  set variable rhErrDestLnth810
	*  @param value
	**/
   public void setRhErrDestLnth810(char[] value) throws CFException {
      rhErrorDestination810.setRhErrDestLnth810(value);
   } 

     /**
	 * 	Update RhErrDestLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhErrDestLnth810(char[] source, int sourceIndex) throws CFException {
      rhErrorDestination810.setRhErrDestLnth810(source, sourceIndex);
   	
   }
   
   public void setRhErrDestLnth810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhErrorDestination810.setRhErrDestLnth810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhErrorDestination810.setRhErrDestLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhErrDestLnth810 with another Field
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source) {
      rhErrorDestination810.setRhErrDestLnth810(source);
   }  
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source, int sourceIndex,int sourceLen) {
      rhErrorDestination810.setRhErrDestLnth810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhErrorDestination810.setRhErrDestLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhLnth3810
	 *	@return rhLnth3810
	 */
	public short getRhLnth3810() throws CFException {        
   		return work.getRhLnth3810();
	}
	
	/**
	 * 	Update RhLnth3810 with the passed value
	 *	@param number
	 */
	public void setRhLnth3810(short number)  throws CFException{
		work.setRhLnth3810(number);
	}

	public void setRhLnth3810(int number)  throws CFException{
		work.setRhLnth3810((short)number);
	}

	public void setRhLnth3810(long number)  throws CFException{
		work.setRhLnth3810((short)number);
	}



	/**
	 *	Returns the value of rhSourceData810
	 *	@return rhSourceData810
	 */
   public char[] getRhSourceData810() throws CFException  {              
   		return rhSource810.getRhSourceData810();
   }

  
	/**
	*  set variable rhSourceData810
	*  @param value
	**/
   public void setRhSourceData810(char[] value) throws CFException {
      rhSource810.setRhSourceData810(value);
   } 

     /**
	 * 	Update RhSourceData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhSourceData810(char[] source, int sourceIndex) throws CFException {
      rhSource810.setRhSourceData810(source, sourceIndex);
   	
   }
   
   public void setRhSourceData810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhSource810.setRhSourceData810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhSourceData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhSource810.setRhSourceData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhSourceData810 with another Field
	 *	@param value
	 */
   public void setRhSourceData810(Field source) {
      rhSource810.setRhSourceData810(source);
   }  
   
     /**
	 * 	Update RhSourceData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhSourceData810(Field source, int sourceIndex,int sourceLen) {
      rhSource810.setRhSourceData810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhSourceData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhSource810.setRhSourceData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhLnth1810
	 *	@return rhLnth1810
	 */
	public short getRhLnth1810() throws CFException {        
   		return work.getRhLnth1810();
	}
	
	/**
	 * 	Update RhLnth1810 with the passed value
	 *	@param number
	 */
	public void setRhLnth1810(short number)  throws CFException{
		work.setRhLnth1810(number);
	}

	public void setRhLnth1810(int number)  throws CFException{
		work.setRhLnth1810((short)number);
	}

	public void setRhLnth1810(long number)  throws CFException{
		work.setRhLnth1810((short)number);
	}



	/**
	 *	Returns the value of rhErrDestData810
	 *	@return rhErrDestData810
	 */
   public char[] getRhErrDestData810() throws CFException  {              
   		return rhErrorDestination810.getRhErrDestData810();
   }

  
	/**
	*  set variable rhErrDestData810
	*  @param value
	**/
   public void setRhErrDestData810(char[] value) throws CFException {
      rhErrorDestination810.setRhErrDestData810(value);
   } 

     /**
	 * 	Update RhErrDestData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhErrDestData810(char[] source, int sourceIndex) throws CFException {
      rhErrorDestination810.setRhErrDestData810(source, sourceIndex);
   	
   }
   
   public void setRhErrDestData810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhErrorDestination810.setRhErrDestData810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhErrDestData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhErrorDestination810.setRhErrDestData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhErrDestData810 with another Field
	 *	@param value
	 */
   public void setRhErrDestData810(Field source) {
      rhErrorDestination810.setRhErrDestData810(source);
   }  
   
     /**
	 * 	Update RhErrDestData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhErrDestData810(Field source, int sourceIndex,int sourceLen) {
      rhErrorDestination810.setRhErrDestData810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhErrDestData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhErrorDestination810.setRhErrDestData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhInt16810
	 *	@return rhInt16810
	 */
	public short getRhInt16810() throws CFException {        
   		return rhInt16Group810.getRhInt16810();
	}
	
	/**
	 * 	Update RhInt16810 with the passed value
	 *	@param number
	 */
	public void setRhInt16810(short number)  throws CFException{
		rhInt16Group810.setRhInt16810(number);
	}

	public void setRhInt16810(int number)  throws CFException{
		rhInt16Group810.setRhInt16810((short)number);
	}

	public void setRhInt16810(long number)  throws CFException{
		rhInt16Group810.setRhInt16810((short)number);
	}



	/**
	 *	Returns the value of rhDestLnth810
	 *	@return rhDestLnth810
	 */
   public char[] getRhDestLnth810() throws CFException  {              
   		return rhDestination810.getRhDestLnth810();
   }

  
	/**
	*  set variable rhDestLnth810
	*  @param value
	**/
   public void setRhDestLnth810(char[] value) throws CFException {
      rhDestination810.setRhDestLnth810(value);
   } 

     /**
	 * 	Update RhDestLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhDestLnth810(char[] source, int sourceIndex) throws CFException {
      rhDestination810.setRhDestLnth810(source, sourceIndex);
   	
   }
   
   public void setRhDestLnth810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhDestination810.setRhDestLnth810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhDestLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhDestLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhDestination810.setRhDestLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhDestLnth810 with another Field
	 *	@param value
	 */
   public void setRhDestLnth810(Field source) {
      rhDestination810.setRhDestLnth810(source);
   }  
   
     /**
	 * 	Update RhDestLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhDestLnth810(Field source, int sourceIndex,int sourceLen) {
      rhDestination810.setRhDestLnth810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhDestLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhDestLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhDestination810.setRhDestLnth810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhSource810
	 *	@return rhSource810
	 */   
	 public RhSource810 getRhSource810() {
   	return rhSource810;
   }


	/**
	 *	Returns the value of rhInt8810
	 *	@return rhInt8810
	 */
   public char[] getRhInt8810() throws CFException  {              
   		return rhInt16Group810.getRhInt16810Redefined().getRhInt8810();
   }

  
	/**
	*  set variable rhInt8810
	*  @param value
	**/
   public void setRhInt8810(char[] value) throws CFException {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(value);
   } 

     /**
	 * 	Update RhInt8810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhInt8810(char[] source, int sourceIndex) throws CFException {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source, sourceIndex);
   	
   }
   
   public void setRhInt8810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhInt8810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhInt8810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhInt8810 with another Field
	 *	@param value
	 */
   public void setRhInt8810(Field source) {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source);
   }  
   
     /**
	 * 	Update RhInt8810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhInt8810(Field source, int sourceIndex,int sourceLen) {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhInt8810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhInt8810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhInt16Group810.getRhInt16810Redefined().setRhInt8810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhDestination810
	 *	@return rhDestination810
	 */   
	 public RhDestination810 getRhDestination810() {
   	return rhDestination810;
   }


	/**
	 *	Returns the value of rhDestData810
	 *	@return rhDestData810
	 */
   public char[] getRhDestData810() throws CFException  {              
   		return rhDestination810.getRhDestData810();
   }

  
	/**
	*  set variable rhDestData810
	*  @param value
	**/
   public void setRhDestData810(char[] value) throws CFException {
      rhDestination810.setRhDestData810(value);
   } 

     /**
	 * 	Update RhDestData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhDestData810(char[] source, int sourceIndex) throws CFException {
      rhDestination810.setRhDestData810(source, sourceIndex);
   	
   }
   
   public void setRhDestData810(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rhDestination810.setRhDestData810(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RhDestData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhDestData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhDestination810.setRhDestData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RhDestData810 with another Field
	 *	@param value
	 */
   public void setRhDestData810(Field source) {
      rhDestination810.setRhDestData810(source);
   }  
   
     /**
	 * 	Update RhDestData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhDestData810(Field source, int sourceIndex,int sourceLen) {
      rhDestination810.setRhDestData810(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RhDestData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhDestData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rhDestination810.setRhDestData810(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rhWaitTime810
	 *	@return rhWaitTime810
	 */
   public char[] getRhWaitTime810() throws CFException  {              
   		return work.getRhWaitTime810();
   }

  
	/**
	*  set variable rhWaitTime810
	*  @param value
	**/
   public void setRhWaitTime810(char[] value) throws CFException {
      work.setRhWaitTime810(value);
   } 

	/**
	 *	Returns the value of rhLnth2810
	 *	@return rhLnth2810
	 */
	public short getRhLnth2810() throws CFException {        
   		return work.getRhLnth2810();
	}
	
	/**
	 * 	Update RhLnth2810 with the passed value
	 *	@param number
	 */
	public void setRhLnth2810(short number)  throws CFException{
		work.setRhLnth2810(number);
	}

	public void setRhLnth2810(int number)  throws CFException{
		work.setRhLnth2810((short)number);
	}

	public void setRhLnth2810(long number)  throws CFException{
		work.setRhLnth2810((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += zlogSr1Area802.hashCode();
        str += rhInt16Group810.hashCode();
        str += rhSource810.hashCode();
        str += rhDestination810.hashCode();
        str += rhErrorDestination810.hashCode();
       return str.hashCode();
    }

    public ParseRoutingHeaderOutCtx clone() {
        ParseRoutingHeaderOutCtx cloneObj = new ParseRoutingHeaderOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.rhInt16Group810 = new RhInt16Group810();
        cloneObj.rhInt16Group810.set(rhInt16Group810.getClonedField());
        cloneObj.rhSource810 = new RhSource810();
        cloneObj.rhSource810.set(rhSource810.getClonedField());
        cloneObj.rhDestination810 = new RhDestination810();
        cloneObj.rhDestination810.set(rhDestination810.getClonedField());
        cloneObj.rhErrorDestination810 = new RhErrorDestination810();
        cloneObj.rhErrorDestination810.set(rhErrorDestination810.getClonedField());
        return cloneObj;
    }

    }

    public ParseRoutingHeaderOutCtx getParseRoutingHeaderOutCtx() {
            return new ParseRoutingHeaderOutCtx();
    }
     public class ParseServiceInfoInCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of error19300
	 *	@return error19300
	 */
	public short getError19300() throws CFException {        
   		return work.getError19300();
	}
	
	/**
	 * 	Update Error19300 with the passed value
	 *	@param number
	 */
	public void setError19300(short number)  throws CFException{
		work.setError19300(number);
	}

	public void setError19300(int number)  throws CFException{
		work.setError19300((short)number);
	}

	public void setError19300(long number)  throws CFException{
		work.setError19300((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of binary15300
	 *	@return binary15300
	 */
	public short getBinary15300() throws CFException {        
   		return work.getBinary15300();
	}
	
	/**
	 * 	Update Binary15300 with the passed value
	 *	@param number
	 */
	public void setBinary15300(short number)  throws CFException{
		work.setBinary15300(number);
	}

	public void setBinary15300(int number)  throws CFException{
		work.setBinary15300((short)number);
	}

	public void setBinary15300(long number)  throws CFException{
		work.setBinary15300((short)number);
	}



	/**
	 *	Returns the value of binary16300
	 *	@return binary16300
	 */
	public short getBinary16300() throws CFException {        
   		return work.getBinary16300();
	}
	
	/**
	 * 	Update Binary16300 with the passed value
	 *	@param number
	 */
	public void setBinary16300(short number)  throws CFException{
		work.setBinary16300(number);
	}

	public void setBinary16300(int number)  throws CFException{
		work.setBinary16300((short)number);
	}

	public void setBinary16300(long number)  throws CFException{
		work.setBinary16300((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public ParseServiceInfoOutCtx getParseServiceInfoOutCtx() {
            return new ParseServiceInfoOutCtx();
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
        str += serviceInfo820.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServiceInfoInCtx clone() {
        ParseServiceInfoInCtx cloneObj = new ParseServiceInfoInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServiceInfoInCtx getParseServiceInfoInCtx() {
            return new ParseServiceInfoInCtx();
    }
     public class ParseServiceInfoOutCtx implements Cloneable {
     Work work = Sf305120Ctx.this.getWork();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();

	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of error19300
	 *	@return error19300
	 */
	public short getError19300() throws CFException {        
   		return work.getError19300();
	}
	
	/**
	 * 	Update Error19300 with the passed value
	 *	@param number
	 */
	public void setError19300(short number)  throws CFException{
		work.setError19300(number);
	}

	public void setError19300(int number)  throws CFException{
		work.setError19300((short)number);
	}

	public void setError19300(long number)  throws CFException{
		work.setError19300((short)number);
	}



	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of binary16300
	 *	@return binary16300
	 */
	public short getBinary16300() throws CFException {        
   		return work.getBinary16300();
	}
	
	/**
	 * 	Update Binary16300 with the passed value
	 *	@param number
	 */
	public void setBinary16300(short number)  throws CFException{
		work.setBinary16300(number);
	}

	public void setBinary16300(int number)  throws CFException{
		work.setBinary16300((short)number);
	}

	public void setBinary16300(long number)  throws CFException{
		work.setBinary16300((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
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
        str += serviceInfo820.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
       return str.hashCode();
    }

    public ParseServiceInfoOutCtx clone() {
        ParseServiceInfoOutCtx cloneObj = new ParseServiceInfoOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        return cloneObj;
    }

    }

    public ParseServiceInfoOutCtx getParseServiceInfoOutCtx() {
            return new ParseServiceInfoOutCtx();
    }
     public class Extract1ServiceInCtx implements Cloneable {
     EbcdicTextWGroup300 ebcdicTextWGroup300 = Sf305120Ctx.this.getEbcdicTextWGroup300();
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     AsciiTextWGroup300 asciiTextWGroup300 = Sf305120Ctx.this.getAsciiTextWGroup300();

	/**
	 *	Returns the value of siServiceStruct820
	 *	@return siServiceStruct820
	 */   
	 public SiServiceStruct820 getSiServiceStruct820() {
   	return serviceInfo820.getSiServiceStruct820();
   }

   /**
	* 	Update SiServiceStruct820 with the passed value
	*	@param value
	*/
   public void setSiServiceStruct820(char[] value) throws CFException {
      serviceInfo820.setSiServiceStruct820(value);
   }   

     /**
	 * 	Update SiServiceStruct820 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStruct820(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	serviceInfo820.setSiServiceStruct820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStruct820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	serviceInfo820.setSiServiceStruct820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiServiceStruct820 with another Field
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source) {
   	serviceInfo820.setSiServiceStruct820(source);
   }  
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source, int sourceIndex,int sourceLen) {
   	serviceInfo820.setSiServiceStruct820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	serviceInfo820.setSiServiceStruct820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of asciiText300
	 *	@return asciiText300
	 */
   public char[] getAsciiText300() throws CFException  {              
   		return asciiTextWGroup300.getAsciiText300();
   }

  
	/**
	*  set variable asciiText300
	*  @param value
	**/
   public void setAsciiText300(char[] value) throws CFException {
      asciiTextWGroup300.setAsciiText300(value);
   } 

     /**
	 * 	Update AsciiText300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsciiText300(char[] source, int sourceIndex) throws CFException {
      asciiTextWGroup300.setAsciiText300(source, sourceIndex);
   	
   }
   
   public void setAsciiText300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      asciiTextWGroup300.setAsciiText300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AsciiText300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiText300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiTextWGroup300.setAsciiText300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AsciiText300 with another Field
	 *	@param value
	 */
   public void setAsciiText300(Field source) {
      asciiTextWGroup300.setAsciiText300(source);
   }  
   
     /**
	 * 	Update AsciiText300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsciiText300(Field source, int sourceIndex,int sourceLen) {
      asciiTextWGroup300.setAsciiText300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AsciiText300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiText300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiTextWGroup300.setAsciiText300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zlogSr1Area802
	 *	@return zlogSr1Area802
	 */   
	 public ZlogSr1Area802 getZlogSr1Area802() {
   	return zlogSr1Area802;
   }


	/**
	 *	Returns the value of siServiceStatus820
	 *	@return siServiceStatus820
	 */
   public char[] getSiServiceStatus820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiServiceStatus820();
   }

  
	/**
	*  set variable siServiceStatus820
	*  @param value
	**/
   public void setSiServiceStatus820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(value);
   } 

     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex);
   	
   }
   
   public void setSiServiceStatus820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiServiceStatus820 with another Field
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source);
   }  
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {        
   		return programCounters400.getVardataLnth400();
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *	@param number
	 */
	public void setVardataLnth400(short number)  throws CFException{
		programCounters400.setVardataLnth400(number);
	}

	public void setVardataLnth400(int number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}

	public void setVardataLnth400(long number)  throws CFException{
		programCounters400.setVardataLnth400((short)number);
	}



	/**
	 *	Returns the value of ebcdicText300
	 *	@return ebcdicText300
	 */
   public char[] getEbcdicText300() throws CFException  {              
   		return ebcdicTextWGroup300.getEbcdicText300();
   }

  
	/**
	*  set variable ebcdicText300
	*  @param value
	**/
   public void setEbcdicText300(char[] value) throws CFException {
      ebcdicTextWGroup300.setEbcdicText300(value);
   } 

     /**
	 * 	Update EbcdicText300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEbcdicText300(char[] source, int sourceIndex) throws CFException {
      ebcdicTextWGroup300.setEbcdicText300(source, sourceIndex);
   	
   }
   
   public void setEbcdicText300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ebcdicTextWGroup300.setEbcdicText300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EbcdicText300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicText300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicTextWGroup300.setEbcdicText300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EbcdicText300 with another Field
	 *	@param value
	 */
   public void setEbcdicText300(Field source) {
      ebcdicTextWGroup300.setEbcdicText300(source);
   }  
   
     /**
	 * 	Update EbcdicText300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEbcdicText300(Field source, int sourceIndex,int sourceLen) {
      ebcdicTextWGroup300.setEbcdicText300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EbcdicText300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicText300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicTextWGroup300.setEbcdicText300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siDataLen820
	 *	@return siDataLen820
	 */
	public short getSiDataLen820() throws CFException {        
   		return serviceInfo820.getSiServiceStruct820().getSiDataLen820();
	}
	
	/**
	 * 	Update SiDataLen820 with the passed value
	 *	@param number
	 */
	public void setSiDataLen820(short number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820(number);
	}

	public void setSiDataLen820(int number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820((short)number);
	}

	public void setSiDataLen820(long number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820((short)number);
	}



	/**
	 *	Returns the value of srSub400
	 *	@return srSub400
	 */
	public short getSrSub400() throws CFException {        
   		return programCounters400.getSrSub400();
	}
	
	/**
	 * 	Update SrSub400 with the passed value
	 *	@param number
	 */
	public void setSrSub400(short number)  throws CFException{
		programCounters400.setSrSub400(number);
	}

	public void setSrSub400(int number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}

	public void setSrSub400(long number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}



	/**
	 *	Returns the value of siSrvReqId820
	 *	@return siSrvReqId820
	 */
   public char[] getSiSrvReqId820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiSrvReqId820();
   }

  
	/**
	*  set variable siSrvReqId820
	*  @param value
	**/
   public void setSiSrvReqId820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(value);
   } 

     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex);
   	
   }
   
   public void setSiSrvReqId820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiSrvReqId820 with another Field
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source);
   }  
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siServiceId820
	 *	@return siServiceId820
	 */
   public char[] getSiServiceId820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiServiceId820();
   }

  
	/**
	*  set variable siServiceId820
	*  @param value
	**/
   public void setSiServiceId820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(value);
   } 

     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex);
   	
   }
   
   public void setSiServiceId820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiServiceId820 with another Field
	 *	@param value
	 */
   public void setSiServiceId820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source);
   }  
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serviceInfo820
	 *	@return serviceInfo820
	 */   
	 public ServiceInfo820 getServiceInfo820() {
   	return serviceInfo820;
   }


	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of binary15300
	 *	@return binary15300
	 */
	public short getBinary15300() throws CFException {        
   		return work.getBinary15300();
	}
	
	/**
	 * 	Update Binary15300 with the passed value
	 *	@param number
	 */
	public void setBinary15300(short number)  throws CFException{
		work.setBinary15300(number);
	}

	public void setBinary15300(int number)  throws CFException{
		work.setBinary15300((short)number);
	}

	public void setBinary15300(long number)  throws CFException{
		work.setBinary15300((short)number);
	}



	/**
	 *	Returns the value of siReturnCode820
	 *	@return siReturnCode820
	 */
   public char[] getSiReturnCode820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiReturnCode820();
   }

  
	/**
	*  set variable siReturnCode820
	*  @param value
	**/
   public void setSiReturnCode820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(value);
   } 

     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex);
   	
   }
   
   public void setSiReturnCode820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiReturnCode820 with another Field
	 *	@param value
	 */
   public void setSiReturnCode820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source);
   }  
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}




        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }

        public Extract1ServiceOutCtx getExtract1ServiceOutCtx() {
            return new Extract1ServiceOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTextWGroup300.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += serviceInfo820.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
        str += asciiTextWGroup300.hashCode();
       return str.hashCode();
    }

    public Extract1ServiceInCtx clone() {
        Extract1ServiceInCtx cloneObj = new Extract1ServiceInCtx();
        cloneObj.ebcdicTextWGroup300 = new EbcdicTextWGroup300();
        cloneObj.ebcdicTextWGroup300.set(ebcdicTextWGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.asciiTextWGroup300 = new AsciiTextWGroup300();
        cloneObj.asciiTextWGroup300.set(asciiTextWGroup300.getClonedField());
        return cloneObj;
    }

    }

    public Extract1ServiceInCtx getExtract1ServiceInCtx() {
            return new Extract1ServiceInCtx();
    }
     public class Extract1ServiceOutCtx implements Cloneable {
     EbcdicTextWGroup300 ebcdicTextWGroup300 = Sf305120Ctx.this.getEbcdicTextWGroup300();
     Work work = Sf305120Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf305120Ctx.this.getSf539Sf305020ControlBlock();
     ProgramCounters400 programCounters400 = Sf305120Ctx.this.getProgramCounters400();
     ServiceInfo820 serviceInfo820 = Sf305120Ctx.this.getServiceInfo820();
     ZlogSr1Area802 zlogSr1Area802 = Sf305120Ctx.this.getZlogSr1Area802();
     ZlogPointers410 zlogPointers410 = Sf305120Ctx.this.getZlogPointers410();
     AsciiTextWGroup300 asciiTextWGroup300 = Sf305120Ctx.this.getAsciiTextWGroup300();

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {        
   		return programCounters400.getIteration400();
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *	@param number
	 */
	public void setIteration400(short number)  throws CFException{
		programCounters400.setIteration400(number);
	}

	public void setIteration400(int number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}

	public void setIteration400(long number)  throws CFException{
		programCounters400.setIteration400((short)number);
	}



	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException  {              
   		return zlogSr1Area802.getZlogVariableData802();
   }

  
	/**
	*  set variable zlogVariableData802
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) throws CFException {
      zlogSr1Area802.setZlogVariableData802(value);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) throws CFException {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
      zlogSr1Area802.setZlogVariableData802(source);
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      zlogSr1Area802.setZlogVariableData802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siServiceStatus820
	 *	@return siServiceStatus820
	 */
   public char[] getSiServiceStatus820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiServiceStatus820();
   }

  
	/**
	*  set variable siServiceStatus820
	*  @param value
	**/
   public void setSiServiceStatus820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(value);
   } 

     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex);
   	
   }
   
   public void setSiServiceStatus820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiServiceStatus820 with another Field
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source);
   }  
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiServiceStatus820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStatus820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceStatus820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceData
	 *	@return sf539ServiceData
	 */
   public char[] getSf539ServiceData(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceData();
   }

  
	/**
	*  set variable sf539ServiceData
	*  @param value
	**/
   public void setSf539ServiceData(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(value);
   } 

     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceData(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceData with another Field
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source);
   }  
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceData(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siDataLen820
	 *	@return siDataLen820
	 */
	public short getSiDataLen820() throws CFException {        
   		return serviceInfo820.getSiServiceStruct820().getSiDataLen820();
	}
	
	/**
	 * 	Update SiDataLen820 with the passed value
	 *	@param number
	 */
	public void setSiDataLen820(short number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820(number);
	}

	public void setSiDataLen820(int number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820((short)number);
	}

	public void setSiDataLen820(long number)  throws CFException{
		serviceInfo820.getSiServiceStruct820().setSiDataLen820((short)number);
	}



	/**
	 *	Returns the value of srSub400
	 *	@return srSub400
	 */
	public short getSrSub400() throws CFException {        
   		return programCounters400.getSrSub400();
	}
	
	/**
	 * 	Update SrSub400 with the passed value
	 *	@param number
	 */
	public void setSrSub400(short number)  throws CFException{
		programCounters400.setSrSub400(number);
	}

	public void setSrSub400(int number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}

	public void setSrSub400(long number)  throws CFException{
		programCounters400.setSrSub400((short)number);
	}



	/**
	 *	Returns the value of siDataBuffer820
	 *	@return siDataBuffer820
	 */
   public char[] getSiDataBuffer820() throws CFException  {              
   		return serviceInfo820.getSiDataBufferBegin820().getSiDataBuffer820();
   }

  
	/**
	*  set variable siDataBuffer820
	*  @param value
	**/
   public void setSiDataBuffer820(char[] value) throws CFException {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(value);
   } 

     /**
	 * 	Update SiDataBuffer820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiDataBuffer820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source, sourceIndex);
   	
   }
   
   public void setSiDataBuffer820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBuffer820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiDataBuffer820 with another Field
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source) {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source);
   }  
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiDataBufferBegin820().setSiDataBuffer820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siSrvReqId820
	 *	@return siSrvReqId820
	 */
   public char[] getSiSrvReqId820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiSrvReqId820();
   }

  
	/**
	*  set variable siSrvReqId820
	*  @param value
	**/
   public void setSiSrvReqId820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(value);
   } 

     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex);
   	
   }
   
   public void setSiSrvReqId820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiSrvReqId820 with another Field
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source);
   }  
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiSrvReqId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiSrvReqId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiSrvReqId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siServiceId820
	 *	@return siServiceId820
	 */
   public char[] getSiServiceId820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiServiceId820();
   }

  
	/**
	*  set variable siServiceId820
	*  @param value
	**/
   public void setSiServiceId820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(value);
   } 

     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex);
   	
   }
   
   public void setSiServiceId820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiServiceId820 with another Field
	 *	@param value
	 */
   public void setSiServiceId820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source);
   }  
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiServiceId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiServiceId820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public int getSf539ServiceReqNo(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNo();
	}


	/**
	 *	Returns String value of sf539ServiceReqNo
	 *	@return sf539ServiceReqNo
	 */
	public char[]  getSf539ServiceReqNoString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceReqNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539ServiceReqNoIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539ServiceReqNoIsNumeric();
	}

	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param number
	 */
	public void setSf539ServiceReqNo(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	

	public void setSf539ServiceReqNo(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(number);
	}
	
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNo(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}
	
	/**
	 * 	Update Sf539ServiceReqNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539ServiceReqNoString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceReqNo(value);
	}	

	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceStatus();
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  @param value
	**/
   public void setSf539ServiceStatus(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(value);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {        
   		return zlogPointers410.getServInfoPtr410();
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *	@param number
	 */
	public void setServInfoPtr410(short number)  throws CFException{
		zlogPointers410.setServInfoPtr410(number);
	}

	public void setServInfoPtr410(int number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}

	public void setServInfoPtr410(long number)  throws CFException{
		zlogPointers410.setServInfoPtr410((short)number);
	}



	/**
	 *	Returns the value of sf539ServiceRefno
	 *	@return sf539ServiceRefno
	 */
   public char[] getSf539ServiceRefno(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRefno();
   }

  
	/**
	*  set variable sf539ServiceRefno
	*  @param value
	**/
   public void setSf539ServiceRefno(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(value);
   } 

     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRefno with another Field
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRefno 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRefno(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRefno(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of siReturnCode820
	 *	@return siReturnCode820
	 */
   public char[] getSiReturnCode820() throws CFException  {              
   		return serviceInfo820.getSiServiceStruct820().getSiReturnCode820();
   }

  
	/**
	*  set variable siReturnCode820
	*  @param value
	**/
   public void setSiReturnCode820(char[] value) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(value);
   } 

     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex) throws CFException {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex);
   	
   }
   
   public void setSiReturnCode820(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SiReturnCode820 with another Field
	 *	@param value
	 */
   public void setSiReturnCode820(Field source) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source);
   }  
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SiReturnCode820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiReturnCode820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      serviceInfo820.getSiServiceStruct820().setSiReturnCode820(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public int getSf539SrvDataLnth(int index) throws CFException {
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnth();
	}


	/**
	 *	Returns String value of sf539SrvDataLnth
	 *	@return sf539SrvDataLnth
	 */
	public char[]  getSf539SrvDataLnthString(int index) throws CFException {
	     return String.valueOf(sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539SrvDataLnthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf539SrvDataLnthIsNumeric(int index)  throws CFException{
	    return sf539Sf305020ControlBlock.getSf539ServiceTable(index - 1).sf539SrvDataLnthIsNumeric();
	}

	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param number
	 */
	public void setSf539SrvDataLnth(int index,int number)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	

	public void setSf539SrvDataLnth(int index,long number)  throws CFException{
	    sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(number);
	}
	
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnth(int index,char[] value)  throws CFException {
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}
	
	/**
	 * 	Update Sf539SrvDataLnth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSf539SrvDataLnthString(int index,char[] value)  throws CFException{
		sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539SrvDataLnth(value);
	}	

	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return programCounters400.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		programCounters400.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		programCounters400.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		programCounters400.setSub400((short)number);
	}



	/**
	 *	Returns the value of sf539ServiceRc
	 *	@return sf539ServiceRc
	 */
   public char[] getSf539ServiceRc(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceRc();
   }

  
	/**
	*  set variable sf539ServiceRc
	*  @param value
	**/
   public void setSf539ServiceRc(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(value);
   } 

     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceRc with another Field
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source);
   }  
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceRc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceRc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceRc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf305120Ctx getSf305120Ctx() {
            return Sf305120Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTextWGroup300.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
        str += programCounters400.hashCode();
        str += serviceInfo820.hashCode();
        str += zlogSr1Area802.hashCode();
        str += zlogPointers410.hashCode();
        str += asciiTextWGroup300.hashCode();
       return str.hashCode();
    }

    public Extract1ServiceOutCtx clone() {
        Extract1ServiceOutCtx cloneObj = new Extract1ServiceOutCtx();
        cloneObj.ebcdicTextWGroup300 = new EbcdicTextWGroup300();
        cloneObj.ebcdicTextWGroup300.set(ebcdicTextWGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        cloneObj.programCounters400 = new ProgramCounters400();
        cloneObj.programCounters400.set(programCounters400.getClonedField());
        cloneObj.serviceInfo820 = new ServiceInfo820();
        cloneObj.serviceInfo820.set(serviceInfo820.getClonedField());
        cloneObj.zlogSr1Area802 = new ZlogSr1Area802();
        cloneObj.zlogSr1Area802.set(zlogSr1Area802.getClonedField());
        cloneObj.zlogPointers410 = new ZlogPointers410();
        cloneObj.zlogPointers410.set(zlogPointers410.getClonedField());
        cloneObj.asciiTextWGroup300 = new AsciiTextWGroup300();
        cloneObj.asciiTextWGroup300.set(asciiTextWGroup300.getClonedField());
        return cloneObj;
    }

    }

    public Extract1ServiceOutCtx getExtract1ServiceOutCtx() {
            return new Extract1ServiceOutCtx();
    }
}
