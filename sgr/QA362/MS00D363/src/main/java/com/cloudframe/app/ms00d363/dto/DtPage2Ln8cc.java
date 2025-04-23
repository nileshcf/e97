package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8cc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8cc extends DtPage2Ln8ccSerialized {
   

						private char[] dt28ccCc = new char[1];



								private char[] dt28ccPosDbNbr = Field.fillLowValue(15);


						private char[] dt28ccPosDbAmt = Field.fillLowValue(18);


								private char[] dt28ccPosCrNbr = Field.fillLowValue(15);


						private char[] dt28ccPosCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8cc
	**/
    public DtPage2Ln8cc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28ccCc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ACCESS CHARGE(POS SUR) REV").toCharArray()
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
	 *	Returns the value of dt28ccCc
	 *	@return dt28ccCc
	 */
   public char[] getDt28ccCc() throws CFException{
     if (isDt28ccCcModified()) { 
        dt28ccCc = refreshDt28ccCc();
     }
   		return dt28ccCc;
   }

  
	/**
	*  set variable dt28ccCc
	*  Corresponding COBOL Variable is DT2-8CC-CC
	*  @param value
	**/
   public void setDt28ccCc(char[] value) {
      dt28ccCc = checkDt28ccCcConstraints(value);
      serializeDt28ccCc(dt28ccCc);
   } 

     /**
	 * 	Update Dt28ccCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28ccCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28ccCc,dt28ccCc.length);
   	
   }
   
   public void setDt28ccCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccCc,dt28ccCc.length);
   	
   }
   
     /**
	 * 	Update Dt28ccCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28ccCc with another Field
	 *	@param value
	 */
   public void setDt28ccCc(Field source) {
       replace(source,0,source.length(),beginDt28ccCc,DT_28CC_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28ccCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28ccCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28ccCc,DT_28CC_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28ccCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28ccPosDbNbr
	 *	@return dt28ccPosDbNbr
	 */
   public char[] getDt28ccPosDbNbr() throws CFException{
     if (isDt28ccPosDbNbrModified()) { 
        dt28ccPosDbNbr = refreshDt28ccPosDbNbr();
     }
   		return dt28ccPosDbNbr;
   }

  
	/**
	*  set variable dt28ccPosDbNbr
	*  Corresponding COBOL Variable is DT2-8CC-POS-DB-NBR
	*  @param value
	**/
   public void setDt28ccPosDbNbr(char[] value) {
      dt28ccPosDbNbr = checkDt28ccPosDbNbrConstraints(value);
      serializeDt28ccPosDbNbr(dt28ccPosDbNbr);
   } 

     /**
	 * 	Update Dt28ccPosDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28ccPosDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28ccPosDbNbr,dt28ccPosDbNbr.length);
   	
   }
   
   public void setDt28ccPosDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbNbr,dt28ccPosDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28ccPosDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28ccPosDbNbr with another Field
	 *	@param value
	 */
   public void setDt28ccPosDbNbr(Field source) {
       replace(source,0,source.length(),beginDt28ccPosDbNbr,DT_28CC_POS_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28ccPosDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28ccPosDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28ccPosDbNbr,DT_28CC_POS_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28ccPosDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28ccPosDbAmt
	 *	@return dt28ccPosDbAmt
	 */
   public char[] getDt28ccPosDbAmt() throws CFException{
     if (isDt28ccPosDbAmtModified()) { 
        dt28ccPosDbAmt = refreshDt28ccPosDbAmt();
     }
   		return dt28ccPosDbAmt;
   }

  
	/**
	*  set variable dt28ccPosDbAmt
	*  Corresponding COBOL Variable is DT2-8CC-POS-DB-AMT
	*  @param value
	**/
   public void setDt28ccPosDbAmt(char[] value) {
      dt28ccPosDbAmt = checkDt28ccPosDbAmtConstraints(value);
      serializeDt28ccPosDbAmt(dt28ccPosDbAmt);
   } 

     /**
	 * 	Update Dt28ccPosDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28ccPosDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28ccPosDbAmt,dt28ccPosDbAmt.length);
   	
   }
   
   public void setDt28ccPosDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbAmt,dt28ccPosDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28ccPosDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28ccPosDbAmt with another Field
	 *	@param value
	 */
   public void setDt28ccPosDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28ccPosDbAmt,DT_28CC_POS_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28ccPosDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28ccPosDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28ccPosDbAmt,DT_28CC_POS_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28ccPosDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28ccPosCrNbr
	 *	@return dt28ccPosCrNbr
	 */
   public char[] getDt28ccPosCrNbr() throws CFException{
     if (isDt28ccPosCrNbrModified()) { 
        dt28ccPosCrNbr = refreshDt28ccPosCrNbr();
     }
   		return dt28ccPosCrNbr;
   }

  
	/**
	*  set variable dt28ccPosCrNbr
	*  Corresponding COBOL Variable is DT2-8CC-POS-CR-NBR
	*  @param value
	**/
   public void setDt28ccPosCrNbr(char[] value) {
      dt28ccPosCrNbr = checkDt28ccPosCrNbrConstraints(value);
      serializeDt28ccPosCrNbr(dt28ccPosCrNbr);
   } 

     /**
	 * 	Update Dt28ccPosCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28ccPosCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28ccPosCrNbr,dt28ccPosCrNbr.length);
   	
   }
   
   public void setDt28ccPosCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrNbr,dt28ccPosCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28ccPosCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28ccPosCrNbr with another Field
	 *	@param value
	 */
   public void setDt28ccPosCrNbr(Field source) {
       replace(source,0,source.length(),beginDt28ccPosCrNbr,DT_28CC_POS_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28ccPosCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28ccPosCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28ccPosCrNbr,DT_28CC_POS_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28ccPosCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28ccPosCrAmt
	 *	@return dt28ccPosCrAmt
	 */
   public char[] getDt28ccPosCrAmt() throws CFException{
     if (isDt28ccPosCrAmtModified()) { 
        dt28ccPosCrAmt = refreshDt28ccPosCrAmt();
     }
   		return dt28ccPosCrAmt;
   }

  
	/**
	*  set variable dt28ccPosCrAmt
	*  Corresponding COBOL Variable is DT2-8CC-POS-CR-AMT
	*  @param value
	**/
   public void setDt28ccPosCrAmt(char[] value) {
      dt28ccPosCrAmt = checkDt28ccPosCrAmtConstraints(value);
      serializeDt28ccPosCrAmt(dt28ccPosCrAmt);
   } 

     /**
	 * 	Update Dt28ccPosCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28ccPosCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28ccPosCrAmt,dt28ccPosCrAmt.length);
   	
   }
   
   public void setDt28ccPosCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrAmt,dt28ccPosCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28ccPosCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28ccPosCrAmt with another Field
	 *	@param value
	 */
   public void setDt28ccPosCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28ccPosCrAmt,DT_28CC_POS_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28ccPosCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28ccPosCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28ccPosCrAmt,DT_28CC_POS_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28ccPosCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28ccPosCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28ccPosCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8ccFieldLength() {
			return DT_PAGE_2_LN_8CC_LENGTH;
		}

}
  
