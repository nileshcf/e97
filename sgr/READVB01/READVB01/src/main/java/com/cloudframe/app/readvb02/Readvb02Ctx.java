package com.cloudframe.app.readvb02;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.shared.file.records.XmlRecordMaxGroup;
import com.cloudframe.app.global.shared.file.records.XmlRecordMax;
import com.cloudframe.app.global.sharedvar.MiscData;
import com.cloudframe.app.readvb02.dto.Work;


@Context
public class Readvb02Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    XmlRecordMaxGroup xmlRecordMaxGroup;
    MiscData miscData;
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


    public XmlRecordMaxGroup getXmlRecordMaxGroup() {
        if (xmlRecordMaxGroup == null) {
            xmlRecordMaxGroup = new XmlRecordMaxGroup();
        }

        return xmlRecordMaxGroup;
    }

    public void setXmlRecordMaxGroup(XmlRecordMaxGroup xmlRecordMaxGroup) {
        this.xmlRecordMaxGroup = xmlRecordMaxGroup;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlRecordMaxGroup.hashCode();
        str += miscData.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Readvb02Ctx clone() {
        Readvb02Ctx cloneObj = new Readvb02Ctx();
        cloneObj.xmlRecordMaxGroup = new XmlRecordMaxGroup();
        cloneObj.xmlRecordMaxGroup.set(xmlRecordMaxGroup.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Readvb02Ctx.this.getWork();
     MiscData miscData = Readvb02Ctx.this.getMiscData();
     XmlRecordMaxGroup xmlRecordMaxGroup = Readvb02Ctx.this.getXmlRecordMaxGroup();

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

	/**
	 *	Returns the value of recLenIn
	 *	@return recLenIn
	 */
	public long getRecLenIn() throws CFException {        
   		return miscData.getRecLenIn();
	}
	
	/**
	 * 	Update RecLenIn with the passed value
	 *	@param number
	 */
	public void setRecLenIn(long number)  throws CFException{
		miscData.setRecLenIn(number);
	}




        public Readvb02Ctx getReadvb02Ctx() {
            return Readvb02Ctx.this;
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
        str += miscData.hashCode();
        str += xmlRecordMaxGroup.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.xmlRecordMaxGroup = new XmlRecordMaxGroup();
        cloneObj.xmlRecordMaxGroup.set(xmlRecordMaxGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     MiscData miscData = Readvb02Ctx.this.getMiscData();
     XmlRecordMaxGroup xmlRecordMaxGroup = Readvb02Ctx.this.getXmlRecordMaxGroup();
     Work work = Readvb02Ctx.this.getWork();

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
	 *	Returns the value of xmlRecordMax
	 *	@return xmlRecordMax
	 */   
	 public XmlRecordMax getXmlRecordMax() {
   	return xmlRecordMaxGroup.getXmlRecordMax();
   }

   /**
	* 	Update XmlRecordMax with the passed value
	*	@param value
	*/
   public void setXmlRecordMax(char[] value) throws CFException {
      xmlRecordMaxGroup.setXmlRecordMax(value);
   }   

     /**
	 * 	Update XmlRecordMax 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMax(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	xmlRecordMaxGroup.setXmlRecordMax(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update XmlRecordMax 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMax(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	xmlRecordMaxGroup.setXmlRecordMax(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update XmlRecordMax with another Field
	 *	@param value
	 */
   public void setXmlRecordMax(Field source) {
   	xmlRecordMaxGroup.setXmlRecordMax(source);
   }  
   
     /**
	 * 	Update XmlRecordMax 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXmlRecordMax(Field source, int sourceIndex,int sourceLen) {
   	xmlRecordMaxGroup.setXmlRecordMax(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update XmlRecordMax 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXmlRecordMax(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	xmlRecordMaxGroup.setXmlRecordMax(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recLenIn
	 *	@return recLenIn
	 */
	public long getRecLenIn() throws CFException {        
   		return miscData.getRecLenIn();
	}
	
	/**
	 * 	Update RecLenIn with the passed value
	 *	@param number
	 */
	public void setRecLenIn(long number)  throws CFException{
		miscData.setRecLenIn(number);
	}




        public Readvb02Ctx getReadvb02Ctx() {
            return Readvb02Ctx.this;
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
        str += xmlRecordMaxGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.xmlRecordMaxGroup = new XmlRecordMaxGroup();
        cloneObj.xmlRecordMaxGroup.set(xmlRecordMaxGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
