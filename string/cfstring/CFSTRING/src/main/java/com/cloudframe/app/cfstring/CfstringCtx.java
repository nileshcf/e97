package com.cloudframe.app.cfstring;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfstring.dto.ExtActEffDt;
import com.cloudframe.app.cfstring.dto.ExtractRec;
import com.cloudframe.app.cfstring.dto.Work;
import com.cloudframe.app.cfstring.dto.ExtBillCycleDt;
import com.cloudframe.app.cfstring.dto.ExtServiceStartDt;


@Context
public class CfstringCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    ExtractRec extractRec;


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
    public ExtractRec getExtractRec() {
        if (extractRec == null) {
            extractRec = new ExtractRec();
        }

        return extractRec;
    }

    public void setExtractRec(ExtractRec extractRec) {
        this.extractRec = extractRec;
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
        str += extractRec.hashCode();
       return str.hashCode();
    }

    public CfstringCtx clone() {
        CfstringCtx cloneObj = new CfstringCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.extractRec = new ExtractRec();
        cloneObj.extractRec.set(extractRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InspectInCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of cnt1
	 *	@return cnt1
	 */
	public int getCnt1() throws CFException {
   		return work.getCnt1();
	}


	/**
	 *	Returns String value of cnt1
	 *	@return cnt1
	 */
	public char[]  getCnt1String() throws CFException {
	     return String.valueOf(work.getCnt1String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnt1IsNumeric()  throws CFException{
	    return work.cnt1IsNumeric();
	}

	/**
	 * 	Update Cnt1 with the passed value
	 *	@param number
	 */
	public void setCnt1(int number)  throws CFException{
		work.setCnt1(number);
	}
	

	public void setCnt1(long number)  throws CFException{
	    work.setCnt1(number);
	}
	
	
	/**
	 * 	Update Cnt1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt1(char[] value)  throws CFException {
		work.setCnt1(value);
	}
	
	/**
	 * 	Update Cnt1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnt1String(char[] value)  throws CFException{
		work.setCnt1(value);
	}	

	/**
	 *	Returns the value of string1
	 *	@return string1
	 */
   public char[] getString1() throws CFException  {              
   		return work.getString1();
   }

  
	/**
	*  set variable string1
	*  @param value
	**/
   public void setString1(char[] value) throws CFException {
      work.setString1(value);
   } 


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
        }

        public InspectOutCtx getInspectOutCtx() {
            return new InspectOutCtx();
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

    public InspectInCtx clone() {
        InspectInCtx cloneObj = new InspectInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InspectInCtx getInspectInCtx() {
            return new InspectInCtx();
    }
     public class InspectOutCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of holdString
	 *	@return holdString
	 */
   public char[] getHoldString() throws CFException  {              
   		return work.getHoldString();
   }

  
	/**
	*  set variable holdString
	*  @param value
	**/
   public void setHoldString(char[] value) throws CFException {
      work.setHoldString(value);
   } 

	/**
	 *	Returns the value of string1
	 *	@return string1
	 */
   public char[] getString1() throws CFException  {              
   		return work.getString1();
   }

  
	/**
	*  set variable string1
	*  @param value
	**/
   public void setString1(char[] value) throws CFException {
      work.setString1(value);
   } 


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
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

    public InspectOutCtx clone() {
        InspectOutCtx cloneObj = new InspectOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InspectOutCtx getInspectOutCtx() {
            return new InspectOutCtx();
    }
     public class Unstring1InCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {        
   		return work.getP3Cnt();
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *	@param number
	 */
	public void setP3Cnt(int number)  throws CFException{
		work.setP3Cnt(number);
	}


	public void setP3Cnt(long number)  throws CFException{
		work.setP3Cnt((int)number);
	}


	/**
	 *	Returns the value of holdString
	 *	@return holdString
	 */
   public char[] getHoldString() throws CFException  {              
   		return work.getHoldString();
   }

  
	/**
	*  set variable holdString
	*  @param value
	**/
   public void setHoldString(char[] value) throws CFException {
      work.setHoldString(value);
   } 

	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {        
   		return work.getP1Cnt();
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *	@param number
	 */
	public void setP1Cnt(int number)  throws CFException{
		work.setP1Cnt(number);
	}


	public void setP1Cnt(long number)  throws CFException{
		work.setP1Cnt((int)number);
	}


	/**
	 *	Returns the value of string1
	 *	@return string1
	 */
   public char[] getString1() throws CFException  {              
   		return work.getString1();
   }

  
	/**
	*  set variable string1
	*  @param value
	**/
   public void setString1(char[] value) throws CFException {
      work.setString1(value);
   } 


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
        }

        public Unstring1OutCtx getUnstring1OutCtx() {
            return new Unstring1OutCtx();
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

    public Unstring1InCtx clone() {
        Unstring1InCtx cloneObj = new Unstring1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Unstring1InCtx getUnstring1InCtx() {
            return new Unstring1InCtx();
    }
     public class Unstring1OutCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {        
   		return work.getP3Cnt();
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *	@param number
	 */
	public void setP3Cnt(int number)  throws CFException{
		work.setP3Cnt(number);
	}


	public void setP3Cnt(long number)  throws CFException{
		work.setP3Cnt((int)number);
	}


	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException  {              
   		return work.getEdit();
   }

  
	/**
	*  set variable edit
	*  @param value
	**/
   public void setEdit(char[] value) throws CFException {
      work.setEdit(value);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) throws CFException {
      work.setEdit(source, sourceIndex);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
      work.setEdit(source);
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
      work.setEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parm6
	 *	@return parm6
	 */
   public char[] getParm6() throws CFException  {              
   		return work.getParm6();
   }

  
	/**
	*  set variable parm6
	*  @param value
	**/
   public void setParm6(char[] value) throws CFException {
      work.setParm6(value);
   } 

	/**
	 *	Returns the value of p4Cnt
	 *	@return p4Cnt
	 */
	public int getP4Cnt() throws CFException {        
   		return work.getP4Cnt();
	}
	
	/**
	 * 	Update P4Cnt with the passed value
	 *	@param number
	 */
	public void setP4Cnt(int number)  throws CFException{
		work.setP4Cnt(number);
	}


	public void setP4Cnt(long number)  throws CFException{
		work.setP4Cnt((int)number);
	}


	/**
	 *	Returns the value of parm2
	 *	@return parm2
	 */
   public char[] getParm2() throws CFException  {              
   		return work.getParm2();
   }

  
	/**
	*  set variable parm2
	*  @param value
	**/
   public void setParm2(char[] value) throws CFException {
      work.setParm2(value);
   } 

	/**
	 *	Returns the value of parm4
	 *	@return parm4
	 */
   public char[] getParm4() throws CFException  {              
   		return work.getParm4();
   }

  
	/**
	*  set variable parm4
	*  @param value
	**/
   public void setParm4(char[] value) throws CFException {
      work.setParm4(value);
   } 

	/**
	 *	Returns the value of parm1
	 *	@return parm1
	 */
   public char[] getParm1() throws CFException  {              
   		return work.getParm1();
   }

  
	/**
	*  set variable parm1
	*  @param value
	**/
   public void setParm1(char[] value) throws CFException {
      work.setParm1(value);
   } 

	/**
	 *	Returns the value of parm5
	 *	@return parm5
	 */
   public char[] getParm5() throws CFException  {              
   		return work.getParm5();
   }

  
	/**
	*  set variable parm5
	*  @param value
	**/
   public void setParm5(char[] value) throws CFException {
      work.setParm5(value);
   } 

	/**
	 *	Returns the value of p6Cnt
	 *	@return p6Cnt
	 */
	public int getP6Cnt() throws CFException {        
   		return work.getP6Cnt();
	}
	
	/**
	 * 	Update P6Cnt with the passed value
	 *	@param number
	 */
	public void setP6Cnt(int number)  throws CFException{
		work.setP6Cnt(number);
	}


	public void setP6Cnt(long number)  throws CFException{
		work.setP6Cnt((int)number);
	}


	/**
	 *	Returns the value of string2
	 *	@return string2
	 */
   public char[] getString2() throws CFException  {              
   		return work.getString2();
   }

  
	/**
	*  set variable string2
	*  @param value
	**/
   public void setString2(char[] value) throws CFException {
      work.setString2(value);
   } 

	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {        
   		return work.getP1Cnt();
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *	@param number
	 */
	public void setP1Cnt(int number)  throws CFException{
		work.setP1Cnt(number);
	}


	public void setP1Cnt(long number)  throws CFException{
		work.setP1Cnt((int)number);
	}


	/**
	 *	Returns the value of p5Cnt
	 *	@return p5Cnt
	 */
	public int getP5Cnt() throws CFException {        
   		return work.getP5Cnt();
	}
	
	/**
	 * 	Update P5Cnt with the passed value
	 *	@param number
	 */
	public void setP5Cnt(int number)  throws CFException{
		work.setP5Cnt(number);
	}


	public void setP5Cnt(long number)  throws CFException{
		work.setP5Cnt((int)number);
	}


	/**
	 *	Returns the value of parm3
	 *	@return parm3
	 */
   public char[] getParm3() throws CFException  {              
   		return work.getParm3();
   }

  
	/**
	*  set variable parm3
	*  @param value
	**/
   public void setParm3(char[] value) throws CFException {
      work.setParm3(value);
   } 

	/**
	 *	Returns the value of p2Cnt
	 *	@return p2Cnt
	 */
	public int getP2Cnt() throws CFException {        
   		return work.getP2Cnt();
	}
	
	/**
	 * 	Update P2Cnt with the passed value
	 *	@param number
	 */
	public void setP2Cnt(int number)  throws CFException{
		work.setP2Cnt(number);
	}


	public void setP2Cnt(long number)  throws CFException{
		work.setP2Cnt((int)number);
	}



        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
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

    public Unstring1OutCtx clone() {
        Unstring1OutCtx cloneObj = new Unstring1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Unstring1OutCtx getUnstring1OutCtx() {
            return new Unstring1OutCtx();
    }
     public class Unstring2InCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of string1
	 *	@return string1
	 */
   public char[] getString1() throws CFException  {              
   		return work.getString1();
   }

  
	/**
	*  set variable string1
	*  @param value
	**/
   public void setString1(char[] value) throws CFException {
      work.setString1(value);
   } 


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
        }

        public Unstring2OutCtx getUnstring2OutCtx() {
            return new Unstring2OutCtx();
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

    public Unstring2InCtx clone() {
        Unstring2InCtx cloneObj = new Unstring2InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Unstring2InCtx getUnstring2InCtx() {
            return new Unstring2InCtx();
    }
     public class Unstring2OutCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {        
   		return work.getP3Cnt();
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *	@param number
	 */
	public void setP3Cnt(int number)  throws CFException{
		work.setP3Cnt(number);
	}


	public void setP3Cnt(long number)  throws CFException{
		work.setP3Cnt((int)number);
	}


	/**
	 *	Returns the value of parm1
	 *	@return parm1
	 */
   public char[] getParm1() throws CFException  {              
   		return work.getParm1();
   }

  
	/**
	*  set variable parm1
	*  @param value
	**/
   public void setParm1(char[] value) throws CFException {
      work.setParm1(value);
   } 

	/**
	 *	Returns the value of parm5
	 *	@return parm5
	 */
   public char[] getParm5() throws CFException  {              
   		return work.getParm5();
   }

  
	/**
	*  set variable parm5
	*  @param value
	**/
   public void setParm5(char[] value) throws CFException {
      work.setParm5(value);
   } 

	/**
	 *	Returns the value of p6Cnt
	 *	@return p6Cnt
	 */
	public int getP6Cnt() throws CFException {        
   		return work.getP6Cnt();
	}
	
	/**
	 * 	Update P6Cnt with the passed value
	 *	@param number
	 */
	public void setP6Cnt(int number)  throws CFException{
		work.setP6Cnt(number);
	}


	public void setP6Cnt(long number)  throws CFException{
		work.setP6Cnt((int)number);
	}


	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {        
   		return work.getP1Cnt();
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *	@param number
	 */
	public void setP1Cnt(int number)  throws CFException{
		work.setP1Cnt(number);
	}


	public void setP1Cnt(long number)  throws CFException{
		work.setP1Cnt((int)number);
	}


	/**
	 *	Returns the value of p5Cnt
	 *	@return p5Cnt
	 */
	public int getP5Cnt() throws CFException {        
   		return work.getP5Cnt();
	}
	
	/**
	 * 	Update P5Cnt with the passed value
	 *	@param number
	 */
	public void setP5Cnt(int number)  throws CFException{
		work.setP5Cnt(number);
	}


	public void setP5Cnt(long number)  throws CFException{
		work.setP5Cnt((int)number);
	}


	/**
	 *	Returns the value of parm6
	 *	@return parm6
	 */
   public char[] getParm6() throws CFException  {              
   		return work.getParm6();
   }

  
	/**
	*  set variable parm6
	*  @param value
	**/
   public void setParm6(char[] value) throws CFException {
      work.setParm6(value);
   } 

	/**
	 *	Returns the value of p4Cnt
	 *	@return p4Cnt
	 */
	public int getP4Cnt() throws CFException {        
   		return work.getP4Cnt();
	}
	
	/**
	 * 	Update P4Cnt with the passed value
	 *	@param number
	 */
	public void setP4Cnt(int number)  throws CFException{
		work.setP4Cnt(number);
	}


	public void setP4Cnt(long number)  throws CFException{
		work.setP4Cnt((int)number);
	}


	/**
	 *	Returns the value of parm2
	 *	@return parm2
	 */
   public char[] getParm2() throws CFException  {              
   		return work.getParm2();
   }

  
	/**
	*  set variable parm2
	*  @param value
	**/
   public void setParm2(char[] value) throws CFException {
      work.setParm2(value);
   } 

	/**
	 *	Returns the value of parm3
	 *	@return parm3
	 */
   public char[] getParm3() throws CFException  {              
   		return work.getParm3();
   }

  
	/**
	*  set variable parm3
	*  @param value
	**/
   public void setParm3(char[] value) throws CFException {
      work.setParm3(value);
   } 

	/**
	 *	Returns the value of parm4
	 *	@return parm4
	 */
   public char[] getParm4() throws CFException  {              
   		return work.getParm4();
   }

  
	/**
	*  set variable parm4
	*  @param value
	**/
   public void setParm4(char[] value) throws CFException {
      work.setParm4(value);
   } 

	/**
	 *	Returns the value of p2Cnt
	 *	@return p2Cnt
	 */
	public int getP2Cnt() throws CFException {        
   		return work.getP2Cnt();
	}
	
	/**
	 * 	Update P2Cnt with the passed value
	 *	@param number
	 */
	public void setP2Cnt(int number)  throws CFException{
		work.setP2Cnt(number);
	}


	public void setP2Cnt(long number)  throws CFException{
		work.setP2Cnt((int)number);
	}



        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
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

    public Unstring2OutCtx clone() {
        Unstring2OutCtx cloneObj = new Unstring2OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Unstring2OutCtx getUnstring2OutCtx() {
            return new Unstring2OutCtx();
    }
     public class String1InCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();
     ExtractRec extractRec = CfstringCtx.this.getExtractRec();

	/**
	 *	Returns the value of extSvcAddr1
	 *	@return extSvcAddr1
	 */
   public char[] getExtSvcAddr1() throws CFException  {              
   		return extractRec.getExtSvcAddr1();
   }

  
	/**
	*  set variable extSvcAddr1
	*  @param value
	**/
   public void setExtSvcAddr1(char[] value) throws CFException {
      extractRec.setExtSvcAddr1(value);
   } 

     /**
	 * 	Update ExtSvcAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcAddr1(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSvcAddr1(source, sourceIndex);
   	
   }
   
   public void setExtSvcAddr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSvcAddr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSvcAddr1 with another Field
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source) {
      extractRec.setExtSvcAddr1(source);
   }  
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSvcAddr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSvcAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extAuthUsrFname
	 *	@return extAuthUsrFname
	 */
   public char[] getExtAuthUsrFname(int index) throws CFException  {              
   		return extractRec.getExtAuthUsers(index).getExtAuthUsrFname();
   }

  
	/**
	*  set variable extAuthUsrFname
	*  @param value
	**/
   public void setExtAuthUsrFname(int index,char[] value) throws CFException {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(value);
   } 

     /**
	 * 	Update ExtAuthUsrFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAuthUsrFname(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source, sourceIndex);
   	
   }
   
   public void setExtAuthUsrFname(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrFname(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtAuthUsrFname with another Field
	 *	@param value
	 */
   public void setExtAuthUsrFname(int index,Field source) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source);
   }  
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAuthUsrFname(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtAuthUsrFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrFname(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSlsRepId
	 *	@return extSlsRepId
	 */
   public char[] getExtSlsRepId() throws CFException  {              
   		return extractRec.getExtSlsRepId();
   }

  
	/**
	*  set variable extSlsRepId
	*  @param value
	**/
   public void setExtSlsRepId(char[] value) throws CFException {
      extractRec.setExtSlsRepId(value);
   } 

     /**
	 * 	Update ExtSlsRepId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepId(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSlsRepId(source, sourceIndex);
   	
   }
   
   public void setExtSlsRepId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSlsRepId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSlsRepId with another Field
	 *	@param value
	 */
   public void setExtSlsRepId(Field source) {
      extractRec.setExtSlsRepId(source);
   }  
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepId(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSlsRepId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSlsRepId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSvcAddr2
	 *	@return extSvcAddr2
	 */
   public char[] getExtSvcAddr2() throws CFException  {              
   		return extractRec.getExtSvcAddr2();
   }

  
	/**
	*  set variable extSvcAddr2
	*  @param value
	**/
   public void setExtSvcAddr2(char[] value) throws CFException {
      extractRec.setExtSvcAddr2(value);
   } 

     /**
	 * 	Update ExtSvcAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcAddr2(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSvcAddr2(source, sourceIndex);
   	
   }
   
   public void setExtSvcAddr2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSvcAddr2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSvcAddr2 with another Field
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source) {
      extractRec.setExtSvcAddr2(source);
   }  
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSvcAddr2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSvcAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSvcState
	 *	@return extSvcState
	 */
   public char[] getExtSvcState() throws CFException  {              
   		return extractRec.getExtSvcState();
   }

  
	/**
	*  set variable extSvcState
	*  @param value
	**/
   public void setExtSvcState(char[] value) throws CFException {
      extractRec.setExtSvcState(value);
   } 

     /**
	 * 	Update ExtSvcState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcState(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSvcState(source, sourceIndex);
   	
   }
   
   public void setExtSvcState(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSvcState(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSvcState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSvcState with another Field
	 *	@param value
	 */
   public void setExtSvcState(Field source) {
      extractRec.setExtSvcState(source);
   }  
   
     /**
	 * 	Update ExtSvcState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcState(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSvcState(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSvcState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extCustIdNo
	 *	@return extCustIdNo
	 */
	public long getExtCustIdNo() throws CFException {
   		return extractRec.getExtCustAcctNo().getExtCustIdNo();
	}


	/**
	 *	Returns String value of extCustIdNo
	 *	@return extCustIdNo
	 */
	public char[]  getExtCustIdNoString() throws CFException {
	     return String.valueOf(extractRec.getExtCustAcctNo().getExtCustIdNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extCustIdNoIsNumeric()  throws CFException{
	    return extractRec.getExtCustAcctNo().extCustIdNoIsNumeric();
	}

	/**
	 * 	Update ExtCustIdNo with the passed value
	 *	@param number
	 */
	public void setExtCustIdNo(long number)  throws CFException{
		extractRec.getExtCustAcctNo().setExtCustIdNo(number);
	}
	

	
	/**
	 * 	Update ExtCustIdNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtCustIdNo(char[] value)  throws CFException {
		extractRec.getExtCustAcctNo().setExtCustIdNo(value);
	}
	
	/**
	 * 	Update ExtCustIdNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtCustIdNoString(char[] value)  throws CFException{
		extractRec.getExtCustAcctNo().setExtCustIdNo(value);
	}	

	/**
	 *	Returns the value of extFname
	 *	@return extFname
	 */
   public char[] getExtFname() throws CFException  {              
   		return extractRec.getExtFname();
   }

  
	/**
	*  set variable extFname
	*  @param value
	**/
   public void setExtFname(char[] value) throws CFException {
      extractRec.setExtFname(value);
   } 

     /**
	 * 	Update ExtFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtFname(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtFname(source, sourceIndex);
   	
   }
   
   public void setExtFname(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtFname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtFname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtFname with another Field
	 *	@param value
	 */
   public void setExtFname(Field source) {
      extractRec.setExtFname(source);
   }  
   
     /**
	 * 	Update ExtFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtFname(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtFname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtFname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extAnalogDigitalCd
	 *	@return extAnalogDigitalCd
	 */
   public char[] getExtAnalogDigitalCd() throws CFException  {              
   		return extractRec.getExtAnalogDigitalCd();
   }

  
	/**
	*  set variable extAnalogDigitalCd
	*  @param value
	**/
   public void setExtAnalogDigitalCd(char[] value) throws CFException {
      extractRec.setExtAnalogDigitalCd(value);
   } 

     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtAnalogDigitalCd(source, sourceIndex);
   	
   }
   
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtAnalogDigitalCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAnalogDigitalCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtAnalogDigitalCd with another Field
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source) {
      extractRec.setExtAnalogDigitalCd(source);
   }  
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtAnalogDigitalCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtAnalogDigitalCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAnalogDigitalCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAnalogDigitalCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of svcIdNoP2
	 *	@return svcIdNoP2
	 */
   public char[] getSvcIdNoP2() throws CFException  {              
   		return work.getSvcIdNoP2();
   }

  
	/**
	*  set variable svcIdNoP2
	*  @param value
	**/
   public void setSvcIdNoP2(char[] value) throws CFException {
      work.setSvcIdNoP2(value);
   } 

	/**
	 *	Returns the value of extActDeact
	 *	@return extActDeact
	 */
   public char[] getExtActDeact() throws CFException  {              
   		return extractRec.getExtActDeact();
   }

  
	/**
	*  set variable extActDeact
	*  @param value
	**/
   public void setExtActDeact(char[] value) throws CFException {
      extractRec.setExtActDeact(value);
   } 

     /**
	 * 	Update ExtActDeact 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActDeact(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtActDeact(source, sourceIndex);
   	
   }
   
   public void setExtActDeact(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtActDeact(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtActDeact 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActDeact(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtActDeact(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtActDeact with another Field
	 *	@param value
	 */
   public void setExtActDeact(Field source) {
      extractRec.setExtActDeact(source);
   }  
   
     /**
	 * 	Update ExtActDeact 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActDeact(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtActDeact(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtActDeact 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActDeact(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtActDeact(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extBrandIdentifier
	 *	@return extBrandIdentifier
	 */
   public char[] getExtBrandIdentifier() throws CFException  {              
   		return extractRec.getExtBrandIdentifier();
   }

  
	/**
	*  set variable extBrandIdentifier
	*  @param value
	**/
   public void setExtBrandIdentifier(char[] value) throws CFException {
      extractRec.setExtBrandIdentifier(value);
   } 

     /**
	 * 	Update ExtBrandIdentifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtBrandIdentifier(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtBrandIdentifier(source, sourceIndex);
   	
   }
   
   public void setExtBrandIdentifier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtBrandIdentifier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtBrandIdentifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtBrandIdentifier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtBrandIdentifier with another Field
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source) {
      extractRec.setExtBrandIdentifier(source);
   }  
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtBrandIdentifier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtBrandIdentifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtBrandIdentifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtBrandIdentifier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extProdNme
	 *	@return extProdNme
	 */
   public char[] getExtProdNme() throws CFException  {              
   		return extractRec.getExtProdNme();
   }

  
	/**
	*  set variable extProdNme
	*  @param value
	**/
   public void setExtProdNme(char[] value) throws CFException {
      extractRec.setExtProdNme(value);
   } 

     /**
	 * 	Update ExtProdNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtProdNme(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtProdNme(source, sourceIndex);
   	
   }
   
   public void setExtProdNme(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtProdNme(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtProdNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtProdNme(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtProdNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtProdNme with another Field
	 *	@param value
	 */
   public void setExtProdNme(Field source) {
      extractRec.setExtProdNme(source);
   }  
   
     /**
	 * 	Update ExtProdNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtProdNme(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtProdNme(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtProdNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtProdNme(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtProdNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extCity
	 *	@return extCity
	 */
   public char[] getExtCity() throws CFException  {              
   		return extractRec.getExtCity();
   }

  
	/**
	*  set variable extCity
	*  @param value
	**/
   public void setExtCity(char[] value) throws CFException {
      extractRec.setExtCity(value);
   } 

     /**
	 * 	Update ExtCity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCity(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtCity(source, sourceIndex);
   	
   }
   
   public void setExtCity(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtCity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtCity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtCity with another Field
	 *	@param value
	 */
   public void setExtCity(Field source) {
      extractRec.setExtCity(source);
   }  
   
     /**
	 * 	Update ExtCity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCity(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtCity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtCity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extOutletId
	 *	@return extOutletId
	 */
	public long getExtOutletId() throws CFException {
   		return extractRec.getExtOutletId();
	}


	/**
	 *	Returns String value of extOutletId
	 *	@return extOutletId
	 */
	public char[]  getExtOutletIdString() throws CFException {
	     return String.valueOf(extractRec.getExtOutletIdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extOutletIdIsNumeric()  throws CFException{
	    return extractRec.extOutletIdIsNumeric();
	}

	/**
	 * 	Update ExtOutletId with the passed value
	 *	@param number
	 */
	public void setExtOutletId(long number)  throws CFException{
		extractRec.setExtOutletId(number);
	}
	

	
	/**
	 * 	Update ExtOutletId with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtOutletId(char[] value)  throws CFException {
		extractRec.setExtOutletId(value);
	}
	
	/**
	 * 	Update ExtOutletId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtOutletIdString(char[] value)  throws CFException{
		extractRec.setExtOutletId(value);
	}	

	/**
	 *	Returns the value of extOutletName
	 *	@return extOutletName
	 */
   public char[] getExtOutletName() throws CFException  {              
   		return extractRec.getExtOutletName();
   }

  
	/**
	*  set variable extOutletName
	*  @param value
	**/
   public void setExtOutletName(char[] value) throws CFException {
      extractRec.setExtOutletName(value);
   } 

     /**
	 * 	Update ExtOutletName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtOutletName(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtOutletName(source, sourceIndex);
   	
   }
   
   public void setExtOutletName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtOutletName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtOutletName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtOutletName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtOutletName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtOutletName with another Field
	 *	@param value
	 */
   public void setExtOutletName(Field source) {
      extractRec.setExtOutletName(source);
   }  
   
     /**
	 * 	Update ExtOutletName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtOutletName(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtOutletName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtOutletName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtOutletName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtOutletName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extVzMktDesc
	 *	@return extVzMktDesc
	 */
   public char[] getExtVzMktDesc() throws CFException  {              
   		return extractRec.getExtVzMktDesc();
   }

  
	/**
	*  set variable extVzMktDesc
	*  @param value
	**/
   public void setExtVzMktDesc(char[] value) throws CFException {
      extractRec.setExtVzMktDesc(value);
   } 

     /**
	 * 	Update ExtVzMktDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtVzMktDesc(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtVzMktDesc(source, sourceIndex);
   	
   }
   
   public void setExtVzMktDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtVzMktDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtVzMktDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtVzMktDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtVzMktDesc with another Field
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source) {
      extractRec.setExtVzMktDesc(source);
   }  
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtVzMktDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtVzMktDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtVzMktDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtVzMktDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extEmailAddr1
	 *	@return extEmailAddr1
	 */
   public char[] getExtEmailAddr1() throws CFException  {              
   		return extractRec.getExtEmailAddr1();
   }

  
	/**
	*  set variable extEmailAddr1
	*  @param value
	**/
   public void setExtEmailAddr1(char[] value) throws CFException {
      extractRec.setExtEmailAddr1(value);
   } 

     /**
	 * 	Update ExtEmailAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr1(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtEmailAddr1(source, sourceIndex);
   	
   }
   
   public void setExtEmailAddr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtEmailAddr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtEmailAddr1 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source) {
      extractRec.setExtEmailAddr1(source);
   }  
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtEmailAddr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtEmailAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extCarrierName
	 *	@return extCarrierName
	 */
   public char[] getExtCarrierName() throws CFException  {              
   		return extractRec.getExtCarrierName();
   }

  
	/**
	*  set variable extCarrierName
	*  @param value
	**/
   public void setExtCarrierName(char[] value) throws CFException {
      extractRec.setExtCarrierName(value);
   } 

     /**
	 * 	Update ExtCarrierName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCarrierName(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtCarrierName(source, sourceIndex);
   	
   }
   
   public void setExtCarrierName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtCarrierName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtCarrierName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCarrierName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCarrierName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtCarrierName with another Field
	 *	@param value
	 */
   public void setExtCarrierName(Field source) {
      extractRec.setExtCarrierName(source);
   }  
   
     /**
	 * 	Update ExtCarrierName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCarrierName(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtCarrierName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtCarrierName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCarrierName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCarrierName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extActvReqDt
	 *	@return extActvReqDt
	 */
   public char[] getExtActvReqDt() throws CFException  {              
   		return extractRec.getExtActvReqDt();
   }

  
	/**
	*  set variable extActvReqDt
	*  @param value
	**/
   public void setExtActvReqDt(char[] value) throws CFException {
      extractRec.setExtActvReqDt(value);
   } 

     /**
	 * 	Update ExtActvReqDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActvReqDt(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtActvReqDt(source, sourceIndex);
   	
   }
   
   public void setExtActvReqDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtActvReqDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActvReqDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtActvReqDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtActvReqDt with another Field
	 *	@param value
	 */
   public void setExtActvReqDt(Field source) {
      extractRec.setExtActvReqDt(source);
   }  
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActvReqDt(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtActvReqDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtActvReqDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActvReqDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtActvReqDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extAuserCnt
	 *	@return extAuserCnt
	 */
	public int getExtAuserCnt() throws CFException {
   		return extractRec.getExtAuserCnt();
	}


	/**
	 *	Returns String value of extAuserCnt
	 *	@return extAuserCnt
	 */
	public char[]  getExtAuserCntString() throws CFException {
	     return String.valueOf(extractRec.getExtAuserCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extAuserCntIsNumeric()  throws CFException{
	    return extractRec.extAuserCntIsNumeric();
	}

	/**
	 * 	Update ExtAuserCnt with the passed value
	 *	@param number
	 */
	public void setExtAuserCnt(int number)  throws CFException{
		extractRec.setExtAuserCnt(number);
	}
	

	public void setExtAuserCnt(long number)  throws CFException{
	    extractRec.setExtAuserCnt(number);
	}
	
	
	/**
	 * 	Update ExtAuserCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtAuserCnt(char[] value)  throws CFException {
		extractRec.setExtAuserCnt(value);
	}
	
	/**
	 * 	Update ExtAuserCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtAuserCntString(char[] value)  throws CFException{
		extractRec.setExtAuserCnt(value);
	}	

	/**
	 *	Returns the value of extLevel
	 *	@return extLevel
	 */
   public char[] getExtLevel() throws CFException  {              
   		return extractRec.getExtLevel();
   }

  
	/**
	*  set variable extLevel
	*  @param value
	**/
   public void setExtLevel(char[] value) throws CFException {
      extractRec.setExtLevel(value);
   } 

     /**
	 * 	Update ExtLevel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLevel(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtLevel(source, sourceIndex);
   	
   }
   
   public void setExtLevel(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtLevel(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtLevel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLevel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLevel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtLevel with another Field
	 *	@param value
	 */
   public void setExtLevel(Field source) {
      extractRec.setExtLevel(source);
   }  
   
     /**
	 * 	Update ExtLevel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLevel(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtLevel(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtLevel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLevel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLevel(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extLname
	 *	@return extLname
	 */
   public char[] getExtLname() throws CFException  {              
   		return extractRec.getExtLname();
   }

  
	/**
	*  set variable extLname
	*  @param value
	**/
   public void setExtLname(char[] value) throws CFException {
      extractRec.setExtLname(value);
   } 

     /**
	 * 	Update ExtLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLname(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtLname(source, sourceIndex);
   	
   }
   
   public void setExtLname(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtLname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtLname with another Field
	 *	@param value
	 */
   public void setExtLname(Field source) {
      extractRec.setExtLname(source);
   }  
   
     /**
	 * 	Update ExtLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLname(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtLname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extIccid
	 *	@return extIccid
	 */
   public char[] getExtIccid() throws CFException  {              
   		return extractRec.getExtIccid();
   }

  
	/**
	*  set variable extIccid
	*  @param value
	**/
   public void setExtIccid(char[] value) throws CFException {
      extractRec.setExtIccid(value);
   } 

     /**
	 * 	Update ExtIccid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtIccid(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtIccid(source, sourceIndex);
   	
   }
   
   public void setExtIccid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtIccid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtIccid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtIccid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtIccid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtIccid with another Field
	 *	@param value
	 */
   public void setExtIccid(Field source) {
      extractRec.setExtIccid(source);
   }  
   
     /**
	 * 	Update ExtIccid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtIccid(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtIccid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtIccid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtIccid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtIccid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extRegionCd
	 *	@return extRegionCd
	 */
   public char[] getExtRegionCd() throws CFException  {              
   		return extractRec.getExtRegionCd();
   }

  
	/**
	*  set variable extRegionCd
	*  @param value
	**/
   public void setExtRegionCd(char[] value) throws CFException {
      extractRec.setExtRegionCd(value);
   } 

     /**
	 * 	Update ExtRegionCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtRegionCd(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtRegionCd(source, sourceIndex);
   	
   }
   
   public void setExtRegionCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtRegionCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtRegionCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtRegionCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtRegionCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtRegionCd with another Field
	 *	@param value
	 */
   public void setExtRegionCd(Field source) {
      extractRec.setExtRegionCd(source);
   }  
   
     /**
	 * 	Update ExtRegionCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtRegionCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtRegionCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtRegionCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtRegionCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtRegionCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extServiceStartDt
	 *	@return extServiceStartDt
	 */   
	 public ExtServiceStartDt getExtServiceStartDt() {
   	return extractRec.getExtServiceStartDt();
   }

   /**
	* 	Update ExtServiceStartDt with the passed value
	*	@param value
	*/
   public void setExtServiceStartDt(char[] value) throws CFException {
      extractRec.setExtServiceStartDt(value);
   }   

     /**
	 * 	Update ExtServiceStartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtServiceStartDt(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	extractRec.setExtServiceStartDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtServiceStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtServiceStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtServiceStartDt with another Field
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source) {
   	extractRec.setExtServiceStartDt(source);
   }  
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source, int sourceIndex,int sourceLen) {
   	extractRec.setExtServiceStartDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtServiceStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtServiceStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtServiceStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMinId
	 *	@return extMinId
	 */
   public char[] getExtMinId() throws CFException  {              
   		return extractRec.getExtFlds().getExtMinId();
   }

  
	/**
	*  set variable extMinId
	*  @param value
	**/
   public void setExtMinId(char[] value) throws CFException {
      extractRec.getExtFlds().setExtMinId(value);
   } 

     /**
	 * 	Update ExtMinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMinId(char[] source, int sourceIndex) throws CFException {
      extractRec.getExtFlds().setExtMinId(source, sourceIndex);
   	
   }
   
   public void setExtMinId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtFlds().setExtMinId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtFlds().setExtMinId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMinId with another Field
	 *	@param value
	 */
   public void setExtMinId(Field source) {
      extractRec.getExtFlds().setExtMinId(source);
   }  
   
     /**
	 * 	Update ExtMinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMinId(Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtFlds().setExtMinId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtFlds().setExtMinId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extAddr1
	 *	@return extAddr1
	 */
   public char[] getExtAddr1() throws CFException  {              
   		return extractRec.getExtAddr1();
   }

  
	/**
	*  set variable extAddr1
	*  @param value
	**/
   public void setExtAddr1(char[] value) throws CFException {
      extractRec.setExtAddr1(value);
   } 

     /**
	 * 	Update ExtAddr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAddr1(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtAddr1(source, sourceIndex);
   	
   }
   
   public void setExtAddr1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtAddr1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtAddr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtAddr1 with another Field
	 *	@param value
	 */
   public void setExtAddr1(Field source) {
      extractRec.setExtAddr1(source);
   }  
   
     /**
	 * 	Update ExtAddr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAddr1(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtAddr1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtAddr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAddr1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extCustTypeCd
	 *	@return extCustTypeCd
	 */
   public char[] getExtCustTypeCd() throws CFException  {              
   		return extractRec.getExtCustTypeCd();
   }

  
	/**
	*  set variable extCustTypeCd
	*  @param value
	**/
   public void setExtCustTypeCd(char[] value) throws CFException {
      extractRec.setExtCustTypeCd(value);
   } 

     /**
	 * 	Update ExtCustTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtCustTypeCd(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtCustTypeCd(source, sourceIndex);
   	
   }
   
   public void setExtCustTypeCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtCustTypeCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtCustTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCustTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtCustTypeCd with another Field
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source) {
      extractRec.setExtCustTypeCd(source);
   }  
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtCustTypeCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtCustTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtCustTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtCustTypeCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSvcCity
	 *	@return extSvcCity
	 */
   public char[] getExtSvcCity() throws CFException  {              
   		return extractRec.getExtSvcCity();
   }

  
	/**
	*  set variable extSvcCity
	*  @param value
	**/
   public void setExtSvcCity(char[] value) throws CFException {
      extractRec.setExtSvcCity(value);
   } 

     /**
	 * 	Update ExtSvcCity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcCity(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSvcCity(source, sourceIndex);
   	
   }
   
   public void setExtSvcCity(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSvcCity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSvcCity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcCity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcCity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSvcCity with another Field
	 *	@param value
	 */
   public void setExtSvcCity(Field source) {
      extractRec.setExtSvcCity(source);
   }  
   
     /**
	 * 	Update ExtSvcCity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcCity(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSvcCity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSvcCity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcCity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcCity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMtn
	 *	@return extMtn
	 */
   public char[] getExtMtn() throws CFException  {              
   		return extractRec.getExtMtn();
   }

  
	/**
	*  set variable extMtn
	*  @param value
	**/
   public void setExtMtn(char[] value) throws CFException {
      extractRec.setExtMtn(value);
   } 

     /**
	 * 	Update ExtMtn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMtn(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtMtn(source, sourceIndex);
   	
   }
   
   public void setExtMtn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtMtn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMtn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMtn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMtn with another Field
	 *	@param value
	 */
   public void setExtMtn(Field source) {
      extractRec.setExtMtn(source);
   }  
   
     /**
	 * 	Update ExtMtn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMtn(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtMtn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMtn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMfgNme
	 *	@return extMfgNme
	 */
   public char[] getExtMfgNme() throws CFException  {              
   		return extractRec.getExtMfgNme();
   }

  
	/**
	*  set variable extMfgNme
	*  @param value
	**/
   public void setExtMfgNme(char[] value) throws CFException {
      extractRec.setExtMfgNme(value);
   } 

     /**
	 * 	Update ExtMfgNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMfgNme(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtMfgNme(source, sourceIndex);
   	
   }
   
   public void setExtMfgNme(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtMfgNme(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMfgNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNme(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMfgNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMfgNme with another Field
	 *	@param value
	 */
   public void setExtMfgNme(Field source) {
      extractRec.setExtMfgNme(source);
   }  
   
     /**
	 * 	Update ExtMfgNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMfgNme(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtMfgNme(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMfgNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNme(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMfgNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMfgNm
	 *	@return extMfgNm
	 */
   public char[] getExtMfgNm(int index) throws CFException  {              
   		return extractRec.getExtShsArea().getExtSpoTbl(index).getExtMfgNm();
   }

  
	/**
	*  set variable extMfgNm
	*  @param value
	**/
   public void setExtMfgNm(int index,char[] value) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(value);
   } 

     /**
	 * 	Update ExtMfgNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMfgNm(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source, sourceIndex);
   	
   }
   
   public void setExtMfgNm(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMfgNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNm(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMfgNm with another Field
	 *	@param value
	 */
   public void setExtMfgNm(int index,Field source) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source);
   }  
   
     /**
	 * 	Update ExtMfgNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMfgNm(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMfgNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMfgNm(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMfgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extActivationDate
	 *	@return extActivationDate
	 */
   public char[] getExtActivationDate(int index) throws CFException  {              
   		return extractRec.getExtShsArea().getExtSpoTbl(index).getExtActivationDate();
   }

  
	/**
	*  set variable extActivationDate
	*  @param value
	**/
   public void setExtActivationDate(int index,char[] value) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(value);
   } 

     /**
	 * 	Update ExtActivationDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtActivationDate(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source, sourceIndex);
   	
   }
   
   public void setExtActivationDate(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtActivationDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActivationDate(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtActivationDate with another Field
	 *	@param value
	 */
   public void setExtActivationDate(int index,Field source) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source);
   }  
   
     /**
	 * 	Update ExtActivationDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtActivationDate(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtActivationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActivationDate(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtActivationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extState
	 *	@return extState
	 */
   public char[] getExtState() throws CFException  {              
   		return extractRec.getExtState();
   }

  
	/**
	*  set variable extState
	*  @param value
	**/
   public void setExtState(char[] value) throws CFException {
      extractRec.setExtState(value);
   } 

     /**
	 * 	Update ExtState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtState(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtState(source, sourceIndex);
   	
   }
   
   public void setExtState(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtState(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtState with another Field
	 *	@param value
	 */
   public void setExtState(Field source) {
      extractRec.setExtState(source);
   }  
   
     /**
	 * 	Update ExtState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtState(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtState(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSlsRepFname
	 *	@return extSlsRepFname
	 */
   public char[] getExtSlsRepFname() throws CFException  {              
   		return extractRec.getExtSlsRepFname();
   }

  
	/**
	*  set variable extSlsRepFname
	*  @param value
	**/
   public void setExtSlsRepFname(char[] value) throws CFException {
      extractRec.setExtSlsRepFname(value);
   } 

     /**
	 * 	Update ExtSlsRepFname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepFname(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSlsRepFname(source, sourceIndex);
   	
   }
   
   public void setExtSlsRepFname(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSlsRepFname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepFname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSlsRepFname with another Field
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source) {
      extractRec.setExtSlsRepFname(source);
   }  
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSlsRepFname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSlsRepFname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepFname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepFname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extActEffDt
	 *	@return extActEffDt
	 */   
	 public ExtActEffDt getExtActEffDt() {
   	return extractRec.getExtActEffDt();
   }

   /**
	* 	Update ExtActEffDt with the passed value
	*	@param value
	*/
   public void setExtActEffDt(char[] value) throws CFException {
      extractRec.setExtActEffDt(value);
   }   

     /**
	 * 	Update ExtActEffDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtActEffDt(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	extractRec.setExtActEffDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtActEffDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtActEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtActEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtActEffDt with another Field
	 *	@param value
	 */
   public void setExtActEffDt(Field source) {
   	extractRec.setExtActEffDt(source);
   }  
   
     /**
	 * 	Update ExtActEffDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtActEffDt(Field source, int sourceIndex,int sourceLen) {
   	extractRec.setExtActEffDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtActEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtActEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtActEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extBillCycleDt
	 *	@return extBillCycleDt
	 */   
	 public ExtBillCycleDt getExtBillCycleDt() {
   	return extractRec.getExtBillCycleDt();
   }

   /**
	* 	Update ExtBillCycleDt with the passed value
	*	@param value
	*/
   public void setExtBillCycleDt(char[] value) throws CFException {
      extractRec.setExtBillCycleDt(value);
   }   

     /**
	 * 	Update ExtBillCycleDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExtBillCycleDt(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	extractRec.setExtBillCycleDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtBillCycleDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtBillCycleDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtBillCycleDt with another Field
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source) {
   	extractRec.setExtBillCycleDt(source);
   }  
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source, int sourceIndex,int sourceLen) {
   	extractRec.setExtBillCycleDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtBillCycleDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtBillCycleDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	extractRec.setExtBillCycleDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMacid
	 *	@return extMacid
	 */
   public char[] getExtMacid(int index) throws CFException  {              
   		return extractRec.getExtShsArea().getExtSpoTbl(index).getExtMacid();
   }

  
	/**
	*  set variable extMacid
	*  @param value
	**/
   public void setExtMacid(int index,char[] value) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(value);
   } 

     /**
	 * 	Update ExtMacid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMacid(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source, sourceIndex);
   	
   }
   
   public void setExtMacid(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMacid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMacid(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMacid with another Field
	 *	@param value
	 */
   public void setExtMacid(int index,Field source) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source);
   }  
   
     /**
	 * 	Update ExtMacid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMacid(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMacid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMacid(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtMacid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSfoSpoIndicator
	 *	@return extSfoSpoIndicator
	 */
   public char[] getExtSfoSpoIndicator() throws CFException  {              
   		return extractRec.getExtSfoSpoIndicator();
   }

  
	/**
	*  set variable extSfoSpoIndicator
	*  @param value
	**/
   public void setExtSfoSpoIndicator(char[] value) throws CFException {
      extractRec.setExtSfoSpoIndicator(value);
   } 

     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSfoSpoIndicator(source, sourceIndex);
   	
   }
   
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSfoSpoIndicator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSfoSpoIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSfoSpoIndicator with another Field
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source) {
      extractRec.setExtSfoSpoIndicator(source);
   }  
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSfoSpoIndicator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSfoSpoIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSfoSpoIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSfoSpoIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extLocationState
	 *	@return extLocationState
	 */
   public char[] getExtLocationState() throws CFException  {              
   		return extractRec.getExtLocationState();
   }

  
	/**
	*  set variable extLocationState
	*  @param value
	**/
   public void setExtLocationState(char[] value) throws CFException {
      extractRec.setExtLocationState(value);
   } 

     /**
	 * 	Update ExtLocationState 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLocationState(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtLocationState(source, sourceIndex);
   	
   }
   
   public void setExtLocationState(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtLocationState(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtLocationState 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLocationState(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLocationState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtLocationState with another Field
	 *	@param value
	 */
   public void setExtLocationState(Field source) {
      extractRec.setExtLocationState(source);
   }  
   
     /**
	 * 	Update ExtLocationState 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLocationState(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtLocationState(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtLocationState 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLocationState(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLocationState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSkuId
	 *	@return extSkuId
	 */
   public char[] getExtSkuId() throws CFException  {              
   		return extractRec.getExtSkuId();
   }

  
	/**
	*  set variable extSkuId
	*  @param value
	**/
   public void setExtSkuId(char[] value) throws CFException {
      extractRec.setExtSkuId(value);
   } 

     /**
	 * 	Update ExtSkuId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSkuId(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSkuId(source, sourceIndex);
   	
   }
   
   public void setExtSkuId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSkuId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSkuId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSkuId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSkuId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSkuId with another Field
	 *	@param value
	 */
   public void setExtSkuId(Field source) {
      extractRec.setExtSkuId(source);
   }  
   
     /**
	 * 	Update ExtSkuId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSkuId(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSkuId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSkuId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSkuId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSkuId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extChnlDetail
	 *	@return extChnlDetail
	 */
   public char[] getExtChnlDetail() throws CFException  {              
   		return extractRec.getExtChnlDetail();
   }

  
	/**
	*  set variable extChnlDetail
	*  @param value
	**/
   public void setExtChnlDetail(char[] value) throws CFException {
      extractRec.setExtChnlDetail(value);
   } 

     /**
	 * 	Update ExtChnlDetail 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtChnlDetail(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtChnlDetail(source, sourceIndex);
   	
   }
   
   public void setExtChnlDetail(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtChnlDetail(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtChnlDetail(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtChnlDetail(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtChnlDetail with another Field
	 *	@param value
	 */
   public void setExtChnlDetail(Field source) {
      extractRec.setExtChnlDetail(source);
   }  
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtChnlDetail(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtChnlDetail(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtChnlDetail 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtChnlDetail(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtChnlDetail(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extMarketCd
	 *	@return extMarketCd
	 */
   public char[] getExtMarketCd() throws CFException  {              
   		return extractRec.getExtFlds().getExtMarketCd();
   }

  
	/**
	*  set variable extMarketCd
	*  @param value
	**/
   public void setExtMarketCd(char[] value) throws CFException {
      extractRec.getExtFlds().setExtMarketCd(value);
   } 

     /**
	 * 	Update ExtMarketCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMarketCd(char[] source, int sourceIndex) throws CFException {
      extractRec.getExtFlds().setExtMarketCd(source, sourceIndex);
   	
   }
   
   public void setExtMarketCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtFlds().setExtMarketCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMarketCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMarketCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtFlds().setExtMarketCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMarketCd with another Field
	 *	@param value
	 */
   public void setExtMarketCd(Field source) {
      extractRec.getExtFlds().setExtMarketCd(source);
   }  
   
     /**
	 * 	Update ExtMarketCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMarketCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtFlds().setExtMarketCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMarketCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMarketCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtFlds().setExtMarketCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of svcIdNoP1
	 *	@return svcIdNoP1
	 */
   public char[] getSvcIdNoP1() throws CFException  {              
   		return work.getSvcIdNoP1();
   }

  
	/**
	*  set variable svcIdNoP1
	*  @param value
	**/
   public void setSvcIdNoP1(char[] value) throws CFException {
      work.setSvcIdNoP1(value);
   } 

	/**
	 *	Returns the value of extDeviceId
	 *	@return extDeviceId
	 */
   public char[] getExtDeviceId() throws CFException  {              
   		return extractRec.getExtDeviceId();
   }

  
	/**
	*  set variable extDeviceId
	*  @param value
	**/
   public void setExtDeviceId(char[] value) throws CFException {
      extractRec.setExtDeviceId(value);
   } 

     /**
	 * 	Update ExtDeviceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDeviceId(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtDeviceId(source, sourceIndex);
   	
   }
   
   public void setExtDeviceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtDeviceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtDeviceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDeviceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtDeviceId with another Field
	 *	@param value
	 */
   public void setExtDeviceId(Field source) {
      extractRec.setExtDeviceId(source);
   }  
   
     /**
	 * 	Update ExtDeviceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDeviceId(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtDeviceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtDeviceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDeviceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extWarranty
	 *	@return extWarranty
	 */
   public char[] getExtWarranty() throws CFException  {              
   		return extractRec.getExtWarranty();
   }

  
	/**
	*  set variable extWarranty
	*  @param value
	**/
   public void setExtWarranty(char[] value) throws CFException {
      extractRec.setExtWarranty(value);
   } 

     /**
	 * 	Update ExtWarranty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtWarranty(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtWarranty(source, sourceIndex);
   	
   }
   
   public void setExtWarranty(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtWarranty(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtWarranty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtWarranty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtWarranty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtWarranty with another Field
	 *	@param value
	 */
   public void setExtWarranty(Field source) {
      extractRec.setExtWarranty(source);
   }  
   
     /**
	 * 	Update ExtWarranty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtWarranty(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtWarranty(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtWarranty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtWarranty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtWarranty(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extDeviceIdType
	 *	@return extDeviceIdType
	 */
   public char[] getExtDeviceIdType() throws CFException  {              
   		return extractRec.getExtDeviceIdType();
   }

  
	/**
	*  set variable extDeviceIdType
	*  @param value
	**/
   public void setExtDeviceIdType(char[] value) throws CFException {
      extractRec.setExtDeviceIdType(value);
   } 

     /**
	 * 	Update ExtDeviceIdType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDeviceIdType(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtDeviceIdType(source, sourceIndex);
   	
   }
   
   public void setExtDeviceIdType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtDeviceIdType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceIdType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDeviceIdType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtDeviceIdType with another Field
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source) {
      extractRec.setExtDeviceIdType(source);
   }  
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtDeviceIdType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtDeviceIdType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDeviceIdType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDeviceIdType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extFinMarketCode
	 *	@return extFinMarketCode
	 */
   public char[] getExtFinMarketCode() throws CFException  {              
   		return extractRec.getExtFinMarketCode();
   }

  
	/**
	*  set variable extFinMarketCode
	*  @param value
	**/
   public void setExtFinMarketCode(char[] value) throws CFException {
      extractRec.setExtFinMarketCode(value);
   } 

     /**
	 * 	Update ExtFinMarketCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtFinMarketCode(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtFinMarketCode(source, sourceIndex);
   	
   }
   
   public void setExtFinMarketCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtFinMarketCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtFinMarketCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtFinMarketCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtFinMarketCode with another Field
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source) {
      extractRec.setExtFinMarketCode(source);
   }  
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtFinMarketCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtFinMarketCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtFinMarketCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtFinMarketCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of len
	 *	@return len
	 */
	public short getLen() throws CFException {        
   		return work.getLen();
	}
	
	/**
	 * 	Update Len with the passed value
	 *	@param number
	 */
	public void setLen(short number)  throws CFException{
		work.setLen(number);
	}

	public void setLen(int number)  throws CFException{
		work.setLen((short)number);
	}

	public void setLen(long number)  throws CFException{
		work.setLen((short)number);
	}



	/**
	 *	Returns the value of extMtnEffDt
	 *	@return extMtnEffDt
	 */
   public char[] getExtMtnEffDt() throws CFException  {              
   		return extractRec.getExtMtnEffDt();
   }

  
	/**
	*  set variable extMtnEffDt
	*  @param value
	**/
   public void setExtMtnEffDt(char[] value) throws CFException {
      extractRec.setExtMtnEffDt(value);
   } 

     /**
	 * 	Update ExtMtnEffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMtnEffDt(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtMtnEffDt(source, sourceIndex);
   	
   }
   
   public void setExtMtnEffDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtMtnEffDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMtnEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMtnEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtMtnEffDt with another Field
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source) {
      extractRec.setExtMtnEffDt(source);
   }  
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtMtnEffDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtMtnEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMtnEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtMtnEffDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extPricePlan
	 *	@return extPricePlan
	 */
	public long getExtPricePlan() throws CFException {
   		return extractRec.getExtFlds().getExtPricePlan();
	}


	/**
	 *	Returns String value of extPricePlan
	 *	@return extPricePlan
	 */
	public char[]  getExtPricePlanString() throws CFException {
	     return String.valueOf(extractRec.getExtFlds().getExtPricePlanString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extPricePlanIsNumeric()  throws CFException{
	    return extractRec.getExtFlds().extPricePlanIsNumeric();
	}

	/**
	 * 	Update ExtPricePlan with the passed value
	 *	@param number
	 */
	public void setExtPricePlan(long number)  throws CFException{
		extractRec.getExtFlds().setExtPricePlan(number);
	}
	

	
	/**
	 * 	Update ExtPricePlan with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtPricePlan(char[] value)  throws CFException {
		extractRec.getExtFlds().setExtPricePlan(value);
	}
	
	/**
	 * 	Update ExtPricePlan with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtPricePlanString(char[] value)  throws CFException{
		extractRec.getExtFlds().setExtPricePlan(value);
	}	

	/**
	 *	Returns the value of extDistrictDesc
	 *	@return extDistrictDesc
	 */
   public char[] getExtDistrictDesc() throws CFException  {              
   		return extractRec.getExtDistrictDesc();
   }

  
	/**
	*  set variable extDistrictDesc
	*  @param value
	**/
   public void setExtDistrictDesc(char[] value) throws CFException {
      extractRec.setExtDistrictDesc(value);
   } 

     /**
	 * 	Update ExtDistrictDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtDistrictDesc(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtDistrictDesc(source, sourceIndex);
   	
   }
   
   public void setExtDistrictDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtDistrictDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtDistrictDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDistrictDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtDistrictDesc with another Field
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source) {
      extractRec.setExtDistrictDesc(source);
   }  
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtDistrictDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtDistrictDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtDistrictDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtDistrictDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extLineStatus
	 *	@return extLineStatus
	 */
   public char[] getExtLineStatus() throws CFException  {              
   		return extractRec.getExtLineStatus();
   }

  
	/**
	*  set variable extLineStatus
	*  @param value
	**/
   public void setExtLineStatus(char[] value) throws CFException {
      extractRec.setExtLineStatus(value);
   } 

     /**
	 * 	Update ExtLineStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtLineStatus(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtLineStatus(source, sourceIndex);
   	
   }
   
   public void setExtLineStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtLineStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtLineStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtLineStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLineStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtLineStatus with another Field
	 *	@param value
	 */
   public void setExtLineStatus(Field source) {
      extractRec.setExtLineStatus(source);
   }  
   
     /**
	 * 	Update ExtLineStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtLineStatus(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtLineStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtLineStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtLineStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtLineStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extPrdNme
	 *	@return extPrdNme
	 */
   public char[] getExtPrdNme(int index) throws CFException  {              
   		return extractRec.getExtShsArea().getExtSpoTbl(index).getExtPrdNme();
   }

  
	/**
	*  set variable extPrdNme
	*  @param value
	**/
   public void setExtPrdNme(int index,char[] value) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(value);
   } 

     /**
	 * 	Update ExtPrdNme 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtPrdNme(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source, sourceIndex);
   	
   }
   
   public void setExtPrdNme(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtPrdNme 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtPrdNme(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtPrdNme with another Field
	 *	@param value
	 */
   public void setExtPrdNme(int index,Field source) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source);
   }  
   
     /**
	 * 	Update ExtPrdNme 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtPrdNme(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtPrdNme 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtPrdNme(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtShsArea().getExtSpoTbl(index).setExtPrdNme(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extEmailAddr3
	 *	@return extEmailAddr3
	 */
   public char[] getExtEmailAddr3() throws CFException  {              
   		return extractRec.getExtEmailAddr3();
   }

  
	/**
	*  set variable extEmailAddr3
	*  @param value
	**/
   public void setExtEmailAddr3(char[] value) throws CFException {
      extractRec.setExtEmailAddr3(value);
   } 

     /**
	 * 	Update ExtEmailAddr3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr3(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtEmailAddr3(source, sourceIndex);
   	
   }
   
   public void setExtEmailAddr3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtEmailAddr3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtEmailAddr3 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source) {
      extractRec.setExtEmailAddr3(source);
   }  
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtEmailAddr3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtEmailAddr3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSvcZipCode
	 *	@return extSvcZipCode
	 */
   public char[] getExtSvcZipCode() throws CFException  {              
   		return extractRec.getExtSvcZipCode();
   }

  
	/**
	*  set variable extSvcZipCode
	*  @param value
	**/
   public void setExtSvcZipCode(char[] value) throws CFException {
      extractRec.setExtSvcZipCode(value);
   } 

     /**
	 * 	Update ExtSvcZipCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSvcZipCode(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSvcZipCode(source, sourceIndex);
   	
   }
   
   public void setExtSvcZipCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSvcZipCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcZipCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcZipCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSvcZipCode with another Field
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source) {
      extractRec.setExtSvcZipCode(source);
   }  
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSvcZipCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSvcZipCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSvcZipCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSvcZipCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extAuthUsrLname
	 *	@return extAuthUsrLname
	 */
   public char[] getExtAuthUsrLname(int index) throws CFException  {              
   		return extractRec.getExtAuthUsers(index).getExtAuthUsrLname();
   }

  
	/**
	*  set variable extAuthUsrLname
	*  @param value
	**/
   public void setExtAuthUsrLname(int index,char[] value) throws CFException {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(value);
   } 

     /**
	 * 	Update ExtAuthUsrLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAuthUsrLname(int index,char[] source, int sourceIndex) throws CFException {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source, sourceIndex);
   	
   }
   
   public void setExtAuthUsrLname(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrLname(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtAuthUsrLname with another Field
	 *	@param value
	 */
   public void setExtAuthUsrLname(int index,Field source) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source);
   }  
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAuthUsrLname(int index,Field source, int sourceIndex,int sourceLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtAuthUsrLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAuthUsrLname(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.getExtAuthUsers(index).setExtAuthUsrLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extZipCode
	 *	@return extZipCode
	 */
   public char[] getExtZipCode() throws CFException  {              
   		return extractRec.getExtZipCode();
   }

  
	/**
	*  set variable extZipCode
	*  @param value
	**/
   public void setExtZipCode(char[] value) throws CFException {
      extractRec.setExtZipCode(value);
   } 

     /**
	 * 	Update ExtZipCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtZipCode(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtZipCode(source, sourceIndex);
   	
   }
   
   public void setExtZipCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtZipCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtZipCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtZipCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtZipCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtZipCode with another Field
	 *	@param value
	 */
   public void setExtZipCode(Field source) {
      extractRec.setExtZipCode(source);
   }  
   
     /**
	 * 	Update ExtZipCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtZipCode(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtZipCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtZipCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtZipCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtZipCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extUniqueId
	 *	@return extUniqueId
	 */
	public long getExtUniqueId() throws CFException {
   		return extractRec.getExtUniqueId();
	}


	/**
	 *	Returns String value of extUniqueId
	 *	@return extUniqueId
	 */
	public char[]  getExtUniqueIdString() throws CFException {
	     return String.valueOf(extractRec.getExtUniqueIdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extUniqueIdIsNumeric()  throws CFException{
	    return extractRec.extUniqueIdIsNumeric();
	}

	/**
	 * 	Update ExtUniqueId with the passed value
	 *	@param number
	 */
	public void setExtUniqueId(long number)  throws CFException{
		extractRec.setExtUniqueId(number);
	}
	

	
	/**
	 * 	Update ExtUniqueId with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtUniqueId(char[] value)  throws CFException {
		extractRec.setExtUniqueId(value);
	}
	
	/**
	 * 	Update ExtUniqueId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtUniqueIdString(char[] value)  throws CFException{
		extractRec.setExtUniqueId(value);
	}	

	/**
	 *	Returns the value of extSfo
	 *	@return extSfo
	 */
	public long getExtSfo() throws CFException {
   		return extractRec.getExtFlds().getExtSfo();
	}


	/**
	 *	Returns String value of extSfo
	 *	@return extSfo
	 */
	public char[]  getExtSfoString() throws CFException {
	     return String.valueOf(extractRec.getExtFlds().getExtSfoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extSfoIsNumeric()  throws CFException{
	    return extractRec.getExtFlds().extSfoIsNumeric();
	}

	/**
	 * 	Update ExtSfo with the passed value
	 *	@param number
	 */
	public void setExtSfo(long number)  throws CFException{
		extractRec.getExtFlds().setExtSfo(number);
	}
	

	
	/**
	 * 	Update ExtSfo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtSfo(char[] value)  throws CFException {
		extractRec.getExtFlds().setExtSfo(value);
	}
	
	/**
	 * 	Update ExtSfo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtSfoString(char[] value)  throws CFException{
		extractRec.getExtFlds().setExtSfo(value);
	}	

	/**
	 *	Returns the value of extAcctNo
	 *	@return extAcctNo
	 */
	public long getExtAcctNo() throws CFException {
   		return extractRec.getExtCustAcctNo().getExtAcctNo();
	}


	/**
	 *	Returns String value of extAcctNo
	 *	@return extAcctNo
	 */
	public char[]  getExtAcctNoString() throws CFException {
	     return String.valueOf(extractRec.getExtCustAcctNo().getExtAcctNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extAcctNoIsNumeric()  throws CFException{
	    return extractRec.getExtCustAcctNo().extAcctNoIsNumeric();
	}

	/**
	 * 	Update ExtAcctNo with the passed value
	 *	@param number
	 */
	public void setExtAcctNo(long number)  throws CFException{
		extractRec.getExtCustAcctNo().setExtAcctNo(number);
	}
	

	
	/**
	 * 	Update ExtAcctNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtAcctNo(char[] value)  throws CFException {
		extractRec.getExtCustAcctNo().setExtAcctNo(value);
	}
	
	/**
	 * 	Update ExtAcctNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtAcctNoString(char[] value)  throws CFException{
		extractRec.getExtCustAcctNo().setExtAcctNo(value);
	}	

	/**
	 *	Returns the value of extAddr2
	 *	@return extAddr2
	 */
   public char[] getExtAddr2() throws CFException  {              
   		return extractRec.getExtAddr2();
   }

  
	/**
	*  set variable extAddr2
	*  @param value
	**/
   public void setExtAddr2(char[] value) throws CFException {
      extractRec.setExtAddr2(value);
   } 

     /**
	 * 	Update ExtAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtAddr2(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtAddr2(source, sourceIndex);
   	
   }
   
   public void setExtAddr2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtAddr2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtAddr2 with another Field
	 *	@param value
	 */
   public void setExtAddr2(Field source) {
      extractRec.setExtAddr2(source);
   }  
   
     /**
	 * 	Update ExtAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtAddr2(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtAddr2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extTermnlOptCd
	 *	@return extTermnlOptCd
	 */
   public char[] getExtTermnlOptCd() throws CFException  {              
   		return extractRec.getExtTermnlOptCd();
   }

  
	/**
	*  set variable extTermnlOptCd
	*  @param value
	**/
   public void setExtTermnlOptCd(char[] value) throws CFException {
      extractRec.setExtTermnlOptCd(value);
   } 

     /**
	 * 	Update ExtTermnlOptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtTermnlOptCd(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtTermnlOptCd(source, sourceIndex);
   	
   }
   
   public void setExtTermnlOptCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtTermnlOptCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtTermnlOptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtTermnlOptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtTermnlOptCd with another Field
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source) {
      extractRec.setExtTermnlOptCd(source);
   }  
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtTermnlOptCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtTermnlOptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtTermnlOptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtTermnlOptCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extEmailAddr2
	 *	@return extEmailAddr2
	 */
   public char[] getExtEmailAddr2() throws CFException  {              
   		return extractRec.getExtEmailAddr2();
   }

  
	/**
	*  set variable extEmailAddr2
	*  @param value
	**/
   public void setExtEmailAddr2(char[] value) throws CFException {
      extractRec.setExtEmailAddr2(value);
   } 

     /**
	 * 	Update ExtEmailAddr2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtEmailAddr2(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtEmailAddr2(source, sourceIndex);
   	
   }
   
   public void setExtEmailAddr2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtEmailAddr2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtEmailAddr2 with another Field
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source) {
      extractRec.setExtEmailAddr2(source);
   }  
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtEmailAddr2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtEmailAddr2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtEmailAddr2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtEmailAddr2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dvcTransRsnCd
	 *	@return dvcTransRsnCd
	 */
   public char[] getDvcTransRsnCd() throws CFException  {              
   		return extractRec.getDvcTransRsnCd();
   }

  
	/**
	*  set variable dvcTransRsnCd
	*  @param value
	**/
   public void setDvcTransRsnCd(char[] value) throws CFException {
      extractRec.setDvcTransRsnCd(value);
   } 

     /**
	 * 	Update DvcTransRsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDvcTransRsnCd(char[] source, int sourceIndex) throws CFException {
      extractRec.setDvcTransRsnCd(source, sourceIndex);
   	
   }
   
   public void setDvcTransRsnCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setDvcTransRsnCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDvcTransRsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setDvcTransRsnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DvcTransRsnCd with another Field
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source) {
      extractRec.setDvcTransRsnCd(source);
   }  
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source, int sourceIndex,int sourceLen) {
      extractRec.setDvcTransRsnCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DvcTransRsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDvcTransRsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setDvcTransRsnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extSlsRepLname
	 *	@return extSlsRepLname
	 */
   public char[] getExtSlsRepLname() throws CFException  {              
   		return extractRec.getExtSlsRepLname();
   }

  
	/**
	*  set variable extSlsRepLname
	*  @param value
	**/
   public void setExtSlsRepLname(char[] value) throws CFException {
      extractRec.setExtSlsRepLname(value);
   } 

     /**
	 * 	Update ExtSlsRepLname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtSlsRepLname(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtSlsRepLname(source, sourceIndex);
   	
   }
   
   public void setExtSlsRepLname(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtSlsRepLname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepLname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtSlsRepLname with another Field
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source) {
      extractRec.setExtSlsRepLname(source);
   }  
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtSlsRepLname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtSlsRepLname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtSlsRepLname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtSlsRepLname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of extUniqueIdLine
	 *	@return extUniqueIdLine
	 */
   public char[] getExtUniqueIdLine() throws CFException  {              
   		return extractRec.getExtUniqueIdLine();
   }

  
	/**
	*  set variable extUniqueIdLine
	*  @param value
	**/
   public void setExtUniqueIdLine(char[] value) throws CFException {
      extractRec.setExtUniqueIdLine(value);
   } 

     /**
	 * 	Update ExtUniqueIdLine 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtUniqueIdLine(char[] source, int sourceIndex) throws CFException {
      extractRec.setExtUniqueIdLine(source, sourceIndex);
   	
   }
   
   public void setExtUniqueIdLine(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      extractRec.setExtUniqueIdLine(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtUniqueIdLine(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtUniqueIdLine(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExtUniqueIdLine with another Field
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source) {
      extractRec.setExtUniqueIdLine(source);
   }  
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source, int sourceIndex,int sourceLen) {
      extractRec.setExtUniqueIdLine(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExtUniqueIdLine 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtUniqueIdLine(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      extractRec.setExtUniqueIdLine(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
        }

        public String1OutCtx getString1OutCtx() {
            return new String1OutCtx();
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
        str += extractRec.hashCode();
       return str.hashCode();
    }

    public String1InCtx clone() {
        String1InCtx cloneObj = new String1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.extractRec = new ExtractRec();
        cloneObj.extractRec.set(extractRec.getClonedField());
        return cloneObj;
    }

    }

    public String1InCtx getString1InCtx() {
            return new String1InCtx();
    }
     public class String1OutCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();
     ExtractRec extractRec = CfstringCtx.this.getExtractRec();

	/**
	 *	Returns the value of delimRec
	 *	@return delimRec
	 */
   public char[] getDelimRec() throws CFException  {              
   		return work.getDelimRec();
   }

  
	/**
	*  set variable delimRec
	*  @param value
	**/
   public void setDelimRec(char[] value) throws CFException {
      work.setDelimRec(value);
   } 


        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
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
        str += extractRec.hashCode();
       return str.hashCode();
    }

    public String1OutCtx clone() {
        String1OutCtx cloneObj = new String1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.extractRec = new ExtractRec();
        cloneObj.extractRec.set(extractRec.getClonedField());
        return cloneObj;
    }

    }

    public String1OutCtx getString1OutCtx() {
            return new String1OutCtx();
    }
     public class DisplayParmsInCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {        
   		return work.getP3Cnt();
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *	@param number
	 */
	public void setP3Cnt(int number)  throws CFException{
		work.setP3Cnt(number);
	}


	public void setP3Cnt(long number)  throws CFException{
		work.setP3Cnt((int)number);
	}


	/**
	 *	Returns the value of parm1
	 *	@return parm1
	 */
   public char[] getParm1() throws CFException  {              
   		return work.getParm1();
   }

  
	/**
	*  set variable parm1
	*  @param value
	**/
   public void setParm1(char[] value) throws CFException {
      work.setParm1(value);
   } 

	/**
	 *	Returns the value of parm5
	 *	@return parm5
	 */
   public char[] getParm5() throws CFException  {              
   		return work.getParm5();
   }

  
	/**
	*  set variable parm5
	*  @param value
	**/
   public void setParm5(char[] value) throws CFException {
      work.setParm5(value);
   } 

	/**
	 *	Returns the value of p6Cnt
	 *	@return p6Cnt
	 */
	public int getP6Cnt() throws CFException {        
   		return work.getP6Cnt();
	}
	
	/**
	 * 	Update P6Cnt with the passed value
	 *	@param number
	 */
	public void setP6Cnt(int number)  throws CFException{
		work.setP6Cnt(number);
	}


	public void setP6Cnt(long number)  throws CFException{
		work.setP6Cnt((int)number);
	}


	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {        
   		return work.getP1Cnt();
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *	@param number
	 */
	public void setP1Cnt(int number)  throws CFException{
		work.setP1Cnt(number);
	}


	public void setP1Cnt(long number)  throws CFException{
		work.setP1Cnt((int)number);
	}


	/**
	 *	Returns the value of p5Cnt
	 *	@return p5Cnt
	 */
	public int getP5Cnt() throws CFException {        
   		return work.getP5Cnt();
	}
	
	/**
	 * 	Update P5Cnt with the passed value
	 *	@param number
	 */
	public void setP5Cnt(int number)  throws CFException{
		work.setP5Cnt(number);
	}


	public void setP5Cnt(long number)  throws CFException{
		work.setP5Cnt((int)number);
	}


	/**
	 *	Returns the value of p4Cnt
	 *	@return p4Cnt
	 */
	public int getP4Cnt() throws CFException {        
   		return work.getP4Cnt();
	}
	
	/**
	 * 	Update P4Cnt with the passed value
	 *	@param number
	 */
	public void setP4Cnt(int number)  throws CFException{
		work.setP4Cnt(number);
	}


	public void setP4Cnt(long number)  throws CFException{
		work.setP4Cnt((int)number);
	}


	/**
	 *	Returns the value of parm6
	 *	@return parm6
	 */
   public char[] getParm6() throws CFException  {              
   		return work.getParm6();
   }

  
	/**
	*  set variable parm6
	*  @param value
	**/
   public void setParm6(char[] value) throws CFException {
      work.setParm6(value);
   } 

	/**
	 *	Returns the value of parm2
	 *	@return parm2
	 */
   public char[] getParm2() throws CFException  {              
   		return work.getParm2();
   }

  
	/**
	*  set variable parm2
	*  @param value
	**/
   public void setParm2(char[] value) throws CFException {
      work.setParm2(value);
   } 

	/**
	 *	Returns the value of parm3
	 *	@return parm3
	 */
   public char[] getParm3() throws CFException  {              
   		return work.getParm3();
   }

  
	/**
	*  set variable parm3
	*  @param value
	**/
   public void setParm3(char[] value) throws CFException {
      work.setParm3(value);
   } 

	/**
	 *	Returns the value of parm4
	 *	@return parm4
	 */
   public char[] getParm4() throws CFException  {              
   		return work.getParm4();
   }

  
	/**
	*  set variable parm4
	*  @param value
	**/
   public void setParm4(char[] value) throws CFException {
      work.setParm4(value);
   } 

	/**
	 *	Returns the value of p2Cnt
	 *	@return p2Cnt
	 */
	public int getP2Cnt() throws CFException {        
   		return work.getP2Cnt();
	}
	
	/**
	 * 	Update P2Cnt with the passed value
	 *	@param number
	 */
	public void setP2Cnt(int number)  throws CFException{
		work.setP2Cnt(number);
	}


	public void setP2Cnt(long number)  throws CFException{
		work.setP2Cnt((int)number);
	}



        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
        }

        public DisplayParmsOutCtx getDisplayParmsOutCtx() {
            return new DisplayParmsOutCtx();
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

    public DisplayParmsInCtx clone() {
        DisplayParmsInCtx cloneObj = new DisplayParmsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayParmsInCtx getDisplayParmsInCtx() {
            return new DisplayParmsInCtx();
    }
     public class DisplayParmsOutCtx implements Cloneable {
     Work work = CfstringCtx.this.getWork();

	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {        
   		return work.getP3Cnt();
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *	@param number
	 */
	public void setP3Cnt(int number)  throws CFException{
		work.setP3Cnt(number);
	}


	public void setP3Cnt(long number)  throws CFException{
		work.setP3Cnt((int)number);
	}


	/**
	 *	Returns the value of p6Cnt
	 *	@return p6Cnt
	 */
	public int getP6Cnt() throws CFException {        
   		return work.getP6Cnt();
	}
	
	/**
	 * 	Update P6Cnt with the passed value
	 *	@param number
	 */
	public void setP6Cnt(int number)  throws CFException{
		work.setP6Cnt(number);
	}


	public void setP6Cnt(long number)  throws CFException{
		work.setP6Cnt((int)number);
	}


	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {        
   		return work.getP1Cnt();
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *	@param number
	 */
	public void setP1Cnt(int number)  throws CFException{
		work.setP1Cnt(number);
	}


	public void setP1Cnt(long number)  throws CFException{
		work.setP1Cnt((int)number);
	}


	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException  {              
   		return work.getEdit();
   }

  
	/**
	*  set variable edit
	*  @param value
	**/
   public void setEdit(char[] value) throws CFException {
      work.setEdit(value);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) throws CFException {
      work.setEdit(source, sourceIndex);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
      work.setEdit(source);
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
      work.setEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of p5Cnt
	 *	@return p5Cnt
	 */
	public int getP5Cnt() throws CFException {        
   		return work.getP5Cnt();
	}
	
	/**
	 * 	Update P5Cnt with the passed value
	 *	@param number
	 */
	public void setP5Cnt(int number)  throws CFException{
		work.setP5Cnt(number);
	}


	public void setP5Cnt(long number)  throws CFException{
		work.setP5Cnt((int)number);
	}


	/**
	 *	Returns the value of p4Cnt
	 *	@return p4Cnt
	 */
	public int getP4Cnt() throws CFException {        
   		return work.getP4Cnt();
	}
	
	/**
	 * 	Update P4Cnt with the passed value
	 *	@param number
	 */
	public void setP4Cnt(int number)  throws CFException{
		work.setP4Cnt(number);
	}


	public void setP4Cnt(long number)  throws CFException{
		work.setP4Cnt((int)number);
	}


	/**
	 *	Returns the value of p2Cnt
	 *	@return p2Cnt
	 */
	public int getP2Cnt() throws CFException {        
   		return work.getP2Cnt();
	}
	
	/**
	 * 	Update P2Cnt with the passed value
	 *	@param number
	 */
	public void setP2Cnt(int number)  throws CFException{
		work.setP2Cnt(number);
	}


	public void setP2Cnt(long number)  throws CFException{
		work.setP2Cnt((int)number);
	}



        public CfstringCtx getCfstringCtx() {
            return CfstringCtx.this;
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

    public DisplayParmsOutCtx clone() {
        DisplayParmsOutCtx cloneObj = new DisplayParmsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayParmsOutCtx getDisplayParmsOutCtx() {
            return new DisplayParmsOutCtx();
    }
}
