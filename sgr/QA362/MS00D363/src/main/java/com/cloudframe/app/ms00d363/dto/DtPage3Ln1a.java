package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln1a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;


public class DtPage3Ln1a extends DtPage3Ln1aSerialized {
   

						private char[] dt31aCc = new char[1];


								private char[] dt31aSerNo = new char[2];
							


								private char[] dt31aCreditAmt = Field.fillLowValue(20);




								private char[] dt31aDebitAmt = Field.fillLowValue(20);




								private char[] dt31aNetAmt = Field.fillLowValue(20);


						private char[] dt31aInd = Field.fillLowValue(1);

	
	/**
	* Constructor for DtPage3Ln1a
	**/
    public DtPage3Ln1a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt31aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
								setDt31aSerNo(CFUtil.cobolNumberFormatter("Z9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 5
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 38
             ,1
             );
       replaceValue( // serialize and save the value
             ("C").toCharArray()
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 68
             ,1
             );
       replaceValue( // serialize and save the value
             ("D").toCharArray()
             , getStartOffset() + 69
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 70
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 98
             ,37
             );
    }


 

	/**
	 *	Returns the value of dt31aCc
	 *	@return dt31aCc
	 */
   public char[] getDt31aCc() throws CFException{
     if (isDt31aCcModified()) { 
        dt31aCc = refreshDt31aCc();
     }
   		return dt31aCc;
   }

  
	/**
	*  set variable dt31aCc
	*  Corresponding COBOL Variable is DT3-1A-CC
	*  @param value
	**/
   public void setDt31aCc(char[] value) {
      dt31aCc = checkDt31aCcConstraints(value);
      serializeDt31aCc(dt31aCc);
   } 

     /**
	 * 	Update Dt31aCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aCc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aCc,dt31aCc.length);
   	
   }
   
   public void setDt31aCc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCc,dt31aCc.length);
   	
   }
   
     /**
	 * 	Update Dt31aCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aCc with another Field
	 *	@param value
	 */
   public void setDt31aCc(Field source) {
       replace(source,0,source.length(),beginDt31aCc,DT_31A_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aCc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aCc,DT_31A_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31aSerNo
	 *	@return dt31aSerNo
	 */
   public char[] getDt31aSerNo() throws CFException{
     if (isDt31aSerNoModified()) { 
        dt31aSerNo = refreshDt31aSerNo();
     }
   		return dt31aSerNo;
   }

  
	/**
	*  set variable dt31aSerNo
	*  Corresponding COBOL Variable is DT3-1A-SER-NO
	*  @param value
	**/
   public void setDt31aSerNo(char[] value) {
      dt31aSerNo = checkDt31aSerNoConstraints(value);
      serializeDt31aSerNo(dt31aSerNo);
   } 

     /**
	 * 	Update Dt31aSerNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aSerNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aSerNo,dt31aSerNo.length);
   	
   }
   
   public void setDt31aSerNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aSerNo,dt31aSerNo.length);
   	
   }
   
     /**
	 * 	Update Dt31aSerNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aSerNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aSerNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aSerNo with another Field
	 *	@param value
	 */
   public void setDt31aSerNo(Field source) {
       replace(source,0,source.length(),beginDt31aSerNo,DT_31A_SER_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aSerNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aSerNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aSerNo,DT_31A_SER_NO_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aSerNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aSerNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aSerNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31aCreditAmt
	 *	@return dt31aCreditAmt
	 */
   public char[] getDt31aCreditAmt() throws CFException{
     if (isDt31aCreditAmtModified()) { 
        dt31aCreditAmt = refreshDt31aCreditAmt();
     }
   		return dt31aCreditAmt;
   }

  
	/**
	*  set variable dt31aCreditAmt
	*  Corresponding COBOL Variable is DT3-1A-CREDIT-AMT
	*  @param value
	**/
   public void setDt31aCreditAmt(char[] value) {
      dt31aCreditAmt = checkDt31aCreditAmtConstraints(value);
      serializeDt31aCreditAmt(dt31aCreditAmt);
   } 

     /**
	 * 	Update Dt31aCreditAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aCreditAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aCreditAmt,dt31aCreditAmt.length);
   	
   }
   
   public void setDt31aCreditAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCreditAmt,dt31aCreditAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31aCreditAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aCreditAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCreditAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aCreditAmt with another Field
	 *	@param value
	 */
   public void setDt31aCreditAmt(Field source) {
       replace(source,0,source.length(),beginDt31aCreditAmt,DT_31A_CREDIT_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aCreditAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aCreditAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aCreditAmt,DT_31A_CREDIT_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aCreditAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aCreditAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aCreditAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31aDebitAmt
	 *	@return dt31aDebitAmt
	 */
   public char[] getDt31aDebitAmt() throws CFException{
     if (isDt31aDebitAmtModified()) { 
        dt31aDebitAmt = refreshDt31aDebitAmt();
     }
   		return dt31aDebitAmt;
   }

  
	/**
	*  set variable dt31aDebitAmt
	*  Corresponding COBOL Variable is DT3-1A-DEBIT-AMT
	*  @param value
	**/
   public void setDt31aDebitAmt(char[] value) {
      dt31aDebitAmt = checkDt31aDebitAmtConstraints(value);
      serializeDt31aDebitAmt(dt31aDebitAmt);
   } 

     /**
	 * 	Update Dt31aDebitAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aDebitAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aDebitAmt,dt31aDebitAmt.length);
   	
   }
   
   public void setDt31aDebitAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aDebitAmt,dt31aDebitAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31aDebitAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aDebitAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aDebitAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aDebitAmt with another Field
	 *	@param value
	 */
   public void setDt31aDebitAmt(Field source) {
       replace(source,0,source.length(),beginDt31aDebitAmt,DT_31A_DEBIT_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aDebitAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aDebitAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aDebitAmt,DT_31A_DEBIT_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aDebitAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aDebitAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aDebitAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31aNetAmt
	 *	@return dt31aNetAmt
	 */
   public char[] getDt31aNetAmt() throws CFException{
     if (isDt31aNetAmtModified()) { 
        dt31aNetAmt = refreshDt31aNetAmt();
     }
   		return dt31aNetAmt;
   }

  
	/**
	*  set variable dt31aNetAmt
	*  Corresponding COBOL Variable is DT3-1A-NET-AMT
	*  @param value
	**/
   public void setDt31aNetAmt(char[] value) {
      dt31aNetAmt = checkDt31aNetAmtConstraints(value);
      serializeDt31aNetAmt(dt31aNetAmt);
   } 

     /**
	 * 	Update Dt31aNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aNetAmt,dt31aNetAmt.length);
   	
   }
   
   public void setDt31aNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aNetAmt,dt31aNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt31aNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aNetAmt with another Field
	 *	@param value
	 */
   public void setDt31aNetAmt(Field source) {
       replace(source,0,source.length(),beginDt31aNetAmt,DT_31A_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aNetAmt,DT_31A_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt31aInd
	 *	@return dt31aInd
	 */
   public char[] getDt31aInd() throws CFException{
     if (isDt31aIndModified()) { 
        dt31aInd = refreshDt31aInd();
     }
   		return dt31aInd;
   }

  
	/**
	*  set variable dt31aInd
	*  Corresponding COBOL Variable is DT3-1A-IND
	*  @param value
	**/
   public void setDt31aInd(char[] value) {
      dt31aInd = checkDt31aIndConstraints(value);
      serializeDt31aInd(dt31aInd);
   } 

     /**
	 * 	Update Dt31aInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt31aInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt31aInd,dt31aInd.length);
   	
   }
   
   public void setDt31aInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aInd,dt31aInd.length);
   	
   }
   
     /**
	 * 	Update Dt31aInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt31aInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt31aInd with another Field
	 *	@param value
	 */
   public void setDt31aInd(Field source) {
       replace(source,0,source.length(),beginDt31aInd,DT_31A_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt31aInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt31aInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt31aInd,DT_31A_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt31aInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt31aInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt31aInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln1aFieldLength() {
			return DT_PAGE_3_LN_1A_LENGTH;
		}

}
  
