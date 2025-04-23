package com.cloudframe.app.init1.dto;

/**
*  The class CmnIsoTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnIsoTime extends CmnIsoTimeSerialized { 
   

						private char[] cmnIsoTimeHh = Field.fillLowValue(2);

						private char[] cmnIsoTimeSep1 = Field.fillLowValue(1);

						private char[] cmnIsoTimeMm = Field.fillLowValue(2);

						private char[] cmnIsoTimeSep101 = Field.fillLowValue(1);

						private char[] cmnIsoTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnIsoTime
	**/
    public CmnIsoTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnIsoTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnIsoTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnIsoTimeHh
	 *	@return cmnIsoTimeHh
	 */
   public char[] getCmnIsoTimeHh() throws CFException{
     if (isCmnIsoTimeHhModified()) { 
        cmnIsoTimeHh = refreshCmnIsoTimeHh();
     }
   		return cmnIsoTimeHh;
   }

  
	/**
	*  set variable cmnIsoTimeHh
	*  Corresponding COBOL Variable is CMN-ISO-TIME-HH
	*  @param value
	**/
   public void setCmnIsoTimeHh(char[] value) {
      cmnIsoTimeHh = checkCmnIsoTimeHhConstraints(value);
      serializeCmnIsoTimeHh(cmnIsoTimeHh);
   } 

     /**
	 * 	Update CmnIsoTimeHh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTimeHh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnIsoTimeHh,cmnIsoTimeHh.length);
   	
   }
   
   public void setCmnIsoTimeHh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeHh,cmnIsoTimeHh.length);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeHh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeHh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeHh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnIsoTimeHh with another Field
	 *	@param value
	 */
   public void setCmnIsoTimeHh(Field source) {
       replace(source,0,source.length(),beginCmnIsoTimeHh,CMN_ISO_TIME_HH_LEN);
   	
   }  
   
     /**
	 * 	Update CmnIsoTimeHh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnIsoTimeHh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnIsoTimeHh,CMN_ISO_TIME_HH_LEN);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeHh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeHh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeHh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnIsoTimeSep1
	 *	@return cmnIsoTimeSep1
	 */
   public char[] getCmnIsoTimeSep1() throws CFException{
     if (isCmnIsoTimeSep1Modified()) { 
        cmnIsoTimeSep1 = refreshCmnIsoTimeSep1();
     }
   		return cmnIsoTimeSep1;
   }

  
	/**
	*  set variable cmnIsoTimeSep1
	*  Corresponding COBOL Variable is CMN-ISO-TIME-SEP1
	*  @param value
	**/
   public void setCmnIsoTimeSep1(char[] value) {
      cmnIsoTimeSep1 = checkCmnIsoTimeSep1Constraints(value);
      serializeCmnIsoTimeSep1(cmnIsoTimeSep1);
   } 

     /**
	 * 	Update CmnIsoTimeSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTimeSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnIsoTimeSep1,cmnIsoTimeSep1.length);
   	
   }
   
   public void setCmnIsoTimeSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep1,cmnIsoTimeSep1.length);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnIsoTimeSep1 with another Field
	 *	@param value
	 */
   public void setCmnIsoTimeSep1(Field source) {
       replace(source,0,source.length(),beginCmnIsoTimeSep1,CMN_ISO_TIME_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnIsoTimeSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnIsoTimeSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep1,CMN_ISO_TIME_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnIsoTimeMm
	 *	@return cmnIsoTimeMm
	 */
   public char[] getCmnIsoTimeMm() throws CFException{
     if (isCmnIsoTimeMmModified()) { 
        cmnIsoTimeMm = refreshCmnIsoTimeMm();
     }
   		return cmnIsoTimeMm;
   }

  
	/**
	*  set variable cmnIsoTimeMm
	*  Corresponding COBOL Variable is CMN-ISO-TIME-MM
	*  @param value
	**/
   public void setCmnIsoTimeMm(char[] value) {
      cmnIsoTimeMm = checkCmnIsoTimeMmConstraints(value);
      serializeCmnIsoTimeMm(cmnIsoTimeMm);
   } 

     /**
	 * 	Update CmnIsoTimeMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTimeMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnIsoTimeMm,cmnIsoTimeMm.length);
   	
   }
   
   public void setCmnIsoTimeMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeMm,cmnIsoTimeMm.length);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnIsoTimeMm with another Field
	 *	@param value
	 */
   public void setCmnIsoTimeMm(Field source) {
       replace(source,0,source.length(),beginCmnIsoTimeMm,CMN_ISO_TIME_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnIsoTimeMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnIsoTimeMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnIsoTimeMm,CMN_ISO_TIME_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnIsoTimeSep101
	 *	@return cmnIsoTimeSep101
	 */
   public char[] getCmnIsoTimeSep101() throws CFException{
     if (isCmnIsoTimeSep101Modified()) { 
        cmnIsoTimeSep101 = refreshCmnIsoTimeSep101();
     }
   		return cmnIsoTimeSep101;
   }

  
	/**
	*  set variable cmnIsoTimeSep101
	*  Corresponding COBOL Variable is CMN-ISO-TIME-SEP1
	*  @param value
	**/
   public void setCmnIsoTimeSep101(char[] value) {
      cmnIsoTimeSep101 = checkCmnIsoTimeSep101Constraints(value);
      serializeCmnIsoTimeSep101(cmnIsoTimeSep101);
   } 

     /**
	 * 	Update CmnIsoTimeSep101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTimeSep101(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnIsoTimeSep101,cmnIsoTimeSep101.length);
   	
   }
   
   public void setCmnIsoTimeSep101(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep101,cmnIsoTimeSep101.length);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSep101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSep101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep101+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnIsoTimeSep101 with another Field
	 *	@param value
	 */
   public void setCmnIsoTimeSep101(Field source) {
       replace(source,0,source.length(),beginCmnIsoTimeSep101,CMN_ISO_TIME_SEP_101_LEN);
   	
   }  
   
     /**
	 * 	Update CmnIsoTimeSep101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnIsoTimeSep101(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep101,CMN_ISO_TIME_SEP_101_LEN);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSep101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSep101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSep101+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnIsoTimeSs
	 *	@return cmnIsoTimeSs
	 */
   public char[] getCmnIsoTimeSs() throws CFException{
     if (isCmnIsoTimeSsModified()) { 
        cmnIsoTimeSs = refreshCmnIsoTimeSs();
     }
   		return cmnIsoTimeSs;
   }

  
	/**
	*  set variable cmnIsoTimeSs
	*  Corresponding COBOL Variable is CMN-ISO-TIME-SS
	*  @param value
	**/
   public void setCmnIsoTimeSs(char[] value) {
      cmnIsoTimeSs = checkCmnIsoTimeSsConstraints(value);
      serializeCmnIsoTimeSs(cmnIsoTimeSs);
   } 

     /**
	 * 	Update CmnIsoTimeSs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTimeSs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnIsoTimeSs,cmnIsoTimeSs.length);
   	
   }
   
   public void setCmnIsoTimeSs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSs,cmnIsoTimeSs.length);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnIsoTimeSs with another Field
	 *	@param value
	 */
   public void setCmnIsoTimeSs(Field source) {
       replace(source,0,source.length(),beginCmnIsoTimeSs,CMN_ISO_TIME_SS_LEN);
   	
   }  
   
     /**
	 * 	Update CmnIsoTimeSs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnIsoTimeSs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSs,CMN_ISO_TIME_SS_LEN);
   	
   }
   
     /**
	 * 	Update CmnIsoTimeSs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTimeSs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnIsoTimeSs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnIsoTimeFieldLength() {
			return CMN_ISO_TIME_LENGTH;
		}

}
  
