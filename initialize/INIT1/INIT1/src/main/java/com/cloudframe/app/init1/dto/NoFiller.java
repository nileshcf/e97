package com.cloudframe.app.init1.dto;

/**
*  The class NoFiller is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NoFiller extends NoFillerSerialized {
   
				private BiypInit biypInit = new BiypInit();

								private int fillerd;
				private BiypCurr biypCurr = new BiypCurr();

						private char[] wsbiypAddedSw = new char[1];

								private int biypPriorCnt;
	
	/**
	* Constructor for NoFiller
	**/
    public NoFiller() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			biypInit.setParent(this,getStartOffset() + 0);
	       			biypCurr.setParent(this,getStartOffset() + 59);
	   	/*  end of offset */
								setFillerd(0);
								setWsbiypAddedSw(("N").toCharArray());
								setBiypPriorCnt(0);
    }


 

	/**
	 *	Returns the value of biypInit
	 *	@return biypInit
	 */   
	 public BiypInit getBiypInit() {
   	return biypInit;
   }
   /**
	* 	Update BiypInit with the passed value
	*   Corresponding COBOL Variable is WS-BIYP-INIT
	*	@param value
	*/
   public void setBiypInit(char[] value) {
      biypInit.setString(value); 
   }   
    
     /**
	 * 	Update BiypInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBiypInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypInit.begin,biypInit.length());
   }
   
     /**
	 * 	Update BiypInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiypInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BiypInit with another Field
	 *	@param value
	 */
   public void setBiypInit(Field source) {
   	replace(source,0,source.length(),biypInit.begin,biypInit.length());
   }  
   
     /**
	 * 	Update BiypInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBiypInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypInit.begin,biypInit.length());
   }
   
     /**
	 * 	Update BiypInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiypInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypInit.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fillerd
	 *	@return fillerd
	 */
	public int getFillerd() throws CFException {
        if (isFillerdModified()) { 
           fillerd = refreshFillerd();
        }
   		return fillerd;
	}
	
	/**
	 * 	Update Fillerd with the passed value
	 *  Corresponding COBOL Variable is FILLERD
	 *	@param number
	 */
	public void setFillerd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fillerd = checkFillerdMaxLimit(number); 
		serializeFillerd(fillerd);
	}


	public void setFillerd(long number) {
	    number = checkFillerdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFillerd((int)number);
	}
	
	/**
	 *	Returns the value of biypCurr
	 *	@return biypCurr
	 */   
	 public BiypCurr getBiypCurr() {
   	return biypCurr;
   }
   /**
	* 	Update BiypCurr with the passed value
	*   Corresponding COBOL Variable is WS-BIYP-CURR
	*	@param value
	*/
   public void setBiypCurr(char[] value) {
      biypCurr.setString(value); 
   }   
    
     /**
	 * 	Update BiypCurr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBiypCurr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypCurr.begin,biypCurr.length());
   }
   
     /**
	 * 	Update BiypCurr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiypCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypCurr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BiypCurr with another Field
	 *	@param value
	 */
   public void setBiypCurr(Field source) {
   	replace(source,0,source.length(),biypCurr.begin,biypCurr.length());
   }  
   
     /**
	 * 	Update BiypCurr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBiypCurr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biypCurr.begin,biypCurr.length());
   }
   
     /**
	 * 	Update BiypCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiypCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biypCurr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wsbiypAddedSw
	 *	@return wsbiypAddedSw
	 */
   public char[] getWsbiypAddedSw() throws CFException{
     if (isWsbiypAddedSwModified()) { 
        wsbiypAddedSw = refreshWsbiypAddedSw();
     }
   		return wsbiypAddedSw;
   }

  
	/**
	*  set variable wsbiypAddedSw
	*  Corresponding COBOL Variable is WS-WSBIYP-ADDED-SW
	*  @param value
	**/
   public void setWsbiypAddedSw(char[] value) {
      wsbiypAddedSw = checkWsbiypAddedSwConstraints(value);
      serializeWsbiypAddedSw(wsbiypAddedSw);
   } 

     /**
	 * 	Update WsbiypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsbiypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsbiypAddedSw,wsbiypAddedSw.length);
   	
   }
   
   public void setWsbiypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypAddedSw,wsbiypAddedSw.length);
   	
   }
   
     /**
	 * 	Update WsbiypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsbiypAddedSw with another Field
	 *	@param value
	 */
   public void setWsbiypAddedSw(Field source) {
       replace(source,0,source.length(),beginWsbiypAddedSw,WSBIYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update WsbiypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsbiypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsbiypAddedSw,WSBIYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update WsbiypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypAddedSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of biypPriorCnt
	 *	@return biypPriorCnt
	 */
	public int getBiypPriorCnt() throws CFException {
       if (isBiypPriorCntModified()) { 
           biypPriorCnt = refreshBiypPriorCnt();
        }
   		return biypPriorCnt;
	}
	

	
	   
	/**
	 * 	Update BiypPriorCnt with the passed value
	 *  Corresponding COBOL Variable is WS-BIYP-PRIOR-CNT
	 *	@param number
	 */
	public void setBiypPriorCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    biypPriorCnt = checkBiypPriorCntMaxLimit(number); 
		serializeBiypPriorCnt(biypPriorCnt);
	}
	

	public void setBiypPriorCnt(long number) {
	    number = checkBiypPriorCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBiypPriorCnt((int)number);
	}
	
	/**
	 * 	Update BiypPriorCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBiypPriorCnt(char[] value) throws CFException {
		 biypPriorCnt = serializeBiypPriorCnt(value);
	}
	/**
	 * 	Update BiypPriorCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBiypPriorCntString(char[] value) throws CFException {
		 setBiypPriorCnt(value);
	}

	
	
	

		public static int getNoFillerFieldLength() {
			return NO_FILLER_LENGTH;
		}

}
  
