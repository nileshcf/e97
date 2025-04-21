package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8 extends DtPage2Ln8Serialized {
   

						private char[] dt28Cc = new char[1];



								private char[] dt28AtmDbNbr = Field.fillLowValue(15);


						private char[] dt28AtmDbAmt = Field.fillLowValue(18);


								private char[] dt28AtmCrNbr = Field.fillLowValue(15);


						private char[] dt28AtmCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8
	**/
    public DtPage2Ln8() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28Cc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ACCESS CHARGE(ATM SURCHRG)").toCharArray()
             , getStartOffset() + 2
             ,26
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
	 *	Returns the value of dt28Cc
	 *	@return dt28Cc
	 */
   public char[] getDt28Cc() throws CFException{
     if (isDt28CcModified()) { 
        dt28Cc = refreshDt28Cc();
     }
   		return dt28Cc;
   }

  
	/**
	*  set variable dt28Cc
	*  Corresponding COBOL Variable is DT2-8-CC
	*  @param value
	**/
   public void setDt28Cc(char[] value) {
      dt28Cc = checkDt28CcConstraints(value);
      serializeDt28Cc(dt28Cc);
   } 

     /**
	 * 	Update Dt28Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28Cc,dt28Cc.length);
   	
   }
   
   public void setDt28Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28Cc,dt28Cc.length);
   	
   }
   
     /**
	 * 	Update Dt28Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28Cc with another Field
	 *	@param value
	 */
   public void setDt28Cc(Field source) {
       replace(source,0,source.length(),beginDt28Cc,DT_28_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28Cc,DT_28_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28AtmDbNbr
	 *	@return dt28AtmDbNbr
	 */
   public char[] getDt28AtmDbNbr() throws CFException{
     if (isDt28AtmDbNbrModified()) { 
        dt28AtmDbNbr = refreshDt28AtmDbNbr();
     }
   		return dt28AtmDbNbr;
   }

  
	/**
	*  set variable dt28AtmDbNbr
	*  Corresponding COBOL Variable is DT2-8-ATM-DB-NBR
	*  @param value
	**/
   public void setDt28AtmDbNbr(char[] value) {
      dt28AtmDbNbr = checkDt28AtmDbNbrConstraints(value);
      serializeDt28AtmDbNbr(dt28AtmDbNbr);
   } 

     /**
	 * 	Update Dt28AtmDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28AtmDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28AtmDbNbr,dt28AtmDbNbr.length);
   	
   }
   
   public void setDt28AtmDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbNbr,dt28AtmDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28AtmDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28AtmDbNbr with another Field
	 *	@param value
	 */
   public void setDt28AtmDbNbr(Field source) {
       replace(source,0,source.length(),beginDt28AtmDbNbr,DT_28_ATM_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28AtmDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28AtmDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28AtmDbNbr,DT_28_ATM_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28AtmDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28AtmDbAmt
	 *	@return dt28AtmDbAmt
	 */
   public char[] getDt28AtmDbAmt() throws CFException{
     if (isDt28AtmDbAmtModified()) { 
        dt28AtmDbAmt = refreshDt28AtmDbAmt();
     }
   		return dt28AtmDbAmt;
   }

  
	/**
	*  set variable dt28AtmDbAmt
	*  Corresponding COBOL Variable is DT2-8-ATM-DB-AMT
	*  @param value
	**/
   public void setDt28AtmDbAmt(char[] value) {
      dt28AtmDbAmt = checkDt28AtmDbAmtConstraints(value);
      serializeDt28AtmDbAmt(dt28AtmDbAmt);
   } 

     /**
	 * 	Update Dt28AtmDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28AtmDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28AtmDbAmt,dt28AtmDbAmt.length);
   	
   }
   
   public void setDt28AtmDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbAmt,dt28AtmDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28AtmDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28AtmDbAmt with another Field
	 *	@param value
	 */
   public void setDt28AtmDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28AtmDbAmt,DT_28_ATM_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28AtmDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28AtmDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28AtmDbAmt,DT_28_ATM_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28AtmDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28AtmCrNbr
	 *	@return dt28AtmCrNbr
	 */
   public char[] getDt28AtmCrNbr() throws CFException{
     if (isDt28AtmCrNbrModified()) { 
        dt28AtmCrNbr = refreshDt28AtmCrNbr();
     }
   		return dt28AtmCrNbr;
   }

  
	/**
	*  set variable dt28AtmCrNbr
	*  Corresponding COBOL Variable is DT2-8-ATM-CR-NBR
	*  @param value
	**/
   public void setDt28AtmCrNbr(char[] value) {
      dt28AtmCrNbr = checkDt28AtmCrNbrConstraints(value);
      serializeDt28AtmCrNbr(dt28AtmCrNbr);
   } 

     /**
	 * 	Update Dt28AtmCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28AtmCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28AtmCrNbr,dt28AtmCrNbr.length);
   	
   }
   
   public void setDt28AtmCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrNbr,dt28AtmCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28AtmCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28AtmCrNbr with another Field
	 *	@param value
	 */
   public void setDt28AtmCrNbr(Field source) {
       replace(source,0,source.length(),beginDt28AtmCrNbr,DT_28_ATM_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28AtmCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28AtmCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28AtmCrNbr,DT_28_ATM_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28AtmCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28AtmCrAmt
	 *	@return dt28AtmCrAmt
	 */
   public char[] getDt28AtmCrAmt() throws CFException{
     if (isDt28AtmCrAmtModified()) { 
        dt28AtmCrAmt = refreshDt28AtmCrAmt();
     }
   		return dt28AtmCrAmt;
   }

  
	/**
	*  set variable dt28AtmCrAmt
	*  Corresponding COBOL Variable is DT2-8-ATM-CR-AMT
	*  @param value
	**/
   public void setDt28AtmCrAmt(char[] value) {
      dt28AtmCrAmt = checkDt28AtmCrAmtConstraints(value);
      serializeDt28AtmCrAmt(dt28AtmCrAmt);
   } 

     /**
	 * 	Update Dt28AtmCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28AtmCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28AtmCrAmt,dt28AtmCrAmt.length);
   	
   }
   
   public void setDt28AtmCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrAmt,dt28AtmCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28AtmCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28AtmCrAmt with another Field
	 *	@param value
	 */
   public void setDt28AtmCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28AtmCrAmt,DT_28_ATM_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28AtmCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28AtmCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28AtmCrAmt,DT_28_ATM_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28AtmCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28AtmCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28AtmCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8FieldLength() {
			return DT_PAGE_2_LN_8_LENGTH;
		}

}
  
