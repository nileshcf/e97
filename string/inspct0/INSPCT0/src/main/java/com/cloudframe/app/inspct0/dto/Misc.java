package com.cloudframe.app.inspct0.dto;

/**
*  The class Misc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.inspct0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Misc extends MiscSerialized {
   

								private int cnt;

						private char[] parm = Field.fillLowValue(30);

						private char[] nullWs = new char[5];

						private char[] x1 = new char[5];

						private char[] x2 = new char[5];
	
	/**
	* Constructor for Misc
	**/
    public Misc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNullWs(fillLowValue(5));
								setX1(fillSpace(5));
								setX2(fillSpace(5));
    }


 

	/**
	 *	Returns the value of cnt
	 *	@return cnt
	 */
	public int getCnt() throws CFException {
       if (isCntModified()) { 
           cnt = refreshCnt();
        }
   		return cnt;
	}
	

	
	   
	/**
	 * 	Update Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-CNT
	 *	@param number
	 */
	public void setCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cnt = checkCntMaxLimit(number); 
		serializeCnt(cnt);
	}
	

	public void setCnt(long number) {
	    number = checkCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCnt((int)number);
	}
	
	/**
	 * 	Update Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt(char[] value) throws CFException {
		 cnt = serializeCnt(value);
	}
	/**
	 * 	Update Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCntString(char[] value) throws CFException {
		 setCnt(value);
	}
	/**
	 *	Returns the value of parm
	 *	@return parm
	 */
   public char[] getParm() throws CFException{
     if (isParmModified()) { 
        parm = refreshParm();
     }
   		return parm;
   }

  
	/**
	*  set variable parm
	*  Corresponding COBOL Variable is WS-PARM
	*  @param value
	**/
   public void setParm(char[] value) {
      parm = checkParmConstraints(value);
      serializeParm(parm);
   } 

     /**
	 * 	Update Parm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParm,parm.length);
   	
   }
   
   public void setParm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParm,parm.length);
   	
   }
   
     /**
	 * 	Update Parm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parm with another Field
	 *	@param value
	 */
   public void setParm(Field source) {
       replace(source,0,source.length(),beginParm,PARM_LEN);
   	
   }  
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParm,PARM_LEN);
   	
   }
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nullWs
	 *	@return nullWs
	 */
   public char[] getNullWs() throws CFException{
     if (isNullWsModified()) { 
        nullWs = refreshNullWs();
     }
   		return nullWs;
   }

  
	/**
	*  set variable nullWs
	*  Corresponding COBOL Variable is WS-NULL
	*  @param value
	**/
   public void setNullWs(char[] value) {
      nullWs = checkNullWsConstraints(value);
      serializeNullWs(nullWs);
   } 

     /**
	 * 	Update NullWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNullWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNullWs,nullWs.length);
   	
   }
   
   public void setNullWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNullWs,nullWs.length);
   	
   }
   
     /**
	 * 	Update NullWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNullWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NullWs with another Field
	 *	@param value
	 */
   public void setNullWs(Field source) {
       replace(source,0,source.length(),beginNullWs,NULL_WS_LEN);
   	
   }  
   
     /**
	 * 	Update NullWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNullWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNullWs,NULL_WS_LEN);
   	
   }
   
     /**
	 * 	Update NullWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNullWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullWs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x1
	 *	@return x1
	 */
   public char[] getX1() throws CFException{
     if (isX1Modified()) { 
        x1 = refreshX1();
     }
   		return x1;
   }

  
	/**
	*  set variable x1
	*  Corresponding COBOL Variable is WS-X1
	*  @param value
	**/
   public void setX1(char[] value) {
      x1 = checkX1Constraints(value);
      serializeX1(x1);
   } 

     /**
	 * 	Update X1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX1,x1.length);
   	
   }
   
   public void setX1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX1,x1.length);
   	
   }
   
     /**
	 * 	Update X1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X1 with another Field
	 *	@param value
	 */
   public void setX1(Field source) {
       replace(source,0,source.length(),beginX1,X_1_LEN);
   	
   }  
   
     /**
	 * 	Update X1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX1,X_1_LEN);
   	
   }
   
     /**
	 * 	Update X1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x2
	 *	@return x2
	 */
   public char[] getX2() throws CFException{
     if (isX2Modified()) { 
        x2 = refreshX2();
     }
   		return x2;
   }

  
	/**
	*  set variable x2
	*  Corresponding COBOL Variable is WS-X2
	*  @param value
	**/
   public void setX2(char[] value) {
      x2 = checkX2Constraints(value);
      serializeX2(x2);
   } 

     /**
	 * 	Update X2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX2,x2.length);
   	
   }
   
   public void setX2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX2,x2.length);
   	
   }
   
     /**
	 * 	Update X2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X2 with another Field
	 *	@param value
	 */
   public void setX2(Field source) {
       replace(source,0,source.length(),beginX2,X_2_LEN);
   	
   }  
   
     /**
	 * 	Update X2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX2,X_2_LEN);
   	
   }
   
     /**
	 * 	Update X2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMiscFieldLength() {
			return MISC_LENGTH;
		}

}
  
