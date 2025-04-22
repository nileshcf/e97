package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEnd1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FillerBeginEnd1 extends FillerBeginEnd1Serialized {
   
				private IypInit9 iypInit9 = new IypInit9();
				private IypCurr9 iypCurr9 = new IypCurr9();

						private char[] ws9iypAddedSw = new char[1];

								private int iypPriorCnt9;

								private int filler6;

								private int filler7;
	
	/**
	* Constructor for FillerBeginEnd1
	**/
    public FillerBeginEnd1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			iypInit9.setParent(this,getStartOffset() + 0);
	       			iypCurr9.setParent(this,getStartOffset() + 56);
	   	/*  end of offset */
								setWs9iypAddedSw(("N").toCharArray());
								setIypPriorCnt9(0);
    }


 

	/**
	 *	Returns the value of iypInit9
	 *	@return iypInit9
	 */   
	 public IypInit9 getIypInit9() {
   	return iypInit9;
   }
   /**
	* 	Update IypInit9 with the passed value
	*   Corresponding COBOL Variable is WS-9IYP-INIT
	*	@param value
	*/
   public void setIypInit9(char[] value) {
      iypInit9.setString(value); 
   }   
    
     /**
	 * 	Update IypInit9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypInit9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit9.begin,iypInit9.length());
   }
   
     /**
	 * 	Update IypInit9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypInit9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypInit9 with another Field
	 *	@param value
	 */
   public void setIypInit9(Field source) {
   	replace(source,0,source.length(),iypInit9.begin,iypInit9.length());
   }  
   
     /**
	 * 	Update IypInit9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypInit9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit9.begin,iypInit9.length());
   }
   
     /**
	 * 	Update IypInit9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypInit9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit9.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of iypCurr9
	 *	@return iypCurr9
	 */   
	 public IypCurr9 getIypCurr9() {
   	return iypCurr9;
   }
   /**
	* 	Update IypCurr9 with the passed value
	*   Corresponding COBOL Variable is WS-9IYP-CURR
	*	@param value
	*/
   public void setIypCurr9(char[] value) {
      iypCurr9.setString(value); 
   }   
    
     /**
	 * 	Update IypCurr9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypCurr9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr9.begin,iypCurr9.length());
   }
   
     /**
	 * 	Update IypCurr9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypCurr9 with another Field
	 *	@param value
	 */
   public void setIypCurr9(Field source) {
   	replace(source,0,source.length(),iypCurr9.begin,iypCurr9.length());
   }  
   
     /**
	 * 	Update IypCurr9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypCurr9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr9.begin,iypCurr9.length());
   }
   
     /**
	 * 	Update IypCurr9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr9.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ws9iypAddedSw
	 *	@return ws9iypAddedSw
	 */
   public char[] getWs9iypAddedSw() throws CFException{
     if (isWs9iypAddedSwModified()) { 
        ws9iypAddedSw = refreshWs9iypAddedSw();
     }
   		return ws9iypAddedSw;
   }

  
	/**
	*  set variable ws9iypAddedSw
	*  Corresponding COBOL Variable is WS-WS9IYP-ADDED-SW
	*  @param value
	**/
   public void setWs9iypAddedSw(char[] value) {
      ws9iypAddedSw = checkWs9iypAddedSwConstraints(value);
      serializeWs9iypAddedSw(ws9iypAddedSw);
   } 

     /**
	 * 	Update Ws9iypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs9iypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs9iypAddedSw,ws9iypAddedSw.length);
   	
   }
   
   public void setWs9iypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypAddedSw,ws9iypAddedSw.length);
   	
   }
   
     /**
	 * 	Update Ws9iypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws9iypAddedSw with another Field
	 *	@param value
	 */
   public void setWs9iypAddedSw(Field source) {
       replace(source,0,source.length(),beginWs9iypAddedSw,WS_9IYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ws9iypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs9iypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs9iypAddedSw,WS_9IYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ws9iypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypAddedSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of iypPriorCnt9
	 *	@return iypPriorCnt9
	 */
	public int getIypPriorCnt9() throws CFException {
       if (isIypPriorCnt9Modified()) { 
           iypPriorCnt9 = refreshIypPriorCnt9();
        }
   		return iypPriorCnt9;
	}
	

	
	   
	/**
	 * 	Update IypPriorCnt9 with the passed value
	 *  Corresponding COBOL Variable is WS-9IYP-PRIOR-CNT
	 *	@param number
	 */
	public void setIypPriorCnt9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    iypPriorCnt9 = checkIypPriorCnt9MaxLimit(number); 
		serializeIypPriorCnt9(iypPriorCnt9);
	}
	

	public void setIypPriorCnt9(long number) {
	    number = checkIypPriorCnt9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIypPriorCnt9((int)number);
	}
	
	/**
	 * 	Update IypPriorCnt9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt9(char[] value) throws CFException {
		 iypPriorCnt9 = serializeIypPriorCnt9(value);
	}
	/**
	 * 	Update IypPriorCnt9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt9String(char[] value) throws CFException {
		 setIypPriorCnt9(value);
	}
	/**
	 *	Returns the value of filler6
	 *	@return filler6
	 */
	public int getFiller6() throws CFException {
        if (isFiller6Modified()) { 
           filler6 = refreshFiller6();
        }
   		return filler6;
	}
	
	/**
	 * 	Update Filler6 with the passed value
	 *  Corresponding COBOL Variable is FILLER6
	 *	@param number
	 */
	public void setFiller6(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler6 = checkFiller6MaxLimit(number); 
		serializeFiller6(filler6);
	}


	public void setFiller6(long number) {
	    number = checkFiller6MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller6((int)number);
	}
	
	/**
	 *	Returns the value of filler7
	 *	@return filler7
	 */
	public int getFiller7() throws CFException {
        if (isFiller7Modified()) { 
           filler7 = refreshFiller7();
        }
   		return filler7;
	}
	
	/**
	 * 	Update Filler7 with the passed value
	 *  Corresponding COBOL Variable is FILLER7
	 *	@param number
	 */
	public void setFiller7(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler7 = checkFiller7MaxLimit(number); 
		serializeFiller7(filler7);
	}


	public void setFiller7(long number) {
	    number = checkFiller7MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller7((int)number);
	}
	

	
	
	
	/**
	 * 	initializes FillerBeginEnd1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypInit9.initialize();
     
          iypCurr9.initialize();
     
         setWs9iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt9(0);
   }

		public static int getFillerBeginEnd1FieldLength() {
			return FILLER_BEGIN_END_1_LENGTH;
		}

}
  
