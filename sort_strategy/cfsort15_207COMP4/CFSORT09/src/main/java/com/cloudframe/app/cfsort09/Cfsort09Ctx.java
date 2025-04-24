package com.cloudframe.app.cfsort09;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort09.file.records.TestdataRecord;
import com.cloudframe.app.cfsort09.file.records.SortworkRecord;
import com.cloudframe.app.cfsort09.dto.WSortdataRecord;
import com.cloudframe.app.cfsort09.dto.LParmG;
import com.cloudframe.app.cfsort09.dto.Work;
import com.cloudframe.app.cfsort09.file.records.DisplayRecord;


@Context
public class Cfsort09Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    TestdataRecord testdataRecord;
    Work work;
    WSortdataRecord wSortdataRecord;
    LParmG lParmG;
    SortworkRecord sortworkRecord;
    DisplayRecord displayRecord;


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


    public TestdataRecord getTestdataRecord() {
        if (testdataRecord == null) {
            testdataRecord = new TestdataRecord();
        }

        return testdataRecord;
    }

    public void setTestdataRecord(TestdataRecord testdataRecord) {
        this.testdataRecord = testdataRecord;
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
    public WSortdataRecord getWSortdataRecord() {
        if (wSortdataRecord == null) {
            wSortdataRecord = new WSortdataRecord();
        }

        return wSortdataRecord;
    }

    public void setWSortdataRecord(WSortdataRecord wSortdataRecord) {
        this.wSortdataRecord = wSortdataRecord;
    }
    public LParmG getLParmG() {
        if (lParmG == null) {
            lParmG = new LParmG();
        }

        return lParmG;
    }

    public void setLParmG(LParmG lParmG) {
        this.lParmG = lParmG;
    }
    public SortworkRecord getSortworkRecord() {
        if (sortworkRecord == null) {
            sortworkRecord = new SortworkRecord();
        }

        return sortworkRecord;
    }

    public void setSortworkRecord(SortworkRecord sortworkRecord) {
        this.sortworkRecord = sortworkRecord;
    }
    public DisplayRecord getDisplayRecord() {
        if (displayRecord == null) {
            displayRecord = new DisplayRecord();
        }

        return displayRecord;
    }

    public void setDisplayRecord(DisplayRecord displayRecord) {
        this.displayRecord = displayRecord;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += testdataRecord.hashCode();
        str += work.hashCode();
        str += wSortdataRecord.hashCode();
        str += lParmG.hashCode();
        str += sortworkRecord.hashCode();
        str += displayRecord.hashCode();
       return str.hashCode();
    }

    public Cfsort09Ctx clone() {
        Cfsort09Ctx cloneObj = new Cfsort09Ctx();
        cloneObj.testdataRecord = new TestdataRecord();
        cloneObj.testdataRecord.set(testdataRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wSortdataRecord = new WSortdataRecord();
        cloneObj.wSortdataRecord.set(wSortdataRecord.getClonedField());
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        cloneObj.sortworkRecord = new SortworkRecord();
        cloneObj.sortworkRecord.set(sortworkRecord.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     LParmG lParmG = Cfsort09Ctx.this.getLParmG();


        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lParmG.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     TestdataRecord testdataRecord = Cfsort09Ctx.this.getTestdataRecord();
     Work work = Cfsort09Ctx.this.getWork();
     LParmG lParmG = Cfsort09Ctx.this.getLParmG();
     SortworkRecord sortworkRecord = Cfsort09Ctx.this.getSortworkRecord();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();

	/**
	 *	Returns the value of sortworkKeyComp
	 *	@return sortworkKeyComp
	 */
	public int getSortworkKeyComp() throws CFException {        
   		return sortworkRecord.getSortworkKeyComp();
	}
	
	/**
	 * 	Update SortworkKeyComp with the passed value
	 *	@param number
	 */
	public void setSortworkKeyComp(int number)  throws CFException{
		sortworkRecord.setSortworkKeyComp(number);
	}


	public void setSortworkKeyComp(long number)  throws CFException{
		sortworkRecord.setSortworkKeyComp((int)number);
	}


	/**
	 *	Returns the value of sortworkKeyComp5
	 *	@return sortworkKeyComp5
	 */
	public int getSortworkKeyComp5() throws CFException {        
   		return sortworkRecord.getSortworkKeyComp5();
	}
	
	/**
	 * 	Update SortworkKeyComp5 with the passed value
	 *	@param number
	 */
	public void setSortworkKeyComp5(int number)  throws CFException{
		sortworkRecord.setSortworkKeyComp5(number);
	}


	public void setSortworkKeyComp5(long number)  throws CFException{
		sortworkRecord.setSortworkKeyComp5((int)number);
	}


	/**
	 *	Returns the value of sortworkKeyComp4
	 *	@return sortworkKeyComp4
	 */
	public int getSortworkKeyComp4() throws CFException {        
   		return sortworkRecord.getSortworkKeyComp4();
	}
	
	/**
	 * 	Update SortworkKeyComp4 with the passed value
	 *	@param number
	 */
	public void setSortworkKeyComp4(int number)  throws CFException{
		sortworkRecord.setSortworkKeyComp4(number);
	}


	public void setSortworkKeyComp4(long number)  throws CFException{
		sortworkRecord.setSortworkKeyComp4((int)number);
	}


	/**
	 *	Test condition "ZONE-DEC" for isLParmSortZoneDecimal()
	 *	@return  Returns true if isLParmSortZoneDecimal() is "ZONE-DEC"
	 */
   public boolean isLParmSortZoneDecimal() throws CFException {
      return lParmG.isLParmSortZoneDecimal();
   }

	/**
	*  set values "ZONE-DEC"
	*/
   	public void setLParmSortZoneDecimalTrue()  throws CFException{  			
    	lParmG.setLParmSortZoneDecimalTrue();
   	}
public long getSortworkKeyComp3() throws CFException {  
        return sortworkRecord.getSortworkKeyComp3();
}
	/**
	 * 	Update SortworkKeyComp3 with the passed value
	 *	@param number
	 */
	public void setSortworkKeyComp3(long number)  throws CFException{
		sortworkRecord.setSortworkKeyComp3(number);
	}



	/**
	 *	Test condition "COMP" for isLParmSortComp()
	 *	@return  Returns true if isLParmSortComp() is "COMP"
	 */
   public boolean isLParmSortComp() throws CFException {
      return lParmG.isLParmSortComp();
   }

	/**
	*  set values "COMP"
	*/
   	public void setLParmSortCompTrue()  throws CFException{  			
    	lParmG.setLParmSortCompTrue();
   	}
	/**
	 *	Returns the value of displayRecord
	 *	@return displayRecord
	 */   
	 public DisplayRecord getDisplayRecord() {
   	return displayRecord;
   }


	/**
	 *	Returns the value of sortworkRecord
	 *	@return sortworkRecord
	 */   
	 public SortworkRecord getSortworkRecord() {
   	return sortworkRecord;
   }


	/**
	 *	Test condition "COMP-3" for isLParmSortComp3()
	 *	@return  Returns true if isLParmSortComp3() is "COMP-3"
	 */
   public boolean isLParmSortComp3() throws CFException {
      return lParmG.isLParmSortComp3();
   }

	/**
	*  set values "COMP-3"
	*/
   	public void setLParmSortComp3True()  throws CFException{  			
    	lParmG.setLParmSortComp3True();
   	}
	/**
	 *	Returns the value of testdataRecord
	 *	@return testdataRecord
	 */   
	 public TestdataRecord getTestdataRecord() {
   	return testdataRecord;
   }


	/**
	 *	Returns the value of sortworkKeyBinary
	 *	@return sortworkKeyBinary
	 */
	public int getSortworkKeyBinary() throws CFException {        
   		return sortworkRecord.getSortworkKeyBinary();
	}
	
	/**
	 * 	Update SortworkKeyBinary with the passed value
	 *	@param number
	 */
	public void setSortworkKeyBinary(int number)  throws CFException{
		sortworkRecord.setSortworkKeyBinary(number);
	}


	public void setSortworkKeyBinary(long number)  throws CFException{
		sortworkRecord.setSortworkKeyBinary((int)number);
	}


	/**
	 *	Returns the value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public long getSortworkKeyZoneDec() throws CFException {
   		return sortworkRecord.getSortworkKeyZoneDec();
	}

    /**
	 *	Returns the String value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public char[]  getSortworkKeyZoneDecActualString() {
		return sortworkRecord.getSortworkKeyZoneDecActualString();
	}

	/**
	 *	Returns String value of sortworkKeyZoneDec
	 *	@return sortworkKeyZoneDec
	 */
	public char[]  getSortworkKeyZoneDecString() throws CFException {
	     return String.valueOf(sortworkRecord.getSortworkKeyZoneDecString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sortworkKeyZoneDecIsNumeric()  throws CFException{
	    return sortworkRecord.sortworkKeyZoneDecIsNumeric();
	}

	/**
	 * 	Update SortworkKeyZoneDec with the passed value
	 *	@param number
	 */
	public void setSortworkKeyZoneDec(long number)  throws CFException{
		sortworkRecord.setSortworkKeyZoneDec(number);
	}
	

	
	/**
	 * 	Update SortworkKeyZoneDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setSortworkKeyZoneDec(char[] value)  throws CFException {
		sortworkRecord.setSortworkKeyZoneDec(value);
	}
	
	/**
	 * 	Update SortworkKeyZoneDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSortworkKeyZoneDecString(char[] value)  throws CFException{
		sortworkRecord.setSortworkKeyZoneDec(value);
	}	

	/**
	 *	Test condition "COMP-4" for isLParmSortComp4()
	 *	@return  Returns true if isLParmSortComp4() is "COMP-4"
	 */
   public boolean isLParmSortComp4() throws CFException {
      return lParmG.isLParmSortComp4();
   }

	/**
	*  set values "COMP-4"
	*/
   	public void setLParmSortComp4True()  throws CFException{  			
    	lParmG.setLParmSortComp4True();
   	}
	/**
	 *	Test condition "BINARY" for isLParmSortBinary()
	 *	@return  Returns true if isLParmSortBinary() is "BINARY"
	 */
   public boolean isLParmSortBinary() throws CFException {
      return lParmG.isLParmSortBinary();
   }

	/**
	*  set values "BINARY"
	*/
   	public void setLParmSortBinaryTrue()  throws CFException{  			
    	lParmG.setLParmSortBinaryTrue();
   	}
	/**
	 *	Test condition "COMP-5" for isLParmSortComp5()
	 *	@return  Returns true if isLParmSortComp5() is "COMP-5"
	 */
   public boolean isLParmSortComp5() throws CFException {
      return lParmG.isLParmSortComp5();
   }

	/**
	*  set values "COMP-5"
	*/
   	public void setLParmSortComp5True()  throws CFException{  			
    	lParmG.setLParmSortComp5True();
   	}

        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
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
        str += testdataRecord.hashCode();
        str += work.hashCode();
        str += lParmG.hashCode();
        str += sortworkRecord.hashCode();
        str += displayRecord.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.testdataRecord = new TestdataRecord();
        cloneObj.testdataRecord.set(testdataRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        cloneObj.sortworkRecord = new SortworkRecord();
        cloneObj.sortworkRecord.set(sortworkRecord.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     TestdataRecord testdataRecord = Cfsort09Ctx.this.getTestdataRecord();
     Work work = Cfsort09Ctx.this.getWork();
     LParmG lParmG = Cfsort09Ctx.this.getLParmG();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();
     SortworkRecord sortworkRecord = Cfsort09Ctx.this.getSortworkRecord();

	/**
	 *	Returns the value of displayFileStatus
	 *	@return displayFileStatus
	 */
   public char[] getDisplayFileStatus() throws CFException  {              
   		return work.getDisplayFileStatus();
   }

  
	/**
	*  set variable displayFileStatus
	*  @param value
	**/
   public void setDisplayFileStatus(char[] value) throws CFException {
      work.setDisplayFileStatus(value);
   } 

	/**
	 *	Returns the value of displayRecord
	 *	@return displayRecord
	 */   
	 public DisplayRecord getDisplayRecord() {
   	return displayRecord;
   }



        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += testdataRecord.hashCode();
        str += work.hashCode();
        str += lParmG.hashCode();
        str += displayRecord.hashCode();
        str += sortworkRecord.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.testdataRecord = new TestdataRecord();
        cloneObj.testdataRecord.set(testdataRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        cloneObj.sortworkRecord = new SortworkRecord();
        cloneObj.sortworkRecord.set(sortworkRecord.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitInCtx implements Cloneable {
     Work work = Cfsort09Ctx.this.getWork();
     LParmG lParmG = Cfsort09Ctx.this.getLParmG();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();

	/**
	 *	Test condition "COMP-3" for isLParmSortComp3()
	 *	@return  Returns true if isLParmSortComp3() is "COMP-3"
	 */
   public boolean isLParmSortComp3() throws CFException {
      return lParmG.isLParmSortComp3();
   }

	/**
	*  set values "COMP-3"
	*/
   	public void setLParmSortComp3True()  throws CFException{  			
    	lParmG.setLParmSortComp3True();
   	}
	/**
	 *	Test condition "ZONE-DEC" for isLParmSortZoneDecimal()
	 *	@return  Returns true if isLParmSortZoneDecimal() is "ZONE-DEC"
	 */
   public boolean isLParmSortZoneDecimal() throws CFException {
      return lParmG.isLParmSortZoneDecimal();
   }

	/**
	*  set values "ZONE-DEC"
	*/
   	public void setLParmSortZoneDecimalTrue()  throws CFException{  			
    	lParmG.setLParmSortZoneDecimalTrue();
   	}
	/**
	 *	Returns the value of lParmLen
	 *	@return lParmLen
	 */
	public short getLParmLen() throws CFException {        
   		return lParmG.getLParmLen();
	}
	
	/**
	 * 	Update LParmLen with the passed value
	 *	@param number
	 */
	public void setLParmLen(short number)  throws CFException{
		lParmG.setLParmLen(number);
	}

	public void setLParmLen(int number)  throws CFException{
		lParmG.setLParmLen((short)number);
	}

	public void setLParmLen(long number)  throws CFException{
		lParmG.setLParmLen((short)number);
	}



	/**
	 *	Returns the value of lParmG
	 *	@return lParmG
	 */   
	 public LParmG getLParmG() {
   	return lParmG;
   }


	/**
	 *	Test condition "COMP" for isLParmSortComp()
	 *	@return  Returns true if isLParmSortComp() is "COMP"
	 */
   public boolean isLParmSortComp() throws CFException {
      return lParmG.isLParmSortComp();
   }

	/**
	*  set values "COMP"
	*/
   	public void setLParmSortCompTrue()  throws CFException{  			
    	lParmG.setLParmSortCompTrue();
   	}
	/**
	 *	Test condition "COMP-4" for isLParmSortComp4()
	 *	@return  Returns true if isLParmSortComp4() is "COMP-4"
	 */
   public boolean isLParmSortComp4() throws CFException {
      return lParmG.isLParmSortComp4();
   }

	/**
	*  set values "COMP-4"
	*/
   	public void setLParmSortComp4True()  throws CFException{  			
    	lParmG.setLParmSortComp4True();
   	}
	/**
	 *	Returns the value of displayRecord
	 *	@return displayRecord
	 */   
	 public DisplayRecord getDisplayRecord() {
   	return displayRecord;
   }


	/**
	 *	Test condition "BINARY" for isLParmSortBinary()
	 *	@return  Returns true if isLParmSortBinary() is "BINARY"
	 */
   public boolean isLParmSortBinary() throws CFException {
      return lParmG.isLParmSortBinary();
   }

	/**
	*  set values "BINARY"
	*/
   	public void setLParmSortBinaryTrue()  throws CFException{  			
    	lParmG.setLParmSortBinaryTrue();
   	}
	/**
	 *	Test condition "COMP-5" for isLParmSortComp5()
	 *	@return  Returns true if isLParmSortComp5() is "COMP-5"
	 */
   public boolean isLParmSortComp5() throws CFException {
      return lParmG.isLParmSortComp5();
   }

	/**
	*  set values "COMP-5"
	*/
   	public void setLParmSortComp5True()  throws CFException{  			
    	lParmG.setLParmSortComp5True();
   	}

        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
        }

        public InitOutCtx getInitOutCtx() {
            return new InitOutCtx();
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
        str += lParmG.hashCode();
        str += displayRecord.hashCode();
       return str.hashCode();
    }

    public InitInCtx clone() {
        InitInCtx cloneObj = new InitInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        return cloneObj;
    }

    }

    public InitInCtx getInitInCtx() {
            return new InitInCtx();
    }
     public class InitOutCtx implements Cloneable {
     Work work = Cfsort09Ctx.this.getWork();
     LParmG lParmG = Cfsort09Ctx.this.getLParmG();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();

	/**
	 *	Returns the value of displayFileStatus
	 *	@return displayFileStatus
	 */
   public char[] getDisplayFileStatus() throws CFException  {              
   		return work.getDisplayFileStatus();
   }

  
	/**
	*  set variable displayFileStatus
	*  @param value
	**/
   public void setDisplayFileStatus(char[] value) throws CFException {
      work.setDisplayFileStatus(value);
   } 

	/**
	 *	Returns the value of displayRecord
	 *	@return displayRecord
	 */   
	 public DisplayRecord getDisplayRecord() {
   	return displayRecord;
   }



        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
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
        str += lParmG.hashCode();
        str += displayRecord.hashCode();
       return str.hashCode();
    }

    public InitOutCtx clone() {
        InitOutCtx cloneObj = new InitOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lParmG = new LParmG();
        cloneObj.lParmG.set(lParmG.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        return cloneObj;
    }

    }

    public InitOutCtx getInitOutCtx() {
            return new InitOutCtx();
    }
     public class ReturnRecordsInCtx implements Cloneable {
     Work work = Cfsort09Ctx.this.getWork();
     WSortdataRecord wSortdataRecord = Cfsort09Ctx.this.getWSortdataRecord();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(int number)  throws CFException{
		work.setJ(number);
	}


	public void setJ(long number)  throws CFException{
		work.setJ((int)number);
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
	 *	Returns the value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public long getWSortdataKeyZoneDec() throws CFException {
   		return wSortdataRecord.getWSortdataKeyZoneDec();
	}

    /**
	 *	Returns the String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecActualString() {
		return wSortdataRecord.getWSortdataKeyZoneDecActualString();
	}

	/**
	 *	Returns String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecString() throws CFException {
	     return String.valueOf(wSortdataRecord.getWSortdataKeyZoneDecString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wSortdataKeyZoneDecIsNumeric()  throws CFException{
	    return wSortdataRecord.wSortdataKeyZoneDecIsNumeric();
	}

	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *	@param number
	 */
	public void setWSortdataKeyZoneDec(long number)  throws CFException{
		wSortdataRecord.setWSortdataKeyZoneDec(number);
	}
	

	
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDec(char[] value)  throws CFException {
		wSortdataRecord.setWSortdataKeyZoneDec(value);
	}
	
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDecString(char[] value)  throws CFException{
		wSortdataRecord.setWSortdataKeyZoneDec(value);
	}	

	/**
	 *	Returns the value of wSortdataRecord
	 *	@return wSortdataRecord
	 */   
	 public WSortdataRecord getWSortdataRecord() {
   	return wSortdataRecord;
   }



        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
        }

        public ReturnRecordsOutCtx getReturnRecordsOutCtx() {
            return new ReturnRecordsOutCtx();
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
        str += wSortdataRecord.hashCode();
        str += displayRecord.hashCode();
       return str.hashCode();
    }

    public ReturnRecordsInCtx clone() {
        ReturnRecordsInCtx cloneObj = new ReturnRecordsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wSortdataRecord = new WSortdataRecord();
        cloneObj.wSortdataRecord.set(wSortdataRecord.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReturnRecordsInCtx getReturnRecordsInCtx() {
            return new ReturnRecordsInCtx();
    }
     public class ReturnRecordsOutCtx implements Cloneable {
     Work work = Cfsort09Ctx.this.getWork();
     WSortdataRecord wSortdataRecord = Cfsort09Ctx.this.getWSortdataRecord();
     DisplayRecord displayRecord = Cfsort09Ctx.this.getDisplayRecord();
     SortworkRecord sortworkRecord = Cfsort09Ctx.this.getSortworkRecord();

	/**
	 *	Returns the value of dispJ
	 *	@return dispJ
	 */
	public long getDispJ() throws CFException {
   		return work.getDispJ();
	}


	/**
	 *	Returns String value of dispJ
	 *	@return dispJ
	 */
	public char[]  getDispJString() throws CFException {
	     return String.valueOf(work.getDispJString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispJIsNumeric()  throws CFException{
	    return work.dispJIsNumeric();
	}

	/**
	 * 	Update DispJ with the passed value
	 *	@param number
	 */
	public void setDispJ(long number)  throws CFException{
		work.setDispJ(number);
	}
	

	
	/**
	 * 	Update DispJ with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispJ(char[] value)  throws CFException {
		work.setDispJ(value);
	}
	
	/**
	 * 	Update DispJ with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispJString(char[] value)  throws CFException{
		work.setDispJ(value);
	}	

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(int number)  throws CFException{
		work.setJ(number);
	}


	public void setJ(long number)  throws CFException{
		work.setJ((int)number);
	}


	/**
	 *	Returns the value of displayFileStatus
	 *	@return displayFileStatus
	 */
   public char[] getDisplayFileStatus() throws CFException  {              
   		return work.getDisplayFileStatus();
   }

  
	/**
	*  set variable displayFileStatus
	*  @param value
	**/
   public void setDisplayFileStatus(char[] value) throws CFException {
      work.setDisplayFileStatus(value);
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
	 *	Returns the value of dispI
	 *	@return dispI
	 */
   public char[] getDispI() throws CFException  {              
   		return work.getDispI();
   }

  
	/**
	*  set variable dispI
	*  @param value
	**/
   public void setDispI(char[] value) throws CFException {
      work.setDispI(value);
   } 

     /**
	 * 	Update DispI 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispI(char[] source, int sourceIndex) throws CFException {
      work.setDispI(source, sourceIndex);
   	
   }
   
   public void setDispI(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDispI(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DispI 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispI(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispI(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DispI with another Field
	 *	@param value
	 */
   public void setDispI(Field source) {
      work.setDispI(source);
   }  
   
     /**
	 * 	Update DispI 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispI(Field source, int sourceIndex,int sourceLen) {
      work.setDispI(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DispI 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispI(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispI(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public long getWSortdataKeyZoneDec() throws CFException {
   		return wSortdataRecord.getWSortdataKeyZoneDec();
	}

    /**
	 *	Returns the String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecActualString() {
		return wSortdataRecord.getWSortdataKeyZoneDecActualString();
	}

	/**
	 *	Returns String value of wSortdataKeyZoneDec
	 *	@return wSortdataKeyZoneDec
	 */
	public char[]  getWSortdataKeyZoneDecString() throws CFException {
	     return String.valueOf(wSortdataRecord.getWSortdataKeyZoneDecString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wSortdataKeyZoneDecIsNumeric()  throws CFException{
	    return wSortdataRecord.wSortdataKeyZoneDecIsNumeric();
	}

	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *	@param number
	 */
	public void setWSortdataKeyZoneDec(long number)  throws CFException{
		wSortdataRecord.setWSortdataKeyZoneDec(number);
	}
	

	
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDec(char[] value)  throws CFException {
		wSortdataRecord.setWSortdataKeyZoneDec(value);
	}
	
	/**
	 * 	Update WSortdataKeyZoneDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWSortdataKeyZoneDecString(char[] value)  throws CFException{
		wSortdataRecord.setWSortdataKeyZoneDec(value);
	}	

	/**
	 *	Returns the value of sortworkRecord
	 *	@return sortworkRecord
	 */   
	 public SortworkRecord getSortworkRecord() {
   	return sortworkRecord;
   }


	/**
	 *	Returns the value of displayRecord
	 *	@return displayRecord
	 */   
	 public DisplayRecord getDisplayRecord() {
   	return displayRecord;
   }



        public Cfsort09Ctx getCfsort09Ctx() {
            return Cfsort09Ctx.this;
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
        str += wSortdataRecord.hashCode();
        str += displayRecord.hashCode();
        str += sortworkRecord.hashCode();
       return str.hashCode();
    }

    public ReturnRecordsOutCtx clone() {
        ReturnRecordsOutCtx cloneObj = new ReturnRecordsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wSortdataRecord = new WSortdataRecord();
        cloneObj.wSortdataRecord.set(wSortdataRecord.getClonedField());
        cloneObj.displayRecord = new DisplayRecord();
        cloneObj.displayRecord.set(displayRecord.getClonedField());
        cloneObj.sortworkRecord = new SortworkRecord();
        cloneObj.sortworkRecord.set(sortworkRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReturnRecordsOutCtx getReturnRecordsOutCtx() {
            return new ReturnRecordsOutCtx();
    }
}
