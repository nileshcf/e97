package com.cloudframe.app.mcindex;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcindex.dto.IndexVal800;
import com.cloudframe.app.mcindex.dto.Work;
import com.cloudframe.app.mcindex.dto.ErrorInfoTableDefault315;
import com.cloudframe.app.mcindex.dto.Index;
import com.cloudframe.app.global.sharedvar.Ip0007o4DeSubAttrTable;
import com.cloudframe.app.mcindex.dto.Ip3oo8o1EditsPerfTbl;
import com.cloudframe.app.mcindex.dto.ZeroValGroup800;
import com.cloudframe.app.global.sharedvar.Ip0006o4DeAttrTable;


@Context
public class McindexCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip0007o4DeSubAttrTable ip0007o4DeSubAttrTable;
    Index index;
    ErrorInfoTableDefault315 errorInfoTableDefault315;
    Work work;
    Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl;
    IndexVal800 indexVal800;
    Ip0006o4DeAttrTable ip0006o4DeAttrTable;
    ZeroValGroup800 zeroValGroup800;

    int ip66601UserT;
    int ip66601UserLeft;
    int zeroIdx3800;
    int ip0007o4I;
    int ip0006o4I;
    int zeroIdx2800;

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


    public Ip0007o4DeSubAttrTable getIp0007o4DeSubAttrTable() {
        if (ip0007o4DeSubAttrTable == null) {
            ip0007o4DeSubAttrTable = globalCtx.getGlobalDto(Ip0007o4DeSubAttrTable.class);
        }

        return ip0007o4DeSubAttrTable;
    }

    public Index getIndex() {
        if (index == null) {
            index = new Index();
        }

        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
    public ErrorInfoTableDefault315 getErrorInfoTableDefault315() {
        if (errorInfoTableDefault315 == null) {
            errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        }

        return errorInfoTableDefault315;
    }

    public void setErrorInfoTableDefault315(ErrorInfoTableDefault315 errorInfoTableDefault315) {
        this.errorInfoTableDefault315 = errorInfoTableDefault315;
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
    public Ip3oo8o1EditsPerfTbl getIp3oo8o1EditsPerfTbl() {
        if (ip3oo8o1EditsPerfTbl == null) {
            ip3oo8o1EditsPerfTbl = new Ip3oo8o1EditsPerfTbl();
        }

        return ip3oo8o1EditsPerfTbl;
    }

    public void setIp3oo8o1EditsPerfTbl(Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl) {
        this.ip3oo8o1EditsPerfTbl = ip3oo8o1EditsPerfTbl;
    }
    public IndexVal800 getIndexVal800() {
        if (indexVal800 == null) {
            indexVal800 = new IndexVal800();
        }

        return indexVal800;
    }

    public void setIndexVal800(IndexVal800 indexVal800) {
        this.indexVal800 = indexVal800;
    }
    public Ip0006o4DeAttrTable getIp0006o4DeAttrTable() {
        if (ip0006o4DeAttrTable == null) {
            ip0006o4DeAttrTable = globalCtx.getGlobalDto(Ip0006o4DeAttrTable.class);
        }

        return ip0006o4DeAttrTable;
    }

    public ZeroValGroup800 getZeroValGroup800() {
        if (zeroValGroup800 == null) {
            zeroValGroup800 = new ZeroValGroup800();
        }

        return zeroValGroup800;
    }

    public void setZeroValGroup800(ZeroValGroup800 zeroValGroup800) {
        this.zeroValGroup800 = zeroValGroup800;
    }

    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getIp66601UserLeft() {
        return ip66601UserLeft;
    }

    public void setIp66601UserLeft(int ip66601UserLeft) {
        this.ip66601UserLeft = ip66601UserLeft;
    }
    public int getZeroIdx3800() {
        return zeroIdx3800;
    }

    public void setZeroIdx3800(int zeroIdx3800) {
        this.zeroIdx3800 = zeroIdx3800;
    }
    public int getIp0007o4I() {
        return ip0007o4I;
    }

    public void setIp0007o4I(int ip0007o4I) {
        this.ip0007o4I = ip0007o4I;
    }
    public int getIp0006o4I() {
        return ip0006o4I;
    }

    public void setIp0006o4I(int ip0006o4I) {
        this.ip0006o4I = ip0006o4I;
    }
    public int getZeroIdx2800() {
        return zeroIdx2800;
    }

    public void setZeroIdx2800(int zeroIdx2800) {
        this.zeroIdx2800 = zeroIdx2800;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip0007o4DeSubAttrTable.hashCode();
        str += index.hashCode();
        str += errorInfoTableDefault315.hashCode();
        str += work.hashCode();
        str += ip3oo8o1EditsPerfTbl.hashCode();
        str += indexVal800.hashCode();
        str += ip0006o4DeAttrTable.hashCode();
        str += zeroValGroup800.hashCode();
       return str.hashCode();
    }

    public McindexCtx clone() {
        McindexCtx cloneObj = new McindexCtx();
        cloneObj.ip0007o4DeSubAttrTable = new Ip0007o4DeSubAttrTable();
        cloneObj.ip0007o4DeSubAttrTable.set(ip0007o4DeSubAttrTable.getClonedField());
        cloneObj.index = new Index();
        cloneObj.index.set(index.getClonedField());
        cloneObj.errorInfoTableDefault315 = new ErrorInfoTableDefault315();
        cloneObj.errorInfoTableDefault315.set(errorInfoTableDefault315.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip3oo8o1EditsPerfTbl = new Ip3oo8o1EditsPerfTbl();
        cloneObj.ip3oo8o1EditsPerfTbl.set(ip3oo8o1EditsPerfTbl.getClonedField());
        cloneObj.indexVal800 = new IndexVal800();
        cloneObj.indexVal800.set(indexVal800.getClonedField());
        cloneObj.ip0006o4DeAttrTable = new Ip0006o4DeAttrTable();
        cloneObj.ip0006o4DeAttrTable.set(ip0006o4DeAttrTable.getClonedField());
        cloneObj.zeroValGroup800 = new ZeroValGroup800();
        cloneObj.zeroValGroup800.set(zeroValGroup800.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainSplit0InCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     ZeroValGroup800 zeroValGroup800 = McindexCtx.this.getZeroValGroup800();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of zero800
	 *	@return zero800
	 */
	public int getZero800() throws CFException {        
   		return zeroValGroup800.getZero800();
	}
	
	/**
	 * 	Update Zero800 with the passed value
	 *	@param number
	 */
	public void setZero800(int number)  throws CFException{
		zeroValGroup800.setZero800(number);
	}


	public void setZero800(long number)  throws CFException{
		zeroValGroup800.setZero800((int)number);
	}


	/**
	 *	Returns the value of zeroIdx2800
	 *	@return zeroIdx2800
	 */
	public int getZeroIdx2800() throws CFException {        
   		return zeroIdx2800;
	}
	
	/**
	 * 	Update ZeroIdx2800 with the passed value
	 *	@param number
	 */
	public void setZeroIdx2800(int number)  throws CFException{
		McindexCtx.this.setZeroIdx2800(number);
	}


	public void setZeroIdx2800(long number)  throws CFException{
		McindexCtx.this.setZeroIdx2800((int)number);
	}



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += zeroValGroup800.hashCode();
       return str.hashCode();
    }

    public MainSplit0InCtx clone() {
        MainSplit0InCtx cloneObj = new MainSplit0InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zeroValGroup800 = new ZeroValGroup800();
        cloneObj.zeroValGroup800.set(zeroValGroup800.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0InCtx getMainSplit0InCtx() {
            return new MainSplit0InCtx();
    }
     public class MainSplit0OutCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     ZeroValGroup800 zeroValGroup800 = McindexCtx.this.getZeroValGroup800();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}


	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {        
   		return work.getVal3400();
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *	@param number
	 */
	public void setVal3400(int number)  throws CFException{
		work.setVal3400(number);
	}


	public void setVal3400(long number)  throws CFException{
		work.setVal3400((int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	


        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += zeroValGroup800.hashCode();
       return str.hashCode();
    }

    public MainSplit0OutCtx clone() {
        MainSplit0OutCtx cloneObj = new MainSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.zeroValGroup800 = new ZeroValGroup800();
        cloneObj.zeroValGroup800.set(zeroValGroup800.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit0OutCtx getMainSplit0OutCtx() {
            return new MainSplit0OutCtx();
    }
     public class MainSplit1InCtx implements Cloneable {
     Index index = McindexCtx.this.getIndex();
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of zeroIdx4800
	 *	@return zeroIdx4800
	 */
	public int getZeroIdx4800(int _index) throws CFException {        
   		return index.getZeroIdx4800((_index));
	}
	
	/**
	 * 	Update ZeroIdx4800 with the passed value
	 *	@param number
	 */
	public void setZeroIdx4800(int _index,int number)  throws CFException{
		index.setZeroIdx4800((_index),number);
	}


	public void setZeroIdx4800(int _index,long number)  throws CFException{
		index.setZeroIdx4800((_index),(int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	

	/**
	 *	Returns the value of zeroIdx3800
	 *	@return zeroIdx3800
	 */
	public int getZeroIdx3800() throws CFException {        
   		return zeroIdx3800;
	}
	
	/**
	 * 	Update ZeroIdx3800 with the passed value
	 *	@param number
	 */
	public void setZeroIdx3800(int number)  throws CFException{
		McindexCtx.this.setZeroIdx3800(number);
	}


	public void setZeroIdx3800(long number)  throws CFException{
		McindexCtx.this.setZeroIdx3800((int)number);
	}



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += index.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit1InCtx clone() {
        MainSplit1InCtx cloneObj = new MainSplit1InCtx();
        cloneObj.index = new Index();
        cloneObj.index.set(index.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1InCtx getMainSplit1InCtx() {
            return new MainSplit1InCtx();
    }
     public class MainSplit1OutCtx implements Cloneable {
     Index index = McindexCtx.this.getIndex();
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}


	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {        
   		return work.getVal3400();
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *	@param number
	 */
	public void setVal3400(int number)  throws CFException{
		work.setVal3400(number);
	}


	public void setVal3400(long number)  throws CFException{
		work.setVal3400((int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	


        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += index.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit1OutCtx clone() {
        MainSplit1OutCtx cloneObj = new MainSplit1OutCtx();
        cloneObj.index = new Index();
        cloneObj.index.set(index.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit1OutCtx getMainSplit1OutCtx() {
            return new MainSplit1OutCtx();
    }
     public class MainSplit2InCtx implements Cloneable {
     Index index = McindexCtx.this.getIndex();
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of zeroVal300
	 *	@return zeroVal300
	 */
	public long getZeroVal300() throws CFException {        
   		return work.getZeroVal300();
	}
	
	/**
	 * 	Update ZeroVal300 with the passed value
	 *	@param number
	 */
	public void setZeroVal300(long number)  throws CFException{
		work.setZeroVal300(number);
	}



	/**
	 *	Returns the value of zeroIdx5800
	 *	@return zeroIdx5800
	 */
	public int getZeroIdx5800(int _index) throws CFException {        
   		return index.getIndexTbl1800(_index).getZeroIdx5800();
	}
	
	/**
	 * 	Update ZeroIdx5800 with the passed value
	 *	@param number
	 */
	public void setZeroIdx5800(int _index,int number)  throws CFException{
		index.getIndexTbl1800(_index).setZeroIdx5800(number);
	}


	public void setZeroIdx5800(int _index,long number)  throws CFException{
		index.getIndexTbl1800(_index).setZeroIdx5800((int)number);
	}



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += index.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit2InCtx clone() {
        MainSplit2InCtx cloneObj = new MainSplit2InCtx();
        cloneObj.index = new Index();
        cloneObj.index.set(index.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2InCtx getMainSplit2InCtx() {
            return new MainSplit2InCtx();
    }
     public class MainSplit2OutCtx implements Cloneable {
     Index index = McindexCtx.this.getIndex();
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of valEdit400
	 *	@return valEdit400
	 */
   public char[] getValEdit400() throws CFException  {              
   		return work.getValEdit400();
   }

  
	/**
	*  set variable valEdit400
	*  @param value
	**/
   public void setValEdit400(char[] value) throws CFException {
      work.setValEdit400(value);
   } 

     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex) throws CFException {
      work.setValEdit400(source, sourceIndex);
   	
   }
   
   public void setValEdit400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setValEdit400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ValEdit400 with another Field
	 *	@param value
	 */
   public void setValEdit400(Field source) {
      work.setValEdit400(source);
   }  
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen) {
      work.setValEdit400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}


	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {        
   		return work.getVal3400();
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *	@param number
	 */
	public void setVal3400(int number)  throws CFException{
		work.setVal3400(number);
	}


	public void setVal3400(long number)  throws CFException{
		work.setVal3400((int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	


        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += index.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit2OutCtx clone() {
        MainSplit2OutCtx cloneObj = new MainSplit2OutCtx();
        cloneObj.index = new Index();
        cloneObj.index.set(index.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit2OutCtx getMainSplit2OutCtx() {
            return new MainSplit2OutCtx();
    }
     public class MainSplit3InCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of zeroVal300
	 *	@return zeroVal300
	 */
	public long getZeroVal300() throws CFException {        
   		return work.getZeroVal300();
	}
	
	/**
	 * 	Update ZeroVal300 with the passed value
	 *	@param number
	 */
	public void setZeroVal300(long number)  throws CFException{
		work.setZeroVal300(number);
	}



	/**
	 *	Returns the value of minusoneVal300
	 *	@return minusoneVal300
	 */
	public int getMinusoneVal300() throws CFException {        
   		return work.getMinusoneVal300();
	}
	
	/**
	 * 	Update MinusoneVal300 with the passed value
	 *	@param number
	 */
	public void setMinusoneVal300(int number)  throws CFException{
		work.setMinusoneVal300(number);
	}


	public void setMinusoneVal300(long number)  throws CFException{
		work.setMinusoneVal300((int)number);
	}



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainSplit3InCtx clone() {
        MainSplit3InCtx cloneObj = new MainSplit3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3InCtx getMainSplit3InCtx() {
            return new MainSplit3InCtx();
    }
     public class MainSplit3OutCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of valEdit400
	 *	@return valEdit400
	 */
   public char[] getValEdit400() throws CFException  {              
   		return work.getValEdit400();
   }

  
	/**
	*  set variable valEdit400
	*  @param value
	**/
   public void setValEdit400(char[] value) throws CFException {
      work.setValEdit400(value);
   } 

     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex) throws CFException {
      work.setValEdit400(source, sourceIndex);
   	
   }
   
   public void setValEdit400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setValEdit400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ValEdit400 with another Field
	 *	@param value
	 */
   public void setValEdit400(Field source) {
      work.setValEdit400(source);
   }  
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen) {
      work.setValEdit400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}



public void setIp66601UserLeft(int ip66601UserLeft) { 
    McindexCtx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return McindexCtx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {        
   		return work.getVal3400();
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *	@param number
	 */
	public void setVal3400(int number)  throws CFException{
		work.setVal3400(number);
	}


	public void setVal3400(long number)  throws CFException{
		work.setVal3400((int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	


        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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

    public MainSplit3OutCtx clone() {
        MainSplit3OutCtx cloneObj = new MainSplit3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit3OutCtx getMainSplit3OutCtx() {
            return new MainSplit3OutCtx();
    }
     public class MainSplit4InCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     IndexVal800 indexVal800 = McindexCtx.this.getIndexVal800();
     ZeroValGroup800 zeroValGroup800 = McindexCtx.this.getZeroValGroup800();

public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of zeroVal300
	 *	@return zeroVal300
	 */
	public long getZeroVal300() throws CFException {        
   		return work.getZeroVal300();
	}
	
	/**
	 * 	Update ZeroVal300 with the passed value
	 *	@param number
	 */
	public void setZeroVal300(long number)  throws CFException{
		work.setZeroVal300(number);
	}




public void setIp66601UserLeft(int ip66601UserLeft) { 
    McindexCtx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return McindexCtx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of minusoneVal300
	 *	@return minusoneVal300
	 */
	public int getMinusoneVal300() throws CFException {        
   		return work.getMinusoneVal300();
	}
	
	/**
	 * 	Update MinusoneVal300 with the passed value
	 *	@param number
	 */
	public void setMinusoneVal300(int number)  throws CFException{
		work.setMinusoneVal300(number);
	}


	public void setMinusoneVal300(long number)  throws CFException{
		work.setMinusoneVal300((int)number);
	}


	/**
	 *	Returns the value of zero800
	 *	@return zero800
	 */
	public int getZero800() throws CFException {        
   		return zeroValGroup800.getZero800();
	}
	
	/**
	 * 	Update Zero800 with the passed value
	 *	@param number
	 */
	public void setZero800(int number)  throws CFException{
		zeroValGroup800.setZero800(number);
	}


	public void setZero800(long number)  throws CFException{
		zeroValGroup800.setZero800((int)number);
	}


	/**
	 *	Returns the value of indexVal800
	 *	@return indexVal800
	 */   
	 public IndexVal800 getIndexVal800() {
   	return indexVal800;
   }



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += work.hashCode();
        str += indexVal800.hashCode();
        str += zeroValGroup800.hashCode();
       return str.hashCode();
    }

    public MainSplit4InCtx clone() {
        MainSplit4InCtx cloneObj = new MainSplit4InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.indexVal800 = new IndexVal800();
        cloneObj.indexVal800.set(indexVal800.getClonedField());
        cloneObj.zeroValGroup800 = new ZeroValGroup800();
        cloneObj.zeroValGroup800.set(zeroValGroup800.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4InCtx getMainSplit4InCtx() {
            return new MainSplit4InCtx();
    }
     public class MainSplit4OutCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     IndexVal800 indexVal800 = McindexCtx.this.getIndexVal800();
     ZeroValGroup800 zeroValGroup800 = McindexCtx.this.getZeroValGroup800();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}
public short getVal2400() throws CFException {  
        return work.getVal2400();
}
	/**
	 * 	Update Val2400 with the passed value
	 *	@param number
	 */
	public void setVal2400(short number)  throws CFException{
		work.setVal2400(number);
	}

	public void setVal2400(int number)  throws CFException{
	   work.setVal2400(number);
	}
	public void setVal2400(long number)  throws CFException {
	    work.setVal2400(number);
	}
	


	/**
	 *	Returns the value of valEdit400
	 *	@return valEdit400
	 */
   public char[] getValEdit400() throws CFException  {              
   		return work.getValEdit400();
   }

  
	/**
	*  set variable valEdit400
	*  @param value
	**/
   public void setValEdit400(char[] value) throws CFException {
      work.setValEdit400(value);
   } 

     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex) throws CFException {
      work.setValEdit400(source, sourceIndex);
   	
   }
   
   public void setValEdit400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setValEdit400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ValEdit400 with another Field
	 *	@param value
	 */
   public void setValEdit400(Field source) {
      work.setValEdit400(source);
   }  
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen) {
      work.setValEdit400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setValEdit400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp66601UserLeft(int ip66601UserLeft) { 
    McindexCtx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return McindexCtx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}


	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {        
   		return work.getVal3400();
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *	@param number
	 */
	public void setVal3400(int number)  throws CFException{
		work.setVal3400(number);
	}


	public void setVal3400(long number)  throws CFException{
		work.setVal3400((int)number);
	}


	/**
	 *	Returns the value of index800
	 *	@return index800
	 */
	public int getIndex800() throws CFException {        
   		return indexVal800.getIndex800();
	}
	
	/**
	 * 	Update Index800 with the passed value
	 *	@param number
	 */
	public void setIndex800(int number)  throws CFException{
		indexVal800.setIndex800(number);
	}


	public void setIndex800(long number)  throws CFException{
		indexVal800.setIndex800((int)number);
	}


	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
   		return work.getVal1400();
	}


	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() throws CFException {
	     return String.valueOf(work.getVal1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric()  throws CFException{
	    return work.val1400IsNumeric();
	}

	/**
	 * 	Update Val1400 with the passed value
	 *	@param number
	 */
	public void setVal1400(int number)  throws CFException{
		work.setVal1400(number);
	}
	

	public void setVal1400(long number)  throws CFException{
	    work.setVal1400(number);
	}
	
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value)  throws CFException {
		work.setVal1400(value);
	}
	
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value)  throws CFException{
		work.setVal1400(value);
	}	


        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += indexVal800.hashCode();
        str += zeroValGroup800.hashCode();
       return str.hashCode();
    }

    public MainSplit4OutCtx clone() {
        MainSplit4OutCtx cloneObj = new MainSplit4OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.indexVal800 = new IndexVal800();
        cloneObj.indexVal800.set(indexVal800.getClonedField());
        cloneObj.zeroValGroup800 = new ZeroValGroup800();
        cloneObj.zeroValGroup800.set(zeroValGroup800.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit4OutCtx getMainSplit4OutCtx() {
            return new MainSplit4OutCtx();
    }
     public class MainSplit5InCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     IndexVal800 indexVal800 = McindexCtx.this.getIndexVal800();
     Ip0006o4DeAttrTable ip0006o4DeAttrTable = McindexCtx.this.getIp0006o4DeAttrTable();


public void setIp66601UserT(int ip66601UserT) { 
    McindexCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McindexCtx.this.ip66601UserT;
}

public void setIp0006o4I(int ip0006o4I) { 
    McindexCtx.this.ip0006o4I = ip0006o4I;
}

public int getIp0006o4I() { 
    return McindexCtx.this.ip0006o4I;
}
	/**
	 *	Returns the value of indexVal800
	 *	@return indexVal800
	 */   
	 public IndexVal800 getIndexVal800() {
   	return indexVal800;
   }


	/**
	 *	Returns the value of ip0006o4DeAttrTable
	 *	@return ip0006o4DeAttrTable
	 */   
	 public Ip0006o4DeAttrTable getIp0006o4DeAttrTable() {
   	return ip0006o4DeAttrTable;
   }



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += work.hashCode();
        str += indexVal800.hashCode();
        str += ip0006o4DeAttrTable.hashCode();
       return str.hashCode();
    }

    public MainSplit5InCtx clone() {
        MainSplit5InCtx cloneObj = new MainSplit5InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.indexVal800 = new IndexVal800();
        cloneObj.indexVal800.set(indexVal800.getClonedField());
        cloneObj.ip0006o4DeAttrTable = new Ip0006o4DeAttrTable();
        cloneObj.ip0006o4DeAttrTable.set(ip0006o4DeAttrTable.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5InCtx getMainSplit5InCtx() {
            return new MainSplit5InCtx();
    }
     public class MainSplit5OutCtx implements Cloneable {
     Work work = McindexCtx.this.getWork();
     Ip0006o4DeAttrTable ip0006o4DeAttrTable = McindexCtx.this.getIp0006o4DeAttrTable();
     IndexVal800 indexVal800 = McindexCtx.this.getIndexVal800();

	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {        
   		return work.getVal400();
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *	@param number
	 */
	public void setVal400(int number)  throws CFException{
		work.setVal400(number);
	}


	public void setVal400(long number)  throws CFException{
		work.setVal400((int)number);
	}


	/**
	 *	Returns the value of ip0006o4DeFirstSubfld
	 *	@return ip0006o4DeFirstSubfld
	 */
	public int getIp0006o4DeFirstSubfld(int index) throws CFException {        
   		return ip0006o4DeAttrTable.getIp0006o4DeAttrRow(index).getIp0006o4DeAttrUserRow().getIp0006o4DeFirstSubfld();
	}
	
	/**
	 * 	Update Ip0006o4DeFirstSubfld with the passed value
	 *	@param number
	 */
	public void setIp0006o4DeFirstSubfld(int index,int number)  throws CFException{
		ip0006o4DeAttrTable.getIp0006o4DeAttrRow(index).getIp0006o4DeAttrUserRow().setIp0006o4DeFirstSubfld(number);
	}


	public void setIp0006o4DeFirstSubfld(int index,long number)  throws CFException{
		ip0006o4DeAttrTable.getIp0006o4DeAttrRow(index).getIp0006o4DeAttrUserRow().setIp0006o4DeFirstSubfld((int)number);
	}



public void setIp0007o4I(int ip0007o4I) { 
    McindexCtx.this.ip0007o4I = ip0007o4I;
}

public int getIp0007o4I() { 
    return McindexCtx.this.ip0007o4I;
}

public void setIp0006o4I(int ip0006o4I) { 
    McindexCtx.this.ip0006o4I = ip0006o4I;
}

public int getIp0006o4I() { 
    return McindexCtx.this.ip0006o4I;
}
	/**
	 *	Returns the value of ip0006o4DeAttrTable
	 *	@return ip0006o4DeAttrTable
	 */   
	 public Ip0006o4DeAttrTable getIp0006o4DeAttrTable() {
   	return ip0006o4DeAttrTable;
   }



        public McindexCtx getMcindexCtx() {
            return McindexCtx.this;
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
        str += ip0006o4DeAttrTable.hashCode();
        str += indexVal800.hashCode();
       return str.hashCode();
    }

    public MainSplit5OutCtx clone() {
        MainSplit5OutCtx cloneObj = new MainSplit5OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip0006o4DeAttrTable = new Ip0006o4DeAttrTable();
        cloneObj.ip0006o4DeAttrTable.set(ip0006o4DeAttrTable.getClonedField());
        cloneObj.indexVal800 = new IndexVal800();
        cloneObj.indexVal800.set(indexVal800.getClonedField());
        return cloneObj;
    }

    }

    public MainSplit5OutCtx getMainSplit5OutCtx() {
            return new MainSplit5OutCtx();
    }
}
