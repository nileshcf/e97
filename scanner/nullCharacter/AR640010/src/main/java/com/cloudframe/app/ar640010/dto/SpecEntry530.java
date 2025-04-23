package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecEntry530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SpecEntry530 extends SpecEntry530Serialized { 
   

						private char[] specDd530 = new char[8];
				private SpecFile530 specFile530 = new SpecFile530();

						private char[] specUseCode530 = new char[1];

						private char[] specStatStatus530 = new char[1];

						private char[] specIdCode530 = new char[1];

						private char[] specAtype530 = new char[1];
				private SpecRecfm530 specRecfm530 = new SpecRecfm530();

								private int specUnits530;

								private int specPspace530;

								private int specSspace530;

								private int specLrecl530;

								private int specBlksz530;

						private char[] specSeqio530 = new char[84];
	
	/**
	* Constructor for SpecEntry530
	**/
    public SpecEntry530() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SpecEntry530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecEntry530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			specFile530.setParent(this,getStartOffset() + 8);
	       			specRecfm530.setParent(this,getStartOffset() + 64);
								setSpecDd530(fillSpace(8));
								specFile530.setString(fillSpace(52));
								setSpecUseCode530(fillSpace(1));
								setSpecStatStatus530(fillSpace(1));
								setSpecIdCode530(fillSpace(1));
								setSpecAtype530(fillSpace(1));
								specRecfm530.setString(fillSpace(3));
								setSpecUnits530(0);
								setSpecPspace530(0);
								setSpecSspace530(0);
								setSpecLrecl530(0);
								setSpecBlksz530(0);
								setSpecSeqio530(pad(84," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of specDd530
	 *	@return specDd530
	 */
   public char[] getSpecDd530() throws CFException{
     if (isSpecDd530Modified()) { 
        specDd530 = refreshSpecDd530();
     }
   		return specDd530;
   }

  
	/**
	*  set variable specDd530
	*  Corresponding COBOL Variable is 530-SPEC-DD
	*  @param value
	**/
   public void setSpecDd530(char[] value) {
      specDd530 = checkSpecDd530Constraints(value);
      serializeSpecDd530(specDd530);
   } 

     /**
	 * 	Update SpecDd530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecDd530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecDd530,specDd530.length);
   	
   }
   
   public void setSpecDd530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDd530,specDd530.length);
   	
   }
   
     /**
	 * 	Update SpecDd530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecDd530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDd530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecDd530 with another Field
	 *	@param value
	 */
   public void setSpecDd530(Field source) {
       replace(source,0,source.length(),beginSpecDd530,SPEC_DD_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecDd530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecDd530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecDd530,SPEC_DD_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecDd530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecDd530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecDd530+targetIndex,targetLen);
    
   }
	char[] specDdSrceDflt8853088Value = "GFTSRCE ".toCharArray();
	/**
	 *	Test condition "GFTSRCE " for isSpecDdSrceDflt88530()
	 *	@return  Returns true if isSpecDdSrceDflt88530() is "GFTSRCE "
	 */
   public boolean isSpecDdSrceDflt88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdSrceDflt8853088Value)  == 0  );
   }


	/**
	*  set values "GFTSRCE "
	*/
   	public void setSpecDdSrceDflt88530True() {  			
    	setSpecDd530( specDdSrceDflt8853088Value);
   	}
	char[] specDdTrgtDflt8853088Value = "GFTTRGT ".toCharArray();
	/**
	 *	Test condition "GFTTRGT " for isSpecDdTrgtDflt88530()
	 *	@return  Returns true if isSpecDdTrgtDflt88530() is "GFTTRGT "
	 */
   public boolean isSpecDdTrgtDflt88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdTrgtDflt8853088Value)  == 0  );
   }


	/**
	*  set values "GFTTRGT "
	*/
   	public void setSpecDdTrgtDflt88530True() {  			
    	setSpecDd530( specDdTrgtDflt8853088Value);
   	}
	char[] specDdUtilWork8853088Value = "GFTWORK ".toCharArray();
	/**
	 *	Test condition "GFTWORK " for isSpecDdUtilWork88530()
	 *	@return  Returns true if isSpecDdUtilWork88530() is "GFTWORK "
	 */
   public boolean isSpecDdUtilWork88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdUtilWork8853088Value)  == 0  );
   }


	/**
	*  set values "GFTWORK "
	*/
   	public void setSpecDdUtilWork88530True() {  			
    	setSpecDd530( specDdUtilWork8853088Value);
   	}
	char[] specDdSysout8853088Value = "SYSOUT  ".toCharArray();
	/**
	 *	Test condition "SYSOUT  " for isSpecDdSysout88530()
	 *	@return  Returns true if isSpecDdSysout88530() is "SYSOUT  "
	 */
   public boolean isSpecDdSysout88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdSysout8853088Value)  == 0  );
   }


	/**
	*  set values "SYSOUT  "
	*/
   	public void setSpecDdSysout88530True() {  			
    	setSpecDd530( specDdSysout8853088Value);
   	}
	char[] specDdSyslst8853088Value = "SYSLST  ".toCharArray();
	/**
	 *	Test condition "SYSLST  " for isSpecDdSyslst88530()
	 *	@return  Returns true if isSpecDdSyslst88530() is "SYSLST  "
	 */
   public boolean isSpecDdSyslst88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdSyslst8853088Value)  == 0  );
   }


	/**
	*  set values "SYSLST  "
	*/
   	public void setSpecDdSyslst88530True() {  			
    	setSpecDd530( specDdSyslst8853088Value);
   	}
	
	/**
	 *	Test condition "SYS000  " THRU "SYS199  " for isSpecDdInput88530()
	 *	@return  Returns true if isSpecDdInput88530() is "SYS000  " THRU "SYS199  "
	 */
   public boolean isSpecDdInput88530() throws CFException {
      return (  isGreaterOrEqual(getSpecDd530(), "SYS000  " ) &&  isLessOrEqual(getSpecDd530(),"SYS199  " )  );
   }


	/**
	*  set values "SYS000  " THRU "SYS199  "
	*/
   	public void setSpecDdInput88530True() {  			
    	setSpecDd530( "SYS000  ".toCharArray());
   	}
	
	/**
	 *	Test condition "SYS100  " THRU "SYS299  " for isSpecDdOutput88530()
	 *	@return  Returns true if isSpecDdOutput88530() is "SYS100  " THRU "SYS299  "
	 */
   public boolean isSpecDdOutput88530() throws CFException {
      return (  isGreaterOrEqual(getSpecDd530(), "SYS100  " ) &&  isLessOrEqual(getSpecDd530(),"SYS299  " )  );
   }


	/**
	*  set values "SYS100  " THRU "SYS299  "
	*/
   	public void setSpecDdOutput88530True() {  			
    	setSpecDd530( "SYS100  ".toCharArray());
   	}
	char[] specDdCtrl8853088Value = "SYS900  ".toCharArray();
	/**
	 *	Test condition "SYS900  " for isSpecDdCtrl88530()
	 *	@return  Returns true if isSpecDdCtrl88530() is "SYS900  "
	 */
   public boolean isSpecDdCtrl88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdCtrl8853088Value)  == 0  );
   }


	/**
	*  set values "SYS900  "
	*/
   	public void setSpecDdCtrl88530True() {  			
    	setSpecDd530( specDdCtrl8853088Value);
   	}
	char[] specDdTarafpl8853088Value = "TARAFPL ".toCharArray();
	/**
	 *	Test condition "TARAFPL " for isSpecDdTarafpl88530()
	 *	@return  Returns true if isSpecDdTarafpl88530() is "TARAFPL "
	 */
   public boolean isSpecDdTarafpl88530() throws CFException {
      return (  compareChars( getSpecDd530() , specDdTarafpl8853088Value)  == 0  );
   }


	/**
	*  set values "TARAFPL "
	*/
   	public void setSpecDdTarafpl88530True() {  			
    	setSpecDd530( specDdTarafpl8853088Value);
   	}
	/**
	 *	Returns the value of specFile530
	 *	@return specFile530
	 */   
	 public SpecFile530 getSpecFile530() {
   	return specFile530;
   }
   /**
	* 	Update SpecFile530 with the passed value
	*   Corresponding COBOL Variable is 530-SPEC-FILE
	*	@param value
	*/
   public void setSpecFile530(char[] value) {
      specFile530.setString(value); 
   }   
    
     /**
	 * 	Update SpecFile530 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSpecFile530(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specFile530.begin,specFile530.length());
   }
   
     /**
	 * 	Update SpecFile530 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecFile530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specFile530.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SpecFile530 with another Field
	 *	@param value
	 */
   public void setSpecFile530(Field source) {
   	replace(source,0,source.length(),specFile530.begin,specFile530.length());
   }  
   
     /**
	 * 	Update SpecFile530 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSpecFile530(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specFile530.begin,specFile530.length());
   }
   
     /**
	 * 	Update SpecFile530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecFile530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specFile530.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of specUseCode530
	 *	@return specUseCode530
	 */
   public char[] getSpecUseCode530() throws CFException{
     if (isSpecUseCode530Modified()) { 
        specUseCode530 = refreshSpecUseCode530();
     }
   		return specUseCode530;
   }

  
	/**
	*  set variable specUseCode530
	*  Corresponding COBOL Variable is 530-SPEC-USE-CODE
	*  @param value
	**/
   public void setSpecUseCode530(char[] value) {
      specUseCode530 = checkSpecUseCode530Constraints(value);
      serializeSpecUseCode530(specUseCode530);
   } 

     /**
	 * 	Update SpecUseCode530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecUseCode530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecUseCode530,specUseCode530.length);
   	
   }
   
   public void setSpecUseCode530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecUseCode530,specUseCode530.length);
   	
   }
   
     /**
	 * 	Update SpecUseCode530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecUseCode530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecUseCode530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecUseCode530 with another Field
	 *	@param value
	 */
   public void setSpecUseCode530(Field source) {
       replace(source,0,source.length(),beginSpecUseCode530,SPEC_USE_CODE_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecUseCode530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecUseCode530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecUseCode530,SPEC_USE_CODE_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecUseCode530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecUseCode530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecUseCode530+targetIndex,targetLen);
    
   }
	char[] specUseNone8853088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isSpecUseNone88530()
	 *	@return  Returns true if isSpecUseNone88530() is " "
	 */
   public boolean isSpecUseNone88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseNone8853088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setSpecUseNone88530True() {  			
    	setSpecUseCode530( specUseNone8853088Value);
   	}
	char[] specUseNtrn8853088Value1 = "I".toCharArray();
char[] specUseNtrn8853088Value2 = "O".toCharArray();
char[] specUseNtrn8853088Value3 = "H".toCharArray();

	/**
	 *	Test condition "I" "O" "H" for isSpecUseNtrn88530()
	 *	@return  Returns true if isSpecUseNtrn88530() is "I" "O" "H"
	 */
   public boolean isSpecUseNtrn88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseNtrn8853088Value1)  == 0  ||  compareChars( getSpecUseCode530() , specUseNtrn8853088Value2)  == 0  ||  compareChars( getSpecUseCode530() , specUseNtrn8853088Value3)  == 0  );
   }


	/**
	*  set values "I" "O" "H"
	*/
   	public void setSpecUseNtrn88530True() {  			
    	setSpecUseCode530( specUseNtrn8853088Value1);
   	}
	char[] specUseXtrn8853088Value1 = "S".toCharArray();
char[] specUseXtrn8853088Value2 = "T".toCharArray();

	/**
	 *	Test condition "S" "T" for isSpecUseXtrn88530()
	 *	@return  Returns true if isSpecUseXtrn88530() is "S" "T"
	 */
   public boolean isSpecUseXtrn88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseXtrn8853088Value1)  == 0  ||  compareChars( getSpecUseCode530() , specUseXtrn8853088Value2)  == 0  );
   }


	/**
	*  set values "S" "T"
	*/
   	public void setSpecUseXtrn88530True() {  			
    	setSpecUseCode530( specUseXtrn8853088Value1);
   	}
	char[] specUseSrce8853088Value1 = "I".toCharArray();
char[] specUseSrce8853088Value2 = "S".toCharArray();

	/**
	 *	Test condition "I" "S" for isSpecUseSrce88530()
	 *	@return  Returns true if isSpecUseSrce88530() is "I" "S"
	 */
   public boolean isSpecUseSrce88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseSrce8853088Value1)  == 0  ||  compareChars( getSpecUseCode530() , specUseSrce8853088Value2)  == 0  );
   }


	/**
	*  set values "I" "S"
	*/
   	public void setSpecUseSrce88530True() {  			
    	setSpecUseCode530( specUseSrce8853088Value1);
   	}
	char[] specUseTrgt8853088Value1 = "O".toCharArray();
char[] specUseTrgt8853088Value2 = "T".toCharArray();

	/**
	 *	Test condition "O" "T" for isSpecUseTrgt88530()
	 *	@return  Returns true if isSpecUseTrgt88530() is "O" "T"
	 */
   public boolean isSpecUseTrgt88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseTrgt8853088Value1)  == 0  ||  compareChars( getSpecUseCode530() , specUseTrgt8853088Value2)  == 0  );
   }


	/**
	*  set values "O" "T"
	*/
   	public void setSpecUseTrgt88530True() {  			
    	setSpecUseCode530( specUseTrgt8853088Value1);
   	}
	char[] specUseNtrnSrce8853088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isSpecUseNtrnSrce88530()
	 *	@return  Returns true if isSpecUseNtrnSrce88530() is "I"
	 */
   public boolean isSpecUseNtrnSrce88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseNtrnSrce8853088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setSpecUseNtrnSrce88530True() {  			
    	setSpecUseCode530( specUseNtrnSrce8853088Value);
   	}
	char[] specUseNtrnTrgt8853088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSpecUseNtrnTrgt88530()
	 *	@return  Returns true if isSpecUseNtrnTrgt88530() is "O"
	 */
   public boolean isSpecUseNtrnTrgt88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseNtrnTrgt8853088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSpecUseNtrnTrgt88530True() {  			
    	setSpecUseCode530( specUseNtrnTrgt8853088Value);
   	}
	char[] specUseNtrnHold8853088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isSpecUseNtrnHold88530()
	 *	@return  Returns true if isSpecUseNtrnHold88530() is "H"
	 */
   public boolean isSpecUseNtrnHold88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseNtrnHold8853088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setSpecUseNtrnHold88530True() {  			
    	setSpecUseCode530( specUseNtrnHold8853088Value);
   	}
	char[] specUseXtrnSrce8853088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSpecUseXtrnSrce88530()
	 *	@return  Returns true if isSpecUseXtrnSrce88530() is "S"
	 */
   public boolean isSpecUseXtrnSrce88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseXtrnSrce8853088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSpecUseXtrnSrce88530True() {  			
    	setSpecUseCode530( specUseXtrnSrce8853088Value);
   	}
	char[] specUseXtrnTrgt8853088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isSpecUseXtrnTrgt88530()
	 *	@return  Returns true if isSpecUseXtrnTrgt88530() is "T"
	 */
   public boolean isSpecUseXtrnTrgt88530() throws CFException {
      return (  compareChars( getSpecUseCode530() , specUseXtrnTrgt8853088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setSpecUseXtrnTrgt88530True() {  			
    	setSpecUseCode530( specUseXtrnTrgt8853088Value);
   	}
	/**
	 *	Returns the value of specStatStatus530
	 *	@return specStatStatus530
	 */
   public char[] getSpecStatStatus530() throws CFException{
     if (isSpecStatStatus530Modified()) { 
        specStatStatus530 = refreshSpecStatStatus530();
     }
   		return specStatStatus530;
   }

  
	/**
	*  set variable specStatStatus530
	*  Corresponding COBOL Variable is 530-SPEC-STAT-STATUS
	*  @param value
	**/
   public void setSpecStatStatus530(char[] value) {
      specStatStatus530 = checkSpecStatStatus530Constraints(value);
      serializeSpecStatStatus530(specStatStatus530);
   } 

     /**
	 * 	Update SpecStatStatus530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecStatStatus530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecStatStatus530,specStatStatus530.length);
   	
   }
   
   public void setSpecStatStatus530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecStatStatus530,specStatStatus530.length);
   	
   }
   
     /**
	 * 	Update SpecStatStatus530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecStatStatus530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecStatStatus530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecStatStatus530 with another Field
	 *	@param value
	 */
   public void setSpecStatStatus530(Field source) {
       replace(source,0,source.length(),beginSpecStatStatus530,SPEC_STAT_STATUS_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecStatStatus530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecStatStatus530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecStatStatus530,SPEC_STAT_STATUS_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecStatStatus530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecStatStatus530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecStatStatus530+targetIndex,targetLen);
    
   }
	char[] specStatInactive8853088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isSpecStatInactive88530()
	 *	@return  Returns true if isSpecStatInactive88530() is " "
	 */
   public boolean isSpecStatInactive88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatInactive8853088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setSpecStatInactive88530True() {  			
    	setSpecStatStatus530( specStatInactive8853088Value);
   	}
	char[] specStatAlloc8853088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isSpecStatAlloc88530()
	 *	@return  Returns true if isSpecStatAlloc88530() is "A"
	 */
   public boolean isSpecStatAlloc88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatAlloc8853088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setSpecStatAlloc88530True() {  			
    	setSpecStatStatus530( specStatAlloc8853088Value);
   	}
	char[] specStatReady8853088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isSpecStatReady88530()
	 *	@return  Returns true if isSpecStatReady88530() is "R"
	 */
   public boolean isSpecStatReady88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatReady8853088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setSpecStatReady88530True() {  			
    	setSpecStatStatus530( specStatReady8853088Value);
   	}
	char[] specStatOpened8853088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSpecStatOpened88530()
	 *	@return  Returns true if isSpecStatOpened88530() is "O"
	 */
   public boolean isSpecStatOpened88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatOpened8853088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSpecStatOpened88530True() {  			
    	setSpecStatStatus530( specStatOpened8853088Value);
   	}
	char[] specStatEof8853088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isSpecStatEof88530()
	 *	@return  Returns true if isSpecStatEof88530() is "E"
	 */
   public boolean isSpecStatEof88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatEof8853088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setSpecStatEof88530True() {  			
    	setSpecStatStatus530( specStatEof8853088Value);
   	}
	char[] specStatClosed8853088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSpecStatClosed88530()
	 *	@return  Returns true if isSpecStatClosed88530() is "C"
	 */
   public boolean isSpecStatClosed88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatClosed8853088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSpecStatClosed88530True() {  			
    	setSpecStatStatus530( specStatClosed8853088Value);
   	}
	char[] specStatUnall8853088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isSpecStatUnall88530()
	 *	@return  Returns true if isSpecStatUnall88530() is "U"
	 */
   public boolean isSpecStatUnall88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatUnall8853088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setSpecStatUnall88530True() {  			
    	setSpecStatStatus530( specStatUnall8853088Value);
   	}
	char[] specStatDeleted8853088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isSpecStatDeleted88530()
	 *	@return  Returns true if isSpecStatDeleted88530() is "D"
	 */
   public boolean isSpecStatDeleted88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatDeleted8853088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setSpecStatDeleted88530True() {  			
    	setSpecStatStatus530( specStatDeleted8853088Value);
   	}
	char[] specStatError8853088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isSpecStatError88530()
	 *	@return  Returns true if isSpecStatError88530() is "X"
	 */
   public boolean isSpecStatError88530() throws CFException {
      return (  compareChars( getSpecStatStatus530() , specStatError8853088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setSpecStatError88530True() {  			
    	setSpecStatStatus530( specStatError8853088Value);
   	}
	/**
	 *	Returns the value of specIdCode530
	 *	@return specIdCode530
	 */
   public char[] getSpecIdCode530() throws CFException{
     if (isSpecIdCode530Modified()) { 
        specIdCode530 = refreshSpecIdCode530();
     }
   		return specIdCode530;
   }

  
	/**
	*  set variable specIdCode530
	*  Corresponding COBOL Variable is 530-SPEC-ID-CODE
	*  @param value
	**/
   public void setSpecIdCode530(char[] value) {
      specIdCode530 = checkSpecIdCode530Constraints(value);
      serializeSpecIdCode530(specIdCode530);
   } 

     /**
	 * 	Update SpecIdCode530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecIdCode530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecIdCode530,specIdCode530.length);
   	
   }
   
   public void setSpecIdCode530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecIdCode530,specIdCode530.length);
   	
   }
   
     /**
	 * 	Update SpecIdCode530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecIdCode530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecIdCode530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecIdCode530 with another Field
	 *	@param value
	 */
   public void setSpecIdCode530(Field source) {
       replace(source,0,source.length(),beginSpecIdCode530,SPEC_ID_CODE_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecIdCode530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecIdCode530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecIdCode530,SPEC_ID_CODE_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecIdCode530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecIdCode530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecIdCode530+targetIndex,targetLen);
    
   }
	char[] specIdNone8853088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isSpecIdNone88530()
	 *	@return  Returns true if isSpecIdNone88530() is " "
	 */
   public boolean isSpecIdNone88530() throws CFException {
      return (  compareChars( getSpecIdCode530() , specIdNone8853088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setSpecIdNone88530True() {  			
    	setSpecIdCode530( specIdNone8853088Value);
   	}
	char[] specIdDd8853088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isSpecIdDd88530()
	 *	@return  Returns true if isSpecIdDd88530() is "D"
	 */
   public boolean isSpecIdDd88530() throws CFException {
      return (  compareChars( getSpecIdCode530() , specIdDd8853088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setSpecIdDd88530True() {  			
    	setSpecIdCode530( specIdDd8853088Value);
   	}
	char[] specIdDsn8853088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSpecIdDsn88530()
	 *	@return  Returns true if isSpecIdDsn88530() is "N"
	 */
   public boolean isSpecIdDsn88530() throws CFException {
      return (  compareChars( getSpecIdCode530() , specIdDsn8853088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSpecIdDsn88530True() {  			
    	setSpecIdCode530( specIdDsn8853088Value);
   	}
	/**
	 *	Returns the value of specAtype530
	 *	@return specAtype530
	 */
   public char[] getSpecAtype530() throws CFException{
     if (isSpecAtype530Modified()) { 
        specAtype530 = refreshSpecAtype530();
     }
   		return specAtype530;
   }

  
	/**
	*  set variable specAtype530
	*  Corresponding COBOL Variable is 530-SPEC-ATYPE
	*  @param value
	**/
   public void setSpecAtype530(char[] value) {
      specAtype530 = checkSpecAtype530Constraints(value);
      serializeSpecAtype530(specAtype530);
   } 

     /**
	 * 	Update SpecAtype530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecAtype530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecAtype530,specAtype530.length);
   	
   }
   
   public void setSpecAtype530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecAtype530,specAtype530.length);
   	
   }
   
     /**
	 * 	Update SpecAtype530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecAtype530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecAtype530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecAtype530 with another Field
	 *	@param value
	 */
   public void setSpecAtype530(Field source) {
       replace(source,0,source.length(),beginSpecAtype530,SPEC_ATYPE_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecAtype530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecAtype530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecAtype530,SPEC_ATYPE_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecAtype530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecAtype530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecAtype530+targetIndex,targetLen);
    
   }
	char[] specAtypeValid8853088Value1 = "C".toCharArray();
char[] specAtypeValid8853088Value2 = "T".toCharArray();
char[] specAtypeValid8853088Value3 = "B".toCharArray();

	/**
	 *	Test condition "C" "T" "B" for isSpecAtypeValid88530()
	 *	@return  Returns true if isSpecAtypeValid88530() is "C" "T" "B"
	 */
   public boolean isSpecAtypeValid88530() throws CFException {
      return (  compareChars( getSpecAtype530() , specAtypeValid8853088Value1)  == 0  ||  compareChars( getSpecAtype530() , specAtypeValid8853088Value2)  == 0  ||  compareChars( getSpecAtype530() , specAtypeValid8853088Value3)  == 0  );
   }


	/**
	*  set values "C" "T" "B"
	*/
   	public void setSpecAtypeValid88530True() {  			
    	setSpecAtype530( specAtypeValid8853088Value1);
   	}
	char[] specAtypeCyl8853088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSpecAtypeCyl88530()
	 *	@return  Returns true if isSpecAtypeCyl88530() is "C"
	 */
   public boolean isSpecAtypeCyl88530() throws CFException {
      return (  compareChars( getSpecAtype530() , specAtypeCyl8853088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSpecAtypeCyl88530True() {  			
    	setSpecAtype530( specAtypeCyl8853088Value);
   	}
	char[] specAtypeTrk8853088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isSpecAtypeTrk88530()
	 *	@return  Returns true if isSpecAtypeTrk88530() is "T"
	 */
   public boolean isSpecAtypeTrk88530() throws CFException {
      return (  compareChars( getSpecAtype530() , specAtypeTrk8853088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setSpecAtypeTrk88530True() {  			
    	setSpecAtype530( specAtypeTrk8853088Value);
   	}
	char[] specAtypeBlk8853088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isSpecAtypeBlk88530()
	 *	@return  Returns true if isSpecAtypeBlk88530() is "B"
	 */
   public boolean isSpecAtypeBlk88530() throws CFException {
      return (  compareChars( getSpecAtype530() , specAtypeBlk8853088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setSpecAtypeBlk88530True() {  			
    	setSpecAtype530( specAtypeBlk8853088Value);
   	}
	char[] specAtypeNot8853088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSpecAtypeNot88530()
	 *	@return  Returns true if isSpecAtypeNot88530() is "N"
	 */
   public boolean isSpecAtypeNot88530() throws CFException {
      return (  compareChars( getSpecAtype530() , specAtypeNot8853088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSpecAtypeNot88530True() {  			
    	setSpecAtype530( specAtypeNot8853088Value);
   	}
	/**
	 *	Returns the value of specRecfm530
	 *	@return specRecfm530
	 */   
	 public SpecRecfm530 getSpecRecfm530() {
   	return specRecfm530;
   }
   /**
	* 	Update SpecRecfm530 with the passed value
	*   Corresponding COBOL Variable is 530-SPEC-RECFM
	*	@param value
	*/
   public void setSpecRecfm530(char[] value) {
      specRecfm530.setString(value); 
   }   
    
     /**
	 * 	Update SpecRecfm530 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSpecRecfm530(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specRecfm530.begin,specRecfm530.length());
   }
   
     /**
	 * 	Update SpecRecfm530 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecRecfm530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specRecfm530.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SpecRecfm530 with another Field
	 *	@param value
	 */
   public void setSpecRecfm530(Field source) {
   	replace(source,0,source.length(),specRecfm530.begin,specRecfm530.length());
   }  
   
     /**
	 * 	Update SpecRecfm530 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSpecRecfm530(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,specRecfm530.begin,specRecfm530.length());
   }
   
     /**
	 * 	Update SpecRecfm530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecRecfm530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,specRecfm530.begin+targetIndex,targetLen);
   }
	char[] specRecfmFba8853088Value = "FBA".toCharArray();
	/**
	 *	Test condition "FBA" for isSpecRecfmFba88530()
	 *	@return  Returns true if isSpecRecfmFba88530() is "FBA"
	 */
   public boolean isSpecRecfmFba88530() throws CFException {
      return (  compareChars( getSpecRecfm530().toCharArray() , specRecfmFba8853088Value)  == 0  );
   }


	/**
	*  set values "FBA"
	*/
   	public void setSpecRecfmFba88530True() {  			
    	setString(specRecfmFba8853088Value);
   	}
	/**
	 *	Returns the value of specUnits530
	 *	@return specUnits530
	 */
	public int getSpecUnits530() throws CFException {
        if (isSpecUnits530Modified()) { 
           specUnits530 = refreshSpecUnits530();
        }
   		return specUnits530;
	}
	
	/**
	 * 	Update SpecUnits530 with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-UNITS
	 *	@param number
	 */
	public void setSpecUnits530(int number) {
	     // Truncate if the number is beyond +/- Max range
	    specUnits530 = checkSpecUnits530MaxLimit(number); 
		serializeSpecUnits530(specUnits530);
	}


	public void setSpecUnits530(long number) {
	    number = checkSpecUnits530MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpecUnits530((int)number);
	}
	
	/**
	 *	Returns the value of specPspace530
	 *	@return specPspace530
	 */
	public int getSpecPspace530() throws CFException {
        if (isSpecPspace530Modified()) { 
           specPspace530 = refreshSpecPspace530();
        }
   		return specPspace530;
	}
	
	/**
	 * 	Update SpecPspace530 with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-PSPACE
	 *	@param number
	 */
	public void setSpecPspace530(int number) {
	     // Truncate if the number is beyond +/- Max range
	    specPspace530 = checkSpecPspace530MaxLimit(number); 
		serializeSpecPspace530(specPspace530);
	}


	public void setSpecPspace530(long number) {
	    number = checkSpecPspace530MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpecPspace530((int)number);
	}
	
	/**
	 *	Returns the value of specSspace530
	 *	@return specSspace530
	 */
	public int getSpecSspace530() throws CFException {
        if (isSpecSspace530Modified()) { 
           specSspace530 = refreshSpecSspace530();
        }
   		return specSspace530;
	}
	
	/**
	 * 	Update SpecSspace530 with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-SSPACE
	 *	@param number
	 */
	public void setSpecSspace530(int number) {
	     // Truncate if the number is beyond +/- Max range
	    specSspace530 = checkSpecSspace530MaxLimit(number); 
		serializeSpecSspace530(specSspace530);
	}


	public void setSpecSspace530(long number) {
	    number = checkSpecSspace530MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpecSspace530((int)number);
	}
	
	/**
	 *	Returns the value of specLrecl530
	 *	@return specLrecl530
	 */
	public int getSpecLrecl530() throws CFException {
        if (isSpecLrecl530Modified()) { 
           specLrecl530 = refreshSpecLrecl530();
        }
   		return specLrecl530;
	}
	
	/**
	 * 	Update SpecLrecl530 with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-LRECL
	 *	@param number
	 */
	public void setSpecLrecl530(int number) {
	     // Truncate if the number is beyond +/- Max range
	    specLrecl530 = checkSpecLrecl530MaxLimit(number); 
		serializeSpecLrecl530(specLrecl530);
	}


	public void setSpecLrecl530(long number) {
	    number = checkSpecLrecl530MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpecLrecl530((int)number);
	}
	
	/**
	 *	Returns the value of specBlksz530
	 *	@return specBlksz530
	 */
	public int getSpecBlksz530() throws CFException {
        if (isSpecBlksz530Modified()) { 
           specBlksz530 = refreshSpecBlksz530();
        }
   		return specBlksz530;
	}
	
	/**
	 * 	Update SpecBlksz530 with the passed value
	 *  Corresponding COBOL Variable is 530-SPEC-BLKSZ
	 *	@param number
	 */
	public void setSpecBlksz530(int number) {
	     // Truncate if the number is beyond +/- Max range
	    specBlksz530 = checkSpecBlksz530MaxLimit(number); 
		serializeSpecBlksz530(specBlksz530);
	}


	public void setSpecBlksz530(long number) {
	    number = checkSpecBlksz530MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpecBlksz530((int)number);
	}
	
	/**
	 *	Returns the value of specSeqio530
	 *	@return specSeqio530
	 */
   public char[] getSpecSeqio530() throws CFException{
     if (isSpecSeqio530Modified()) { 
        specSeqio530 = refreshSpecSeqio530();
     }
   		return specSeqio530;
   }

  
	/**
	*  set variable specSeqio530
	*  Corresponding COBOL Variable is 530-SPEC-SEQIO
	*  @param value
	**/
   public void setSpecSeqio530(char[] value) {
      specSeqio530 = checkSpecSeqio530Constraints(value);
      serializeSpecSeqio530(specSeqio530);
   } 

     /**
	 * 	Update SpecSeqio530 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSpecSeqio530(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSpecSeqio530,specSeqio530.length);
   	
   }
   
   public void setSpecSeqio530(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSpecSeqio530,specSeqio530.length);
   	
   }
   
     /**
	 * 	Update SpecSeqio530 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSpecSeqio530(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecSeqio530+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SpecSeqio530 with another Field
	 *	@param value
	 */
   public void setSpecSeqio530(Field source) {
       replace(source,0,source.length(),beginSpecSeqio530,SPEC_SEQIO_530_LEN);
   	
   }  
   
     /**
	 * 	Update SpecSeqio530 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSpecSeqio530(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSpecSeqio530,SPEC_SEQIO_530_LEN);
   	
   }
   
     /**
	 * 	Update SpecSeqio530 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSpecSeqio530(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSpecSeqio530+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSpecEntry530FieldLength() {
			return SPEC_ENTRY_530_LENGTH;
		}

}
  
