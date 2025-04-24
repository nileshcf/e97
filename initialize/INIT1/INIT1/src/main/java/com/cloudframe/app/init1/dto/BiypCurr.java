package com.cloudframe.app.init1.dto;

/**
*  The class BiypCurr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiypCurr extends BiypCurrSerialized { 
   

						private char[] wsbiypDatesCurr = new char[20];

								private int wsbiypDiscntIdCurr;
	
	/**
	* Constructor for BiypCurr
	**/
    public BiypCurr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BiypCurr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypCurr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsbiypDatesCurr(fillSpace(20));
								setWsbiypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of wsbiypDatesCurr
	 *	@return wsbiypDatesCurr
	 */
   public char[] getWsbiypDatesCurr() throws CFException{
     if (isWsbiypDatesCurrModified()) { 
        wsbiypDatesCurr = refreshWsbiypDatesCurr();
     }
   		return wsbiypDatesCurr;
   }

  
	/**
	*  set variable wsbiypDatesCurr
	*  Corresponding COBOL Variable is WSBIYP-DATES-CURR
	*  @param value
	**/
   public void setWsbiypDatesCurr(char[] value) {
      wsbiypDatesCurr = checkWsbiypDatesCurrConstraints(value);
      serializeWsbiypDatesCurr(wsbiypDatesCurr);
   } 

     /**
	 * 	Update WsbiypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsbiypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsbiypDatesCurr,wsbiypDatesCurr.length);
   	
   }
   
   public void setWsbiypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesCurr,wsbiypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update WsbiypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsbiypDatesCurr with another Field
	 *	@param value
	 */
   public void setWsbiypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWsbiypDatesCurr,WSBIYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update WsbiypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsbiypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsbiypDatesCurr,WSBIYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update WsbiypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsbiypDiscntIdCurr
	 *	@return wsbiypDiscntIdCurr
	 */
	public int getWsbiypDiscntIdCurr() throws CFException {
        if (isWsbiypDiscntIdCurrModified()) { 
           wsbiypDiscntIdCurr = refreshWsbiypDiscntIdCurr();
        }
   		return wsbiypDiscntIdCurr;
	}
	
	/**
	 * 	Update WsbiypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WSBIYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWsbiypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wsbiypDiscntIdCurr = checkWsbiypDiscntIdCurrMaxLimit(number); 
		serializeWsbiypDiscntIdCurr(wsbiypDiscntIdCurr);
	}


	public void setWsbiypDiscntIdCurr(long number) {
	    number = checkWsbiypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsbiypDiscntIdCurr((int)number);
	}
	

	
	
	

		public static int getBiypCurrFieldLength() {
			return BIYP_CURR_LENGTH;
		}

}
  
