package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln1 extends DtPage2Ln1Serialized {
   

						private char[] dt21Cc = new char[1];



								private char[] dt21FinDbNbr = Field.fillLowValue(15);


						private char[] dt21FinDbAmt = Field.fillLowValue(18);


								private char[] dt21FinCrNbr = Field.fillLowValue(15);


						private char[] dt21FinCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln1
	**/
    public DtPage2Ln1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt21Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT              ").toCharArray()
             , getStartOffset() + 4
             ,24
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
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }


 

	/**
	 *	Returns the value of dt21Cc
	 *	@return dt21Cc
	 */
   public char[] getDt21Cc() throws CFException{
     if (isDt21CcModified()) { 
        dt21Cc = refreshDt21Cc();
     }
   		return dt21Cc;
   }

  
	/**
	*  set variable dt21Cc
	*  Corresponding COBOL Variable is DT2-1-CC
	*  @param value
	**/
   public void setDt21Cc(char[] value) {
      dt21Cc = checkDt21CcConstraints(value);
      serializeDt21Cc(dt21Cc);
   } 

     /**
	 * 	Update Dt21Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt21Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt21Cc,dt21Cc.length);
   	
   }
   
   public void setDt21Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt21Cc,dt21Cc.length);
   	
   }
   
     /**
	 * 	Update Dt21Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt21Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt21Cc with another Field
	 *	@param value
	 */
   public void setDt21Cc(Field source) {
       replace(source,0,source.length(),beginDt21Cc,DT_21_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt21Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt21Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt21Cc,DT_21_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt21Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt21Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt21FinDbNbr
	 *	@return dt21FinDbNbr
	 */
   public char[] getDt21FinDbNbr() throws CFException{
     if (isDt21FinDbNbrModified()) { 
        dt21FinDbNbr = refreshDt21FinDbNbr();
     }
   		return dt21FinDbNbr;
   }

  
	/**
	*  set variable dt21FinDbNbr
	*  Corresponding COBOL Variable is DT2-1-FIN-DB-NBR
	*  @param value
	**/
   public void setDt21FinDbNbr(char[] value) {
      dt21FinDbNbr = checkDt21FinDbNbrConstraints(value);
      serializeDt21FinDbNbr(dt21FinDbNbr);
   } 

     /**
	 * 	Update Dt21FinDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt21FinDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt21FinDbNbr,dt21FinDbNbr.length);
   	
   }
   
   public void setDt21FinDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbNbr,dt21FinDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt21FinDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt21FinDbNbr with another Field
	 *	@param value
	 */
   public void setDt21FinDbNbr(Field source) {
       replace(source,0,source.length(),beginDt21FinDbNbr,DT_21_FIN_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt21FinDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt21FinDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt21FinDbNbr,DT_21_FIN_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt21FinDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt21FinDbAmt
	 *	@return dt21FinDbAmt
	 */
   public char[] getDt21FinDbAmt() throws CFException{
     if (isDt21FinDbAmtModified()) { 
        dt21FinDbAmt = refreshDt21FinDbAmt();
     }
   		return dt21FinDbAmt;
   }

  
	/**
	*  set variable dt21FinDbAmt
	*  Corresponding COBOL Variable is DT2-1-FIN-DB-AMT
	*  @param value
	**/
   public void setDt21FinDbAmt(char[] value) {
      dt21FinDbAmt = checkDt21FinDbAmtConstraints(value);
      serializeDt21FinDbAmt(dt21FinDbAmt);
   } 

     /**
	 * 	Update Dt21FinDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt21FinDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt21FinDbAmt,dt21FinDbAmt.length);
   	
   }
   
   public void setDt21FinDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbAmt,dt21FinDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt21FinDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt21FinDbAmt with another Field
	 *	@param value
	 */
   public void setDt21FinDbAmt(Field source) {
       replace(source,0,source.length(),beginDt21FinDbAmt,DT_21_FIN_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt21FinDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt21FinDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt21FinDbAmt,DT_21_FIN_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt21FinDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt21FinCrNbr
	 *	@return dt21FinCrNbr
	 */
   public char[] getDt21FinCrNbr() throws CFException{
     if (isDt21FinCrNbrModified()) { 
        dt21FinCrNbr = refreshDt21FinCrNbr();
     }
   		return dt21FinCrNbr;
   }

  
	/**
	*  set variable dt21FinCrNbr
	*  Corresponding COBOL Variable is DT2-1-FIN-CR-NBR
	*  @param value
	**/
   public void setDt21FinCrNbr(char[] value) {
      dt21FinCrNbr = checkDt21FinCrNbrConstraints(value);
      serializeDt21FinCrNbr(dt21FinCrNbr);
   } 

     /**
	 * 	Update Dt21FinCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt21FinCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt21FinCrNbr,dt21FinCrNbr.length);
   	
   }
   
   public void setDt21FinCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrNbr,dt21FinCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt21FinCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt21FinCrNbr with another Field
	 *	@param value
	 */
   public void setDt21FinCrNbr(Field source) {
       replace(source,0,source.length(),beginDt21FinCrNbr,DT_21_FIN_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt21FinCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt21FinCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt21FinCrNbr,DT_21_FIN_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt21FinCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt21FinCrAmt
	 *	@return dt21FinCrAmt
	 */
   public char[] getDt21FinCrAmt() throws CFException{
     if (isDt21FinCrAmtModified()) { 
        dt21FinCrAmt = refreshDt21FinCrAmt();
     }
   		return dt21FinCrAmt;
   }

  
	/**
	*  set variable dt21FinCrAmt
	*  Corresponding COBOL Variable is DT2-1-FIN-CR-AMT
	*  @param value
	**/
   public void setDt21FinCrAmt(char[] value) {
      dt21FinCrAmt = checkDt21FinCrAmtConstraints(value);
      serializeDt21FinCrAmt(dt21FinCrAmt);
   } 

     /**
	 * 	Update Dt21FinCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt21FinCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt21FinCrAmt,dt21FinCrAmt.length);
   	
   }
   
   public void setDt21FinCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrAmt,dt21FinCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt21FinCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt21FinCrAmt with another Field
	 *	@param value
	 */
   public void setDt21FinCrAmt(Field source) {
       replace(source,0,source.length(),beginDt21FinCrAmt,DT_21_FIN_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt21FinCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt21FinCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt21FinCrAmt,DT_21_FIN_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt21FinCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt21FinCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt21FinCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln1FieldLength() {
			return DT_PAGE_2_LN_1_LENGTH;
		}

}
  
