package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf50005ClearingGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_cf50005ClearingGrp")

public class Cf50005ClearingGrp extends Cf50005ClearingGrpSerialized  implements InitializingBean {
   

						private char[] cf50005ClearingDtX = Field.fillLowValue(8);

								private long cf50005ClearingDtN;

						private char[] cf50005ClearingTmX = Field.fillLowValue(2);
	
	/**
	* Constructor for Cf50005ClearingGrp
	**/
    public Cf50005ClearingGrp() {
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
	 *	Returns the value of cf50005ClearingDtX
	 *	@return cf50005ClearingDtX
	 */
   public char[] getCf50005ClearingDtX() throws CFException{
     if (isCf50005ClearingDtXModified()) { 
        cf50005ClearingDtX = refreshCf50005ClearingDtX();
     }
   		return cf50005ClearingDtX;
   }

  
	/**
	*  set variable cf50005ClearingDtX
	*  Corresponding COBOL Variable is CF50005-CLEARING-DT-X
	*  @param value
	**/
   public void setCf50005ClearingDtX(char[] value) {
      cf50005ClearingDtX = checkCf50005ClearingDtXConstraints(value);
      serializeCf50005ClearingDtX(cf50005ClearingDtX);
   } 

     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf50005ClearingDtX,cf50005ClearingDtX.length);
   	
   }
   
   public void setCf50005ClearingDtX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingDtX,cf50005ClearingDtX.length);
   	
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingDtX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf50005ClearingDtX with another Field
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source) {
       replace(source,0,source.length(),beginCf50005ClearingDtX,CF_50005_CLEARING_DT_X_LEN);
   	
   }  
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf50005ClearingDtX,CF_50005_CLEARING_DT_X_LEN);
   	
   }
   
     /**
	 * 	Update Cf50005ClearingDtX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingDtX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingDtX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cf50005ClearingDtN
	 *	@return cf50005ClearingDtN
	 */
	public long getCf50005ClearingDtN() throws CFException {
       if (isCf50005ClearingDtNModified()) { 
           cf50005ClearingDtN = refreshCf50005ClearingDtN();
        }
   		return cf50005ClearingDtN;
	}
	

	
	   
	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *  Corresponding COBOL Variable is CF50005-CLEARING-DT-N
	 *	@param number
	 */
	public void setCf50005ClearingDtN(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cf50005ClearingDtN = checkCf50005ClearingDtNMaxLimit(number); 
		serializeCf50005ClearingDtN(cf50005ClearingDtN);
	}
	

	/**
	 * 	Update Cf50005ClearingDtN with the passed value
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtN(char[] value) throws CFException {
		 cf50005ClearingDtN = serializeCf50005ClearingDtN(value);
	}
	/**
	 * 	Update Cf50005ClearingDtN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCf50005ClearingDtNString(char[] value) throws CFException {
		 setCf50005ClearingDtN(value);
	}
	/**
	 *	Returns the value of cf50005ClearingTmX
	 *	@return cf50005ClearingTmX
	 */
   public char[] getCf50005ClearingTmX() throws CFException{
     if (isCf50005ClearingTmXModified()) { 
        cf50005ClearingTmX = refreshCf50005ClearingTmX();
     }
   		return cf50005ClearingTmX;
   }

  
	/**
	*  set variable cf50005ClearingTmX
	*  Corresponding COBOL Variable is CF50005-CLEARING-TM-X
	*  @param value
	**/
   public void setCf50005ClearingTmX(char[] value) {
      cf50005ClearingTmX = checkCf50005ClearingTmXConstraints(value);
      serializeCf50005ClearingTmX(cf50005ClearingTmX);
   } 

     /**
	 * 	Update Cf50005ClearingTmX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf50005ClearingTmX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf50005ClearingTmX,cf50005ClearingTmX.length);
   	
   }
   
   public void setCf50005ClearingTmX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingTmX,cf50005ClearingTmX.length);
   	
   }
   
     /**
	 * 	Update Cf50005ClearingTmX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingTmX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingTmX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf50005ClearingTmX with another Field
	 *	@param value
	 */
   public void setCf50005ClearingTmX(Field source) {
       replace(source,0,source.length(),beginCf50005ClearingTmX,CF_50005_CLEARING_TM_X_LEN);
   	
   }  
   
     /**
	 * 	Update Cf50005ClearingTmX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf50005ClearingTmX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf50005ClearingTmX,CF_50005_CLEARING_TM_X_LEN);
   	
   }
   
     /**
	 * 	Update Cf50005ClearingTmX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf50005ClearingTmX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf50005ClearingTmX+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Cf50005ClearingGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf50005ClearingDtX(CONSTANTS.SPACE_8);
         setCf50005ClearingTmX(CONSTANTS.SPACE_2);
   }

		public static int getCf50005ClearingGrpFieldLength() {
			return CF_50005_CLEARING_GRP_LENGTH;
		}

}
  
