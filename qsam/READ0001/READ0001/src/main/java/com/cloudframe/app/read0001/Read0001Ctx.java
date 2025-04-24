package com.cloudframe.app.read0001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.shared.file.records.XmlRecord;
import com.cloudframe.app.global.sharedvar.MiscData;
import com.cloudframe.app.read0001.dto.Work;


@Context
public class Read0001Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    MiscData miscData;
    Work work;
    XmlRecord xmlRecord;


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


    public MiscData getMiscData() {
        if (miscData == null) {
            miscData = globalCtx.getGlobalDto(MiscData.class);
        }

        return miscData;
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
    public XmlRecord getXmlRecord() {
        if (xmlRecord == null) {
            xmlRecord = new XmlRecord();
        }

        return xmlRecord;
    }

    public void setXmlRecord(XmlRecord xmlRecord) {
        this.xmlRecord = xmlRecord;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public Read0001Ctx clone() {
        Read0001Ctx cloneObj = new Read0001Ctx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Read0001Ctx.this.getWork();

	/**
	 *	Returns the value of read000201
	 *	@return read000201
	 */
   public char[] getRead000201() throws CFException  {              
   		return work.getRead000201();
   }

  
	/**
	*  set variable read000201
	*  @param value
	**/
   public void setRead000201(char[] value) throws CFException {
      work.setRead000201(value);
   } 


        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
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
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Read0001Ctx.this.getWork();


        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OpenReadClose1stTimeInCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of xmlData
	 *	@return xmlData
	 */
   public char[] getXmlData() throws CFException  {              
   		return work.getXmlData();
   }

  
	/**
	*  set variable xmlData
	*  @param value
	**/
   public void setXmlData(char[] value) throws CFException {
      work.setXmlData(value);
   } 


        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }

        public OpenReadClose1stTimeOutCtx getOpenReadClose1stTimeOutCtx() {
            return new OpenReadClose1stTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose1stTimeInCtx clone() {
        OpenReadClose1stTimeInCtx cloneObj = new OpenReadClose1stTimeInCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose1stTimeInCtx getOpenReadClose1stTimeInCtx() {
            return new OpenReadClose1stTimeInCtx();
    }
     public class OpenReadClose1stTimeOutCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of miscData
	 *	@return miscData
	 */   
	 public MiscData getMiscData() {
   	return miscData;
   }


	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return miscData.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	miscData.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of xmlRecord
	 *	@return xmlRecord
	 */   
	 public XmlRecord getXmlRecord() {
   	return xmlRecord;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return miscData.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		miscData.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		miscData.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		miscData.setEofFlag((short)number);
	}




        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose1stTimeOutCtx clone() {
        OpenReadClose1stTimeOutCtx cloneObj = new OpenReadClose1stTimeOutCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose1stTimeOutCtx getOpenReadClose1stTimeOutCtx() {
            return new OpenReadClose1stTimeOutCtx();
    }
     public class OpenReadClose2ndTimeInCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of xmlData
	 *	@return xmlData
	 */
   public char[] getXmlData() throws CFException  {              
   		return work.getXmlData();
   }

  
	/**
	*  set variable xmlData
	*  @param value
	**/
   public void setXmlData(char[] value) throws CFException {
      work.setXmlData(value);
   } 


        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }

        public OpenReadClose2ndTimeOutCtx getOpenReadClose2ndTimeOutCtx() {
            return new OpenReadClose2ndTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose2ndTimeInCtx clone() {
        OpenReadClose2ndTimeInCtx cloneObj = new OpenReadClose2ndTimeInCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose2ndTimeInCtx getOpenReadClose2ndTimeInCtx() {
            return new OpenReadClose2ndTimeInCtx();
    }
     public class OpenReadClose2ndTimeOutCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of miscData
	 *	@return miscData
	 */   
	 public MiscData getMiscData() {
   	return miscData;
   }


	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return miscData.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	miscData.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of xmlRecord
	 *	@return xmlRecord
	 */   
	 public XmlRecord getXmlRecord() {
   	return xmlRecord;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return miscData.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		miscData.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		miscData.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		miscData.setEofFlag((short)number);
	}




        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose2ndTimeOutCtx clone() {
        OpenReadClose2ndTimeOutCtx cloneObj = new OpenReadClose2ndTimeOutCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose2ndTimeOutCtx getOpenReadClose2ndTimeOutCtx() {
            return new OpenReadClose2ndTimeOutCtx();
    }
     public class OpenReadClose3rdTimeInCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of xmlData
	 *	@return xmlData
	 */
   public char[] getXmlData() throws CFException  {              
   		return work.getXmlData();
   }

  
	/**
	*  set variable xmlData
	*  @param value
	**/
   public void setXmlData(char[] value) throws CFException {
      work.setXmlData(value);
   } 


        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }

        public OpenReadClose3rdTimeOutCtx getOpenReadClose3rdTimeOutCtx() {
            return new OpenReadClose3rdTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose3rdTimeInCtx clone() {
        OpenReadClose3rdTimeInCtx cloneObj = new OpenReadClose3rdTimeInCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose3rdTimeInCtx getOpenReadClose3rdTimeInCtx() {
            return new OpenReadClose3rdTimeInCtx();
    }
     public class OpenReadClose3rdTimeOutCtx implements Cloneable {
     MiscData miscData = Read0001Ctx.this.getMiscData();
     Work work = Read0001Ctx.this.getWork();
     XmlRecord xmlRecord = Read0001Ctx.this.getXmlRecord();

	/**
	 *	Returns the value of xmlStat
	 *	@return xmlStat
	 */
	public int getXmlStat() throws CFException {
   		return miscData.getXmlStat();
	}


	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() throws CFException {
	     return String.valueOf(miscData.getXmlStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric()  throws CFException{
	    return miscData.xmlStatIsNumeric();
	}

	/**
	 * 	Update XmlStat with the passed value
	 *	@param number
	 */
	public void setXmlStat(int number)  throws CFException{
		miscData.setXmlStat(number);
	}
	

	public void setXmlStat(long number)  throws CFException{
	    miscData.setXmlStat(number);
	}
	
	
	/**
	 * 	Update XmlStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setXmlStat(char[] value)  throws CFException {
		miscData.setXmlStat(value);
	}
	
	/**
	 * 	Update XmlStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXmlStatString(char[] value)  throws CFException{
		miscData.setXmlStat(value);
	}	

	/**
	 *	Returns the value of miscData
	 *	@return miscData
	 */   
	 public MiscData getMiscData() {
   	return miscData;
   }


	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return miscData.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	miscData.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of xmlRecord
	 *	@return xmlRecord
	 */   
	 public XmlRecord getXmlRecord() {
   	return xmlRecord;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return miscData.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		miscData.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		miscData.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		miscData.setEofFlag((short)number);
	}




        public Read0001Ctx getRead0001Ctx() {
            return Read0001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += miscData.hashCode();
        str += work.hashCode();
        str += xmlRecord.hashCode();
       return str.hashCode();
    }

    public OpenReadClose3rdTimeOutCtx clone() {
        OpenReadClose3rdTimeOutCtx cloneObj = new OpenReadClose3rdTimeOutCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.xmlRecord = new XmlRecord();
        cloneObj.xmlRecord.set(xmlRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenReadClose3rdTimeOutCtx getOpenReadClose3rdTimeOutCtx() {
            return new OpenReadClose3rdTimeOutCtx();
    }
}
