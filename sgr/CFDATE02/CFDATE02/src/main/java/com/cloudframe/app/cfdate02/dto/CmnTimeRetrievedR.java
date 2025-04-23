package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeRetrievedR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeRetrievedR extends CmnTimeRetrievedRSerialized { 
   

						private char[] cmnTimeRetSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnTimeRetrievedR
	**/
    public CmnTimeRetrievedR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeRetrievedR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeRetrievedR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeRetSs
	 *	@return cmnTimeRetSs
	 */
   public char[] getCmnTimeRetSs() throws CFException{
     if (isCmnTimeRetSsModified()) { 
        cmnTimeRetSs = refreshCmnTimeRetSs();
     }
   		return cmnTimeRetSs;
   }

  
	/**
	*  set variable cmnTimeRetSs
	*  Corresponding COBOL Variable is CMN-TIME-RET-SS
	*  @param value
	**/
   public void setCmnTimeRetSs(char[] value) {
      cmnTimeRetSs = checkCmnTimeRetSsConstraints(value);
      serializeCmnTimeRetSs(cmnTimeRetSs);
   } 

     /**
	 * 	Update CmnTimeRetSs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetSs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetSs,cmnTimeRetSs.length);
   	
   }
   
   public void setCmnTimeRetSs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSs,cmnTimeRetSs.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetSs with another Field
	 *	@param value
	 */
   public void setCmnTimeRetSs(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetSs,CMN_TIME_RET_SS_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetSs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetSs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetSs,CMN_TIME_RET_SS_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnTimeRetrievedRFieldLength() {
			return CMN_TIME_RETRIEVED_R_LENGTH;
		}

}
  
