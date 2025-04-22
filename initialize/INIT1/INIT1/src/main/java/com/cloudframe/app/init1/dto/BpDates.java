package com.cloudframe.app.init1.dto;

/**
*  The class BpDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BpDates extends BpDatesSerialized { 
   
				private StartDt startDt = new StartDt();
				private EndDt endDt = new EndDt();

								private long startDtIso;

								private long endDtIso;
	
	/**
	* Constructor for BpDates
	**/
    public BpDates() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BpDates. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BpDates(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			startDt.setParent(this,getStartOffset() + 0);
	       			endDt.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of startDt
	 *	@return startDt
	 */   
	 public StartDt getStartDt() {
   	return startDt;
   }
   /**
	* 	Update StartDt with the passed value
	*   Corresponding COBOL Variable is WS-START-DT
	*	@param value
	*/
   public void setStartDt(char[] value) {
      startDt.setString(value); 
   }   
    
     /**
	 * 	Update StartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStartDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,startDt.begin,startDt.length());
   }
   
     /**
	 * 	Update StartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,startDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StartDt with another Field
	 *	@param value
	 */
   public void setStartDt(Field source) {
   	replace(source,0,source.length(),startDt.begin,startDt.length());
   }  
   
     /**
	 * 	Update StartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStartDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,startDt.begin,startDt.length());
   }
   
     /**
	 * 	Update StartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,startDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of endDt
	 *	@return endDt
	 */   
	 public EndDt getEndDt() {
   	return endDt;
   }
   /**
	* 	Update EndDt with the passed value
	*   Corresponding COBOL Variable is WS-END-DT
	*	@param value
	*/
   public void setEndDt(char[] value) {
      endDt.setString(value); 
   }   
    
     /**
	 * 	Update EndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,endDt.begin,endDt.length());
   }
   
     /**
	 * 	Update EndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,endDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EndDt with another Field
	 *	@param value
	 */
   public void setEndDt(Field source) {
   	replace(source,0,source.length(),endDt.begin,endDt.length());
   }  
   
     /**
	 * 	Update EndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,endDt.begin,endDt.length());
   }
   
     /**
	 * 	Update EndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,endDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of startDtIso
	 *	@return startDtIso
	 */
	public long getStartDtIso() throws CFException {
       if (isStartDtIsoModified()) { 
           startDtIso = refreshStartDtIso();
        }
   		return startDtIso;
	}
	

	
	   
	/**
	 * 	Update StartDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-START-DT-ISO
	 *	@param number
	 */
	public void setStartDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    startDtIso = checkStartDtIsoMaxLimit(number); 
		serializeStartDtIso(startDtIso);
	}
	

	/**
	 * 	Update StartDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setStartDtIso(char[] value) throws CFException {
		 startDtIso = serializeStartDtIso(value);
	}
	/**
	 * 	Update StartDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStartDtIsoString(char[] value) throws CFException {
		 setStartDtIso(value);
	}
	/**
	 *	Returns the value of endDtIso
	 *	@return endDtIso
	 */
	public long getEndDtIso() throws CFException {
       if (isEndDtIsoModified()) { 
           endDtIso = refreshEndDtIso();
        }
   		return endDtIso;
	}
	

	
	   
	/**
	 * 	Update EndDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-END-DT-ISO
	 *	@param number
	 */
	public void setEndDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    endDtIso = checkEndDtIsoMaxLimit(number); 
		serializeEndDtIso(endDtIso);
	}
	

	/**
	 * 	Update EndDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndDtIso(char[] value) throws CFException {
		 endDtIso = serializeEndDtIso(value);
	}
	/**
	 * 	Update EndDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndDtIsoString(char[] value) throws CFException {
		 setEndDtIso(value);
	}

	
	
	
	/**
	 * 	initializes BpDates
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          startDt.initialize();
     
          endDt.initialize();
     
                     setStartDtIso(0);
                     setEndDtIso(0);
   }

		public static int getBpDatesFieldLength() {
			return BP_DATES_LENGTH;
		}

}
  
