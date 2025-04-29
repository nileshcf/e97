package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateTimeOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateTimeOutputArea extends CmnDateTimeOutputAreaSerialized { 
   

						private char[] cmnDateRetrieved = Field.fillLowValue(10);

						private char[] cmnDateRetrievedR = Field.fillLowValue(10);

						private char[] cmnTimeRetrieved = Field.fillLowValue(8);
				private CmnTimeRetrievedR cmnTimeRetrievedR = new CmnTimeRetrievedR();
	
	/**
	* Constructor for CmnDateTimeOutputArea
	**/
    public CmnDateTimeOutputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateTimeOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateTimeOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeRetrievedR.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of cmnDateRetrieved
	 *	@return cmnDateRetrieved
	 */
   public char[] getCmnDateRetrieved() throws CFException{
     if (isCmnDateRetrievedModified()) { 
        cmnDateRetrieved = refreshCmnDateRetrieved();
     }
   		return cmnDateRetrieved;
   }

  
	/**
	*  set variable cmnDateRetrieved
	*  Corresponding COBOL Variable is CMN-DATE-RETRIEVED
	*  @param value
	**/
   public void setCmnDateRetrieved(char[] value) {
      cmnDateRetrieved = checkCmnDateRetrievedConstraints(value);
      serializeCmnDateRetrieved(cmnDateRetrieved);
   } 

     /**
	 * 	Update CmnDateRetrieved 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetrieved(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetrieved,cmnDateRetrieved.length);
   	
   }
   
   public void setCmnDateRetrieved(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved,cmnDateRetrieved.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrieved(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetrieved with another Field
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source) {
       replace(source,0,source.length(),beginCmnDateRetrieved,CMN_DATE_RETRIEVED_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved,CMN_DATE_RETRIEVED_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetrieved 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrieved(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrieved+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateRetrievedR
	 *	@return cmnDateRetrievedR
	 */
   public char[] getCmnDateRetrievedR() throws CFException{
     if (isCmnDateRetrievedRModified()) { 
        cmnDateRetrievedR = refreshCmnDateRetrievedR();
     }
   		return cmnDateRetrievedR;
   }

  
	/**
	*  set variable cmnDateRetrievedR
	*  Corresponding COBOL Variable is CMN-DATE-RETRIEVED-R
	*  @param value
	**/
   public void setCmnDateRetrievedR(char[] value) {
      cmnDateRetrievedR = checkCmnDateRetrievedRConstraints(value);
      serializeCmnDateRetrievedR(cmnDateRetrievedR);
   } 

     /**
	 * 	Update CmnDateRetrievedR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateRetrievedR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateRetrievedR,cmnDateRetrievedR.length);
   	
   }
   
   public void setCmnDateRetrievedR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrievedR,cmnDateRetrievedR.length);
   	
   }
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrievedR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrievedR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateRetrievedR with another Field
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source) {
       replace(source,0,source.length(),beginCmnDateRetrievedR,CMN_DATE_RETRIEVED_R_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateRetrievedR,CMN_DATE_RETRIEVED_R_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateRetrievedR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateRetrievedR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateRetrievedR+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetrieved
	 *	@return cmnTimeRetrieved
	 */
   public char[] getCmnTimeRetrieved() throws CFException{
     if (isCmnTimeRetrievedModified()) { 
        cmnTimeRetrieved = refreshCmnTimeRetrieved();
     }
   		return cmnTimeRetrieved;
   }

  
	/**
	*  set variable cmnTimeRetrieved
	*  Corresponding COBOL Variable is CMN-TIME-RETRIEVED
	*  @param value
	**/
   public void setCmnTimeRetrieved(char[] value) {
      cmnTimeRetrieved = checkCmnTimeRetrievedConstraints(value);
      serializeCmnTimeRetrieved(cmnTimeRetrieved);
   } 

     /**
	 * 	Update CmnTimeRetrieved 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrieved(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetrieved,cmnTimeRetrieved.length);
   	
   }
   
   public void setCmnTimeRetrieved(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved,cmnTimeRetrieved.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrieved(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetrieved with another Field
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetrieved,CMN_TIME_RETRIEVED_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved,CMN_TIME_RETRIEVED_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetrieved 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrieved(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetrieved+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetrievedR
	 *	@return cmnTimeRetrievedR
	 */   
	 public CmnTimeRetrievedR getCmnTimeRetrievedR() {
   	return cmnTimeRetrievedR;
   }
   /**
	* 	Update CmnTimeRetrievedR with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-RETRIEVED-R
	*	@param value
	*/
   public void setCmnTimeRetrievedR(char[] value) {
      cmnTimeRetrievedR.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeRetrievedR with another Field
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source) {
   	replace(source,0,source.length(),cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }  
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin,cmnTimeRetrievedR.length());
   }
   
     /**
	 * 	Update CmnTimeRetrievedR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetrievedR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeRetrievedR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateTimeOutputAreaFieldLength() {
			return CMN_DATE_TIME_OUTPUT_AREA_LENGTH;
		}

}
  
