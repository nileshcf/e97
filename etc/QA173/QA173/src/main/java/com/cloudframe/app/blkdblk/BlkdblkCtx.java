package com.cloudframe.app.blkdblk;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.blkdblk.dto.LlllXGroup;
import com.cloudframe.app.blkdblk.file.records.IpmEbcdicMessage;
import com.cloudframe.app.blkdblk.dto.EbcdicTable;
import com.cloudframe.app.blkdblk.dto.Work;
import com.cloudframe.app.blkdblk.dto.AsciiTable;
import com.cloudframe.app.blkdblk.dto.AsciiIndexGroup;
import com.cloudframe.app.blkdblk.dto.MapEbcdicTbl;
import com.cloudframe.app.blkdblk.dto.MapAsciiTbl;
import com.cloudframe.app.blkdblk.file.records.UmodeMessage;
import com.cloudframe.app.blkdblk.dto.EbcdicIndexGroup;
import com.cloudframe.app.blkdblk.dto.Sysin;


@Context
public class BlkdblkCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    AsciiTable asciiTable;
    UmodeMessage umodeMessage;
    IpmEbcdicMessage ipmEbcdicMessage;
    EbcdicIndexGroup ebcdicIndexGroup;
    EbcdicTable ebcdicTable;
    Sysin sysin;
    LlllXGroup llllXGroup;
    AsciiIndexGroup asciiIndexGroup;


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
    public AsciiTable getAsciiTable() {
        if (asciiTable == null) {
            asciiTable = new AsciiTable();
        }

        return asciiTable;
    }

    public void setAsciiTable(AsciiTable asciiTable) {
        this.asciiTable = asciiTable;
    }
    public UmodeMessage getUmodeMessage() {
        if (umodeMessage == null) {
            umodeMessage = new UmodeMessage();
        }

        return umodeMessage;
    }

    public void setUmodeMessage(UmodeMessage umodeMessage) {
        this.umodeMessage = umodeMessage;
    }
    public IpmEbcdicMessage getIpmEbcdicMessage() {
        if (ipmEbcdicMessage == null) {
            ipmEbcdicMessage = new IpmEbcdicMessage();
        }

        return ipmEbcdicMessage;
    }

    public void setIpmEbcdicMessage(IpmEbcdicMessage ipmEbcdicMessage) {
        this.ipmEbcdicMessage = ipmEbcdicMessage;
    }
    public EbcdicIndexGroup getEbcdicIndexGroup() {
        if (ebcdicIndexGroup == null) {
            ebcdicIndexGroup = new EbcdicIndexGroup();
        }

        return ebcdicIndexGroup;
    }

    public void setEbcdicIndexGroup(EbcdicIndexGroup ebcdicIndexGroup) {
        this.ebcdicIndexGroup = ebcdicIndexGroup;
    }
    public EbcdicTable getEbcdicTable() {
        if (ebcdicTable == null) {
            ebcdicTable = new EbcdicTable();
        }

        return ebcdicTable;
    }

    public void setEbcdicTable(EbcdicTable ebcdicTable) {
        this.ebcdicTable = ebcdicTable;
    }
    public Sysin getSysin() {
        if (sysin == null) {
            sysin = new Sysin();
        }

        return sysin;
    }

    public void setSysin(Sysin sysin) {
        this.sysin = sysin;
    }
    public LlllXGroup getLlllXGroup() {
        if (llllXGroup == null) {
            llllXGroup = new LlllXGroup();
        }

        return llllXGroup;
    }

    public void setLlllXGroup(LlllXGroup llllXGroup) {
        this.llllXGroup = llllXGroup;
    }
    public AsciiIndexGroup getAsciiIndexGroup() {
        if (asciiIndexGroup == null) {
            asciiIndexGroup = new AsciiIndexGroup();
        }

        return asciiIndexGroup;
    }

    public void setAsciiIndexGroup(AsciiIndexGroup asciiIndexGroup) {
        this.asciiIndexGroup = asciiIndexGroup;
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
        str += asciiTable.hashCode();
        str += umodeMessage.hashCode();
        str += ipmEbcdicMessage.hashCode();
        str += ebcdicIndexGroup.hashCode();
        str += ebcdicTable.hashCode();
        str += sysin.hashCode();
        str += llllXGroup.hashCode();
        str += asciiIndexGroup.hashCode();
       return str.hashCode();
    }

    public BlkdblkCtx clone() {
        BlkdblkCtx cloneObj = new BlkdblkCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.ebcdicIndexGroup = new EbcdicIndexGroup();
        cloneObj.ebcdicIndexGroup.set(ebcdicIndexGroup.getClonedField());
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        cloneObj.sysin = new Sysin();
        cloneObj.sysin.set(sysin.getClonedField());
        cloneObj.llllXGroup = new LlllXGroup();
        cloneObj.llllXGroup.set(llllXGroup.getClonedField());
        cloneObj.asciiIndexGroup = new AsciiIndexGroup();
        cloneObj.asciiIndexGroup.set(asciiIndexGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     Sysin sysin = BlkdblkCtx.this.getSysin();

	/**
	 *	Returns the value of ipmEbcdicMessage
	 *	@return ipmEbcdicMessage
	 */   
	 public IpmEbcdicMessage getIpmEbcdicMessage() {
   	return ipmEbcdicMessage;
   }


	/**
	 *	Returns the value of umodeMessage
	 *	@return umodeMessage
	 */   
	 public UmodeMessage getUmodeMessage() {
   	return umodeMessage;
   }



        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
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
        str += ipmEbcdicMessage.hashCode();
        str += umodeMessage.hashCode();
        str += sysin.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.sysin = new Sysin();
        cloneObj.sysin.set(sysin.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     Sysin sysin = BlkdblkCtx.this.getSysin();

	/**
	 *	Test condition "E-2-A" for isE2A()
	 *	@return  Returns true if isE2A() is "E-2-A"
	 */
   public boolean isE2A() throws CFException {
      return sysin.isE2A();
   }

	/**
	*  set values "E-2-A"
	*/
   	public void setE2ATrue()  throws CFException{  			
    	sysin.setE2ATrue();
   	}
	/**
	 *	Test condition "A-2-E" for isA2E()
	 *	@return  Returns true if isA2E() is "A-2-E"
	 */
   public boolean isA2E() throws CFException {
      return sysin.isA2E();
   }

	/**
	*  set values "A-2-E"
	*/
   	public void setA2ETrue()  throws CFException{  			
    	sysin.setA2ETrue();
   	}
	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {        
   		return work.getUmodeCnt();
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *	@param number
	 */
	public void setUmodeCnt(long number)  throws CFException{
		work.setUmodeCnt(number);
	}



	/**
	 *	Returns the value of umodeFileStatus
	 *	@return umodeFileStatus
	 */
   public char[] getUmodeFileStatus() throws CFException  {              
   		return work.getUmodeFileStatus();
   }

  
	/**
	*  set variable umodeFileStatus
	*  @param value
	**/
   public void setUmodeFileStatus(char[] value) throws CFException {
      work.setUmodeFileStatus(value);
   } 

	/**
	 *	Returns the value of sysin
	 *	@return sysin
	 */   
	 public Sysin getSysin() {
   	return sysin;
   }


	/**
	 *	Returns the value of vbsFileStatus
	 *	@return vbsFileStatus
	 */
   public char[] getVbsFileStatus() throws CFException  {              
   		return work.getVbsFileStatus();
   }

  
	/**
	*  set variable vbsFileStatus
	*  @param value
	**/
   public void setVbsFileStatus(char[] value) throws CFException {
      work.setVbsFileStatus(value);
   } 

	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {        
   		return work.getVbsCnt();
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *	@param number
	 */
	public void setVbsCnt(long number)  throws CFException{
		work.setVbsCnt(number);
	}




        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
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
        str += ipmEbcdicMessage.hashCode();
        str += umodeMessage.hashCode();
        str += sysin.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.sysin = new Sysin();
        cloneObj.sysin.set(sysin.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class AbendOutCtx implements Cloneable {


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
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

    public AbendOutCtx clone() {
        AbendOutCtx cloneObj = new AbendOutCtx();
        return cloneObj;
    }

    }

    public AbendOutCtx getAbendOutCtx() {
            return new AbendOutCtx();
    }
     public class LoadE2ATableSplit0OutCtx implements Cloneable {
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();

	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of mapEbcdicTbl
	 *	@return mapEbcdicTbl
	 */   
	 public MapEbcdicTbl getMapEbcdicTbl() {
   	return ebcdicTable.getMapEbcdicTbl();
   }

   /**
	* 	Update MapEbcdicTbl with the passed value
	*	@param value
	*/
   public void setMapEbcdicTbl(char[] value) throws CFException {
      ebcdicTable.setMapEbcdicTbl(value);
   }   

     /**
	 * 	Update MapEbcdicTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMapEbcdicTbl(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ebcdicTable.setMapEbcdicTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMapEbcdicTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ebcdicTable.setMapEbcdicTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MapEbcdicTbl with another Field
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source) {
   	ebcdicTable.setMapEbcdicTbl(source);
   }  
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source, int sourceIndex,int sourceLen) {
   	ebcdicTable.setMapEbcdicTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MapEbcdicTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMapEbcdicTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ebcdicTable.setMapEbcdicTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mapEbcdic
	 *	@return mapEbcdic
	 */
   public char[] getMapEbcdic(int index) throws CFException  {              
   		return ebcdicTable.getMapEbcdicTbl().getMapEbcdic(index);
   }

  
	/**
	*  set variable mapEbcdic
	*  @param value
	**/
   public void setMapEbcdic(int index,char[] value) throws CFException {
      ebcdicTable.getMapEbcdicTbl().setMapEbcdic((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTable.hashCode();
       return str.hashCode();
    }

    public LoadE2ATableSplit0OutCtx clone() {
        LoadE2ATableSplit0OutCtx cloneObj = new LoadE2ATableSplit0OutCtx();
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadE2ATableSplit0OutCtx getLoadE2ATableSplit0OutCtx() {
            return new LoadE2ATableSplit0OutCtx();
    }
     public class LoadE2ATableSplit1OutCtx implements Cloneable {
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();

	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of mapEbcdic
	 *	@return mapEbcdic
	 */
   public char[] getMapEbcdic(int index) throws CFException  {              
   		return ebcdicTable.getMapEbcdicTbl().getMapEbcdic(index);
   }

  
	/**
	*  set variable mapEbcdic
	*  @param value
	**/
   public void setMapEbcdic(int index,char[] value) throws CFException {
      ebcdicTable.getMapEbcdicTbl().setMapEbcdic((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTable.hashCode();
       return str.hashCode();
    }

    public LoadE2ATableSplit1OutCtx clone() {
        LoadE2ATableSplit1OutCtx cloneObj = new LoadE2ATableSplit1OutCtx();
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadE2ATableSplit1OutCtx getLoadE2ATableSplit1OutCtx() {
            return new LoadE2ATableSplit1OutCtx();
    }
     public class LoadE2ATableSplit2OutCtx implements Cloneable {
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();

	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of mapEbcdic
	 *	@return mapEbcdic
	 */
   public char[] getMapEbcdic(int index) throws CFException  {              
   		return ebcdicTable.getMapEbcdicTbl().getMapEbcdic(index);
   }

  
	/**
	*  set variable mapEbcdic
	*  @param value
	**/
   public void setMapEbcdic(int index,char[] value) throws CFException {
      ebcdicTable.getMapEbcdicTbl().setMapEbcdic((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTable.hashCode();
       return str.hashCode();
    }

    public LoadE2ATableSplit2OutCtx clone() {
        LoadE2ATableSplit2OutCtx cloneObj = new LoadE2ATableSplit2OutCtx();
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadE2ATableSplit2OutCtx getLoadE2ATableSplit2OutCtx() {
            return new LoadE2ATableSplit2OutCtx();
    }
     public class LoadE2ATableSplit3OutCtx implements Cloneable {
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();

	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of mapEbcdic
	 *	@return mapEbcdic
	 */
   public char[] getMapEbcdic(int index) throws CFException  {              
   		return ebcdicTable.getMapEbcdicTbl().getMapEbcdic(index);
   }

  
	/**
	*  set variable mapEbcdic
	*  @param value
	**/
   public void setMapEbcdic(int index,char[] value) throws CFException {
      ebcdicTable.getMapEbcdicTbl().setMapEbcdic((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ebcdicTable.hashCode();
       return str.hashCode();
    }

    public LoadE2ATableSplit3OutCtx clone() {
        LoadE2ATableSplit3OutCtx cloneObj = new LoadE2ATableSplit3OutCtx();
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadE2ATableSplit3OutCtx getLoadE2ATableSplit3OutCtx() {
            return new LoadE2ATableSplit3OutCtx();
    }
     public class LoadA2ETableSplit4OutCtx implements Cloneable {
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();

	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of mapAscii
	 *	@return mapAscii
	 */
   public char[] getMapAscii(int index) throws CFException  {              
   		return asciiTable.getMapAsciiTbl().getMapAscii(index);
   }

  
	/**
	*  set variable mapAscii
	*  @param value
	**/
   public void setMapAscii(int index,char[] value) throws CFException {
      asciiTable.getMapAsciiTbl().setMapAscii((index),value);
   } 

	/**
	 *	Returns the value of mapAsciiTbl
	 *	@return mapAsciiTbl
	 */   
	 public MapAsciiTbl getMapAsciiTbl() {
   	return asciiTable.getMapAsciiTbl();
   }

   /**
	* 	Update MapAsciiTbl with the passed value
	*	@param value
	*/
   public void setMapAsciiTbl(char[] value) throws CFException {
      asciiTable.setMapAsciiTbl(value);
   }   

     /**
	 * 	Update MapAsciiTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMapAsciiTbl(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	asciiTable.setMapAsciiTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMapAsciiTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	asciiTable.setMapAsciiTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MapAsciiTbl with another Field
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source) {
   	asciiTable.setMapAsciiTbl(source);
   }  
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source, int sourceIndex,int sourceLen) {
   	asciiTable.setMapAsciiTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MapAsciiTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMapAsciiTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	asciiTable.setMapAsciiTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += asciiTable.hashCode();
       return str.hashCode();
    }

    public LoadA2ETableSplit4OutCtx clone() {
        LoadA2ETableSplit4OutCtx cloneObj = new LoadA2ETableSplit4OutCtx();
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadA2ETableSplit4OutCtx getLoadA2ETableSplit4OutCtx() {
            return new LoadA2ETableSplit4OutCtx();
    }
     public class LoadA2ETableSplit5OutCtx implements Cloneable {
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();

	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of mapAscii
	 *	@return mapAscii
	 */
   public char[] getMapAscii(int index) throws CFException  {              
   		return asciiTable.getMapAsciiTbl().getMapAscii(index);
   }

  
	/**
	*  set variable mapAscii
	*  @param value
	**/
   public void setMapAscii(int index,char[] value) throws CFException {
      asciiTable.getMapAsciiTbl().setMapAscii((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += asciiTable.hashCode();
       return str.hashCode();
    }

    public LoadA2ETableSplit5OutCtx clone() {
        LoadA2ETableSplit5OutCtx cloneObj = new LoadA2ETableSplit5OutCtx();
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadA2ETableSplit5OutCtx getLoadA2ETableSplit5OutCtx() {
            return new LoadA2ETableSplit5OutCtx();
    }
     public class LoadA2ETableSplit6OutCtx implements Cloneable {
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();

	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of mapAscii
	 *	@return mapAscii
	 */
   public char[] getMapAscii(int index) throws CFException  {              
   		return asciiTable.getMapAsciiTbl().getMapAscii(index);
   }

  
	/**
	*  set variable mapAscii
	*  @param value
	**/
   public void setMapAscii(int index,char[] value) throws CFException {
      asciiTable.getMapAsciiTbl().setMapAscii((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += asciiTable.hashCode();
       return str.hashCode();
    }

    public LoadA2ETableSplit6OutCtx clone() {
        LoadA2ETableSplit6OutCtx cloneObj = new LoadA2ETableSplit6OutCtx();
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadA2ETableSplit6OutCtx getLoadA2ETableSplit6OutCtx() {
            return new LoadA2ETableSplit6OutCtx();
    }
     public class LoadA2ETableSplit7OutCtx implements Cloneable {
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();

	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of mapAscii
	 *	@return mapAscii
	 */
   public char[] getMapAscii(int index) throws CFException  {              
   		return asciiTable.getMapAsciiTbl().getMapAscii(index);
   }

  
	/**
	*  set variable mapAscii
	*  @param value
	**/
   public void setMapAscii(int index,char[] value) throws CFException {
      asciiTable.getMapAsciiTbl().setMapAscii((index),value);
   } 


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += asciiTable.hashCode();
       return str.hashCode();
    }

    public LoadA2ETableSplit7OutCtx clone() {
        LoadA2ETableSplit7OutCtx cloneObj = new LoadA2ETableSplit7OutCtx();
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        return cloneObj;
    }

    }

    public LoadA2ETableSplit7OutCtx getLoadA2ETableSplit7OutCtx() {
            return new LoadA2ETableSplit7OutCtx();
    }
     public class ConvertU2VbsInCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     LlllXGroup llllXGroup = BlkdblkCtx.this.getLlllXGroup();
     AsciiIndexGroup asciiIndexGroup = BlkdblkCtx.this.getAsciiIndexGroup();

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return work.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		work.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of umodeBuffer
	 *	@return umodeBuffer
	 */
   public char[] getUmodeBuffer() throws CFException  {              
   		return work.getUmodeBuffer();
   }

  
	/**
	*  set variable umodeBuffer
	*  @param value
	**/
   public void setUmodeBuffer(char[] value) throws CFException {
      work.setUmodeBuffer(value);
   } 

	/**
	 *	Returns the value of umodeFileStatus
	 *	@return umodeFileStatus
	 */
   public char[] getUmodeFileStatus() throws CFException  {              
   		return work.getUmodeFileStatus();
   }

  
	/**
	*  set variable umodeFileStatus
	*  @param value
	**/
   public void setUmodeFileStatus(char[] value) throws CFException {
      work.setUmodeFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeMessageLen
	 *	@return umodeMessageLen
	 */
	public long getUmodeMessageLen() throws CFException {        
   		return work.getUmodeMessageLen();
	}
	
	/**
	 * 	Update UmodeMessageLen with the passed value
	 *	@param number
	 */
	public void setUmodeMessageLen(long number)  throws CFException{
		work.setUmodeMessageLen(number);
	}



	/**
	 *	Returns the value of mapAscii
	 *	@return mapAscii
	 */
   public char[] getMapAscii(int index) throws CFException  {              
   		return asciiTable.getMapAsciiTbl().getMapAscii(index);
   }

  
	/**
	*  set variable mapAscii
	*  @param value
	**/
   public void setMapAscii(int index,char[] value) throws CFException {
      asciiTable.getMapAsciiTbl().setMapAscii((index),value);
   } 

	/**
	 *	Returns the value of umodeLen
	 *	@return umodeLen
	 */
	public long getUmodeLen() throws CFException {        
   		return work.getUmodeLen();
	}
	
	/**
	 * 	Update UmodeLen with the passed value
	 *	@param number
	 */
	public void setUmodeLen(long number)  throws CFException{
		work.setUmodeLen(number);
	}



	/**
	 *	Returns the value of asciiIndex
	 *	@return asciiIndex
	 */
	public short getAsciiIndex() throws CFException {        
   		return asciiIndexGroup.getAsciiIndex();
	}
	
	/**
	 * 	Update AsciiIndex with the passed value
	 *	@param number
	 */
	public void setAsciiIndex(short number)  throws CFException{
		asciiIndexGroup.setAsciiIndex(number);
	}

	public void setAsciiIndex(int number)  throws CFException{
		asciiIndexGroup.setAsciiIndex((short)number);
	}

	public void setAsciiIndex(long number)  throws CFException{
		asciiIndexGroup.setAsciiIndex((short)number);
	}



	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {        
   		return work.getUmodeCnt();
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *	@param number
	 */
	public void setUmodeCnt(long number)  throws CFException{
		work.setUmodeCnt(number);
	}



	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of ipmEbcdicMessage
	 *	@return ipmEbcdicMessage
	 */   
	 public IpmEbcdicMessage getIpmEbcdicMessage() {
   	return ipmEbcdicMessage;
   }


	/**
	 *	Returns the value of umodePos
	 *	@return umodePos
	 */
	public long getUmodePos() throws CFException {        
   		return work.getUmodePos();
	}
	
	/**
	 * 	Update UmodePos with the passed value
	 *	@param number
	 */
	public void setUmodePos(long number)  throws CFException{
		work.setUmodePos(number);
	}



	/**
	 *	Returns the value of llll
	 *	@return llll
	 */
	public long getLlll() throws CFException {        
   		return llllXGroup.getLlll();
	}
	
	/**
	 * 	Update Llll with the passed value
	 *	@param number
	 */
	public void setLlll(long number)  throws CFException{
		llllXGroup.setLlll(number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}


	public void setI(long number)  throws CFException{
		work.setI((int)number);
	}


	/**
	 *	Returns the value of llllX
	 *	@return llllX
	 */
   public char[] getLlllX() throws CFException  {              
   		return llllXGroup.getLlllX();
   }

  
	/**
	*  set variable llllX
	*  @param value
	**/
   public void setLlllX(char[] value) throws CFException {
      llllXGroup.setLlllX(value);
   } 

     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex) throws CFException {
      llllXGroup.setLlllX(source, sourceIndex);
   	
   }
   
   public void setLlllX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LlllX with another Field
	 *	@param value
	 */
   public void setLlllX(Field source) {
      llllXGroup.setLlllX(source);
   }  
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {        
   		return work.getVbsCnt();
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *	@param number
	 */
	public void setVbsCnt(long number)  throws CFException{
		work.setVbsCnt(number);
	}




        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }

        public ConvertU2VbsOutCtx getConvertU2VbsOutCtx() {
            return new ConvertU2VbsOutCtx();
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
        str += asciiTable.hashCode();
        str += ipmEbcdicMessage.hashCode();
        str += umodeMessage.hashCode();
        str += llllXGroup.hashCode();
        str += asciiIndexGroup.hashCode();
       return str.hashCode();
    }

    public ConvertU2VbsInCtx clone() {
        ConvertU2VbsInCtx cloneObj = new ConvertU2VbsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.llllXGroup = new LlllXGroup();
        cloneObj.llllXGroup.set(llllXGroup.getClonedField());
        cloneObj.asciiIndexGroup = new AsciiIndexGroup();
        cloneObj.asciiIndexGroup.set(asciiIndexGroup.getClonedField());
        return cloneObj;
    }

    }

    public ConvertU2VbsInCtx getConvertU2VbsInCtx() {
            return new ConvertU2VbsInCtx();
    }
     public class ConvertU2VbsOutCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     AsciiTable asciiTable = BlkdblkCtx.this.getAsciiTable();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     LlllXGroup llllXGroup = BlkdblkCtx.this.getLlllXGroup();
     AsciiIndexGroup asciiIndexGroup = BlkdblkCtx.this.getAsciiIndexGroup();

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return work.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		work.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of umodeBuffer
	 *	@return umodeBuffer
	 */
   public char[] getUmodeBuffer() throws CFException  {              
   		return work.getUmodeBuffer();
   }

  
	/**
	*  set variable umodeBuffer
	*  @param value
	**/
   public void setUmodeBuffer(char[] value) throws CFException {
      work.setUmodeBuffer(value);
   } 

	/**
	 *	Returns the value of umodeFileStatus
	 *	@return umodeFileStatus
	 */
   public char[] getUmodeFileStatus() throws CFException  {              
   		return work.getUmodeFileStatus();
   }

  
	/**
	*  set variable umodeFileStatus
	*  @param value
	**/
   public void setUmodeFileStatus(char[] value) throws CFException {
      work.setUmodeFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeMessageLen
	 *	@return umodeMessageLen
	 */
	public long getUmodeMessageLen() throws CFException {        
   		return work.getUmodeMessageLen();
	}
	
	/**
	 * 	Update UmodeMessageLen with the passed value
	 *	@param number
	 */
	public void setUmodeMessageLen(long number)  throws CFException{
		work.setUmodeMessageLen(number);
	}



	/**
	 *	Returns the value of nullByte
	 *	@return nullByte
	 */
   public char[] getNullByte() throws CFException  {              
   		return asciiIndexGroup.getAsciiBytes().getNullByte();
   }

  
	/**
	*  set variable nullByte
	*  @param value
	**/
   public void setNullByte(char[] value) throws CFException {
      asciiIndexGroup.getAsciiBytes().setNullByte(value);
   } 

     /**
	 * 	Update NullByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNullByte(char[] source, int sourceIndex) throws CFException {
      asciiIndexGroup.getAsciiBytes().setNullByte(source, sourceIndex);
   	
   }
   
   public void setNullByte(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      asciiIndexGroup.getAsciiBytes().setNullByte(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NullByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNullByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiIndexGroup.getAsciiBytes().setNullByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NullByte with another Field
	 *	@param value
	 */
   public void setNullByte(Field source) {
      asciiIndexGroup.getAsciiBytes().setNullByte(source);
   }  
   
     /**
	 * 	Update NullByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNullByte(Field source, int sourceIndex,int sourceLen) {
      asciiIndexGroup.getAsciiBytes().setNullByte(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NullByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNullByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiIndexGroup.getAsciiBytes().setNullByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vbsFileStatus
	 *	@return vbsFileStatus
	 */
   public char[] getVbsFileStatus() throws CFException  {              
   		return work.getVbsFileStatus();
   }

  
	/**
	*  set variable vbsFileStatus
	*  @param value
	**/
   public void setVbsFileStatus(char[] value) throws CFException {
      work.setVbsFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeLen
	 *	@return umodeLen
	 */
	public long getUmodeLen() throws CFException {        
   		return work.getUmodeLen();
	}
	
	/**
	 * 	Update UmodeLen with the passed value
	 *	@param number
	 */
	public void setUmodeLen(long number)  throws CFException{
		work.setUmodeLen(number);
	}



	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {        
   		return work.getUmodeCnt();
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *	@param number
	 */
	public void setUmodeCnt(long number)  throws CFException{
		work.setUmodeCnt(number);
	}



	/**
	 *	Returns the value of asciiToEbcdic
	 *	@return asciiToEbcdic
	 */
   public char[] getAsciiToEbcdic(int index) throws CFException  {              
   		return asciiTable.getAsciiToEbcdic(index);
   }

  
	/**
	*  set variable asciiToEbcdic
	*  @param value
	**/
   public void setAsciiToEbcdic(int index,char[] value) throws CFException {
      asciiTable.setAsciiToEbcdic((index),value);
   } 

	/**
	 *	Returns the value of umodeMessage
	 *	@return umodeMessage
	 */   
	 public UmodeMessage getUmodeMessage() {
   	return umodeMessage;
   }


	/**
	 *	Returns the value of ipmEbcdicMessage
	 *	@return ipmEbcdicMessage
	 */   
	 public IpmEbcdicMessage getIpmEbcdicMessage() {
   	return ipmEbcdicMessage;
   }


	/**
	 *	Returns the value of umodePos
	 *	@return umodePos
	 */
	public long getUmodePos() throws CFException {        
   		return work.getUmodePos();
	}
	
	/**
	 * 	Update UmodePos with the passed value
	 *	@param number
	 */
	public void setUmodePos(long number)  throws CFException{
		work.setUmodePos(number);
	}



	/**
	 *	Returns the value of llll
	 *	@return llll
	 */
	public long getLlll() throws CFException {        
   		return llllXGroup.getLlll();
	}
	
	/**
	 * 	Update Llll with the passed value
	 *	@param number
	 */
	public void setLlll(long number)  throws CFException{
		llllXGroup.setLlll(number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}


	public void setI(long number)  throws CFException{
		work.setI((int)number);
	}


	/**
	 *	Returns the value of llllX
	 *	@return llllX
	 */
   public char[] getLlllX() throws CFException  {              
   		return llllXGroup.getLlllX();
   }

  
	/**
	*  set variable llllX
	*  @param value
	**/
   public void setLlllX(char[] value) throws CFException {
      llllXGroup.setLlllX(value);
   } 

     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex) throws CFException {
      llllXGroup.setLlllX(source, sourceIndex);
   	
   }
   
   public void setLlllX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LlllX with another Field
	 *	@param value
	 */
   public void setLlllX(Field source) {
      llllXGroup.setLlllX(source);
   }  
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of asciiChar
	 *	@return asciiChar
	 */
   public char[] getAsciiChar() throws CFException  {              
   		return asciiIndexGroup.getAsciiBytes().getAsciiChar();
   }

  
	/**
	*  set variable asciiChar
	*  @param value
	**/
   public void setAsciiChar(char[] value) throws CFException {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(value);
   } 

     /**
	 * 	Update AsciiChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsciiChar(char[] source, int sourceIndex) throws CFException {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source, sourceIndex);
   	
   }
   
   public void setAsciiChar(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AsciiChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AsciiChar with another Field
	 *	@param value
	 */
   public void setAsciiChar(Field source) {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source);
   }  
   
     /**
	 * 	Update AsciiChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsciiChar(Field source, int sourceIndex,int sourceLen) {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AsciiChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      asciiIndexGroup.getAsciiBytes().setAsciiChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {        
   		return work.getVbsCnt();
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *	@param number
	 */
	public void setVbsCnt(long number)  throws CFException{
		work.setVbsCnt(number);
	}




        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
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
        str += asciiTable.hashCode();
        str += umodeMessage.hashCode();
        str += ipmEbcdicMessage.hashCode();
        str += llllXGroup.hashCode();
        str += asciiIndexGroup.hashCode();
       return str.hashCode();
    }

    public ConvertU2VbsOutCtx clone() {
        ConvertU2VbsOutCtx cloneObj = new ConvertU2VbsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.asciiTable = new AsciiTable();
        cloneObj.asciiTable.set(asciiTable.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.llllXGroup = new LlllXGroup();
        cloneObj.llllXGroup.set(llllXGroup.getClonedField());
        cloneObj.asciiIndexGroup = new AsciiIndexGroup();
        cloneObj.asciiIndexGroup.set(asciiIndexGroup.getClonedField());
        return cloneObj;
    }

    }

    public ConvertU2VbsOutCtx getConvertU2VbsOutCtx() {
            return new ConvertU2VbsOutCtx();
    }
     public class ConvertVbs2UInCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     EbcdicIndexGroup ebcdicIndexGroup = BlkdblkCtx.this.getEbcdicIndexGroup();
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();
     LlllXGroup llllXGroup = BlkdblkCtx.this.getLlllXGroup();

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return work.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		work.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of umodeBuffer
	 *	@return umodeBuffer
	 */
   public char[] getUmodeBuffer() throws CFException  {              
   		return work.getUmodeBuffer();
   }

  
	/**
	*  set variable umodeBuffer
	*  @param value
	**/
   public void setUmodeBuffer(char[] value) throws CFException {
      work.setUmodeBuffer(value);
   } 

	/**
	 *	Returns the value of umodeMessageLen
	 *	@return umodeMessageLen
	 */
	public long getUmodeMessageLen() throws CFException {        
   		return work.getUmodeMessageLen();
	}
	
	/**
	 * 	Update UmodeMessageLen with the passed value
	 *	@param number
	 */
	public void setUmodeMessageLen(long number)  throws CFException{
		work.setUmodeMessageLen(number);
	}



	/**
	 *	Returns the value of vbsFileStatus
	 *	@return vbsFileStatus
	 */
   public char[] getVbsFileStatus() throws CFException  {              
   		return work.getVbsFileStatus();
   }

  
	/**
	*  set variable vbsFileStatus
	*  @param value
	**/
   public void setVbsFileStatus(char[] value) throws CFException {
      work.setVbsFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeLen
	 *	@return umodeLen
	 */
	public long getUmodeLen() throws CFException {        
   		return work.getUmodeLen();
	}
	
	/**
	 * 	Update UmodeLen with the passed value
	 *	@param number
	 */
	public void setUmodeLen(long number)  throws CFException{
		work.setUmodeLen(number);
	}



	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {        
   		return work.getUmodeCnt();
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *	@param number
	 */
	public void setUmodeCnt(long number)  throws CFException{
		work.setUmodeCnt(number);
	}



	/**
	 *	Returns the value of ipmEbcdicMessage
	 *	@return ipmEbcdicMessage
	 */   
	 public IpmEbcdicMessage getIpmEbcdicMessage() {
   	return ipmEbcdicMessage;
   }


	/**
	 *	Returns the value of umodeMessage
	 *	@return umodeMessage
	 */   
	 public UmodeMessage getUmodeMessage() {
   	return umodeMessage;
   }


	/**
	 *	Returns the value of mapEbcdic
	 *	@return mapEbcdic
	 */
   public char[] getMapEbcdic(int index) throws CFException  {              
   		return ebcdicTable.getMapEbcdicTbl().getMapEbcdic(index);
   }

  
	/**
	*  set variable mapEbcdic
	*  @param value
	**/
   public void setMapEbcdic(int index,char[] value) throws CFException {
      ebcdicTable.getMapEbcdicTbl().setMapEbcdic((index),value);
   } 

	/**
	 *	Returns the value of umodePos
	 *	@return umodePos
	 */
	public long getUmodePos() throws CFException {        
   		return work.getUmodePos();
	}
	
	/**
	 * 	Update UmodePos with the passed value
	 *	@param number
	 */
	public void setUmodePos(long number)  throws CFException{
		work.setUmodePos(number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}


	public void setI(long number)  throws CFException{
		work.setI((int)number);
	}


	/**
	 *	Returns the value of llll
	 *	@return llll
	 */
	public long getLlll() throws CFException {        
   		return llllXGroup.getLlll();
	}
	
	/**
	 * 	Update Llll with the passed value
	 *	@param number
	 */
	public void setLlll(long number)  throws CFException{
		llllXGroup.setLlll(number);
	}



	/**
	 *	Returns the value of ebcdicIndex
	 *	@return ebcdicIndex
	 */
	public short getEbcdicIndex() throws CFException {        
   		return ebcdicIndexGroup.getEbcdicIndex();
	}
	
	/**
	 * 	Update EbcdicIndex with the passed value
	 *	@param number
	 */
	public void setEbcdicIndex(short number)  throws CFException{
		ebcdicIndexGroup.setEbcdicIndex(number);
	}

	public void setEbcdicIndex(int number)  throws CFException{
		ebcdicIndexGroup.setEbcdicIndex((short)number);
	}

	public void setEbcdicIndex(long number)  throws CFException{
		ebcdicIndexGroup.setEbcdicIndex((short)number);
	}



	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {        
   		return work.getVbsCnt();
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *	@param number
	 */
	public void setVbsCnt(long number)  throws CFException{
		work.setVbsCnt(number);
	}



	/**
	 *	Returns the value of llllX
	 *	@return llllX
	 */
   public char[] getLlllX() throws CFException  {              
   		return llllXGroup.getLlllX();
   }

  
	/**
	*  set variable llllX
	*  @param value
	**/
   public void setLlllX(char[] value) throws CFException {
      llllXGroup.setLlllX(value);
   } 

     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex) throws CFException {
      llllXGroup.setLlllX(source, sourceIndex);
   	
   }
   
   public void setLlllX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LlllX with another Field
	 *	@param value
	 */
   public void setLlllX(Field source) {
      llllXGroup.setLlllX(source);
   }  
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
        }

        public ConvertVbs2UOutCtx getConvertVbs2UOutCtx() {
            return new ConvertVbs2UOutCtx();
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
        str += ipmEbcdicMessage.hashCode();
        str += umodeMessage.hashCode();
        str += ebcdicIndexGroup.hashCode();
        str += ebcdicTable.hashCode();
        str += llllXGroup.hashCode();
       return str.hashCode();
    }

    public ConvertVbs2UInCtx clone() {
        ConvertVbs2UInCtx cloneObj = new ConvertVbs2UInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.ebcdicIndexGroup = new EbcdicIndexGroup();
        cloneObj.ebcdicIndexGroup.set(ebcdicIndexGroup.getClonedField());
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        cloneObj.llllXGroup = new LlllXGroup();
        cloneObj.llllXGroup.set(llllXGroup.getClonedField());
        return cloneObj;
    }

    }

    public ConvertVbs2UInCtx getConvertVbs2UInCtx() {
            return new ConvertVbs2UInCtx();
    }
     public class ConvertVbs2UOutCtx implements Cloneable {
     Work work = BlkdblkCtx.this.getWork();
     IpmEbcdicMessage ipmEbcdicMessage = BlkdblkCtx.this.getIpmEbcdicMessage();
     UmodeMessage umodeMessage = BlkdblkCtx.this.getUmodeMessage();
     EbcdicIndexGroup ebcdicIndexGroup = BlkdblkCtx.this.getEbcdicIndexGroup();
     EbcdicTable ebcdicTable = BlkdblkCtx.this.getEbcdicTable();
     LlllXGroup llllXGroup = BlkdblkCtx.this.getLlllXGroup();

	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {        
   		return work.getIp66102IpmMsgLngth();
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number)  throws CFException{
		work.setIp66102IpmMsgLngth(number);
	}



	/**
	 *	Returns the value of umodeBuffer
	 *	@return umodeBuffer
	 */
   public char[] getUmodeBuffer() throws CFException  {              
   		return work.getUmodeBuffer();
   }

  
	/**
	*  set variable umodeBuffer
	*  @param value
	**/
   public void setUmodeBuffer(char[] value) throws CFException {
      work.setUmodeBuffer(value);
   } 

	/**
	 *	Returns the value of umodeFileStatus
	 *	@return umodeFileStatus
	 */
   public char[] getUmodeFileStatus() throws CFException  {              
   		return work.getUmodeFileStatus();
   }

  
	/**
	*  set variable umodeFileStatus
	*  @param value
	**/
   public void setUmodeFileStatus(char[] value) throws CFException {
      work.setUmodeFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeMessageLen
	 *	@return umodeMessageLen
	 */
	public long getUmodeMessageLen() throws CFException {        
   		return work.getUmodeMessageLen();
	}
	
	/**
	 * 	Update UmodeMessageLen with the passed value
	 *	@param number
	 */
	public void setUmodeMessageLen(long number)  throws CFException{
		work.setUmodeMessageLen(number);
	}



	/**
	 *	Returns the value of vbsFileStatus
	 *	@return vbsFileStatus
	 */
   public char[] getVbsFileStatus() throws CFException  {              
   		return work.getVbsFileStatus();
   }

  
	/**
	*  set variable vbsFileStatus
	*  @param value
	**/
   public void setVbsFileStatus(char[] value) throws CFException {
      work.setVbsFileStatus(value);
   } 

	/**
	 *	Returns the value of umodeLen
	 *	@return umodeLen
	 */
	public long getUmodeLen() throws CFException {        
   		return work.getUmodeLen();
	}
	
	/**
	 * 	Update UmodeLen with the passed value
	 *	@param number
	 */
	public void setUmodeLen(long number)  throws CFException{
		work.setUmodeLen(number);
	}



	/**
	 *	Returns the value of ebcdicToAscii
	 *	@return ebcdicToAscii
	 */
   public char[] getEbcdicToAscii(int index) throws CFException  {              
   		return ebcdicTable.getEbcdicToAscii(index);
   }

  
	/**
	*  set variable ebcdicToAscii
	*  @param value
	**/
   public void setEbcdicToAscii(int index,char[] value) throws CFException {
      ebcdicTable.setEbcdicToAscii((index),value);
   } 

	/**
	 *	Returns the value of nullByte01
	 *	@return nullByte01
	 */
   public char[] getNullByte01() throws CFException  {              
   		return ebcdicIndexGroup.getEbcdicBytes().getNullByte01();
   }

  
	/**
	*  set variable nullByte01
	*  @param value
	**/
   public void setNullByte01(char[] value) throws CFException {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(value);
   } 

     /**
	 * 	Update NullByte01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNullByte01(char[] source, int sourceIndex) throws CFException {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source, sourceIndex);
   	
   }
   
   public void setNullByte01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NullByte01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNullByte01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NullByte01 with another Field
	 *	@param value
	 */
   public void setNullByte01(Field source) {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source);
   }  
   
     /**
	 * 	Update NullByte01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNullByte01(Field source, int sourceIndex,int sourceLen) {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NullByte01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNullByte01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicIndexGroup.getEbcdicBytes().setNullByte01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ebcdicChar
	 *	@return ebcdicChar
	 */
   public char[] getEbcdicChar() throws CFException  {              
   		return ebcdicIndexGroup.getEbcdicBytes().getEbcdicChar();
   }

  
	/**
	*  set variable ebcdicChar
	*  @param value
	**/
   public void setEbcdicChar(char[] value) throws CFException {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(value);
   } 

     /**
	 * 	Update EbcdicChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEbcdicChar(char[] source, int sourceIndex) throws CFException {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source, sourceIndex);
   	
   }
   
   public void setEbcdicChar(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EbcdicChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EbcdicChar with another Field
	 *	@param value
	 */
   public void setEbcdicChar(Field source) {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source);
   }  
   
     /**
	 * 	Update EbcdicChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEbcdicChar(Field source, int sourceIndex,int sourceLen) {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EbcdicChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ebcdicIndexGroup.getEbcdicBytes().setEbcdicChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {        
   		return work.getUmodeCnt();
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *	@param number
	 */
	public void setUmodeCnt(long number)  throws CFException{
		work.setUmodeCnt(number);
	}



	/**
	 *	Returns the value of ipmEbcdicMessage
	 *	@return ipmEbcdicMessage
	 */   
	 public IpmEbcdicMessage getIpmEbcdicMessage() {
   	return ipmEbcdicMessage;
   }


	/**
	 *	Returns the value of umodeMessage
	 *	@return umodeMessage
	 */   
	 public UmodeMessage getUmodeMessage() {
   	return umodeMessage;
   }


	/**
	 *	Returns the value of umodePos
	 *	@return umodePos
	 */
	public long getUmodePos() throws CFException {        
   		return work.getUmodePos();
	}
	
	/**
	 * 	Update UmodePos with the passed value
	 *	@param number
	 */
	public void setUmodePos(long number)  throws CFException{
		work.setUmodePos(number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(int number)  throws CFException{
		work.setI(number);
	}


	public void setI(long number)  throws CFException{
		work.setI((int)number);
	}


	/**
	 *	Returns the value of llll
	 *	@return llll
	 */
	public long getLlll() throws CFException {        
   		return llllXGroup.getLlll();
	}
	
	/**
	 * 	Update Llll with the passed value
	 *	@param number
	 */
	public void setLlll(long number)  throws CFException{
		llllXGroup.setLlll(number);
	}



	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {        
   		return work.getVbsCnt();
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *	@param number
	 */
	public void setVbsCnt(long number)  throws CFException{
		work.setVbsCnt(number);
	}



	/**
	 *	Returns the value of llllX
	 *	@return llllX
	 */
   public char[] getLlllX() throws CFException  {              
   		return llllXGroup.getLlllX();
   }

  
	/**
	*  set variable llllX
	*  @param value
	**/
   public void setLlllX(char[] value) throws CFException {
      llllXGroup.setLlllX(value);
   } 

     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex) throws CFException {
      llllXGroup.setLlllX(source, sourceIndex);
   	
   }
   
   public void setLlllX(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LlllX with another Field
	 *	@param value
	 */
   public void setLlllX(Field source) {
      llllXGroup.setLlllX(source);
   }  
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      llllXGroup.setLlllX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public BlkdblkCtx getBlkdblkCtx() {
            return BlkdblkCtx.this;
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
        str += ipmEbcdicMessage.hashCode();
        str += umodeMessage.hashCode();
        str += ebcdicIndexGroup.hashCode();
        str += ebcdicTable.hashCode();
        str += llllXGroup.hashCode();
       return str.hashCode();
    }

    public ConvertVbs2UOutCtx clone() {
        ConvertVbs2UOutCtx cloneObj = new ConvertVbs2UOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ipmEbcdicMessage = new IpmEbcdicMessage();
        cloneObj.ipmEbcdicMessage.set(ipmEbcdicMessage.getClonedField());
        cloneObj.umodeMessage = new UmodeMessage();
        cloneObj.umodeMessage.set(umodeMessage.getClonedField());
        cloneObj.ebcdicIndexGroup = new EbcdicIndexGroup();
        cloneObj.ebcdicIndexGroup.set(ebcdicIndexGroup.getClonedField());
        cloneObj.ebcdicTable = new EbcdicTable();
        cloneObj.ebcdicTable.set(ebcdicTable.getClonedField());
        cloneObj.llllXGroup = new LlllXGroup();
        cloneObj.llllXGroup.set(llllXGroup.getClonedField());
        return cloneObj;
    }

    }

    public ConvertVbs2UOutCtx getConvertVbs2UOutCtx() {
            return new ConvertVbs2UOutCtx();
    }
}
