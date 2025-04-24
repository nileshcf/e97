package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateTimeOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CmnDateTimeOutputArea extends CmnDateTimeOutputAreaSerialized { 
   

								private int cmnDateTimeReturnCode;

						private char[] cmnDateRetrieved = Field.fillLowValue(10);
				private CmnDateRetrievedR cmnDateRetrievedR = new CmnDateRetrievedR();

						private char[] cmnTimeRetrieved = Field.fillLowValue(8);
				private CmnTimeRetrievedR cmnTimeRetrievedR = new CmnTimeRetrievedR();
	
	/**
	* Constructor for CmnDateTimeOutputArea
	**/
    public CmnDateTimeOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateTimeOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateTimeOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateRetrievedR.setParent(this,getStartOffset() + 1);
	       			cmnTimeRetrievedR.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of cmnDateTimeReturnCode
	 *	@return cmnDateTimeReturnCode
	 */
	public int getCmnDateTimeReturnCode() throws CFException {
       if (isCmnDateTimeReturnCodeModified()) { 
           cmnDateTimeReturnCode = refreshCmnDateTimeReturnCode();
        }
   		return cmnDateTimeReturnCode;
	}
	

	
	   
	/**
	 * 	Update CmnDateTimeReturnCode with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-TIME-RETURN-CODE
	 *	@param number
	 */
	public void setCmnDateTimeReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateTimeReturnCode = checkCmnDateTimeReturnCodeMaxLimit(number); 
		serializeCmnDateTimeReturnCode(cmnDateTimeReturnCode);
	}
	

	public void setCmnDateTimeReturnCode(long number) {
	    number = checkCmnDateTimeReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateTimeReturnCode((int)number);
	}
	
	/**
	 * 	Update CmnDateTimeReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateTimeReturnCode(char[] value) throws CFException {
		 cmnDateTimeReturnCode = serializeCmnDateTimeReturnCode(value);
	}
	/**
	 * 	Update CmnDateTimeReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateTimeReturnCodeString(char[] value) throws CFException {
		 setCmnDateTimeReturnCode(value);
	}
	
	/**
	 *	Test condition 0 for isSuccessfullCall10()
	 *	@return  Returns true if isSuccessfullCall10() is 0
	 */
   public boolean isSuccessfullCall10() throws CFException {
      return (  getCmnDateTimeReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSuccessfullCall10True() {  			
    	setCmnDateTimeReturnCode( 0);
   	}
	
	/**
	 *	Test condition 0 for isValidParameters10()
	 *	@return  Returns true if isValidParameters10() is 0
	 */
   public boolean isValidParameters10() throws CFException {
      return (  getCmnDateTimeReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setValidParameters10True() {  			
    	setCmnDateTimeReturnCode( 0);
   	}
	
	/**
	 *	Test condition 1 THRU 9 for isErrorInCall10()
	 *	@return  Returns true if isErrorInCall10() is 1 THRU 9
	 */
   public boolean isErrorInCall10() throws CFException {
      return (   (getCmnDateTimeReturnCode()  >=  1 ) &&   (getCmnDateTimeReturnCode()  <=  9 )   );
   }


	/**
	*  set values 1 THRU 9
	*/
   	public void setErrorInCall10True() {  			
    	setCmnDateTimeReturnCode( 1);
   	}
	/**
	 *	Returns the value of cmnDateRetrieved
	 *	@return cmnDateRetrieved
	 */
   public char[] getCmnDateRetrieved() throws CFException{
     if (isCmnDateRetrievedModified()) { 
        cmnDateRetrieved = refreshCmnDateRetrieved();
     }
   		return cmnDateRetrieved;
   }

  
	/**
	*  set variable cmnDateRetrieved
	*  Corresponding COBOL Variable is CMN-DATE-RETRIEVED
	*  @param value
	**/
   public void setCmnDateRetrieved(char[] value) {
      cmnDateRetrieved = checkCmnDateRetrievedConstraints(value);
      serializeCmnDateRetrieved(cmnDateRetrieved);
   } 

     /**
	 * 	Update CmnDateRetrieved 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetrieved(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetrieved,cmnDateRetrieved.length);
   	
   }
   
   public void setCmnDateRetrieved(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved,cmnDateRetrieved.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrieved(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetrieved with another Field
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source) {
       replace(source,0,source.length(),beginCmnDateRetrieved,CMN_DATE_RETRIEVED_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved,CMN_DATE_RETRIEVED_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetrievedR
	 *	@return cmnDateRetrievedR
	 */   
	 public CmnDateRetrievedR getCmnDateRetrievedR() {
   	return cmnDateRetrievedR;
   }
   /**
	* 	Update CmnDateRetrievedR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-RETRIEVED-R
	*	@param value
	*/
   public void setCmnDateRetrievedR(char[] value) {
      cmnDateRetrievedR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetrievedR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetrievedR.begin,cmnDateRetrievedR.length());
   }
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrievedR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetrievedR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateRetrievedR with another Field
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source) {
   	replace(source,0,source.length(),cmnDateRetrievedR.begin,cmnDateRetrievedR.length());
   }  
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetrievedR.begin,cmnDateRetrievedR.length());
   }
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateRetrievedR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeRetrieved
	 *	@return cmnTimeRetrieved
	 */
   public char[] getCmnTimeRetrieved() throws CFException{
     if (isCmnTimeRetrievedModified()) { 
        cmnTimeRetrieved = refreshCmnTimeRetrieved();
     }
   		return cmnTimeRetrieved;
   }

  
	/**
	*  set variable cmnTimeRetrieved
	*  Corresponding COBOL Variable is CMN-TIME-RETRIEVED
	*  @param value
	**/
   public void setCmnTimeRetrieved(char[] value) {
      cmnTimeRetrieved = checkCmnTimeRetrievedConstraints(value);
      serializeCmnTimeRetrieved(cmnTimeRetrieved);
   } 

     /**
	 * 	Update CmnTimeRetrieved 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrieved(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetrieved,cmnTimeRetrieved.length);
   	
   }
   
   public void setCmnTimeRetrieved(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved,cmnTimeRetrieved.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrieved(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetrieved with another Field
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetrieved,CMN_TIME_RETRIEVED_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved,CMN_TIME_RETRIEVED_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetrievedR
	 *	@return cmnTimeRetrievedR
	 */   
	 public CmnTimeRetrievedR getCmnTimeRetrievedR() {
   	return cmnTimeRetrievedR;
   }
   /**
	* 	Update CmnTimeRetrievedR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-RETRIEVED-R
	*	@param value
	*/
   public void setCmnTimeRetrievedR(char[] value) {
      cmnTimeRetrievedR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeRetrievedR with another Field
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source) {
   	replace(source,0,source.length(),cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }  
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes CmnDateTimeOutputArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCmnDateTimeReturnCode(0);
         setCmnDateRetrieved(CONSTANTS.SPACE_10);
         setCmnTimeRetrieved(CONSTANTS.SPACE_8);
   }

		public static int getCmnDateTimeOutputAreaFieldLength() {
			return CMN_DATE_TIME_OUTPUT_AREA_LENGTH;
		}

}
  
