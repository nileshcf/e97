package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcInputArea extends CmnTimeCalcInputAreaSerialized { 
   

								private long cmnTimeCalcStart;
				private CmnTimeCalcStartR cmnTimeCalcStartR = new CmnTimeCalcStartR();

								private long cmnTimeCalcEnd;
				private CmnTimeCalcEndR cmnTimeCalcEndR = new CmnTimeCalcEndR();
	
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

	
	
	

		public static int getCmnTimeCalcInputAreaFieldLength() {
			return CMN_TIME_CALC_INPUT_AREA_LENGTH;
		}

}
  
