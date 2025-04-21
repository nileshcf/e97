package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln6 extends DtPage3Ln6Serialized {
   

						private char[] dt36Cc = new char[1];




						private char[] dt36IssexpDbAmt = Field.fillLowValue(18);


						private char[] dt36IssexpCrAmt = Field.fillLowValue(18);

						private char[] filllr = new char[10];

						private char[] dt36IssexpNetAmt = Field.fillLowValue(18);


						private char[] dt36IssexpInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln6
	**/
    public DtPage3Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt36Cc(("0").toCharArray());
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
								setFilllr(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt36IssexpInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }


 

	/**
	 *	Returns the value of dt36Cc
	 *	@return dt36Cc
	 */
   public char[] getDt36Cc() throws CFException{
     if (isDt36CcModified()) { 
        dt36Cc = refreshDt36Cc();
     }
   		return dt36Cc;
   }

  
	/**
	*  set variable dt36Cc
	*  Corresponding COBOL Variable is DT3-6-CC
	*  @param value
	**/
   public void setDt36Cc(char[] value) {
      dt36Cc = checkDt36CcConstraints(value);
      serializeDt36Cc(dt36Cc);
   } 

     /**
	 * 	Update Dt36Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt36Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt36Cc,dt36Cc.length);
   	
   }
   
   public void setDt36Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt36Cc,dt36Cc.length);
   	
   }
   
     /**
	 * 	Update Dt36Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt36Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt36Cc with another Field
	 *	@param value
	 */
   public void setDt36Cc(Field source) {
       replace(source,0,source.length(),beginDt36Cc,DT_36_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt36Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt36Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt36Cc,DT_36_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt36Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt36Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt36IssexpDbAmt
	 *	@return dt36IssexpDbAmt
	 */
   public char[] getDt36IssexpDbAmt() throws CFException{
     if (isDt36IssexpDbAmtModified()) { 
        dt36IssexpDbAmt = refreshDt36IssexpDbAmt();
     }
   		return dt36IssexpDbAmt;
   }

  
	/**
	*  set variable dt36IssexpDbAmt
	*  Corresponding COBOL Variable is DT3-6-ISSEXP-DB-AMT
	*  @param value
	**/
   public void setDt36IssexpDbAmt(char[] value) {
      dt36IssexpDbAmt = checkDt36IssexpDbAmtConstraints(value);
      serializeDt36IssexpDbAmt(dt36IssexpDbAmt);
   } 

     /**
	 * 	Update Dt36IssexpDbAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt36IssexpDbAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt36IssexpDbAmt,dt36IssexpDbAmt.length);
   	
   }
   
   public void setDt36IssexpDbAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpDbAmt,dt36IssexpDbAmt.length);
   	
   }
   
     /**
	 * 	Update Dt36IssexpDbAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpDbAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpDbAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt36IssexpDbAmt with another Field
	 *	@param value
	 */
   public void setDt36IssexpDbAmt(Field source) {
       replace(source,0,source.length(),beginDt36IssexpDbAmt,DT_36_ISSEXP_DB_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt36IssexpDbAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt36IssexpDbAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt36IssexpDbAmt,DT_36_ISSEXP_DB_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt36IssexpDbAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpDbAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpDbAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt36IssexpCrAmt
	 *	@return dt36IssexpCrAmt
	 */
   public char[] getDt36IssexpCrAmt() throws CFException{
     if (isDt36IssexpCrAmtModified()) { 
        dt36IssexpCrAmt = refreshDt36IssexpCrAmt();
     }
   		return dt36IssexpCrAmt;
   }

  
	/**
	*  set variable dt36IssexpCrAmt
	*  Corresponding COBOL Variable is DT3-6-ISSEXP-CR-AMT
	*  @param value
	**/
   public void setDt36IssexpCrAmt(char[] value) {
      dt36IssexpCrAmt = checkDt36IssexpCrAmtConstraints(value);
      serializeDt36IssexpCrAmt(dt36IssexpCrAmt);
   } 

     /**
	 * 	Update Dt36IssexpCrAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt36IssexpCrAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt36IssexpCrAmt,dt36IssexpCrAmt.length);
   	
   }
   
   public void setDt36IssexpCrAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpCrAmt,dt36IssexpCrAmt.length);
   	
   }
   
     /**
	 * 	Update Dt36IssexpCrAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpCrAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpCrAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt36IssexpCrAmt with another Field
	 *	@param value
	 */
   public void setDt36IssexpCrAmt(Field source) {
       replace(source,0,source.length(),beginDt36IssexpCrAmt,DT_36_ISSEXP_CR_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt36IssexpCrAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt36IssexpCrAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt36IssexpCrAmt,DT_36_ISSEXP_CR_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt36IssexpCrAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpCrAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpCrAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filllr
	 *	@return filllr
	 */
   public char[] getFilllr() throws CFException{
     if (isFilllrModified()) { 
        filllr = refreshFilllr();
     }
   		return filllr;
   }

  
	/**
	*  set variable filllr
	*  Corresponding COBOL Variable is FILLLR
	*  @param value
	**/
   public void setFilllr(char[] value) {
      filllr = checkFilllrConstraints(value);
      serializeFilllr(filllr);
   } 

     /**
	 * 	Update Filllr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFilllr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFilllr,filllr.length);
   	
   }
   
   public void setFilllr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFilllr,filllr.length);
   	
   }
   
     /**
	 * 	Update Filllr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFilllr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFilllr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filllr with another Field
	 *	@param value
	 */
   public void setFilllr(Field source) {
       replace(source,0,source.length(),beginFilllr,FILLLR_LEN);
   	
   }  
   
     /**
	 * 	Update Filllr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFilllr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFilllr,FILLLR_LEN);
   	
   }
   
     /**
	 * 	Update Filllr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFilllr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFilllr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt36IssexpNetAmt
	 *	@return dt36IssexpNetAmt
	 */
   public char[] getDt36IssexpNetAmt() throws CFException{
     if (isDt36IssexpNetAmtModified()) { 
        dt36IssexpNetAmt = refreshDt36IssexpNetAmt();
     }
   		return dt36IssexpNetAmt;
   }

  
	/**
	*  set variable dt36IssexpNetAmt
	*  Corresponding COBOL Variable is DT3-6-ISSEXP-NET-AMT
	*  @param value
	**/
   public void setDt36IssexpNetAmt(char[] value) {
      dt36IssexpNetAmt = checkDt36IssexpNetAmtConstraints(value);
      serializeDt36IssexpNetAmt(dt36IssexpNetAmt);
   } 

     /**
	 * 	Update Dt36IssexpNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt36IssexpNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt36IssexpNetAmt,dt36IssexpNetAmt.length);
   	
   }
   
   public void setDt36IssexpNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpNetAmt,dt36IssexpNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt36IssexpNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt36IssexpNetAmt with another Field
	 *	@param value
	 */
   public void setDt36IssexpNetAmt(Field source) {
       replace(source,0,source.length(),beginDt36IssexpNetAmt,DT_36_ISSEXP_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt36IssexpNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt36IssexpNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt36IssexpNetAmt,DT_36_ISSEXP_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt36IssexpNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt36IssexpInd
	 *	@return dt36IssexpInd
	 */
   public char[] getDt36IssexpInd() throws CFException{
     if (isDt36IssexpIndModified()) { 
        dt36IssexpInd = refreshDt36IssexpInd();
     }
   		return dt36IssexpInd;
   }

  
	/**
	*  set variable dt36IssexpInd
	*  Corresponding COBOL Variable is DT3-6-ISSEXP-IND
	*  @param value
	**/
   public void setDt36IssexpInd(char[] value) {
      dt36IssexpInd = checkDt36IssexpIndConstraints(value);
      serializeDt36IssexpInd(dt36IssexpInd);
   } 

     /**
	 * 	Update Dt36IssexpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt36IssexpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt36IssexpInd,dt36IssexpInd.length);
   	
   }
   
   public void setDt36IssexpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpInd,dt36IssexpInd.length);
   	
   }
   
     /**
	 * 	Update Dt36IssexpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt36IssexpInd with another Field
	 *	@param value
	 */
   public void setDt36IssexpInd(Field source) {
       replace(source,0,source.length(),beginDt36IssexpInd,DT_36_ISSEXP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt36IssexpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt36IssexpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt36IssexpInd,DT_36_ISSEXP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt36IssexpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt36IssexpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt36IssexpInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln6FieldLength() {
			return DT_PAGE_3_LN_6_LENGTH;
		}

}
  
