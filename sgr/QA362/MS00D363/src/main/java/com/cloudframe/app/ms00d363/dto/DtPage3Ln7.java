package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln7 extends DtPage3Ln7Serialized {
   

						private char[] dt37Cc = new char[1];




						private char[] dt37IssintDbAmt = Field.fillLowValue(20);


						private char[] dt37IssintCrAmt = Field.fillLowValue(20);


						private char[] dt37IssintNetAmt = Field.fillLowValue(20);


						private char[] dt37IssintInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln7
	**/
    public DtPage3Ln7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt37Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("INTERCHANGE FEES").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 20
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 56
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 87
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 115
             ,2
             );
								setDt37IssintInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt37Cc
	 *	@return dt37Cc
	 */
   public char[] getDt37Cc() throws CFException{
     if (isDt37CcModified()) { 
        dt37Cc = refreshDt37Cc();
     }
   		return dt37Cc;
   }

  
	/**
	*  set variable dt37Cc
	*  Corresponding COBOL Variable is DT3-7-CC
	*  @param value
	**/
   public void setDt37Cc(char[] value) {
      dt37Cc = checkDt37CcConstraints(value);
      serializeDt37Cc(dt37Cc);
   } 

     /**
	 * 	Update Dt37Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt37Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt37Cc,dt37Cc.length);
   	
   }
   
   public void setDt37Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt37Cc,dt37Cc.length);
   	
   }
   
     /**
	 * 	Update Dt37Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt37Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt37Cc with another Field
	 *	@param value
	 */
   public void setDt37Cc(Field source) {
       replace(source,0,source.length(),beginDt37Cc,DT_37_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt37Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt37Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt37Cc,DT_37_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt37Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt37Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt37IssintDbAmt
	 *	@return dt37IssintDbAmt
	 */
   public char[] getDt37IssintDbAmt() throws CFException{
     if (isDt37IssintDbAmtModified()) { 
        dt37IssintDbAmt = refreshDt37IssintDbAmt();
     }
   		return dt37IssintDbAmt;
   }

  
	/**
	*  set variable dt37IssintDbAmt
	*  Corresponding COBOL Variable is DT3-7-ISSINT-DB-AMT
	*  @param value
	**/
   public void setDt37IssintDbAmt(char[] value) {
      dt37IssintDbAmt = checkDt37IssintDbAmtConstraints(value);
      serializeDt37IssintDbAmt(dt37IssintDbAmt);
   } 

     /**
	 * 	Update Dt37IssintDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt37IssintDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt37IssintDbAmt,dt37IssintDbAmt.length);
   	
   }
   
   public void setDt37IssintDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintDbAmt,dt37IssintDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt37IssintDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt37IssintDbAmt with another Field
	 *	@param value
	 */
   public void setDt37IssintDbAmt(Field source) {
       replace(source,0,source.length(),beginDt37IssintDbAmt,DT_37_ISSINT_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt37IssintDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt37IssintDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt37IssintDbAmt,DT_37_ISSINT_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt37IssintDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt37IssintCrAmt
	 *	@return dt37IssintCrAmt
	 */
   public char[] getDt37IssintCrAmt() throws CFException{
     if (isDt37IssintCrAmtModified()) { 
        dt37IssintCrAmt = refreshDt37IssintCrAmt();
     }
   		return dt37IssintCrAmt;
   }

  
	/**
	*  set variable dt37IssintCrAmt
	*  Corresponding COBOL Variable is DT3-7-ISSINT-CR-AMT
	*  @param value
	**/
   public void setDt37IssintCrAmt(char[] value) {
      dt37IssintCrAmt = checkDt37IssintCrAmtConstraints(value);
      serializeDt37IssintCrAmt(dt37IssintCrAmt);
   } 

     /**
	 * 	Update Dt37IssintCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt37IssintCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt37IssintCrAmt,dt37IssintCrAmt.length);
   	
   }
   
   public void setDt37IssintCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintCrAmt,dt37IssintCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt37IssintCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt37IssintCrAmt with another Field
	 *	@param value
	 */
   public void setDt37IssintCrAmt(Field source) {
       replace(source,0,source.length(),beginDt37IssintCrAmt,DT_37_ISSINT_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt37IssintCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt37IssintCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt37IssintCrAmt,DT_37_ISSINT_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt37IssintCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt37IssintNetAmt
	 *	@return dt37IssintNetAmt
	 */
   public char[] getDt37IssintNetAmt() throws CFException{
     if (isDt37IssintNetAmtModified()) { 
        dt37IssintNetAmt = refreshDt37IssintNetAmt();
     }
   		return dt37IssintNetAmt;
   }

  
	/**
	*  set variable dt37IssintNetAmt
	*  Corresponding COBOL Variable is DT3-7-ISSINT-NET-AMT
	*  @param value
	**/
   public void setDt37IssintNetAmt(char[] value) {
      dt37IssintNetAmt = checkDt37IssintNetAmtConstraints(value);
      serializeDt37IssintNetAmt(dt37IssintNetAmt);
   } 

     /**
	 * 	Update Dt37IssintNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt37IssintNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt37IssintNetAmt,dt37IssintNetAmt.length);
   	
   }
   
   public void setDt37IssintNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintNetAmt,dt37IssintNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt37IssintNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt37IssintNetAmt with another Field
	 *	@param value
	 */
   public void setDt37IssintNetAmt(Field source) {
       replace(source,0,source.length(),beginDt37IssintNetAmt,DT_37_ISSINT_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt37IssintNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt37IssintNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt37IssintNetAmt,DT_37_ISSINT_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt37IssintNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt37IssintInd
	 *	@return dt37IssintInd
	 */
   public char[] getDt37IssintInd() throws CFException{
     if (isDt37IssintIndModified()) { 
        dt37IssintInd = refreshDt37IssintInd();
     }
   		return dt37IssintInd;
   }

  
	/**
	*  set variable dt37IssintInd
	*  Corresponding COBOL Variable is DT3-7-ISSINT-IND
	*  @param value
	**/
   public void setDt37IssintInd(char[] value) {
      dt37IssintInd = checkDt37IssintIndConstraints(value);
      serializeDt37IssintInd(dt37IssintInd);
   } 

     /**
	 * 	Update Dt37IssintInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt37IssintInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt37IssintInd,dt37IssintInd.length);
   	
   }
   
   public void setDt37IssintInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintInd,dt37IssintInd.length);
   	
   }
   
     /**
	 * 	Update Dt37IssintInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt37IssintInd with another Field
	 *	@param value
	 */
   public void setDt37IssintInd(Field source) {
       replace(source,0,source.length(),beginDt37IssintInd,DT_37_ISSINT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt37IssintInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt37IssintInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt37IssintInd,DT_37_ISSINT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt37IssintInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt37IssintInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt37IssintInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln7FieldLength() {
			return DT_PAGE_3_LN_7_LENGTH;
		}

}
  
