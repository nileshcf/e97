package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcInputArea extends CmnTimeCalcInputAreaSerialized { 
   

						private char[] cmnTimeCalcType = Field.fillLowValue(1);

								private long cmnTimeCalcStart;
				private CmnTimeCalcStartR cmnTimeCalcStartR = new CmnTimeCalcStartR();

								private long cmnTimeCalcEnd;
				private CmnTimeCalcEndR cmnTimeCalcEndR = new CmnTimeCalcEndR();

								private long cmnTimeCalcNumOfSecIn;
	
	/**
	* Constructor for CmnTimeCalcInputArea
	**/
    public CmnTimeCalcInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeCalcStartR.setParent(this,getStartOffset() + 1);
	       			cmnTimeCalcEndR.setParent(this,getStartOffset() + 7);
    } 

	/**
	 *	Returns the value of cmnTimeCalcType
	 *	@return cmnTimeCalcType
	 */
   public char[] getCmnTimeCalcType() throws CFException{
     if (isCmnTimeCalcTypeModified()) { 
        cmnTimeCalcType = refreshCmnTimeCalcType();
     }
   		return cmnTimeCalcType;
   }

  
	/**
	*  set variable cmnTimeCalcType
	*  Corresponding COBOL Variable is CMN-TIME-CALC-TYPE
	*  @param value
	**/
   public void setCmnTimeCalcType(char[] value) {
      cmnTimeCalcType = checkCmnTimeCalcTypeConstraints(value);
      serializeCmnTimeCalcType(cmnTimeCalcType);
   } 

     /**
	 * 	Update CmnTimeCalcType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeCalcType,cmnTimeCalcType.length);
   	
   }
   
   public void setCmnTimeCalcType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeCalcType,cmnTimeCalcType.length);
   	
   }
   
     /**
	 * 	Update CmnTimeCalcType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeCalcType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeCalcType with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcType(Field source) {
       replace(source,0,source.length(),beginCmnTimeCalcType,CMN_TIME_CALC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeCalcType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeCalcType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeCalcType,CMN_TIME_CALC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeCalcType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeCalcType+targetIndex,targetLen);
    
   }
	char[] elapsedTime1588Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isElapsedTime15()
	 *	@return  Returns true if isElapsedTime15() is "1"
	 */
   public boolean isElapsedTime15() throws CFException {
      return (  compareChars( getCmnTimeCalcType() , elapsedTime1588Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setElapsedTime15True() {  			
    	setCmnTimeCalcType( elapsedTime1588Value);
   	}
	char[] futureTime1588Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isFutureTime15()
	 *	@return  Returns true if isFutureTime15() is "2"
	 */
   public boolean isFutureTime15() throws CFException {
      return (  compareChars( getCmnTimeCalcType() , futureTime1588Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setFutureTime15True() {  			
    	setCmnTimeCalcType( futureTime1588Value);
   	}
	char[] pastTime1588Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isPastTime15()
	 *	@return  Returns true if isPastTime15() is "3"
	 */
   public boolean isPastTime15() throws CFException {
      return (  compareChars( getCmnTimeCalcType() , pastTime1588Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setPastTime15True() {  			
    	setCmnTimeCalcType( pastTime1588Value);
   	}
	/**
	 *	Returns the value of cmnTimeCalcStart
	 *	@return cmnTimeCalcStart
	 */
	public long getCmnTimeCalcStart() throws CFException {
       if (isCmnTimeCalcStartModified()) { 
           cmnTimeCalcStart = refreshCmnTimeCalcStart();
        }
   		return cmnTimeCalcStart;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcStart with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-START
	 *	@param number
	 */
	public void setCmnTimeCalcStart(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcStart = checkCmnTimeCalcStartMaxLimit(number); 
		serializeCmnTimeCalcStart(cmnTimeCalcStart);
	}
	

	/**
	 * 	Update CmnTimeCalcStart with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStart(char[] value) throws CFException {
		 cmnTimeCalcStart = serializeCmnTimeCalcStart(value);
	}
	/**
	 * 	Update CmnTimeCalcStart with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartString(char[] value) throws CFException {
		 setCmnTimeCalcStart(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcStartR
	 *	@return cmnTimeCalcStartR
	 */   
	 public CmnTimeCalcStartR getCmnTimeCalcStartR() {
   	return cmnTimeCalcStartR;
   }
   /**
	* 	Update CmnTimeCalcStartR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-START-R
	*	@param value
	*/
   public void setCmnTimeCalcStartR(char[] value) {
      cmnTimeCalcStartR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcStartR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcStartR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcStartR.begin,cmnTimeCalcStartR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcStartR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcStartR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcStartR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcStartR with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcStartR(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcStartR.begin,cmnTimeCalcStartR.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcStartR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcStartR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcStartR.begin,cmnTimeCalcStartR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcStartR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcStartR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcStartR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeCalcEnd
	 *	@return cmnTimeCalcEnd
	 */
	public long getCmnTimeCalcEnd() throws CFException {
       if (isCmnTimeCalcEndModified()) { 
           cmnTimeCalcEnd = refreshCmnTimeCalcEnd();
        }
   		return cmnTimeCalcEnd;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcEnd with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-END
	 *	@param number
	 */
	public void setCmnTimeCalcEnd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcEnd = checkCmnTimeCalcEndMaxLimit(number); 
		serializeCmnTimeCalcEnd(cmnTimeCalcEnd);
	}
	

	/**
	 * 	Update CmnTimeCalcEnd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEnd(char[] value) throws CFException {
		 cmnTimeCalcEnd = serializeCmnTimeCalcEnd(value);
	}
	/**
	 * 	Update CmnTimeCalcEnd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndString(char[] value) throws CFException {
		 setCmnTimeCalcEnd(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcEndR
	 *	@return cmnTimeCalcEndR
	 */   
	 public CmnTimeCalcEndR getCmnTimeCalcEndR() {
   	return cmnTimeCalcEndR;
   }
   /**
	* 	Update CmnTimeCalcEndR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-END-R
	*	@param value
	*/
   public void setCmnTimeCalcEndR(char[] value) {
      cmnTimeCalcEndR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcEndR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcEndR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcEndR.begin,cmnTimeCalcEndR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcEndR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcEndR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcEndR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcEndR with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcEndR(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcEndR.begin,cmnTimeCalcEndR.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcEndR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcEndR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcEndR.begin,cmnTimeCalcEndR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcEndR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcEndR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcEndR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeCalcNumOfSecIn
	 *	@return cmnTimeCalcNumOfSecIn
	 */
	public long getCmnTimeCalcNumOfSecIn() throws CFException {
       if (isCmnTimeCalcNumOfSecInModified()) { 
           cmnTimeCalcNumOfSecIn = refreshCmnTimeCalcNumOfSecIn();
        }
   		return cmnTimeCalcNumOfSecIn;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNumOfSecIn with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NUM-OF-SEC-IN
	 *	@param number
	 */
	public void setCmnTimeCalcNumOfSecIn(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNumOfSecIn = checkCmnTimeCalcNumOfSecInMaxLimit(number); 
		serializeCmnTimeCalcNumOfSecIn(cmnTimeCalcNumOfSecIn);
	}
	

	/**
	 * 	Update CmnTimeCalcNumOfSecIn with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNumOfSecIn(char[] value) throws CFException {
		 cmnTimeCalcNumOfSecIn = serializeCmnTimeCalcNumOfSecIn(value);
	}
	/**
	 * 	Update CmnTimeCalcNumOfSecIn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNumOfSecInString(char[] value) throws CFException {
		 setCmnTimeCalcNumOfSecIn(value);
	}

	
	
	

		public static int getCmnTimeCalcInputAreaFieldLength() {
			return CMN_TIME_CALC_INPUT_AREA_LENGTH;
		}

}
  
