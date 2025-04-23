package com.cloudframe.app.global.sharedvar;

/**
*  The class Output is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_output")

public class Output extends OutputSerialized  implements InitializingBean {
   

						private char[] outCardNumber = Field.fillLowValue(16);

								private int outServiceMm;

								private BigDecimal outTotal = BigDecimal.ZERO;
	
	/**
	* Constructor for Output
	**/
    public Output() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of outCardNumber
	 *	@return outCardNumber
	 */
   public char[] getOutCardNumber() throws CFException{
     if (isOutCardNumberModified()) { 
        outCardNumber = refreshOutCardNumber();
     }
   		return outCardNumber;
   }

  
	/**
	*  set variable outCardNumber
	*  Corresponding COBOL Variable is WS-OUT-CARD-NUMBER
	*  @param value
	**/
   public void setOutCardNumber(char[] value) {
      outCardNumber = checkOutCardNumberConstraints(value);
      serializeOutCardNumber(outCardNumber);
   } 

     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutCardNumber,outCardNumber.length);
   	
   }
   
   public void setOutCardNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutCardNumber,outCardNumber.length);
   	
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutCardNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutCardNumber with another Field
	 *	@param value
	 */
   public void setOutCardNumber(Field source) {
       replace(source,0,source.length(),beginOutCardNumber,OUT_CARD_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutCardNumber,OUT_CARD_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutCardNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of outServiceMm
	 *	@return outServiceMm
	 */
	public int getOutServiceMm() throws CFException {
       if (isOutServiceMmModified()) { 
           outServiceMm = refreshOutServiceMm();
        }
   		return outServiceMm;
	}
	

	
	   
	/**
	 * 	Update OutServiceMm with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-SERVICE-MM
	 *	@param number
	 */
	public void setOutServiceMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    outServiceMm = checkOutServiceMmMaxLimit(number); 
		serializeOutServiceMm(outServiceMm);
	}
	

	public void setOutServiceMm(long number) {
	    number = checkOutServiceMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutServiceMm((int)number);
	}
	
	/**
	 * 	Update OutServiceMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutServiceMm(char[] value) throws CFException {
		 outServiceMm = serializeOutServiceMm(value);
	}
	/**
	 * 	Update OutServiceMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutServiceMmString(char[] value) throws CFException {
		 setOutServiceMm(value);
	}
	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
       if (isOutTotalModified()) { 
           outTotal = refreshOutTotal();
        }
   		return outTotal;
	}
	

	
	   
	/**
	 * 	Update OutTotal with the passed number
	 *  Corresponding COBOL Variable is WS-OUT-TOTAL
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       outTotal = checkOutTotalMaxLimit(number);
	    serializeOutTotal(outTotal);
   }
	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutTotal(char[] value) throws CFException {
		 outTotal = serializeOutTotal(value);
	}   

	
	
	
	/**
	 * 	initializes Output
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setOutCardNumber(CONSTANTS.SPACE_16);
                     setOutServiceMm(0);
			setOutTotal(BigDecimal.ZERO);
   }

		public static int getOutputFieldLength() {
			return OUTPUT_LENGTH;
		}

}
  
