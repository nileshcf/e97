package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8aa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8aa extends DtPage2Ln8aaSerialized {
   

						private char[] dt28aaCc = new char[1];



								private char[] dt28aaPosDbNbr = Field.fillLowValue(15);


						private char[] dt28aaPosDbAmt = Field.fillLowValue(18);


								private char[] dt28aaPosCrNbr = Field.fillLowValue(15);


						private char[] dt28aaPosCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8aa
	**/
    public DtPage2Ln8aa() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28aaCc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ACCESS CHARGE(POS SURCHRG)").toCharArray()
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
	 *	Returns the value of dt28aaCc
	 *	@return dt28aaCc
	 */
   public char[] getDt28aaCc() throws CFException{
     if (isDt28aaCcModified()) { 
        dt28aaCc = refreshDt28aaCc();
     }
   		return dt28aaCc;
   }

  
	/**
	*  set variable dt28aaCc
	*  Corresponding COBOL Variable is DT2-8AA-CC
	*  @param value
	**/
   public void setDt28aaCc(char[] value) {
      dt28aaCc = checkDt28aaCcConstraints(value);
      serializeDt28aaCc(dt28aaCc);
   } 

     /**
	 * 	Update Dt28aaCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aaCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aaCc,dt28aaCc.length);
   	
   }
   
   public void setDt28aaCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaCc,dt28aaCc.length);
   	
   }
   
     /**
	 * 	Update Dt28aaCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aaCc with another Field
	 *	@param value
	 */
   public void setDt28aaCc(Field source) {
       replace(source,0,source.length(),beginDt28aaCc,DT_28AA_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aaCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aaCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aaCc,DT_28AA_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aaCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aaPosDbNbr
	 *	@return dt28aaPosDbNbr
	 */
   public char[] getDt28aaPosDbNbr() throws CFException{
     if (isDt28aaPosDbNbrModified()) { 
        dt28aaPosDbNbr = refreshDt28aaPosDbNbr();
     }
   		return dt28aaPosDbNbr;
   }

  
	/**
	*  set variable dt28aaPosDbNbr
	*  Corresponding COBOL Variable is DT2-8AA-POS-DB-NBR
	*  @param value
	**/
   public void setDt28aaPosDbNbr(char[] value) {
      dt28aaPosDbNbr = checkDt28aaPosDbNbrConstraints(value);
      serializeDt28aaPosDbNbr(dt28aaPosDbNbr);
   } 

     /**
	 * 	Update Dt28aaPosDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aaPosDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aaPosDbNbr,dt28aaPosDbNbr.length);
   	
   }
   
   public void setDt28aaPosDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbNbr,dt28aaPosDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28aaPosDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aaPosDbNbr with another Field
	 *	@param value
	 */
   public void setDt28aaPosDbNbr(Field source) {
       replace(source,0,source.length(),beginDt28aaPosDbNbr,DT_28AA_POS_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aaPosDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aaPosDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aaPosDbNbr,DT_28AA_POS_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aaPosDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aaPosDbAmt
	 *	@return dt28aaPosDbAmt
	 */
   public char[] getDt28aaPosDbAmt() throws CFException{
     if (isDt28aaPosDbAmtModified()) { 
        dt28aaPosDbAmt = refreshDt28aaPosDbAmt();
     }
   		return dt28aaPosDbAmt;
   }

  
	/**
	*  set variable dt28aaPosDbAmt
	*  Corresponding COBOL Variable is DT2-8AA-POS-DB-AMT
	*  @param value
	**/
   public void setDt28aaPosDbAmt(char[] value) {
      dt28aaPosDbAmt = checkDt28aaPosDbAmtConstraints(value);
      serializeDt28aaPosDbAmt(dt28aaPosDbAmt);
   } 

     /**
	 * 	Update Dt28aaPosDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aaPosDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aaPosDbAmt,dt28aaPosDbAmt.length);
   	
   }
   
   public void setDt28aaPosDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbAmt,dt28aaPosDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28aaPosDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aaPosDbAmt with another Field
	 *	@param value
	 */
   public void setDt28aaPosDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28aaPosDbAmt,DT_28AA_POS_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aaPosDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aaPosDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aaPosDbAmt,DT_28AA_POS_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aaPosDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aaPosCrNbr
	 *	@return dt28aaPosCrNbr
	 */
   public char[] getDt28aaPosCrNbr() throws CFException{
     if (isDt28aaPosCrNbrModified()) { 
        dt28aaPosCrNbr = refreshDt28aaPosCrNbr();
     }
   		return dt28aaPosCrNbr;
   }

  
	/**
	*  set variable dt28aaPosCrNbr
	*  Corresponding COBOL Variable is DT2-8AA-POS-CR-NBR
	*  @param value
	**/
   public void setDt28aaPosCrNbr(char[] value) {
      dt28aaPosCrNbr = checkDt28aaPosCrNbrConstraints(value);
      serializeDt28aaPosCrNbr(dt28aaPosCrNbr);
   } 

     /**
	 * 	Update Dt28aaPosCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aaPosCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aaPosCrNbr,dt28aaPosCrNbr.length);
   	
   }
   
   public void setDt28aaPosCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrNbr,dt28aaPosCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28aaPosCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aaPosCrNbr with another Field
	 *	@param value
	 */
   public void setDt28aaPosCrNbr(Field source) {
       replace(source,0,source.length(),beginDt28aaPosCrNbr,DT_28AA_POS_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aaPosCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aaPosCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aaPosCrNbr,DT_28AA_POS_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aaPosCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28aaPosCrAmt
	 *	@return dt28aaPosCrAmt
	 */
   public char[] getDt28aaPosCrAmt() throws CFException{
     if (isDt28aaPosCrAmtModified()) { 
        dt28aaPosCrAmt = refreshDt28aaPosCrAmt();
     }
   		return dt28aaPosCrAmt;
   }

  
	/**
	*  set variable dt28aaPosCrAmt
	*  Corresponding COBOL Variable is DT2-8AA-POS-CR-AMT
	*  @param value
	**/
   public void setDt28aaPosCrAmt(char[] value) {
      dt28aaPosCrAmt = checkDt28aaPosCrAmtConstraints(value);
      serializeDt28aaPosCrAmt(dt28aaPosCrAmt);
   } 

     /**
	 * 	Update Dt28aaPosCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28aaPosCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28aaPosCrAmt,dt28aaPosCrAmt.length);
   	
   }
   
   public void setDt28aaPosCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrAmt,dt28aaPosCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28aaPosCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28aaPosCrAmt with another Field
	 *	@param value
	 */
   public void setDt28aaPosCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28aaPosCrAmt,DT_28AA_POS_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28aaPosCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28aaPosCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28aaPosCrAmt,DT_28AA_POS_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28aaPosCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28aaPosCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28aaPosCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8aaFieldLength() {
			return DT_PAGE_2_LN_8AA_LENGTH;
		}

}
  
