package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln10 extends DtPage3Ln10Serialized {
   

						private char[] dt310Cc = new char[1];



						private char[] dt310Ica = new char[6];


						private char[] dt310GcmacqNetAmt = Field.fillLowValue(18);

						private char[] dt310GcmacqInd = new char[2];


						private char[] dt310GcmacqFeeAmt = Field.fillLowValue(16);

						private char[] dt310GcmacqFeeInd = new char[2];

						private char[] dt310GcmissNetAmt = Field.fillLowValue(18);

						private char[] dt310GcmissInd = new char[2];


						private char[] dt310GcmissFeeAmt = Field.fillLowValue(16);

						private char[] dt310GcmissFeeInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln10
	**/
    public DtPage3Ln10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt310Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("ICA: ").toCharArray()
             , getStartOffset() + 9
             ,5
             );
								setDt310Ica(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 20
             ,4
             );
								setDt310GcmacqInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 44
             ,1
             );
								setDt310GcmacqFeeInd(fillSpace(2));
								setDt310GcmissInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 83
             ,2
             );
								setDt310GcmissFeeInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(30)
             , getStartOffset() + 103
             ,30
             );
    }


 

	/**
	 *	Returns the value of dt310Cc
	 *	@return dt310Cc
	 */
   public char[] getDt310Cc() throws CFException{
     if (isDt310CcModified()) { 
        dt310Cc = refreshDt310Cc();
     }
   		return dt310Cc;
   }

  
	/**
	*  set variable dt310Cc
	*  Corresponding COBOL Variable is DT3-10-CC
	*  @param value
	**/
   public void setDt310Cc(char[] value) {
      dt310Cc = checkDt310CcConstraints(value);
      serializeDt310Cc(dt310Cc);
   } 

     /**
	 * 	Update Dt310Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310Cc,dt310Cc.length);
   	
   }
   
   public void setDt310Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Cc,dt310Cc.length);
   	
   }
   
     /**
	 * 	Update Dt310Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310Cc with another Field
	 *	@param value
	 */
   public void setDt310Cc(Field source) {
       replace(source,0,source.length(),beginDt310Cc,DT_310_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310Cc,DT_310_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt310Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310Ica
	 *	@return dt310Ica
	 */
   public char[] getDt310Ica() throws CFException{
     if (isDt310IcaModified()) { 
        dt310Ica = refreshDt310Ica();
     }
   		return dt310Ica;
   }

  
	/**
	*  set variable dt310Ica
	*  Corresponding COBOL Variable is DT3-10-ICA
	*  @param value
	**/
   public void setDt310Ica(char[] value) {
      dt310Ica = checkDt310IcaConstraints(value);
      serializeDt310Ica(dt310Ica);
   } 

     /**
	 * 	Update Dt310Ica 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310Ica(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310Ica,dt310Ica.length);
   	
   }
   
   public void setDt310Ica(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Ica,dt310Ica.length);
   	
   }
   
     /**
	 * 	Update Dt310Ica 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310Ica(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Ica+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310Ica with another Field
	 *	@param value
	 */
   public void setDt310Ica(Field source) {
       replace(source,0,source.length(),beginDt310Ica,DT_310_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310Ica 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310Ica(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310Ica,DT_310_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Dt310Ica 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310Ica(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310Ica+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmacqNetAmt
	 *	@return dt310GcmacqNetAmt
	 */
   public char[] getDt310GcmacqNetAmt() throws CFException{
     if (isDt310GcmacqNetAmtModified()) { 
        dt310GcmacqNetAmt = refreshDt310GcmacqNetAmt();
     }
   		return dt310GcmacqNetAmt;
   }

  
	/**
	*  set variable dt310GcmacqNetAmt
	*  Corresponding COBOL Variable is DT3-10-GCMACQ-NET-AMT
	*  @param value
	**/
   public void setDt310GcmacqNetAmt(char[] value) {
      dt310GcmacqNetAmt = checkDt310GcmacqNetAmtConstraints(value);
      serializeDt310GcmacqNetAmt(dt310GcmacqNetAmt);
   } 

     /**
	 * 	Update Dt310GcmacqNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmacqNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmacqNetAmt,dt310GcmacqNetAmt.length);
   	
   }
   
   public void setDt310GcmacqNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqNetAmt,dt310GcmacqNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmacqNetAmt with another Field
	 *	@param value
	 */
   public void setDt310GcmacqNetAmt(Field source) {
       replace(source,0,source.length(),beginDt310GcmacqNetAmt,DT_310_GCMACQ_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmacqNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmacqNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmacqNetAmt,DT_310_GCMACQ_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmacqInd
	 *	@return dt310GcmacqInd
	 */
   public char[] getDt310GcmacqInd() throws CFException{
     if (isDt310GcmacqIndModified()) { 
        dt310GcmacqInd = refreshDt310GcmacqInd();
     }
   		return dt310GcmacqInd;
   }

  
	/**
	*  set variable dt310GcmacqInd
	*  Corresponding COBOL Variable is DT3-10-GCMACQ-IND
	*  @param value
	**/
   public void setDt310GcmacqInd(char[] value) {
      dt310GcmacqInd = checkDt310GcmacqIndConstraints(value);
      serializeDt310GcmacqInd(dt310GcmacqInd);
   } 

     /**
	 * 	Update Dt310GcmacqInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmacqInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmacqInd,dt310GcmacqInd.length);
   	
   }
   
   public void setDt310GcmacqInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqInd,dt310GcmacqInd.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmacqInd with another Field
	 *	@param value
	 */
   public void setDt310GcmacqInd(Field source) {
       replace(source,0,source.length(),beginDt310GcmacqInd,DT_310_GCMACQ_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmacqInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmacqInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmacqInd,DT_310_GCMACQ_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmacqFeeAmt
	 *	@return dt310GcmacqFeeAmt
	 */
   public char[] getDt310GcmacqFeeAmt() throws CFException{
     if (isDt310GcmacqFeeAmtModified()) { 
        dt310GcmacqFeeAmt = refreshDt310GcmacqFeeAmt();
     }
   		return dt310GcmacqFeeAmt;
   }

  
	/**
	*  set variable dt310GcmacqFeeAmt
	*  Corresponding COBOL Variable is DT3-10-GCMACQ-FEE-AMT
	*  @param value
	**/
   public void setDt310GcmacqFeeAmt(char[] value) {
      dt310GcmacqFeeAmt = checkDt310GcmacqFeeAmtConstraints(value);
      serializeDt310GcmacqFeeAmt(dt310GcmacqFeeAmt);
   } 

     /**
	 * 	Update Dt310GcmacqFeeAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmacqFeeAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmacqFeeAmt,dt310GcmacqFeeAmt.length);
   	
   }
   
   public void setDt310GcmacqFeeAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeAmt,dt310GcmacqFeeAmt.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqFeeAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqFeeAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmacqFeeAmt with another Field
	 *	@param value
	 */
   public void setDt310GcmacqFeeAmt(Field source) {
       replace(source,0,source.length(),beginDt310GcmacqFeeAmt,DT_310_GCMACQ_FEE_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmacqFeeAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmacqFeeAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeAmt,DT_310_GCMACQ_FEE_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqFeeAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqFeeAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmacqFeeInd
	 *	@return dt310GcmacqFeeInd
	 */
   public char[] getDt310GcmacqFeeInd() throws CFException{
     if (isDt310GcmacqFeeIndModified()) { 
        dt310GcmacqFeeInd = refreshDt310GcmacqFeeInd();
     }
   		return dt310GcmacqFeeInd;
   }

  
	/**
	*  set variable dt310GcmacqFeeInd
	*  Corresponding COBOL Variable is DT3-10-GCMACQ-FEE-IND
	*  @param value
	**/
   public void setDt310GcmacqFeeInd(char[] value) {
      dt310GcmacqFeeInd = checkDt310GcmacqFeeIndConstraints(value);
      serializeDt310GcmacqFeeInd(dt310GcmacqFeeInd);
   } 

     /**
	 * 	Update Dt310GcmacqFeeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmacqFeeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmacqFeeInd,dt310GcmacqFeeInd.length);
   	
   }
   
   public void setDt310GcmacqFeeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeInd,dt310GcmacqFeeInd.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqFeeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqFeeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmacqFeeInd with another Field
	 *	@param value
	 */
   public void setDt310GcmacqFeeInd(Field source) {
       replace(source,0,source.length(),beginDt310GcmacqFeeInd,DT_310_GCMACQ_FEE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmacqFeeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmacqFeeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeInd,DT_310_GCMACQ_FEE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmacqFeeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmacqFeeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmacqFeeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmissNetAmt
	 *	@return dt310GcmissNetAmt
	 */
   public char[] getDt310GcmissNetAmt() throws CFException{
     if (isDt310GcmissNetAmtModified()) { 
        dt310GcmissNetAmt = refreshDt310GcmissNetAmt();
     }
   		return dt310GcmissNetAmt;
   }

  
	/**
	*  set variable dt310GcmissNetAmt
	*  Corresponding COBOL Variable is DT3-10-GCMISS-NET-AMT
	*  @param value
	**/
   public void setDt310GcmissNetAmt(char[] value) {
      dt310GcmissNetAmt = checkDt310GcmissNetAmtConstraints(value);
      serializeDt310GcmissNetAmt(dt310GcmissNetAmt);
   } 

     /**
	 * 	Update Dt310GcmissNetAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmissNetAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmissNetAmt,dt310GcmissNetAmt.length);
   	
   }
   
   public void setDt310GcmissNetAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissNetAmt,dt310GcmissNetAmt.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmissNetAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissNetAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissNetAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmissNetAmt with another Field
	 *	@param value
	 */
   public void setDt310GcmissNetAmt(Field source) {
       replace(source,0,source.length(),beginDt310GcmissNetAmt,DT_310_GCMISS_NET_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmissNetAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmissNetAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmissNetAmt,DT_310_GCMISS_NET_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmissNetAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissNetAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissNetAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmissInd
	 *	@return dt310GcmissInd
	 */
   public char[] getDt310GcmissInd() throws CFException{
     if (isDt310GcmissIndModified()) { 
        dt310GcmissInd = refreshDt310GcmissInd();
     }
   		return dt310GcmissInd;
   }

  
	/**
	*  set variable dt310GcmissInd
	*  Corresponding COBOL Variable is DT3-10-GCMISS-IND
	*  @param value
	**/
   public void setDt310GcmissInd(char[] value) {
      dt310GcmissInd = checkDt310GcmissIndConstraints(value);
      serializeDt310GcmissInd(dt310GcmissInd);
   } 

     /**
	 * 	Update Dt310GcmissInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmissInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmissInd,dt310GcmissInd.length);
   	
   }
   
   public void setDt310GcmissInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissInd,dt310GcmissInd.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmissInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmissInd with another Field
	 *	@param value
	 */
   public void setDt310GcmissInd(Field source) {
       replace(source,0,source.length(),beginDt310GcmissInd,DT_310_GCMISS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmissInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmissInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmissInd,DT_310_GCMISS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmissInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmissFeeAmt
	 *	@return dt310GcmissFeeAmt
	 */
   public char[] getDt310GcmissFeeAmt() throws CFException{
     if (isDt310GcmissFeeAmtModified()) { 
        dt310GcmissFeeAmt = refreshDt310GcmissFeeAmt();
     }
   		return dt310GcmissFeeAmt;
   }

  
	/**
	*  set variable dt310GcmissFeeAmt
	*  Corresponding COBOL Variable is DT3-10-GCMISS-FEE-AMT
	*  @param value
	**/
   public void setDt310GcmissFeeAmt(char[] value) {
      dt310GcmissFeeAmt = checkDt310GcmissFeeAmtConstraints(value);
      serializeDt310GcmissFeeAmt(dt310GcmissFeeAmt);
   } 

     /**
	 * 	Update Dt310GcmissFeeAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmissFeeAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmissFeeAmt,dt310GcmissFeeAmt.length);
   	
   }
   
   public void setDt310GcmissFeeAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeAmt,dt310GcmissFeeAmt.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmissFeeAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissFeeAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmissFeeAmt with another Field
	 *	@param value
	 */
   public void setDt310GcmissFeeAmt(Field source) {
       replace(source,0,source.length(),beginDt310GcmissFeeAmt,DT_310_GCMISS_FEE_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmissFeeAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmissFeeAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeAmt,DT_310_GCMISS_FEE_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmissFeeAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissFeeAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt310GcmissFeeInd
	 *	@return dt310GcmissFeeInd
	 */
   public char[] getDt310GcmissFeeInd() throws CFException{
     if (isDt310GcmissFeeIndModified()) { 
        dt310GcmissFeeInd = refreshDt310GcmissFeeInd();
     }
   		return dt310GcmissFeeInd;
   }

  
	/**
	*  set variable dt310GcmissFeeInd
	*  Corresponding COBOL Variable is DT3-10-GCMISS-FEE-IND
	*  @param value
	**/
   public void setDt310GcmissFeeInd(char[] value) {
      dt310GcmissFeeInd = checkDt310GcmissFeeIndConstraints(value);
      serializeDt310GcmissFeeInd(dt310GcmissFeeInd);
   } 

     /**
	 * 	Update Dt310GcmissFeeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt310GcmissFeeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt310GcmissFeeInd,dt310GcmissFeeInd.length);
   	
   }
   
   public void setDt310GcmissFeeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeInd,dt310GcmissFeeInd.length);
   	
   }
   
     /**
	 * 	Update Dt310GcmissFeeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissFeeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt310GcmissFeeInd with another Field
	 *	@param value
	 */
   public void setDt310GcmissFeeInd(Field source) {
       replace(source,0,source.length(),beginDt310GcmissFeeInd,DT_310_GCMISS_FEE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt310GcmissFeeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt310GcmissFeeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeInd,DT_310_GCMISS_FEE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Dt310GcmissFeeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt310GcmissFeeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt310GcmissFeeInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln10FieldLength() {
			return DT_PAGE_3_LN_10_LENGTH;
		}

}
  
