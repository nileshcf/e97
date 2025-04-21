package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcOutputArea extends CmnTimeCalcOutputAreaSerialized { 
   

								private long cmnTimeCalcNewTime;
				private CmnTimeCalcNewTimeR cmnTimeCalcNewTimeR = new CmnTimeCalcNewTimeR();
	
	/**
	* Constructor for CmnTimeCalcOutputArea
	**/
    public CmnTimeCalcOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeCalcNewTimeR.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnTimeCalcNewTime
	 *	@return cmnTimeCalcNewTime
	 */
	public long getCmnTimeCalcNewTime() throws CFException {
       if (isCmnTimeCalcNewTimeModified()) { 
           cmnTimeCalcNewTime = refreshCmnTimeCalcNewTime();
        }
   		return cmnTimeCalcNewTime;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNewTime with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME
	 *	@param number
	 */
	public void setCmnTimeCalcNewTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNewTime = checkCmnTimeCalcNewTimeMaxLimit(number); 
		serializeCmnTimeCalcNewTime(cmnTimeCalcNewTime);
	}
	

	/**
	 * 	Update CmnTimeCalcNewTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTime(char[] value) throws CFException {
		 cmnTimeCalcNewTime = serializeCmnTimeCalcNewTime(value);
	}
	/**
	 * 	Update CmnTimeCalcNewTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeString(char[] value) throws CFException {
		 setCmnTimeCalcNewTime(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcNewTimeR
	 *	@return cmnTimeCalcNewTimeR
	 */   
	 public CmnTimeCalcNewTimeR getCmnTimeCalcNewTimeR() {
   	return cmnTimeCalcNewTimeR;
   }
   /**
	* 	Update CmnTimeCalcNewTimeR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME-R
	*	@param value
	*/
   public void setCmnTimeCalcNewTimeR(char[] value) {
      cmnTimeCalcNewTimeR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcNewTimeR with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin,cmnTimeCalcNewTimeR.length());
   }
   
     /**
	 * 	Update CmnTimeCalcNewTimeR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcNewTimeR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcNewTimeR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnTimeCalcOutputAreaFieldLength() {
			return CMN_TIME_CALC_OUTPUT_AREA_LENGTH;
		}

}
  
