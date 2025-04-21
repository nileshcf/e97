package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln1 extends DtPage3Ln1Serialized {
   

						private char[] dt31Cc = new char[1];




						private char[] dt31AcqtrnDbAmt = Field.fillLowValue(18);


						private char[] dt31AcqtrnCrAmt = Field.fillLowValue(18);


						private char[] dt31AcqtrnNetAmt = Field.fillLowValue(18);


						private char[] dt31AcqtrnInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln1
	**/
    public DtPage3Ln1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt31Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("TRANSACTIONS    ").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 20
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 52
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt31AcqtrnInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt31Cc
	 *	@return dt31Cc
	 */
   public char[] getDt31Cc() throws CFException{
     if (isDt31CcModified()) { 
        dt31Cc = refreshDt31Cc();
     }
   		return dt31Cc;
   }

  
	/**
	*  set variable dt31Cc
	*  Corresponding COBOL Variable is DT3-1-CC
	*  @param value
	**/
   public void setDt31Cc(char[] value) {
      dt31Cc = checkDt31CcConstraints(value);
      serializeDt31Cc(dt31Cc);
   } 

     /**
	 * 	Update Dt31Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31Cc,dt31Cc.length);
   	
   }
   
   public void setDt31Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31Cc,dt31Cc.length);
   	
   }
   
     /**
	 * 	Update Dt31Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31Cc with another Field
	 *	@param value
	 */
   public void setDt31Cc(Field source) {
       replace(source,0,source.length(),beginDt31Cc,DT_31_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31Cc,DT_31_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt31Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31AcqtrnDbAmt
	 *	@return dt31AcqtrnDbAmt
	 */
   public char[] getDt31AcqtrnDbAmt() throws CFException{
     if (isDt31AcqtrnDbAmtModified()) { 
        dt31AcqtrnDbAmt = refreshDt31AcqtrnDbAmt();
     }
   		return dt31AcqtrnDbAmt;
   }

  
	/**
	*  set variable dt31AcqtrnDbAmt
	*  Corresponding COBOL Variable is DT3-1-ACQTRN-DB-AMT
	*  @param value
	**/
   public void setDt31AcqtrnDbAmt(char[] value) {
      dt31AcqtrnDbAmt = checkDt31AcqtrnDbAmtConstraints(value);
      serializeDt31AcqtrnDbAmt(dt31AcqtrnDbAmt);
   } 

     /**
	 * 	Update Dt31AcqtrnDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31AcqtrnDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31AcqtrnDbAmt,dt31AcqtrnDbAmt.length);
   	
   }
   
   public void setDt31AcqtrnDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnDbAmt,dt31AcqtrnDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31AcqtrnDbAmt with another Field
	 *	@param value
	 */
   public void setDt31AcqtrnDbAmt(Field source) {
       replace(source,0,source.length(),beginDt31AcqtrnDbAmt,DT_31_ACQTRN_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31AcqtrnDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31AcqtrnDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31AcqtrnDbAmt,DT_31_ACQTRN_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31AcqtrnCrAmt
	 *	@return dt31AcqtrnCrAmt
	 */
   public char[] getDt31AcqtrnCrAmt() throws CFException{
     if (isDt31AcqtrnCrAmtModified()) { 
        dt31AcqtrnCrAmt = refreshDt31AcqtrnCrAmt();
     }
   		return dt31AcqtrnCrAmt;
   }

  
	/**
	*  set variable dt31AcqtrnCrAmt
	*  Corresponding COBOL Variable is DT3-1-ACQTRN-CR-AMT
	*  @param value
	**/
   public void setDt31AcqtrnCrAmt(char[] value) {
      dt31AcqtrnCrAmt = checkDt31AcqtrnCrAmtConstraints(value);
      serializeDt31AcqtrnCrAmt(dt31AcqtrnCrAmt);
   } 

     /**
	 * 	Update Dt31AcqtrnCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31AcqtrnCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31AcqtrnCrAmt,dt31AcqtrnCrAmt.length);
   	
   }
   
   public void setDt31AcqtrnCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnCrAmt,dt31AcqtrnCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31AcqtrnCrAmt with another Field
	 *	@param value
	 */
   public void setDt31AcqtrnCrAmt(Field source) {
       replace(source,0,source.length(),beginDt31AcqtrnCrAmt,DT_31_ACQTRN_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31AcqtrnCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31AcqtrnCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31AcqtrnCrAmt,DT_31_ACQTRN_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31AcqtrnNetAmt
	 *	@return dt31AcqtrnNetAmt
	 */
   public char[] getDt31AcqtrnNetAmt() throws CFException{
     if (isDt31AcqtrnNetAmtModified()) { 
        dt31AcqtrnNetAmt = refreshDt31AcqtrnNetAmt();
     }
   		return dt31AcqtrnNetAmt;
   }

  
	/**
	*  set variable dt31AcqtrnNetAmt
	*  Corresponding COBOL Variable is DT3-1-ACQTRN-NET-AMT
	*  @param value
	**/
   public void setDt31AcqtrnNetAmt(char[] value) {
      dt31AcqtrnNetAmt = checkDt31AcqtrnNetAmtConstraints(value);
      serializeDt31AcqtrnNetAmt(dt31AcqtrnNetAmt);
   } 

     /**
	 * 	Update Dt31AcqtrnNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31AcqtrnNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31AcqtrnNetAmt,dt31AcqtrnNetAmt.length);
   	
   }
   
   public void setDt31AcqtrnNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnNetAmt,dt31AcqtrnNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31AcqtrnNetAmt with another Field
	 *	@param value
	 */
   public void setDt31AcqtrnNetAmt(Field source) {
       replace(source,0,source.length(),beginDt31AcqtrnNetAmt,DT_31_ACQTRN_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31AcqtrnNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31AcqtrnNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31AcqtrnNetAmt,DT_31_ACQTRN_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31AcqtrnInd
	 *	@return dt31AcqtrnInd
	 */
   public char[] getDt31AcqtrnInd() throws CFException{
     if (isDt31AcqtrnIndModified()) { 
        dt31AcqtrnInd = refreshDt31AcqtrnInd();
     }
   		return dt31AcqtrnInd;
   }

  
	/**
	*  set variable dt31AcqtrnInd
	*  Corresponding COBOL Variable is DT3-1-ACQTRN-IND
	*  @param value
	**/
   public void setDt31AcqtrnInd(char[] value) {
      dt31AcqtrnInd = checkDt31AcqtrnIndConstraints(value);
      serializeDt31AcqtrnInd(dt31AcqtrnInd);
   } 

     /**
	 * 	Update Dt31AcqtrnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31AcqtrnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31AcqtrnInd,dt31AcqtrnInd.length);
   	
   }
   
   public void setDt31AcqtrnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnInd,dt31AcqtrnInd.length);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31AcqtrnInd with another Field
	 *	@param value
	 */
   public void setDt31AcqtrnInd(Field source) {
       replace(source,0,source.length(),beginDt31AcqtrnInd,DT_31_ACQTRN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31AcqtrnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31AcqtrnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31AcqtrnInd,DT_31_ACQTRN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt31AcqtrnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31AcqtrnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31AcqtrnInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln1FieldLength() {
			return DT_PAGE_3_LN_1_LENGTH;
		}

}
  
