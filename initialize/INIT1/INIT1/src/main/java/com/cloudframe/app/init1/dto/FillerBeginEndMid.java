package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEndMid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FillerBeginEndMid extends FillerBeginEndMidSerialized {
   
				private IypInit8 iypInit8 = new IypInit8();


				private IypCurr8 iypCurr8 = new IypCurr8();

						private char[] ws8iypAddedSw = new char[1];

								private int iypPriorCnt8;


	
	/**
	* Constructor for FillerBeginEndMid
	**/
    public FillerBeginEndMid() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			iypInit8.setParent(this,getStartOffset() + 0);
	       			iypCurr8.setParent(this,getStartOffset() + 80);
	   	/*  end of offset */
								setWs8iypAddedSw(("N").toCharArray());
								setIypPriorCnt8(0);
    }


 

	/**
	 *	Returns the value of iypInit8
	 *	@return iypInit8
	 */   
	 public IypInit8 getIypInit8() {
   	return iypInit8;
   }
   /**
	* 	Update IypInit8 with the passed value
	*   Corresponding COBOL Variable is WS-8IYP-INIT
	*	@param value
	*/
   public void setIypInit8(char[] value) {
      iypInit8.setString(value); 
   }   
    
     /**
	 * 	Update IypInit8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypInit8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit8.begin,iypInit8.length());
   }
   
     /**
	 * 	Update IypInit8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypInit8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypInit8 with another Field
	 *	@param value
	 */
   public void setIypInit8(Field source) {
   	replace(source,0,source.length(),iypInit8.begin,iypInit8.length());
   }  
   
     /**
	 * 	Update IypInit8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypInit8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit8.begin,iypInit8.length());
   }
   
     /**
	 * 	Update IypInit8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypInit8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit8.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of iypCurr8
	 *	@return iypCurr8
	 */   
	 public IypCurr8 getIypCurr8() {
   	return iypCurr8;
   }
   /**
	* 	Update IypCurr8 with the passed value
	*   Corresponding COBOL Variable is WS-8IYP-CURR
	*	@param value
	*/
   public void setIypCurr8(char[] value) {
      iypCurr8.setString(value); 
   }   
    
     /**
	 * 	Update IypCurr8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypCurr8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr8.begin,iypCurr8.length());
   }
   
     /**
	 * 	Update IypCurr8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypCurr8 with another Field
	 *	@param value
	 */
   public void setIypCurr8(Field source) {
   	replace(source,0,source.length(),iypCurr8.begin,iypCurr8.length());
   }  
   
     /**
	 * 	Update IypCurr8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypCurr8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr8.begin,iypCurr8.length());
   }
   
     /**
	 * 	Update IypCurr8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr8.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ws8iypAddedSw
	 *	@return ws8iypAddedSw
	 */
   public char[] getWs8iypAddedSw() throws CFException{
     if (isWs8iypAddedSwModified()) { 
        ws8iypAddedSw = refreshWs8iypAddedSw();
     }
   		return ws8iypAddedSw;
   }

  
	/**
	*  set variable ws8iypAddedSw
	*  Corresponding COBOL Variable is WS-WS8IYP-ADDED-SW
	*  @param value
	**/
   public void setWs8iypAddedSw(char[] value) {
      ws8iypAddedSw = checkWs8iypAddedSwConstraints(value);
      serializeWs8iypAddedSw(ws8iypAddedSw);
   } 

     /**
	 * 	Update Ws8iypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs8iypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs8iypAddedSw,ws8iypAddedSw.length);
   	
   }
   
   public void setWs8iypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypAddedSw,ws8iypAddedSw.length);
   	
   }
   
     /**
	 * 	Update Ws8iypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws8iypAddedSw with another Field
	 *	@param value
	 */
   public void setWs8iypAddedSw(Field source) {
       replace(source,0,source.length(),beginWs8iypAddedSw,WS_8IYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ws8iypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs8iypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs8iypAddedSw,WS_8IYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ws8iypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypAddedSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of iypPriorCnt8
	 *	@return iypPriorCnt8
	 */
	public int getIypPriorCnt8() throws CFException {
       if (isIypPriorCnt8Modified()) { 
           iypPriorCnt8 = refreshIypPriorCnt8();
        }
   		return iypPriorCnt8;
	}
	

	
	   
	/**
	 * 	Update IypPriorCnt8 with the passed value
	 *  Corresponding COBOL Variable is WS-8IYP-PRIOR-CNT
	 *	@param number
	 */
	public void setIypPriorCnt8(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    iypPriorCnt8 = checkIypPriorCnt8MaxLimit(number); 
		serializeIypPriorCnt8(iypPriorCnt8);
	}
	

	public void setIypPriorCnt8(long number) {
	    number = checkIypPriorCnt8MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIypPriorCnt8((int)number);
	}
	
	/**
	 * 	Update IypPriorCnt8 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt8(char[] value) throws CFException {
		 iypPriorCnt8 = serializeIypPriorCnt8(value);
	}
	/**
	 * 	Update IypPriorCnt8 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt8String(char[] value) throws CFException {
		 setIypPriorCnt8(value);
	}

	
	
	
	/**
	 * 	initializes FillerBeginEndMid
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypInit8.initialize();
     
          iypCurr8.initialize();
     
         setWs8iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt8(0);
   }

		public static int getFillerBeginEndMidFieldLength() {
			return FILLER_BEGIN_END_MID_LENGTH;
		}

}
  
