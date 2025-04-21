package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583ParserArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_si583ParserArea")

public class Si583ParserArea extends Si583ParserAreaSerialized  implements InitializingBean {
   

								private int si583DataAddr;

								private int si583DataPtr;

								private int si583FormatAddr;

								private int si583FormatPtr;

								private short si583ReturnCode;

								private short si583DataElementInError;

						private char[] si583ReturnMessage = Field.fillLowValue(80);

						private char[] si583Mti1 = Field.fillLowValue(4);

						private char[] si583Mti2 = Field.fillLowValue(4);

								private int si583DataLength;

								private int si583FormatLength;

						private char[] si583ExtendData = Field.fillLowValue(32768);
				private Si583DataElementWorkArea1 si583DataElementWorkArea1 = new Si583DataElementWorkArea1();
				private Si583DataElementWorkArea2 si583DataElementWorkArea2 = new Si583DataElementWorkArea2();
	
	/**
	* Constructor for Si583ParserArea
	**/
    public Si583ParserArea() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			si583DataElementWorkArea1.setParent(this,getStartOffset() + 32876);
	       			si583DataElementWorkArea2.setParent(this,getStartOffset() + 33516);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of si583DataAddr
	 *	@return si583DataAddr
	 */
	public int getSi583DataAddr() throws CFException {
        if (isSi583DataAddrModified()) { 
           si583DataAddr = refreshSi583DataAddr();
        }
   		return si583DataAddr;
	}
	
	/**
	 * 	Update Si583DataAddr with the passed value
	 *  Corresponding COBOL Variable is SI583-DATA-ADDR
	 *	@param number
	 */
	public void setSi583DataAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DataAddr = checkSi583DataAddrMaxLimit(number); 
		serializeSi583DataAddr(si583DataAddr);
	}


	public void setSi583DataAddr(long number) {
	    number = checkSi583DataAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583DataAddr((int)number);
	}
	
	/**
	 *	Returns the value of si583DataPtr
	 *	@return si583DataPtr
	 */
	public int getSi583DataPtr() throws CFException {
        if (isSi583DataPtrModified()) { 
           si583DataPtr = refreshSi583DataPtr();
        }
   		return si583DataPtr;
	}
	
	/**
	 * 	Update Si583DataPtr with the passed value
	 *  Corresponding COBOL Variable is SI583-DATA-PTR
	 *	@param number
	 */
	public void setSi583DataPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DataPtr = checkSi583DataPtrMaxLimit(number); 
		serializeSi583DataPtr(si583DataPtr);
	}


	public void setSi583DataPtr(long number) {
	    number = checkSi583DataPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583DataPtr((int)number);
	}
	
	/**
	 *	Returns the value of si583FormatAddr
	 *	@return si583FormatAddr
	 */
	public int getSi583FormatAddr() throws CFException {
        if (isSi583FormatAddrModified()) { 
           si583FormatAddr = refreshSi583FormatAddr();
        }
   		return si583FormatAddr;
	}
	
	/**
	 * 	Update Si583FormatAddr with the passed value
	 *  Corresponding COBOL Variable is SI583-FORMAT-ADDR
	 *	@param number
	 */
	public void setSi583FormatAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583FormatAddr = checkSi583FormatAddrMaxLimit(number); 
		serializeSi583FormatAddr(si583FormatAddr);
	}


	public void setSi583FormatAddr(long number) {
	    number = checkSi583FormatAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583FormatAddr((int)number);
	}
	
	/**
	 *	Returns the value of si583FormatPtr
	 *	@return si583FormatPtr
	 */
	public int getSi583FormatPtr() throws CFException {
        if (isSi583FormatPtrModified()) { 
           si583FormatPtr = refreshSi583FormatPtr();
        }
   		return si583FormatPtr;
	}
	
	/**
	 * 	Update Si583FormatPtr with the passed value
	 *  Corresponding COBOL Variable is SI583-FORMAT-PTR
	 *	@param number
	 */
	public void setSi583FormatPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583FormatPtr = checkSi583FormatPtrMaxLimit(number); 
		serializeSi583FormatPtr(si583FormatPtr);
	}


	public void setSi583FormatPtr(long number) {
	    number = checkSi583FormatPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583FormatPtr((int)number);
	}
	
	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {
        if (isSi583ReturnCodeModified()) { 
           si583ReturnCode = refreshSi583ReturnCode();
        }
   		return si583ReturnCode;
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *  Corresponding COBOL Variable is SI583-RETURN-CODE
	 *	@param number
	 */
	public void setSi583ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583ReturnCode = checkSi583ReturnCodeMaxLimit(number); 
		serializeSi583ReturnCode(si583ReturnCode);
	}

	public void setSi583ReturnCode(int number) {
	    number = checkSi583ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583ReturnCode((short)number);
	}
	public void setSi583ReturnCode(long number) {
	    number = checkSi583ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isSi583ParsingSuccessful88()
	 *	@return  Returns true if isSi583ParsingSuccessful88() is 0
	 */
   public boolean isSi583ParsingSuccessful88() throws CFException {
      return (  getSi583ReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSi583ParsingSuccessful88True() {  			
    	setSi583ReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 1 for isSi583Mti1Error88()
	 *	@return  Returns true if isSi583Mti1Error88() is 1
	 */
   public boolean isSi583Mti1Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setSi583Mti1Error88True() {  			
    	setSi583ReturnCode( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isSi583Mti2Error88()
	 *	@return  Returns true if isSi583Mti2Error88() is 2
	 */
   public boolean isSi583Mti2Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setSi583Mti2Error88True() {  			
    	setSi583ReturnCode( (short)2);
   	}
	
	/**
	 *	Test condition 101 for isSi583Lth1Error88()
	 *	@return  Returns true if isSi583Lth1Error88() is 101
	 */
   public boolean isSi583Lth1Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  101  );
   }


	/**
	*  set values 101
	*/
   	public void setSi583Lth1Error88True() {  			
    	setSi583ReturnCode( (short)101);
   	}
	
	/**
	 *	Test condition 102 for isSi583Lth2Error88()
	 *	@return  Returns true if isSi583Lth2Error88() is 102
	 */
   public boolean isSi583Lth2Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  102  );
   }


	/**
	*  set values 102
	*/
   	public void setSi583Lth2Error88True() {  			
    	setSi583ReturnCode( (short)102);
   	}
	
	/**
	 *	Test condition 201 for isSi583Def1Error88()
	 *	@return  Returns true if isSi583Def1Error88() is 201
	 */
   public boolean isSi583Def1Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  201  );
   }


	/**
	*  set values 201
	*/
   	public void setSi583Def1Error88True() {  			
    	setSi583ReturnCode( (short)201);
   	}
	
	/**
	 *	Test condition 202 for isSi583Def2Error88()
	 *	@return  Returns true if isSi583Def2Error88() is 202
	 */
   public boolean isSi583Def2Error88() throws CFException {
      return (  getSi583ReturnCode()  ==  202  );
   }


	/**
	*  set values 202
	*/
   	public void setSi583Def2Error88True() {  			
    	setSi583ReturnCode( (short)202);
   	}
	
	/**
	 *	Test condition 999 for isSi583InvalidPtr88()
	 *	@return  Returns true if isSi583InvalidPtr88() is 999
	 */
   public boolean isSi583InvalidPtr88() throws CFException {
      return (  getSi583ReturnCode()  ==  999  );
   }


	/**
	*  set values 999
	*/
   	public void setSi583InvalidPtr88True() {  			
    	setSi583ReturnCode( (short)999);
   	}
	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {
        if (isSi583DataElementInErrorModified()) { 
           si583DataElementInError = refreshSi583DataElementInError();
        }
   		return si583DataElementInError;
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *  Corresponding COBOL Variable is SI583-DATA-ELEMENT-IN-ERROR
	 *	@param number
	 */
	public void setSi583DataElementInError(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DataElementInError = checkSi583DataElementInErrorMaxLimit(number); 
		serializeSi583DataElementInError(si583DataElementInError);
	}

	public void setSi583DataElementInError(int number) {
	    number = checkSi583DataElementInErrorMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DataElementInError((short)number);
	}
	public void setSi583DataElementInError(long number) {
	    number = checkSi583DataElementInErrorMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DataElementInError((short)number);
	}
	

	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException{
     if (isSi583ReturnMessageModified()) { 
        si583ReturnMessage = refreshSi583ReturnMessage();
     }
   		return si583ReturnMessage;
   }

  
	/**
	*  set variable si583ReturnMessage
	*  Corresponding COBOL Variable is SI583-RETURN-MESSAGE
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) {
      si583ReturnMessage = checkSi583ReturnMessageConstraints(value);
      serializeSi583ReturnMessage(si583ReturnMessage);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583ReturnMessage,si583ReturnMessage.length);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ReturnMessage,si583ReturnMessage.length);
   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ReturnMessage+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
       replace(source,0,source.length(),beginSi583ReturnMessage,SI_583_RETURN_MESSAGE_LEN);
   	
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583ReturnMessage,SI_583_RETURN_MESSAGE_LEN);
   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ReturnMessage+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of si583Mti1
	 *	@return si583Mti1
	 */
   public char[] getSi583Mti1() throws CFException{
     if (isSi583Mti1Modified()) { 
        si583Mti1 = refreshSi583Mti1();
     }
   		return si583Mti1;
   }

  
	/**
	*  set variable si583Mti1
	*  Corresponding COBOL Variable is SI583-MTI-1
	*  @param value
	**/
   public void setSi583Mti1(char[] value) {
      si583Mti1 = checkSi583Mti1Constraints(value);
      serializeSi583Mti1(si583Mti1);
   } 

     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583Mti1,si583Mti1.length);
   	
   }
   
   public void setSi583Mti1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti1,si583Mti1.length);
   	
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583Mti1 with another Field
	 *	@param value
	 */
   public void setSi583Mti1(Field source) {
       replace(source,0,source.length(),beginSi583Mti1,SI_583_MTI_1_LEN);
   	
   }  
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583Mti1,SI_583_MTI_1_LEN);
   	
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of si583Mti2
	 *	@return si583Mti2
	 */
   public char[] getSi583Mti2() throws CFException{
     if (isSi583Mti2Modified()) { 
        si583Mti2 = refreshSi583Mti2();
     }
   		return si583Mti2;
   }

  
	/**
	*  set variable si583Mti2
	*  Corresponding COBOL Variable is SI583-MTI-2
	*  @param value
	**/
   public void setSi583Mti2(char[] value) {
      si583Mti2 = checkSi583Mti2Constraints(value);
      serializeSi583Mti2(si583Mti2);
   } 

     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583Mti2,si583Mti2.length);
   	
   }
   
   public void setSi583Mti2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti2,si583Mti2.length);
   	
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583Mti2 with another Field
	 *	@param value
	 */
   public void setSi583Mti2(Field source) {
       replace(source,0,source.length(),beginSi583Mti2,SI_583_MTI_2_LEN);
   	
   }  
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583Mti2,SI_583_MTI_2_LEN);
   	
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583Mti2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of si583DataLength
	 *	@return si583DataLength
	 */
	public int getSi583DataLength() throws CFException {
        if (isSi583DataLengthModified()) { 
           si583DataLength = refreshSi583DataLength();
        }
   		return si583DataLength;
	}
	
	/**
	 * 	Update Si583DataLength with the passed value
	 *  Corresponding COBOL Variable is SI583-DATA-LENGTH
	 *	@param number
	 */
	public void setSi583DataLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DataLength = checkSi583DataLengthMaxLimit(number); 
		serializeSi583DataLength(si583DataLength);
	}


	public void setSi583DataLength(long number) {
	    number = checkSi583DataLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583DataLength((int)number);
	}
	
	/**
	 *	Returns the value of si583FormatLength
	 *	@return si583FormatLength
	 */
	public int getSi583FormatLength() throws CFException {
        if (isSi583FormatLengthModified()) { 
           si583FormatLength = refreshSi583FormatLength();
        }
   		return si583FormatLength;
	}
	
	/**
	 * 	Update Si583FormatLength with the passed value
	 *  Corresponding COBOL Variable is SI583-FORMAT-LENGTH
	 *	@param number
	 */
	public void setSi583FormatLength(int number) {
	     // Truncate if the number is beyond +/- Max range
	    si583FormatLength = checkSi583FormatLengthMaxLimit(number); 
		serializeSi583FormatLength(si583FormatLength);
	}


	public void setSi583FormatLength(long number) {
	    number = checkSi583FormatLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSi583FormatLength((int)number);
	}
	
	/**
	 *	Returns the value of si583ExtendData
	 *	@return si583ExtendData
	 */
   public char[] getSi583ExtendData() throws CFException{
     if (isSi583ExtendDataModified()) { 
        si583ExtendData = refreshSi583ExtendData();
     }
   		return si583ExtendData;
   }

  
	/**
	*  set variable si583ExtendData
	*  Corresponding COBOL Variable is SI583-EXTEND-DATA
	*  @param value
	**/
   public void setSi583ExtendData(char[] value) {
      si583ExtendData = checkSi583ExtendDataConstraints(value);
      serializeSi583ExtendData(si583ExtendData);
   } 

     /**
	 * 	Update Si583ExtendData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ExtendData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583ExtendData,si583ExtendData.length);
   	
   }
   
   public void setSi583ExtendData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ExtendData,si583ExtendData.length);
   	
   }
   
     /**
	 * 	Update Si583ExtendData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ExtendData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ExtendData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583ExtendData with another Field
	 *	@param value
	 */
   public void setSi583ExtendData(Field source) {
       replace(source,0,source.length(),beginSi583ExtendData,SI_583_EXTEND_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Si583ExtendData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ExtendData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583ExtendData,SI_583_EXTEND_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Si583ExtendData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ExtendData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583ExtendData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of si583DataElementWorkArea1
	 *	@return si583DataElementWorkArea1
	 */   
	 public Si583DataElementWorkArea1 getSi583DataElementWorkArea1() {
   	return si583DataElementWorkArea1;
   }
   /**
	* 	Update Si583DataElementWorkArea1 with the passed value
	*   Corresponding COBOL Variable is SI583-DATA-ELEMENT-WORK-AREA-1
	*	@param value
	*/
   public void setSi583DataElementWorkArea1(char[] value) {
      si583DataElementWorkArea1.setString(value); 
   }   
    
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea1.begin,si583DataElementWorkArea1.length());
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea1 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source) {
   	replace(source,0,source.length(),si583DataElementWorkArea1.begin,si583DataElementWorkArea1.length());
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea1.begin,si583DataElementWorkArea1.length());
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of si583DataElementWorkArea2
	 *	@return si583DataElementWorkArea2
	 */   
	 public Si583DataElementWorkArea2 getSi583DataElementWorkArea2() {
   	return si583DataElementWorkArea2;
   }
   /**
	* 	Update Si583DataElementWorkArea2 with the passed value
	*   Corresponding COBOL Variable is SI583-DATA-ELEMENT-WORK-AREA-2
	*	@param value
	*/
   public void setSi583DataElementWorkArea2(char[] value) {
      si583DataElementWorkArea2.setString(value); 
   }   
    
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea2.begin,si583DataElementWorkArea2.length());
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea2 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source) {
   	replace(source,0,source.length(),si583DataElementWorkArea2.begin,si583DataElementWorkArea2.length());
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea2.begin,si583DataElementWorkArea2.length());
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,si583DataElementWorkArea2.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Si583ParserArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSi583DataAddr(0);
                     setSi583FormatAddr(0);
         	setSi583ReturnCode((short)0);
         	setSi583DataElementInError((short)0);
         setSi583ReturnMessage(CONSTANTS.SPACE_80);
         setSi583Mti1(CONSTANTS.SPACE_4);
         setSi583Mti2(CONSTANTS.SPACE_4);
                     setSi583DataLength(0);
                     setSi583FormatLength(0);
         setSi583ExtendData(CONSTANTS.SPACE_32768);
          si583DataElementWorkArea1.initialize();
     
          si583DataElementWorkArea2.initialize();
     
   }

		public static int getSi583ParserAreaFieldLength() {
			return SI_583_PARSER_AREA_LENGTH;
		}

}
  
