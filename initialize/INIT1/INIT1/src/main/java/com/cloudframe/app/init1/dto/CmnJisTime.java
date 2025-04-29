package com.cloudframe.app.init1.dto;

/**
*  The class CmnJisTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnJisTime extends CmnJisTimeSerialized { 
   

						private char[] cmnJisTimeHh = Field.fillLowValue(2);

						private char[] cmnJisTimeSep1 = Field.fillLowValue(1);

						private char[] cmnJisTimeMm = Field.fillLowValue(2);

						private char[] cmnJisTimeSep101 = Field.fillLowValue(1);

						private char[] cmnJisTimeSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnJisTime
	**/
    public CmnJisTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnJisTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnJisTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnJisTimeHh
	 *	@return cmnJisTimeHh
	 */
   public char[] getCmnJisTimeHh() throws CFException{
     if (isCmnJisTimeHhModified()) { 
        cmnJisTimeHh = refreshCmnJisTimeHh();
     }
   		return cmnJisTimeHh;
   }

  
	/**
	*  set variable cmnJisTimeHh
	*  Corresponding COBOL Variable is CMN-JIS-TIME-HH
	*  @param value
	**/
   public void setCmnJisTimeHh(char[] value) {
      cmnJisTimeHh = checkCmnJisTimeHhConstraints(value);
      serializeCmnJisTimeHh(cmnJisTimeHh);
   } 

     /**
	 * 	Update CmnJisTimeHh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTimeHh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnJisTimeHh,cmnJisTimeHh.length);
   	
   }
   
   public void setCmnJisTimeHh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeHh,cmnJisTimeHh.length);
   	
   }
   
     /**
	 * 	Update CmnJisTimeHh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeHh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeHh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnJisTimeHh with another Field
	 *	@param value
	 */
   public void setCmnJisTimeHh(Field source) {
       replace(source,0,source.length(),beginCmnJisTimeHh,CMN_JIS_TIME_HH_LEN);
   	
   }  
   
     /**
	 * 	Update CmnJisTimeHh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnJisTimeHh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnJisTimeHh,CMN_JIS_TIME_HH_LEN);
   	
   }
   
     /**
	 * 	Update CmnJisTimeHh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeHh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeHh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnJisTimeSep1
	 *	@return cmnJisTimeSep1
	 */
   public char[] getCmnJisTimeSep1() throws CFException{
     if (isCmnJisTimeSep1Modified()) { 
        cmnJisTimeSep1 = refreshCmnJisTimeSep1();
     }
   		return cmnJisTimeSep1;
   }

  
	/**
	*  set variable cmnJisTimeSep1
	*  Corresponding COBOL Variable is CMN-JIS-TIME-SEP1
	*  @param value
	**/
   public void setCmnJisTimeSep1(char[] value) {
      cmnJisTimeSep1 = checkCmnJisTimeSep1Constraints(value);
      serializeCmnJisTimeSep1(cmnJisTimeSep1);
   } 

     /**
	 * 	Update CmnJisTimeSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTimeSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnJisTimeSep1,cmnJisTimeSep1.length);
   	
   }
   
   public void setCmnJisTimeSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep1,cmnJisTimeSep1.length);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnJisTimeSep1 with another Field
	 *	@param value
	 */
   public void setCmnJisTimeSep1(Field source) {
       replace(source,0,source.length(),beginCmnJisTimeSep1,CMN_JIS_TIME_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnJisTimeSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnJisTimeSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep1,CMN_JIS_TIME_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnJisTimeMm
	 *	@return cmnJisTimeMm
	 */
   public char[] getCmnJisTimeMm() throws CFException{
     if (isCmnJisTimeMmModified()) { 
        cmnJisTimeMm = refreshCmnJisTimeMm();
     }
   		return cmnJisTimeMm;
   }

  
	/**
	*  set variable cmnJisTimeMm
	*  Corresponding COBOL Variable is CMN-JIS-TIME-MM
	*  @param value
	**/
   public void setCmnJisTimeMm(char[] value) {
      cmnJisTimeMm = checkCmnJisTimeMmConstraints(value);
      serializeCmnJisTimeMm(cmnJisTimeMm);
   } 

     /**
	 * 	Update CmnJisTimeMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTimeMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnJisTimeMm,cmnJisTimeMm.length);
   	
   }
   
   public void setCmnJisTimeMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeMm,cmnJisTimeMm.length);
   	
   }
   
     /**
	 * 	Update CmnJisTimeMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnJisTimeMm with another Field
	 *	@param value
	 */
   public void setCmnJisTimeMm(Field source) {
       replace(source,0,source.length(),beginCmnJisTimeMm,CMN_JIS_TIME_MM_LEN);
   	
   }  
   
     /**
	 * 	Update CmnJisTimeMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnJisTimeMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnJisTimeMm,CMN_JIS_TIME_MM_LEN);
   	
   }
   
     /**
	 * 	Update CmnJisTimeMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnJisTimeSep101
	 *	@return cmnJisTimeSep101
	 */
   public char[] getCmnJisTimeSep101() throws CFException{
     if (isCmnJisTimeSep101Modified()) { 
        cmnJisTimeSep101 = refreshCmnJisTimeSep101();
     }
   		return cmnJisTimeSep101;
   }

  
	/**
	*  set variable cmnJisTimeSep101
	*  Corresponding COBOL Variable is CMN-JIS-TIME-SEP1
	*  @param value
	**/
   public void setCmnJisTimeSep101(char[] value) {
      cmnJisTimeSep101 = checkCmnJisTimeSep101Constraints(value);
      serializeCmnJisTimeSep101(cmnJisTimeSep101);
   } 

     /**
	 * 	Update CmnJisTimeSep101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTimeSep101(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnJisTimeSep101,cmnJisTimeSep101.length);
   	
   }
   
   public void setCmnJisTimeSep101(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep101,cmnJisTimeSep101.length);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSep101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSep101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep101+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnJisTimeSep101 with another Field
	 *	@param value
	 */
   public void setCmnJisTimeSep101(Field source) {
       replace(source,0,source.length(),beginCmnJisTimeSep101,CMN_JIS_TIME_SEP_101_LEN);
   	
   }  
   
     /**
	 * 	Update CmnJisTimeSep101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnJisTimeSep101(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep101,CMN_JIS_TIME_SEP_101_LEN);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSep101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSep101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSep101+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnJisTimeSs
	 *	@return cmnJisTimeSs
	 */
   public char[] getCmnJisTimeSs() throws CFException{
     if (isCmnJisTimeSsModified()) { 
        cmnJisTimeSs = refreshCmnJisTimeSs();
     }
   		return cmnJisTimeSs;
   }

  
	/**
	*  set variable cmnJisTimeSs
	*  Corresponding COBOL Variable is CMN-JIS-TIME-SS
	*  @param value
	**/
   public void setCmnJisTimeSs(char[] value) {
      cmnJisTimeSs = checkCmnJisTimeSsConstraints(value);
      serializeCmnJisTimeSs(cmnJisTimeSs);
   } 

     /**
	 * 	Update CmnJisTimeSs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTimeSs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnJisTimeSs,cmnJisTimeSs.length);
   	
   }
   
   public void setCmnJisTimeSs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSs,cmnJisTimeSs.length);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnJisTimeSs with another Field
	 *	@param value
	 */
   public void setCmnJisTimeSs(Field source) {
       replace(source,0,source.length(),beginCmnJisTimeSs,CMN_JIS_TIME_SS_LEN);
   	
   }  
   
     /**
	 * 	Update CmnJisTimeSs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnJisTimeSs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnJisTimeSs,CMN_JIS_TIME_SS_LEN);
   	
   }
   
     /**
	 * 	Update CmnJisTimeSs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTimeSs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnJisTimeSs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnJisTimeFieldLength() {
			return CMN_JIS_TIME_LENGTH;
		}

}
  
