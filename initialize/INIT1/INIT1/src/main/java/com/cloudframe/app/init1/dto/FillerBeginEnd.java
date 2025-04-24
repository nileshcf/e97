package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEnd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FillerBeginEnd extends FillerBeginEndSerialized { 
   
				private IypInit7 iypInit7 = new IypInit7();
				private IypCurr7 iypCurr7 = new IypCurr7();

						private char[] ws7iypAddedSw = new char[1];

								private int iypPriorCnt7;


	
	/**
	* Constructor for FillerBeginEnd
	**/
    public FillerBeginEnd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			iypInit7.setParent(this,getStartOffset() + 0);
	       			iypCurr7.setParent(this,getStartOffset() + 72);
	   	/*  end of offset */
								setWs7iypAddedSw(("N").toCharArray());
								setIypPriorCnt7(0);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 99
             ,4
             );
    }


 

	/**
	 *	Returns the value of iypInit7
	 *	@return iypInit7
	 */   
	 public IypInit7 getIypInit7() {
   	return iypInit7;
   }
   /**
	* 	Update IypInit7 with the passed value
	*   Corresponding COBOL Variable is WS-7IYP-INIT
	*	@param value
	*/
   public void setIypInit7(char[] value) {
      iypInit7.setString(value); 
   }   
    
     /**
	 * 	Update IypInit7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypInit7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit7.begin,iypInit7.length());
   }
   
     /**
	 * 	Update IypInit7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypInit7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypInit7 with another Field
	 *	@param value
	 */
   public void setIypInit7(Field source) {
   	replace(source,0,source.length(),iypInit7.begin,iypInit7.length());
   }  
   
     /**
	 * 	Update IypInit7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypInit7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit7.begin,iypInit7.length());
   }
   
     /**
	 * 	Update IypInit7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypInit7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit7.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of iypCurr7
	 *	@return iypCurr7
	 */   
	 public IypCurr7 getIypCurr7() {
   	return iypCurr7;
   }
   /**
	* 	Update IypCurr7 with the passed value
	*   Corresponding COBOL Variable is WS-7IYP-CURR
	*	@param value
	*/
   public void setIypCurr7(char[] value) {
      iypCurr7.setString(value); 
   }   
    
     /**
	 * 	Update IypCurr7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypCurr7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr7.begin,iypCurr7.length());
   }
   
     /**
	 * 	Update IypCurr7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypCurr7 with another Field
	 *	@param value
	 */
   public void setIypCurr7(Field source) {
   	replace(source,0,source.length(),iypCurr7.begin,iypCurr7.length());
   }  
   
     /**
	 * 	Update IypCurr7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypCurr7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr7.begin,iypCurr7.length());
   }
   
     /**
	 * 	Update IypCurr7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr7.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ws7iypAddedSw
	 *	@return ws7iypAddedSw
	 */
   public char[] getWs7iypAddedSw() throws CFException{
     if (isWs7iypAddedSwModified()) { 
        ws7iypAddedSw = refreshWs7iypAddedSw();
     }
   		return ws7iypAddedSw;
   }

  
	/**
	*  set variable ws7iypAddedSw
	*  Corresponding COBOL Variable is WS-WS7IYP-ADDED-SW
	*  @param value
	**/
   public void setWs7iypAddedSw(char[] value) {
      ws7iypAddedSw = checkWs7iypAddedSwConstraints(value);
      serializeWs7iypAddedSw(ws7iypAddedSw);
   } 

     /**
	 * 	Update Ws7iypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs7iypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs7iypAddedSw,ws7iypAddedSw.length);
   	
   }
   
   public void setWs7iypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypAddedSw,ws7iypAddedSw.length);
   	
   }
   
     /**
	 * 	Update Ws7iypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws7iypAddedSw with another Field
	 *	@param value
	 */
   public void setWs7iypAddedSw(Field source) {
       replace(source,0,source.length(),beginWs7iypAddedSw,WS_7IYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ws7iypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs7iypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs7iypAddedSw,WS_7IYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ws7iypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypAddedSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of iypPriorCnt7
	 *	@return iypPriorCnt7
	 */
	public int getIypPriorCnt7() throws CFException {
       if (isIypPriorCnt7Modified()) { 
           iypPriorCnt7 = refreshIypPriorCnt7();
        }
   		return iypPriorCnt7;
	}
	

	
	   
	/**
	 * 	Update IypPriorCnt7 with the passed value
	 *  Corresponding COBOL Variable is WS-7IYP-PRIOR-CNT
	 *	@param number
	 */
	public void setIypPriorCnt7(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    iypPriorCnt7 = checkIypPriorCnt7MaxLimit(number); 
		serializeIypPriorCnt7(iypPriorCnt7);
	}
	

	public void setIypPriorCnt7(long number) {
	    number = checkIypPriorCnt7MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIypPriorCnt7((int)number);
	}
	
	/**
	 * 	Update IypPriorCnt7 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt7(char[] value) throws CFException {
		 iypPriorCnt7 = serializeIypPriorCnt7(value);
	}
	/**
	 * 	Update IypPriorCnt7 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt7String(char[] value) throws CFException {
		 setIypPriorCnt7(value);
	}

	
	
	
	/**
	 * 	initializes FillerBeginEnd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypInit7.initialize();
     
          iypCurr7.initialize();
     
         setWs7iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt7(0);
   }

		public static int getFillerBeginEndFieldLength() {
			return FILLER_BEGIN_END_LENGTH;
		}

}
  
