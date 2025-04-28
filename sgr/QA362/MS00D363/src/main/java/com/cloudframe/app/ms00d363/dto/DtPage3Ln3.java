package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln3 extends DtPage3Ln3Serialized {
   

						private char[] dt33Cc = new char[1];




						private char[] dt33AcqintDbAmt = Field.fillLowValue(20);


						private char[] dt33AcqintCrAmt = Field.fillLowValue(20);


						private char[] dt33AcqintNetAmt = Field.fillLowValue(20);


						private char[] dt33AcqintInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln3
	**/
    public DtPage3Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt33Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("INTERCHANGE FEES").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 20
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 56
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 87
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 115
             ,2
             );
								setDt33AcqintInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt33Cc
	 *	@return dt33Cc
	 */
   public char[] getDt33Cc() throws CFException{
     if (isDt33CcModified()) { 
        dt33Cc = refreshDt33Cc();
     }
   		return dt33Cc;
   }

  
	/**
	*  set variable dt33Cc
	*  Corresponding COBOL Variable is DT3-3-CC
	*  @param value
	**/
   public void setDt33Cc(char[] value) {
      dt33Cc = checkDt33CcConstraints(value);
      serializeDt33Cc(dt33Cc);
   } 

     /**
	 * 	Update Dt33Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt33Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt33Cc,dt33Cc.length);
   	
   }
   
   public void setDt33Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt33Cc,dt33Cc.length);
   	
   }
   
     /**
	 * 	Update Dt33Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt33Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt33Cc with another Field
	 *	@param value
	 */
   public void setDt33Cc(Field source) {
       replace(source,0,source.length(),beginDt33Cc,DT_33_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt33Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt33Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt33Cc,DT_33_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt33Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt33Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt33AcqintDbAmt
	 *	@return dt33AcqintDbAmt
	 */
   public char[] getDt33AcqintDbAmt() throws CFException{
     if (isDt33AcqintDbAmtModified()) { 
        dt33AcqintDbAmt = refreshDt33AcqintDbAmt();
     }
   		return dt33AcqintDbAmt;
   }

  
	/**
	*  set variable dt33AcqintDbAmt
	*  Corresponding COBOL Variable is DT3-3-ACQINT-DB-AMT
	*  @param value
	**/
   public void setDt33AcqintDbAmt(char[] value) {
      dt33AcqintDbAmt = checkDt33AcqintDbAmtConstraints(value);
      serializeDt33AcqintDbAmt(dt33AcqintDbAmt);
   } 

     /**
	 * 	Update Dt33AcqintDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt33AcqintDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt33AcqintDbAmt,dt33AcqintDbAmt.length);
   	
   }
   
   public void setDt33AcqintDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintDbAmt,dt33AcqintDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt33AcqintDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt33AcqintDbAmt with another Field
	 *	@param value
	 */
   public void setDt33AcqintDbAmt(Field source) {
       replace(source,0,source.length(),beginDt33AcqintDbAmt,DT_33_ACQINT_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt33AcqintDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt33AcqintDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt33AcqintDbAmt,DT_33_ACQINT_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt33AcqintDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt33AcqintCrAmt
	 *	@return dt33AcqintCrAmt
	 */
   public char[] getDt33AcqintCrAmt() throws CFException{
     if (isDt33AcqintCrAmtModified()) { 
        dt33AcqintCrAmt = refreshDt33AcqintCrAmt();
     }
   		return dt33AcqintCrAmt;
   }

  
	/**
	*  set variable dt33AcqintCrAmt
	*  Corresponding COBOL Variable is DT3-3-ACQINT-CR-AMT
	*  @param value
	**/
   public void setDt33AcqintCrAmt(char[] value) {
      dt33AcqintCrAmt = checkDt33AcqintCrAmtConstraints(value);
      serializeDt33AcqintCrAmt(dt33AcqintCrAmt);
   } 

     /**
	 * 	Update Dt33AcqintCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt33AcqintCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt33AcqintCrAmt,dt33AcqintCrAmt.length);
   	
   }
   
   public void setDt33AcqintCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintCrAmt,dt33AcqintCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt33AcqintCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt33AcqintCrAmt with another Field
	 *	@param value
	 */
   public void setDt33AcqintCrAmt(Field source) {
       replace(source,0,source.length(),beginDt33AcqintCrAmt,DT_33_ACQINT_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt33AcqintCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt33AcqintCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt33AcqintCrAmt,DT_33_ACQINT_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt33AcqintCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt33AcqintNetAmt
	 *	@return dt33AcqintNetAmt
	 */
   public char[] getDt33AcqintNetAmt() throws CFException{
     if (isDt33AcqintNetAmtModified()) { 
        dt33AcqintNetAmt = refreshDt33AcqintNetAmt();
     }
   		return dt33AcqintNetAmt;
   }

  
	/**
	*  set variable dt33AcqintNetAmt
	*  Corresponding COBOL Variable is DT3-3-ACQINT-NET-AMT
	*  @param value
	**/
   public void setDt33AcqintNetAmt(char[] value) {
      dt33AcqintNetAmt = checkDt33AcqintNetAmtConstraints(value);
      serializeDt33AcqintNetAmt(dt33AcqintNetAmt);
   } 

     /**
	 * 	Update Dt33AcqintNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt33AcqintNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt33AcqintNetAmt,dt33AcqintNetAmt.length);
   	
   }
   
   public void setDt33AcqintNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintNetAmt,dt33AcqintNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt33AcqintNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt33AcqintNetAmt with another Field
	 *	@param value
	 */
   public void setDt33AcqintNetAmt(Field source) {
       replace(source,0,source.length(),beginDt33AcqintNetAmt,DT_33_ACQINT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt33AcqintNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt33AcqintNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt33AcqintNetAmt,DT_33_ACQINT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt33AcqintNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt33AcqintInd
	 *	@return dt33AcqintInd
	 */
   public char[] getDt33AcqintInd() throws CFException{
     if (isDt33AcqintIndModified()) { 
        dt33AcqintInd = refreshDt33AcqintInd();
     }
   		return dt33AcqintInd;
   }

  
	/**
	*  set variable dt33AcqintInd
	*  Corresponding COBOL Variable is DT3-3-ACQINT-IND
	*  @param value
	**/
   public void setDt33AcqintInd(char[] value) {
      dt33AcqintInd = checkDt33AcqintIndConstraints(value);
      serializeDt33AcqintInd(dt33AcqintInd);
   } 

     /**
	 * 	Update Dt33AcqintInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt33AcqintInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt33AcqintInd,dt33AcqintInd.length);
   	
   }
   
   public void setDt33AcqintInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintInd,dt33AcqintInd.length);
   	
   }
   
     /**
	 * 	Update Dt33AcqintInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt33AcqintInd with another Field
	 *	@param value
	 */
   public void setDt33AcqintInd(Field source) {
       replace(source,0,source.length(),beginDt33AcqintInd,DT_33_ACQINT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt33AcqintInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt33AcqintInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt33AcqintInd,DT_33_ACQINT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt33AcqintInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt33AcqintInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt33AcqintInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln3FieldLength() {
			return DT_PAGE_3_LN_3_LENGTH;
		}

}
  
