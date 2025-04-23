package com.cloudframe.app.db2set3.dto;

/**
*  The class Vars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.db2set3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Vars extends VarsSerialized {
   

						private char[] firstDayMnth = Field.fillLowValue(10);

						private char[] inputDate = Field.fillLowValue(10);

						private char[] effEndDateCalc = Field.fillLowValue(10);

						private char[] effEndDateBuild = Field.fillLowValue(10);

						private char[] lastDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Vars
	**/
    public Vars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of firstDayMnth
	 *	@return firstDayMnth
	 */
   public char[] getFirstDayMnth() throws CFException{
     if (isFirstDayMnthModified()) { 
        firstDayMnth = refreshFirstDayMnth();
     }
   		return firstDayMnth;
   }

  
	/**
	*  set variable firstDayMnth
	*  Corresponding COBOL Variable is WS-FIRST-DAY-MNTH
	*  @param value
	**/
   public void setFirstDayMnth(char[] value) {
      firstDayMnth = checkFirstDayMnthConstraints(value);
      serializeFirstDayMnth(firstDayMnth);
   } 

     /**
	 * 	Update FirstDayMnth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFirstDayMnth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFirstDayMnth,firstDayMnth.length);
   	
   }
   
   public void setFirstDayMnth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFirstDayMnth,firstDayMnth.length);
   	
   }
   
     /**
	 * 	Update FirstDayMnth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFirstDayMnth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFirstDayMnth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FirstDayMnth with another Field
	 *	@param value
	 */
   public void setFirstDayMnth(Field source) {
       replace(source,0,source.length(),beginFirstDayMnth,FIRST_DAY_MNTH_LEN);
   	
   }  
   
     /**
	 * 	Update FirstDayMnth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFirstDayMnth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFirstDayMnth,FIRST_DAY_MNTH_LEN);
   	
   }
   
     /**
	 * 	Update FirstDayMnth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFirstDayMnth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFirstDayMnth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputDate
	 *	@return inputDate
	 */
   public char[] getInputDate() throws CFException{
     if (isInputDateModified()) { 
        inputDate = refreshInputDate();
     }
   		return inputDate;
   }

  
	/**
	*  set variable inputDate
	*  Corresponding COBOL Variable is WS-INPUT-DATE
	*  @param value
	**/
   public void setInputDate(char[] value) {
      inputDate = checkInputDateConstraints(value);
      serializeInputDate(inputDate);
   } 

     /**
	 * 	Update InputDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputDate,inputDate.length);
   	
   }
   
   public void setInputDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputDate,inputDate.length);
   	
   }
   
     /**
	 * 	Update InputDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputDate with another Field
	 *	@param value
	 */
   public void setInputDate(Field source) {
       replace(source,0,source.length(),beginInputDate,INPUT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update InputDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputDate,INPUT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update InputDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of effEndDateCalc
	 *	@return effEndDateCalc
	 */
   public char[] getEffEndDateCalc() throws CFException{
     if (isEffEndDateCalcModified()) { 
        effEndDateCalc = refreshEffEndDateCalc();
     }
   		return effEndDateCalc;
   }

  
	/**
	*  set variable effEndDateCalc
	*  Corresponding COBOL Variable is WS-EFF-END-DATE-CALC
	*  @param value
	**/
   public void setEffEndDateCalc(char[] value) {
      effEndDateCalc = checkEffEndDateCalcConstraints(value);
      serializeEffEndDateCalc(effEndDateCalc);
   } 

     /**
	 * 	Update EffEndDateCalc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffEndDateCalc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEffEndDateCalc,effEndDateCalc.length);
   	
   }
   
   public void setEffEndDateCalc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateCalc,effEndDateCalc.length);
   	
   }
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateCalc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateCalc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EffEndDateCalc with another Field
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source) {
       replace(source,0,source.length(),beginEffEndDateCalc,EFF_END_DATE_CALC_LEN);
   	
   }  
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEffEndDateCalc,EFF_END_DATE_CALC_LEN);
   	
   }
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateCalc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of effEndDateBuild
	 *	@return effEndDateBuild
	 */
   public char[] getEffEndDateBuild() throws CFException{
     if (isEffEndDateBuildModified()) { 
        effEndDateBuild = refreshEffEndDateBuild();
     }
   		return effEndDateBuild;
   }

  
	/**
	*  set variable effEndDateBuild
	*  Corresponding COBOL Variable is WS-EFF-END-DATE-BUILD
	*  @param value
	**/
   public void setEffEndDateBuild(char[] value) {
      effEndDateBuild = checkEffEndDateBuildConstraints(value);
      serializeEffEndDateBuild(effEndDateBuild);
   } 

     /**
	 * 	Update EffEndDateBuild 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffEndDateBuild(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEffEndDateBuild,effEndDateBuild.length);
   	
   }
   
   public void setEffEndDateBuild(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateBuild,effEndDateBuild.length);
   	
   }
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateBuild(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateBuild+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EffEndDateBuild with another Field
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source) {
       replace(source,0,source.length(),beginEffEndDateBuild,EFF_END_DATE_BUILD_LEN);
   	
   }  
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEffEndDateBuild,EFF_END_DATE_BUILD_LEN);
   	
   }
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffEndDateBuild+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lastDate
	 *	@return lastDate
	 */
   public char[] getLastDate() throws CFException{
     if (isLastDateModified()) { 
        lastDate = refreshLastDate();
     }
   		return lastDate;
   }

  
	/**
	*  set variable lastDate
	*  Corresponding COBOL Variable is WS-LAST-DATE
	*  @param value
	**/
   public void setLastDate(char[] value) {
      lastDate = checkLastDateConstraints(value);
      serializeLastDate(lastDate);
   } 

     /**
	 * 	Update LastDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLastDate,lastDate.length);
   	
   }
   
   public void setLastDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLastDate,lastDate.length);
   	
   }
   
     /**
	 * 	Update LastDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LastDate with another Field
	 *	@param value
	 */
   public void setLastDate(Field source) {
       replace(source,0,source.length(),beginLastDate,LAST_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update LastDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLastDate,LAST_DATE_LEN);
   	
   }
   
     /**
	 * 	Update LastDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVarsFieldLength() {
			return VARS_LENGTH;
		}

}
  
