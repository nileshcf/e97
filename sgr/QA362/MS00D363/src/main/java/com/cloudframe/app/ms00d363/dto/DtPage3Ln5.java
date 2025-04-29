package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln5 extends DtPage3Ln5Serialized {
   

						private char[] dt35Cc = new char[1];




						private char[] dt35IsstrnDbAmt = Field.fillLowValue(18);


						private char[] dt35IsstrnCrAmt = Field.fillLowValue(18);


						private char[] dt35IsstrnNetAmt = Field.fillLowValue(18);


						private char[] dt35IsstrnInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln5
	**/
    public DtPage3Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt35Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("TRANSACTIONS    ").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 20
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 52
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt35IsstrnInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt35Cc
	 *	@return dt35Cc
	 */
   public char[] getDt35Cc() throws CFException{
     if (isDt35CcModified()) { 
        dt35Cc = refreshDt35Cc();
     }
   		return dt35Cc;
   }

  
	/**
	*  set variable dt35Cc
	*  Corresponding COBOL Variable is DT3-5-CC
	*  @param value
	**/
   public void setDt35Cc(char[] value) {
      dt35Cc = checkDt35CcConstraints(value);
      serializeDt35Cc(dt35Cc);
   } 

     /**
	 * 	Update Dt35Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt35Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt35Cc,dt35Cc.length);
   	
   }
   
   public void setDt35Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt35Cc,dt35Cc.length);
   	
   }
   
     /**
	 * 	Update Dt35Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt35Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt35Cc with another Field
	 *	@param value
	 */
   public void setDt35Cc(Field source) {
       replace(source,0,source.length(),beginDt35Cc,DT_35_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt35Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt35Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt35Cc,DT_35_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt35Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt35Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt35IsstrnDbAmt
	 *	@return dt35IsstrnDbAmt
	 */
   public char[] getDt35IsstrnDbAmt() throws CFException{
     if (isDt35IsstrnDbAmtModified()) { 
        dt35IsstrnDbAmt = refreshDt35IsstrnDbAmt();
     }
   		return dt35IsstrnDbAmt;
   }

  
	/**
	*  set variable dt35IsstrnDbAmt
	*  Corresponding COBOL Variable is DT3-5-ISSTRN-DB-AMT
	*  @param value
	**/
   public void setDt35IsstrnDbAmt(char[] value) {
      dt35IsstrnDbAmt = checkDt35IsstrnDbAmtConstraints(value);
      serializeDt35IsstrnDbAmt(dt35IsstrnDbAmt);
   } 

     /**
	 * 	Update Dt35IsstrnDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt35IsstrnDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt35IsstrnDbAmt,dt35IsstrnDbAmt.length);
   	
   }
   
   public void setDt35IsstrnDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnDbAmt,dt35IsstrnDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt35IsstrnDbAmt with another Field
	 *	@param value
	 */
   public void setDt35IsstrnDbAmt(Field source) {
       replace(source,0,source.length(),beginDt35IsstrnDbAmt,DT_35_ISSTRN_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt35IsstrnDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt35IsstrnDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt35IsstrnDbAmt,DT_35_ISSTRN_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt35IsstrnCrAmt
	 *	@return dt35IsstrnCrAmt
	 */
   public char[] getDt35IsstrnCrAmt() throws CFException{
     if (isDt35IsstrnCrAmtModified()) { 
        dt35IsstrnCrAmt = refreshDt35IsstrnCrAmt();
     }
   		return dt35IsstrnCrAmt;
   }

  
	/**
	*  set variable dt35IsstrnCrAmt
	*  Corresponding COBOL Variable is DT3-5-ISSTRN-CR-AMT
	*  @param value
	**/
   public void setDt35IsstrnCrAmt(char[] value) {
      dt35IsstrnCrAmt = checkDt35IsstrnCrAmtConstraints(value);
      serializeDt35IsstrnCrAmt(dt35IsstrnCrAmt);
   } 

     /**
	 * 	Update Dt35IsstrnCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt35IsstrnCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt35IsstrnCrAmt,dt35IsstrnCrAmt.length);
   	
   }
   
   public void setDt35IsstrnCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnCrAmt,dt35IsstrnCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt35IsstrnCrAmt with another Field
	 *	@param value
	 */
   public void setDt35IsstrnCrAmt(Field source) {
       replace(source,0,source.length(),beginDt35IsstrnCrAmt,DT_35_ISSTRN_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt35IsstrnCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt35IsstrnCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt35IsstrnCrAmt,DT_35_ISSTRN_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt35IsstrnNetAmt
	 *	@return dt35IsstrnNetAmt
	 */
   public char[] getDt35IsstrnNetAmt() throws CFException{
     if (isDt35IsstrnNetAmtModified()) { 
        dt35IsstrnNetAmt = refreshDt35IsstrnNetAmt();
     }
   		return dt35IsstrnNetAmt;
   }

  
	/**
	*  set variable dt35IsstrnNetAmt
	*  Corresponding COBOL Variable is DT3-5-ISSTRN-NET-AMT
	*  @param value
	**/
   public void setDt35IsstrnNetAmt(char[] value) {
      dt35IsstrnNetAmt = checkDt35IsstrnNetAmtConstraints(value);
      serializeDt35IsstrnNetAmt(dt35IsstrnNetAmt);
   } 

     /**
	 * 	Update Dt35IsstrnNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt35IsstrnNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt35IsstrnNetAmt,dt35IsstrnNetAmt.length);
   	
   }
   
   public void setDt35IsstrnNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnNetAmt,dt35IsstrnNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt35IsstrnNetAmt with another Field
	 *	@param value
	 */
   public void setDt35IsstrnNetAmt(Field source) {
       replace(source,0,source.length(),beginDt35IsstrnNetAmt,DT_35_ISSTRN_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt35IsstrnNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt35IsstrnNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt35IsstrnNetAmt,DT_35_ISSTRN_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt35IsstrnInd
	 *	@return dt35IsstrnInd
	 */
   public char[] getDt35IsstrnInd() throws CFException{
     if (isDt35IsstrnIndModified()) { 
        dt35IsstrnInd = refreshDt35IsstrnInd();
     }
   		return dt35IsstrnInd;
   }

  
	/**
	*  set variable dt35IsstrnInd
	*  Corresponding COBOL Variable is DT3-5-ISSTRN-IND
	*  @param value
	**/
   public void setDt35IsstrnInd(char[] value) {
      dt35IsstrnInd = checkDt35IsstrnIndConstraints(value);
      serializeDt35IsstrnInd(dt35IsstrnInd);
   } 

     /**
	 * 	Update Dt35IsstrnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt35IsstrnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt35IsstrnInd,dt35IsstrnInd.length);
   	
   }
   
   public void setDt35IsstrnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnInd,dt35IsstrnInd.length);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt35IsstrnInd with another Field
	 *	@param value
	 */
   public void setDt35IsstrnInd(Field source) {
       replace(source,0,source.length(),beginDt35IsstrnInd,DT_35_ISSTRN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt35IsstrnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt35IsstrnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt35IsstrnInd,DT_35_ISSTRN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt35IsstrnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt35IsstrnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt35IsstrnInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln5FieldLength() {
			return DT_PAGE_3_LN_5_LENGTH;
		}

}
  
