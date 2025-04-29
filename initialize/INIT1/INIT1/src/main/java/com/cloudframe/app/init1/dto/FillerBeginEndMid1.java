package com.cloudframe.app.init1.dto;

/**
*  The class FillerBeginEndMid1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FillerBeginEndMid1 extends FillerBeginEndMid1Serialized {
   
				private AiypInit aiypInit = new AiypInit();


								private int filler9;
				private AiypCurr aiypCurr = new AiypCurr();

						private char[] wsaiypAddedSw = new char[1];

								private int aiypPriorCnt;

								private int fillera;

								private int fillerb;
	
	/**
	* Constructor for FillerBeginEndMid1
	**/
    public FillerBeginEndMid1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aiypInit.setParent(this,getStartOffset() + 0);
	       			aiypCurr.setParent(this,getStartOffset() + 64);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 56
             ,4
             );
								setWsaiypAddedSw(("N").toCharArray());
								setAiypPriorCnt(0);
    }


 

	/**
	 *	Returns the value of aiypInit
	 *	@return aiypInit
	 */   
	 public AiypInit getAiypInit() {
   	return aiypInit;
   }
   /**
	* 	Update AiypInit with the passed value
	*   Corresponding COBOL Variable is WS-AIYP-INIT
	*	@param value
	*/
   public void setAiypInit(char[] value) {
      aiypInit.setString(value); 
   }   
    
     /**
	 * 	Update AiypInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAiypInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypInit.begin,aiypInit.length());
   }
   
     /**
	 * 	Update AiypInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAiypInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AiypInit with another Field
	 *	@param value
	 */
   public void setAiypInit(Field source) {
   	replace(source,0,source.length(),aiypInit.begin,aiypInit.length());
   }  
   
     /**
	 * 	Update AiypInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAiypInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypInit.begin,aiypInit.length());
   }
   
     /**
	 * 	Update AiypInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAiypInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypInit.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of filler9
	 *	@return filler9
	 */
	public int getFiller9() throws CFException {
        if (isFiller9Modified()) { 
           filler9 = refreshFiller9();
        }
   		return filler9;
	}
	
	/**
	 * 	Update Filler9 with the passed value
	 *  Corresponding COBOL Variable is FILLER9
	 *	@param number
	 */
	public void setFiller9(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler9 = checkFiller9MaxLimit(number); 
		serializeFiller9(filler9);
	}


	public void setFiller9(long number) {
	    number = checkFiller9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller9((int)number);
	}
	
	/**
	 *	Returns the value of aiypCurr
	 *	@return aiypCurr
	 */   
	 public AiypCurr getAiypCurr() {
   	return aiypCurr;
   }
   /**
	* 	Update AiypCurr with the passed value
	*   Corresponding COBOL Variable is WS-AIYP-CURR
	*	@param value
	*/
   public void setAiypCurr(char[] value) {
      aiypCurr.setString(value); 
   }   
    
     /**
	 * 	Update AiypCurr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAiypCurr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypCurr.begin,aiypCurr.length());
   }
   
     /**
	 * 	Update AiypCurr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAiypCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypCurr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AiypCurr with another Field
	 *	@param value
	 */
   public void setAiypCurr(Field source) {
   	replace(source,0,source.length(),aiypCurr.begin,aiypCurr.length());
   }  
   
     /**
	 * 	Update AiypCurr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAiypCurr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypCurr.begin,aiypCurr.length());
   }
   
     /**
	 * 	Update AiypCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAiypCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypCurr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wsaiypAddedSw
	 *	@return wsaiypAddedSw
	 */
   public char[] getWsaiypAddedSw() throws CFException{
     if (isWsaiypAddedSwModified()) { 
        wsaiypAddedSw = refreshWsaiypAddedSw();
     }
   		return wsaiypAddedSw;
   }

  
	/**
	*  set variable wsaiypAddedSw
	*  Corresponding COBOL Variable is WS-WSAIYP-ADDED-SW
	*  @param value
	**/
   public void setWsaiypAddedSw(char[] value) {
      wsaiypAddedSw = checkWsaiypAddedSwConstraints(value);
      serializeWsaiypAddedSw(wsaiypAddedSw);
   } 

     /**
	 * 	Update WsaiypAddedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaiypAddedSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaiypAddedSw,wsaiypAddedSw.length);
   	
   }
   
   public void setWsaiypAddedSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypAddedSw,wsaiypAddedSw.length);
   	
   }
   
     /**
	 * 	Update WsaiypAddedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypAddedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypAddedSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaiypAddedSw with another Field
	 *	@param value
	 */
   public void setWsaiypAddedSw(Field source) {
       replace(source,0,source.length(),beginWsaiypAddedSw,WSAIYP_ADDED_SW_LEN);
   	
   }  
   
     /**
	 * 	Update WsaiypAddedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaiypAddedSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaiypAddedSw,WSAIYP_ADDED_SW_LEN);
   	
   }
   
     /**
	 * 	Update WsaiypAddedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypAddedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypAddedSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aiypPriorCnt
	 *	@return aiypPriorCnt
	 */
	public int getAiypPriorCnt() throws CFException {
       if (isAiypPriorCntModified()) { 
           aiypPriorCnt = refreshAiypPriorCnt();
        }
   		return aiypPriorCnt;
	}
	

	
	   
	/**
	 * 	Update AiypPriorCnt with the passed value
	 *  Corresponding COBOL Variable is WS-AIYP-PRIOR-CNT
	 *	@param number
	 */
	public void setAiypPriorCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    aiypPriorCnt = checkAiypPriorCntMaxLimit(number); 
		serializeAiypPriorCnt(aiypPriorCnt);
	}
	

	public void setAiypPriorCnt(long number) {
	    number = checkAiypPriorCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAiypPriorCnt((int)number);
	}
	
	/**
	 * 	Update AiypPriorCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setAiypPriorCnt(char[] value) throws CFException {
		 aiypPriorCnt = serializeAiypPriorCnt(value);
	}
	/**
	 * 	Update AiypPriorCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAiypPriorCntString(char[] value) throws CFException {
		 setAiypPriorCnt(value);
	}
	/**
	 *	Returns the value of fillera
	 *	@return fillera
	 */
	public int getFillera() throws CFException {
        if (isFilleraModified()) { 
           fillera = refreshFillera();
        }
   		return fillera;
	}
	
	/**
	 * 	Update Fillera with the passed value
	 *  Corresponding COBOL Variable is FILLERA
	 *	@param number
	 */
	public void setFillera(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fillera = checkFilleraMaxLimit(number); 
		serializeFillera(fillera);
	}


	public void setFillera(long number) {
	    number = checkFilleraMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFillera((int)number);
	}
	
	/**
	 *	Returns the value of fillerb
	 *	@return fillerb
	 */
	public int getFillerb() throws CFException {
        if (isFillerbModified()) { 
           fillerb = refreshFillerb();
        }
   		return fillerb;
	}
	
	/**
	 * 	Update Fillerb with the passed value
	 *  Corresponding COBOL Variable is FILLERB
	 *	@param number
	 */
	public void setFillerb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fillerb = checkFillerbMaxLimit(number); 
		serializeFillerb(fillerb);
	}


	public void setFillerb(long number) {
	    number = checkFillerbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFillerb((int)number);
	}
	

	
	
	
	/**
	 * 	initializes FillerBeginEndMid1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          aiypInit.initialize();
     
          aiypCurr.initialize();
     
         setWsaiypAddedSw(CONSTANTS.SPACE);
                     setAiypPriorCnt(0);
   }

		public static int getFillerBeginEndMid1FieldLength() {
			return FILLER_BEGIN_END_MID_1_LENGTH;
		}

}
  
