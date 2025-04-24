package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8bb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln8bb extends DtPage2Ln8bbSerialized { 
   

						private char[] dt28bbCc = new char[1];



								private char[] dt28bbAtmDbNbr = Field.fillLowValue(15);


						private char[] dt28bbAtmDbAmt = Field.fillLowValue(18);


								private char[] dt28bbAtmCrNbr = Field.fillLowValue(15);


						private char[] dt28bbAtmCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8bb
	**/
    public DtPage2Ln8bb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28bbCc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ACCESS CHARGE(ATM SUR) REV").toCharArray()
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
	 *	Returns the value of dt28bbCc
	 *	@return dt28bbCc
	 */
   public char[] getDt28bbCc() throws CFException{
     if (isDt28bbCcModified()) { 
        dt28bbCc = refreshDt28bbCc();
     }
   		return dt28bbCc;
   }

  
	/**
	*  set variable dt28bbCc
	*  Corresponding COBOL Variable is DT2-8BB-CC
	*  @param value
	**/
   public void setDt28bbCc(char[] value) {
      dt28bbCc = checkDt28bbCcConstraints(value);
      serializeDt28bbCc(dt28bbCc);
   } 

     /**
	 * 	Update Dt28bbCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bbCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bbCc,dt28bbCc.length);
   	
   }
   
   public void setDt28bbCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbCc,dt28bbCc.length);
   	
   }
   
     /**
	 * 	Update Dt28bbCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bbCc with another Field
	 *	@param value
	 */
   public void setDt28bbCc(Field source) {
       replace(source,0,source.length(),beginDt28bbCc,DT_28BB_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bbCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bbCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bbCc,DT_28BB_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bbCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bbAtmDbNbr
	 *	@return dt28bbAtmDbNbr
	 */
   public char[] getDt28bbAtmDbNbr() throws CFException{
     if (isDt28bbAtmDbNbrModified()) { 
        dt28bbAtmDbNbr = refreshDt28bbAtmDbNbr();
     }
   		return dt28bbAtmDbNbr;
   }

  
	/**
	*  set variable dt28bbAtmDbNbr
	*  Corresponding COBOL Variable is DT2-8BB-ATM-DB-NBR
	*  @param value
	**/
   public void setDt28bbAtmDbNbr(char[] value) {
      dt28bbAtmDbNbr = checkDt28bbAtmDbNbrConstraints(value);
      serializeDt28bbAtmDbNbr(dt28bbAtmDbNbr);
   } 

     /**
	 * 	Update Dt28bbAtmDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bbAtmDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bbAtmDbNbr,dt28bbAtmDbNbr.length);
   	
   }
   
   public void setDt28bbAtmDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbNbr,dt28bbAtmDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bbAtmDbNbr with another Field
	 *	@param value
	 */
   public void setDt28bbAtmDbNbr(Field source) {
       replace(source,0,source.length(),beginDt28bbAtmDbNbr,DT_28BB_ATM_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bbAtmDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bbAtmDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbNbr,DT_28BB_ATM_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bbAtmDbAmt
	 *	@return dt28bbAtmDbAmt
	 */
   public char[] getDt28bbAtmDbAmt() throws CFException{
     if (isDt28bbAtmDbAmtModified()) { 
        dt28bbAtmDbAmt = refreshDt28bbAtmDbAmt();
     }
   		return dt28bbAtmDbAmt;
   }

  
	/**
	*  set variable dt28bbAtmDbAmt
	*  Corresponding COBOL Variable is DT2-8BB-ATM-DB-AMT
	*  @param value
	**/
   public void setDt28bbAtmDbAmt(char[] value) {
      dt28bbAtmDbAmt = checkDt28bbAtmDbAmtConstraints(value);
      serializeDt28bbAtmDbAmt(dt28bbAtmDbAmt);
   } 

     /**
	 * 	Update Dt28bbAtmDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bbAtmDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bbAtmDbAmt,dt28bbAtmDbAmt.length);
   	
   }
   
   public void setDt28bbAtmDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbAmt,dt28bbAtmDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bbAtmDbAmt with another Field
	 *	@param value
	 */
   public void setDt28bbAtmDbAmt(Field source) {
       replace(source,0,source.length(),beginDt28bbAtmDbAmt,DT_28BB_ATM_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bbAtmDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bbAtmDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbAmt,DT_28BB_ATM_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bbAtmCrNbr
	 *	@return dt28bbAtmCrNbr
	 */
   public char[] getDt28bbAtmCrNbr() throws CFException{
     if (isDt28bbAtmCrNbrModified()) { 
        dt28bbAtmCrNbr = refreshDt28bbAtmCrNbr();
     }
   		return dt28bbAtmCrNbr;
   }

  
	/**
	*  set variable dt28bbAtmCrNbr
	*  Corresponding COBOL Variable is DT2-8BB-ATM-CR-NBR
	*  @param value
	**/
   public void setDt28bbAtmCrNbr(char[] value) {
      dt28bbAtmCrNbr = checkDt28bbAtmCrNbrConstraints(value);
      serializeDt28bbAtmCrNbr(dt28bbAtmCrNbr);
   } 

     /**
	 * 	Update Dt28bbAtmCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bbAtmCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bbAtmCrNbr,dt28bbAtmCrNbr.length);
   	
   }
   
   public void setDt28bbAtmCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrNbr,dt28bbAtmCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bbAtmCrNbr with another Field
	 *	@param value
	 */
   public void setDt28bbAtmCrNbr(Field source) {
       replace(source,0,source.length(),beginDt28bbAtmCrNbr,DT_28BB_ATM_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bbAtmCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bbAtmCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrNbr,DT_28BB_ATM_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt28bbAtmCrAmt
	 *	@return dt28bbAtmCrAmt
	 */
   public char[] getDt28bbAtmCrAmt() throws CFException{
     if (isDt28bbAtmCrAmtModified()) { 
        dt28bbAtmCrAmt = refreshDt28bbAtmCrAmt();
     }
   		return dt28bbAtmCrAmt;
   }

  
	/**
	*  set variable dt28bbAtmCrAmt
	*  Corresponding COBOL Variable is DT2-8BB-ATM-CR-AMT
	*  @param value
	**/
   public void setDt28bbAtmCrAmt(char[] value) {
      dt28bbAtmCrAmt = checkDt28bbAtmCrAmtConstraints(value);
      serializeDt28bbAtmCrAmt(dt28bbAtmCrAmt);
   } 

     /**
	 * 	Update Dt28bbAtmCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt28bbAtmCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt28bbAtmCrAmt,dt28bbAtmCrAmt.length);
   	
   }
   
   public void setDt28bbAtmCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrAmt,dt28bbAtmCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt28bbAtmCrAmt with another Field
	 *	@param value
	 */
   public void setDt28bbAtmCrAmt(Field source) {
       replace(source,0,source.length(),beginDt28bbAtmCrAmt,DT_28BB_ATM_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt28bbAtmCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt28bbAtmCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrAmt,DT_28BB_ATM_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt28bbAtmCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt28bbAtmCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt28bbAtmCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln8bbFieldLength() {
			return DT_PAGE_2_LN_8BB_LENGTH;
		}

}
  
