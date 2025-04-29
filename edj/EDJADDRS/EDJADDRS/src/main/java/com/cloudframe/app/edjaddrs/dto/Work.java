package com.cloudframe.app.edjaddrs.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.edjaddrs.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private char[] numericZs = Field.fillLowValue(18);

								private int cce;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCce(0);
    }


 

	/**
	 *	Returns the value of numericZs
	 *	@return numericZs
	 */
   public char[] getNumericZs() throws CFException{
     if (isNumericZsModified()) { 
        numericZs = refreshNumericZs();
     }
   		return numericZs;
   }

  
	/**
	*  set variable numericZs
	*  Corresponding COBOL Variable is NUMERIC-ZS
	*  @param value
	**/
   public void setNumericZs(char[] value) {
      numericZs = checkNumericZsConstraints(value);
      serializeNumericZs(numericZs);
   } 

     /**
	 * 	Update NumericZs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumericZs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNumericZs,numericZs.length);
   	
   }
   
   public void setNumericZs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNumericZs,numericZs.length);
   	
   }
   
     /**
	 * 	Update NumericZs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumericZs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericZs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NumericZs with another Field
	 *	@param value
	 */
   public void setNumericZs(Field source) {
       replace(source,0,source.length(),beginNumericZs,NUMERIC_ZS_LEN);
   	
   }  
   
     /**
	 * 	Update NumericZs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumericZs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNumericZs,NUMERIC_ZS_LEN);
   	
   }
   
     /**
	 * 	Update NumericZs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumericZs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericZs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cce
	 *	@return cce
	 */
	public int getCce() throws CFException {
       if (isCceModified()) { 
           cce = refreshCce();
        }
   		return cce;
	}
	

	
	   
	/**
	 * 	Update Cce with the passed value
	 *  Corresponding COBOL Variable is CCE
	 *	@param number
	 */
	public void setCce(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cce = checkCceMaxLimit(number); 
		serializeCce(cce);
	}
	

	public void setCce(long number) {
	    number = checkCceMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCce((int)number);
	}
	
	/**
	 * 	Update Cce with the passed value
	 *	@param value (String or char[])
	 */
	public void setCce(char[] value) throws CFException {
		 cce = serializeCce(value);
	}
	/**
	 * 	Update Cce with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCceString(char[] value) throws CFException {
		 setCce(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
