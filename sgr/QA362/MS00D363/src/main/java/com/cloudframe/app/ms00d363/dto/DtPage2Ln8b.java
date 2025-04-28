package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8b is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8b extends DtPage2Ln8bSerialized {
   

						private char[] dt28bCc = new char[1];





						private char[] dt28bIccrDbAmt = Field.fillLowValue(18);




						private char[] dt28bIccrCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8b
	**/
    public DtPage2Ln8b() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28bCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL ICCR                ").toCharArray()
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
	 *	Returns the value of dt28bCc
	 *	@return dt28bCc
	 */
   public char[] getDt28bCc() throws CFException{
     if (isDt28bCcModified()) { 
        dt28bCc = refreshDt28bCc();
     }
   		return dt28bCc;
   }

  
	/**
	*  set variable dt28bCc
	*  Corresponding COBOL Variable is DT2-8B-CC
	*  @param value
	**/
   public void setDt28bCc(char[] value) {
      dt28bCc = checkDt28bCcConstraints(value);
      serializeDt28bCc(dt28bCc);
   } 

     /**
	 * 	Update Dt28bCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bCc,dt28bCc.length);
   	
   }
   
   public void setDt28bCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bCc,dt28bCc.length);
   	
   }
   
     /**
	 * 	Update Dt28bCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bCc with another Field
	 *	@param value
	 */
   public void setDt28bCc(Field source) {
       replace(source,0,source.length(),beginDt28bCc,DT_28B_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bCc,DT_28B_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bIccrDbAmt
	 *	@return dt28bIccrDbAmt
	 */
   public char[] getDt28bIccrDbAmt() throws CFException{
     if (isDt28bIccrDbAmtModified()) { 
        dt28bIccrDbAmt = refreshDt28bIccrDbAmt();
     }
   		return dt28bIccrDbAmt;
   }

  
	/**
	*  set variable dt28bIccrDbAmt
	*  Corresponding COBOL Variable is DT2-8B-ICCR-DB-AMT
	*  @param value
	**/
   public void setDt28bIccrDbAmt(char[] value) {
      dt28bIccrDbAmt = checkDt28bIccrDbAmtConstraints(value);
      serializeDt28bIccrDbAmt(dt28bIccrDbAmt);
   } 

     /**
	 * 	Update Dt28bIccrDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bIccrDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bIccrDbAmt,dt28bIccrDbAmt.length);
   	
   }
   
   public void setDt28bIccrDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrDbAmt,dt28bIccrDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28bIccrDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bIccrDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bIccrDbAmt with another Field
	 *	@param value
	 */
   public void setDt28bIccrDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28bIccrDbAmt,DT_28B_ICCR_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bIccrDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bIccrDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bIccrDbAmt,DT_28B_ICCR_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bIccrDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bIccrDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bIccrCrAmt
	 *	@return dt28bIccrCrAmt
	 */
   public char[] getDt28bIccrCrAmt() throws CFException{
     if (isDt28bIccrCrAmtModified()) { 
        dt28bIccrCrAmt = refreshDt28bIccrCrAmt();
     }
   		return dt28bIccrCrAmt;
   }

  
	/**
	*  set variable dt28bIccrCrAmt
	*  Corresponding COBOL Variable is DT2-8B-ICCR-CR-AMT
	*  @param value
	**/
   public void setDt28bIccrCrAmt(char[] value) {
      dt28bIccrCrAmt = checkDt28bIccrCrAmtConstraints(value);
      serializeDt28bIccrCrAmt(dt28bIccrCrAmt);
   } 

     /**
	 * 	Update Dt28bIccrCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bIccrCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bIccrCrAmt,dt28bIccrCrAmt.length);
   	
   }
   
   public void setDt28bIccrCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrCrAmt,dt28bIccrCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28bIccrCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bIccrCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bIccrCrAmt with another Field
	 *	@param value
	 */
   public void setDt28bIccrCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28bIccrCrAmt,DT_28B_ICCR_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bIccrCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bIccrCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bIccrCrAmt,DT_28B_ICCR_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bIccrCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bIccrCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bIccrCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8bFieldLength() {
			return DT_PAGE_2_LN_8B_LENGTH;
		}

}
  
