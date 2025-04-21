package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fSuppressInd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlu5fSuppressInd extends Rlu5fSuppressIndSerialized { 
   

						private char[] rlu5fSupSectInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Rlu5fSuppressInd
	**/
    public Rlu5fSuppressInd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fSuppressInd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fSuppressInd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fSupSectInd
	 *	@return rlu5fSupSectInd
	 */
   public char[] getRlu5fSupSectInd() throws CFException{
     if (isRlu5fSupSectIndModified()) { 
        rlu5fSupSectInd = refreshRlu5fSupSectInd();
     }
   		return rlu5fSupSectInd;
   }

  
	/**
	*  set variable rlu5fSupSectInd
	*  Corresponding COBOL Variable is RLU5F-SUP-SECT-IND
	*  @param value
	**/
   public void setRlu5fSupSectInd(char[] value) {
      rlu5fSupSectInd = checkRlu5fSupSectIndConstraints(value);
      serializeRlu5fSupSectInd(rlu5fSupSectInd);
   } 

     /**
	 * 	Update Rlu5fSupSectInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlu5fSupSectInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlu5fSupSectInd,rlu5fSupSectInd.length);
   	
   }
   
   public void setRlu5fSupSectInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSupSectInd,rlu5fSupSectInd.length);
   	
   }
   
     /**
	 * 	Update Rlu5fSupSectInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSupSectInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSupSectInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlu5fSupSectInd with another Field
	 *	@param value
	 */
   public void setRlu5fSupSectInd(Field source) {
       replace(source,0,source.length(),beginRlu5fSupSectInd,RLU_5F_SUP_SECT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Rlu5fSupSectInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlu5fSupSectInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlu5fSupSectInd,RLU_5F_SUP_SECT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Rlu5fSupSectInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fSupSectInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlu5fSupSectInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlu5fSuppressInd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fSupSectInd(CONSTANTS.SPACE);
   }

		public static int getRlu5fSuppressIndFieldLength() {
			return RLU_5F_SUPPRESS_IND_LENGTH;
		}

}
  
