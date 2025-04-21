package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln4 extends DtPage2Ln4Serialized {
   

						private char[] dt24Cc = new char[1];



								private char[] dt24TrvDbNbr = Field.fillLowValue(15);


						private char[] dt24TrvDbAmt = Field.fillLowValue(18);


								private char[] dt24TrvCrNbr = Field.fillLowValue(15);


						private char[] dt24TrvCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln4
	**/
    public DtPage2Ln4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt24Cc(("0").toCharArray());
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
	 *	Returns the value of dt24Cc
	 *	@return dt24Cc
	 */
   public char[] getDt24Cc() throws CFException{
     if (isDt24CcModified()) { 
        dt24Cc = refreshDt24Cc();
     }
   		return dt24Cc;
   }

  
	/**
	*  set variable dt24Cc
	*  Corresponding COBOL Variable is DT2-4-CC
	*  @param value
	**/
   public void setDt24Cc(char[] value) {
      dt24Cc = checkDt24CcConstraints(value);
      serializeDt24Cc(dt24Cc);
   } 

     /**
	 * 	Update Dt24Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24Cc,dt24Cc.length);
   	
   }
   
   public void setDt24Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24Cc,dt24Cc.length);
   	
   }
   
     /**
	 * 	Update Dt24Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24Cc with another Field
	 *	@param value
	 */
   public void setDt24Cc(Field source) {
       replace(source,0,source.length(),beginDt24Cc,DT_24_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24Cc,DT_24_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt24Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24TrvDbNbr
	 *	@return dt24TrvDbNbr
	 */
   public char[] getDt24TrvDbNbr() throws CFException{
     if (isDt24TrvDbNbrModified()) { 
        dt24TrvDbNbr = refreshDt24TrvDbNbr();
     }
   		return dt24TrvDbNbr;
   }

  
	/**
	*  set variable dt24TrvDbNbr
	*  Corresponding COBOL Variable is DT2-4-TRV-DB-NBR
	*  @param value
	**/
   public void setDt24TrvDbNbr(char[] value) {
      dt24TrvDbNbr = checkDt24TrvDbNbrConstraints(value);
      serializeDt24TrvDbNbr(dt24TrvDbNbr);
   } 

     /**
	 * 	Update Dt24TrvDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24TrvDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24TrvDbNbr,dt24TrvDbNbr.length);
   	
   }
   
   public void setDt24TrvDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbNbr,dt24TrvDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt24TrvDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24TrvDbNbr with another Field
	 *	@param value
	 */
   public void setDt24TrvDbNbr(Field source) {
       replace(source,0,source.length(),beginDt24TrvDbNbr,DT_24_TRV_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24TrvDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24TrvDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24TrvDbNbr,DT_24_TRV_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt24TrvDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24TrvDbAmt
	 *	@return dt24TrvDbAmt
	 */
   public char[] getDt24TrvDbAmt() throws CFException{
     if (isDt24TrvDbAmtModified()) { 
        dt24TrvDbAmt = refreshDt24TrvDbAmt();
     }
   		return dt24TrvDbAmt;
   }

  
	/**
	*  set variable dt24TrvDbAmt
	*  Corresponding COBOL Variable is DT2-4-TRV-DB-AMT
	*  @param value
	**/
   public void setDt24TrvDbAmt(char[] value) {
      dt24TrvDbAmt = checkDt24TrvDbAmtConstraints(value);
      serializeDt24TrvDbAmt(dt24TrvDbAmt);
   } 

     /**
	 * 	Update Dt24TrvDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24TrvDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24TrvDbAmt,dt24TrvDbAmt.length);
   	
   }
   
   public void setDt24TrvDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbAmt,dt24TrvDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt24TrvDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24TrvDbAmt with another Field
	 *	@param value
	 */
   public void setDt24TrvDbAmt(Field source) {
       replace(source,0,source.length(),beginDt24TrvDbAmt,DT_24_TRV_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24TrvDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24TrvDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24TrvDbAmt,DT_24_TRV_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt24TrvDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24TrvCrNbr
	 *	@return dt24TrvCrNbr
	 */
   public char[] getDt24TrvCrNbr() throws CFException{
     if (isDt24TrvCrNbrModified()) { 
        dt24TrvCrNbr = refreshDt24TrvCrNbr();
     }
   		return dt24TrvCrNbr;
   }

  
	/**
	*  set variable dt24TrvCrNbr
	*  Corresponding COBOL Variable is DT2-4-TRV-CR-NBR
	*  @param value
	**/
   public void setDt24TrvCrNbr(char[] value) {
      dt24TrvCrNbr = checkDt24TrvCrNbrConstraints(value);
      serializeDt24TrvCrNbr(dt24TrvCrNbr);
   } 

     /**
	 * 	Update Dt24TrvCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24TrvCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24TrvCrNbr,dt24TrvCrNbr.length);
   	
   }
   
   public void setDt24TrvCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrNbr,dt24TrvCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt24TrvCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24TrvCrNbr with another Field
	 *	@param value
	 */
   public void setDt24TrvCrNbr(Field source) {
       replace(source,0,source.length(),beginDt24TrvCrNbr,DT_24_TRV_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24TrvCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24TrvCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24TrvCrNbr,DT_24_TRV_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt24TrvCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt24TrvCrAmt
	 *	@return dt24TrvCrAmt
	 */
   public char[] getDt24TrvCrAmt() throws CFException{
     if (isDt24TrvCrAmtModified()) { 
        dt24TrvCrAmt = refreshDt24TrvCrAmt();
     }
   		return dt24TrvCrAmt;
   }

  
	/**
	*  set variable dt24TrvCrAmt
	*  Corresponding COBOL Variable is DT2-4-TRV-CR-AMT
	*  @param value
	**/
   public void setDt24TrvCrAmt(char[] value) {
      dt24TrvCrAmt = checkDt24TrvCrAmtConstraints(value);
      serializeDt24TrvCrAmt(dt24TrvCrAmt);
   } 

     /**
	 * 	Update Dt24TrvCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt24TrvCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt24TrvCrAmt,dt24TrvCrAmt.length);
   	
   }
   
   public void setDt24TrvCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrAmt,dt24TrvCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt24TrvCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt24TrvCrAmt with another Field
	 *	@param value
	 */
   public void setDt24TrvCrAmt(Field source) {
       replace(source,0,source.length(),beginDt24TrvCrAmt,DT_24_TRV_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt24TrvCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt24TrvCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt24TrvCrAmt,DT_24_TRV_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt24TrvCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt24TrvCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt24TrvCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln4FieldLength() {
			return DT_PAGE_2_LN_4_LENGTH;
		}

}
  
