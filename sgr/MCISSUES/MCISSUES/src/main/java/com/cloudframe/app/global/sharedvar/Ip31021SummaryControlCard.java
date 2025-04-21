package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip31021SummaryControlCard is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip31021SummaryControlCard")

public class Ip31021SummaryControlCard extends Ip31021SummaryControlCardSerialized  implements InitializingBean {
   

						private char[] ip31021InputSource = Field.fillLowValue(10);

						private char[] ip31021SummarySif = Field.fillLowValue(1);

								private int ip31021SummaryCycle;

	
	/**
	* Constructor for Ip31021SummaryControlCard
	**/
    public Ip31021SummaryControlCard() {
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
	 *	Returns the value of ip31021InputSource
	 *	@return ip31021InputSource
	 */
   public char[] getIp31021InputSource() throws CFException{
     if (isIp31021InputSourceModified()) { 
        ip31021InputSource = refreshIp31021InputSource();
     }
   		return ip31021InputSource;
   }

  
	/**
	*  set variable ip31021InputSource
	*  Corresponding COBOL Variable is IP31021-INPUT-SOURCE
	*  @param value
	**/
   public void setIp31021InputSource(char[] value) {
      ip31021InputSource = checkIp31021InputSourceConstraints(value);
      serializeIp31021InputSource(ip31021InputSource);
   } 

     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp31021InputSource,ip31021InputSource.length);
   	
   }
   
   public void setIp31021InputSource(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021InputSource,ip31021InputSource.length);
   	
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021InputSource+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip31021InputSource with another Field
	 *	@param value
	 */
   public void setIp31021InputSource(Field source) {
       replace(source,0,source.length(),beginIp31021InputSource,IP_31021_INPUT_SOURCE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp31021InputSource,IP_31021_INPUT_SOURCE_LEN);
   	
   }
   
     /**
	 * 	Update Ip31021InputSource 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp31021InputSource(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021InputSource+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip31021SummarySif
	 *	@return ip31021SummarySif
	 */
   public char[] getIp31021SummarySif() throws CFException{
     if (isIp31021SummarySifModified()) { 
        ip31021SummarySif = refreshIp31021SummarySif();
     }
   		return ip31021SummarySif;
   }

  
	/**
	*  set variable ip31021SummarySif
	*  Corresponding COBOL Variable is IP31021-SUMMARY-SIF
	*  @param value
	**/
   public void setIp31021SummarySif(char[] value) {
      ip31021SummarySif = checkIp31021SummarySifConstraints(value);
      serializeIp31021SummarySif(ip31021SummarySif);
   } 

     /**
	 * 	Update Ip31021SummarySif 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp31021SummarySif(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp31021SummarySif,ip31021SummarySif.length);
   	
   }
   
   public void setIp31021SummarySif(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021SummarySif,ip31021SummarySif.length);
   	
   }
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp31021SummarySif(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021SummarySif+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip31021SummarySif with another Field
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source) {
       replace(source,0,source.length(),beginIp31021SummarySif,IP_31021_SUMMARY_SIF_LEN);
   	
   }  
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp31021SummarySif,IP_31021_SUMMARY_SIF_LEN);
   	
   }
   
     /**
	 * 	Update Ip31021SummarySif 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp31021SummarySif(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp31021SummarySif+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip31021SummaryCycle
	 *	@return ip31021SummaryCycle
	 */
	public int getIp31021SummaryCycle() throws CFException {
       if (isIp31021SummaryCycleModified()) { 
           ip31021SummaryCycle = refreshIp31021SummaryCycle();
        }
   		return ip31021SummaryCycle;
	}
	

	
	   
	/**
	 * 	Update Ip31021SummaryCycle with the passed value
	 *  Corresponding COBOL Variable is IP31021-SUMMARY-CYCLE
	 *	@param number
	 */
	public void setIp31021SummaryCycle(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip31021SummaryCycle = checkIp31021SummaryCycleMaxLimit(number); 
		serializeIp31021SummaryCycle(ip31021SummaryCycle);
	}
	

	public void setIp31021SummaryCycle(long number) {
	    number = checkIp31021SummaryCycleMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp31021SummaryCycle((int)number);
	}
	
	/**
	 * 	Update Ip31021SummaryCycle with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp31021SummaryCycle(char[] value) throws CFException {
		 ip31021SummaryCycle = serializeIp31021SummaryCycle(value);
	}
	/**
	 * 	Update Ip31021SummaryCycle with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp31021SummaryCycleString(char[] value) throws CFException {
		 setIp31021SummaryCycle(value);
	}

	
	
	
	/**
	 * 	initializes Ip31021SummaryControlCard
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp31021InputSource(CONSTANTS.SPACE_10);
         setIp31021SummarySif(CONSTANTS.SPACE);
                     setIp31021SummaryCycle(0);
   }

		public static int getIp31021SummaryControlCardFieldLength() {
			return IP_31021_SUMMARY_CONTROL_CARD_LENGTH;
		}

}
  
