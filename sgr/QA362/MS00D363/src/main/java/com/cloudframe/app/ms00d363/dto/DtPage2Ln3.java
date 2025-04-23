package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln3 extends DtPage2Ln3Serialized {
   

						private char[] dt23Cc = new char[1];



								private char[] dt23RevDbNbr = Field.fillLowValue(15);


						private char[] dt23RevDbAmt = Field.fillLowValue(18);


								private char[] dt23RevCrNbr = Field.fillLowValue(15);


						private char[] dt23RevCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln3
	**/
    public DtPage2Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt23Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("NON-SAME DAY            ").toCharArray()
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
	 *	Returns the value of dt23Cc
	 *	@return dt23Cc
	 */
   public char[] getDt23Cc() throws CFException{
     if (isDt23CcModified()) { 
        dt23Cc = refreshDt23Cc();
     }
   		return dt23Cc;
   }

  
	/**
	*  set variable dt23Cc
	*  Corresponding COBOL Variable is DT2-3-CC
	*  @param value
	**/
   public void setDt23Cc(char[] value) {
      dt23Cc = checkDt23CcConstraints(value);
      serializeDt23Cc(dt23Cc);
   } 

     /**
	 * 	Update Dt23Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt23Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt23Cc,dt23Cc.length);
   	
   }
   
   public void setDt23Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt23Cc,dt23Cc.length);
   	
   }
   
     /**
	 * 	Update Dt23Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt23Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt23Cc with another Field
	 *	@param value
	 */
   public void setDt23Cc(Field source) {
       replace(source,0,source.length(),beginDt23Cc,DT_23_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt23Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt23Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt23Cc,DT_23_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt23Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt23Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt23RevDbNbr
	 *	@return dt23RevDbNbr
	 */
   public char[] getDt23RevDbNbr() throws CFException{
     if (isDt23RevDbNbrModified()) { 
        dt23RevDbNbr = refreshDt23RevDbNbr();
     }
   		return dt23RevDbNbr;
   }

  
	/**
	*  set variable dt23RevDbNbr
	*  Corresponding COBOL Variable is DT2-3-REV-DB-NBR
	*  @param value
	**/
   public void setDt23RevDbNbr(char[] value) {
      dt23RevDbNbr = checkDt23RevDbNbrConstraints(value);
      serializeDt23RevDbNbr(dt23RevDbNbr);
   } 

     /**
	 * 	Update Dt23RevDbNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt23RevDbNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt23RevDbNbr,dt23RevDbNbr.length);
   	
   }
   
   public void setDt23RevDbNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbNbr,dt23RevDbNbr.length);
   	
   }
   
     /**
	 * 	Update Dt23RevDbNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevDbNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt23RevDbNbr with another Field
	 *	@param value
	 */
   public void setDt23RevDbNbr(Field source) {
       replace(source,0,source.length(),beginDt23RevDbNbr,DT_23_REV_DB_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt23RevDbNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt23RevDbNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt23RevDbNbr,DT_23_REV_DB_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt23RevDbNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevDbNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt23RevDbAmt
	 *	@return dt23RevDbAmt
	 */
   public char[] getDt23RevDbAmt() throws CFException{
     if (isDt23RevDbAmtModified()) { 
        dt23RevDbAmt = refreshDt23RevDbAmt();
     }
   		return dt23RevDbAmt;
   }

  
	/**
	*  set variable dt23RevDbAmt
	*  Corresponding COBOL Variable is DT2-3-REV-DB-AMT
	*  @param value
	**/
   public void setDt23RevDbAmt(char[] value) {
      dt23RevDbAmt = checkDt23RevDbAmtConstraints(value);
      serializeDt23RevDbAmt(dt23RevDbAmt);
   } 

     /**
	 * 	Update Dt23RevDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt23RevDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt23RevDbAmt,dt23RevDbAmt.length);
   	
   }
   
   public void setDt23RevDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbAmt,dt23RevDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt23RevDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt23RevDbAmt with another Field
	 *	@param value
	 */
   public void setDt23RevDbAmt(Field source) {
       replace(source,0,source.length(),beginDt23RevDbAmt,DT_23_REV_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt23RevDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt23RevDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt23RevDbAmt,DT_23_REV_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt23RevDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt23RevCrNbr
	 *	@return dt23RevCrNbr
	 */
   public char[] getDt23RevCrNbr() throws CFException{
     if (isDt23RevCrNbrModified()) { 
        dt23RevCrNbr = refreshDt23RevCrNbr();
     }
   		return dt23RevCrNbr;
   }

  
	/**
	*  set variable dt23RevCrNbr
	*  Corresponding COBOL Variable is DT2-3-REV-CR-NBR
	*  @param value
	**/
   public void setDt23RevCrNbr(char[] value) {
      dt23RevCrNbr = checkDt23RevCrNbrConstraints(value);
      serializeDt23RevCrNbr(dt23RevCrNbr);
   } 

     /**
	 * 	Update Dt23RevCrNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt23RevCrNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt23RevCrNbr,dt23RevCrNbr.length);
   	
   }
   
   public void setDt23RevCrNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrNbr,dt23RevCrNbr.length);
   	
   }
   
     /**
	 * 	Update Dt23RevCrNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevCrNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt23RevCrNbr with another Field
	 *	@param value
	 */
   public void setDt23RevCrNbr(Field source) {
       replace(source,0,source.length(),beginDt23RevCrNbr,DT_23_REV_CR_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt23RevCrNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt23RevCrNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt23RevCrNbr,DT_23_REV_CR_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt23RevCrNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevCrNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt23RevCrAmt
	 *	@return dt23RevCrAmt
	 */
   public char[] getDt23RevCrAmt() throws CFException{
     if (isDt23RevCrAmtModified()) { 
        dt23RevCrAmt = refreshDt23RevCrAmt();
     }
   		return dt23RevCrAmt;
   }

  
	/**
	*  set variable dt23RevCrAmt
	*  Corresponding COBOL Variable is DT2-3-REV-CR-AMT
	*  @param value
	**/
   public void setDt23RevCrAmt(char[] value) {
      dt23RevCrAmt = checkDt23RevCrAmtConstraints(value);
      serializeDt23RevCrAmt(dt23RevCrAmt);
   } 

     /**
	 * 	Update Dt23RevCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt23RevCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt23RevCrAmt,dt23RevCrAmt.length);
   	
   }
   
   public void setDt23RevCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrAmt,dt23RevCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt23RevCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt23RevCrAmt with another Field
	 *	@param value
	 */
   public void setDt23RevCrAmt(Field source) {
       replace(source,0,source.length(),beginDt23RevCrAmt,DT_23_REV_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt23RevCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt23RevCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt23RevCrAmt,DT_23_REV_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt23RevCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt23RevCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt23RevCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln3FieldLength() {
			return DT_PAGE_2_LN_3_LENGTH;
		}

}
  
