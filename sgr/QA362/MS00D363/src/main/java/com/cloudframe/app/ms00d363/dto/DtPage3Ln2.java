package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln2 extends DtPage3Ln2Serialized {
   

						private char[] dt32Cc = new char[1];




						private char[] dt32AcqexpDbAmt = Field.fillLowValue(18);


						private char[] dt32AcqexpCrAmt = Field.fillLowValue(18);


						private char[] dt32AcqexpNetAmt = Field.fillLowValue(18);


						private char[] dt32AcqexpInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln2
	**/
    public DtPage3Ln2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt32Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("EXCEPTION ITEMS ").toCharArray()
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
								setDt32AcqexpInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt32Cc
	 *	@return dt32Cc
	 */
   public char[] getDt32Cc() throws CFException{
     if (isDt32CcModified()) { 
        dt32Cc = refreshDt32Cc();
     }
   		return dt32Cc;
   }

  
	/**
	*  set variable dt32Cc
	*  Corresponding COBOL Variable is DT3-2-CC
	*  @param value
	**/
   public void setDt32Cc(char[] value) {
      dt32Cc = checkDt32CcConstraints(value);
      serializeDt32Cc(dt32Cc);
   } 

     /**
	 * 	Update Dt32Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32Cc,dt32Cc.length);
   	
   }
   
   public void setDt32Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32Cc,dt32Cc.length);
   	
   }
   
     /**
	 * 	Update Dt32Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32Cc with another Field
	 *	@param value
	 */
   public void setDt32Cc(Field source) {
       replace(source,0,source.length(),beginDt32Cc,DT_32_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32Cc,DT_32_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt32Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32AcqexpDbAmt
	 *	@return dt32AcqexpDbAmt
	 */
   public char[] getDt32AcqexpDbAmt() throws CFException{
     if (isDt32AcqexpDbAmtModified()) { 
        dt32AcqexpDbAmt = refreshDt32AcqexpDbAmt();
     }
   		return dt32AcqexpDbAmt;
   }

  
	/**
	*  set variable dt32AcqexpDbAmt
	*  Corresponding COBOL Variable is DT3-2-ACQEXP-DB-AMT
	*  @param value
	**/
   public void setDt32AcqexpDbAmt(char[] value) {
      dt32AcqexpDbAmt = checkDt32AcqexpDbAmtConstraints(value);
      serializeDt32AcqexpDbAmt(dt32AcqexpDbAmt);
   } 

     /**
	 * 	Update Dt32AcqexpDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32AcqexpDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32AcqexpDbAmt,dt32AcqexpDbAmt.length);
   	
   }
   
   public void setDt32AcqexpDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpDbAmt,dt32AcqexpDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32AcqexpDbAmt with another Field
	 *	@param value
	 */
   public void setDt32AcqexpDbAmt(Field source) {
       replace(source,0,source.length(),beginDt32AcqexpDbAmt,DT_32_ACQEXP_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32AcqexpDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32AcqexpDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32AcqexpDbAmt,DT_32_ACQEXP_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32AcqexpCrAmt
	 *	@return dt32AcqexpCrAmt
	 */
   public char[] getDt32AcqexpCrAmt() throws CFException{
     if (isDt32AcqexpCrAmtModified()) { 
        dt32AcqexpCrAmt = refreshDt32AcqexpCrAmt();
     }
   		return dt32AcqexpCrAmt;
   }

  
	/**
	*  set variable dt32AcqexpCrAmt
	*  Corresponding COBOL Variable is DT3-2-ACQEXP-CR-AMT
	*  @param value
	**/
   public void setDt32AcqexpCrAmt(char[] value) {
      dt32AcqexpCrAmt = checkDt32AcqexpCrAmtConstraints(value);
      serializeDt32AcqexpCrAmt(dt32AcqexpCrAmt);
   } 

     /**
	 * 	Update Dt32AcqexpCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32AcqexpCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32AcqexpCrAmt,dt32AcqexpCrAmt.length);
   	
   }
   
   public void setDt32AcqexpCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpCrAmt,dt32AcqexpCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32AcqexpCrAmt with another Field
	 *	@param value
	 */
   public void setDt32AcqexpCrAmt(Field source) {
       replace(source,0,source.length(),beginDt32AcqexpCrAmt,DT_32_ACQEXP_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32AcqexpCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32AcqexpCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32AcqexpCrAmt,DT_32_ACQEXP_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32AcqexpNetAmt
	 *	@return dt32AcqexpNetAmt
	 */
   public char[] getDt32AcqexpNetAmt() throws CFException{
     if (isDt32AcqexpNetAmtModified()) { 
        dt32AcqexpNetAmt = refreshDt32AcqexpNetAmt();
     }
   		return dt32AcqexpNetAmt;
   }

  
	/**
	*  set variable dt32AcqexpNetAmt
	*  Corresponding COBOL Variable is DT3-2-ACQEXP-NET-AMT
	*  @param value
	**/
   public void setDt32AcqexpNetAmt(char[] value) {
      dt32AcqexpNetAmt = checkDt32AcqexpNetAmtConstraints(value);
      serializeDt32AcqexpNetAmt(dt32AcqexpNetAmt);
   } 

     /**
	 * 	Update Dt32AcqexpNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32AcqexpNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32AcqexpNetAmt,dt32AcqexpNetAmt.length);
   	
   }
   
   public void setDt32AcqexpNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpNetAmt,dt32AcqexpNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32AcqexpNetAmt with another Field
	 *	@param value
	 */
   public void setDt32AcqexpNetAmt(Field source) {
       replace(source,0,source.length(),beginDt32AcqexpNetAmt,DT_32_ACQEXP_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32AcqexpNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32AcqexpNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32AcqexpNetAmt,DT_32_ACQEXP_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt32AcqexpInd
	 *	@return dt32AcqexpInd
	 */
   public char[] getDt32AcqexpInd() throws CFException{
     if (isDt32AcqexpIndModified()) { 
        dt32AcqexpInd = refreshDt32AcqexpInd();
     }
   		return dt32AcqexpInd;
   }

  
	/**
	*  set variable dt32AcqexpInd
	*  Corresponding COBOL Variable is DT3-2-ACQEXP-IND
	*  @param value
	**/
   public void setDt32AcqexpInd(char[] value) {
      dt32AcqexpInd = checkDt32AcqexpIndConstraints(value);
      serializeDt32AcqexpInd(dt32AcqexpInd);
   } 

     /**
	 * 	Update Dt32AcqexpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt32AcqexpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt32AcqexpInd,dt32AcqexpInd.length);
   	
   }
   
   public void setDt32AcqexpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpInd,dt32AcqexpInd.length);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt32AcqexpInd with another Field
	 *	@param value
	 */
   public void setDt32AcqexpInd(Field source) {
       replace(source,0,source.length(),beginDt32AcqexpInd,DT_32_ACQEXP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt32AcqexpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt32AcqexpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt32AcqexpInd,DT_32_ACQEXP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt32AcqexpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt32AcqexpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt32AcqexpInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln2FieldLength() {
			return DT_PAGE_3_LN_2_LENGTH;
		}

}
  
