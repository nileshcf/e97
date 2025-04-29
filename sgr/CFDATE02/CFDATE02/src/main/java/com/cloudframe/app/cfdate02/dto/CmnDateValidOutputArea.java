package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateValidOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateValidOutputArea extends CmnDateValidOutputAreaSerialized { 
   

								private long cmnDateValid;
				private CmnDateValidR cmnDateValidR = new CmnDateValidR();
	
	/**
	* Constructor for CmnDateValidOutputArea
	**/
    public CmnDateValidOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateValidOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateValidR.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnDateValid
	 *	@return cmnDateValid
	 */
	public long getCmnDateValid() throws CFException {
       if (isCmnDateValidModified()) { 
           cmnDateValid = refreshCmnDateValid();
        }
   		return cmnDateValid;
	}
	

	
	   
	/**
	 * 	Update CmnDateValid with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID
	 *	@param number
	 */
	public void setCmnDateValid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValid = checkCmnDateValidMaxLimit(number); 
		serializeCmnDateValid(cmnDateValid);
	}
	

	/**
	 * 	Update CmnDateValid with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValid(char[] value) throws CFException {
		 cmnDateValid = serializeCmnDateValid(value);
	}
	/**
	 * 	Update CmnDateValid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidString(char[] value) throws CFException {
		 setCmnDateValid(value);
	}
	/**
	 *	Returns the value of cmnDateValidR
	 *	@return cmnDateValidR
	 */   
	 public CmnDateValidR getCmnDateValidR() {
   	return cmnDateValidR;
   }
   /**
	* 	Update CmnDateValidR with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-VALID-R
	*	@param value
	*/
   public void setCmnDateValidR(char[] value) {
      cmnDateValidR.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateValidR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin,cmnDateValidR.length());
   }
   
     /**
	 * 	Update CmnDateValidR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateValidR with another Field
	 *	@param value
	 */
   public void setCmnDateValidR(Field source) {
   	replace(source,0,source.length(),cmnDateValidR.begin,cmnDateValidR.length());
   }  
   
     /**
	 * 	Update CmnDateValidR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateValidR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin,cmnDateValidR.length());
   }
   
     /**
	 * 	Update CmnDateValidR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateValidR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateValidR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateValidOutputAreaFieldLength() {
			return CMN_DATE_VALID_OUTPUT_AREA_LENGTH;
		}

}
  
