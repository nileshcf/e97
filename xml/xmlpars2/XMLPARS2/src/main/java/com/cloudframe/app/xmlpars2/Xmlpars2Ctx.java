package com.cloudframe.app.xmlpars2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.xmlpars2.dto.Work;
import com.cloudframe.app.data.Field;


@Context
public class Xmlpars2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

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

    long xmlCode = 0;

    public long getXmlCode() {
        return this.xmlCode;
    }

    public void setXmlCode(long xmlCode) {
            this.xmlCode = xmlCode;
        }
    char[] xmlEvent = Field.fillSpace(30);

    public char[] getXmlEvent() {
        return this.xmlEvent;
    }

    public void setXmlEvent(char[] xmlEvent) {
            this.xmlEvent = xmlEvent;
        }
    char[] xmlText = Field.fillLowValue(256);

    public char[] getXmlText() {
        return this.xmlText;
    }

    public void setXmlText(char[] xmlText) {
            this.xmlText = xmlText;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public Xmlpars2Ctx clone() {
        Xmlpars2Ctx cloneObj = new Xmlpars2Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Xmlpars2Ctx.this.getWork();

	/**
	 *	Returns the value of vXml
	 *	@return vXml
	 */
   public char[] getVXml() throws CFException  {              
   		return work.getVXml();
   }

  
	/**
	*  set variable vXml
	*  @param value
	**/
   public void setVXml(char[] value) throws CFException {
      work.setVXml(value);
   } 


        public Xmlpars2Ctx getXmlpars2Ctx() {
            return Xmlpars2Ctx.this;
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
     public class ParseXmlInCtx implements Cloneable {
     Work work = Xmlpars2Ctx.this.getWork();

	/**
	 *	Returns the value of attrLen
	 *	@return attrLen
	 */
	public short getAttrLen() throws CFException {        
   		return work.getAttrLen();
	}
	
	/**
	 * 	Update AttrLen with the passed value
	 *	@param number
	 */
	public void setAttrLen(short number)  throws CFException{
		work.setAttrLen(number);
	}

	public void setAttrLen(int number)  throws CFException{
		work.setAttrLen((short)number);
	}

	public void setAttrLen(long number)  throws CFException{
		work.setAttrLen((short)number);
	}



	/**
	 *	Returns the value of elemLen
	 *	@return elemLen
	 */
	public short getElemLen() throws CFException {        
   		return work.getElemLen();
	}
	
	/**
	 * 	Update ElemLen with the passed value
	 *	@param number
	 */
	public void setElemLen(short number)  throws CFException{
		work.setElemLen(number);
	}

	public void setElemLen(int number)  throws CFException{
		work.setElemLen((short)number);
	}

	public void setElemLen(long number)  throws CFException{
		work.setElemLen((short)number);
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



        public Xmlpars2Ctx getXmlpars2Ctx() {
            return Xmlpars2Ctx.this;
        }

        public ParseXmlOutCtx getParseXmlOutCtx() {
            return new ParseXmlOutCtx();
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

    public ParseXmlInCtx clone() {
        ParseXmlInCtx cloneObj = new ParseXmlInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ParseXmlInCtx getParseXmlInCtx() {
            return new ParseXmlInCtx();
    }
     public class ParseXmlOutCtx implements Cloneable {
     Work work = Xmlpars2Ctx.this.getWork();

	/**
	 *	Returns the value of elemNm
	 *	@return elemNm
	 */
   public char[] getElemNm() throws CFException  {              
   		return work.getElemNm();
   }

  
	/**
	*  set variable elemNm
	*  @param value
	**/
   public void setElemNm(char[] value) throws CFException {
      work.setElemNm(value);
   } 

	/**
	 *	Returns the value of attrLen
	 *	@return attrLen
	 */
	public short getAttrLen() throws CFException {        
   		return work.getAttrLen();
	}
	
	/**
	 * 	Update AttrLen with the passed value
	 *	@param number
	 */
	public void setAttrLen(short number)  throws CFException{
		work.setAttrLen(number);
	}

	public void setAttrLen(int number)  throws CFException{
		work.setAttrLen((short)number);
	}

	public void setAttrLen(long number)  throws CFException{
		work.setAttrLen((short)number);
	}



	/**
	 *	Returns the value of elemLen
	 *	@return elemLen
	 */
	public short getElemLen() throws CFException {        
   		return work.getElemLen();
	}
	
	/**
	 * 	Update ElemLen with the passed value
	 *	@param number
	 */
	public void setElemLen(short number)  throws CFException{
		work.setElemLen(number);
	}

	public void setElemLen(int number)  throws CFException{
		work.setElemLen((short)number);
	}

	public void setElemLen(long number)  throws CFException{
		work.setElemLen((short)number);
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
	 *	Returns the value of attrNm
	 *	@return attrNm
	 */
   public char[] getAttrNm() throws CFException  {              
   		return work.getAttrNm();
   }

  
	/**
	*  set variable attrNm
	*  @param value
	**/
   public void setAttrNm(char[] value) throws CFException {
      work.setAttrNm(value);
   } 


        public Xmlpars2Ctx getXmlpars2Ctx() {
            return Xmlpars2Ctx.this;
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

    public ParseXmlOutCtx clone() {
        ParseXmlOutCtx cloneObj = new ParseXmlOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ParseXmlOutCtx getParseXmlOutCtx() {
            return new ParseXmlOutCtx();
    }
}
