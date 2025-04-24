package com.cloudframe.app.edit1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.edit1.dto.Work;


@Context
public class Edit1Ctx implements ProgramContext, Cloneable {
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

    public Edit1Ctx clone() {
        Edit1Ctx cloneObj = new Edit1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     Work work = Edit1Ctx.this.getWork();

	/**
	 *	Returns the value of wS2
	 *	@return wS2
	 */
   public char[] getWS2() throws CFException  {              
   		return work.getWS2();
   }

  
	/**
	*  set variable wS2
	*  @param value
	**/
   public void setWS2(char[] value) throws CFException {
      work.setWS2(value);
   } 

     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex) throws CFException {
      work.setWS2(source, sourceIndex);
   	
   }
   
   public void setWS2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS2 with another Field
	 *	@param value
	 */
   public void setWS2(Field source) {
      work.setWS2(source);
   }  
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen) {
      work.setWS2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS1
	 *	@return wS1
	 */
   public char[] getWS1() throws CFException  {              
   		return work.getWS1();
   }

  
	/**
	*  set variable wS1
	*  @param value
	**/
   public void setWS1(char[] value) throws CFException {
      work.setWS1(value);
   } 

     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex) throws CFException {
      work.setWS1(source, sourceIndex);
   	
   }
   
   public void setWS1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS1 with another Field
	 *	@param value
	 */
   public void setWS1(Field source) {
      work.setWS1(source);
   }  
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen) {
      work.setWS1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS4
	 *	@return wS4
	 */
   public char[] getWS4() throws CFException  {              
   		return work.getWS4();
   }

  
	/**
	*  set variable wS4
	*  @param value
	**/
   public void setWS4(char[] value) throws CFException {
      work.setWS4(value);
   } 

     /**
	 * 	Update WS4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS4(char[] source, int sourceIndex) throws CFException {
      work.setWS4(source, sourceIndex);
   	
   }
   
   public void setWS4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS4 with another Field
	 *	@param value
	 */
   public void setWS4(Field source) {
      work.setWS4(source);
   }  
   
     /**
	 * 	Update WS4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS4(Field source, int sourceIndex,int sourceLen) {
      work.setWS4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS3
	 *	@return wS3
	 */
   public char[] getWS3() throws CFException  {              
   		return work.getWS3();
   }

  
	/**
	*  set variable wS3
	*  @param value
	**/
   public void setWS3(char[] value) throws CFException {
      work.setWS3(value);
   } 

     /**
	 * 	Update WS3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS3(char[] source, int sourceIndex) throws CFException {
      work.setWS3(source, sourceIndex);
   	
   }
   
   public void setWS3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS3 with another Field
	 *	@param value
	 */
   public void setWS3(Field source) {
      work.setWS3(source);
   }  
   
     /**
	 * 	Update WS3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS3(Field source, int sourceIndex,int sourceLen) {
      work.setWS3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS6
	 *	@return wS6
	 */
   public char[] getWS6() throws CFException  {              
   		return work.getWS6();
   }

  
	/**
	*  set variable wS6
	*  @param value
	**/
   public void setWS6(char[] value) throws CFException {
      work.setWS6(value);
   } 

     /**
	 * 	Update WS6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS6(char[] source, int sourceIndex) throws CFException {
      work.setWS6(source, sourceIndex);
   	
   }
   
   public void setWS6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS6 with another Field
	 *	@param value
	 */
   public void setWS6(Field source) {
      work.setWS6(source);
   }  
   
     /**
	 * 	Update WS6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS6(Field source, int sourceIndex,int sourceLen) {
      work.setWS6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS24
	 *	@return wS24
	 */
   public char[] getWS24() throws CFException  {              
   		return work.getWS24();
   }

  
	/**
	*  set variable wS24
	*  @param value
	**/
   public void setWS24(char[] value) throws CFException {
      work.setWS24(value);
   } 

     /**
	 * 	Update WS24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS24(char[] source, int sourceIndex) throws CFException {
      work.setWS24(source, sourceIndex);
   	
   }
   
   public void setWS24(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS24(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS24(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS24 with another Field
	 *	@param value
	 */
   public void setWS24(Field source) {
      work.setWS24(source);
   }  
   
     /**
	 * 	Update WS24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS24(Field source, int sourceIndex,int sourceLen) {
      work.setWS24(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS24(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS16
	 *	@return wS16
	 */
   public char[] getWS16() throws CFException  {              
   		return work.getWS16();
   }

  
	/**
	*  set variable wS16
	*  @param value
	**/
   public void setWS16(char[] value) throws CFException {
      work.setWS16(value);
   } 

     /**
	 * 	Update WS16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS16(char[] source, int sourceIndex) throws CFException {
      work.setWS16(source, sourceIndex);
   	
   }
   
   public void setWS16(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS16(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS16 with another Field
	 *	@param value
	 */
   public void setWS16(Field source) {
      work.setWS16(source);
   }  
   
     /**
	 * 	Update WS16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS16(Field source, int sourceIndex,int sourceLen) {
      work.setWS16(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS16(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS09
	 *	@return wS09
	 */
   public char[] getWS09() throws CFException  {              
   		return work.getWS09();
   }

  
	/**
	*  set variable wS09
	*  @param value
	**/
   public void setWS09(char[] value) throws CFException {
      work.setWS09(value);
   } 

     /**
	 * 	Update WS09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS09(char[] source, int sourceIndex) throws CFException {
      work.setWS09(source, sourceIndex);
   	
   }
   
   public void setWS09(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS09(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS09(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS09 with another Field
	 *	@param value
	 */
   public void setWS09(Field source) {
      work.setWS09(source);
   }  
   
     /**
	 * 	Update WS09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS09(Field source, int sourceIndex,int sourceLen) {
      work.setWS09(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS09(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS14
	 *	@return wS14
	 */
   public char[] getWS14() throws CFException  {              
   		return work.getWS14();
   }

  
	/**
	*  set variable wS14
	*  @param value
	**/
   public void setWS14(char[] value) throws CFException {
      work.setWS14(value);
   } 

     /**
	 * 	Update WS14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS14(char[] source, int sourceIndex) throws CFException {
      work.setWS14(source, sourceIndex);
   	
   }
   
   public void setWS14(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS14(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS14 with another Field
	 *	@param value
	 */
   public void setWS14(Field source) {
      work.setWS14(source);
   }  
   
     /**
	 * 	Update WS14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS14(Field source, int sourceIndex,int sourceLen) {
      work.setWS14(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS14(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS22
	 *	@return wS22
	 */
   public char[] getWS22() throws CFException  {              
   		return work.getWS22();
   }

  
	/**
	*  set variable wS22
	*  @param value
	**/
   public void setWS22(char[] value) throws CFException {
      work.setWS22(value);
   } 

     /**
	 * 	Update WS22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS22(char[] source, int sourceIndex) throws CFException {
      work.setWS22(source, sourceIndex);
   	
   }
   
   public void setWS22(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS22(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS22(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS22 with another Field
	 *	@param value
	 */
   public void setWS22(Field source) {
      work.setWS22(source);
   }  
   
     /**
	 * 	Update WS22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS22(Field source, int sourceIndex,int sourceLen) {
      work.setWS22(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS22(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS11
	 *	@return wS11
	 */
   public char[] getWS11() throws CFException  {              
   		return work.getWS11();
   }

  
	/**
	*  set variable wS11
	*  @param value
	**/
   public void setWS11(char[] value) throws CFException {
      work.setWS11(value);
   } 

     /**
	 * 	Update WS11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS11(char[] source, int sourceIndex) throws CFException {
      work.setWS11(source, sourceIndex);
   	
   }
   
   public void setWS11(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS11(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS11 with another Field
	 *	@param value
	 */
   public void setWS11(Field source) {
      work.setWS11(source);
   }  
   
     /**
	 * 	Update WS11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS11(Field source, int sourceIndex,int sourceLen) {
      work.setWS11(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS11(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS21
	 *	@return wS21
	 */
   public char[] getWS21() throws CFException  {              
   		return work.getWS21();
   }

  
	/**
	*  set variable wS21
	*  @param value
	**/
   public void setWS21(char[] value) throws CFException {
      work.setWS21(value);
   } 

     /**
	 * 	Update WS21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS21(char[] source, int sourceIndex) throws CFException {
      work.setWS21(source, sourceIndex);
   	
   }
   
   public void setWS21(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS21(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS21(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS21 with another Field
	 *	@param value
	 */
   public void setWS21(Field source) {
      work.setWS21(source);
   }  
   
     /**
	 * 	Update WS21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS21(Field source, int sourceIndex,int sourceLen) {
      work.setWS21(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS21(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS07
	 *	@return wS07
	 */
   public char[] getWS07() throws CFException  {              
   		return work.getWS07();
   }

  
	/**
	*  set variable wS07
	*  @param value
	**/
   public void setWS07(char[] value) throws CFException {
      work.setWS07(value);
   } 

     /**
	 * 	Update WS07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS07(char[] source, int sourceIndex) throws CFException {
      work.setWS07(source, sourceIndex);
   	
   }
   
   public void setWS07(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS07(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS07(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS07 with another Field
	 *	@param value
	 */
   public void setWS07(Field source) {
      work.setWS07(source);
   }  
   
     /**
	 * 	Update WS07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS07(Field source, int sourceIndex,int sourceLen) {
      work.setWS07(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS07(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS5
	 *	@return wS5
	 */
   public char[] getWS5() throws CFException  {              
   		return work.getWS5();
   }

  
	/**
	*  set variable wS5
	*  @param value
	**/
   public void setWS5(char[] value) throws CFException {
      work.setWS5(value);
   } 

     /**
	 * 	Update WS5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS5(char[] source, int sourceIndex) throws CFException {
      work.setWS5(source, sourceIndex);
   	
   }
   
   public void setWS5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS5 with another Field
	 *	@param value
	 */
   public void setWS5(Field source) {
      work.setWS5(source);
   }  
   
     /**
	 * 	Update WS5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS5(Field source, int sourceIndex,int sourceLen) {
      work.setWS5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS20
	 *	@return wS20
	 */
   public char[] getWS20() throws CFException  {              
   		return work.getWS20();
   }

  
	/**
	*  set variable wS20
	*  @param value
	**/
   public void setWS20(char[] value) throws CFException {
      work.setWS20(value);
   } 

     /**
	 * 	Update WS20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS20(char[] source, int sourceIndex) throws CFException {
      work.setWS20(source, sourceIndex);
   	
   }
   
   public void setWS20(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS20(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS20(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS20 with another Field
	 *	@param value
	 */
   public void setWS20(Field source) {
      work.setWS20(source);
   }  
   
     /**
	 * 	Update WS20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS20(Field source, int sourceIndex,int sourceLen) {
      work.setWS20(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS20(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS08
	 *	@return wS08
	 */
   public char[] getWS08() throws CFException  {              
   		return work.getWS08();
   }

  
	/**
	*  set variable wS08
	*  @param value
	**/
   public void setWS08(char[] value) throws CFException {
      work.setWS08(value);
   } 

     /**
	 * 	Update WS08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS08(char[] source, int sourceIndex) throws CFException {
      work.setWS08(source, sourceIndex);
   	
   }
   
   public void setWS08(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS08(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS08(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS08 with another Field
	 *	@param value
	 */
   public void setWS08(Field source) {
      work.setWS08(source);
   }  
   
     /**
	 * 	Update WS08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS08(Field source, int sourceIndex,int sourceLen) {
      work.setWS08(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS08(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS26
	 *	@return wS26
	 */
   public char[] getWS26() throws CFException  {              
   		return work.getWS26();
   }

  
	/**
	*  set variable wS26
	*  @param value
	**/
   public void setWS26(char[] value) throws CFException {
      work.setWS26(value);
   } 

     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex) throws CFException {
      work.setWS26(source, sourceIndex);
   	
   }
   
   public void setWS26(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS26(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS26(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS26 with another Field
	 *	@param value
	 */
   public void setWS26(Field source) {
      work.setWS26(source);
   }  
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen) {
      work.setWS26(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS26(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS23
	 *	@return wS23
	 */
   public char[] getWS23() throws CFException  {              
   		return work.getWS23();
   }

  
	/**
	*  set variable wS23
	*  @param value
	**/
   public void setWS23(char[] value) throws CFException {
      work.setWS23(value);
   } 

     /**
	 * 	Update WS23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS23(char[] source, int sourceIndex) throws CFException {
      work.setWS23(source, sourceIndex);
   	
   }
   
   public void setWS23(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS23(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS23(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS23 with another Field
	 *	@param value
	 */
   public void setWS23(Field source) {
      work.setWS23(source);
   }  
   
     /**
	 * 	Update WS23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS23(Field source, int sourceIndex,int sourceLen) {
      work.setWS23(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS23(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS13
	 *	@return wS13
	 */
   public char[] getWS13() throws CFException  {              
   		return work.getWS13();
   }

  
	/**
	*  set variable wS13
	*  @param value
	**/
   public void setWS13(char[] value) throws CFException {
      work.setWS13(value);
   } 

     /**
	 * 	Update WS13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS13(char[] source, int sourceIndex) throws CFException {
      work.setWS13(source, sourceIndex);
   	
   }
   
   public void setWS13(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS13(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS13 with another Field
	 *	@param value
	 */
   public void setWS13(Field source) {
      work.setWS13(source);
   }  
   
     /**
	 * 	Update WS13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS13(Field source, int sourceIndex,int sourceLen) {
      work.setWS13(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS13(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS17
	 *	@return wS17
	 */
   public char[] getWS17() throws CFException  {              
   		return work.getWS17();
   }

  
	/**
	*  set variable wS17
	*  @param value
	**/
   public void setWS17(char[] value) throws CFException {
      work.setWS17(value);
   } 

     /**
	 * 	Update WS17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS17(char[] source, int sourceIndex) throws CFException {
      work.setWS17(source, sourceIndex);
   	
   }
   
   public void setWS17(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS17(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS17(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS17 with another Field
	 *	@param value
	 */
   public void setWS17(Field source) {
      work.setWS17(source);
   }  
   
     /**
	 * 	Update WS17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS17(Field source, int sourceIndex,int sourceLen) {
      work.setWS17(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS17(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS19
	 *	@return wS19
	 */
   public char[] getWS19() throws CFException  {              
   		return work.getWS19();
   }

  
	/**
	*  set variable wS19
	*  @param value
	**/
   public void setWS19(char[] value) throws CFException {
      work.setWS19(value);
   } 

     /**
	 * 	Update WS19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS19(char[] source, int sourceIndex) throws CFException {
      work.setWS19(source, sourceIndex);
   	
   }
   
   public void setWS19(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS19(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS19(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS19 with another Field
	 *	@param value
	 */
   public void setWS19(Field source) {
      work.setWS19(source);
   }  
   
     /**
	 * 	Update WS19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS19(Field source, int sourceIndex,int sourceLen) {
      work.setWS19(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS19(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS12
	 *	@return wS12
	 */
   public char[] getWS12() throws CFException  {              
   		return work.getWS12();
   }

  
	/**
	*  set variable wS12
	*  @param value
	**/
   public void setWS12(char[] value) throws CFException {
      work.setWS12(value);
   } 

     /**
	 * 	Update WS12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS12(char[] source, int sourceIndex) throws CFException {
      work.setWS12(source, sourceIndex);
   	
   }
   
   public void setWS12(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS12(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS12 with another Field
	 *	@param value
	 */
   public void setWS12(Field source) {
      work.setWS12(source);
   }  
   
     /**
	 * 	Update WS12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS12(Field source, int sourceIndex,int sourceLen) {
      work.setWS12(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS12(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS15
	 *	@return wS15
	 */
   public char[] getWS15() throws CFException  {              
   		return work.getWS15();
   }

  
	/**
	*  set variable wS15
	*  @param value
	**/
   public void setWS15(char[] value) throws CFException {
      work.setWS15(value);
   } 

     /**
	 * 	Update WS15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS15(char[] source, int sourceIndex) throws CFException {
      work.setWS15(source, sourceIndex);
   	
   }
   
   public void setWS15(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS15(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS15 with another Field
	 *	@param value
	 */
   public void setWS15(Field source) {
      work.setWS15(source);
   }  
   
     /**
	 * 	Update WS15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS15(Field source, int sourceIndex,int sourceLen) {
      work.setWS15(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS15(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS18
	 *	@return wS18
	 */
   public char[] getWS18() throws CFException  {              
   		return work.getWS18();
   }

  
	/**
	*  set variable wS18
	*  @param value
	**/
   public void setWS18(char[] value) throws CFException {
      work.setWS18(value);
   } 

     /**
	 * 	Update WS18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS18(char[] source, int sourceIndex) throws CFException {
      work.setWS18(source, sourceIndex);
   	
   }
   
   public void setWS18(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS18(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS18(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS18 with another Field
	 *	@param value
	 */
   public void setWS18(Field source) {
      work.setWS18(source);
   }  
   
     /**
	 * 	Update WS18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS18(Field source, int sourceIndex,int sourceLen) {
      work.setWS18(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS18(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS10
	 *	@return wS10
	 */
   public char[] getWS10() throws CFException  {              
   		return work.getWS10();
   }

  
	/**
	*  set variable wS10
	*  @param value
	**/
   public void setWS10(char[] value) throws CFException {
      work.setWS10(value);
   } 

     /**
	 * 	Update WS10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS10(char[] source, int sourceIndex) throws CFException {
      work.setWS10(source, sourceIndex);
   	
   }
   
   public void setWS10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS10 with another Field
	 *	@param value
	 */
   public void setWS10(Field source) {
      work.setWS10(source);
   }  
   
     /**
	 * 	Update WS10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS10(Field source, int sourceIndex,int sourceLen) {
      work.setWS10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS25
	 *	@return wS25
	 */
   public char[] getWS25() throws CFException  {              
   		return work.getWS25();
   }

  
	/**
	*  set variable wS25
	*  @param value
	**/
   public void setWS25(char[] value) throws CFException {
      work.setWS25(value);
   } 

     /**
	 * 	Update WS25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS25(char[] source, int sourceIndex) throws CFException {
      work.setWS25(source, sourceIndex);
   	
   }
   
   public void setWS25(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS25(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS25(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS25 with another Field
	 *	@param value
	 */
   public void setWS25(Field source) {
      work.setWS25(source);
   }  
   
     /**
	 * 	Update WS25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS25(Field source, int sourceIndex,int sourceLen) {
      work.setWS25(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS25(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Edit1Ctx getEdit1Ctx() {
            return Edit1Ctx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1InCtx implements Cloneable {
     Work work = Edit1Ctx.this.getWork();

	/**
	 *	Returns the value of wS26
	 *	@return wS26
	 */
   public char[] getWS26() throws CFException  {              
   		return work.getWS26();
   }

  
	/**
	*  set variable wS26
	*  @param value
	**/
   public void setWS26(char[] value) throws CFException {
      work.setWS26(value);
   } 

     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex) throws CFException {
      work.setWS26(source, sourceIndex);
   	
   }
   
   public void setWS26(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS26(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS26(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS26 with another Field
	 *	@param value
	 */
   public void setWS26(Field source) {
      work.setWS26(source);
   }  
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen) {
      work.setWS26(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS26(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Edit1Ctx getEdit1Ctx() {
            return Edit1Ctx.this;
        }

        public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
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

    public Process1InCtx clone() {
        Process1InCtx cloneObj = new Process1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1InCtx getProcess1InCtx() {
            return new Process1InCtx();
    }
     public class Process1OutCtx implements Cloneable {
     Work work = Edit1Ctx.this.getWork();

	/**
	 *	Returns the value of wS32
	 *	@return wS32
	 */
   public char[] getWS32() throws CFException  {              
   		return work.getWS32();
   }

  
	/**
	*  set variable wS32
	*  @param value
	**/
   public void setWS32(char[] value) throws CFException {
      work.setWS32(value);
   } 

     /**
	 * 	Update WS32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS32(char[] source, int sourceIndex) throws CFException {
      work.setWS32(source, sourceIndex);
   	
   }
   
   public void setWS32(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS32(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS32 with another Field
	 *	@param value
	 */
   public void setWS32(Field source) {
      work.setWS32(source);
   }  
   
     /**
	 * 	Update WS32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS32(Field source, int sourceIndex,int sourceLen) {
      work.setWS32(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS34
	 *	@return wS34
	 */
   public char[] getWS34() throws CFException  {              
   		return work.getWS34();
   }

  
	/**
	*  set variable wS34
	*  @param value
	**/
   public void setWS34(char[] value) throws CFException {
      work.setWS34(value);
   } 

     /**
	 * 	Update WS34 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS34(char[] source, int sourceIndex) throws CFException {
      work.setWS34(source, sourceIndex);
   	
   }
   
   public void setWS34(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS34(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS34 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS34(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS34(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS34 with another Field
	 *	@param value
	 */
   public void setWS34(Field source) {
      work.setWS34(source);
   }  
   
     /**
	 * 	Update WS34 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS34(Field source, int sourceIndex,int sourceLen) {
      work.setWS34(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS34 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS34(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS34(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS42
	 *	@return wS42
	 */
   public char[] getWS42() throws CFException  {              
   		return work.getWS42();
   }

  
	/**
	*  set variable wS42
	*  @param value
	**/
   public void setWS42(char[] value) throws CFException {
      work.setWS42(value);
   } 

     /**
	 * 	Update WS42 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS42(char[] source, int sourceIndex) throws CFException {
      work.setWS42(source, sourceIndex);
   	
   }
   
   public void setWS42(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS42(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS42 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS42(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS42(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS42 with another Field
	 *	@param value
	 */
   public void setWS42(Field source) {
      work.setWS42(source);
   }  
   
     /**
	 * 	Update WS42 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS42(Field source, int sourceIndex,int sourceLen) {
      work.setWS42(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS42 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS42(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS42(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS31
	 *	@return wS31
	 */
   public char[] getWS31() throws CFException  {              
   		return work.getWS31();
   }

  
	/**
	*  set variable wS31
	*  @param value
	**/
   public void setWS31(char[] value) throws CFException {
      work.setWS31(value);
   } 

     /**
	 * 	Update WS31 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS31(char[] source, int sourceIndex) throws CFException {
      work.setWS31(source, sourceIndex);
   	
   }
   
   public void setWS31(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS31(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS31 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS31(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS31(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS31 with another Field
	 *	@param value
	 */
   public void setWS31(Field source) {
      work.setWS31(source);
   }  
   
     /**
	 * 	Update WS31 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS31(Field source, int sourceIndex,int sourceLen) {
      work.setWS31(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS31 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS31(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS31(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS33
	 *	@return wS33
	 */
   public char[] getWS33() throws CFException  {              
   		return work.getWS33();
   }

  
	/**
	*  set variable wS33
	*  @param value
	**/
   public void setWS33(char[] value) throws CFException {
      work.setWS33(value);
   } 

     /**
	 * 	Update WS33 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS33(char[] source, int sourceIndex) throws CFException {
      work.setWS33(source, sourceIndex);
   	
   }
   
   public void setWS33(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS33(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS33 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS33(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS33(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS33 with another Field
	 *	@param value
	 */
   public void setWS33(Field source) {
      work.setWS33(source);
   }  
   
     /**
	 * 	Update WS33 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS33(Field source, int sourceIndex,int sourceLen) {
      work.setWS33(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS33 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS33(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS33(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS38
	 *	@return wS38
	 */
   public char[] getWS38() throws CFException  {              
   		return work.getWS38();
   }

  
	/**
	*  set variable wS38
	*  @param value
	**/
   public void setWS38(char[] value) throws CFException {
      work.setWS38(value);
   } 

     /**
	 * 	Update WS38 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS38(char[] source, int sourceIndex) throws CFException {
      work.setWS38(source, sourceIndex);
   	
   }
   
   public void setWS38(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS38(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS38 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS38(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS38(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS38 with another Field
	 *	@param value
	 */
   public void setWS38(Field source) {
      work.setWS38(source);
   }  
   
     /**
	 * 	Update WS38 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS38(Field source, int sourceIndex,int sourceLen) {
      work.setWS38(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS38 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS38(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS38(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS40
	 *	@return wS40
	 */
   public char[] getWS40() throws CFException  {              
   		return work.getWS40();
   }

  
	/**
	*  set variable wS40
	*  @param value
	**/
   public void setWS40(char[] value) throws CFException {
      work.setWS40(value);
   } 

     /**
	 * 	Update WS40 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS40(char[] source, int sourceIndex) throws CFException {
      work.setWS40(source, sourceIndex);
   	
   }
   
   public void setWS40(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS40(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS40 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS40(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS40(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS40 with another Field
	 *	@param value
	 */
   public void setWS40(Field source) {
      work.setWS40(source);
   }  
   
     /**
	 * 	Update WS40 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS40(Field source, int sourceIndex,int sourceLen) {
      work.setWS40(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS40 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS40(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS40(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS28
	 *	@return wS28
	 */
   public char[] getWS28() throws CFException  {              
   		return work.getWS28();
   }

  
	/**
	*  set variable wS28
	*  @param value
	**/
   public void setWS28(char[] value) throws CFException {
      work.setWS28(value);
   } 

     /**
	 * 	Update WS28 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS28(char[] source, int sourceIndex) throws CFException {
      work.setWS28(source, sourceIndex);
   	
   }
   
   public void setWS28(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS28(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS28 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS28(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS28 with another Field
	 *	@param value
	 */
   public void setWS28(Field source) {
      work.setWS28(source);
   }  
   
     /**
	 * 	Update WS28 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS28(Field source, int sourceIndex,int sourceLen) {
      work.setWS28(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS28(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS30
	 *	@return wS30
	 */
   public char[] getWS30() throws CFException  {              
   		return work.getWS30();
   }

  
	/**
	*  set variable wS30
	*  @param value
	**/
   public void setWS30(char[] value) throws CFException {
      work.setWS30(value);
   } 

     /**
	 * 	Update WS30 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS30(char[] source, int sourceIndex) throws CFException {
      work.setWS30(source, sourceIndex);
   	
   }
   
   public void setWS30(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS30(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS30 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS30(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS30(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS30 with another Field
	 *	@param value
	 */
   public void setWS30(Field source) {
      work.setWS30(source);
   }  
   
     /**
	 * 	Update WS30 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS30(Field source, int sourceIndex,int sourceLen) {
      work.setWS30(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS30 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS30(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS30(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS37
	 *	@return wS37
	 */
   public char[] getWS37() throws CFException  {              
   		return work.getWS37();
   }

  
	/**
	*  set variable wS37
	*  @param value
	**/
   public void setWS37(char[] value) throws CFException {
      work.setWS37(value);
   } 

     /**
	 * 	Update WS37 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS37(char[] source, int sourceIndex) throws CFException {
      work.setWS37(source, sourceIndex);
   	
   }
   
   public void setWS37(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS37(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS37 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS37(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS37(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS37 with another Field
	 *	@param value
	 */
   public void setWS37(Field source) {
      work.setWS37(source);
   }  
   
     /**
	 * 	Update WS37 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS37(Field source, int sourceIndex,int sourceLen) {
      work.setWS37(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS37 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS37(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS37(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS27
	 *	@return wS27
	 */
   public char[] getWS27() throws CFException  {              
   		return work.getWS27();
   }

  
	/**
	*  set variable wS27
	*  @param value
	**/
   public void setWS27(char[] value) throws CFException {
      work.setWS27(value);
   } 

     /**
	 * 	Update WS27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS27(char[] source, int sourceIndex) throws CFException {
      work.setWS27(source, sourceIndex);
   	
   }
   
   public void setWS27(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS27(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS27(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS27 with another Field
	 *	@param value
	 */
   public void setWS27(Field source) {
      work.setWS27(source);
   }  
   
     /**
	 * 	Update WS27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS27(Field source, int sourceIndex,int sourceLen) {
      work.setWS27(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS27(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS29
	 *	@return wS29
	 */
   public char[] getWS29() throws CFException  {              
   		return work.getWS29();
   }

  
	/**
	*  set variable wS29
	*  @param value
	**/
   public void setWS29(char[] value) throws CFException {
      work.setWS29(value);
   } 

     /**
	 * 	Update WS29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS29(char[] source, int sourceIndex) throws CFException {
      work.setWS29(source, sourceIndex);
   	
   }
   
   public void setWS29(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS29(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS29(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS29 with another Field
	 *	@param value
	 */
   public void setWS29(Field source) {
      work.setWS29(source);
   }  
   
     /**
	 * 	Update WS29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS29(Field source, int sourceIndex,int sourceLen) {
      work.setWS29(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS29(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS46
	 *	@return wS46
	 */
   public char[] getWS46() throws CFException  {              
   		return work.getWS46();
   }

  
	/**
	*  set variable wS46
	*  @param value
	**/
   public void setWS46(char[] value) throws CFException {
      work.setWS46(value);
   } 

     /**
	 * 	Update WS46 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS46(char[] source, int sourceIndex) throws CFException {
      work.setWS46(source, sourceIndex);
   	
   }
   
   public void setWS46(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS46(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS46 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS46(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS46(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS46 with another Field
	 *	@param value
	 */
   public void setWS46(Field source) {
      work.setWS46(source);
   }  
   
     /**
	 * 	Update WS46 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS46(Field source, int sourceIndex,int sourceLen) {
      work.setWS46(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS46 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS46(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS46(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS36
	 *	@return wS36
	 */
   public char[] getWS36() throws CFException  {              
   		return work.getWS36();
   }

  
	/**
	*  set variable wS36
	*  @param value
	**/
   public void setWS36(char[] value) throws CFException {
      work.setWS36(value);
   } 

     /**
	 * 	Update WS36 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS36(char[] source, int sourceIndex) throws CFException {
      work.setWS36(source, sourceIndex);
   	
   }
   
   public void setWS36(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS36(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS36 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS36(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS36(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS36 with another Field
	 *	@param value
	 */
   public void setWS36(Field source) {
      work.setWS36(source);
   }  
   
     /**
	 * 	Update WS36 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS36(Field source, int sourceIndex,int sourceLen) {
      work.setWS36(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS36 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS36(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS36(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS39
	 *	@return wS39
	 */
   public char[] getWS39() throws CFException  {              
   		return work.getWS39();
   }

  
	/**
	*  set variable wS39
	*  @param value
	**/
   public void setWS39(char[] value) throws CFException {
      work.setWS39(value);
   } 

     /**
	 * 	Update WS39 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS39(char[] source, int sourceIndex) throws CFException {
      work.setWS39(source, sourceIndex);
   	
   }
   
   public void setWS39(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS39(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS39 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS39(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS39 with another Field
	 *	@param value
	 */
   public void setWS39(Field source) {
      work.setWS39(source);
   }  
   
     /**
	 * 	Update WS39 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS39(Field source, int sourceIndex,int sourceLen) {
      work.setWS39(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS39 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS39(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wS35
	 *	@return wS35
	 */
   public char[] getWS35() throws CFException  {              
   		return work.getWS35();
   }

  
	/**
	*  set variable wS35
	*  @param value
	**/
   public void setWS35(char[] value) throws CFException {
      work.setWS35(value);
   } 

     /**
	 * 	Update WS35 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS35(char[] source, int sourceIndex) throws CFException {
      work.setWS35(source, sourceIndex);
   	
   }
   
   public void setWS35(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS35(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS35 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS35(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS35(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS35 with another Field
	 *	@param value
	 */
   public void setWS35(Field source) {
      work.setWS35(source);
   }  
   
     /**
	 * 	Update WS35 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS35(Field source, int sourceIndex,int sourceLen) {
      work.setWS35(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS35 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS35(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS35(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Edit1Ctx getEdit1Ctx() {
            return Edit1Ctx.this;
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

    public Process1OutCtx clone() {
        Process1OutCtx cloneObj = new Process1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
    }
}
