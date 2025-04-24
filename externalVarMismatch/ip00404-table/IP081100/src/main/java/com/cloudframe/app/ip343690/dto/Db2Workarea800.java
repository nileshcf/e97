package com.cloudframe.app.ip343690.dto;

/**
*  The class Db2Workarea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Db2Workarea800 extends Db2Workarea800Serialized { 
   

								private int abendCd800;
				private AbendCode800 abendCode800 = new AbendCode800();

								private int noTimes911Try800;
				private SleepTimeGroup800 sleepTimeGroup800 = new SleepTimeGroup800();

						private char[] currTime800 = new char[8];
	
	/**
	* Constructor for Db2Workarea800
	**/
    public Db2Workarea800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			abendCode800.setParent(this,getStartOffset() + 4);
	       			sleepTimeGroup800.setParent(this,getStartOffset() + 10);
	   	/*  end of offset */
								setNoTimes911Try800(0);
								setCurrTime800(fillSpace(8));
    }


 

	/**
	 *	Returns the value of abendCd800
	 *	@return abendCd800
	 */
	public int getAbendCd800() throws CFException {
       if (isAbendCd800Modified()) { 
           abendCd800 = refreshAbendCd800();
        }
   		return abendCd800;
	}
	

	
	   
	/**
	 * 	Update AbendCd800 with the passed value
	 *  Corresponding COBOL Variable is 800-ABEND-CD
	 *	@param number
	 */
	public void setAbendCd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCd800 = checkAbendCd800MaxLimit(number); 
		serializeAbendCd800(abendCd800);
	}
	

	public void setAbendCd800(long number) {
	    number = checkAbendCd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCd800((int)number);
	}
	
	/**
	 * 	Update AbendCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCd800(char[] value) throws CFException {
		 abendCd800 = serializeAbendCd800(value);
	}
	/**
	 * 	Update AbendCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCd800String(char[] value) throws CFException {
		 setAbendCd800(value);
	}
	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return abendCode800;
   }
   /**
	* 	Update AbendCode800 with the passed value
	*   Corresponding COBOL Variable is 800-ABEND-CODE
	*	@param value
	*/
   public void setAbendCode800(char[] value) {
      abendCode800.setString(value); 
   }   
    
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,abendCode800.begin,abendCode800.length());
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,abendCode800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	replace(source,0,source.length(),abendCode800.begin,abendCode800.length());
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,abendCode800.begin,abendCode800.length());
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,abendCode800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public int getNoTimes911Try800() throws CFException {
       if (isNoTimes911Try800Modified()) { 
           noTimes911Try800 = refreshNoTimes911Try800();
        }
   		return noTimes911Try800;
	}
	

	
	   
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *  Corresponding COBOL Variable is 800-NO-TIMES-911-TRY
	 *	@param number
	 */
	public void setNoTimes911Try800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    noTimes911Try800 = checkNoTimes911Try800MaxLimit(number); 
		serializeNoTimes911Try800(noTimes911Try800);
	}
	

	public void setNoTimes911Try800(long number) {
	    number = checkNoTimes911Try800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNoTimes911Try800((int)number);
	}
	
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800(char[] value) throws CFException {
		 noTimes911Try800 = serializeNoTimes911Try800(value);
	}
	/**
	 * 	Update NoTimes911Try800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800String(char[] value) throws CFException {
		 setNoTimes911Try800(value);
	}
	/**
	 *	Returns the value of sleepTimeGroup800
	 *	@return sleepTimeGroup800
	 */   
	 public SleepTimeGroup800 getSleepTimeGroup800() {
   	return sleepTimeGroup800;
   }
   /**
	* 	Update SleepTimeGroup800 with the passed value
	*   Corresponding COBOL Variable is 800-SLEEP-TIME-GROUP
	*	@param value
	*/
   public void setSleepTimeGroup800(char[] value) {
      sleepTimeGroup800.setString(value); 
   }   
    
     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sleepTimeGroup800.begin,sleepTimeGroup800.length());
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sleepTimeGroup800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SleepTimeGroup800 with another Field
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source) {
   	replace(source,0,source.length(),sleepTimeGroup800.begin,sleepTimeGroup800.length());
   }  
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sleepTimeGroup800.begin,sleepTimeGroup800.length());
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sleepTimeGroup800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of currTime800
	 *	@return currTime800
	 */
   public char[] getCurrTime800() throws CFException{
     if (isCurrTime800Modified()) { 
        currTime800 = refreshCurrTime800();
     }
   		return currTime800;
   }

  
	/**
	*  set variable currTime800
	*  Corresponding COBOL Variable is 800-CURR-TIME
	*  @param value
	**/
   public void setCurrTime800(char[] value) {
      currTime800 = checkCurrTime800Constraints(value);
      serializeCurrTime800(currTime800);
   } 

     /**
	 * 	Update CurrTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTime800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTime800,currTime800.length);
   	
   }
   
   public void setCurrTime800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime800,currTime800.length);
   	
   }
   
     /**
	 * 	Update CurrTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTime800 with another Field
	 *	@param value
	 */
   public void setCurrTime800(Field source) {
       replace(source,0,source.length(),beginCurrTime800,CURR_TIME_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTime800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTime800,CURR_TIME_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDb2Workarea800FieldLength() {
			return DB_2_WORKAREA_800_LENGTH;
		}

}
  
