package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8a extends DtPage2Ln8aSerialized {
   

						private char[] dt28aCc = new char[1];





						private char[] dt28aCcaDbAmt = Field.fillLowValue(18);




						private char[] dt28aCcaCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8a
	**/
    public DtPage2Ln8a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28aCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL CCA                 ").toCharArray()
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
             fillSpace(29)
             , getStartOffset() + 102
             ,29
             );
    }


 

	/**
	 *	Returns the value of dt28aCc
	 *	@return dt28aCc
	 */
   public char[] getDt28aCc() throws CFException{
     if (isDt28aCcModified()) { 
        dt28aCc = refreshDt28aCc();
     }
   		return dt28aCc;
   }

  
	/**
	*  set variable dt28aCc
	*  Corresponding COBOL Variable is DT2-8A-CC
	*  @param value
	**/
   public void setDt28aCc(char[] value) {
      dt28aCc = checkDt28aCcConstraints(value);
      serializeDt28aCc(dt28aCc);
   } 

     /**
	 * 	Update Dt28aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aCc,dt28aCc.length);
   	
   }
   
   public void setDt28aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCc,dt28aCc.length);
   	
   }
   
     /**
	 * 	Update Dt28aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aCc with another Field
	 *	@param value
	 */
   public void setDt28aCc(Field source) {
       replace(source,0,source.length(),beginDt28aCc,DT_28A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aCc,DT_28A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aCcaDbAmt
	 *	@return dt28aCcaDbAmt
	 */
   public char[] getDt28aCcaDbAmt() throws CFException{
     if (isDt28aCcaDbAmtModified()) { 
        dt28aCcaDbAmt = refreshDt28aCcaDbAmt();
     }
   		return dt28aCcaDbAmt;
   }

  
	/**
	*  set variable dt28aCcaDbAmt
	*  Corresponding COBOL Variable is DT2-8A-CCA-DB-AMT
	*  @param value
	**/
   public void setDt28aCcaDbAmt(char[] value) {
      dt28aCcaDbAmt = checkDt28aCcaDbAmtConstraints(value);
      serializeDt28aCcaDbAmt(dt28aCcaDbAmt);
   } 

     /**
	 * 	Update Dt28aCcaDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aCcaDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aCcaDbAmt,dt28aCcaDbAmt.length);
   	
   }
   
   public void setDt28aCcaDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaDbAmt,dt28aCcaDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28aCcaDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCcaDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aCcaDbAmt with another Field
	 *	@param value
	 */
   public void setDt28aCcaDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28aCcaDbAmt,DT_28A_CCA_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aCcaDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aCcaDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aCcaDbAmt,DT_28A_CCA_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aCcaDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCcaDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aCcaCrAmt
	 *	@return dt28aCcaCrAmt
	 */
   public char[] getDt28aCcaCrAmt() throws CFException{
     if (isDt28aCcaCrAmtModified()) { 
        dt28aCcaCrAmt = refreshDt28aCcaCrAmt();
     }
   		return dt28aCcaCrAmt;
   }

  
	/**
	*  set variable dt28aCcaCrAmt
	*  Corresponding COBOL Variable is DT2-8A-CCA-CR-AMT
	*  @param value
	**/
   public void setDt28aCcaCrAmt(char[] value) {
      dt28aCcaCrAmt = checkDt28aCcaCrAmtConstraints(value);
      serializeDt28aCcaCrAmt(dt28aCcaCrAmt);
   } 

     /**
	 * 	Update Dt28aCcaCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aCcaCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aCcaCrAmt,dt28aCcaCrAmt.length);
   	
   }
   
   public void setDt28aCcaCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaCrAmt,dt28aCcaCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28aCcaCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCcaCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aCcaCrAmt with another Field
	 *	@param value
	 */
   public void setDt28aCcaCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28aCcaCrAmt,DT_28A_CCA_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aCcaCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aCcaCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aCcaCrAmt,DT_28A_CCA_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aCcaCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aCcaCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aCcaCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8aFieldLength() {
			return DT_PAGE_2_LN_8A_LENGTH;
		}

}
  
