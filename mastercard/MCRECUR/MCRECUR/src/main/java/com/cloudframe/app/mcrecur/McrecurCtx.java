package com.cloudframe.app.mcrecur;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcrecur.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip66601UserTag;
import com.cloudframe.app.mcrecur.dto.MapRow1ValGroup800;
import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
import com.cloudframe.app.global.sharedvar.Ip66607SortInfo;


@Context
public class McrecurCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip66601UserTagInformation ip66601UserTagInformation;
    Work work;
    MapRow1ValGroup800 mapRow1ValGroup800;
    Ip66607SortInfo ip66607SortInfo;

    int ip66601UserEnd;
    int ip66601UserT;
    int userEnd800;

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


    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = globalCtx.getGlobalDto(Ip66601UserTagInformation.class);
        }

        return ip66601UserTagInformation;
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
    public MapRow1ValGroup800 getMapRow1ValGroup800() {
        if (mapRow1ValGroup800 == null) {
            mapRow1ValGroup800 = new MapRow1ValGroup800();
        }

        return mapRow1ValGroup800;
    }

    public void setMapRow1ValGroup800(MapRow1ValGroup800 mapRow1ValGroup800) {
        this.mapRow1ValGroup800 = mapRow1ValGroup800;
    }
    public Ip66607SortInfo getIp66607SortInfo() {
        if (ip66607SortInfo == null) {
            ip66607SortInfo = globalCtx.getGlobalDto(Ip66607SortInfo.class);
        }

        return ip66607SortInfo;
    }


    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }
    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getUserEnd800() {
        return userEnd800;
    }

    public void setUserEnd800(int userEnd800) {
        this.userEnd800 = userEnd800;
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
        str += work.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += ip66607SortInfo.hashCode();
       return str.hashCode();
    }

    public McrecurCtx clone() {
        McrecurCtx cloneObj = new McrecurCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineSplit0InCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = McrecurCtx.this.getIp66601UserTagInformation();
     Work work = McrecurCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    McrecurCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McrecurCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}




        public McrecurCtx getMcrecurCtx() {
            return McrecurCtx.this;
        }

        public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0InCtx clone() {
        MainlineSplit0InCtx cloneObj = new MainlineSplit0InCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0InCtx getMainlineSplit0InCtx() {
            return new MainlineSplit0InCtx();
    }
     public class MainlineSplit0OutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = McrecurCtx.this.getIp66601UserTagInformation();
     Work work = McrecurCtx.this.getWork();

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
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTcnt();
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt(number);
	}

	public void setIp66601UserTcnt(int number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}

	public void setIp66601UserTcnt(long number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}



	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
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




        public McrecurCtx getMcrecurCtx() {
            return McrecurCtx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0OutCtx clone() {
        MainlineSplit0OutCtx cloneObj = new MainlineSplit0OutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
    }
     public class MainlineSplit1InCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = McrecurCtx.this.getIp66601UserTagInformation();
     Work work = McrecurCtx.this.getWork();
     MapRow1ValGroup800 mapRow1ValGroup800 = McrecurCtx.this.getMapRow1ValGroup800();
     Ip66607SortInfo ip66607SortInfo = McrecurCtx.this.getIp66607SortInfo();

	/**
	 *	Returns the value of mapRow1Val800
	 *	@return mapRow1Val800
	 */
	public int getMapRow1Val800() throws CFException {        
   		return mapRow1ValGroup800.getMapRow1Val800();
	}
	
	/**
	 * 	Update MapRow1Val800 with the passed value
	 *	@param number
	 */
	public void setMapRow1Val800(int number)  throws CFException{
		mapRow1ValGroup800.setMapRow1Val800(number);
	}


	public void setMapRow1Val800(long number)  throws CFException{
		mapRow1ValGroup800.setMapRow1Val800((int)number);
	}



public void setIp66601UserT(int ip66601UserT) { 
    McrecurCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McrecurCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTcnt();
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt(number);
	}

	public void setIp66601UserTcnt(int number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}

	public void setIp66601UserTcnt(long number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}



	/**
	 *	Returns the value of mapRow1800
	 *	@return mapRow1800
	 */
	public int getMapRow1800() throws CFException {        
   		return mapRow1ValGroup800.getMapRow1800();
	}
	
	/**
	 * 	Update MapRow1800 with the passed value
	 *	@param number
	 */
	public void setMapRow1800(int number)  throws CFException{
		mapRow1ValGroup800.setMapRow1800(number);
	}


	public void setMapRow1800(long number)  throws CFException{
		mapRow1ValGroup800.setMapRow1800((int)number);
	}


	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of userEnd800
	 *	@return userEnd800
	 */
	public int getUserEnd800() throws CFException {        
   		return userEnd800;
	}
	
	/**
	 * 	Update UserEnd800 with the passed value
	 *	@param number
	 */
	public void setUserEnd800(int number)  throws CFException{
		McrecurCtx.this.setUserEnd800(number);
	}


	public void setUserEnd800(long number)  throws CFException{
		McrecurCtx.this.setUserEnd800((int)number);
	}


	/**
	 *	Returns the value of quicksort300
	 *	@return quicksort300
	 */
   public char[] getQuicksort300() throws CFException  {              
   		return work.getQuicksort300();
   }

  
	/**
	*  set variable quicksort300
	*  @param value
	**/
   public void setQuicksort300(char[] value) throws CFException {
      work.setQuicksort300(value);
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



        public McrecurCtx getMcrecurCtx() {
            return McrecurCtx.this;
        }

        public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
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
        str += work.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += ip66607SortInfo.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1InCtx clone() {
        MainlineSplit1InCtx cloneObj = new MainlineSplit1InCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1InCtx getMainlineSplit1InCtx() {
            return new MainlineSplit1InCtx();
    }
     public class MainlineSplit1OutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = McrecurCtx.this.getIp66601UserTagInformation();
     Work work = McrecurCtx.this.getWork();
     MapRow1ValGroup800 mapRow1ValGroup800 = McrecurCtx.this.getMapRow1ValGroup800();
     Ip66607SortInfo ip66607SortInfo = McrecurCtx.this.getIp66607SortInfo();

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
	 *	Returns the value of ptrIp666030800
	 *	@return ptrIp666030800
	 */
   public char[] getPtrIp666030800() throws CFException  {              
   		return work.getPtrIp666030800();
   }

  
	/**
	*  set variable ptrIp666030800
	*  @param value
	**/
   public void setPtrIp666030800(char[] value) throws CFException {
      work.setPtrIp666030800(value);
   } 

	/**
	 *	Returns the value of ip66607Start
	 *	@return ip66607Start
	 */
	public int getIp66607Start() throws CFException {        
   		return ip66607SortInfo.getIp66607Start();
	}
	
	/**
	 * 	Update Ip66607Start with the passed value
	 *	@param number
	 */
	public void setIp66607Start(int number)  throws CFException{
		ip66607SortInfo.setIp66607Start(number);
	}


	public void setIp66607Start(long number)  throws CFException{
		ip66607SortInfo.setIp66607Start((int)number);
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


public void setIp66601UserEnd(int ip66601UserEnd) { 
    McrecurCtx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return McrecurCtx.this.ip66601UserEnd;
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
	 *	Returns the value of ip66607End
	 *	@return ip66607End
	 */
	public int getIp66607End() throws CFException {        
   		return ip66607SortInfo.getIp66607End();
	}
	
	/**
	 * 	Update Ip66607End with the passed value
	 *	@param number
	 */
	public void setIp66607End(int number)  throws CFException{
		ip66607SortInfo.setIp66607End(number);
	}


	public void setIp66607End(long number)  throws CFException{
		ip66607SortInfo.setIp66607End((int)number);
	}



public void setIp66601UserT(int ip66601UserT) { 
    McrecurCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return McrecurCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of userEnd800
	 *	@return userEnd800
	 */
	public int getUserEnd800() throws CFException {        
   		return userEnd800;
	}
	
	/**
	 * 	Update UserEnd800 with the passed value
	 *	@param number
	 */
	public void setUserEnd800(int number)  throws CFException{
		McrecurCtx.this.setUserEnd800(number);
	}


	public void setUserEnd800(long number)  throws CFException{
		McrecurCtx.this.setUserEnd800((int)number);
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




        public McrecurCtx getMcrecurCtx() {
            return McrecurCtx.this;
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
        str += work.hashCode();
        str += mapRow1ValGroup800.hashCode();
        str += ip66607SortInfo.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1OutCtx clone() {
        MainlineSplit1OutCtx cloneObj = new MainlineSplit1OutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mapRow1ValGroup800 = new MapRow1ValGroup800();
        cloneObj.mapRow1ValGroup800.set(mapRow1ValGroup800.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
    }
}
