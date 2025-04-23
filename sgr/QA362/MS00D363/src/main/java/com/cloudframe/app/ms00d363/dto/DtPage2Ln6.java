package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage2Ln6 extends DtPage2Ln6Serialized {
   

						private char[] dt26Cc = new char[1];





						private char[] dt26FeeDbAmt = Field.fillLowValue(20);




						private char[] dt26FeeCrAmt = Field.fillLowValue(20);

	
	/**
	* Constructor for DtPage2Ln6
	**/
    public DtPage2Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt26Cc(fillSpace(1));
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
             fillSpace(15)
             , getStartOffset() + 28
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 43
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 67
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 70
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 85
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 106
             ,27
             );
    }


 

	/**
	 *	Returns the value of dt26Cc
	 *	@return dt26Cc
	 */
   public char[] getDt26Cc() throws CFException{
     if (isDt26CcModified()) { 
        dt26Cc = refreshDt26Cc();
     }
   		return dt26Cc;
   }

  
	/**
	*  set variable dt26Cc
	*  Corresponding COBOL Variable is DT2-6-CC
	*  @param value
	**/
   public void setDt26Cc(char[] value) {
      dt26Cc = checkDt26CcConstraints(value);
      serializeDt26Cc(dt26Cc);
   } 

     /**
	 * 	Update Dt26Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt26Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt26Cc,dt26Cc.length);
   	
   }
   
   public void setDt26Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt26Cc,dt26Cc.length);
   	
   }
   
     /**
	 * 	Update Dt26Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt26Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt26Cc with another Field
	 *	@param value
	 */
   public void setDt26Cc(Field source) {
       replace(source,0,source.length(),beginDt26Cc,DT_26_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt26Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt26Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt26Cc,DT_26_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt26Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt26Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt26FeeDbAmt
	 *	@return dt26FeeDbAmt
	 */
   public char[] getDt26FeeDbAmt() throws CFException{
     if (isDt26FeeDbAmtModified()) { 
        dt26FeeDbAmt = refreshDt26FeeDbAmt();
     }
   		return dt26FeeDbAmt;
   }

  
	/**
	*  set variable dt26FeeDbAmt
	*  Corresponding COBOL Variable is DT2-6-FEE-DB-AMT
	*  @param value
	**/
   public void setDt26FeeDbAmt(char[] value) {
      dt26FeeDbAmt = checkDt26FeeDbAmtConstraints(value);
      serializeDt26FeeDbAmt(dt26FeeDbAmt);
   } 

     /**
	 * 	Update Dt26FeeDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt26FeeDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt26FeeDbAmt,dt26FeeDbAmt.length);
   	
   }
   
   public void setDt26FeeDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeDbAmt,dt26FeeDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt26FeeDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt26FeeDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt26FeeDbAmt with another Field
	 *	@param value
	 */
   public void setDt26FeeDbAmt(Field source) {
       replace(source,0,source.length(),beginDt26FeeDbAmt,DT_26_FEE_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt26FeeDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt26FeeDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt26FeeDbAmt,DT_26_FEE_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt26FeeDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt26FeeDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt26FeeCrAmt
	 *	@return dt26FeeCrAmt
	 */
   public char[] getDt26FeeCrAmt() throws CFException{
     if (isDt26FeeCrAmtModified()) { 
        dt26FeeCrAmt = refreshDt26FeeCrAmt();
     }
   		return dt26FeeCrAmt;
   }

  
	/**
	*  set variable dt26FeeCrAmt
	*  Corresponding COBOL Variable is DT2-6-FEE-CR-AMT
	*  @param value
	**/
   public void setDt26FeeCrAmt(char[] value) {
      dt26FeeCrAmt = checkDt26FeeCrAmtConstraints(value);
      serializeDt26FeeCrAmt(dt26FeeCrAmt);
   } 

     /**
	 * 	Update Dt26FeeCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt26FeeCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt26FeeCrAmt,dt26FeeCrAmt.length);
   	
   }
   
   public void setDt26FeeCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeCrAmt,dt26FeeCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt26FeeCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt26FeeCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt26FeeCrAmt with another Field
	 *	@param value
	 */
   public void setDt26FeeCrAmt(Field source) {
       replace(source,0,source.length(),beginDt26FeeCrAmt,DT_26_FEE_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt26FeeCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt26FeeCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt26FeeCrAmt,DT_26_FEE_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt26FeeCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt26FeeCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt26FeeCrAmt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage2Ln6FieldLength() {
			return DT_PAGE_2_LN_6_LENGTH;
		}

}
  
