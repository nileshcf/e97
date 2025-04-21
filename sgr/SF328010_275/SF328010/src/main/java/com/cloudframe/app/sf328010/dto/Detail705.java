package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Detail705 extends Detail705Serialized { 
   


						private char[] serviceId705 = new char[4];


								private char[] totalCnt705 = Field.fillLowValue(11);


								private char[] successCnt705 = Field.fillLowValue(11);


								private char[] successPercent705 = Field.fillLowValue(6);



								private char[] errCnt705 = Field.fillLowValue(11);


								private char[] errPercent705 = Field.fillLowValue(6);



								private char[] avgTime705 = Field.fillLowValue(14);


								private char[] highTime705 = Field.fillLowValue(11);


								private char[] lowTime705 = Field.fillLowValue(11);

	
	/**
	* Constructor for Detail705
	**/
    public Detail705() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Detail705. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail705(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 0
             ,10
             );
								setServiceId705(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 14
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 29
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 54
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 55
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 68
             ,2
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 76
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 77
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 95
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 111
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 126
             ,11
             );
    } 

	/**
	 *	Returns the value of serviceId705
	 *	@return serviceId705
	 */
   public char[] getServiceId705() throws CFException{
     if (isServiceId705Modified()) { 
        serviceId705 = refreshServiceId705();
     }
   		return serviceId705;
   }

  
	/**
	*  set variable serviceId705
	*  Corresponding COBOL Variable is 705-SERVICE-ID
	*  @param value
	**/
   public void setServiceId705(char[] value) {
      serviceId705 = checkServiceId705Constraints(value);
      serializeServiceId705(serviceId705);
   } 

     /**
	 * 	Update ServiceId705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceId705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginServiceId705,serviceId705.length);
   	
   }
   
   public void setServiceId705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginServiceId705,serviceId705.length);
   	
   }
   
     /**
	 * 	Update ServiceId705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceId705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceId705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ServiceId705 with another Field
	 *	@param value
	 */
   public void setServiceId705(Field source) {
       replace(source,0,source.length(),beginServiceId705,SERVICE_ID_705_LEN);
   	
   }  
   
     /**
	 * 	Update ServiceId705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceId705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginServiceId705,SERVICE_ID_705_LEN);
   	
   }
   
     /**
	 * 	Update ServiceId705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceId705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginServiceId705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of totalCnt705
	 *	@return totalCnt705
	 */
   public char[] getTotalCnt705() throws CFException{
     if (isTotalCnt705Modified()) { 
        totalCnt705 = refreshTotalCnt705();
     }
   		return totalCnt705;
   }

  
	/**
	*  set variable totalCnt705
	*  Corresponding COBOL Variable is 705-TOTAL-CNT
	*  @param value
	**/
   public void setTotalCnt705(char[] value) {
      totalCnt705 = checkTotalCnt705Constraints(value);
      serializeTotalCnt705(totalCnt705);
   } 

     /**
	 * 	Update TotalCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotalCnt705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotalCnt705,totalCnt705.length);
   	
   }
   
   public void setTotalCnt705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotalCnt705,totalCnt705.length);
   	
   }
   
     /**
	 * 	Update TotalCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotalCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotalCnt705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TotalCnt705 with another Field
	 *	@param value
	 */
   public void setTotalCnt705(Field source) {
       replace(source,0,source.length(),beginTotalCnt705,TOTAL_CNT_705_LEN);
   	
   }  
   
     /**
	 * 	Update TotalCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotalCnt705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotalCnt705,TOTAL_CNT_705_LEN);
   	
   }
   
     /**
	 * 	Update TotalCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotalCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotalCnt705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of successCnt705
	 *	@return successCnt705
	 */
   public char[] getSuccessCnt705() throws CFException{
     if (isSuccessCnt705Modified()) { 
        successCnt705 = refreshSuccessCnt705();
     }
   		return successCnt705;
   }

  
	/**
	*  set variable successCnt705
	*  Corresponding COBOL Variable is 705-SUCCESS-CNT
	*  @param value
	**/
   public void setSuccessCnt705(char[] value) {
      successCnt705 = checkSuccessCnt705Constraints(value);
      serializeSuccessCnt705(successCnt705);
   } 

     /**
	 * 	Update SuccessCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessCnt705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessCnt705,successCnt705.length);
   	
   }
   
   public void setSuccessCnt705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt705,successCnt705.length);
   	
   }
   
     /**
	 * 	Update SuccessCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessCnt705 with another Field
	 *	@param value
	 */
   public void setSuccessCnt705(Field source) {
       replace(source,0,source.length(),beginSuccessCnt705,SUCCESS_CNT_705_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessCnt705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessCnt705,SUCCESS_CNT_705_LEN);
   	
   }
   
     /**
	 * 	Update SuccessCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessCnt705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of successPercent705
	 *	@return successPercent705
	 */
   public char[] getSuccessPercent705() throws CFException{
     if (isSuccessPercent705Modified()) { 
        successPercent705 = refreshSuccessPercent705();
     }
   		return successPercent705;
   }

  
	/**
	*  set variable successPercent705
	*  Corresponding COBOL Variable is 705-SUCCESS-PERCENT
	*  @param value
	**/
   public void setSuccessPercent705(char[] value) {
      successPercent705 = checkSuccessPercent705Constraints(value);
      serializeSuccessPercent705(successPercent705);
   } 

     /**
	 * 	Update SuccessPercent705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessPercent705,successPercent705.length);
   	
   }
   
   public void setSuccessPercent705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent705,successPercent705.length);
   	
   }
   
     /**
	 * 	Update SuccessPercent705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessPercent705 with another Field
	 *	@param value
	 */
   public void setSuccessPercent705(Field source) {
       replace(source,0,source.length(),beginSuccessPercent705,SUCCESS_PERCENT_705_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessPercent705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessPercent705,SUCCESS_PERCENT_705_LEN);
   	
   }
   
     /**
	 * 	Update SuccessPercent705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessPercent705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errCnt705
	 *	@return errCnt705
	 */
   public char[] getErrCnt705() throws CFException{
     if (isErrCnt705Modified()) { 
        errCnt705 = refreshErrCnt705();
     }
   		return errCnt705;
   }

  
	/**
	*  set variable errCnt705
	*  Corresponding COBOL Variable is 705-ERR-CNT
	*  @param value
	**/
   public void setErrCnt705(char[] value) {
      errCnt705 = checkErrCnt705Constraints(value);
      serializeErrCnt705(errCnt705);
   } 

     /**
	 * 	Update ErrCnt705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrCnt705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrCnt705,errCnt705.length);
   	
   }
   
   public void setErrCnt705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrCnt705,errCnt705.length);
   	
   }
   
     /**
	 * 	Update ErrCnt705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCnt705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCnt705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrCnt705 with another Field
	 *	@param value
	 */
   public void setErrCnt705(Field source) {
       replace(source,0,source.length(),beginErrCnt705,ERR_CNT_705_LEN);
   	
   }  
   
     /**
	 * 	Update ErrCnt705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrCnt705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrCnt705,ERR_CNT_705_LEN);
   	
   }
   
     /**
	 * 	Update ErrCnt705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCnt705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCnt705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errPercent705
	 *	@return errPercent705
	 */
   public char[] getErrPercent705() throws CFException{
     if (isErrPercent705Modified()) { 
        errPercent705 = refreshErrPercent705();
     }
   		return errPercent705;
   }

  
	/**
	*  set variable errPercent705
	*  Corresponding COBOL Variable is 705-ERR-PERCENT
	*  @param value
	**/
   public void setErrPercent705(char[] value) {
      errPercent705 = checkErrPercent705Constraints(value);
      serializeErrPercent705(errPercent705);
   } 

     /**
	 * 	Update ErrPercent705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrPercent705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrPercent705,errPercent705.length);
   	
   }
   
   public void setErrPercent705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrPercent705,errPercent705.length);
   	
   }
   
     /**
	 * 	Update ErrPercent705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrPercent705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrPercent705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrPercent705 with another Field
	 *	@param value
	 */
   public void setErrPercent705(Field source) {
       replace(source,0,source.length(),beginErrPercent705,ERR_PERCENT_705_LEN);
   	
   }  
   
     /**
	 * 	Update ErrPercent705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrPercent705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrPercent705,ERR_PERCENT_705_LEN);
   	
   }
   
     /**
	 * 	Update ErrPercent705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrPercent705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrPercent705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of avgTime705
	 *	@return avgTime705
	 */
   public char[] getAvgTime705() throws CFException{
     if (isAvgTime705Modified()) { 
        avgTime705 = refreshAvgTime705();
     }
   		return avgTime705;
   }

  
	/**
	*  set variable avgTime705
	*  Corresponding COBOL Variable is 705-AVG-TIME
	*  @param value
	**/
   public void setAvgTime705(char[] value) {
      avgTime705 = checkAvgTime705Constraints(value);
      serializeAvgTime705(avgTime705);
   } 

     /**
	 * 	Update AvgTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgTime705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAvgTime705,avgTime705.length);
   	
   }
   
   public void setAvgTime705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAvgTime705,avgTime705.length);
   	
   }
   
     /**
	 * 	Update AvgTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgTime705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AvgTime705 with another Field
	 *	@param value
	 */
   public void setAvgTime705(Field source) {
       replace(source,0,source.length(),beginAvgTime705,AVG_TIME_705_LEN);
   	
   }  
   
     /**
	 * 	Update AvgTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgTime705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAvgTime705,AVG_TIME_705_LEN);
   	
   }
   
     /**
	 * 	Update AvgTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgTime705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of highTime705
	 *	@return highTime705
	 */
   public char[] getHighTime705() throws CFException{
     if (isHighTime705Modified()) { 
        highTime705 = refreshHighTime705();
     }
   		return highTime705;
   }

  
	/**
	*  set variable highTime705
	*  Corresponding COBOL Variable is 705-HIGH-TIME
	*  @param value
	**/
   public void setHighTime705(char[] value) {
      highTime705 = checkHighTime705Constraints(value);
      serializeHighTime705(highTime705);
   } 

     /**
	 * 	Update HighTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighTime705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHighTime705,highTime705.length);
   	
   }
   
   public void setHighTime705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHighTime705,highTime705.length);
   	
   }
   
     /**
	 * 	Update HighTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighTime705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HighTime705 with another Field
	 *	@param value
	 */
   public void setHighTime705(Field source) {
       replace(source,0,source.length(),beginHighTime705,HIGH_TIME_705_LEN);
   	
   }  
   
     /**
	 * 	Update HighTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighTime705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHighTime705,HIGH_TIME_705_LEN);
   	
   }
   
     /**
	 * 	Update HighTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighTime705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lowTime705
	 *	@return lowTime705
	 */
   public char[] getLowTime705() throws CFException{
     if (isLowTime705Modified()) { 
        lowTime705 = refreshLowTime705();
     }
   		return lowTime705;
   }

  
	/**
	*  set variable lowTime705
	*  Corresponding COBOL Variable is 705-LOW-TIME
	*  @param value
	**/
   public void setLowTime705(char[] value) {
      lowTime705 = checkLowTime705Constraints(value);
      serializeLowTime705(lowTime705);
   } 

     /**
	 * 	Update LowTime705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowTime705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLowTime705,lowTime705.length);
   	
   }
   
   public void setLowTime705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLowTime705,lowTime705.length);
   	
   }
   
     /**
	 * 	Update LowTime705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowTime705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowTime705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LowTime705 with another Field
	 *	@param value
	 */
   public void setLowTime705(Field source) {
       replace(source,0,source.length(),beginLowTime705,LOW_TIME_705_LEN);
   	
   }  
   
     /**
	 * 	Update LowTime705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowTime705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLowTime705,LOW_TIME_705_LEN);
   	
   }
   
     /**
	 * 	Update LowTime705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowTime705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowTime705+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetail705FieldLength() {
			return DETAIL_705_LENGTH;
		}

}
  
