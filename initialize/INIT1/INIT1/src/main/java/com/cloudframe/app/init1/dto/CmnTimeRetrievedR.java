package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeRetrievedR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeRetrievedR extends CmnTimeRetrievedRSerialized { 
   

						private char[] cmnTimeRetHh = Field.fillLowValue(2);

						private char[] cmnTimeRetSep1 = Field.fillLowValue(1);

						private char[] cmnTimeRetMm = Field.fillLowValue(2);

						private char[] cmnTimeRetSep2 = Field.fillLowValue(1);

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
	 *	Returns the value of cmnTimeRetHh
	 *	@return cmnTimeRetHh
	 */
   public char[] getCmnTimeRetHh() throws CFException{
     if (isCmnTimeRetHhModified()) { 
        cmnTimeRetHh = refreshCmnTimeRetHh();
     }
   		return cmnTimeRetHh;
   }

  
	/**
	*  set variable cmnTimeRetHh
	*  Corresponding COBOL Variable is CMN-TIME-RET-HH
	*  @param value
	**/
   public void setCmnTimeRetHh(char[] value) {
      cmnTimeRetHh = checkCmnTimeRetHhConstraints(value);
      serializeCmnTimeRetHh(cmnTimeRetHh);
   } 

     /**
	 * 	Update CmnTimeRetHh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetHh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetHh,cmnTimeRetHh.length);
   	
   }
   
   public void setCmnTimeRetHh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetHh,cmnTimeRetHh.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetHh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetHh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetHh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetHh with another Field
	 *	@param value
	 */
   public void setCmnTimeRetHh(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetHh,CMN_TIME_RET_HH_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetHh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetHh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetHh,CMN_TIME_RET_HH_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetHh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetHh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetHh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetSep1
	 *	@return cmnTimeRetSep1
	 */
   public char[] getCmnTimeRetSep1() throws CFException{
     if (isCmnTimeRetSep1Modified()) { 
        cmnTimeRetSep1 = refreshCmnTimeRetSep1();
     }
   		return cmnTimeRetSep1;
   }

  
	/**
	*  set variable cmnTimeRetSep1
	*  Corresponding COBOL Variable is CMN-TIME-RET-SEP-1
	*  @param value
	**/
   public void setCmnTimeRetSep1(char[] value) {
      cmnTimeRetSep1 = checkCmnTimeRetSep1Constraints(value);
      serializeCmnTimeRetSep1(cmnTimeRetSep1);
   } 

     /**
	 * 	Update CmnTimeRetSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetSep1,cmnTimeRetSep1.length);
   	
   }
   
   public void setCmnTimeRetSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep1,cmnTimeRetSep1.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetSep1 with another Field
	 *	@param value
	 */
   public void setCmnTimeRetSep1(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetSep1,CMN_TIME_RET_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep1,CMN_TIME_RET_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetMm
	 *	@return cmnTimeRetMm
	 */
   public char[] getCmnTimeRetMm() throws CFException{
     if (isCmnTimeRetMmModified()) { 
        cmnTimeRetMm = refreshCmnTimeRetMm();
     }
   		return cmnTimeRetMm;
   }

  
	/**
	*  set variable cmnTimeRetMm
	*  Corresponding COBOL Variable is CMN-TIME-RET-MM
	*  @param value
	**/
   public void setCmnTimeRetMm(char[] value) {
      cmnTimeRetMm = checkCmnTimeRetMmConstraints(value);
      serializeCmnTimeRetMm(cmnTimeRetMm);
   } 

     /**
	 * 	Update CmnTimeRetMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetMm,cmnTimeRetMm.length);
   	
   }
   
   public void setCmnTimeRetMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetMm,cmnTimeRetMm.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetMm with another Field
	 *	@param value
	 */
   public void setCmnTimeRetMm(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetMm,CMN_TIME_RET_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetMm,CMN_TIME_RET_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnTimeRetSep2
	 *	@return cmnTimeRetSep2
	 */
   public char[] getCmnTimeRetSep2() throws CFException{
     if (isCmnTimeRetSep2Modified()) { 
        cmnTimeRetSep2 = refreshCmnTimeRetSep2();
     }
   		return cmnTimeRetSep2;
   }

  
	/**
	*  set variable cmnTimeRetSep2
	*  Corresponding COBOL Variable is CMN-TIME-RET-SEP-2
	*  @param value
	**/
   public void setCmnTimeRetSep2(char[] value) {
      cmnTimeRetSep2 = checkCmnTimeRetSep2Constraints(value);
      serializeCmnTimeRetSep2(cmnTimeRetSep2);
   } 

     /**
	 * 	Update CmnTimeRetSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeRetSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnTimeRetSep2,cmnTimeRetSep2.length);
   	
   }
   
   public void setCmnTimeRetSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep2,cmnTimeRetSep2.length);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnTimeRetSep2 with another Field
	 *	@param value
	 */
   public void setCmnTimeRetSep2(Field source) {
       replace(source,0,source.length(),beginCmnTimeRetSep2,CMN_TIME_RET_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnTimeRetSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnTimeRetSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep2,CMN_TIME_RET_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnTimeRetSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeRetSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnTimeRetSep2+targetIndex,targetLen);
    
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
  
