package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln5 extends DtPage2Ln5Serialized { 
   

						private char[] dt25Cc = new char[1];





						private char[] dt25TfnDbAmt = Field.fillLowValue(18);




						private char[] dt25TfnCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln5
	**/
    public DtPage2Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt25Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL FINANCIAL SETTLEMENT").toCharArray()
             , getStartOffset() + 2
             ,26
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 28
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 43
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 63
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 67
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 82
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }


 

	/**
	 *	Returns the value of dt25Cc
	 *	@return dt25Cc
	 */
   public char[] getDt25Cc() throws CFException{
     if (isDt25CcModified()) { 
        dt25Cc = refreshDt25Cc();
     }
   		return dt25Cc;
   }

  
	/**
	*  set variable dt25Cc
	*  Corresponding COBOL Variable is DT2-5-CC
	*  @param value
	**/
   public void setDt25Cc(char[] value) {
      dt25Cc = checkDt25CcConstraints(value);
      serializeDt25Cc(dt25Cc);
   } 

     /**
	 * 	Update Dt25Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25Cc,dt25Cc.length);
   	
   }
   
   public void setDt25Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25Cc,dt25Cc.length);
   	
   }
   
     /**
	 * 	Update Dt25Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25Cc with another Field
	 *	@param value
	 */
   public void setDt25Cc(Field source) {
       replace(source,0,source.length(),beginDt25Cc,DT_25_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25Cc,DT_25_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt25Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25TfnDbAmt
	 *	@return dt25TfnDbAmt
	 */
   public char[] getDt25TfnDbAmt() throws CFException{
     if (isDt25TfnDbAmtModified()) { 
        dt25TfnDbAmt = refreshDt25TfnDbAmt();
     }
   		return dt25TfnDbAmt;
   }

  
	/**
	*  set variable dt25TfnDbAmt
	*  Corresponding COBOL Variable is DT2-5-TFN-DB-AMT
	*  @param value
	**/
   public void setDt25TfnDbAmt(char[] value) {
      dt25TfnDbAmt = checkDt25TfnDbAmtConstraints(value);
      serializeDt25TfnDbAmt(dt25TfnDbAmt);
   } 

     /**
	 * 	Update Dt25TfnDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25TfnDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25TfnDbAmt,dt25TfnDbAmt.length);
   	
   }
   
   public void setDt25TfnDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnDbAmt,dt25TfnDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25TfnDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25TfnDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25TfnDbAmt with another Field
	 *	@param value
	 */
   public void setDt25TfnDbAmt(Field source) {
       replace(source,0,source.length(),beginDt25TfnDbAmt,DT_25_TFN_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25TfnDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25TfnDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25TfnDbAmt,DT_25_TFN_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25TfnDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25TfnDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt25TfnCrAmt
	 *	@return dt25TfnCrAmt
	 */
   public char[] getDt25TfnCrAmt() throws CFException{
     if (isDt25TfnCrAmtModified()) { 
        dt25TfnCrAmt = refreshDt25TfnCrAmt();
     }
   		return dt25TfnCrAmt;
   }

  
	/**
	*  set variable dt25TfnCrAmt
	*  Corresponding COBOL Variable is DT2-5-TFN-CR-AMT
	*  @param value
	**/
   public void setDt25TfnCrAmt(char[] value) {
      dt25TfnCrAmt = checkDt25TfnCrAmtConstraints(value);
      serializeDt25TfnCrAmt(dt25TfnCrAmt);
   } 

     /**
	 * 	Update Dt25TfnCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt25TfnCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt25TfnCrAmt,dt25TfnCrAmt.length);
   	
   }
   
   public void setDt25TfnCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnCrAmt,dt25TfnCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt25TfnCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt25TfnCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt25TfnCrAmt with another Field
	 *	@param value
	 */
   public void setDt25TfnCrAmt(Field source) {
       replace(source,0,source.length(),beginDt25TfnCrAmt,DT_25_TFN_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt25TfnCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt25TfnCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt25TfnCrAmt,DT_25_TFN_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt25TfnCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt25TfnCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt25TfnCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln5FieldLength() {
			return DT_PAGE_2_LN_5_LENGTH;
		}

}
  
