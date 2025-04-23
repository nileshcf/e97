package com.cloudframe.app.init1.dto;

/**
*  The class BiypPrior is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiypPrior extends BiypPriorSerialized { 
   

						private char[] wsbiypDatesPrior = new char[20];

								private int wsbiypDiscntIdPrior;
	
	/**
	* Constructor for BiypPrior
	**/
    public BiypPrior() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BiypPrior. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypPrior(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsbiypDatesPrior(fillSpace(20));
								setWsbiypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of wsbiypDatesPrior
	 *	@return wsbiypDatesPrior
	 */
   public char[] getWsbiypDatesPrior() throws CFException{
     if (isWsbiypDatesPriorModified()) { 
        wsbiypDatesPrior = refreshWsbiypDatesPrior();
     }
   		return wsbiypDatesPrior;
   }

  
	/**
	*  set variable wsbiypDatesPrior
	*  Corresponding COBOL Variable is WSBIYP-DATES-PRIOR
	*  @param value
	**/
   public void setWsbiypDatesPrior(char[] value) {
      wsbiypDatesPrior = checkWsbiypDatesPriorConstraints(value);
      serializeWsbiypDatesPrior(wsbiypDatesPrior);
   } 

     /**
	 * 	Update WsbiypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsbiypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsbiypDatesPrior,wsbiypDatesPrior.length);
   	
   }
   
   public void setWsbiypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesPrior,wsbiypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update WsbiypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsbiypDatesPrior with another Field
	 *	@param value
	 */
   public void setWsbiypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWsbiypDatesPrior,WSBIYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update WsbiypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsbiypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsbiypDatesPrior,WSBIYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update WsbiypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsbiypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsbiypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsbiypDiscntIdPrior
	 *	@return wsbiypDiscntIdPrior
	 */
	public int getWsbiypDiscntIdPrior() throws CFException {
        if (isWsbiypDiscntIdPriorModified()) { 
           wsbiypDiscntIdPrior = refreshWsbiypDiscntIdPrior();
        }
   		return wsbiypDiscntIdPrior;
	}
	
	/**
	 * 	Update WsbiypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WSBIYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWsbiypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wsbiypDiscntIdPrior = checkWsbiypDiscntIdPriorMaxLimit(number); 
		serializeWsbiypDiscntIdPrior(wsbiypDiscntIdPrior);
	}


	public void setWsbiypDiscntIdPrior(long number) {
	    number = checkWsbiypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsbiypDiscntIdPrior((int)number);
	}
	

	
	
	

		public static int getBiypPriorFieldLength() {
			return BIYP_PRIOR_LENGTH;
		}

}
  
