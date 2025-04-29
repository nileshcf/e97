package com.cloudframe.app.init1.dto;

/**
*  The class IypData6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypData6 extends IypData6Serialized {
   
				private IypInit6 iypInit6 = new IypInit6();
				private IypCurr6 iypCurr6 = new IypCurr6();

						private char[] ws6iypAddedSw = new char[1];

								private int iypPriorCnt6;
	
	/**
	* Constructor for IypData6
	**/
    public IypData6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			iypInit6.setParent(this,getStartOffset() + 0);
	       			iypCurr6.setParent(this,getStartOffset() + 72);
	   	/*  end of offset */
								setWs6iypAddedSw(("N").toCharArray());
								setIypPriorCnt6(0);
    }


 

	/**
	 *	Returns the value of iypInit6
	 *	@return iypInit6
	 */   
	 public IypInit6 getIypInit6() {
   	return iypInit6;
   }
   /**
	* 	Update IypInit6 with the passed value
	*   Corresponding COBOL Variable is WS-6IYP-INIT
	*	@param value
	*/
   public void setIypInit6(char[] value) {
      iypInit6.setString(value); 
   }   
    
     /**
	 * 	Update IypInit6 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypInit6(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit6.begin,iypInit6.length());
   }
   
     /**
	 * 	Update IypInit6 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypInit6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit6.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypInit6 with another Field
	 *	@param value
	 */
   public void setIypInit6(Field source) {
   	replace(source,0,source.length(),iypInit6.begin,iypInit6.length());
   }  
   
     /**
	 * 	Update IypInit6 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypInit6(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypInit6.begin,iypInit6.length());
   }
   
     /**
	 * 	Update IypInit6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypInit6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypInit6.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of iypCurr6
	 *	@return iypCurr6
	 */   
	 public IypCurr6 getIypCurr6() {
   	return iypCurr6;
   }
   /**
	* 	Update IypCurr6 with the passed value
	*   Corresponding COBOL Variable is WS-6IYP-CURR
	*	@param value
	*/
   public void setIypCurr6(char[] value) {
      iypCurr6.setString(value); 
   }   
    
     /**
	 * 	Update IypCurr6 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypCurr6(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr6.begin,iypCurr6.length());
   }
   
     /**
	 * 	Update IypCurr6 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr6.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypCurr6 with another Field
	 *	@param value
	 */
   public void setIypCurr6(Field source) {
   	replace(source,0,source.length(),iypCurr6.begin,iypCurr6.length());
   }  
   
     /**
	 * 	Update IypCurr6 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypCurr6(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr6.begin,iypCurr6.length());
   }
   
     /**
	 * 	Update IypCurr6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypCurr6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypCurr6.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ws6iypAddedSw
	 *	@return ws6iypAddedSw
	 */
   public char[] getWs6iypAddedSw() throws CFException{
     if (isWs6iypAddedSwModified()) { 
        ws6iypAddedSw = refreshWs6iypAddedSw();
     }
   		return ws6iypAddedSw;
   }

  
	/**
	*  set variable ws6iypAddedSw
	*  Corresponding COBOL Variable is WS-WS6IYP-ADDED-SW
	*  @param value
	**/
   public void setWs6iypAddedSw(char[] value) {
      ws6iypAddedSw = checkWs6iypAddedSwConstraints(value);
      serializeWs6iypAddedSw(ws6iypAddedSw);
   } 

     /**
	 * 	Update Ws6iypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs6iypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs6iypAddedSw,ws6iypAddedSw.length);
   	
   }
   
   public void setWs6iypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypAddedSw,ws6iypAddedSw.length);
   	
   }
   
     /**
	 * 	Update Ws6iypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws6iypAddedSw with another Field
	 *	@param value
	 */
   public void setWs6iypAddedSw(Field source) {
       replace(source,0,source.length(),beginWs6iypAddedSw,WS_6IYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ws6iypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs6iypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs6iypAddedSw,WS_6IYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ws6iypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypAddedSw+targetIndex,targetLen);
    
   }
	char[] ws6iypNotAdded88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isWs6iypNotAdded()
	 *	@return  Returns true if isWs6iypNotAdded() is "N"
	 */
   public boolean isWs6iypNotAdded() throws CFException {
      return (  compareChars( getWs6iypAddedSw() , ws6iypNotAdded88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setWs6iypNotAddedTrue() {  			
    	setWs6iypAddedSw( ws6iypNotAdded88Value);
   	}
	char[] ws6iypAdded88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWs6iypAdded()
	 *	@return  Returns true if isWs6iypAdded() is "Y"
	 */
   public boolean isWs6iypAdded() throws CFException {
      return (  compareChars( getWs6iypAddedSw() , ws6iypAdded88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWs6iypAddedTrue() {  			
    	setWs6iypAddedSw( ws6iypAdded88Value);
   	}
	/**
	 *	Returns the value of iypPriorCnt6
	 *	@return iypPriorCnt6
	 */
	public int getIypPriorCnt6() throws CFException {
       if (isIypPriorCnt6Modified()) { 
           iypPriorCnt6 = refreshIypPriorCnt6();
        }
   		return iypPriorCnt6;
	}
	

	
	   
	/**
	 * 	Update IypPriorCnt6 with the passed value
	 *  Corresponding COBOL Variable is WS-6IYP-PRIOR-CNT
	 *	@param number
	 */
	public void setIypPriorCnt6(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    iypPriorCnt6 = checkIypPriorCnt6MaxLimit(number); 
		serializeIypPriorCnt6(iypPriorCnt6);
	}
	

	public void setIypPriorCnt6(long number) {
	    number = checkIypPriorCnt6MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIypPriorCnt6((int)number);
	}
	
	/**
	 * 	Update IypPriorCnt6 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt6(char[] value) throws CFException {
		 iypPriorCnt6 = serializeIypPriorCnt6(value);
	}
	/**
	 * 	Update IypPriorCnt6 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIypPriorCnt6String(char[] value) throws CFException {
		 setIypPriorCnt6(value);
	}

	
	
	
	/**
	 * 	initializes IypData6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypInit6.initialize();
     
          iypCurr6.initialize();
     
         setWs6iypAddedSw(CONSTANTS.SPACE);
                     setIypPriorCnt6(0);
   }

		public static int getIypData6FieldLength() {
			return IYP_DATA_6_LENGTH;
		}

}
  
