package com.cloudframe.app.comput5;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.comput5.dto.WvIntPartGroup;
import com.cloudframe.app.comput5.dto.WoExposureGroup;
import com.cloudframe.app.comput5.dto.Work;
import com.cloudframe.app.comput5.dto.WtExposureTable;
import com.cloudframe.app.comput5.dto.WxExtractLine;
import com.cloudframe.app.comput5.dto.WvExposureResultsTable;
import com.cloudframe.app.comput5.dto.Ip66601UserTagInformation;
import com.cloudframe.app.comput5.dto.WpReptext;
import com.cloudframe.app.comput5.dto.Ip00485MemberEntry;
import com.cloudframe.app.comput5.dto.Ip66601UserTag;
import com.cloudframe.app.comput5.dto.Ip00485MemberEntryInfo;
import com.cloudframe.app.comput5.dto.WlilhMergTable;
import com.cloudframe.app.comput5.dto.WvNumericInputGroup;
import com.cloudframe.app.comput5.dto.WvDecPartGroup;


@Context
public class Comput5Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WxExtractLine wxExtractLine;
    WoExposureGroup woExposureGroup;
    Ip66601UserTagInformation ip66601UserTagInformation;
    Ip00485MemberEntryInfo ip00485MemberEntryInfo;
    WvExposureResultsTable wvExposureResultsTable;
    WvIntPartGroup wvIntPartGroup;
    WvDecPartGroup wvDecPartGroup;
    Work work;
    WpReptext wpReptext;
    WvNumericInputGroup wvNumericInputGroup;
    WlilhMergTable wlilhMergTable;
    WtExposureTable wtExposureTable;

    int ip00485MemberIdx;
    int ip66601UserStart;
    int ip66601UserLeft;
    int ip66601UserEnd;
    int ip66601UserP;
    int ip66601UserT;
    int ip66601UserRight;
    int ip66601UserMedian;

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


    public WxExtractLine getWxExtractLine() {
        if (wxExtractLine == null) {
            wxExtractLine = new WxExtractLine();
        }

        return wxExtractLine;
    }

    public void setWxExtractLine(WxExtractLine wxExtractLine) {
        this.wxExtractLine = wxExtractLine;
    }
    public WoExposureGroup getWoExposureGroup() {
        if (woExposureGroup == null) {
            woExposureGroup = new WoExposureGroup();
        }

        return woExposureGroup;
    }

    public void setWoExposureGroup(WoExposureGroup woExposureGroup) {
        this.woExposureGroup = woExposureGroup;
    }
    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = new Ip66601UserTagInformation();
        }

        return ip66601UserTagInformation;
    }

    public void setIp66601UserTagInformation(Ip66601UserTagInformation ip66601UserTagInformation) {
        this.ip66601UserTagInformation = ip66601UserTagInformation;
    }
    public Ip00485MemberEntryInfo getIp00485MemberEntryInfo() {
        if (ip00485MemberEntryInfo == null) {
            ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        }

        return ip00485MemberEntryInfo;
    }

    public void setIp00485MemberEntryInfo(Ip00485MemberEntryInfo ip00485MemberEntryInfo) {
        this.ip00485MemberEntryInfo = ip00485MemberEntryInfo;
    }
    public WvExposureResultsTable getWvExposureResultsTable() {
        if (wvExposureResultsTable == null) {
            wvExposureResultsTable = new WvExposureResultsTable();
        }

        return wvExposureResultsTable;
    }

    public void setWvExposureResultsTable(WvExposureResultsTable wvExposureResultsTable) {
        this.wvExposureResultsTable = wvExposureResultsTable;
    }
    public WvIntPartGroup getWvIntPartGroup() {
        if (wvIntPartGroup == null) {
            wvIntPartGroup = new WvIntPartGroup();
        }

        return wvIntPartGroup;
    }

    public void setWvIntPartGroup(WvIntPartGroup wvIntPartGroup) {
        this.wvIntPartGroup = wvIntPartGroup;
    }
    public WvDecPartGroup getWvDecPartGroup() {
        if (wvDecPartGroup == null) {
            wvDecPartGroup = new WvDecPartGroup();
        }

        return wvDecPartGroup;
    }

    public void setWvDecPartGroup(WvDecPartGroup wvDecPartGroup) {
        this.wvDecPartGroup = wvDecPartGroup;
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
    public WpReptext getWpReptext() {
        if (wpReptext == null) {
            wpReptext = new WpReptext();
        }

        return wpReptext;
    }

    public void setWpReptext(WpReptext wpReptext) {
        this.wpReptext = wpReptext;
    }
    public WvNumericInputGroup getWvNumericInputGroup() {
        if (wvNumericInputGroup == null) {
            wvNumericInputGroup = new WvNumericInputGroup();
        }

        return wvNumericInputGroup;
    }

    public void setWvNumericInputGroup(WvNumericInputGroup wvNumericInputGroup) {
        this.wvNumericInputGroup = wvNumericInputGroup;
    }
    public WlilhMergTable getWlilhMergTable() {
        if (wlilhMergTable == null) {
            wlilhMergTable = new WlilhMergTable();
        }

        return wlilhMergTable;
    }

    public void setWlilhMergTable(WlilhMergTable wlilhMergTable) {
        this.wlilhMergTable = wlilhMergTable;
    }
    public WtExposureTable getWtExposureTable() {
        if (wtExposureTable == null) {
            wtExposureTable = new WtExposureTable();
        }

        return wtExposureTable;
    }

    public void setWtExposureTable(WtExposureTable wtExposureTable) {
        this.wtExposureTable = wtExposureTable;
    }

    public int getIp00485MemberIdx() {
        return ip00485MemberIdx;
    }

    public void setIp00485MemberIdx(int ip00485MemberIdx) {
        this.ip00485MemberIdx = ip00485MemberIdx;
    }
    public int getIp66601UserStart() {
        return ip66601UserStart;
    }

    public void setIp66601UserStart(int ip66601UserStart) {
        this.ip66601UserStart = ip66601UserStart;
    }
    public int getIp66601UserLeft() {
        return ip66601UserLeft;
    }

    public void setIp66601UserLeft(int ip66601UserLeft) {
        this.ip66601UserLeft = ip66601UserLeft;
    }
    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }
    public int getIp66601UserP() {
        return ip66601UserP;
    }

    public void setIp66601UserP(int ip66601UserP) {
        this.ip66601UserP = ip66601UserP;
    }
    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getIp66601UserRight() {
        return ip66601UserRight;
    }

    public void setIp66601UserRight(int ip66601UserRight) {
        this.ip66601UserRight = ip66601UserRight;
    }
    public int getIp66601UserMedian() {
        return ip66601UserMedian;
    }

    public void setIp66601UserMedian(int ip66601UserMedian) {
        this.ip66601UserMedian = ip66601UserMedian;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wxExtractLine.hashCode();
        str += woExposureGroup.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
        str += wvExposureResultsTable.hashCode();
        str += wvIntPartGroup.hashCode();
        str += wvDecPartGroup.hashCode();
        str += work.hashCode();
        str += wpReptext.hashCode();
        str += wvNumericInputGroup.hashCode();
        str += wlilhMergTable.hashCode();
        str += wtExposureTable.hashCode();
       return str.hashCode();
    }

    public Comput5Ctx clone() {
        Comput5Ctx cloneObj = new Comput5Ctx();
        cloneObj.wxExtractLine = new WxExtractLine();
        cloneObj.wxExtractLine.set(wxExtractLine.getClonedField());
        cloneObj.woExposureGroup = new WoExposureGroup();
        cloneObj.woExposureGroup.set(woExposureGroup.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        cloneObj.wvExposureResultsTable = new WvExposureResultsTable();
        cloneObj.wvExposureResultsTable.set(wvExposureResultsTable.getClonedField());
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.wvDecPartGroup = new WvDecPartGroup();
        cloneObj.wvDecPartGroup.set(wvDecPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wpReptext = new WpReptext();
        cloneObj.wpReptext.set(wpReptext.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        cloneObj.wlilhMergTable = new WlilhMergTable();
        cloneObj.wlilhMergTable.set(wlilhMergTable.getClonedField());
        cloneObj.wtExposureTable = new WtExposureTable();
        cloneObj.wtExposureTable.set(wtExposureTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainSplit0InCtx implements Cloneable {
     Work work = Comput5Ctx.this.getWork();
     WpReptext wpReptext = Comput5Ctx.this.getWpReptext();
     WlilhMergTable wlilhMergTable = Comput5Ctx.this.getWlilhMergTable();

	/**
	 *	Returns the value of wlilhI
	 *	@return wlilhI
	 */
	public short getWlilhI() throws CFException {
   		return work.getWlilhI();
	}

    /**
	 *	Returns the String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIActualString() {
		return work.getWlilhIActualString();
	}

	/**
	 *	Returns String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIString() throws CFException {
	     return String.valueOf(work.getWlilhIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wlilhIIsNumeric()  throws CFException{
	    return work.wlilhIIsNumeric();
	}

	/**
	 * 	Update WlilhI with the passed value
	 *	@param number
	 */
	public void setWlilhI(short number)  throws CFException{
		work.setWlilhI(number);
	}
	
	public void setWlilhI(int number)  throws CFException{
	    work.setWlilhI(number);
	}
	public void setWlilhI(long number)  throws CFException{
	    work.setWlilhI(number);
	}
	

	
	/**
	 * 	Update WlilhI with the passed value
	 *	@param value (String or char[])
	 */
	public void setWlilhI(char[] value)  throws CFException {
		work.setWlilhI(value);
	}
	
	/**
	 * 	Update WlilhI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWlilhIString(char[] value)  throws CFException{
		work.setWlilhI(value);
	}	


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
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
        str += wpReptext.hashCode();
        str += wlilhMergTable.hashCode();
       return str.hashCode();
    }

    public MainSplit0InCtx clone() {
        MainSplit0InCtx cloneObj = new MainSplit0InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wpReptext = new WpReptext();
        cloneObj.wpReptext.set(wpReptext.getClonedField());
        cloneObj.wlilhMergTable = new WlilhMergTable();
        cloneObj.wlilhMergTable.set(wlilhMergTable.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0InCtx getMainSplit0InCtx() {
            return new MainSplit0InCtx();
    }
     public class MainSplit0OutCtx implements Cloneable {
     Work work = Comput5Ctx.this.getWork();
     WpReptext wpReptext = Comput5Ctx.this.getWpReptext();
     WlilhMergTable wlilhMergTable = Comput5Ctx.this.getWlilhMergTable();

	public BigDecimal getPrclfcstFnceActualsUsdA() throws CFException{      
   		return work.getPrclfcstFnceActualsUsdA();
	}

    public char[] getPrclfcstFnceActualsUsdAString() throws CFException {
          return  work.getPrclfcstFnceActualsUsdA().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclfcstFnceActualsUsdA with the passed number
	 *	@param number
	 */
	public void setPrclfcstFnceActualsUsdA(BigDecimal number)  throws CFException{
		work.setPrclfcstFnceActualsUsdA(number);
   }

	/**
	 *	Returns the value of wpSettlDate
	 *	@return wpSettlDate
	 */
   public char[] getWpSettlDate() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpSettlDate();
   }

  
	/**
	*  set variable wpSettlDate
	*  @param value
	**/
   public void setWpSettlDate(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(value);
   } 

     /**
	 * 	Update WpSettlDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSettlDate(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source, sourceIndex);
   	
   }
   
   public void setWpSettlDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpSettlDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpSettlDate with another Field
	 *	@param value
	 */
   public void setWpSettlDate(Field source) {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source);
   }  
   
     /**
	 * 	Update WpSettlDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSettlDate(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpSettlDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvSumSettlValue() throws CFException{      
   		return work.getWvSumSettlValue();
	}

    public char[] getWvSumSettlValueString() throws CFException {
          return  work.getWvSumSettlValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvSumSettlValue with the passed number
	 *	@param number
	 */
	public void setWvSumSettlValue(BigDecimal number)  throws CFException{
		work.setWvSumSettlValue(number);
   }

	public BigDecimal getWvCostValue() throws CFException{      
   		return work.getWvCostValue();
	}

    public char[] getWvCostValueString() throws CFException {
          return  work.getWvCostValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvCostValue with the passed number
	 *	@param number
	 */
	public void setWvCostValue(BigDecimal number)  throws CFException{
		work.setWvCostValue(number);
   }

	/**
	 *	Returns the value of wpParcel
	 *	@return wpParcel
	 */
   public char[] getWpParcel() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpParcel();
   }

  
	/**
	*  set variable wpParcel
	*  @param value
	**/
   public void setWpParcel(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpParcel(value);
   } 

     /**
	 * 	Update WpParcel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpParcel(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpParcel(source, sourceIndex);
   	
   }
   
   public void setWpParcel(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpParcel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpParcel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpParcel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpParcel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpParcel with another Field
	 *	@param value
	 */
   public void setWpParcel(Field source) {
      wpReptext.getWpReptextPrintLine().setWpParcel(source);
   }  
   
     /**
	 * 	Update WpParcel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpParcel(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpParcel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpParcel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpParcel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpParcel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wpReptext
	 *	@return wpReptext
	 */   
	 public WpReptext getWpReptext() {
   	return wpReptext;
   }


	public BigDecimal getWlilhPrvRt() throws CFException{      
   		return work.getWlilhPrvRt();
	}

    public char[] getWlilhPrvRtString() throws CFException {
          return  work.getWlilhPrvRt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WlilhPrvRt with the passed number
	 *	@param number
	 */
	public void setWlilhPrvRt(BigDecimal number)  throws CFException{
		work.setWlilhPrvRt(number);
   }

	public BigDecimal getW6530PvIntPmtAmt() throws CFException{      
   		return work.getW6530PvIntPmtAmt();
	}

    public char[] getW6530PvIntPmtAmtString() throws CFException {
          return  work.getW6530PvIntPmtAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W6530PvIntPmtAmt with the passed number
	 *	@param number
	 */
	public void setW6530PvIntPmtAmt(BigDecimal number)  throws CFException{
		work.setW6530PvIntPmtAmt(number);
   }

	/**
	 *	Test condition "1" for isWlilhMrTblPay()
	 *	@return  Returns true if isWlilhMrTblPay() is "1"
	 */
   public boolean isWlilhMrTblPay(int index) throws CFException {
      return wlilhMergTable.getWlilhMrTbl(index).isWlilhMrTblPay();
   }

	/**
	*  set values "1"
	*/
   	public void setWlilhMrTblPayTrue(int index)  throws CFException{  			
    	wlilhMergTable.getWlilhMrTbl(index).setWlilhMrTblPayTrue();
   	}
	/**
	 *	Returns the value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public int getAxisWpCoiRound() throws CFException {
   		return work.getAxisWpCoiRound();
	}

    /**
	 *	Returns the String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundActualString() {
		return work.getAxisWpCoiRoundActualString();
	}

	/**
	 *	Returns String value of axisWpCoiRound
	 *	@return axisWpCoiRound
	 */
	public char[]  getAxisWpCoiRoundString() throws CFException {
	     return String.valueOf(work.getAxisWpCoiRoundString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean axisWpCoiRoundIsNumeric()  throws CFException{
	    return work.axisWpCoiRoundIsNumeric();
	}

	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param number
	 */
	public void setAxisWpCoiRound(int number)  throws CFException{
		work.setAxisWpCoiRound(number);
	}
	

	public void setAxisWpCoiRound(long number)  throws CFException{
	    work.setAxisWpCoiRound(number);
	}
	
	
	/**
	 * 	Update AxisWpCoiRound with the passed value
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRound(char[] value)  throws CFException {
		work.setAxisWpCoiRound(value);
	}
	
	/**
	 * 	Update AxisWpCoiRound with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAxisWpCoiRoundString(char[] value)  throws CFException{
		work.setAxisWpCoiRound(value);
	}	

	public BigDecimal getW6530CfIntRt() throws CFException{      
   		return work.getW6530CfIntRt();
	}

    public char[] getW6530CfIntRtString() throws CFException {
          return  work.getW6530CfIntRt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W6530CfIntRt with the passed number
	 *	@param number
	 */
	public void setW6530CfIntRt(BigDecimal number)  throws CFException{
		work.setW6530CfIntRt(number);
   }

	/**
	 *	Returns the value of w6530PvIntPmtAmtDis
	 *	@return w6530PvIntPmtAmtDis
	 */
   public char[] getW6530PvIntPmtAmtDis() throws CFException  {              
   		return work.getW6530PvIntPmtAmtDis();
   }

  
	/**
	*  set variable w6530PvIntPmtAmtDis
	*  @param value
	**/
   public void setW6530PvIntPmtAmtDis(char[] value) throws CFException {
      work.setW6530PvIntPmtAmtDis(value);
   } 

     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex) throws CFException {
      work.setW6530PvIntPmtAmtDis(source, sourceIndex);
   	
   }
   
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setW6530PvIntPmtAmtDis(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setW6530PvIntPmtAmtDis(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update W6530PvIntPmtAmtDis with another Field
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source) {
      work.setW6530PvIntPmtAmtDis(source);
   }  
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source, int sourceIndex,int sourceLen) {
      work.setW6530PvIntPmtAmtDis(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update W6530PvIntPmtAmtDis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvIntPmtAmtDis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setW6530PvIntPmtAmtDis(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wpClient
	 *	@return wpClient
	 */
   public char[] getWpClient() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpClient();
   }

  
	/**
	*  set variable wpClient
	*  @param value
	**/
   public void setWpClient(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpClient(value);
   } 

     /**
	 * 	Update WpClient 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpClient(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpClient(source, sourceIndex);
   	
   }
   
   public void setWpClient(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpClient(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpClient 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpClient(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpClient(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpClient with another Field
	 *	@param value
	 */
   public void setWpClient(Field source) {
      wpReptext.getWpReptextPrintLine().setWpClient(source);
   }  
   
     /**
	 * 	Update WpClient 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpClient(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpClient(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpClient 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpClient(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpClient(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWlilhAccLoanAndIntAmt() throws CFException{      
   		return work.getWlilhAccLoanAndIntAmt();
	}

    public char[] getWlilhAccLoanAndIntAmtString() throws CFException {
          return  work.getWlilhAccLoanAndIntAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WlilhAccLoanAndIntAmt with the passed number
	 *	@param number
	 */
	public void setWlilhAccLoanAndIntAmt(BigDecimal number)  throws CFException{
		work.setWlilhAccLoanAndIntAmt(number);
   }

	public BigDecimal getW6530MktvalIntRt() throws CFException{      
   		return work.getW6530MktvalIntRt();
	}

    public char[] getW6530MktvalIntRtString() throws CFException {
          return  work.getW6530MktvalIntRt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W6530MktvalIntRt with the passed number
	 *	@param number
	 */
	public void setW6530MktvalIntRt(BigDecimal number)  throws CFException{
		work.setW6530MktvalIntRt(number);
   }

	/**
	 *	Returns the value of wlilhI
	 *	@return wlilhI
	 */
	public short getWlilhI() throws CFException {
   		return work.getWlilhI();
	}

    /**
	 *	Returns the String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIActualString() {
		return work.getWlilhIActualString();
	}

	/**
	 *	Returns String value of wlilhI
	 *	@return wlilhI
	 */
	public char[]  getWlilhIString() throws CFException {
	     return String.valueOf(work.getWlilhIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wlilhIIsNumeric()  throws CFException{
	    return work.wlilhIIsNumeric();
	}

	/**
	 * 	Update WlilhI with the passed value
	 *	@param number
	 */
	public void setWlilhI(short number)  throws CFException{
		work.setWlilhI(number);
	}
	
	public void setWlilhI(int number)  throws CFException{
	    work.setWlilhI(number);
	}
	public void setWlilhI(long number)  throws CFException{
	    work.setWlilhI(number);
	}
	

	
	/**
	 * 	Update WlilhI with the passed value
	 *	@param value (String or char[])
	 */
	public void setWlilhI(char[] value)  throws CFException {
		work.setWlilhI(value);
	}
	
	/**
	 * 	Update WlilhI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWlilhIString(char[] value)  throws CFException{
		work.setWlilhI(value);
	}	

	public BigDecimal getWlilhAccLoanAmt() throws CFException{      
   		return work.getWlilhAccLoanAmt();
	}

    public char[] getWlilhAccLoanAmtString() throws CFException {
          return  work.getWlilhAccLoanAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WlilhAccLoanAmt with the passed number
	 *	@param number
	 */
	public void setWlilhAccLoanAmt(BigDecimal number)  throws CFException{
		work.setWlilhAccLoanAmt(number);
   }

public int getW6530MktvalAdjYears() throws CFException {  
        return work.getW6530MktvalAdjYears();
}
	/**
	 * 	Update W6530MktvalAdjYears with the passed value
	 *	@param number
	 */
	public void setW6530MktvalAdjYears(int number)  throws CFException{
		work.setW6530MktvalAdjYears(number);
	}


	public void setW6530MktvalAdjYears(long number)  throws CFException{
	    work.setW6530MktvalAdjYears(number);
	}
	

	/**
	 *	Returns the value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public BigDecimal getAxisWpCoiAccum() throws CFException {
   		return work.getAxisWpCoiAccum();
	}

    /**
	 *	Returns the String value of axisWpCoiAccum
	 *	@return axisWpCoiAccum
	 */
	public char[]  getAxisWpCoiAccumActualString()  throws CFException{
	    return work.getAxisWpCoiAccumActualString();
	}

	 /**
     *	Returns String value of axisWpCoiAccum
     *	@return axisWpCoiAccum
     */
    public char[]  getAxisWpCoiAccumString() throws CFException {
         return work.getAxisWpCoiAccumString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean axisWpCoiAccumIsNumeric() {
        return work.axisWpCoiAccumIsNumeric();
    }
	/**
	 * 	Update AxisWpCoiAccum with the passed number
	 *	@param number
	 */
	public void setAxisWpCoiAccum(BigDecimal number)  throws CFException{
		work.setAxisWpCoiAccum(number);
   }

	/**
	 * 	Update AxisWpCoiAccum with the passed value
	 *	@param value (String or char[]);
	 */
	public void setAxisWpCoiAccum(char[] value)  throws CFException{
		work.setAxisWpCoiAccum(value);
	}   

	/**
	 *	Returns the value of w6530PvMatPmtAmtDis
	 *	@return w6530PvMatPmtAmtDis
	 */
   public char[] getW6530PvMatPmtAmtDis() throws CFException  {              
   		return work.getW6530PvMatPmtAmtDis();
   }

  
	/**
	*  set variable w6530PvMatPmtAmtDis
	*  @param value
	**/
   public void setW6530PvMatPmtAmtDis(char[] value) throws CFException {
      work.setW6530PvMatPmtAmtDis(value);
   } 

     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex) throws CFException {
      work.setW6530PvMatPmtAmtDis(source, sourceIndex);
   	
   }
   
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setW6530PvMatPmtAmtDis(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setW6530PvMatPmtAmtDis(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update W6530PvMatPmtAmtDis with another Field
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source) {
      work.setW6530PvMatPmtAmtDis(source);
   }  
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source, int sourceIndex,int sourceLen) {
      work.setW6530PvMatPmtAmtDis(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update W6530PvMatPmtAmtDis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW6530PvMatPmtAmtDis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setW6530PvMatPmtAmtDis(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of axisWpCoiRoundDisp
	 *	@return axisWpCoiRoundDisp
	 */
   public char[] getAxisWpCoiRoundDisp() throws CFException  {              
   		return work.getAxisWpCoiRoundDisp();
   }

  
	/**
	*  set variable axisWpCoiRoundDisp
	*  @param value
	**/
   public void setAxisWpCoiRoundDisp(char[] value) throws CFException {
      work.setAxisWpCoiRoundDisp(value);
   } 

     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex) throws CFException {
      work.setAxisWpCoiRoundDisp(source, sourceIndex);
   	
   }
   
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AxisWpCoiRoundDisp with another Field
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source) {
      work.setAxisWpCoiRoundDisp(source);
   }  
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AxisWpCoiRoundDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAxisWpCoiRoundDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAxisWpCoiRoundDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getW6530PvMatPmtAmt() throws CFException{      
   		return work.getW6530PvMatPmtAmt();
	}

    public char[] getW6530PvMatPmtAmtString() throws CFException {
          return  work.getW6530PvMatPmtAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W6530PvMatPmtAmt with the passed number
	 *	@param number
	 */
	public void setW6530PvMatPmtAmt(BigDecimal number)  throws CFException{
		work.setW6530PvMatPmtAmt(number);
   }

	public BigDecimal getW6530CfAdjustedAmt() throws CFException{      
   		return work.getW6530CfAdjustedAmt();
	}

    public char[] getW6530CfAdjustedAmtString() throws CFException {
          return  work.getW6530CfAdjustedAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W6530CfAdjustedAmt with the passed number
	 *	@param number
	 */
	public void setW6530CfAdjustedAmt(BigDecimal number)  throws CFException{
		work.setW6530CfAdjustedAmt(number);
   }

	public BigDecimal getWlilhMrTblLoanAmt(int index) throws CFException{      
   		return wlilhMergTable.getWlilhMrTbl(index).getWlilhMrTblLoanAmt();
	}

    public char[] getWlilhMrTblLoanAmtString(int index) throws CFException {
          return  wlilhMergTable.getWlilhMrTbl(index).getWlilhMrTblLoanAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WlilhMrTblLoanAmt with the passed number
	 *	@param number
	 */
	public void setWlilhMrTblLoanAmt(int index,BigDecimal number)  throws CFException{
		wlilhMergTable.getWlilhMrTbl(index).setWlilhMrTblLoanAmt(number);
   }

	public BigDecimal getWvSumDexValue() throws CFException{      
   		return work.getWvSumDexValue();
	}

    public char[] getWvSumDexValueString() throws CFException {
          return  work.getWvSumDexValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvSumDexValue with the passed number
	 *	@param number
	 */
	public void setWvSumDexValue(BigDecimal number)  throws CFException{
		work.setWvSumDexValue(number);
   }

public int getL1680TotalDays() throws CFException {  
        return work.getL1680TotalDays();
}
	/**
	 * 	Update L1680TotalDays with the passed value
	 *	@param number
	 */
	public void setL1680TotalDays(int number)  throws CFException{
		work.setL1680TotalDays(number);
	}


	public void setL1680TotalDays(long number)  throws CFException{
	    work.setL1680TotalDays(number);
	}
	

	public BigDecimal getPrclcstLatestCostValue() throws CFException{      
   		return work.getPrclcstLatestCostValue();
	}

    public char[] getPrclcstLatestCostValueString() throws CFException {
          return  work.getPrclcstLatestCostValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclcstLatestCostValue with the passed number
	 *	@param number
	 */
	public void setPrclcstLatestCostValue(BigDecimal number)  throws CFException{
		work.setPrclcstLatestCostValue(number);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
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
        str += wpReptext.hashCode();
        str += wlilhMergTable.hashCode();
       return str.hashCode();
    }

    public MainSplit0OutCtx clone() {
        MainSplit0OutCtx cloneObj = new MainSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wpReptext = new WpReptext();
        cloneObj.wpReptext.set(wpReptext.getClonedField());
        cloneObj.wlilhMergTable = new WlilhMergTable();
        cloneObj.wlilhMergTable.set(wlilhMergTable.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
    }
     public class MainSplit1InCtx implements Cloneable {
     WxExtractLine wxExtractLine = Comput5Ctx.this.getWxExtractLine();
     Work work = Comput5Ctx.this.getWork();
     WpReptext wpReptext = Comput5Ctx.this.getWpReptext();

	public BigDecimal getPrclfcstFnceActualsUsdA() throws CFException{      
   		return work.getPrclfcstFnceActualsUsdA();
	}

    public char[] getPrclfcstFnceActualsUsdAString() throws CFException {
          return  work.getPrclfcstFnceActualsUsdA().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclfcstFnceActualsUsdA with the passed number
	 *	@param number
	 */
	public void setPrclfcstFnceActualsUsdA(BigDecimal number)  throws CFException{
		work.setPrclfcstFnceActualsUsdA(number);
   }

	/**
	 *	Returns the value of wxExtractLine
	 *	@return wxExtractLine
	 */   
	 public WxExtractLine getWxExtractLine() {
   	return wxExtractLine;
   }


	public BigDecimal getWvSumSettlValue() throws CFException{      
   		return work.getWvSumSettlValue();
	}

    public char[] getWvSumSettlValueString() throws CFException {
          return  work.getWvSumSettlValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvSumSettlValue with the passed number
	 *	@param number
	 */
	public void setWvSumSettlValue(BigDecimal number)  throws CFException{
		work.setWvSumSettlValue(number);
   }

	public BigDecimal getWvCostValue() throws CFException{      
   		return work.getWvCostValue();
	}

    public char[] getWvCostValueString() throws CFException {
          return  work.getWvCostValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvCostValue with the passed number
	 *	@param number
	 */
	public void setWvCostValue(BigDecimal number)  throws CFException{
		work.setWvCostValue(number);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit1OutCtx getMainSplit1OutCtx() {
            return new MainSplit1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wxExtractLine.hashCode();
        str += work.hashCode();
        str += wpReptext.hashCode();
       return str.hashCode();
    }

    public MainSplit1InCtx clone() {
        MainSplit1InCtx cloneObj = new MainSplit1InCtx();
        cloneObj.wxExtractLine = new WxExtractLine();
        cloneObj.wxExtractLine.set(wxExtractLine.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wpReptext = new WpReptext();
        cloneObj.wpReptext.set(wpReptext.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1InCtx getMainSplit1InCtx() {
            return new MainSplit1InCtx();
    }
     public class MainSplit1OutCtx implements Cloneable {
     WxExtractLine wxExtractLine = Comput5Ctx.this.getWxExtractLine();
     Work work = Comput5Ctx.this.getWork();
     WpReptext wpReptext = Comput5Ctx.this.getWpReptext();

	public BigDecimal getWvSumSettlValue() throws CFException{      
   		return work.getWvSumSettlValue();
	}

    public char[] getWvSumSettlValueString() throws CFException {
          return  work.getWvSumSettlValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvSumSettlValue with the passed number
	 *	@param number
	 */
	public void setWvSumSettlValue(BigDecimal number)  throws CFException{
		work.setWvSumSettlValue(number);
   }

	/**
	 *	Returns the value of wxDealGroupDesc
	 *	@return wxDealGroupDesc
	 */
   public char[] getWxDealGroupDesc() throws CFException  {              
   		return wxExtractLine.getWxDealGroupDesc();
   }

  
	/**
	*  set variable wxDealGroupDesc
	*  @param value
	**/
   public void setWxDealGroupDesc(char[] value) throws CFException {
      wxExtractLine.setWxDealGroupDesc(value);
   } 

     /**
	 * 	Update WxDealGroupDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxDealGroupDesc(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxDealGroupDesc(source, sourceIndex);
   	
   }
   
   public void setWxDealGroupDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxDealGroupDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroupDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxDealGroupDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxDealGroupDesc with another Field
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source) {
      wxExtractLine.setWxDealGroupDesc(source);
   }  
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxDealGroupDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxDealGroupDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getDealgpalAllocWgtnNum() throws CFException{      
   		return work.getDealgpalAllocWgtnNum();
	}

    public char[] getDealgpalAllocWgtnNumString() throws CFException {
          return  work.getDealgpalAllocWgtnNum().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number)  throws CFException{
		work.setDealgpalAllocWgtnNum(number);
   }

	/**
	 *	Returns the value of wpSettlValue
	 *	@return wpSettlValue
	 */
   public char[] getWpSettlValue() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpSettlValue();
   }

  
	/**
	*  set variable wpSettlValue
	*  @param value
	**/
   public void setWpSettlValue(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(value);
   } 

     /**
	 * 	Update WpSettlValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSettlValue(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source, sourceIndex);
   	
   }
   
   public void setWpSettlValue(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpSettlValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpSettlValue with another Field
	 *	@param value
	 */
   public void setWpSettlValue(Field source) {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source);
   }  
   
     /**
	 * 	Update WpSettlValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSettlValue(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpSettlValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSettlValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSettlValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxBlDate
	 *	@return wxBlDate
	 */
   public char[] getWxBlDate() throws CFException  {              
   		return wxExtractLine.getWxBlDate();
   }

  
	/**
	*  set variable wxBlDate
	*  @param value
	**/
   public void setWxBlDate(char[] value) throws CFException {
      wxExtractLine.setWxBlDate(value);
   } 

     /**
	 * 	Update WxBlDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBlDate(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxBlDate(source, sourceIndex);
   	
   }
   
   public void setWxBlDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxBlDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxBlDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBlDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBlDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxBlDate with another Field
	 *	@param value
	 */
   public void setWxBlDate(Field source) {
      wxExtractLine.setWxBlDate(source);
   }  
   
     /**
	 * 	Update WxBlDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBlDate(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxBlDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxBlDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBlDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBlDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvDBblVol() throws CFException{      
   		return work.getWvDBblVol();
	}

    public char[] getWvDBblVolString() throws CFException {
          return  work.getWvDBblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDBblVol with the passed number
	 *	@param number
	 */
	public void setWvDBblVol(BigDecimal number)  throws CFException{
		work.setWvDBblVol(number);
   }

	public BigDecimal getWvDQty() throws CFException{      
   		return work.getWvDQty();
	}

    public char[] getWvDQtyString() throws CFException {
          return  work.getWvDQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDQty with the passed number
	 *	@param number
	 */
	public void setWvDQty(BigDecimal number)  throws CFException{
		work.setWvDQty(number);
   }

	/**
	 *	Returns the value of wxTradingAcct
	 *	@return wxTradingAcct
	 */
   public char[] getWxTradingAcct() throws CFException  {              
   		return wxExtractLine.getWxTradingAcct();
   }

  
	/**
	*  set variable wxTradingAcct
	*  @param value
	**/
   public void setWxTradingAcct(char[] value) throws CFException {
      wxExtractLine.setWxTradingAcct(value);
   } 

     /**
	 * 	Update WxTradingAcct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxTradingAcct(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxTradingAcct(source, sourceIndex);
   	
   }
   
   public void setWxTradingAcct(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxTradingAcct(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxTradingAcct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxTradingAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxTradingAcct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxTradingAcct with another Field
	 *	@param value
	 */
   public void setWxTradingAcct(Field source) {
      wxExtractLine.setWxTradingAcct(source);
   }  
   
     /**
	 * 	Update WxTradingAcct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxTradingAcct(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxTradingAcct(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxTradingAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxTradingAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxTradingAcct(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxProfitGroupDesc
	 *	@return wxProfitGroupDesc
	 */
   public char[] getWxProfitGroupDesc() throws CFException  {              
   		return wxExtractLine.getWxProfitGroupDesc();
   }

  
	/**
	*  set variable wxProfitGroupDesc
	*  @param value
	**/
   public void setWxProfitGroupDesc(char[] value) throws CFException {
      wxExtractLine.setWxProfitGroupDesc(value);
   } 

     /**
	 * 	Update WxProfitGroupDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxProfitGroupDesc(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxProfitGroupDesc(source, sourceIndex);
   	
   }
   
   public void setWxProfitGroupDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxProfitGroupDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroupDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxProfitGroupDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxProfitGroupDesc with another Field
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source) {
      wxExtractLine.setWxProfitGroupDesc(source);
   }  
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxProfitGroupDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxProfitGroupDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxPrclQty
	 *	@return wxPrclQty
	 */
   public char[] getWxPrclQty() throws CFException  {              
   		return wxExtractLine.getWxPrclQty();
   }

  
	/**
	*  set variable wxPrclQty
	*  @param value
	**/
   public void setWxPrclQty(char[] value) throws CFException {
      wxExtractLine.setWxPrclQty(value);
   } 

     /**
	 * 	Update WxPrclQty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPrclQty(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxPrclQty(source, sourceIndex);
   	
   }
   
   public void setWxPrclQty(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxPrclQty(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxPrclQty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclQty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPrclQty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxPrclQty with another Field
	 *	@param value
	 */
   public void setWxPrclQty(Field source) {
      wxExtractLine.setWxPrclQty(source);
   }  
   
     /**
	 * 	Update WxPrclQty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPrclQty(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxPrclQty(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxPrclQty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclQty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPrclQty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxPremium
	 *	@return wxPremium
	 */
   public char[] getWxPremium() throws CFException  {              
   		return wxExtractLine.getWxPremium();
   }

  
	/**
	*  set variable wxPremium
	*  @param value
	**/
   public void setWxPremium(char[] value) throws CFException {
      wxExtractLine.setWxPremium(value);
   } 

     /**
	 * 	Update WxPremium 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPremium(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxPremium(source, sourceIndex);
   	
   }
   
   public void setWxPremium(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxPremium(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxPremium 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPremium(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPremium(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxPremium with another Field
	 *	@param value
	 */
   public void setWxPremium(Field source) {
      wxExtractLine.setWxPremium(source);
   }  
   
     /**
	 * 	Update WxPremium 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPremium(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxPremium(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxPremium 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPremium(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPremium(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxAmount
	 *	@return wxAmount
	 */
   public char[] getWxAmount() throws CFException  {              
   		return wxExtractLine.getWxAmount();
   }

  
	/**
	*  set variable wxAmount
	*  @param value
	**/
   public void setWxAmount(char[] value) throws CFException {
      wxExtractLine.setWxAmount(value);
   } 

     /**
	 * 	Update WxAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxAmount(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxAmount(source, sourceIndex);
   	
   }
   
   public void setWxAmount(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxAmount(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxAmount(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxAmount with another Field
	 *	@param value
	 */
   public void setWxAmount(Field source) {
      wxExtractLine.setWxAmount(source);
   }  
   
     /**
	 * 	Update WxAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxAmount(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxAmount(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxAmount(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxClient
	 *	@return wxClient
	 */
   public char[] getWxClient() throws CFException  {              
   		return wxExtractLine.getWxClient();
   }

  
	/**
	*  set variable wxClient
	*  @param value
	**/
   public void setWxClient(char[] value) throws CFException {
      wxExtractLine.setWxClient(value);
   } 

     /**
	 * 	Update WxClient 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxClient(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxClient(source, sourceIndex);
   	
   }
   
   public void setWxClient(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxClient(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxClient 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxClient(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxClient(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxClient with another Field
	 *	@param value
	 */
   public void setWxClient(Field source) {
      wxExtractLine.setWxClient(source);
   }  
   
     /**
	 * 	Update WxClient 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxClient(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxClient(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxClient 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxClient(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxClient(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public BigDecimal getWvPrtQuantity() throws CFException {
   		return work.getWvPrtQuantity();
	}

    /**
	 *	Returns the String value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public char[]  getWvPrtQuantityActualString()  throws CFException{
	    return work.getWvPrtQuantityActualString();
	}

	 /**
     *	Returns String value of wvPrtQuantity
     *	@return wvPrtQuantity
     */
    public char[]  getWvPrtQuantityString() throws CFException {
         return work.getWvPrtQuantityString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvPrtQuantityIsNumeric() {
        return work.wvPrtQuantityIsNumeric();
    }
	/**
	 * 	Update WvPrtQuantity with the passed number
	 *	@param number
	 */
	public void setWvPrtQuantity(BigDecimal number)  throws CFException{
		work.setWvPrtQuantity(number);
   }

	/**
	 * 	Update WvPrtQuantity with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvPrtQuantity(char[] value)  throws CFException{
		work.setWvPrtQuantity(value);
	}   

	/**
	 *	Returns the value of wxGrade
	 *	@return wxGrade
	 */
   public char[] getWxGrade() throws CFException  {              
   		return wxExtractLine.getWxGrade();
   }

  
	/**
	*  set variable wxGrade
	*  @param value
	**/
   public void setWxGrade(char[] value) throws CFException {
      wxExtractLine.setWxGrade(value);
   } 

     /**
	 * 	Update WxGrade 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxGrade(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxGrade(source, sourceIndex);
   	
   }
   
   public void setWxGrade(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxGrade(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxGrade 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxGrade(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxGrade(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxGrade with another Field
	 *	@param value
	 */
   public void setWxGrade(Field source) {
      wxExtractLine.setWxGrade(source);
   }  
   
     /**
	 * 	Update WxGrade 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxGrade(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxGrade(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxGrade 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxGrade(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxGrade(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxBuySellInd
	 *	@return wxBuySellInd
	 */
   public char[] getWxBuySellInd() throws CFException  {              
   		return wxExtractLine.getWxBuySellInd();
   }

  
	/**
	*  set variable wxBuySellInd
	*  @param value
	**/
   public void setWxBuySellInd(char[] value) throws CFException {
      wxExtractLine.setWxBuySellInd(value);
   } 

     /**
	 * 	Update WxBuySellInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBuySellInd(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxBuySellInd(source, sourceIndex);
   	
   }
   
   public void setWxBuySellInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxBuySellInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxBuySellInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBuySellInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxBuySellInd with another Field
	 *	@param value
	 */
   public void setWxBuySellInd(Field source) {
      wxExtractLine.setWxBuySellInd(source);
   }  
   
     /**
	 * 	Update WxBuySellInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBuySellInd(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxBuySellInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxBuySellInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBuySellInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wpOperator
	 *	@return wpOperator
	 */
   public char[] getWpOperator() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpOperator();
   }

  
	/**
	*  set variable wpOperator
	*  @param value
	**/
   public void setWpOperator(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpOperator(value);
   } 

     /**
	 * 	Update WpOperator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpOperator(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpOperator(source, sourceIndex);
   	
   }
   
   public void setWpOperator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpOperator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpOperator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpOperator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpOperator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpOperator with another Field
	 *	@param value
	 */
   public void setWpOperator(Field source) {
      wpReptext.getWpReptextPrintLine().setWpOperator(source);
   }  
   
     /**
	 * 	Update WpOperator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpOperator(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpOperator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpOperator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpOperator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpOperator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxPrclPrice
	 *	@return wxPrclPrice
	 */
   public char[] getWxPrclPrice() throws CFException  {              
   		return wxExtractLine.getWxPrclPrice();
   }

  
	/**
	*  set variable wxPrclPrice
	*  @param value
	**/
   public void setWxPrclPrice(char[] value) throws CFException {
      wxExtractLine.setWxPrclPrice(value);
   } 

     /**
	 * 	Update WxPrclPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPrclPrice(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxPrclPrice(source, sourceIndex);
   	
   }
   
   public void setWxPrclPrice(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxPrclPrice(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxPrclPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPrclPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxPrclPrice with another Field
	 *	@param value
	 */
   public void setWxPrclPrice(Field source) {
      wxExtractLine.setWxPrclPrice(source);
   }  
   
     /**
	 * 	Update WxPrclPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPrclPrice(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxPrclPrice(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxPrclPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPrclPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getParcelBblVol() throws CFException{      
   		return work.getParcelBblVol();
	}

    public char[] getParcelBblVolString() throws CFException {
          return  work.getParcelBblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ParcelBblVol with the passed number
	 *	@param number
	 */
	public void setParcelBblVol(BigDecimal number)  throws CFException{
		work.setParcelBblVol(number);
   }

	/**
	 *	Returns the value of wxParcelKey
	 *	@return wxParcelKey
	 */
   public char[] getWxParcelKey() throws CFException  {              
   		return wxExtractLine.getWxParcelKey();
   }

  
	/**
	*  set variable wxParcelKey
	*  @param value
	**/
   public void setWxParcelKey(char[] value) throws CFException {
      wxExtractLine.setWxParcelKey(value);
   } 

     /**
	 * 	Update WxParcelKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxParcelKey(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxParcelKey(source, sourceIndex);
   	
   }
   
   public void setWxParcelKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxParcelKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxParcelKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxParcelKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxParcelKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxParcelKey with another Field
	 *	@param value
	 */
   public void setWxParcelKey(Field source) {
      wxExtractLine.setWxParcelKey(source);
   }  
   
     /**
	 * 	Update WxParcelKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxParcelKey(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxParcelKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxParcelKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxParcelKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxParcelKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wpSetlRef
	 *	@return wpSetlRef
	 */
   public char[] getWpSetlRef() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpSetlRef();
   }

  
	/**
	*  set variable wpSetlRef
	*  @param value
	**/
   public void setWpSetlRef(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(value);
   } 

     /**
	 * 	Update WpSetlRef 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpSetlRef(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source, sourceIndex);
   	
   }
   
   public void setWpSetlRef(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpSetlRef 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpSetlRef(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpSetlRef with another Field
	 *	@param value
	 */
   public void setWpSetlRef(Field source) {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source);
   }  
   
     /**
	 * 	Update WpSetlRef 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpSetlRef(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpSetlRef 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpSetlRef(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpSetlRef(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxProfitGroup
	 *	@return wxProfitGroup
	 */
   public char[] getWxProfitGroup() throws CFException  {              
   		return wxExtractLine.getWxProfitGroup();
   }

  
	/**
	*  set variable wxProfitGroup
	*  @param value
	**/
   public void setWxProfitGroup(char[] value) throws CFException {
      wxExtractLine.setWxProfitGroup(value);
   } 

     /**
	 * 	Update WxProfitGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxProfitGroup(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxProfitGroup(source, sourceIndex);
   	
   }
   
   public void setWxProfitGroup(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxProfitGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxProfitGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxProfitGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxProfitGroup with another Field
	 *	@param value
	 */
   public void setWxProfitGroup(Field source) {
      wxExtractLine.setWxProfitGroup(source);
   }  
   
     /**
	 * 	Update WxProfitGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxProfitGroup(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxProfitGroup(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxProfitGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxProfitGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxClass
	 *	@return wxClass
	 */
   public char[] getWxClass() throws CFException  {              
   		return wxExtractLine.getWxClass();
   }

  
	/**
	*  set variable wxClass
	*  @param value
	**/
   public void setWxClass(char[] value) throws CFException {
      wxExtractLine.setWxClass(value);
   } 

     /**
	 * 	Update WxClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxClass(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxClass(source, sourceIndex);
   	
   }
   
   public void setWxClass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxClass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxClass with another Field
	 *	@param value
	 */
   public void setWxClass(Field source) {
      wxExtractLine.setWxClass(source);
   }  
   
     /**
	 * 	Update WxClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxClass(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxClass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxM2mPrice
	 *	@return wxM2mPrice
	 */
   public char[] getWxM2mPrice() throws CFException  {              
   		return wxExtractLine.getWxM2mPrice();
   }

  
	/**
	*  set variable wxM2mPrice
	*  @param value
	**/
   public void setWxM2mPrice(char[] value) throws CFException {
      wxExtractLine.setWxM2mPrice(value);
   } 

     /**
	 * 	Update WxM2mPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxM2mPrice(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxM2mPrice(source, sourceIndex);
   	
   }
   
   public void setWxM2mPrice(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxM2mPrice(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxM2mPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxM2mPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxM2mPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxM2mPrice with another Field
	 *	@param value
	 */
   public void setWxM2mPrice(Field source) {
      wxExtractLine.setWxM2mPrice(source);
   }  
   
     /**
	 * 	Update WxM2mPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxM2mPrice(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxM2mPrice(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxM2mPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxM2mPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxM2mPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxPricedPrice
	 *	@return wxPricedPrice
	 */
   public char[] getWxPricedPrice() throws CFException  {              
   		return wxExtractLine.getWxPricedPrice();
   }

  
	/**
	*  set variable wxPricedPrice
	*  @param value
	**/
   public void setWxPricedPrice(char[] value) throws CFException {
      wxExtractLine.setWxPricedPrice(value);
   } 

     /**
	 * 	Update WxPricedPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPricedPrice(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxPricedPrice(source, sourceIndex);
   	
   }
   
   public void setWxPricedPrice(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxPricedPrice(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxPricedPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPricedPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPricedPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxPricedPrice with another Field
	 *	@param value
	 */
   public void setWxPricedPrice(Field source) {
      wxExtractLine.setWxPricedPrice(source);
   }  
   
     /**
	 * 	Update WxPricedPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPricedPrice(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxPricedPrice(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxPricedPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPricedPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxPricedPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvDMtAmt() throws CFException{      
   		return work.getWvDMtAmt();
	}

    public char[] getWvDMtAmtString() throws CFException {
          return  work.getWvDMtAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDMtAmt with the passed number
	 *	@param number
	 */
	public void setWvDMtAmt(BigDecimal number)  throws CFException{
		work.setWvDMtAmt(number);
   }

	public BigDecimal getWvEffWeightPc() throws CFException{      
   		return work.getWvEffWeightPc();
	}

    public char[] getWvEffWeightPcString() throws CFException {
          return  work.getWvEffWeightPc().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvEffWeightPc with the passed number
	 *	@param number
	 */
	public void setWvEffWeightPc(BigDecimal number)  throws CFException{
		work.setWvEffWeightPc(number);
   }

	/**
	 *	Returns the value of wxBblVol
	 *	@return wxBblVol
	 */
   public char[] getWxBblVol() throws CFException  {              
   		return wxExtractLine.getWxBblVol();
   }

  
	/**
	*  set variable wxBblVol
	*  @param value
	**/
   public void setWxBblVol(char[] value) throws CFException {
      wxExtractLine.setWxBblVol(value);
   } 

     /**
	 * 	Update WxBblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBblVol(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxBblVol(source, sourceIndex);
   	
   }
   
   public void setWxBblVol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxBblVol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxBblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxBblVol with another Field
	 *	@param value
	 */
   public void setWxBblVol(Field source) {
      wxExtractLine.setWxBblVol(source);
   }  
   
     /**
	 * 	Update WxBblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBblVol(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxBblVol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxBblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxBblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxQtyPriced
	 *	@return wxQtyPriced
	 */
   public char[] getWxQtyPriced() throws CFException  {              
   		return wxExtractLine.getWxQtyPriced();
   }

  
	/**
	*  set variable wxQtyPriced
	*  @param value
	**/
   public void setWxQtyPriced(char[] value) throws CFException {
      wxExtractLine.setWxQtyPriced(value);
   } 

     /**
	 * 	Update WxQtyPriced 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxQtyPriced(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxQtyPriced(source, sourceIndex);
   	
   }
   
   public void setWxQtyPriced(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxQtyPriced(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxQtyPriced 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxQtyPriced(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxQtyPriced(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxQtyPriced with another Field
	 *	@param value
	 */
   public void setWxQtyPriced(Field source) {
      wxExtractLine.setWxQtyPriced(source);
   }  
   
     /**
	 * 	Update WxQtyPriced 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxQtyPriced(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxQtyPriced(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxQtyPriced 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxQtyPriced(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxQtyPriced(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wpQuarter
	 *	@return wpQuarter
	 */
   public char[] getWpQuarter() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpQuarter();
   }

  
	/**
	*  set variable wpQuarter
	*  @param value
	**/
   public void setWpQuarter(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpQuarter(value);
   } 

     /**
	 * 	Update WpQuarter 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpQuarter(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source, sourceIndex);
   	
   }
   
   public void setWpQuarter(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpQuarter 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpQuarter(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpQuarter with another Field
	 *	@param value
	 */
   public void setWpQuarter(Field source) {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source);
   }  
   
     /**
	 * 	Update WpQuarter 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpQuarter(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpQuarter 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpQuarter(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpQuarter(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvMmbConv() throws CFException{      
   		return work.getWvMmbConv();
	}

    public char[] getWvMmbConvString() throws CFException {
          return  work.getWvMmbConv().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvMmbConv with the passed number
	 *	@param number
	 */
	public void setWvMmbConv(BigDecimal number)  throws CFException{
		work.setWvMmbConv(number);
   }

	/**
	 *	Returns the value of wxFormulaVersNum
	 *	@return wxFormulaVersNum
	 */
   public char[] getWxFormulaVersNum() throws CFException  {              
   		return wxExtractLine.getWxFormulaVersNum();
   }

  
	/**
	*  set variable wxFormulaVersNum
	*  @param value
	**/
   public void setWxFormulaVersNum(char[] value) throws CFException {
      wxExtractLine.setWxFormulaVersNum(value);
   } 

     /**
	 * 	Update WxFormulaVersNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxFormulaVersNum(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxFormulaVersNum(source, sourceIndex);
   	
   }
   
   public void setWxFormulaVersNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxFormulaVersNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxFormulaVersNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxFormulaVersNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxFormulaVersNum with another Field
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source) {
      wxExtractLine.setWxFormulaVersNum(source);
   }  
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxFormulaVersNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxFormulaVersNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvSumDexValue() throws CFException{      
   		return work.getWvSumDexValue();
	}

    public char[] getWvSumDexValueString() throws CFException {
          return  work.getWvSumDexValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvSumDexValue with the passed number
	 *	@param number
	 */
	public void setWvSumDexValue(BigDecimal number)  throws CFException{
		work.setWvSumDexValue(number);
   }

	/**
	 *	Returns the value of wxDealGroup
	 *	@return wxDealGroup
	 */
   public char[] getWxDealGroup() throws CFException  {              
   		return wxExtractLine.getWxDealGroup();
   }

  
	/**
	*  set variable wxDealGroup
	*  @param value
	**/
   public void setWxDealGroup(char[] value) throws CFException {
      wxExtractLine.setWxDealGroup(value);
   } 

     /**
	 * 	Update WxDealGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxDealGroup(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxDealGroup(source, sourceIndex);
   	
   }
   
   public void setWxDealGroup(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxDealGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxDealGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxDealGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxDealGroup with another Field
	 *	@param value
	 */
   public void setWxDealGroup(Field source) {
      wxExtractLine.setWxDealGroup(source);
   }  
   
     /**
	 * 	Update WxDealGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxDealGroup(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxDealGroup(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxDealGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxDealGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvDBarrels() throws CFException{      
   		return work.getWvDBarrels();
	}

    public char[] getWvDBarrelsString() throws CFException {
          return  work.getWvDBarrels().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDBarrels with the passed number
	 *	@param number
	 */
	public void setWvDBarrels(BigDecimal number)  throws CFException{
		work.setWvDBarrels(number);
   }

	/**
	 *	Returns the value of wpDexValue
	 *	@return wpDexValue
	 */
   public char[] getWpDexValue() throws CFException  {              
   		return wpReptext.getWpReptextPrintLine().getWpDexValue();
   }

  
	/**
	*  set variable wpDexValue
	*  @param value
	**/
   public void setWpDexValue(char[] value) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpDexValue(value);
   } 

     /**
	 * 	Update WpDexValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDexValue(char[] source, int sourceIndex) throws CFException {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source, sourceIndex);
   	
   }
   
   public void setWpDexValue(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpDexValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDexValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpDexValue with another Field
	 *	@param value
	 */
   public void setWpDexValue(Field source) {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source);
   }  
   
     /**
	 * 	Update WpDexValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDexValue(Field source, int sourceIndex,int sourceLen) {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpDexValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDexValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wpReptext.getWpReptextPrintLine().setWpDexValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wxMtAmt
	 *	@return wxMtAmt
	 */
   public char[] getWxMtAmt() throws CFException  {              
   		return wxExtractLine.getWxMtAmt();
   }

  
	/**
	*  set variable wxMtAmt
	*  @param value
	**/
   public void setWxMtAmt(char[] value) throws CFException {
      wxExtractLine.setWxMtAmt(value);
   } 

     /**
	 * 	Update WxMtAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxMtAmt(char[] source, int sourceIndex) throws CFException {
      wxExtractLine.setWxMtAmt(source, sourceIndex);
   	
   }
   
   public void setWxMtAmt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wxExtractLine.setWxMtAmt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxMtAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxMtAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxMtAmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxMtAmt with another Field
	 *	@param value
	 */
   public void setWxMtAmt(Field source) {
      wxExtractLine.setWxMtAmt(source);
   }  
   
     /**
	 * 	Update WxMtAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxMtAmt(Field source, int sourceIndex,int sourceLen) {
      wxExtractLine.setWxMtAmt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxMtAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxMtAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wxExtractLine.setWxMtAmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wxExtractLine.hashCode();
        str += work.hashCode();
        str += wpReptext.hashCode();
       return str.hashCode();
    }

    public MainSplit1OutCtx clone() {
        MainSplit1OutCtx cloneObj = new MainSplit1OutCtx();
        cloneObj.wxExtractLine = new WxExtractLine();
        cloneObj.wxExtractLine.set(wxExtractLine.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wpReptext = new WpReptext();
        cloneObj.wpReptext.set(wpReptext.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1OutCtx getMainSplit1OutCtx() {
            return new MainSplit1OutCtx();
    }
     public class MainSplit2InCtx implements Cloneable {
     WvExposureResultsTable wvExposureResultsTable = Comput5Ctx.this.getWvExposureResultsTable();
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	/**
	 *	Returns the value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public BigDecimal getWvNumericOutput() throws CFException {
   		return work.getWvNumericOutput();
	}

    /**
	 *	Returns the String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputActualString()  throws CFException{
	    return work.getWvNumericOutputActualString();
	}

	 /**
     *	Returns String value of wvNumericOutput
     *	@return wvNumericOutput
     */
    public char[]  getWvNumericOutputString() throws CFException {
         return work.getWvNumericOutputString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvNumericOutputIsNumeric() {
        return work.wvNumericOutputIsNumeric();
    }
	/**
	 * 	Update WvNumericOutput with the passed number
	 *	@param number
	 */
	public void setWvNumericOutput(BigDecimal number)  throws CFException{
		work.setWvNumericOutput(number);
   }

	/**
	 * 	Update WvNumericOutput with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvNumericOutput(char[] value)  throws CFException{
		work.setWvNumericOutput(value);
	}   

	/**
	 *	Test condition "N" for isWvNumericNotOk()
	 *	@return  Returns true if isWvNumericNotOk() is "N"
	 */
   public boolean isWvNumericNotOk() throws CFException {
      return work.isWvNumericNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvNumericNotOkTrue()  throws CFException{  			
    	work.setWvNumericNotOkTrue();
   	}
	/**
	 *	Returns the value of wvAcctIndex
	 *	@return wvAcctIndex
	 */
	public short getWvAcctIndex() throws CFException {        
   		return wvExposureResultsTable.getWvAcctIndex();
	}
	
	/**
	 * 	Update WvAcctIndex with the passed value
	 *	@param number
	 */
	public void setWvAcctIndex(short number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex(number);
	}

	public void setWvAcctIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex((short)number);
	}

	public void setWvAcctIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex((short)number);
	}



	/**
	 *	Returns the value of wvMonthIndex
	 *	@return wvMonthIndex
	 */
	public short getWvMonthIndex() throws CFException {        
   		return wvExposureResultsTable.getWvMonthIndex();
	}
	
	/**
	 * 	Update WvMonthIndex with the passed value
	 *	@param number
	 */
	public void setWvMonthIndex(short number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex(number);
	}

	public void setWvMonthIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex((short)number);
	}

	public void setWvMonthIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex((short)number);
	}



	/**
	 *	Returns the value of wvWeightIndex
	 *	@return wvWeightIndex
	 */
	public int getWvWeightIndex() throws CFException {        
   		return wvExposureResultsTable.getWvWeightIndex();
	}
	
	/**
	 * 	Update WvWeightIndex with the passed value
	 *	@param number
	 */
	public void setWvWeightIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvWeightIndex(number);
	}


	public void setWvWeightIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvWeightIndex((int)number);
	}


	/**
	 *	Returns the value of wvIntPart
	 *	@return wvIntPart
	 */
   public char[] getWvIntPart() throws CFException  {              
   		return wvIntPartGroup.getWvIntPart();
   }

  
	/**
	*  set variable wvIntPart
	*  @param value
	**/
   public void setWvIntPart(char[] value) throws CFException {
      wvIntPartGroup.setWvIntPart(value);
   } 

     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex) throws CFException {
      wvIntPartGroup.setWvIntPart(source, sourceIndex);
   	
   }
   
   public void setWvIntPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvIntPart with another Field
	 *	@param value
	 */
   public void setWvIntPart(Field source) {
      wvIntPartGroup.setWvIntPart(source);
   }  
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public BigDecimal getWvPrtQuantity() throws CFException {
   		return work.getWvPrtQuantity();
	}

    /**
	 *	Returns the String value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public char[]  getWvPrtQuantityActualString()  throws CFException{
	    return work.getWvPrtQuantityActualString();
	}

	 /**
     *	Returns String value of wvPrtQuantity
     *	@return wvPrtQuantity
     */
    public char[]  getWvPrtQuantityString() throws CFException {
         return work.getWvPrtQuantityString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvPrtQuantityIsNumeric() {
        return work.wvPrtQuantityIsNumeric();
    }
	/**
	 * 	Update WvPrtQuantity with the passed number
	 *	@param number
	 */
	public void setWvPrtQuantity(BigDecimal number)  throws CFException{
		work.setWvPrtQuantity(number);
   }

	/**
	 * 	Update WvPrtQuantity with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvPrtQuantity(char[] value)  throws CFException{
		work.setWvPrtQuantity(value);
	}   


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit2OutCtx getMainSplit2OutCtx() {
            return new MainSplit2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvExposureResultsTable.hashCode();
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public MainSplit2InCtx clone() {
        MainSplit2InCtx cloneObj = new MainSplit2InCtx();
        cloneObj.wvExposureResultsTable = new WvExposureResultsTable();
        cloneObj.wvExposureResultsTable.set(wvExposureResultsTable.getClonedField());
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2InCtx getMainSplit2InCtx() {
            return new MainSplit2InCtx();
    }
     public class MainSplit2OutCtx implements Cloneable {
     WvExposureResultsTable wvExposureResultsTable = Comput5Ctx.this.getWvExposureResultsTable();
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	public BigDecimal getWvTotal(int index,int index2) throws CFException{      
   		return wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvTotal();
	}

    public char[] getWvTotalString(int index,int index2) throws CFException {
          return  wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvTotal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvTotal with the passed number
	 *	@param number
	 */
	public void setWvTotal(int index,int index2,BigDecimal number)  throws CFException{
		wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvTotal(number);
   }

	/**
	 *	Returns the value of wpUsdValue
	 *	@return wpUsdValue
	 */
   public char[] getWpUsdValue() throws CFException  {              
   		return work.getWpUsdValue();
   }

  
	/**
	*  set variable wpUsdValue
	*  @param value
	**/
   public void setWpUsdValue(char[] value) throws CFException {
      work.setWpUsdValue(value);
   } 

     /**
	 * 	Update WpUsdValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpUsdValue(char[] source, int sourceIndex) throws CFException {
      work.setWpUsdValue(source, sourceIndex);
   	
   }
   
   public void setWpUsdValue(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWpUsdValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpUsdValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpUsdValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpUsdValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpUsdValue with another Field
	 *	@param value
	 */
   public void setWpUsdValue(Field source) {
      work.setWpUsdValue(source);
   }  
   
     /**
	 * 	Update WpUsdValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpUsdValue(Field source, int sourceIndex,int sourceLen) {
      work.setWpUsdValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpUsdValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpUsdValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpUsdValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvAccountMnem
	 *	@return wvAccountMnem
	 */
   public char[] getWvAccountMnem(int index) throws CFException  {              
   		return wvExposureResultsTable.getWvAccounts(index).getWvAccountMnem();
   }

  
	/**
	*  set variable wvAccountMnem
	*  @param value
	**/
   public void setWvAccountMnem(int index,char[] value) throws CFException {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(value);
   } 

     /**
	 * 	Update WvAccountMnem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvAccountMnem(int index,char[] source, int sourceIndex) throws CFException {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source, sourceIndex);
   	
   }
   
   public void setWvAccountMnem(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvAccountMnem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvAccountMnem(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvAccountMnem with another Field
	 *	@param value
	 */
   public void setWvAccountMnem(int index,Field source) {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source);
   }  
   
     /**
	 * 	Update WvAccountMnem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvAccountMnem(int index,Field source, int sourceIndex,int sourceLen) {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvAccountMnem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvAccountMnem(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExposureResultsTable.getWvAccounts(index).setWvAccountMnem(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWvFmse(int index,int index2) throws CFException{      
   		return wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvFmse();
	}

    public char[] getWvFmseString(int index,int index2) throws CFException {
          return  wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvFmse().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvFmse with the passed number
	 *	@param number
	 */
	public void setWvFmse(int index,int index2,BigDecimal number)  throws CFException{
		wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvFmse(number);
   }

	public BigDecimal getWvMonthlyExpo(int index,int index2,int index3) throws CFException{      
   		return wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvMonthlyExpo((index3));
	}

    public char[] getWvMonthlyExpoString(int index,int index2,int index3) throws CFException {
          return  wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvMonthlyExpo((index3)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvMonthlyExpo with the passed number
	 *	@param number
	 */
	public void setWvMonthlyExpo(int index,int index2,int index3,BigDecimal number)  throws CFException{
		wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvMonthlyExpo((index3),number);
   }

	/**
	 *	Returns the value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public BigDecimal getWvPrtQuantity() throws CFException {
   		return work.getWvPrtQuantity();
	}

    /**
	 *	Returns the String value of wvPrtQuantity
	 *	@return wvPrtQuantity
	 */
	public char[]  getWvPrtQuantityActualString()  throws CFException{
	    return work.getWvPrtQuantityActualString();
	}

	 /**
     *	Returns String value of wvPrtQuantity
     *	@return wvPrtQuantity
     */
    public char[]  getWvPrtQuantityString() throws CFException {
         return work.getWvPrtQuantityString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvPrtQuantityIsNumeric() {
        return work.wvPrtQuantityIsNumeric();
    }
	/**
	 * 	Update WvPrtQuantity with the passed number
	 *	@param number
	 */
	public void setWvPrtQuantity(BigDecimal number)  throws CFException{
		work.setWvPrtQuantity(number);
   }

	/**
	 * 	Update WvPrtQuantity with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvPrtQuantity(char[] value)  throws CFException{
		work.setWvPrtQuantity(value);
	}   

	/**
	 *	Returns the value of wpCurrUnitDayN
	 *	@return wpCurrUnitDayN
	 */
   public char[] getWpCurrUnitDayN() throws CFException  {              
   		return work.getWpCurrUnitDayN();
   }

  
	/**
	*  set variable wpCurrUnitDayN
	*  @param value
	**/
   public void setWpCurrUnitDayN(char[] value) throws CFException {
      work.setWpCurrUnitDayN(value);
   } 

     /**
	 * 	Update WpCurrUnitDayN 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpCurrUnitDayN(char[] source, int sourceIndex) throws CFException {
      work.setWpCurrUnitDayN(source, sourceIndex);
   	
   }
   
   public void setWpCurrUnitDayN(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWpCurrUnitDayN(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpCurrUnitDayN(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpCurrUnitDayN(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpCurrUnitDayN with another Field
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source) {
      work.setWpCurrUnitDayN(source);
   }  
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source, int sourceIndex,int sourceLen) {
      work.setWpCurrUnitDayN(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpCurrUnitDayN 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpCurrUnitDayN(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpCurrUnitDayN(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException  {              
   		return wvNumericInputGroup.getWvNumericInput();
   }

  
	/**
	*  set variable wvNumericInput
	*  @param value
	**/
   public void setWvNumericInput(char[] value) throws CFException {
      wvNumericInputGroup.setWvNumericInput(value);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
      wvNumericInputGroup.setWvNumericInput(source);
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvWeight
	 *	@return wvWeight
	 */
   public char[] getWvWeight(int index,int index2) throws CFException  {              
   		return wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).getWvWeight();
   }

  
	/**
	*  set variable wvWeight
	*  @param value
	**/
   public void setWvWeight(int index,int index2,char[] value) throws CFException {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(value);
   } 

     /**
	 * 	Update WvWeight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvWeight(int index,int index2,char[] source, int sourceIndex) throws CFException {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source, sourceIndex);
   	
   }
   
   public void setWvWeight(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvWeight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvWeight(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvWeight with another Field
	 *	@param value
	 */
   public void setWvWeight(int index,int index2,Field source) {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source);
   }  
   
     /**
	 * 	Update WvWeight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvWeight(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvWeight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvWeight(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExposureResultsTable.getWvAccounts(index).getWvWeightingType(index2).setWvWeight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvAcctIndex
	 *	@return wvAcctIndex
	 */
	public short getWvAcctIndex() throws CFException {        
   		return wvExposureResultsTable.getWvAcctIndex();
	}
	
	/**
	 * 	Update WvAcctIndex with the passed value
	 *	@param number
	 */
	public void setWvAcctIndex(short number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex(number);
	}

	public void setWvAcctIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex((short)number);
	}

	public void setWvAcctIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvAcctIndex((short)number);
	}



	/**
	 *	Returns the value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public short getWvMaxIntDigits() throws CFException {
   		return work.getWvMaxIntDigits();
	}

    /**
	 *	Returns the String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsActualString() {
		return work.getWvMaxIntDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxIntDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxIntDigitsIsNumeric()  throws CFException{
	    return work.wvMaxIntDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxIntDigits(short number)  throws CFException{
		work.setWvMaxIntDigits(number);
	}
	
	public void setWvMaxIntDigits(int number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	public void setWvMaxIntDigits(long number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigits(char[] value)  throws CFException {
		work.setWvMaxIntDigits(value);
	}
	
	/**
	 * 	Update WvMaxIntDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigitsString(char[] value)  throws CFException{
		work.setWvMaxIntDigits(value);
	}	

	/**
	 *	Returns the value of wvMonthIndex
	 *	@return wvMonthIndex
	 */
	public short getWvMonthIndex() throws CFException {        
   		return wvExposureResultsTable.getWvMonthIndex();
	}
	
	/**
	 * 	Update WvMonthIndex with the passed value
	 *	@param number
	 */
	public void setWvMonthIndex(short number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex(number);
	}

	public void setWvMonthIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex((short)number);
	}

	public void setWvMonthIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvMonthIndex((short)number);
	}



	/**
	 *	Returns the value of wvWeightIndex
	 *	@return wvWeightIndex
	 */
	public int getWvWeightIndex() throws CFException {        
   		return wvExposureResultsTable.getWvWeightIndex();
	}
	
	/**
	 * 	Update WvWeightIndex with the passed value
	 *	@param number
	 */
	public void setWvWeightIndex(int number)  throws CFException{
		wvExposureResultsTable.setWvWeightIndex(number);
	}


	public void setWvWeightIndex(long number)  throws CFException{
		wvExposureResultsTable.setWvWeightIndex((int)number);
	}


	/**
	 *	Returns the value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public short getWvMaxDecDigits() throws CFException {
   		return work.getWvMaxDecDigits();
	}

    /**
	 *	Returns the String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsActualString() {
		return work.getWvMaxDecDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxDecDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxDecDigitsIsNumeric()  throws CFException{
	    return work.wvMaxDecDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxDecDigits(short number)  throws CFException{
		work.setWvMaxDecDigits(number);
	}
	
	public void setWvMaxDecDigits(int number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	public void setWvMaxDecDigits(long number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigits(char[] value)  throws CFException {
		work.setWvMaxDecDigits(value);
	}
	
	/**
	 * 	Update WvMaxDecDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigitsString(char[] value)  throws CFException{
		work.setWvMaxDecDigits(value);
	}	

	public BigDecimal getPrclcstLatestCostValue() throws CFException{      
   		return work.getPrclcstLatestCostValue();
	}

    public char[] getPrclcstLatestCostValueString() throws CFException {
          return  work.getPrclcstLatestCostValue().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclcstLatestCostValue with the passed number
	 *	@param number
	 */
	public void setPrclcstLatestCostValue(BigDecimal number)  throws CFException{
		work.setPrclcstLatestCostValue(number);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvExposureResultsTable.hashCode();
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public MainSplit2OutCtx clone() {
        MainSplit2OutCtx cloneObj = new MainSplit2OutCtx();
        cloneObj.wvExposureResultsTable = new WvExposureResultsTable();
        cloneObj.wvExposureResultsTable.set(wvExposureResultsTable.getClonedField());
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2OutCtx getMainSplit2OutCtx() {
            return new MainSplit2OutCtx();
    }
     public class MainSplit3InCtx implements Cloneable {
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	/**
	 *	Returns the value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public BigDecimal getWvNumericOutput() throws CFException {
   		return work.getWvNumericOutput();
	}

    /**
	 *	Returns the String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputActualString()  throws CFException{
	    return work.getWvNumericOutputActualString();
	}

	 /**
     *	Returns String value of wvNumericOutput
     *	@return wvNumericOutput
     */
    public char[]  getWvNumericOutputString() throws CFException {
         return work.getWvNumericOutputString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvNumericOutputIsNumeric() {
        return work.wvNumericOutputIsNumeric();
    }
	/**
	 * 	Update WvNumericOutput with the passed number
	 *	@param number
	 */
	public void setWvNumericOutput(BigDecimal number)  throws CFException{
		work.setWvNumericOutput(number);
   }

	/**
	 * 	Update WvNumericOutput with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvNumericOutput(char[] value)  throws CFException{
		work.setWvNumericOutput(value);
	}   

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException  {              
   		return wvNumericInputGroup.getWvNumericInput();
   }

  
	/**
	*  set variable wvNumericInput
	*  @param value
	**/
   public void setWvNumericInput(char[] value) throws CFException {
      wvNumericInputGroup.setWvNumericInput(value);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
      wvNumericInputGroup.setWvNumericInput(source);
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isWvNumericNotOk()
	 *	@return  Returns true if isWvNumericNotOk() is "N"
	 */
   public boolean isWvNumericNotOk() throws CFException {
      return work.isWvNumericNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvNumericNotOkTrue()  throws CFException{  			
    	work.setWvNumericNotOkTrue();
   	}
	/**
	 *	Returns the value of wvIntPart
	 *	@return wvIntPart
	 */
   public char[] getWvIntPart() throws CFException  {              
   		return wvIntPartGroup.getWvIntPart();
   }

  
	/**
	*  set variable wvIntPart
	*  @param value
	**/
   public void setWvIntPart(char[] value) throws CFException {
      wvIntPartGroup.setWvIntPart(value);
   } 

     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex) throws CFException {
      wvIntPartGroup.setWvIntPart(source, sourceIndex);
   	
   }
   
   public void setWvIntPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvIntPart with another Field
	 *	@param value
	 */
   public void setWvIntPart(Field source) {
      wvIntPartGroup.setWvIntPart(source);
   }  
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit3OutCtx getMainSplit3OutCtx() {
            return new MainSplit3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public MainSplit3InCtx clone() {
        MainSplit3InCtx cloneObj = new MainSplit3InCtx();
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3InCtx getMainSplit3InCtx() {
            return new MainSplit3InCtx();
    }
     public class MainSplit3OutCtx implements Cloneable {
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException  {              
   		return wvNumericInputGroup.getWvNumericInput();
   }

  
	/**
	*  set variable wvNumericInput
	*  @param value
	**/
   public void setWvNumericInput(char[] value) throws CFException {
      wvNumericInputGroup.setWvNumericInput(value);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
      wvNumericInputGroup.setWvNumericInput(source);
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public short getWvMaxIntDigits() throws CFException {
   		return work.getWvMaxIntDigits();
	}

    /**
	 *	Returns the String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsActualString() {
		return work.getWvMaxIntDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxIntDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxIntDigitsIsNumeric()  throws CFException{
	    return work.wvMaxIntDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxIntDigits(short number)  throws CFException{
		work.setWvMaxIntDigits(number);
	}
	
	public void setWvMaxIntDigits(int number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	public void setWvMaxIntDigits(long number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigits(char[] value)  throws CFException {
		work.setWvMaxIntDigits(value);
	}
	
	/**
	 * 	Update WvMaxIntDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigitsString(char[] value)  throws CFException{
		work.setWvMaxIntDigits(value);
	}	

	/**
	 *	Returns the value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public short getWvMaxDecDigits() throws CFException {
   		return work.getWvMaxDecDigits();
	}

    /**
	 *	Returns the String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsActualString() {
		return work.getWvMaxDecDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxDecDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxDecDigitsIsNumeric()  throws CFException{
	    return work.wvMaxDecDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxDecDigits(short number)  throws CFException{
		work.setWvMaxDecDigits(number);
	}
	
	public void setWvMaxDecDigits(int number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	public void setWvMaxDecDigits(long number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigits(char[] value)  throws CFException {
		work.setWvMaxDecDigits(value);
	}
	
	/**
	 * 	Update WvMaxDecDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigitsString(char[] value)  throws CFException{
		work.setWvMaxDecDigits(value);
	}	


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public MainSplit3OutCtx clone() {
        MainSplit3OutCtx cloneObj = new MainSplit3OutCtx();
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3OutCtx getMainSplit3OutCtx() {
            return new MainSplit3OutCtx();
    }
     public class MainSplit4InCtx implements Cloneable {
     WoExposureGroup woExposureGroup = Comput5Ctx.this.getWoExposureGroup();
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();
     WtExposureTable wtExposureTable = Comput5Ctx.this.getWtExposureTable();

	/**
	 *	Returns the value of wvSeqNum
	 *	@return wvSeqNum
	 */
	public short getWvSeqNum() throws CFException {        
   		return work.getWvSeqNum();
	}
	
	/**
	 * 	Update WvSeqNum with the passed value
	 *	@param number
	 */
	public void setWvSeqNum(short number)  throws CFException{
		work.setWvSeqNum(number);
	}

	public void setWvSeqNum(int number)  throws CFException{
		work.setWvSeqNum((short)number);
	}

	public void setWvSeqNum(long number)  throws CFException{
		work.setWvSeqNum((short)number);
	}



	/**
	 *	Returns the value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public BigDecimal getWvNumericOutput() throws CFException {
   		return work.getWvNumericOutput();
	}

    /**
	 *	Returns the String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputActualString()  throws CFException{
	    return work.getWvNumericOutputActualString();
	}

	 /**
     *	Returns String value of wvNumericOutput
     *	@return wvNumericOutput
     */
    public char[]  getWvNumericOutputString() throws CFException {
         return work.getWvNumericOutputString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvNumericOutputIsNumeric() {
        return work.wvNumericOutputIsNumeric();
    }
	/**
	 * 	Update WvNumericOutput with the passed number
	 *	@param number
	 */
	public void setWvNumericOutput(BigDecimal number)  throws CFException{
		work.setWvNumericOutput(number);
   }

	/**
	 * 	Update WvNumericOutput with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvNumericOutput(char[] value)  throws CFException{
		work.setWvNumericOutput(value);
	}   

	/**
	 *	Test condition "N" for isWvNumericNotOk()
	 *	@return  Returns true if isWvNumericNotOk() is "N"
	 */
   public boolean isWvNumericNotOk() throws CFException {
      return work.isWvNumericNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvNumericNotOkTrue()  throws CFException{  			
    	work.setWvNumericNotOkTrue();
   	}
	/**
	 *	Returns the value of wvIntPart
	 *	@return wvIntPart
	 */
   public char[] getWvIntPart() throws CFException  {              
   		return wvIntPartGroup.getWvIntPart();
   }

  
	/**
	*  set variable wvIntPart
	*  @param value
	**/
   public void setWvIntPart(char[] value) throws CFException {
      wvIntPartGroup.setWvIntPart(value);
   } 

     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex) throws CFException {
      wvIntPartGroup.setWvIntPart(source, sourceIndex);
   	
   }
   
   public void setWvIntPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvIntPart with another Field
	 *	@param value
	 */
   public void setWvIntPart(Field source) {
      wvIntPartGroup.setWvIntPart(source);
   }  
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit4OutCtx getMainSplit4OutCtx() {
            return new MainSplit4OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += woExposureGroup.hashCode();
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
        str += wtExposureTable.hashCode();
       return str.hashCode();
    }

    public MainSplit4InCtx clone() {
        MainSplit4InCtx cloneObj = new MainSplit4InCtx();
        cloneObj.woExposureGroup = new WoExposureGroup();
        cloneObj.woExposureGroup.set(woExposureGroup.getClonedField());
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        cloneObj.wtExposureTable = new WtExposureTable();
        cloneObj.wtExposureTable.set(wtExposureTable.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4InCtx getMainSplit4InCtx() {
            return new MainSplit4InCtx();
    }
     public class MainSplit4OutCtx implements Cloneable {
     WoExposureGroup woExposureGroup = Comput5Ctx.this.getWoExposureGroup();
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();
     WtExposureTable wtExposureTable = Comput5Ctx.this.getWtExposureTable();

	/**
	 *	Returns the value of wvSeqNum
	 *	@return wvSeqNum
	 */
	public short getWvSeqNum() throws CFException {        
   		return work.getWvSeqNum();
	}
	
	/**
	 * 	Update WvSeqNum with the passed value
	 *	@param number
	 */
	public void setWvSeqNum(short number)  throws CFException{
		work.setWvSeqNum(number);
	}

	public void setWvSeqNum(int number)  throws CFException{
		work.setWvSeqNum((short)number);
	}

	public void setWvSeqNum(long number)  throws CFException{
		work.setWvSeqNum((short)number);
	}



	/**
	 *	Returns the value of woExposureS
	 *	@return woExposureS
	 */
   public char[] getWoExposureS(int index) throws CFException  {              
   		return woExposureGroup.getWoExposureDetails(index).getWoExposureS();
   }

  
	/**
	*  set variable woExposureS
	*  @param value
	**/
   public void setWoExposureS(int index,char[] value) throws CFException {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(value);
   } 

     /**
	 * 	Update WoExposureS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWoExposureS(int index,char[] source, int sourceIndex) throws CFException {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source, sourceIndex);
   	
   }
   
   public void setWoExposureS(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WoExposureS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWoExposureS(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WoExposureS with another Field
	 *	@param value
	 */
   public void setWoExposureS(int index,Field source) {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source);
   }  
   
     /**
	 * 	Update WoExposureS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWoExposureS(int index,Field source, int sourceIndex,int sourceLen) {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WoExposureS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWoExposureS(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      woExposureGroup.getWoExposureDetails(index).setWoExposureS(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getDealgpalAllocWgtnNum() throws CFException{      
   		return work.getDealgpalAllocWgtnNum();
	}

    public char[] getDealgpalAllocWgtnNumString() throws CFException {
          return  work.getDealgpalAllocWgtnNum().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number)  throws CFException{
		work.setDealgpalAllocWgtnNum(number);
   }

	public BigDecimal getWtExposure(int index) throws CFException{      
   		return wtExposureTable.getWtExposureDetails(index).getWtExposure();
	}

    public char[] getWtExposureString(int index) throws CFException {
          return  wtExposureTable.getWtExposureDetails(index).getWtExposure().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WtExposure with the passed number
	 *	@param number
	 */
	public void setWtExposure(int index,BigDecimal number)  throws CFException{
		wtExposureTable.getWtExposureDetails(index).setWtExposure(number);
   }

	/**
	 *	Returns the value of wvKbblVol
	 *	@return wvKbblVol
	 */
   public char[] getWvKbblVol() throws CFException  {              
   		return work.getWvKbblVol();
   }

  
	/**
	*  set variable wvKbblVol
	*  @param value
	**/
   public void setWvKbblVol(char[] value) throws CFException {
      work.setWvKbblVol(value);
   } 

     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex) throws CFException {
      work.setWvKbblVol(source, sourceIndex);
   	
   }
   
   public void setWvKbblVol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvKbblVol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvKbblVol with another Field
	 *	@param value
	 */
   public void setWvKbblVol(Field source) {
      work.setWvKbblVol(source);
   }  
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWvExposureInt() throws CFException {  
        return work.getWvExposureInt();
}
	/**
	 * 	Update WvExposureInt with the passed value
	 *	@param number
	 */
	public void setWvExposureInt(int number)  throws CFException{
		work.setWvExposureInt(number);
	}


	public void setWvExposureInt(long number)  throws CFException{
	    work.setWvExposureInt(number);
	}
	

	/**
	 *	Returns the value of wpFmseLmtKtN
	 *	@return wpFmseLmtKtN
	 */
   public char[] getWpFmseLmtKtN() throws CFException  {              
   		return work.getWpFmseLmtKtN();
   }

  
	/**
	*  set variable wpFmseLmtKtN
	*  @param value
	**/
   public void setWpFmseLmtKtN(char[] value) throws CFException {
      work.setWpFmseLmtKtN(value);
   } 

     /**
	 * 	Update WpFmseLmtKtN 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpFmseLmtKtN(char[] source, int sourceIndex) throws CFException {
      work.setWpFmseLmtKtN(source, sourceIndex);
   	
   }
   
   public void setWpFmseLmtKtN(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWpFmseLmtKtN(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpFmseLmtKtN(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpFmseLmtKtN(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpFmseLmtKtN with another Field
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source) {
      work.setWpFmseLmtKtN(source);
   }  
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source, int sourceIndex,int sourceLen) {
      work.setWpFmseLmtKtN(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpFmseLmtKtN 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpFmseLmtKtN(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpFmseLmtKtN(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getTrdgauthQuantityAuthA() throws CFException{      
   		return work.getTrdgauthQuantityAuthA();
	}

    public char[] getTrdgauthQuantityAuthAString() throws CFException {
          return  work.getTrdgauthQuantityAuthA().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update TrdgauthQuantityAuthA with the passed number
	 *	@param number
	 */
	public void setTrdgauthQuantityAuthA(BigDecimal number)  throws CFException{
		work.setTrdgauthQuantityAuthA(number);
   }

	public BigDecimal getWvDQty() throws CFException{      
   		return work.getWvDQty();
	}

    public char[] getWvDQtyString() throws CFException {
          return  work.getWvDQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDQty with the passed number
	 *	@param number
	 */
	public void setWvDQty(BigDecimal number)  throws CFException{
		work.setWvDQty(number);
   }

	public BigDecimal getWvEffWeightPc() throws CFException{      
   		return work.getWvEffWeightPc();
	}

    public char[] getWvEffWeightPcString() throws CFException {
          return  work.getWvEffWeightPc().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvEffWeightPc with the passed number
	 *	@param number
	 */
	public void setWvEffWeightPc(BigDecimal number)  throws CFException{
		work.setWvEffWeightPc(number);
   }

	/**
	 *	Returns the value of wvExposureCount
	 *	@return wvExposureCount
	 */
	public short getWvExposureCount() throws CFException {        
   		return work.getWvExposureCount();
	}
	
	/**
	 * 	Update WvExposureCount with the passed value
	 *	@param number
	 */
	public void setWvExposureCount(short number)  throws CFException{
		work.setWvExposureCount(number);
	}

	public void setWvExposureCount(int number)  throws CFException{
		work.setWvExposureCount((short)number);
	}

	public void setWvExposureCount(long number)  throws CFException{
		work.setWvExposureCount((short)number);
	}



	/**
	 *	Returns the value of wxUserQuantity
	 *	@return wxUserQuantity
	 */
   public char[] getWxUserQuantity() throws CFException  {              
   		return work.getWxUserQuantity();
   }

  
	/**
	*  set variable wxUserQuantity
	*  @param value
	**/
   public void setWxUserQuantity(char[] value) throws CFException {
      work.setWxUserQuantity(value);
   } 

     /**
	 * 	Update WxUserQuantity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxUserQuantity(char[] source, int sourceIndex) throws CFException {
      work.setWxUserQuantity(source, sourceIndex);
   	
   }
   
   public void setWxUserQuantity(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWxUserQuantity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WxUserQuantity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxUserQuantity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWxUserQuantity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WxUserQuantity with another Field
	 *	@param value
	 */
   public void setWxUserQuantity(Field source) {
      work.setWxUserQuantity(source);
   }  
   
     /**
	 * 	Update WxUserQuantity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxUserQuantity(Field source, int sourceIndex,int sourceLen) {
      work.setWxUserQuantity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WxUserQuantity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxUserQuantity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWxUserQuantity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvBtfFactor
	 *	@return wvBtfFactor
	 */
	public BigDecimal getWvBtfFactor() throws CFException {
   		return work.getWvBtfFactor();
	}


	 /**
     *	Returns String value of wvBtfFactor
     *	@return wvBtfFactor
     */
    public char[]  getWvBtfFactorString() throws CFException {
         return work.getWvBtfFactorString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvBtfFactorIsNumeric() {
        return work.wvBtfFactorIsNumeric();
    }
	/**
	 * 	Update WvBtfFactor with the passed number
	 *	@param number
	 */
	public void setWvBtfFactor(BigDecimal number)  throws CFException{
		work.setWvBtfFactor(number);
   }

	/**
	 * 	Update WvBtfFactor with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvBtfFactor(char[] value)  throws CFException{
		work.setWvBtfFactor(value);
	}   

	public BigDecimal getWvMmbConv() throws CFException{      
   		return work.getWvMmbConv();
	}

    public char[] getWvMmbConvString() throws CFException {
          return  work.getWvMmbConv().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvMmbConv with the passed number
	 *	@param number
	 */
	public void setWvMmbConv(BigDecimal number)  throws CFException{
		work.setWvMmbConv(number);
   }

	/**
	 *	Returns the value of wpDBarrels
	 *	@return wpDBarrels
	 */
   public char[] getWpDBarrels() throws CFException  {              
   		return work.getWpDBarrels();
   }

  
	/**
	*  set variable wpDBarrels
	*  @param value
	**/
   public void setWpDBarrels(char[] value) throws CFException {
      work.setWpDBarrels(value);
   } 

     /**
	 * 	Update WpDBarrels 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDBarrels(char[] source, int sourceIndex) throws CFException {
      work.setWpDBarrels(source, sourceIndex);
   	
   }
   
   public void setWpDBarrels(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWpDBarrels(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpDBarrels 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDBarrels(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpDBarrels(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpDBarrels with another Field
	 *	@param value
	 */
   public void setWpDBarrels(Field source) {
      work.setWpDBarrels(source);
   }  
   
     /**
	 * 	Update WpDBarrels 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDBarrels(Field source, int sourceIndex,int sourceLen) {
      work.setWpDBarrels(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpDBarrels 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDBarrels(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpDBarrels(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException  {              
   		return wvNumericInputGroup.getWvNumericInput();
   }

  
	/**
	*  set variable wvNumericInput
	*  @param value
	**/
   public void setWvNumericInput(char[] value) throws CFException {
      wvNumericInputGroup.setWvNumericInput(value);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
      wvNumericInputGroup.setWvNumericInput(source);
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getPrclexpKbblVol() throws CFException{      
   		return work.getPrclexpKbblVol();
	}

    public char[] getPrclexpKbblVolString() throws CFException {
          return  work.getPrclexpKbblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclexpKbblVol with the passed number
	 *	@param number
	 */
	public void setPrclexpKbblVol(BigDecimal number)  throws CFException{
		work.setPrclexpKbblVol(number);
   }

	public BigDecimal getParcelBblVol() throws CFException{      
   		return work.getParcelBblVol();
	}

    public char[] getParcelBblVolString() throws CFException {
          return  work.getParcelBblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ParcelBblVol with the passed number
	 *	@param number
	 */
	public void setParcelBblVol(BigDecimal number)  throws CFException{
		work.setParcelBblVol(number);
   }

	public BigDecimal getWvDTonnes() throws CFException{      
   		return work.getWvDTonnes();
	}

    public char[] getWvDTonnesString() throws CFException {
          return  work.getWvDTonnes().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDTonnes with the passed number
	 *	@param number
	 */
	public void setWvDTonnes(BigDecimal number)  throws CFException{
		work.setWvDTonnes(number);
   }

	public BigDecimal getWvDBarrels() throws CFException{      
   		return work.getWvDBarrels();
	}

    public char[] getWvDBarrelsString() throws CFException {
          return  work.getWvDBarrels().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvDBarrels with the passed number
	 *	@param number
	 */
	public void setWvDBarrels(BigDecimal number)  throws CFException{
		work.setWvDBarrels(number);
   }

	public BigDecimal getWvExposureAmt() throws CFException{      
   		return work.getWvExposureAmt();
	}

    public char[] getWvExposureAmtString() throws CFException {
          return  work.getWvExposureAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvExposureAmt with the passed number
	 *	@param number
	 */
	public void setWvExposureAmt(BigDecimal number)  throws CFException{
		work.setWvExposureAmt(number);
   }

	/**
	 *	Returns the value of wpDQty
	 *	@return wpDQty
	 */
   public char[] getWpDQty() throws CFException  {              
   		return work.getWpDQty();
   }

  
	/**
	*  set variable wpDQty
	*  @param value
	**/
   public void setWpDQty(char[] value) throws CFException {
      work.setWpDQty(value);
   } 

     /**
	 * 	Update WpDQty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWpDQty(char[] source, int sourceIndex) throws CFException {
      work.setWpDQty(source, sourceIndex);
   	
   }
   
   public void setWpDQty(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWpDQty(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WpDQty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWpDQty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpDQty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WpDQty with another Field
	 *	@param value
	 */
   public void setWpDQty(Field source) {
      work.setWpDQty(source);
   }  
   
     /**
	 * 	Update WpDQty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWpDQty(Field source, int sourceIndex,int sourceLen) {
      work.setWpDQty(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WpDQty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWpDQty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWpDQty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += woExposureGroup.hashCode();
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvNumericInputGroup.hashCode();
        str += wtExposureTable.hashCode();
       return str.hashCode();
    }

    public MainSplit4OutCtx clone() {
        MainSplit4OutCtx cloneObj = new MainSplit4OutCtx();
        cloneObj.woExposureGroup = new WoExposureGroup();
        cloneObj.woExposureGroup.set(woExposureGroup.getClonedField());
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        cloneObj.wtExposureTable = new WtExposureTable();
        cloneObj.wtExposureTable.set(wtExposureTable.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4OutCtx getMainSplit4OutCtx() {
            return new MainSplit4OutCtx();
    }
     public class MainSplit5InCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = Comput5Ctx.this.getIp66601UserTagInformation();
     Ip00485MemberEntryInfo ip00485MemberEntryInfo = Comput5Ctx.this.getIp00485MemberEntryInfo();
     Work work = Comput5Ctx.this.getWork();

public int getWvExposureInt() throws CFException {  
        return work.getWvExposureInt();
}
	/**
	 * 	Update WvExposureInt with the passed value
	 *	@param number
	 */
	public void setWvExposureInt(int number)  throws CFException{
		work.setWvExposureInt(number);
	}


	public void setWvExposureInt(long number)  throws CFException{
	    work.setWvExposureInt(number);
	}
	

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	


public void setIp00485MemberIdx(int ip00485MemberIdx) { 
    Comput5Ctx.this.ip00485MemberIdx = ip00485MemberIdx;
}

public int getIp00485MemberIdx() { 
    return Comput5Ctx.this.ip00485MemberIdx;
}
	/**
	 *	Returns the value of ip00485MemberEntry
	 *	@return ip00485MemberEntry
	 */   
	 public Ip00485MemberEntry getIp00485MemberEntry(int index) {
   	return ip00485MemberEntryInfo.getIp00485MemberEntry(index);
   }

    public List<Ip00485MemberEntry> getIp00485MemberEntry() {
        return ip00485MemberEntryInfo.getIp00485MemberEntry();
    }
   /**
	* 	Update Ip00485MemberEntry with the passed value
	*	@param value
	*/
   public void setIp00485MemberEntry(int index,char[] value) throws CFException {
      ip00485MemberEntryInfo.setIp00485MemberEntry((index),value);
   }   



public void setIp66601UserT(int ip66601UserT) { 
    Comput5Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Comput5Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of wvGeneralParm
	 *	@return wvGeneralParm
	 */
   public char[] getWvGeneralParm() throws CFException  {              
   		return work.getWvGeneralParm();
   }

  
	/**
	*  set variable wvGeneralParm
	*  @param value
	**/
   public void setWvGeneralParm(char[] value) throws CFException {
      work.setWvGeneralParm(value);
   } 


public void setIp66601UserEnd(int ip66601UserEnd) { 
    Comput5Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Comput5Ctx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of ip00485MemberEntryInfo
	 *	@return ip00485MemberEntryInfo
	 */   
	 public Ip00485MemberEntryInfo getIp00485MemberEntryInfo() {
   	return ip00485MemberEntryInfo;
   }


	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   



public void setIp66601UserP(int ip66601UserP) { 
    Comput5Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Comput5Ctx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntries();
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number)  throws CFException{
		ip00485MemberEntryInfo.setIp00485MemberEntries(number);
	}




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Comput5Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Comput5Ctx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip00485MemberId
	 *	@return ip00485MemberId
	 */
	public short getIp00485MemberId(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485MemberId();
	}
	
	/**
	 * 	Update Ip00485MemberId with the passed value
	 *	@param number
	 */
	public void setIp00485MemberId(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId(number);
	}

	public void setIp00485MemberId(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}

	public void setIp00485MemberId(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}




        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit5OutCtx getMainSplit5OutCtx() {
            return new MainSplit5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit5InCtx clone() {
        MainSplit5InCtx cloneObj = new MainSplit5InCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5InCtx getMainSplit5InCtx() {
            return new MainSplit5InCtx();
    }
     public class MainSplit5OutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = Comput5Ctx.this.getIp66601UserTagInformation();
     Ip00485MemberEntryInfo ip00485MemberEntryInfo = Comput5Ctx.this.getIp00485MemberEntryInfo();
     Work work = Comput5Ctx.this.getWork();

	public BigDecimal getDealgpalAllocWgtnNum() throws CFException{      
   		return work.getDealgpalAllocWgtnNum();
	}

    public char[] getDealgpalAllocWgtnNumString() throws CFException {
          return  work.getDealgpalAllocWgtnNum().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number)  throws CFException{
		work.setDealgpalAllocWgtnNum(number);
   }

	/**
	 *	Returns the value of wvExtrBblVar
	 *	@return wvExtrBblVar
	 */
   public char[] getWvExtrBblVar() throws CFException  {              
   		return work.getWvExtrBblVar();
   }

  
	/**
	*  set variable wvExtrBblVar
	*  @param value
	**/
   public void setWvExtrBblVar(char[] value) throws CFException {
      work.setWvExtrBblVar(value);
   } 

     /**
	 * 	Update WvExtrBblVar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrBblVar(char[] source, int sourceIndex) throws CFException {
      work.setWvExtrBblVar(source, sourceIndex);
   	
   }
   
   public void setWvExtrBblVar(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvExtrBblVar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBblVar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrBblVar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrBblVar with another Field
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source) {
      work.setWvExtrBblVar(source);
   }  
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source, int sourceIndex,int sourceLen) {
      work.setWvExtrBblVar(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrBblVar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBblVar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrBblVar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType();
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(number);
	}

	public void setIp66601UserTagType(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}

	public void setIp66601UserTagType(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}



	/**
	 *	Returns the value of ip00485UserTagLngth
	 *	@return ip00485UserTagLngth
	 */
	public short getIp00485UserTagLngth(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagLngth();
	}
	
	/**
	 * 	Update Ip00485UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagLngth(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth(number);
	}

	public void setIp00485UserTagLngth(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth((short)number);
	}

	public void setIp00485UserTagLngth(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagLngth((short)number);
	}




public void setIp66601UserT(int ip66601UserT) { 
    Comput5Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Comput5Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of wvGeneralParm
	 *	@return wvGeneralParm
	 */
   public char[] getWvGeneralParm() throws CFException  {              
   		return work.getWvGeneralParm();
   }

  
	/**
	*  set variable wvGeneralParm
	*  @param value
	**/
   public void setWvGeneralParm(char[] value) throws CFException {
      work.setWvGeneralParm(value);
   } 


public void setIp66601UserEnd(int ip66601UserEnd) { 
    Comput5Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Comput5Ctx.this.ip66601UserEnd;
}
	public BigDecimal getWvUsdBblVariance() throws CFException{      
   		return work.getWvUsdBblVariance();
	}

    public char[] getWvUsdBblVarianceString() throws CFException {
          return  work.getWvUsdBblVariance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvUsdBblVariance with the passed number
	 *	@param number
	 */
	public void setWvUsdBblVariance(BigDecimal number)  throws CFException{
		work.setWvUsdBblVariance(number);
   }

	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   


	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}



	public BigDecimal getWvExposureAmt() throws CFException{      
   		return work.getWvExposureAmt();
	}

    public char[] getWvExposureAmtString() throws CFException {
          return  work.getWvExposureAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvExposureAmt with the passed number
	 *	@param number
	 */
	public void setWvExposureAmt(BigDecimal number)  throws CFException{
		work.setWvExposureAmt(number);
   }

	public BigDecimal getWvUsdVariance() throws CFException{      
   		return work.getWvUsdVariance();
	}

    public char[] getWvUsdVarianceString() throws CFException {
          return  work.getWvUsdVariance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvUsdVariance with the passed number
	 *	@param number
	 */
	public void setWvUsdVariance(BigDecimal number)  throws CFException{
		work.setWvUsdVariance(number);
   }

	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntries();
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number)  throws CFException{
		ip00485MemberEntryInfo.setIp00485MemberEntries(number);
	}



	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo(number);
	}

	public void setIp66601UserTagSubfldNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}

	public void setIp66601UserTagSubfldNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus(int index) throws CFException  {              
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStatus();
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  @param value
	**/
   public void setIp66601UserTagStatus(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(value);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvKbblVol
	 *	@return wvKbblVol
	 */
   public char[] getWvKbblVol() throws CFException  {              
   		return work.getWvKbblVol();
   }

  
	/**
	*  set variable wvKbblVol
	*  @param value
	**/
   public void setWvKbblVol(char[] value) throws CFException {
      work.setWvKbblVol(value);
   } 

     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex) throws CFException {
      work.setWvKbblVol(source, sourceIndex);
   	
   }
   
   public void setWvKbblVol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvKbblVol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvKbblVol with another Field
	 *	@param value
	 */
   public void setWvKbblVol(Field source) {
      work.setWvKbblVol(source);
   }  
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getWvExposureInt() throws CFException {  
        return work.getWvExposureInt();
}
	/**
	 * 	Update WvExposureInt with the passed value
	 *	@param number
	 */
	public void setWvExposureInt(int number)  throws CFException{
		work.setWvExposureInt(number);
	}


	public void setWvExposureInt(long number)  throws CFException{
	    work.setWvExposureInt(number);
	}
	

	/**
	 *	Returns the value of ip00485UserTagStatus
	 *	@return ip00485UserTagStatus
	 */
   public char[] getIp00485UserTagStatus(int index) throws CFException  {              
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagStatus();
   }

  
	/**
	*  set variable ip00485UserTagStatus
	*  @param value
	**/
   public void setIp00485UserTagStatus(int index,char[] value) throws CFException {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(value);
   } 

     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00485UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00485UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00485UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
   		return work.getIdx();
	}


	/**
	 *	Returns String value of idx
	 *	@return idx
	 */
	public char[]  getIdxString() throws CFException {
	     return String.valueOf(work.getIdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idxIsNumeric()  throws CFException{
	    return work.idxIsNumeric();
	}

	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(int number)  throws CFException{
		work.setIdx(number);
	}
	

	public void setIdx(long number)  throws CFException{
	    work.setIdx(number);
	}
	
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value)  throws CFException {
		work.setIdx(value);
	}
	
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value)  throws CFException{
		work.setIdx(value);
	}	

	/**
	 *	Returns the value of biorptvlBatParmValNum
	 *	@return biorptvlBatParmValNum
	 */
	public int getBiorptvlBatParmValNum() throws CFException {        
   		return work.getBiorptvlBatParmValNum();
	}
	
	/**
	 * 	Update BiorptvlBatParmValNum with the passed value
	 *	@param number
	 */
	public void setBiorptvlBatParmValNum(int number)  throws CFException{
		work.setBiorptvlBatParmValNum(number);
	}


	public void setBiorptvlBatParmValNum(long number)  throws CFException{
		work.setBiorptvlBatParmValNum((int)number);
	}


	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo();
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo(number);
	}

	public void setIp66601UserTagNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}

	public void setIp66601UserTagNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}



	/**
	 *	Returns the value of ip00485UserTagOccurrence
	 *	@return ip00485UserTagOccurrence
	 */
	public short getIp00485UserTagOccurrence(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip00485UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagOccurrence(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence(number);
	}

	public void setIp00485UserTagOccurrence(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence((short)number);
	}

	public void setIp00485UserTagOccurrence(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagLngth();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth(number);
	}

	public void setIp66601UserTagLngth(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}

	public void setIp66601UserTagLngth(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}



	public BigDecimal getWvOrigCost() throws CFException{      
   		return work.getWvOrigCost();
	}

    public char[] getWvOrigCostString() throws CFException {
          return  work.getWvOrigCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvOrigCost with the passed number
	 *	@param number
	 */
	public void setWvOrigCost(BigDecimal number)  throws CFException{
		work.setWvOrigCost(number);
   }


public void setIp66601UserRight(int ip66601UserRight) { 
    Comput5Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Comput5Ctx.this.ip66601UserRight;
}
	/**
	 *	Returns the value of wvExtrUsdVar
	 *	@return wvExtrUsdVar
	 */
   public char[] getWvExtrUsdVar() throws CFException  {              
   		return work.getWvExtrUsdVar();
   }

  
	/**
	*  set variable wvExtrUsdVar
	*  @param value
	**/
   public void setWvExtrUsdVar(char[] value) throws CFException {
      work.setWvExtrUsdVar(value);
   } 

     /**
	 * 	Update WvExtrUsdVar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrUsdVar(char[] source, int sourceIndex) throws CFException {
      work.setWvExtrUsdVar(source, sourceIndex);
   	
   }
   
   public void setWvExtrUsdVar(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvExtrUsdVar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUsdVar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrUsdVar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrUsdVar with another Field
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source) {
      work.setWvExtrUsdVar(source);
   }  
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source, int sourceIndex,int sourceLen) {
      work.setWvExtrUsdVar(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrUsdVar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUsdVar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvExtrUsdVar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getPrclexpKbblVol() throws CFException{      
   		return work.getPrclexpKbblVol();
	}

    public char[] getPrclexpKbblVolString() throws CFException {
          return  work.getPrclexpKbblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclexpKbblVol with the passed number
	 *	@param number
	 */
	public void setPrclexpKbblVol(BigDecimal number)  throws CFException{
		work.setPrclexpKbblVol(number);
   }

	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence(number);
	}

	public void setIp66601UserTagOccurrence(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}

	public void setIp66601UserTagOccurrence(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}




public void setIp66601UserP(int ip66601UserP) { 
    Comput5Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Comput5Ctx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip00485UserTagSubfldNo
	 *	@return ip00485UserTagSubfldNo
	 */
	public short getIp00485UserTagSubfldNo(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip00485UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagSubfldNo(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo(number);
	}

	public void setIp00485UserTagSubfldNo(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo((short)number);
	}

	public void setIp00485UserTagSubfldNo(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485UserTagSubfldNo((short)number);
	}




public void setIp66601UserStart(int ip66601UserStart) { 
    Comput5Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Comput5Ctx.this.ip66601UserStart;
}
	/**
	 *	Returns the value of ip00485UserTagStart
	 *	@return ip00485UserTagStart
	 */
	public short getIp00485UserTagStart(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagStart();
	}
	
	/**
	 * 	Update Ip00485UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp00485UserTagStart(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart(number);
	}

	public void setIp00485UserTagStart(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart((short)number);
	}

	public void setIp00485UserTagStart(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).setIp00485UserTagStart((short)number);
	}




public void setIp66601UserMedian(int ip66601UserMedian) { 
    Comput5Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Comput5Ctx.this.ip66601UserMedian;
}

public void setIp66601UserLeft(int ip66601UserLeft) { 
    Comput5Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Comput5Ctx.this.ip66601UserLeft;
}
	public BigDecimal getWvLtstCost() throws CFException{      
   		return work.getWvLtstCost();
	}

    public char[] getWvLtstCostString() throws CFException {
          return  work.getWvLtstCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WvLtstCost with the passed number
	 *	@param number
	 */
	public void setWvLtstCost(BigDecimal number)  throws CFException{
		work.setWvLtstCost(number);
   }

	/**
	 *	Returns the value of ip00485MemberId
	 *	@return ip00485MemberId
	 */
	public short getIp00485MemberId(int index) throws CFException {        
   		return ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().getIp00485MemberId();
	}
	
	/**
	 * 	Update Ip00485MemberId with the passed value
	 *	@param number
	 */
	public void setIp00485MemberId(int index,short number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId(number);
	}

	public void setIp00485MemberId(int index,int number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}

	public void setIp00485MemberId(int index,long number)  throws CFException{
		ip00485MemberEntryInfo.getIp00485MemberEntry(index).getIp00485UserTagId().setIp00485MemberId((short)number);
	}




        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += ip00485MemberEntryInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit5OutCtx clone() {
        MainSplit5OutCtx cloneObj = new MainSplit5OutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip00485MemberEntryInfo = new Ip00485MemberEntryInfo();
        cloneObj.ip00485MemberEntryInfo.set(ip00485MemberEntryInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5OutCtx getMainSplit5OutCtx() {
            return new MainSplit5OutCtx();
    }
     public class MainSplit6InCtx implements Cloneable {
     Work work = Comput5Ctx.this.getWork();

	public BigDecimal getDealgpalAllocWgtnNum() throws CFException{      
   		return work.getDealgpalAllocWgtnNum();
	}

    public char[] getDealgpalAllocWgtnNumString() throws CFException {
          return  work.getDealgpalAllocWgtnNum().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DealgpalAllocWgtnNum with the passed number
	 *	@param number
	 */
	public void setDealgpalAllocWgtnNum(BigDecimal number)  throws CFException{
		work.setDealgpalAllocWgtnNum(number);
   }

	public BigDecimal getPrclexpKbblVol() throws CFException{      
   		return work.getPrclexpKbblVol();
	}

    public char[] getPrclexpKbblVolString() throws CFException {
          return  work.getPrclexpKbblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclexpKbblVol with the passed number
	 *	@param number
	 */
	public void setPrclexpKbblVol(BigDecimal number)  throws CFException{
		work.setPrclexpKbblVol(number);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public MainSplit6OutCtx getMainSplit6OutCtx() {
            return new MainSplit6OutCtx();
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

    public MainSplit6InCtx clone() {
        MainSplit6InCtx cloneObj = new MainSplit6InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit6InCtx getMainSplit6InCtx() {
            return new MainSplit6InCtx();
    }
     public class MainSplit6OutCtx implements Cloneable {
     Work work = Comput5Ctx.this.getWork();

	/**
	 *	Returns the value of wvKbblVol
	 *	@return wvKbblVol
	 */
   public char[] getWvKbblVol() throws CFException  {              
   		return work.getWvKbblVol();
   }

  
	/**
	*  set variable wvKbblVol
	*  @param value
	**/
   public void setWvKbblVol(char[] value) throws CFException {
      work.setWvKbblVol(value);
   } 

     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex) throws CFException {
      work.setWvKbblVol(source, sourceIndex);
   	
   }
   
   public void setWvKbblVol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWvKbblVol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvKbblVol with another Field
	 *	@param value
	 */
   public void setWvKbblVol(Field source) {
      work.setWvKbblVol(source);
   }  
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvKbblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvKbblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWvKbblVol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getPrclexpKbblVol() throws CFException{      
   		return work.getPrclexpKbblVol();
	}

    public char[] getPrclexpKbblVolString() throws CFException {
          return  work.getPrclexpKbblVol().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PrclexpKbblVol with the passed number
	 *	@param number
	 */
	public void setPrclexpKbblVol(BigDecimal number)  throws CFException{
		work.setPrclexpKbblVol(number);
   }


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
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

    public MainSplit6OutCtx clone() {
        MainSplit6OutCtx cloneObj = new MainSplit6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit6OutCtx getMainSplit6OutCtx() {
            return new MainSplit6OutCtx();
    }
     public class NumericCheckerInCtx implements Cloneable {
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvDecPartGroup wvDecPartGroup = Comput5Ctx.this.getWvDecPartGroup();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	/**
	 *	Returns the value of wvNumInp
	 *	@return wvNumInp
	 */
   public char[] getWvNumInp(int index) throws CFException  {              
   		return wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).getWvNumInp();
   }

  
	/**
	*  set variable wvNumInp
	*  @param value
	**/
   public void setWvNumInp(int index,char[] value) throws CFException {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(value);
   } 

     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumInp(int index,char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex);
   	
   }
   
   public void setWvNumInp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumInp with another Field
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source);
   }  
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvToNdx
	 *	@return wvToNdx
	 */
	public short getWvToNdx() throws CFException {
   		return work.getWvToNdx();
	}

    /**
	 *	Returns the String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxActualString() {
		return work.getWvToNdxActualString();
	}

	/**
	 *	Returns String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxString() throws CFException {
	     return String.valueOf(work.getWvToNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvToNdxIsNumeric()  throws CFException{
	    return work.wvToNdxIsNumeric();
	}

	/**
	 * 	Update WvToNdx with the passed value
	 *	@param number
	 */
	public void setWvToNdx(short number)  throws CFException{
		work.setWvToNdx(number);
	}
	
	public void setWvToNdx(int number)  throws CFException{
	    work.setWvToNdx(number);
	}
	public void setWvToNdx(long number)  throws CFException{
	    work.setWvToNdx(number);
	}
	

	
	/**
	 * 	Update WvToNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvToNdx(char[] value)  throws CFException {
		work.setWvToNdx(value);
	}
	
	/**
	 * 	Update WvToNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvToNdxString(char[] value)  throws CFException{
		work.setWvToNdx(value);
	}	

	/**
	 *	Returns the value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public short getWvFromNdx() throws CFException {
   		return work.getWvFromNdx();
	}

    /**
	 *	Returns the String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxActualString() {
		return work.getWvFromNdxActualString();
	}

	/**
	 *	Returns String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxString() throws CFException {
	     return String.valueOf(work.getWvFromNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvFromNdxIsNumeric()  throws CFException{
	    return work.wvFromNdxIsNumeric();
	}

	/**
	 * 	Update WvFromNdx with the passed value
	 *	@param number
	 */
	public void setWvFromNdx(short number)  throws CFException{
		work.setWvFromNdx(number);
	}
	
	public void setWvFromNdx(int number)  throws CFException{
	    work.setWvFromNdx(number);
	}
	public void setWvFromNdx(long number)  throws CFException{
	    work.setWvFromNdx(number);
	}
	

	
	/**
	 * 	Update WvFromNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvFromNdx(char[] value)  throws CFException {
		work.setWvFromNdx(value);
	}
	
	/**
	 * 	Update WvFromNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvFromNdxString(char[] value)  throws CFException{
		work.setWvFromNdx(value);
	}	

	/**
	 *	Returns the value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public short getWvDecCtr() throws CFException {
   		return work.getWvDecCtr();
	}

    /**
	 *	Returns the String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrActualString() {
		return work.getWvDecCtrActualString();
	}

	/**
	 *	Returns String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrString() throws CFException {
	     return String.valueOf(work.getWvDecCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvDecCtrIsNumeric()  throws CFException{
	    return work.wvDecCtrIsNumeric();
	}

	/**
	 * 	Update WvDecCtr with the passed value
	 *	@param number
	 */
	public void setWvDecCtr(short number)  throws CFException{
		work.setWvDecCtr(number);
	}
	
	public void setWvDecCtr(int number)  throws CFException{
	    work.setWvDecCtr(number);
	}
	public void setWvDecCtr(long number)  throws CFException{
	    work.setWvDecCtr(number);
	}
	

	
	/**
	 * 	Update WvDecCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvDecCtr(char[] value)  throws CFException {
		work.setWvDecCtr(value);
	}
	
	/**
	 * 	Update WvDecCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvDecCtrString(char[] value)  throws CFException{
		work.setWvDecCtr(value);
	}	

	/**
	 *	Returns the value of wvDecPartN
	 *	@return wvDecPartN
	 */
	public long getWvDecPartN() throws CFException {
   		return wvDecPartGroup.getWvDecPartN();
	}


	/**
	 *	Returns String value of wvDecPartN
	 *	@return wvDecPartN
	 */
	public char[]  getWvDecPartNString() throws CFException {
	     return String.valueOf(wvDecPartGroup.getWvDecPartNString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvDecPartNIsNumeric()  throws CFException{
	    return wvDecPartGroup.wvDecPartNIsNumeric();
	}

	/**
	 * 	Update WvDecPartN with the passed value
	 *	@param number
	 */
	public void setWvDecPartN(long number)  throws CFException{
		wvDecPartGroup.setWvDecPartN(number);
	}
	

	
	/**
	 * 	Update WvDecPartN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvDecPartN(char[] value)  throws CFException {
		wvDecPartGroup.setWvDecPartN(value);
	}
	
	/**
	 * 	Update WvDecPartN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvDecPartNString(char[] value)  throws CFException{
		wvDecPartGroup.setWvDecPartN(value);
	}	

	/**
	 *	Returns the value of wvNumericInput
	 *	@return wvNumericInput
	 */
   public char[] getWvNumericInput() throws CFException  {              
   		return wvNumericInputGroup.getWvNumericInput();
   }

  
	/**
	*  set variable wvNumericInput
	*  @param value
	**/
   public void setWvNumericInput(char[] value) throws CFException {
      wvNumericInputGroup.setWvNumericInput(value);
   } 

     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex);
   	
   }
   
   public void setWvNumericInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumericInput with another Field
	 *	@param value
	 */
   public void setWvNumericInput(Field source) {
      wvNumericInputGroup.setWvNumericInput(source);
   }  
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumericInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumericInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.setWvNumericInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public short getWvMaxIntDigits() throws CFException {
   		return work.getWvMaxIntDigits();
	}

    /**
	 *	Returns the String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsActualString() {
		return work.getWvMaxIntDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxIntDigits
	 *	@return wvMaxIntDigits
	 */
	public char[]  getWvMaxIntDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxIntDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxIntDigitsIsNumeric()  throws CFException{
	    return work.wvMaxIntDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxIntDigits(short number)  throws CFException{
		work.setWvMaxIntDigits(number);
	}
	
	public void setWvMaxIntDigits(int number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	public void setWvMaxIntDigits(long number)  throws CFException{
	    work.setWvMaxIntDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxIntDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigits(char[] value)  throws CFException {
		work.setWvMaxIntDigits(value);
	}
	
	/**
	 * 	Update WvMaxIntDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxIntDigitsString(char[] value)  throws CFException{
		work.setWvMaxIntDigits(value);
	}	

	/**
	 *	Returns the value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public short getWvSignCtr() throws CFException {
   		return work.getWvSignCtr();
	}

    /**
	 *	Returns the String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrActualString() {
		return work.getWvSignCtrActualString();
	}

	/**
	 *	Returns String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrString() throws CFException {
	     return String.valueOf(work.getWvSignCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvSignCtrIsNumeric()  throws CFException{
	    return work.wvSignCtrIsNumeric();
	}

	/**
	 * 	Update WvSignCtr with the passed value
	 *	@param number
	 */
	public void setWvSignCtr(short number)  throws CFException{
		work.setWvSignCtr(number);
	}
	
	public void setWvSignCtr(int number)  throws CFException{
	    work.setWvSignCtr(number);
	}
	public void setWvSignCtr(long number)  throws CFException{
	    work.setWvSignCtr(number);
	}
	

	
	/**
	 * 	Update WvSignCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvSignCtr(char[] value)  throws CFException {
		work.setWvSignCtr(value);
	}
	
	/**
	 * 	Update WvSignCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvSignCtrString(char[] value)  throws CFException{
		work.setWvSignCtr(value);
	}	

	/**
	 *	Returns the value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public long getWvIntPartN() throws CFException {
   		return wvIntPartGroup.getWvIntPartN();
	}


	/**
	 *	Returns String value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public char[]  getWvIntPartNString() throws CFException {
	     return String.valueOf(wvIntPartGroup.getWvIntPartNString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntPartNIsNumeric()  throws CFException{
	    return wvIntPartGroup.wvIntPartNIsNumeric();
	}

	/**
	 * 	Update WvIntPartN with the passed value
	 *	@param number
	 */
	public void setWvIntPartN(long number)  throws CFException{
		wvIntPartGroup.setWvIntPartN(number);
	}
	

	
	/**
	 * 	Update WvIntPartN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntPartN(char[] value)  throws CFException {
		wvIntPartGroup.setWvIntPartN(value);
	}
	
	/**
	 * 	Update WvIntPartN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntPartNString(char[] value)  throws CFException{
		wvIntPartGroup.setWvIntPartN(value);
	}	

	/**
	 *	Returns the value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public short getWvCommaCtr() throws CFException {
   		return work.getWvCommaCtr();
	}

    /**
	 *	Returns the String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrActualString() {
		return work.getWvCommaCtrActualString();
	}

	/**
	 *	Returns String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrString() throws CFException {
	     return String.valueOf(work.getWvCommaCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaCtrIsNumeric()  throws CFException{
	    return work.wvCommaCtrIsNumeric();
	}

	/**
	 * 	Update WvCommaCtr with the passed value
	 *	@param number
	 */
	public void setWvCommaCtr(short number)  throws CFException{
		work.setWvCommaCtr(number);
	}
	
	public void setWvCommaCtr(int number)  throws CFException{
	    work.setWvCommaCtr(number);
	}
	public void setWvCommaCtr(long number)  throws CFException{
	    work.setWvCommaCtr(number);
	}
	

	
	/**
	 * 	Update WvCommaCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtr(char[] value)  throws CFException {
		work.setWvCommaCtr(value);
	}
	
	/**
	 * 	Update WvCommaCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtrString(char[] value)  throws CFException{
		work.setWvCommaCtr(value);
	}	

	/**
	 *	Returns the value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public short getWvIntCtr() throws CFException {
   		return work.getWvIntCtr();
	}

    /**
	 *	Returns the String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrActualString() {
		return work.getWvIntCtrActualString();
	}

	/**
	 *	Returns String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrString() throws CFException {
	     return String.valueOf(work.getWvIntCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntCtrIsNumeric()  throws CFException{
	    return work.wvIntCtrIsNumeric();
	}

	/**
	 * 	Update WvIntCtr with the passed value
	 *	@param number
	 */
	public void setWvIntCtr(short number)  throws CFException{
		work.setWvIntCtr(number);
	}
	
	public void setWvIntCtr(int number)  throws CFException{
	    work.setWvIntCtr(number);
	}
	public void setWvIntCtr(long number)  throws CFException{
	    work.setWvIntCtr(number);
	}
	

	
	/**
	 * 	Update WvIntCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntCtr(char[] value)  throws CFException {
		work.setWvIntCtr(value);
	}
	
	/**
	 * 	Update WvIntCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntCtrString(char[] value)  throws CFException{
		work.setWvIntCtr(value);
	}	

	/**
	 *	Returns the value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public short getWvCommaNdx() throws CFException {
   		return work.getWvCommaNdx();
	}

    /**
	 *	Returns the String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxActualString() {
		return work.getWvCommaNdxActualString();
	}

	/**
	 *	Returns String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxString() throws CFException {
	     return String.valueOf(work.getWvCommaNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaNdxIsNumeric()  throws CFException{
	    return work.wvCommaNdxIsNumeric();
	}

	/**
	 * 	Update WvCommaNdx with the passed value
	 *	@param number
	 */
	public void setWvCommaNdx(short number)  throws CFException{
		work.setWvCommaNdx(number);
	}
	
	public void setWvCommaNdx(int number)  throws CFException{
	    work.setWvCommaNdx(number);
	}
	public void setWvCommaNdx(long number)  throws CFException{
	    work.setWvCommaNdx(number);
	}
	

	
	/**
	 * 	Update WvCommaNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdx(char[] value)  throws CFException {
		work.setWvCommaNdx(value);
	}
	
	/**
	 * 	Update WvCommaNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdxString(char[] value)  throws CFException{
		work.setWvCommaNdx(value);
	}	

	/**
	 *	Returns the value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public short getWvMaxDecDigits() throws CFException {
   		return work.getWvMaxDecDigits();
	}

    /**
	 *	Returns the String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsActualString() {
		return work.getWvMaxDecDigitsActualString();
	}

	/**
	 *	Returns String value of wvMaxDecDigits
	 *	@return wvMaxDecDigits
	 */
	public char[]  getWvMaxDecDigitsString() throws CFException {
	     return String.valueOf(work.getWvMaxDecDigitsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvMaxDecDigitsIsNumeric()  throws CFException{
	    return work.wvMaxDecDigitsIsNumeric();
	}

	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param number
	 */
	public void setWvMaxDecDigits(short number)  throws CFException{
		work.setWvMaxDecDigits(number);
	}
	
	public void setWvMaxDecDigits(int number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	public void setWvMaxDecDigits(long number)  throws CFException{
	    work.setWvMaxDecDigits(number);
	}
	

	
	/**
	 * 	Update WvMaxDecDigits with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigits(char[] value)  throws CFException {
		work.setWvMaxDecDigits(value);
	}
	
	/**
	 * 	Update WvMaxDecDigits with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvMaxDecDigitsString(char[] value)  throws CFException{
		work.setWvMaxDecDigits(value);
	}	


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }

        public NumericCheckerOutCtx getNumericCheckerOutCtx() {
            return new NumericCheckerOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvDecPartGroup.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public NumericCheckerInCtx clone() {
        NumericCheckerInCtx cloneObj = new NumericCheckerInCtx();
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvDecPartGroup = new WvDecPartGroup();
        cloneObj.wvDecPartGroup.set(wvDecPartGroup.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public NumericCheckerInCtx getNumericCheckerInCtx() {
            return new NumericCheckerInCtx();
    }
     public class NumericCheckerOutCtx implements Cloneable {
     WvIntPartGroup wvIntPartGroup = Comput5Ctx.this.getWvIntPartGroup();
     Work work = Comput5Ctx.this.getWork();
     WvDecPartGroup wvDecPartGroup = Comput5Ctx.this.getWvDecPartGroup();
     WvNumericInputGroup wvNumericInputGroup = Comput5Ctx.this.getWvNumericInputGroup();

	/**
	 *	Returns the value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public short getWvFldsFilled() throws CFException {
   		return work.getWvFldsFilled();
	}

    /**
	 *	Returns the String value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public char[]  getWvFldsFilledActualString() {
		return work.getWvFldsFilledActualString();
	}

	/**
	 *	Returns String value of wvFldsFilled
	 *	@return wvFldsFilled
	 */
	public char[]  getWvFldsFilledString() throws CFException {
	     return String.valueOf(work.getWvFldsFilledString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvFldsFilledIsNumeric()  throws CFException{
	    return work.wvFldsFilledIsNumeric();
	}

	/**
	 * 	Update WvFldsFilled with the passed value
	 *	@param number
	 */
	public void setWvFldsFilled(short number)  throws CFException{
		work.setWvFldsFilled(number);
	}
	
	public void setWvFldsFilled(int number)  throws CFException{
	    work.setWvFldsFilled(number);
	}
	public void setWvFldsFilled(long number)  throws CFException{
	    work.setWvFldsFilled(number);
	}
	

	
	/**
	 * 	Update WvFldsFilled with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvFldsFilled(char[] value)  throws CFException {
		work.setWvFldsFilled(value);
	}
	
	/**
	 * 	Update WvFldsFilled with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvFldsFilledString(char[] value)  throws CFException{
		work.setWvFldsFilled(value);
	}	

	/**
	 *	Test condition " " for isWvIntPartOk()
	 *	@return  Returns true if isWvIntPartOk() is " "
	 */
   public boolean isWvIntPartOk() throws CFException {
      return work.isWvIntPartOk();
   }

	/**
	*  set values " "
	*/
   	public void setWvIntPartOkTrue()  throws CFException{  			
    	work.setWvIntPartOkTrue();
   	}
	/**
	 *	Returns the value of wvNumInp
	 *	@return wvNumInp
	 */
   public char[] getWvNumInp(int index) throws CFException  {              
   		return wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).getWvNumInp();
   }

  
	/**
	*  set variable wvNumInp
	*  @param value
	**/
   public void setWvNumInp(int index,char[] value) throws CFException {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(value);
   } 

     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumInp(int index,char[] source, int sourceIndex) throws CFException {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex);
   	
   }
   
   public void setWvNumInp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvNumInp with another Field
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source);
   }  
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source, int sourceIndex,int sourceLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvNumericInputGroup.getWvNumInpArray().getWvNumInpItem(index).setWvNumInp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isWvNumericNotOk()
	 *	@return  Returns true if isWvNumericNotOk() is "N"
	 */
   public boolean isWvNumericNotOk() throws CFException {
      return work.isWvNumericNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvNumericNotOkTrue()  throws CFException{  			
    	work.setWvNumericNotOkTrue();
   	}
	/**
	 *	Returns the value of wvToNdx
	 *	@return wvToNdx
	 */
	public short getWvToNdx() throws CFException {
   		return work.getWvToNdx();
	}

    /**
	 *	Returns the String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxActualString() {
		return work.getWvToNdxActualString();
	}

	/**
	 *	Returns String value of wvToNdx
	 *	@return wvToNdx
	 */
	public char[]  getWvToNdxString() throws CFException {
	     return String.valueOf(work.getWvToNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvToNdxIsNumeric()  throws CFException{
	    return work.wvToNdxIsNumeric();
	}

	/**
	 * 	Update WvToNdx with the passed value
	 *	@param number
	 */
	public void setWvToNdx(short number)  throws CFException{
		work.setWvToNdx(number);
	}
	
	public void setWvToNdx(int number)  throws CFException{
	    work.setWvToNdx(number);
	}
	public void setWvToNdx(long number)  throws CFException{
	    work.setWvToNdx(number);
	}
	

	
	/**
	 * 	Update WvToNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvToNdx(char[] value)  throws CFException {
		work.setWvToNdx(value);
	}
	
	/**
	 * 	Update WvToNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvToNdxString(char[] value)  throws CFException{
		work.setWvToNdx(value);
	}	

	/**
	 *	Test condition "N" for isWvNegative()
	 *	@return  Returns true if isWvNegative() is "N"
	 */
   public boolean isWvNegative() throws CFException {
      return work.isWvNegative();
   }

	/**
	*  set values "N"
	*/
   	public void setWvNegativeTrue()  throws CFException{  			
    	work.setWvNegativeTrue();
   	}
	/**
	 *	Returns the value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public short getWvFromNdx() throws CFException {
   		return work.getWvFromNdx();
	}

    /**
	 *	Returns the String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxActualString() {
		return work.getWvFromNdxActualString();
	}

	/**
	 *	Returns String value of wvFromNdx
	 *	@return wvFromNdx
	 */
	public char[]  getWvFromNdxString() throws CFException {
	     return String.valueOf(work.getWvFromNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvFromNdxIsNumeric()  throws CFException{
	    return work.wvFromNdxIsNumeric();
	}

	/**
	 * 	Update WvFromNdx with the passed value
	 *	@param number
	 */
	public void setWvFromNdx(short number)  throws CFException{
		work.setWvFromNdx(number);
	}
	
	public void setWvFromNdx(int number)  throws CFException{
	    work.setWvFromNdx(number);
	}
	public void setWvFromNdx(long number)  throws CFException{
	    work.setWvFromNdx(number);
	}
	

	
	/**
	 * 	Update WvFromNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvFromNdx(char[] value)  throws CFException {
		work.setWvFromNdx(value);
	}
	
	/**
	 * 	Update WvFromNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvFromNdxString(char[] value)  throws CFException{
		work.setWvFromNdx(value);
	}	

	/**
	 *	Test condition " " for isWvDecPartOk()
	 *	@return  Returns true if isWvDecPartOk() is " "
	 */
   public boolean isWvDecPartOk() throws CFException {
      return work.isWvDecPartOk();
   }

	/**
	*  set values " "
	*/
   	public void setWvDecPartOkTrue()  throws CFException{  			
    	work.setWvDecPartOkTrue();
   	}
	/**
	 *	Test condition "N" for isWvDecPartNotOk()
	 *	@return  Returns true if isWvDecPartNotOk() is "N"
	 */
   public boolean isWvDecPartNotOk() throws CFException {
      return work.isWvDecPartNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvDecPartNotOkTrue()  throws CFException{  			
    	work.setWvDecPartNotOkTrue();
   	}
	/**
	 *	Returns the value of wvIntPart
	 *	@return wvIntPart
	 */
   public char[] getWvIntPart() throws CFException  {              
   		return wvIntPartGroup.getWvIntPart();
   }

  
	/**
	*  set variable wvIntPart
	*  @param value
	**/
   public void setWvIntPart(char[] value) throws CFException {
      wvIntPartGroup.setWvIntPart(value);
   } 

     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex) throws CFException {
      wvIntPartGroup.setWvIntPart(source, sourceIndex);
   	
   }
   
   public void setWvIntPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvIntPart with another Field
	 *	@param value
	 */
   public void setWvIntPart(Field source) {
      wvIntPartGroup.setWvIntPart(source);
   }  
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvIntPartGroup.setWvIntPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvDecPart
	 *	@return wvDecPart
	 */
   public char[] getWvDecPart() throws CFException  {              
   		return wvDecPartGroup.getWvDecPart();
   }

  
	/**
	*  set variable wvDecPart
	*  @param value
	**/
   public void setWvDecPart(char[] value) throws CFException {
      wvDecPartGroup.setWvDecPart(value);
   } 

     /**
	 * 	Update WvDecPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvDecPart(char[] source, int sourceIndex) throws CFException {
      wvDecPartGroup.setWvDecPart(source, sourceIndex);
   	
   }
   
   public void setWvDecPart(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvDecPartGroup.setWvDecPart(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvDecPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvDecPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvDecPartGroup.setWvDecPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvDecPart with another Field
	 *	@param value
	 */
   public void setWvDecPart(Field source) {
      wvDecPartGroup.setWvDecPart(source);
   }  
   
     /**
	 * 	Update WvDecPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvDecPart(Field source, int sourceIndex,int sourceLen) {
      wvDecPartGroup.setWvDecPart(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvDecPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvDecPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvDecPartGroup.setWvDecPart(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public short getWvDecCtr() throws CFException {
   		return work.getWvDecCtr();
	}

    /**
	 *	Returns the String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrActualString() {
		return work.getWvDecCtrActualString();
	}

	/**
	 *	Returns String value of wvDecCtr
	 *	@return wvDecCtr
	 */
	public char[]  getWvDecCtrString() throws CFException {
	     return String.valueOf(work.getWvDecCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvDecCtrIsNumeric()  throws CFException{
	    return work.wvDecCtrIsNumeric();
	}

	/**
	 * 	Update WvDecCtr with the passed value
	 *	@param number
	 */
	public void setWvDecCtr(short number)  throws CFException{
		work.setWvDecCtr(number);
	}
	
	public void setWvDecCtr(int number)  throws CFException{
	    work.setWvDecCtr(number);
	}
	public void setWvDecCtr(long number)  throws CFException{
	    work.setWvDecCtr(number);
	}
	

	
	/**
	 * 	Update WvDecCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvDecCtr(char[] value)  throws CFException {
		work.setWvDecCtr(value);
	}
	
	/**
	 * 	Update WvDecCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvDecCtrString(char[] value)  throws CFException{
		work.setWvDecCtr(value);
	}	

	/**
	 *	Returns the value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public BigDecimal getWvNumericOutput() throws CFException {
   		return work.getWvNumericOutput();
	}

    /**
	 *	Returns the String value of wvNumericOutput
	 *	@return wvNumericOutput
	 */
	public char[]  getWvNumericOutputActualString()  throws CFException{
	    return work.getWvNumericOutputActualString();
	}

	 /**
     *	Returns String value of wvNumericOutput
     *	@return wvNumericOutput
     */
    public char[]  getWvNumericOutputString() throws CFException {
         return work.getWvNumericOutputString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wvNumericOutputIsNumeric() {
        return work.wvNumericOutputIsNumeric();
    }
	/**
	 * 	Update WvNumericOutput with the passed number
	 *	@param number
	 */
	public void setWvNumericOutput(BigDecimal number)  throws CFException{
		work.setWvNumericOutput(number);
   }

	/**
	 * 	Update WvNumericOutput with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWvNumericOutput(char[] value)  throws CFException{
		work.setWvNumericOutput(value);
	}   

	/**
	 *	Test condition " " for isWvNumericOk()
	 *	@return  Returns true if isWvNumericOk() is " "
	 */
   public boolean isWvNumericOk() throws CFException {
      return work.isWvNumericOk();
   }

	/**
	*  set values " "
	*/
   	public void setWvNumericOkTrue()  throws CFException{  			
    	work.setWvNumericOkTrue();
   	}
	/**
	 *	Returns the value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public short getWvSignCtr() throws CFException {
   		return work.getWvSignCtr();
	}

    /**
	 *	Returns the String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrActualString() {
		return work.getWvSignCtrActualString();
	}

	/**
	 *	Returns String value of wvSignCtr
	 *	@return wvSignCtr
	 */
	public char[]  getWvSignCtrString() throws CFException {
	     return String.valueOf(work.getWvSignCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvSignCtrIsNumeric()  throws CFException{
	    return work.wvSignCtrIsNumeric();
	}

	/**
	 * 	Update WvSignCtr with the passed value
	 *	@param number
	 */
	public void setWvSignCtr(short number)  throws CFException{
		work.setWvSignCtr(number);
	}
	
	public void setWvSignCtr(int number)  throws CFException{
	    work.setWvSignCtr(number);
	}
	public void setWvSignCtr(long number)  throws CFException{
	    work.setWvSignCtr(number);
	}
	

	
	/**
	 * 	Update WvSignCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvSignCtr(char[] value)  throws CFException {
		work.setWvSignCtr(value);
	}
	
	/**
	 * 	Update WvSignCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvSignCtrString(char[] value)  throws CFException{
		work.setWvSignCtr(value);
	}	

	/**
	 *	Returns the value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public long getWvIntPartN() throws CFException {
   		return wvIntPartGroup.getWvIntPartN();
	}


	/**
	 *	Returns String value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public char[]  getWvIntPartNString() throws CFException {
	     return String.valueOf(wvIntPartGroup.getWvIntPartNString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntPartNIsNumeric()  throws CFException{
	    return wvIntPartGroup.wvIntPartNIsNumeric();
	}

	/**
	 * 	Update WvIntPartN with the passed value
	 *	@param number
	 */
	public void setWvIntPartN(long number)  throws CFException{
		wvIntPartGroup.setWvIntPartN(number);
	}
	

	
	/**
	 * 	Update WvIntPartN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntPartN(char[] value)  throws CFException {
		wvIntPartGroup.setWvIntPartN(value);
	}
	
	/**
	 * 	Update WvIntPartN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntPartNString(char[] value)  throws CFException{
		wvIntPartGroup.setWvIntPartN(value);
	}	

	/**
	 *	Returns the value of wvDltr1
	 *	@return wvDltr1
	 */
   public char[] getWvDltr1() throws CFException  {              
   		return work.getWvDltr1();
   }

  
	/**
	*  set variable wvDltr1
	*  @param value
	**/
   public void setWvDltr1(char[] value) throws CFException {
      work.setWvDltr1(value);
   } 

	/**
	 *	Returns the value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public short getWvCommaCtr() throws CFException {
   		return work.getWvCommaCtr();
	}

    /**
	 *	Returns the String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrActualString() {
		return work.getWvCommaCtrActualString();
	}

	/**
	 *	Returns String value of wvCommaCtr
	 *	@return wvCommaCtr
	 */
	public char[]  getWvCommaCtrString() throws CFException {
	     return String.valueOf(work.getWvCommaCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaCtrIsNumeric()  throws CFException{
	    return work.wvCommaCtrIsNumeric();
	}

	/**
	 * 	Update WvCommaCtr with the passed value
	 *	@param number
	 */
	public void setWvCommaCtr(short number)  throws CFException{
		work.setWvCommaCtr(number);
	}
	
	public void setWvCommaCtr(int number)  throws CFException{
	    work.setWvCommaCtr(number);
	}
	public void setWvCommaCtr(long number)  throws CFException{
	    work.setWvCommaCtr(number);
	}
	

	
	/**
	 * 	Update WvCommaCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtr(char[] value)  throws CFException {
		work.setWvCommaCtr(value);
	}
	
	/**
	 * 	Update WvCommaCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaCtrString(char[] value)  throws CFException{
		work.setWvCommaCtr(value);
	}	

	/**
	 *	Returns the value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public short getWvStartPosn() throws CFException {
   		return work.getWvStartPosn();
	}

    /**
	 *	Returns the String value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public char[]  getWvStartPosnActualString() {
		return work.getWvStartPosnActualString();
	}

	/**
	 *	Returns String value of wvStartPosn
	 *	@return wvStartPosn
	 */
	public char[]  getWvStartPosnString() throws CFException {
	     return String.valueOf(work.getWvStartPosnString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvStartPosnIsNumeric()  throws CFException{
	    return work.wvStartPosnIsNumeric();
	}

	/**
	 * 	Update WvStartPosn with the passed value
	 *	@param number
	 */
	public void setWvStartPosn(short number)  throws CFException{
		work.setWvStartPosn(number);
	}
	
	public void setWvStartPosn(int number)  throws CFException{
	    work.setWvStartPosn(number);
	}
	public void setWvStartPosn(long number)  throws CFException{
	    work.setWvStartPosn(number);
	}
	

	
	/**
	 * 	Update WvStartPosn with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvStartPosn(char[] value)  throws CFException {
		work.setWvStartPosn(value);
	}
	
	/**
	 * 	Update WvStartPosn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvStartPosnString(char[] value)  throws CFException{
		work.setWvStartPosn(value);
	}	

	/**
	 *	Test condition "P" for isWvPositive()
	 *	@return  Returns true if isWvPositive() is "P"
	 */
   public boolean isWvPositive() throws CFException {
      return work.isWvPositive();
   }

	/**
	*  set values "P"
	*/
   	public void setWvPositiveTrue()  throws CFException{  			
    	work.setWvPositiveTrue();
   	}
	/**
	 *	Test condition "N" for isWvIntPartNotOk()
	 *	@return  Returns true if isWvIntPartNotOk() is "N"
	 */
   public boolean isWvIntPartNotOk() throws CFException {
      return work.isWvIntPartNotOk();
   }

	/**
	*  set values "N"
	*/
   	public void setWvIntPartNotOkTrue()  throws CFException{  			
    	work.setWvIntPartNotOkTrue();
   	}
	/**
	 *	Returns the value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public short getWvIntCtr() throws CFException {
   		return work.getWvIntCtr();
	}

    /**
	 *	Returns the String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrActualString() {
		return work.getWvIntCtrActualString();
	}

	/**
	 *	Returns String value of wvIntCtr
	 *	@return wvIntCtr
	 */
	public char[]  getWvIntCtrString() throws CFException {
	     return String.valueOf(work.getWvIntCtrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvIntCtrIsNumeric()  throws CFException{
	    return work.wvIntCtrIsNumeric();
	}

	/**
	 * 	Update WvIntCtr with the passed value
	 *	@param number
	 */
	public void setWvIntCtr(short number)  throws CFException{
		work.setWvIntCtr(number);
	}
	
	public void setWvIntCtr(int number)  throws CFException{
	    work.setWvIntCtr(number);
	}
	public void setWvIntCtr(long number)  throws CFException{
	    work.setWvIntCtr(number);
	}
	

	
	/**
	 * 	Update WvIntCtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntCtr(char[] value)  throws CFException {
		work.setWvIntCtr(value);
	}
	
	/**
	 * 	Update WvIntCtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntCtrString(char[] value)  throws CFException{
		work.setWvIntCtr(value);
	}	

	/**
	 *	Returns the value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public short getWvCommaNdx() throws CFException {
   		return work.getWvCommaNdx();
	}

    /**
	 *	Returns the String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxActualString() {
		return work.getWvCommaNdxActualString();
	}

	/**
	 *	Returns String value of wvCommaNdx
	 *	@return wvCommaNdx
	 */
	public char[]  getWvCommaNdxString() throws CFException {
	     return String.valueOf(work.getWvCommaNdxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wvCommaNdxIsNumeric()  throws CFException{
	    return work.wvCommaNdxIsNumeric();
	}

	/**
	 * 	Update WvCommaNdx with the passed value
	 *	@param number
	 */
	public void setWvCommaNdx(short number)  throws CFException{
		work.setWvCommaNdx(number);
	}
	
	public void setWvCommaNdx(int number)  throws CFException{
	    work.setWvCommaNdx(number);
	}
	public void setWvCommaNdx(long number)  throws CFException{
	    work.setWvCommaNdx(number);
	}
	

	
	/**
	 * 	Update WvCommaNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdx(char[] value)  throws CFException {
		work.setWvCommaNdx(value);
	}
	
	/**
	 * 	Update WvCommaNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvCommaNdxString(char[] value)  throws CFException{
		work.setWvCommaNdx(value);
	}	


        public Comput5Ctx getComput5Ctx() {
            return Comput5Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wvIntPartGroup.hashCode();
        str += work.hashCode();
        str += wvDecPartGroup.hashCode();
        str += wvNumericInputGroup.hashCode();
       return str.hashCode();
    }

    public NumericCheckerOutCtx clone() {
        NumericCheckerOutCtx cloneObj = new NumericCheckerOutCtx();
        cloneObj.wvIntPartGroup = new WvIntPartGroup();
        cloneObj.wvIntPartGroup.set(wvIntPartGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wvDecPartGroup = new WvDecPartGroup();
        cloneObj.wvDecPartGroup.set(wvDecPartGroup.getClonedField());
        cloneObj.wvNumericInputGroup = new WvNumericInputGroup();
        cloneObj.wvNumericInputGroup.set(wvNumericInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public NumericCheckerOutCtx getNumericCheckerOutCtx() {
            return new NumericCheckerOutCtx();
    }
}
